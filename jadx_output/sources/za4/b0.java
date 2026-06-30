package za4;

/* loaded from: classes4.dex */
public class b0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ za4.e0 f471064d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f471065e;

    public b0(za4.e0 e0Var, java.lang.String str) {
        this.f471064d = e0Var;
        this.f471065e = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageDownloadFileHelper$4");
        this.f471064d.c(this.f471065e);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageDownloadFileHelper$4");
    }
}
