package za4;

/* loaded from: classes.dex */
public final class p0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.q f471178d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f471179e;

    public p0(kotlinx.coroutines.q qVar, java.lang.String str) {
        this.f471178d = qVar;
        this.f471179e = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesDownloadResourceHelper2$downloadImg$2$1$onDownloaded$1");
        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
        this.f471178d.resumeWith(kotlin.Result.m521constructorimpl(com.tencent.mm.sdk.platformtools.x.J(this.f471179e, null)));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesDownloadResourceHelper2$downloadImg$2$1$onDownloaded$1");
    }
}
