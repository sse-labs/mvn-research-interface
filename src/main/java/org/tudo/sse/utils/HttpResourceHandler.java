package org.tudo.sse.utils;

import org.apache.maven.index.reader.ResourceHandler;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.concurrent.TimeUnit;

/**
 * This class handles opening an inputStream for reading from the Maven Central Index
 */
public class HttpResourceHandler implements ResourceHandler {
    private final URI root;

    public HttpResourceHandler(URI root) {
        this.root = root;
    }

    @Override
    public Resource locate(String name) {
        return new HttpResource(name);
    }

    public class HttpResource implements Resource {
        private final String name;
        public HttpResource(String name) {
            this.name = name;
        }

        @Override
        public InputStream read() throws IOException {
            URL target = root.resolve(name).toURL();

            HttpURLConnection conn = (HttpURLConnection) target.openConnection();
            conn.setReadTimeout((int) TimeUnit.MINUTES.toMillis(20));
            conn.setRequestMethod("GET");
            conn.setRequestProperty("User-Agent", "Callgraph-Creator-Producer");

            return new BufferedInputStream(conn.getInputStream());
        }

    }

}
