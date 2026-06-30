package xc;

/* loaded from: classes9.dex */
public class j implements java.lang.Runnable {
    public j(xc.k kVar) {
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            if (((km0.c) gm0.j1.p().a()).a() && ((h45.q) i95.n0.c(h45.q.class)).isKindaEnabled()) {
                com.tencent.kinda.gen.ITransmitKvData create = com.tencent.kinda.gen.ITransmitKvData.create();
                create.putString("foreground", "" + com.tencent.mm.app.w.INSTANCE.f53889n);
                create.putString("emulator", "1");
                com.tencent.kinda.framework.boot.KindaApp.appKinda().applicationWillTerminate(create);
            }
        } catch (java.lang.Exception | java.lang.UnsatisfiedLinkError e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.KindaAppStatusCallback", e17, "", new java.lang.Object[0]);
        }
    }
}
