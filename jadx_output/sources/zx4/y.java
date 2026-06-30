package zx4;

/* loaded from: classes8.dex */
public final class y implements com.tencent.mm.sdk.platformtools.f7 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f477209d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zx4.l0 f477210e;

    public y(java.lang.ref.WeakReference weakReference, zx4.l0 l0Var) {
        this.f477209d = weakReference;
        this.f477210e = l0Var;
    }

    @Override // com.tencent.mm.sdk.platformtools.f7
    public void z0(java.lang.String str, long j17, boolean z17) {
        nw4.n nVar;
        com.tencent.mm.ui.widget.MMWebView mMWebView;
        com.tencent.mars.xlog.Log.i("WebviewScreenShotHelper", "onScreenShot, path: " + str);
        com.tencent.mm.plugin.webview.ui.tools.WebViewUI webViewUI = (com.tencent.mm.plugin.webview.ui.tools.WebViewUI) this.f477209d.get();
        boolean z18 = false;
        if (webViewUI != null && (nVar = webViewUI.f183844p0) != null && (mMWebView = webViewUI.f183815f) != null) {
            nVar.a0(mMWebView.getUrl(), webViewUI.getIntent().getBundleExtra("ad_report_bundle"), (webViewUI.f183876z1.b().f192177d & 1048576) > 0);
        }
        if (webViewUI == null || webViewUI.J2) {
            return;
        }
        com.tencent.mm.plugin.webview.ui.tools.c6 c6Var = webViewUI.f183849q2;
        if (c6Var != null && c6Var.z(webViewUI.C7(), 456) && webViewUI.f183849q2.n(57) && !java.lang.Boolean.TRUE.equals(webViewUI.Q1.get(webViewUI.x7()))) {
            com.tencent.mm.ui.widget.MMWebView mMWebView2 = webViewUI.f183815f;
            if (mMWebView2 != null && mMWebView2.z0()) {
                z18 = true;
            }
            if (!z18 || str == null) {
                return;
            }
            this.f477210e.h(webViewUI, str);
        }
    }
}
