package com.tencent.mm.plugin.webview.ui.tools.widget;

/* loaded from: classes8.dex */
public class w3 extends com.tencent.mm.plugin.webview.ui.tools.widget.u3 {
    public final com.tencent.mm.plugin.webview.ui.tools.widget.x1 C;
    public com.tencent.mm.plugin.webview.ui.tools.widget.x3 D;

    public w3(com.tencent.mm.ui.widget.MMWebView mMWebView, boolean z17, com.tencent.mm.plugin.webview.ui.tools.widget.x1 x1Var, android.os.Bundle bundle) {
        super(mMWebView, z17, bundle);
        this.C = null;
        this.D = null;
        this.C = x1Var;
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.widget.u3
    public com.tencent.mm.plugin.webview.ui.tools.widget.x3 G() {
        if (this.D == null) {
            this.D = new com.tencent.mm.plugin.webview.ui.tools.widget.v3(this);
        }
        return this.D;
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.widget.u3
    public boolean H(java.lang.String str) {
        com.tencent.mm.plugin.webview.ui.tools.widget.x1 x1Var = this.C;
        if (x1Var == null || !(x1Var instanceof com.tencent.mm.plugin.webview.ui.tools.widget.y1)) {
            return false;
        }
        return ((com.tencent.mm.plugin.webview.ui.tools.widget.y1) x1Var).c(str);
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.widget.u3
    public void O(com.tencent.xweb.WebView webView, java.lang.String str) {
        com.tencent.mm.plugin.webview.ui.tools.widget.x1 x1Var = this.C;
        if (x1Var instanceof com.tencent.mm.plugin.webview.ui.tools.widget.y1) {
            ((com.tencent.mm.plugin.webview.ui.tools.widget.y1) x1Var).d((com.tencent.mm.ui.widget.MMWebView) webView, str);
        }
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.widget.u3
    public void P(com.tencent.xweb.WebView webView, java.lang.String str, android.graphics.Bitmap bitmap) {
        com.tencent.mm.plugin.webview.ui.tools.widget.x1 x1Var = this.C;
        if (x1Var instanceof com.tencent.mm.plugin.webview.ui.tools.widget.y1) {
            ((com.tencent.mm.plugin.webview.ui.tools.widget.y1) x1Var).a((com.tencent.mm.ui.widget.MMWebView) webView, str);
        }
    }
}
