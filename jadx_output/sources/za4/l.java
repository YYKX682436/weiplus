package za4;

/* loaded from: classes4.dex */
public class l implements com.tencent.mm.plugin.appbrand.service.e6 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageChattingTask f471145a;

    public l(com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageChattingTask adLandingPageChattingTask) {
        this.f471145a = adLandingPageChattingTask;
    }

    @Override // com.tencent.mm.plugin.appbrand.service.e6
    public void a(k91.v5 v5Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onGetWeAppInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageChattingTask$1");
        if (v5Var == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AdLandingPageChattingTask", "info is null, err");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageChattingTask");
        this.f471145a.c();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageChattingTask");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onGetWeAppInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageChattingTask$1");
    }
}
