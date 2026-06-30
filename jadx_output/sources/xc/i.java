package xc;

/* loaded from: classes9.dex */
public class i implements java.lang.Runnable {
    public i(xc.k kVar) {
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            if (((km0.c) gm0.j1.p().a()).a() && ((h45.q) i95.n0.c(h45.q.class)).isKindaEnabled()) {
                com.tencent.kinda.gen.ITransmitKvData create = com.tencent.kinda.gen.ITransmitKvData.create();
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("");
                sb6.append(com.tencent.mm.app.w.INSTANCE.f53889n ? 1 : 0);
                create.putString("foreground", sb6.toString());
                create.putString(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME, "lowMemory");
                com.tencent.kinda.framework.boot.KindaApp.appKinda().applicationReceiveMemoryWarning(create);
            }
        } catch (java.lang.Exception | java.lang.UnsatisfiedLinkError e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.KindaAppStatusCallback", e17, "", new java.lang.Object[0]);
        }
    }
}
