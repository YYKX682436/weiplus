package vc;

/* loaded from: classes9.dex */
public class x implements java.lang.Runnable {
    public x(vc.z zVar) {
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            com.tencent.mars.xlog.Log.i("MicroMsg.WxKindaApiFeatureService", "kinda onAccountInitialized");
            if (((km0.c) gm0.j1.p().a()).a() && ((h45.q) i95.n0.c(h45.q.class)).isKindaEnabled()) {
                com.tencent.mars.xlog.Log.i("MicroMsg.WxKindaApiFeatureService", "kinda onAccountInitialized, restart begin");
                com.tencent.kinda.framework.boot.KindaApp.appKinda().applicationRestart();
                com.tencent.mars.xlog.Log.i("MicroMsg.WxKindaApiFeatureService", "kinda onAccountInitialized, restart done");
            }
        } catch (java.lang.Exception | java.lang.UnsatisfiedLinkError e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WxKindaApiFeatureService", e17, "", new java.lang.Object[0]);
        }
    }
}
