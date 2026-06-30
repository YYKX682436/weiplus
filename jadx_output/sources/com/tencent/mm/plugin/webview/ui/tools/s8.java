package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes.dex */
public class s8 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.WebViewUI f186865d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nw4.n f186866e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f186867f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ float f186868g;

    public s8(com.tencent.mm.plugin.webview.ui.tools.u7 u7Var, com.tencent.mm.plugin.webview.ui.tools.WebViewUI webViewUI, nw4.n nVar, java.lang.String str, float f17) {
        this.f186865d = webViewUI;
        this.f186866e = nVar;
        this.f186867f = str;
        this.f186868g = f17;
    }

    @Override // java.lang.Runnable
    public void run() {
        nw4.n nVar;
        com.tencent.mm.plugin.webview.ui.tools.WebViewUI webViewUI = this.f186865d;
        if (webViewUI == null || webViewUI.isFinishing() || (nVar = this.f186866e) == null) {
            return;
        }
        if (!nVar.f340895i) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiHandler", "not ready");
            return;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("postId", this.f186867f);
        hashMap.put("percent", java.lang.Float.valueOf(this.f186868g));
        com.tencent.mm.sdk.platformtools.u3.h(new nw4.e2(nVar, nw4.x2.c("onPublishHaowanProgress", hashMap, nVar.f340903q, nVar.f340904r)));
    }
}
