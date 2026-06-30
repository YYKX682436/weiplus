package org.webrtc;

/* loaded from: classes16.dex */
public class PerformanceStatistics {
    public long averageRenderTime;
    public long averageSwapBufferTime;
    public int bigJank;
    public long duration;
    public int framesDropped;
    public int framesReceived;
    public int framesRendered;
    public int jank;
    public int performanceHash = hashCode();
    public double renderFps;
    public long renderSwapBufferTimeNs;
    public long renderTimeNs;
    public long statisticsStartTimeNs;
    public double stutter;

    public PerformanceStatistics(org.webrtc.PerformanceStatistics performanceStatistics) {
        this.framesReceived = performanceStatistics.framesReceived;
        this.framesDropped = performanceStatistics.framesDropped;
        this.framesRendered = performanceStatistics.framesRendered;
        this.statisticsStartTimeNs = performanceStatistics.statisticsStartTimeNs;
        this.renderTimeNs = performanceStatistics.renderTimeNs;
        this.renderSwapBufferTimeNs = performanceStatistics.renderSwapBufferTimeNs;
        this.duration = performanceStatistics.duration;
        this.renderFps = performanceStatistics.renderFps;
        this.averageRenderTime = performanceStatistics.averageRenderTime;
        this.averageSwapBufferTime = performanceStatistics.averageSwapBufferTime;
        this.jank = performanceStatistics.jank;
        this.bigJank = performanceStatistics.bigJank;
        this.stutter = performanceStatistics.stutter;
    }

    public void resetStatistics(long j17) {
        this.statisticsStartTimeNs = j17;
        this.framesReceived = 0;
        this.framesDropped = 0;
        this.framesRendered = 0;
        this.renderTimeNs = 0L;
        this.renderSwapBufferTimeNs = 0L;
        this.duration = 0L;
        this.renderFps = 0.0d;
        this.averageRenderTime = 0L;
        this.averageSwapBufferTime = 0L;
        this.jank = 0;
        this.bigJank = 0;
        this.stutter = 0.0d;
    }

    public java.lang.String toString() {
        return "PerformanceStatistics{framesReceived=" + this.framesReceived + ", framesDropped=" + this.framesDropped + ", framesRendered=" + this.framesRendered + ", statisticsStartTimeNs=" + this.statisticsStartTimeNs + ", renderTimeNs=" + this.renderTimeNs + ", renderSwapBufferTimeNs=" + this.renderSwapBufferTimeNs + ", duration=" + this.duration + ", renderFps=" + this.renderFps + ", averageRenderTime=" + this.averageRenderTime + ", averageSwapBufferTime=" + this.averageSwapBufferTime + ", jank=" + this.jank + ", bigJank=" + this.bigJank + ", stutter=" + this.stutter + ", performanceHash=" + this.performanceHash + '}';
    }

    public PerformanceStatistics() {
    }
}
