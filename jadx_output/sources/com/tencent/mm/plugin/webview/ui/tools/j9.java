package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes8.dex */
public class j9 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.u7 f184867d;

    public j9(com.tencent.mm.plugin.webview.ui.tools.u7 u7Var) {
        this.f184867d = u7Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.webview.ui.tools.u7 u7Var = this.f184867d;
        if (u7Var.f186929e.get() != null) {
            java.lang.ref.WeakReference weakReference = u7Var.f186929e;
            if (((com.tencent.mm.plugin.webview.ui.tools.WebViewUI) weakReference.get()).isFinishing()) {
                return;
            }
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI webViewUI = (com.tencent.mm.plugin.webview.ui.tools.WebViewUI) weakReference.get();
            webViewUI.getClass();
            com.tencent.mm.plugin.webview.ui.tools.oa oaVar = new com.tencent.mm.plugin.webview.ui.tools.oa(webViewUI);
            com.tencent.mm.plugin.webview.ui.tools.s7 s7Var = webViewUI.f183804a3;
            s7Var.f186847a = oaVar;
            s7Var.f186851e = true;
            com.tencent.mm.plugin.webview.ui.tools.LogoWebViewWrapper logoWebViewWrapper = s7Var.f186849c;
            if (logoWebViewWrapper != null) {
                logoWebViewWrapper.setVisibility(0);
                s7Var.f186849c.setMMOverScrollOffsetListener(s7Var);
                s7Var.f186849c.setFastScrollBack(true);
                com.tencent.mm.plugin.webview.ui.tools.LogoWebViewWrapper logoWebViewWrapper2 = s7Var.f186849c;
                logoWebViewWrapper2.f183614p = false;
                logoWebViewWrapper2.setReleaseTargetHeight(s7Var.f186850d);
            }
            android.widget.ImageView imageView = s7Var.f186848b;
            if (imageView != null) {
                imageView.setWillNotDraw(true);
                s7Var.f186848b.setImageResource(com.tencent.mm.R.drawable.ci6);
                s7Var.f186848b.setVisibility(0);
                s7Var.f186848b.setAlpha(0.0f);
                s7Var.f186848b.setWillNotDraw(false);
                s7Var.f186848b.invalidate();
            }
            s7Var.b();
        }
    }
}
