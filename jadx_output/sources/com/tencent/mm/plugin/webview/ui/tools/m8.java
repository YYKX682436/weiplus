package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes.dex */
public class m8 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.WebViewUI f185692d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nw4.n f185693e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONArray f185694f;

    public m8(com.tencent.mm.plugin.webview.ui.tools.u7 u7Var, com.tencent.mm.plugin.webview.ui.tools.WebViewUI webViewUI, nw4.n nVar, org.json.JSONArray jSONArray) {
        this.f185692d = webViewUI;
        this.f185693e = nVar;
        this.f185694f = jSONArray;
    }

    @Override // java.lang.Runnable
    public void run() {
        nw4.n nVar;
        com.tencent.mm.plugin.webview.ui.tools.WebViewUI webViewUI = this.f185692d;
        if (webViewUI == null || webViewUI.isFinishing() || (nVar = this.f185693e) == null) {
            return;
        }
        if (!nVar.f340895i) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiHandler", "not ready");
            return;
        }
        org.json.JSONArray jSONArray = this.f185694f;
        if (jSONArray == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiHandler", "onGetMsgProofItems fail, not ready");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiHandler", "onGetMsgProofItems success, ready");
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("msgs", jSONArray);
        com.tencent.mm.sdk.platformtools.u3.h(new nw4.b2(nVar, nw4.x2.c("onGetMsgProofItems", hashMap, nVar.f340903q, nVar.f340904r)));
    }
}
