package com.tencent.mm.plugin.webview.modeltools;

/* loaded from: classes8.dex */
public class c1 implements android.webkit.ValueCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.MMWebView f183247a;

    public c1(com.tencent.mm.ui.widget.MMWebView mMWebView) {
        this.f183247a = mMWebView;
    }

    @Override // android.webkit.ValueCallback
    public void onReceiveValue(java.lang.Object obj) {
        java.lang.String str = (java.lang.String) obj;
        com.tencent.mars.xlog.Log.i("MicroMsg.WebViewReportOnLeaveHelper", "reportOnLeave reportOnLeaveForMp onReceiveValue");
        ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.plugin.webview.modeltools.a1(this));
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.WebViewReportOnLeaveHelper", "reportOnLeave onReceiveValue but null");
            return;
        }
        ((ku5.t0) ku5.t0.f312615d).h(new com.tencent.mm.plugin.webview.modeltools.b1(this, str), "WebViewReportOnLeaveThread");
    }
}
