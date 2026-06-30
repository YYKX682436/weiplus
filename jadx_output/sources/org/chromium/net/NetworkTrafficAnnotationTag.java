package org.chromium.net;

/* loaded from: classes.dex */
public class NetworkTrafficAnnotationTag {
    private final int mHashCode;
    public static final org.chromium.net.NetworkTrafficAnnotationTag NO_TRAFFIC_ANNOTATION_YET = createComplete("undefined", "Nothing here yet.");
    public static final org.chromium.net.NetworkTrafficAnnotationTag MISSING_TRAFFIC_ANNOTATION = createComplete("undefined", "Function called without traffic annotation.");
    public static final org.chromium.net.NetworkTrafficAnnotationTag TRAFFIC_ANNOTATION_FOR_TESTS = createComplete("test", "Traffic annotation for unit, browser and other tests");

    private NetworkTrafficAnnotationTag(java.lang.String str) {
        this.mHashCode = iterativeHash(str);
    }

    public static org.chromium.net.NetworkTrafficAnnotationTag createComplete(java.lang.String str, java.lang.String str2) {
        return new org.chromium.net.NetworkTrafficAnnotationTag(str);
    }

    public static int iterativeHash(java.lang.String str) {
        long j17 = 0;
        for (int i17 = 0; i17 < str.getBytes(java.nio.charset.StandardCharsets.UTF_8).length; i17++) {
            j17 = ((j17 * 31) + r7[i17]) % 138003713;
        }
        return (int) j17;
    }

    public int getHashCode() {
        return this.mHashCode;
    }
}
