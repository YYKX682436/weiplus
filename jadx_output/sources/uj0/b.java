package uj0;

/* loaded from: classes13.dex */
public class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.graphics.ui.WxBaseImageView f428183d;

    public b(com.tencent.mm.graphics.ui.WxBaseImageView wxBaseImageView) {
        this.f428183d = wxBaseImageView;
    }

    @Override // java.lang.Runnable
    public void run() {
        sj0.c cVar;
        sj0.b bVar;
        synchronized (this) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WxBaseImageView", "reportPerformanceInfo threadId: %d", java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
            sj0.g gVar = sj0.g.INSTANCE;
            synchronized (gVar.f408361h) {
                java.util.HashMap hashMap = gVar.f408358e;
                if (hashMap == null || (bVar = (sj0.b) hashMap.get(2)) == null || !(bVar instanceof sj0.c)) {
                    cVar = null;
                } else {
                    ((sj0.c) bVar).a();
                    cVar = (sj0.c) bVar;
                }
            }
            tj0.b.INSTANCE.b(null, cVar);
            com.tencent.mm.graphics.ui.WxBaseImageView wxBaseImageView = this.f428183d;
            wxBaseImageView.f68231w = true;
            wxBaseImageView.getClass();
            try {
                com.tencent.mm.sdk.platformtools.n3 n3Var = wxBaseImageView.f68233y;
                if (n3Var != null) {
                    n3Var.quit();
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WxBaseImageView", e17, "quitReportThread exception", new java.lang.Object[0]);
            }
        }
    }
}
