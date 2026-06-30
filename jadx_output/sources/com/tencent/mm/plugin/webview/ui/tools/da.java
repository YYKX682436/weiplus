package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes.dex */
public class da implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.WebViewUI f184105d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nw4.n f184106e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f184107f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f184108g;

    public da(com.tencent.mm.plugin.webview.ui.tools.u7 u7Var, com.tencent.mm.plugin.webview.ui.tools.WebViewUI webViewUI, nw4.n nVar, java.lang.String str, int i17) {
        this.f184105d = webViewUI;
        this.f184106e = nVar;
        this.f184107f = str;
        this.f184108g = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        nw4.n nVar;
        com.tencent.mm.plugin.webview.ui.tools.WebViewUI webViewUI = this.f184105d;
        if (webViewUI == null || webViewUI.isFinishing() || (nVar = this.f184106e) == null) {
            return;
        }
        if (!nVar.f340895i) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiHandler", "onMediaFileUploadProgress fail, not ready");
            return;
        }
        int i17 = this.f184108g;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        java.lang.String str = this.f184107f;
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiHandler", "onMediaFileUploadProgress, local id : %s, percent : %d", str, valueOf);
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put(dm.i4.COL_LOCALID, str);
        hashMap.put("percent", java.lang.Integer.valueOf(i17));
        com.tencent.mm.sdk.platformtools.u3.h(new nw4.b0(nVar, nw4.x2.c("onMediaFileUploadProgress", hashMap, nVar.f340903q, nVar.f340904r)));
    }
}
