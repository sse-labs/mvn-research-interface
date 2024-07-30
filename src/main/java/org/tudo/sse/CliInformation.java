package org.tudo.sse;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * This class holds the configuration information for the MavenCentralAnalysis class.
 * This allows for easier setup for different run configurations.
 */
public class CliInformation {
    private long skip;
    private long take;
    private long since;
    private long until;
    private Path name;
    private Path toCoordinates;
    private Path toIndexPos;
    private boolean index;
    private boolean pom;
    private boolean resolveTransitives;
    private boolean jar;
    private boolean multi;
    private int threads;

    public CliInformation() {
        skip = -1;
        take = -1;
        since = -1;
        until = -1;
        name = Paths.get("lastIndexProcessed");
        toCoordinates = null;
        toIndexPos = null;
        index = false;
        pom = false;
        jar = false;
        multi = false;
    }

    public long getSkip() {
        return skip;
    }

    public void setSkip(long skip) {
        this.skip = skip;
    }

    public long getTake() {
        return take;
    }

    public void setTake(long take) {
        this.take = take;
    }

    public long getSince() {
        return since;
    }

    public void setSince(long since) {
        this.since = since;
    }

    public long getUntil() {
        return until;
    }

    public void setUntil(long until) {
        this.until = until;
    }

    public Path getToCoordinates() {
        return toCoordinates;
    }

    public void setToCoordinates(Path toCoordinates) {
        this.toCoordinates = toCoordinates;
    }

    public Path getToIndexPos() {
        return toIndexPos;
    }

    public void setToIndexPos(Path toIndexPos) {
        this.toIndexPos = toIndexPos;
    }

    public boolean isIndex() {
        return index;
    }

    public void setIndex(boolean index) {
        this.index = index;
    }

    public boolean isPom() {
        return pom;
    }

    public void setPom(boolean pom) {
        this.pom = pom;
    }

    public boolean isJar() {
        return jar;
    }

    public void setJar(boolean jar) {
        this.jar = jar;
    }

    public Path getName() {
        return name;
    }

    public void setName(Path name) {
        this.name = name;
    }

    public boolean isMulti() {
        return multi;
    }

    public void setMulti(boolean multi) {
        this.multi = multi;
    }

    public boolean isResolveTransitives() {
        return resolveTransitives;
    }

    public void setResolveTransitives(boolean resolveTransitives) {
        this.resolveTransitives = resolveTransitives;
    }

    public int getThreads() {
        return threads;
    }

    public void setThreads(int threads) {
        this.threads = threads;
    }
}
