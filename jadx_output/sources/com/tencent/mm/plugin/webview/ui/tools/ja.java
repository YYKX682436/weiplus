package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes7.dex */
public class ja implements android.view.View.OnLayoutChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.WebViewUI f184868d;

    public ja(com.tencent.mm.plugin.webview.ui.tools.WebViewUI webViewUI) {
        this.f184868d = webViewUI;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(android.view.View view, int i17, int i18, int i19, int i27, int i28, int i29, int i37, int i38) {
        com.tencent.mm.plugin.webview.ui.tools.WebViewUI webViewUI = this.f184868d;
        webViewUI.p7();
        by4.f fVar = webViewUI.H1;
        com.tencent.mm.ui.widget.MMWebView viewWV = webViewUI.f183815f;
        fVar.getClass();
        kotlin.jvm.internal.o.g(viewWV, "viewWV");
        if (com.tencent.mm.ui.b4.c(fVar.f36387a)) {
            android.view.KeyEvent.Callback webViewUI2 = viewWV.getWebViewUI();
            com.tencent.xweb.i2 i2Var = webViewUI2 instanceof com.tencent.xweb.i2 ? (com.tencent.xweb.i2) webViewUI2 : null;
            if (i2Var != null) {
                i2Var.requestXWebSafeAreaUpdate();
            }
        }
    }
}
