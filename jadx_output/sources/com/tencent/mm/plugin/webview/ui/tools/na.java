package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes8.dex */
public class na implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.WebViewUI f185867d;

    public na(com.tencent.mm.plugin.webview.ui.tools.WebViewUI webViewUI) {
        this.f185867d = webViewUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ui.widget.MMWebView mMWebView = this.f185867d.f183815f;
        if (mMWebView != null) {
            mMWebView.requestLayout();
        }
    }
}
