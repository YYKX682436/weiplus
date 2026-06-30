package k54;

/* loaded from: classes8.dex */
public final class m extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f304440d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(android.content.Context context) {
        super(1);
        this.f304440d = context;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.web.WebViewFactory$create$customWebChromeClientCreator$1");
        com.tencent.mm.plugin.webview.ui.tools.widget.z1 webViewWithController = (com.tencent.mm.plugin.webview.ui.tools.widget.z1) obj;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.web.WebViewFactory$create$customWebChromeClientCreator$1");
        kotlin.jvm.internal.o.g(webViewWithController, "webViewWithController");
        com.tencent.mm.plugin.webview.core.r0 r0Var = ((com.tencent.mm.plugin.webview.ui.tools.widget.o4) webViewWithController).G;
        kotlin.jvm.internal.o.d(r0Var);
        al5.n2 n2Var = new al5.n2(new k54.b(this.f304440d, r0Var, new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.f0()));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.web.WebViewFactory$create$customWebChromeClientCreator$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.web.WebViewFactory$create$customWebChromeClientCreator$1");
        return n2Var;
    }
}
