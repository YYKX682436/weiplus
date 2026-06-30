package com.tencent.mm.xeffect;

/* loaded from: classes14.dex */
public class WeFaceCluster {
    static {
        tq5.k.a("xlabeffect");
    }

    public static native void nFlushReport(long j17);

    public static native java.util.ArrayList<android.util.Pair<java.lang.String, java.lang.String>> nGetClusterCenterWithHistory(long j17, long j18, java.util.ArrayList<com.tencent.mm.xeffect.FaceBufferData> arrayList, java.lang.String str, boolean z17);

    public static native long[] nInit(java.lang.String[] strArr, int i17);

    public static native int nIsClusterInit(long j17);

    public static native void nRelease(long j17, long j18);

    public static native void nReleaseCluster(long j17);

    public static native void nSetupReport(long j17, boolean z17);

    public static native java.lang.String nStop();
}
