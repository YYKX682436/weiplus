package com.tencent.mm.plugin.webview.luggage;

/* loaded from: classes8.dex */
public class s0 extends com.tencent.xweb.s0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.luggage.e0 f182616a;

    public s0(com.tencent.mm.plugin.webview.luggage.e0 e0Var) {
        this.f182616a = e0Var;
    }

    @Override // com.tencent.xweb.s0
    public android.view.View a() {
        com.tencent.mars.xlog.Log.i("MicroMsg.LuggageMMWebPage", "getVideoLoadingProgressView");
        com.tencent.mm.plugin.webview.luggage.e0 e0Var = this.f182616a;
        if (e0Var.I == null) {
            e0Var.I = new android.widget.ProgressBar(e0Var.f406610d);
            e0Var.I.setIndeterminate(true);
        }
        return e0Var.I;
    }

    @Override // com.tencent.xweb.s0
    public boolean b(android.webkit.ConsoleMessage consoleMessage) {
        this.f182616a.getClass();
        return false;
    }

    @Override // com.tencent.xweb.s0
    public void h() {
        com.tencent.mars.xlog.Log.i("MicroMsg.LuggageMMWebPage", "onHideCustomView, sdk int = " + android.os.Build.VERSION.SDK_INT);
        com.tencent.mm.plugin.webview.luggage.e0 e0Var = this.f182616a;
        if (e0Var.H == null) {
            return;
        }
        try {
            e0Var.f182183q.setVisibility(0);
            android.webkit.WebChromeClient.CustomViewCallback customViewCallback = e0Var.G;
            if (customViewCallback != null) {
                customViewCallback.onCustomViewHidden();
            }
            e0Var.f182186t.setVisibility(0);
            android.widget.FrameLayout frameLayout = e0Var.H;
            if (frameLayout != null) {
                e0Var.f182184r.removeView(frameLayout);
            }
            e0Var.H.removeAllViews();
            e0Var.H = null;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.LuggageMMWebPage", "onHideCustomView error " + e17.getMessage());
        }
    }

    @Override // com.tencent.xweb.s0
    public void o(com.tencent.xweb.WebView webView, java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.LuggageMMWebPage", "onReceivedTitle, title = %s", str);
        boolean d17 = com.tencent.mm.plugin.webview.luggage.util.g.d(str);
        com.tencent.mm.plugin.webview.luggage.e0 e0Var = this.f182616a;
        if (!d17) {
            if (!(!com.tencent.mm.sdk.platformtools.t8.K0(str) && str.equalsIgnoreCase("about:blank"))) {
                e0Var.I(str, 0);
            }
        }
        e0Var.f406655i.i();
    }

    @Override // com.tencent.xweb.s0
    public void p(android.view.View view, android.webkit.WebChromeClient.CustomViewCallback customViewCallback) {
        com.tencent.mm.plugin.webview.luggage.e0 e0Var = this.f182616a;
        com.tencent.mars.xlog.Log.i("MicroMsg.LuggageMMWebPage", "onShowCustomView, sdk int = " + android.os.Build.VERSION.SDK_INT);
        try {
            if (e0Var.H != null) {
                customViewCallback.onCustomViewHidden();
                return;
            }
            e0Var.H = new android.widget.FrameLayout(e0Var.f406610d);
            e0Var.H.setBackgroundResource(com.tencent.mm.R.color.aak);
            e0Var.H.addView(view);
            e0Var.G = customViewCallback;
            e0Var.f182183q.setVisibility(8);
            e0Var.f182186t.setVisibility(8);
            e0Var.f182184r.addView(e0Var.H);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.LuggageMMWebPage", "onShowCustomView error " + e17.getMessage());
        }
    }
}
