package com.tencent.mm.plugin.webview.ui.tools.widget;

/* loaded from: classes8.dex */
public class q2 extends com.tencent.mm.plugin.webview.ui.tools.widget.p2 {

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.webview.ui.tools.widget.u1 f187509e;

    public q2(com.tencent.mm.ui.widget.MMWebView mMWebView, com.tencent.mm.plugin.webview.ui.tools.widget.u1 u1Var) {
        super((com.tencent.mm.plugin.webview.ui.tools.widget.MMWebViewWithJsApi) mMWebView);
        this.f187509e = u1Var;
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.widget.p2, com.tencent.xweb.s0
    public void o(com.tencent.xweb.WebView webView, java.lang.String str) {
        com.tencent.mm.plugin.webview.ui.tools.widget.u1 u1Var = this.f187509e;
        if (u1Var != null) {
            g01.f fVar = (g01.f) u1Var;
            fVar.getClass();
            fVar.f267412a.runOnUiThread(new g01.e(fVar, str));
        }
    }
}
