package com.tencent.mm.plugin.finder.webview;

/* loaded from: classes8.dex */
public final class z implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.webview.FinderWebViewHelper f136938d;

    public z(com.tencent.mm.plugin.finder.webview.FinderWebViewHelper finderWebViewHelper) {
        this.f136938d = finderWebViewHelper;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.box.webview.BoxWebView boxWebView;
        com.tencent.mm.plugin.box.webview.BoxWebView boxWebView2;
        com.tencent.mm.plugin.box.webview.BoxWebView boxWebView3;
        com.tencent.mm.plugin.finder.webview.FinderWebViewHelper finderWebViewHelper = this.f136938d;
        boxWebView = finderWebViewHelper.boxWebView;
        if (boxWebView != null) {
            boxWebView.J0(null, null);
        }
        boxWebView2 = finderWebViewHelper.boxWebView;
        if (boxWebView2 != null) {
            boxWebView2.addJavascriptInterface(finderWebViewHelper.getWebViewEnv(), "_finderWebViewEnv");
        }
        boxWebView3 = finderWebViewHelper.boxWebView;
        if (boxWebView3 != null) {
            boxWebView3.F0();
        }
        finderWebViewHelper.onInitWebViewEnd();
    }
}
