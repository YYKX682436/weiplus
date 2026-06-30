package org.webrtc;

/* loaded from: classes.dex */
public class RTCStatsReport {
    private final java.util.Map<java.lang.String, org.webrtc.RTCStats> stats;
    private final long timestampUs;

    public RTCStatsReport(long j17, java.util.Map<java.lang.String, org.webrtc.RTCStats> map) {
        this.timestampUs = j17;
        this.stats = map;
    }

    private static org.webrtc.RTCStatsReport create(long j17, java.util.Map map) {
        return new org.webrtc.RTCStatsReport(j17, map);
    }

    public java.util.Map<java.lang.String, org.webrtc.RTCStats> getStatsMap() {
        return this.stats;
    }

    public double getTimestampUs() {
        return this.timestampUs;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("{ timestampUs: ");
        sb6.append(this.timestampUs);
        sb6.append(", stats: [\n");
        boolean z17 = true;
        for (org.webrtc.RTCStats rTCStats : this.stats.values()) {
            if (!z17) {
                sb6.append(",\n");
            }
            sb6.append(rTCStats);
            z17 = false;
        }
        sb6.append(" ] }");
        return sb6.toString();
    }
}
