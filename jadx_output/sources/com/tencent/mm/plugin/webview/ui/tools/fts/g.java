package com.tencent.mm.plugin.webview.ui.tools.fts;

/* loaded from: classes.dex */
public class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f184414d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f184415e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.fts.BaseSOSWebViewUI f184416f;

    public g(com.tencent.mm.plugin.webview.ui.tools.fts.BaseSOSWebViewUI baseSOSWebViewUI, java.lang.String str, java.lang.String str2) {
        this.f184416f = baseSOSWebViewUI;
        this.f184414d = str;
        this.f184415e = str2;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.webview.ui.tools.fts.BaseSOSWebViewUI baseSOSWebViewUI = this.f184416f;
        if (baseSOSWebViewUI.s9() != null) {
            nw4.n s96 = baseSOSWebViewUI.s9();
            if (!s96.f340895i) {
                com.tencent.mars.xlog.Log.e("MicroMsg.JsApiHandler", "onChatSearchDataReady fail, not ready");
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiHandler", "onChatSearchDataReady success, ready");
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("json", this.f184414d);
            hashMap.put("requestId", this.f184415e);
            com.tencent.mm.sdk.platformtools.u3.h(new nw4.f1(s96, nw4.x2.c("onChatSearchDataReady", hashMap, s96.f340903q, s96.f340904r)));
        }
    }
}
