package za4;

/* loaded from: classes4.dex */
public class y implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f471226d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ za4.z f471227e;

    public y(za4.z zVar, java.lang.String str) {
        this.f471227e = zVar;
        this.f471226d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageDownloadFileHelper$2$3");
        za4.e0 e0Var = this.f471227e.f471231a;
        if (e0Var != null) {
            e0Var.c(this.f471226d);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageDownloadFileHelper$2$3");
    }
}
