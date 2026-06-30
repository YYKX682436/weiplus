package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes.dex */
public class j8 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.WebViewUI f184863d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nw4.n f184864e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f184865f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f184866g;

    public j8(com.tencent.mm.plugin.webview.ui.tools.u7 u7Var, com.tencent.mm.plugin.webview.ui.tools.WebViewUI webViewUI, nw4.n nVar, java.lang.String str, boolean z17) {
        this.f184863d = webViewUI;
        this.f184864e = nVar;
        this.f184865f = str;
        this.f184866g = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        nw4.n nVar;
        com.tencent.mm.plugin.webview.ui.tools.WebViewUI webViewUI = this.f184863d;
        if (webViewUI == null || webViewUI.isFinishing() || (nVar = this.f184864e) == null) {
            return;
        }
        if (!nVar.f340895i) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiHandler", "onWXDeviceBindStateChange fail, not ready");
            return;
        }
        boolean z17 = this.f184866g;
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(z17);
        java.lang.String str = this.f184865f;
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiHandler", "onWXDeviceBindStateChange: device id = %s, isBound = %s", str, valueOf);
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiHandler", "parameter error!!!");
            return;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("deviceId", str);
        if (z17) {
            hashMap.put("state", "bind");
        } else {
            hashMap.put("state", "unbind");
        }
        com.tencent.mm.sdk.platformtools.u3.h(new nw4.t(nVar, nw4.x2.c("onWXDeviceBindStateChange", hashMap, nVar.f340903q, nVar.f340904r)));
    }
}
