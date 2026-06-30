package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes8.dex */
public class gc implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.WebViewUI f184777d;

    public gc(com.tencent.mm.plugin.webview.ui.tools.WebViewUI webViewUI) {
        this.f184777d = webViewUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.webview.ui.tools.WebViewUI webViewUI = this.f184777d;
        if (webViewUI.getSwipeBackLayout() == null) {
            return null;
        }
        webViewUI.getSwipeBackLayout().setFloatView(webViewUI.E2.f184226b);
        return null;
    }
}
