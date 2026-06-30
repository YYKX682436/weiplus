package com.tencent.mm.pluginsdk.res.downloader.checkresupdate;

/* loaded from: classes12.dex */
public final class h0 extends com.tencent.mm.pluginsdk.res.downloader.model.n implements ob0.p2 {

    /* renamed from: c, reason: collision with root package name */
    public final ku5.f f189586c = new com.tencent.mm.pluginsdk.res.downloader.model.j(this, "MicroMsg.ResDownloader.CheckResUpdate.DecryptExecutor", 0, Integer.MAX_VALUE, new java.util.concurrent.SynchronousQueue());

    public h0() {
        ((com.tencent.mm.feature.performance.q) ((ob0.q2) i95.n0.c(ob0.q2.class))).getClass();
        gi.i0 i0Var = gi.i0.f272054a;
        synchronized (i0Var.a()) {
            i0Var.a().add(this);
        }
    }

    @Override // com.tencent.mm.pluginsdk.res.downloader.model.n
    public ku5.f c() {
        return this.f189586c;
    }

    @Override // com.tencent.mm.pluginsdk.res.downloader.model.n
    public com.tencent.mm.pluginsdk.res.downloader.model.m e(com.tencent.mm.pluginsdk.res.downloader.model.k kVar) {
        return new com.tencent.mm.pluginsdk.res.downloader.checkresupdate.g0((com.tencent.mm.pluginsdk.res.downloader.checkresupdate.a) kVar);
    }

    public void g(boolean z17) {
        if (com.tencent.mm.matrix.c0.b(81) && z17 && !((java.util.concurrent.ConcurrentHashMap) this.f189692b).isEmpty()) {
            com.tencent.mars.xlog.Log.w("MicroMsg.ResDownloader.CheckResUpdate.DecryptExecutor", "#onAppLowEnergy, cancel all bg tasks");
            com.tencent.mm.matrix.c0.a(81);
            b();
        }
    }
}
