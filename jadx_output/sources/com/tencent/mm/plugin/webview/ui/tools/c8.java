package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes8.dex */
public class c8 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.WebViewUI f184075d;

    public c8(com.tencent.mm.plugin.webview.ui.tools.u7 u7Var, com.tencent.mm.plugin.webview.ui.tools.WebViewUI webViewUI) {
        this.f184075d = webViewUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.webview.ui.tools.WebViewUI webViewUI = this.f184075d;
        if (webViewUI == null || webViewUI.isFinishing()) {
            return;
        }
        webViewUI.setMMSubTitle(com.tencent.mm.R.string.f493671l75);
    }
}
