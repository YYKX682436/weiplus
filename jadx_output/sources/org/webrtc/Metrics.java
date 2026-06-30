package org.webrtc;

/* loaded from: classes.dex */
public class Metrics {
    private static final java.lang.String TAG = "Metrics";
    public final java.util.Map<java.lang.String, org.webrtc.Metrics.HistogramInfo> map = new java.util.HashMap();

    /* loaded from: classes.dex */
    public static class HistogramInfo {
        public final int bucketCount;
        public final int max;
        public final int min;
        public final java.util.Map<java.lang.Integer, java.lang.Integer> samples = new java.util.HashMap();

        public HistogramInfo(int i17, int i18, int i19) {
            this.min = i17;
            this.max = i18;
            this.bucketCount = i19;
        }

        public void addSample(int i17, int i18) {
            this.samples.put(java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        }
    }

    private void add(java.lang.String str, org.webrtc.Metrics.HistogramInfo histogramInfo) {
        this.map.put(str, histogramInfo);
    }

    public static void enable() {
        nativeEnable();
    }

    public static org.webrtc.Metrics getAndReset() {
        return nativeGetAndReset();
    }

    private static native void nativeEnable();

    private static native org.webrtc.Metrics nativeGetAndReset();
}
