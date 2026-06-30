package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes8.dex */
public class p8 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.WebViewUI f186753d;

    public p8(com.tencent.mm.plugin.webview.ui.tools.u7 u7Var, com.tencent.mm.plugin.webview.ui.tools.WebViewUI webViewUI) {
        this.f186753d = webViewUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ui.widget.MMWebView mMWebView;
        com.tencent.mm.plugin.webview.ui.tools.WebViewUI webViewUI = this.f186753d;
        if (webViewUI == null || webViewUI.isFinishing() || (mMWebView = webViewUI.f183815f) == null) {
            return;
        }
        fo3.s.INSTANCE.la(mMWebView, com.tencent.mm.autogen.events.ServiceClickEvent.class);
        if (webViewUI.getSharedPreferences("com.tencent.mm_webview_x5_preferences", 4).getBoolean("forceTrigger", false)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WebViewStubCallbackAIDLStub", "on service click, test");
            new com.tencent.mm.autogen.events.ServiceClickEvent().e();
        }
    }
}
