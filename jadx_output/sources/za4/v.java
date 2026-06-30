package za4;

/* loaded from: classes4.dex */
public class v implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ za4.e0 f471205d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f471206e;

    public v(za4.e0 e0Var, java.lang.String str) {
        this.f471205d = e0Var;
        this.f471206e = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageDownloadFileHelper$1");
        za4.e0 e0Var = this.f471205d;
        if (e0Var != null) {
            e0Var.c(this.f471206e);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageDownloadFileHelper$1");
    }
}
