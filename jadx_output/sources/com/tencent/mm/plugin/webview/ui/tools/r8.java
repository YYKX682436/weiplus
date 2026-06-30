package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes.dex */
public class r8 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.WebViewUI f186811d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nw4.n f186812e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f186813f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f186814g;

    public r8(com.tencent.mm.plugin.webview.ui.tools.u7 u7Var, com.tencent.mm.plugin.webview.ui.tools.WebViewUI webViewUI, nw4.n nVar, java.lang.String str, int i17) {
        this.f186811d = webViewUI;
        this.f186812e = nVar;
        this.f186813f = str;
        this.f186814g = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        nw4.n nVar;
        com.tencent.mm.plugin.webview.ui.tools.WebViewUI webViewUI = this.f186811d;
        if (webViewUI == null || webViewUI.isFinishing() || (nVar = this.f186812e) == null) {
            return;
        }
        if (!nVar.f340895i) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiHandler", "not ready");
            return;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("postId", this.f186813f);
        hashMap.put("result", java.lang.Integer.valueOf(this.f186814g));
        com.tencent.mm.sdk.platformtools.u3.h(new nw4.d2(nVar, nw4.x2.c("onPublishHaowanEnd", hashMap, nVar.f340903q, nVar.f340904r)));
    }
}
