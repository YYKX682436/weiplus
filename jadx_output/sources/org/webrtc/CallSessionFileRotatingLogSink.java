package org.webrtc;

/* loaded from: classes7.dex */
public class CallSessionFileRotatingLogSink {
    private long nativeSink;

    public CallSessionFileRotatingLogSink(java.lang.String str, int i17, org.webrtc.Logging.Severity severity) {
        if (str == null) {
            throw new java.lang.IllegalArgumentException("dirPath may not be null.");
        }
        this.nativeSink = nativeAddSink(str, i17, severity.ordinal());
    }

    public static byte[] getLogData(java.lang.String str) {
        if (str != null) {
            return nativeGetLogData(str);
        }
        throw new java.lang.IllegalArgumentException("dirPath may not be null.");
    }

    private static native long nativeAddSink(java.lang.String str, int i17, int i18);

    private static native void nativeDeleteSink(long j17);

    private static native byte[] nativeGetLogData(java.lang.String str);

    public void dispose() {
        long j17 = this.nativeSink;
        if (j17 != 0) {
            nativeDeleteSink(j17);
            this.nativeSink = 0L;
        }
    }
}
