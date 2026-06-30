package com.tencent.mm.plugin.webview.ui.tools.widget;

/* loaded from: classes8.dex */
public class MMWebViewWithJsApi extends com.tencent.mm.ui.widget.MMWebView {
    public com.tencent.mm.plugin.webview.ui.tools.widget.u3 G;
    public boolean H;

    public MMWebViewWithJsApi(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // com.tencent.mm.ui.widget.MMWebView
    public void E0() {
        com.tencent.mm.plugin.webview.ui.tools.widget.u3 u3Var = this.G;
        if (u3Var != null) {
            u3Var.D();
        }
    }

    public nw4.n getJsapi() {
        com.tencent.mm.plugin.webview.ui.tools.widget.u3 u3Var = this.G;
        if (u3Var != null) {
            return u3Var.f187554g;
        }
        return null;
    }

    @Override // com.tencent.xweb.WebView, tx5.f
    public void loadData(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        com.tencent.mm.plugin.webview.ui.tools.widget.u3 u3Var = this.G;
        if (u3Var != null) {
            u3Var.f187568u = true;
            u3Var.Z("");
        }
        super.loadData(str, str2, str3);
    }

    @Override // com.tencent.xweb.WebView, tx5.f
    public void loadDataWithBaseURL(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        com.tencent.mm.plugin.webview.ui.tools.widget.u3 u3Var = this.G;
        if (u3Var != null) {
            u3Var.f187568u = true;
            u3Var.Z("");
        }
        super.loadDataWithBaseURL(str, str2, str3, str4, str5);
    }

    @Override // com.tencent.mm.ui.widget.MMWebView, com.tencent.xweb.WebView, tx5.f, pf.b
    public void loadUrl(java.lang.String str) {
        com.tencent.mm.plugin.webview.ui.tools.widget.u3 u3Var = this.G;
        if (u3Var == null) {
            super.loadUrl(str);
            return;
        }
        u3Var.f187568u = false;
        if (u3Var.Z(str)) {
            return;
        }
        super.loadUrl(str);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        com.tencent.mm.plugin.webview.ui.tools.widget.u3 u3Var = this.G;
        if (u3Var == null || !this.H) {
            return;
        }
        u3Var.D();
    }

    @Override // com.tencent.mm.ui.widget.MMWebView
    public void setCleanOnDetached(boolean z17) {
        this.H = z17;
    }

    @Override // com.tencent.xweb.WebView, tx5.f
    public void setWebViewClient(com.tencent.xweb.h1 h1Var) {
        super.setWebViewClient(h1Var);
        if (h1Var instanceof com.tencent.mm.plugin.webview.ui.tools.widget.u3) {
            this.G = (com.tencent.mm.plugin.webview.ui.tools.widget.u3) h1Var;
        } else {
            this.G = null;
        }
    }

    public MMWebViewWithJsApi(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.H = true;
        try {
            removeJavascriptInterface("searchBoxJavaBridge_");
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MMWebView", "removeConfigJsInterface, ex = %s", e17.getMessage());
        }
        getSettings().E(true);
        getSettings().J(0);
        setWebChromeClient(new com.tencent.mm.plugin.webview.ui.tools.widget.p2(this));
        setWebViewClient(new com.tencent.mm.plugin.webview.ui.tools.widget.u3(this, false, null));
        java.lang.String g17 = getSettings().g();
        com.tencent.mm.sdk.platformtools.i6 i6Var = com.tencent.mm.pluginsdk.ui.tools.e9.f191608a;
        if (g17 != null ? g17.toLowerCase().contains("MicroMessenger/".toLowerCase()) : false) {
            return;
        }
        getSettings().Q(com.tencent.mm.pluginsdk.ui.tools.e9.b(getContext(), g17));
    }
}
