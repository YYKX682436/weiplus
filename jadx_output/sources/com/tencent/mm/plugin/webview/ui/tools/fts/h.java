package com.tencent.mm.plugin.webview.ui.tools.fts;

/* loaded from: classes.dex */
public class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f184423d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.fts.BaseSOSWebViewUI f184424e;

    public h(com.tencent.mm.plugin.webview.ui.tools.fts.BaseSOSWebViewUI baseSOSWebViewUI, java.lang.String str) {
        this.f184424e = baseSOSWebViewUI;
        this.f184423d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.webview.ui.tools.fts.BaseSOSWebViewUI baseSOSWebViewUI = this.f184424e;
        if (baseSOSWebViewUI.s9() != null) {
            nw4.n s96 = baseSOSWebViewUI.s9();
            java.lang.String str = this.f184423d;
            if (!s96.f340895i) {
                com.tencent.mars.xlog.Log.e("MicroMsg.JsApiHandler", "onSearchHistoryReady fail, not ready");
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiHandler", "onSearchHistoryReady success, ready");
            try {
                com.tencent.mm.sdk.platformtools.u3.h(new nw4.y0(s96, nw4.x2.d("onSearchHistoryReady", new org.json.JSONObject(str), s96.f340903q, s96.f340904r)));
            } catch (org.json.JSONException e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.JsApiHandler", e17, "", new java.lang.Object[0]);
            }
        }
    }
}
