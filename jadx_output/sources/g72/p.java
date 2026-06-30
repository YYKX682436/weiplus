package g72;

/* loaded from: classes8.dex */
public class p implements java.lang.Runnable {
    public p(com.tencent.mm.plugin.facedetect.ui.FaceDetectUI faceDetectUI) {
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        java.lang.Runtime.getRuntime().gc();
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceDetectUI", "hy: gc uses: %d ms", java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime));
    }
}
