package za4;

/* loaded from: classes4.dex */
public class b implements com.tencent.mm.plugin.downloader.model.g1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ za4.k f471063d;

    public b(za4.k kVar) {
        this.f471063d = kVar;
    }

    @Override // com.tencent.mm.plugin.downloader.model.g1
    public void b(long j17, int i17, boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onTaskFailed", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr$1");
        com.tencent.mars.xlog.Log.i("MicroMsg.AdDownloadApkMgr", "onTaskFailed, id=" + j17 + ", errCode=" + i17);
        za4.k kVar = this.f471063d;
        if (za4.k.b(kVar) != null) {
            za4.k.b(kVar).e(j17);
        }
        a02.g gVar = (a02.g) ((com.tencent.mm.plugin.downloader.api.g) i95.n0.c(com.tencent.mm.plugin.downloader.api.g.class));
        gVar.requireAccountInitialized();
        h02.a D0 = gVar.f380d.D0(j17);
        this.f471063d.r(D0, 4001006, j17, null);
        za4.k.c(kVar, D0, 8, j17);
        za4.i h17 = kVar.h(j17);
        if (h17 != null && h17.f471120p == 2) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1958, 31);
        }
        ca4.e0.a("ad_app_download_failed", z17 ? "1" : "0", i17, (int) j17, "");
        if (D0 != null) {
            i64.t tVar = i64.t.f289316d;
            java.lang.String str = D0.field_rawAppId;
            tVar.a(str, new i64.r(str, 4, 0));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onTaskFailed", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr$1");
    }

    @Override // com.tencent.mm.plugin.downloader.model.g1
    public void c(long j17, java.lang.String str, boolean z17) {
        int i17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onTaskFinished", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr$1");
        com.tencent.mars.xlog.Log.i("MicroMsg.AdDownloadApkMgr", "onTaskFinished, reset MSG_CHECK_INSTALL, id=" + j17);
        za4.k kVar = this.f471063d;
        if (za4.k.b(kVar) != null) {
            za4.k.b(kVar).b(j17);
            za4.k.d(kVar);
        }
        a02.g gVar = (a02.g) ((com.tencent.mm.plugin.downloader.api.g) i95.n0.c(com.tencent.mm.plugin.downloader.api.g.class));
        gVar.requireAccountInitialized();
        h02.a D0 = gVar.f380d.D0(j17);
        this.f471063d.r(D0, 4001009, j17, null);
        za4.k.c(kVar, D0, 3, j17);
        if (D0 != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AdDownloadApkMgr", "onTaskFinished, autoDownload is " + D0.field_autoDownload + ", appId is " + D0.field_rawAppId + ", op is 4, id is " + j17);
            if (D0.field_autoInstall) {
                i17 = 1958;
                this.f471063d.r(D0, 4001010, j17, new za4.g(2));
                za4.k.c(kVar, D0, 4, j17);
            } else {
                i17 = 1958;
            }
        } else {
            i17 = 1958;
            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1958, 77);
            ca4.e0.a("ad_app_download_exp", "", 1, 4, "id=" + j17);
            com.tencent.mars.xlog.Log.e("MicroMsg.AdDownloadApkMgr", "onTaskFinished, info is null, op is 4, id is " + j17);
        }
        za4.i h17 = kVar.h(j17);
        if (h17 != null && h17.f471120p == 2) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(i17, 30);
        }
        if (D0 != null) {
            i64.t tVar = i64.t.f289316d;
            java.lang.String str2 = D0.field_rawAppId;
            tVar.a(str2, new i64.r(str2, 3, 0));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onTaskFinished", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr$1");
    }

    @Override // com.tencent.mm.plugin.downloader.model.g1
    public void f(long j17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onTaskMd5Checking", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr$1");
        com.tencent.mars.xlog.Log.i("MicroMsg.AdDownloadApkMgr", "onTaskMd5Checking, remove MSG_CHECK_INSTALL, id=" + j17);
        za4.k.d(this.f471063d);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onTaskMd5Checking", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr$1");
    }

    @Override // com.tencent.mm.plugin.downloader.model.g1
    public void h(long j17, java.lang.String str, long j18, long j19) {
        int i17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onTaskProgressChanged", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr$1");
        za4.k kVar = this.f471063d;
        if (za4.k.b(kVar) != null) {
            a02.g gVar = (a02.g) ((com.tencent.mm.plugin.downloader.api.g) i95.n0.c(com.tencent.mm.plugin.downloader.api.g.class));
            gVar.requireAccountInitialized();
            h02.a D0 = gVar.f380d.D0(j17);
            if (D0 != null) {
                long j27 = D0.field_downloadedSize;
                if (j27 >= 0) {
                    long j28 = D0.field_totalSize;
                    if (j28 > 0) {
                        i17 = (int) ((j27 * 100) / j28);
                        za4.k.b(kVar).c(j17, i17);
                        za4.k.d(kVar);
                        i64.t tVar = i64.t.f289316d;
                        java.lang.String str2 = D0.field_rawAppId;
                        tVar.a(str2, new i64.r(str2, 1, i17));
                    }
                }
                i17 = 0;
                i64.t tVar2 = i64.t.f289316d;
                java.lang.String str22 = D0.field_rawAppId;
                tVar2.a(str22, new i64.r(str22, 1, i17));
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onTaskProgressChanged", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr$1");
    }

    @Override // com.tencent.mm.plugin.downloader.model.g1
    public void i(long j17, java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onTaskResumed", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr$1");
        com.tencent.mars.xlog.Log.i("MicroMsg.AdDownloadApkMgr", "onTaskResumed, reset MSG_CHECK_INSTALL, id=" + j17);
        za4.k kVar = this.f471063d;
        if (za4.k.b(kVar) != null) {
            za4.k.b(kVar).d(j17);
        }
        a02.g gVar = (a02.g) ((com.tencent.mm.plugin.downloader.api.g) i95.n0.c(com.tencent.mm.plugin.downloader.api.g.class));
        gVar.requireAccountInitialized();
        h02.a D0 = gVar.f380d.D0(j17);
        if (D0 != null) {
            i64.t tVar = i64.t.f289316d;
            java.lang.String str2 = D0.field_rawAppId;
            tVar.a(str2, new i64.r(str2, 1, 0));
        }
        this.f471063d.r(D0, 4001005, j17, null);
        za4.k.c(kVar, D0, 7, j17);
        za4.k.d(kVar);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onTaskResumed", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr$1");
    }

    @Override // com.tencent.mm.plugin.downloader.model.g1
    public void k(long j17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onTaskPaused", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr$1");
        com.tencent.mars.xlog.Log.i("MicroMsg.AdDownloadApkMgr", "onTaskPaused, remove MSG_CHECK_INSTALL, id=" + j17);
        za4.k kVar = this.f471063d;
        if (za4.k.b(kVar) != null) {
            za4.k.b(kVar).f(j17);
        }
        a02.g gVar = (a02.g) ((com.tencent.mm.plugin.downloader.api.g) i95.n0.c(com.tencent.mm.plugin.downloader.api.g.class));
        gVar.requireAccountInitialized();
        h02.a D0 = gVar.f380d.D0(j17);
        this.f471063d.r(D0, 4001004, j17, null);
        za4.k.c(kVar, D0, 6, j17);
        if (D0 != null) {
            i64.t tVar = i64.t.f289316d;
            java.lang.String str = D0.field_rawAppId;
            tVar.a(str, new i64.r(str, 2, 0));
        }
        za4.k.d(kVar);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onTaskPaused", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr$1");
    }

    @Override // com.tencent.mm.plugin.downloader.model.g1
    public void l(long j17, java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onTaskStarted", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr$1");
        za4.k kVar = this.f471063d;
        if (za4.k.b(kVar) != null) {
            za4.k.b(kVar).n(j17);
        }
        a02.g gVar = (a02.g) ((com.tencent.mm.plugin.downloader.api.g) i95.n0.c(com.tencent.mm.plugin.downloader.api.g.class));
        gVar.requireAccountInitialized();
        h02.a D0 = gVar.f380d.D0(j17);
        this.f471063d.r(D0, 4001001, j17, null);
        za4.k.c(kVar, D0, 1, j17);
        com.tencent.mars.xlog.Log.i("MicroMsg.AdDownloadApkMgr", "onTaskStarted, id=" + j17);
        if (D0 != null) {
            i64.t tVar = i64.t.f289316d;
            java.lang.String str2 = D0.field_rawAppId;
            tVar.a(str2, new i64.r(str2, 1, 0));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onTaskStarted", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr$1");
    }

    @Override // com.tencent.mm.plugin.downloader.model.g1
    public void m(long j17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onTaskRemoved", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr$1");
        com.tencent.mars.xlog.Log.i("MicroMsg.AdDownloadApkMgr", "onTaskRemoved, id=" + j17);
        za4.k kVar = this.f471063d;
        if (za4.k.b(kVar) != null) {
            za4.k.b(kVar).a(j17);
        }
        a02.g gVar = (a02.g) ((com.tencent.mm.plugin.downloader.api.g) i95.n0.c(com.tencent.mm.plugin.downloader.api.g.class));
        gVar.requireAccountInitialized();
        h02.a D0 = gVar.f380d.D0(j17);
        za4.k.c(kVar, D0, 2, j17);
        if (D0 != null) {
            i64.t tVar = i64.t.f289316d;
            java.lang.String str = D0.field_rawAppId;
            tVar.a(str, new i64.r(str, 0, 0));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onTaskRemoved", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr$1");
    }
}
