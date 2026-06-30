package fe3;

/* loaded from: classes7.dex */
public class g implements com.tencent.mm.plugin.downloader.model.g1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fe3.i f261546d;

    public g(fe3.i iVar) {
        this.f261546d = iVar;
    }

    @Override // com.tencent.mm.plugin.downloader.model.g1
    public void b(long j17, int i17, boolean z17) {
        jc3.m0 m0Var;
        fe3.i iVar = this.f261546d;
        if (iVar.f261552d.contains(java.lang.Long.valueOf(j17))) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MagicPkgDownloadPkg", "down fail, id:%d,errCode:%d", java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(i17));
            fe3.h hVar = (fe3.h) ((java.util.concurrent.ConcurrentHashMap) iVar.f261553e).get(java.lang.Long.valueOf(j17));
            if (hVar != null && (m0Var = hVar.f261548b) != null) {
                m0Var.J("download fail");
                com.tencent.mm.plugin.magicbrush.api.WxaMagicPkgInfo wxaMagicPkgInfo = hVar.f261549c;
                java.lang.String str = wxaMagicPkgInfo != null ? wxaMagicPkgInfo.f147858d : null;
                com.tencent.mm.plugin.magicbrush.report.IMagicBrushMonitor$MagicPkgScene scene = com.tencent.mm.plugin.magicbrush.report.IMagicBrushMonitor$MagicPkgScene.Download;
                kotlin.jvm.internal.o.g(scene, "scene");
                ((je3.i) i95.n0.c(je3.i.class)).Rg(str, wxaMagicPkgInfo != null ? wxaMagicPkgInfo.f147865n : null, wxaMagicPkgInfo != null ? wxaMagicPkgInfo.f147866o : null, wxaMagicPkgInfo != null ? wxaMagicPkgInfo.f147860f : null, 0, scene, 2, 10000);
            }
            iVar.f261552d.remove(java.lang.Long.valueOf(j17));
            ((java.util.concurrent.ConcurrentHashMap) iVar.f261553e).remove(java.lang.Long.valueOf(j17));
        }
    }

    @Override // com.tencent.mm.plugin.downloader.model.g1
    public void c(long j17, java.lang.String str, boolean z17) {
        if (this.f261546d.f261552d.contains(java.lang.Long.valueOf(j17))) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MagicPkgDownloadPkg", "onTaskFinished id:%s savedFilePath:%s", java.lang.Long.valueOf(j17), str);
            fe3.h hVar = (fe3.h) ((java.util.concurrent.ConcurrentHashMap) this.f261546d.f261553e).get(java.lang.Long.valueOf(j17));
            ((ku5.t0) ku5.t0.f312615d).h(new fe3.f(this, hVar, j17, str), "MagicPkgDownloadPkg");
            this.f261546d.f261552d.remove(java.lang.Long.valueOf(j17));
        }
    }

    @Override // com.tencent.mm.plugin.downloader.model.g1
    public void f(long j17) {
    }

    @Override // com.tencent.mm.plugin.downloader.model.g1
    public void h(long j17, java.lang.String str, long j18, long j19) {
    }

    @Override // com.tencent.mm.plugin.downloader.model.g1
    public void i(long j17, java.lang.String str) {
    }

    @Override // com.tencent.mm.plugin.downloader.model.g1
    public void k(long j17) {
    }

    @Override // com.tencent.mm.plugin.downloader.model.g1
    public void l(long j17, java.lang.String str) {
        if (this.f261546d.f261552d.contains(java.lang.Long.valueOf(j17))) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MagicPkgDownloadPkg", "onTaskStarted id:%s savedFilePath:%s", java.lang.Long.valueOf(j17), str);
        }
    }

    @Override // com.tencent.mm.plugin.downloader.model.g1
    public void m(long j17) {
        fe3.i iVar = this.f261546d;
        iVar.f261552d.remove(java.lang.Long.valueOf(j17));
        ((java.util.concurrent.ConcurrentHashMap) iVar.f261553e).remove(java.lang.Long.valueOf(j17));
    }
}
