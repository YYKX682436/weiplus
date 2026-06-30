package x73;

/* loaded from: classes.dex */
public class d implements com.tencent.mm.plugin.downloader.model.g1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.hp.mmdiff.MMDiffInstallApkService f452442d;

    public d(com.tencent.mm.plugin.hp.mmdiff.MMDiffInstallApkService mMDiffInstallApkService) {
        this.f452442d = mMDiffInstallApkService;
    }

    @Override // com.tencent.mm.plugin.downloader.model.g1
    public void b(long j17, int i17, boolean z17) {
        com.tencent.mars.xlog.Log.i("Tinker.MMDiffInstallApkService.HdiffApk", "onTaskFailed id=%d, errCode=%d, hasChangeUrl=%b", java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(z17));
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        com.tencent.mm.plugin.hp.mmdiff.MMDiffInstallApkService mMDiffInstallApkService = this.f452442d;
        dp.a.makeText(context, mMDiffInstallApkService.getString(com.tencent.mm.R.string.ceh), 1).show();
        mMDiffInstallApkService.stopSelf();
    }

    @Override // com.tencent.mm.plugin.downloader.model.g1
    public void c(long j17, java.lang.String str, boolean z17) {
        com.tencent.mars.xlog.Log.i("Tinker.MMDiffInstallApkService.HdiffApk", "onTaskFinished id=%d, savedFilePath=%s, hasChangeUrl=%b", java.lang.Long.valueOf(j17), str, java.lang.Boolean.valueOf(z17));
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        com.tencent.mm.plugin.hp.mmdiff.MMDiffInstallApkService mMDiffInstallApkService = this.f452442d;
        dp.a.makeText(context, mMDiffInstallApkService.getString(com.tencent.mm.R.string.cej), 1).show();
        mMDiffInstallApkService.stopSelf();
    }

    @Override // com.tencent.mm.plugin.downloader.model.g1
    public void f(long j17) {
    }

    @Override // com.tencent.mm.plugin.downloader.model.g1
    public void h(long j17, java.lang.String str, long j18, long j19) {
    }

    @Override // com.tencent.mm.plugin.downloader.model.g1
    public void i(long j17, java.lang.String str) {
        com.tencent.mars.xlog.Log.i("Tinker.MMDiffInstallApkService.HdiffApk", "onTaskResumed id=%d, savedFilePath=%s", java.lang.Long.valueOf(j17), str);
    }

    @Override // com.tencent.mm.plugin.downloader.model.g1
    public void k(long j17) {
        com.tencent.mars.xlog.Log.i("Tinker.MMDiffInstallApkService.HdiffApk", "onTaskPaused id=%d", java.lang.Long.valueOf(j17));
    }

    @Override // com.tencent.mm.plugin.downloader.model.g1
    public void l(long j17, java.lang.String str) {
        com.tencent.mars.xlog.Log.i("Tinker.MMDiffInstallApkService.HdiffApk", "onTaskStarted id=%d, savedFilePath=%s", java.lang.Long.valueOf(j17), str);
    }

    @Override // com.tencent.mm.plugin.downloader.model.g1
    public void m(long j17) {
        com.tencent.mars.xlog.Log.i("Tinker.MMDiffInstallApkService.HdiffApk", "onTaskRemoved id=%d", java.lang.Long.valueOf(j17));
        this.f452442d.stopSelf();
    }
}
