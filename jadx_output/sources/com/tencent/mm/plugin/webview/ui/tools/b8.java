package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes.dex */
public class b8 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.WebViewUI f183953d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nw4.n f183954e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f183955f;

    public b8(com.tencent.mm.plugin.webview.ui.tools.u7 u7Var, com.tencent.mm.plugin.webview.ui.tools.WebViewUI webViewUI, nw4.n nVar, int i17) {
        this.f183953d = webViewUI;
        this.f183954e = nVar;
        this.f183955f = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        nw4.n nVar;
        com.tencent.mm.plugin.webview.ui.tools.WebViewUI webViewUI = this.f183953d;
        if (webViewUI == null || webViewUI.isFinishing() || (nVar = this.f183954e) == null) {
            return;
        }
        if (!nVar.f340895i) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiHandler", "onNfcTouch fail, not ready");
            return;
        }
        int i17 = this.f183955f;
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiHandler", "onNfcTouch errCode=%d", java.lang.Integer.valueOf(i17));
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("errCode", java.lang.Integer.valueOf(i17));
        com.tencent.mm.sdk.platformtools.u3.h(new nw4.l0(nVar, nw4.x2.c("onNfcTouch", hashMap, nVar.f340903q, nVar.f340904r)));
    }
}
