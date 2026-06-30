package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes14.dex */
public class w4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.WebViewKeyboardLinearLayout f187009d;

    public w4(com.tencent.mm.plugin.webview.ui.tools.WebViewKeyboardLinearLayout webViewKeyboardLinearLayout) {
        this.f187009d = webViewKeyboardLinearLayout;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.webview.ui.tools.WebViewKeyboardLinearLayout webViewKeyboardLinearLayout = this.f187009d;
        if (webViewKeyboardLinearLayout.getRootView() == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WebViewKeyboardLinearLayout", "initKbListenerByApi30 rootView null");
        } else {
            webViewKeyboardLinearLayout.getRootView().setOnApplyWindowInsetsListener(new com.tencent.mm.plugin.webview.ui.tools.v4(this));
        }
    }
}
