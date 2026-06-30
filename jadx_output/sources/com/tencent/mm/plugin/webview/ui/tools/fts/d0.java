package com.tencent.mm.plugin.webview.ui.tools.fts;

/* loaded from: classes.dex */
public class d0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f184374d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.fts.BaseSearchWebViewUI f184375e;

    public d0(com.tencent.mm.plugin.webview.ui.tools.fts.BaseSearchWebViewUI baseSearchWebViewUI, java.lang.String str) {
        this.f184375e = baseSearchWebViewUI;
        this.f184374d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        nw4.n s96 = this.f184375e.s9();
        boolean z17 = s96.f340895i;
        java.lang.String str = this.f184374d;
        if (z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiHandler", "onCurrentLocationReady success, ready");
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("json", str);
            com.tencent.mm.sdk.platformtools.u3.h(new nw4.a1(s96, nw4.x2.c("onCurrentLocationReady", hashMap, s96.f340903q, s96.f340904r)));
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiHandler", "onCurrentLocationReady fail, not ready");
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.BaseSearchWebViewUI", "onCurrentLocationReady, json = %s", str);
    }
}
