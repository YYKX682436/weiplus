package k54;

/* loaded from: classes4.dex */
public final class e implements x54.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f304418a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.f0 f304419b;

    public e(android.content.Context context, com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.f0 f0Var) {
        this.f304418a = context;
        this.f304419b = f0Var;
    }

    @Override // x54.a
    public final void onActivityResult(int i17, int i18, android.content.Intent intent) {
        java.lang.Object obj = this.f304418a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.web.WebViewChromeClient$onShowFileChooser$1");
        try {
            ((x54.b) obj).K3(2003);
            this.f304419b.b((android.app.Activity) obj, i17, i18, intent);
        } catch (java.lang.Throwable th6) {
            ot5.g.a("SnsAd.WebViewChromeClient", "file chooser onActivityResult exception: " + th6.getMessage());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.web.WebViewChromeClient$onShowFileChooser$1");
    }
}
