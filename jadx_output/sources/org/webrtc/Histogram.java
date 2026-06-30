package org.webrtc;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes14.dex */
public class Histogram {
    private final long handle;

    public Histogram(long j17) {
        this.handle = j17;
    }

    public static org.webrtc.Histogram createCounts(java.lang.String str, int i17, int i18, int i19) {
        return new org.webrtc.Histogram(nativeCreateCounts(str, i17, i18, i19));
    }

    public static org.webrtc.Histogram createEnumeration(java.lang.String str, int i17) {
        return new org.webrtc.Histogram(nativeCreateEnumeration(str, i17));
    }

    private static native void nativeAddSample(long j17, int i17);

    private static native long nativeCreateCounts(java.lang.String str, int i17, int i18, int i19);

    private static native long nativeCreateEnumeration(java.lang.String str, int i17);

    public void addSample(int i17) {
        nativeAddSample(this.handle, i17);
    }
}
