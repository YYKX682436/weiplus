package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes8.dex */
public class gb implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.WebViewUI f184776d;

    public gb(com.tencent.mm.plugin.webview.ui.tools.WebViewUI webViewUI) {
        this.f184776d = webViewUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.webview.ui.tools.WebViewUI webViewUI = this.f184776d;
        com.tencent.mm.ui.widget.MMWebView mMWebView = webViewUI.f183815f;
        if (mMWebView != null) {
            com.tencent.xweb.h1 webViewClient = mMWebView.getWebViewClient();
            com.tencent.mm.ui.widget.MMWebView mMWebView2 = webViewUI.f183815f;
            webViewClient.n(mMWebView2, mMWebView2.getUrl());
        }
    }
}
