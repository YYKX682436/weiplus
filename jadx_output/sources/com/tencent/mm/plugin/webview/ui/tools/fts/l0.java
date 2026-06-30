package com.tencent.mm.plugin.webview.ui.tools.fts;

/* loaded from: classes8.dex */
public class l0 implements com.tencent.mm.sdk.platformtools.f7 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.fts.BaseSearchWebViewUI f184501d;

    public l0(com.tencent.mm.plugin.webview.ui.tools.fts.BaseSearchWebViewUI baseSearchWebViewUI) {
        this.f184501d = baseSearchWebViewUI;
    }

    @Override // com.tencent.mm.sdk.platformtools.f7
    public void z0(java.lang.String str, long j17, boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.BaseSearchWebViewUI", "onScreenShot， path = " + str + "， dateAdded = " + j17);
        com.tencent.mm.plugin.webview.ui.tools.fts.BaseSearchWebViewUI baseSearchWebViewUI = this.f184501d;
        qx4.d0 d0Var = baseSearchWebViewUI.E3;
        if (d0Var != null) {
            com.tencent.mm.plugin.websearch.webview.BaseWebSearchWebView baseWebSearchWebView = (com.tencent.mm.plugin.websearch.webview.BaseWebSearchWebView) baseSearchWebViewUI.f183815f;
            d0Var.getClass();
            if (baseWebSearchWebView != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.WebSearchJSApi", "onScreenShot!");
                java.lang.String jSONObject = d0Var.g().toString();
                kotlin.jvm.internal.o.f(jSONObject, "toString(...)");
                try {
                    com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.WebSearchJSApiNotifier", "start notifyJsEvent %s %s", "onUserCaptureScreen", jSONObject);
                    java.lang.String format = java.lang.String.format("javascript:window['%s'] && %s(%s)", java.util.Arrays.copyOf(new java.lang.Object[]{"onUserCaptureScreen", "onUserCaptureScreen", jSONObject}, 3));
                    kotlin.jvm.internal.o.f(format, "format(...)");
                    pm0.v.X(new av4.t0(baseWebSearchWebView, format));
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WebSearch.WebSearchJSApiNotifier", e17, "notifyJsEvent", new java.lang.Object[0]);
                }
            }
        }
    }
}
