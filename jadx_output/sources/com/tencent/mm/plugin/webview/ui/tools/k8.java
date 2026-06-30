package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes.dex */
public class k8 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.WebViewUI f185611d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nw4.n f185612e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f185613f;

    public k8(com.tencent.mm.plugin.webview.ui.tools.u7 u7Var, com.tencent.mm.plugin.webview.ui.tools.WebViewUI webViewUI, nw4.n nVar, boolean z17) {
        this.f185611d = webViewUI;
        this.f185612e = nVar;
        this.f185613f = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        nw4.n nVar;
        com.tencent.mm.plugin.webview.ui.tools.WebViewUI webViewUI = this.f185611d;
        if (webViewUI == null || webViewUI.isFinishing() || (nVar = this.f185612e) == null) {
            return;
        }
        if (!nVar.f340895i) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiHandler", "onWXDeviceBTStateChange fail, not ready");
            return;
        }
        boolean z17 = this.f185613f;
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiHandler", "onWXDeviceBTStateChange: state = %s", java.lang.Boolean.valueOf(z17));
        java.util.HashMap hashMap = new java.util.HashMap();
        if (z17) {
            hashMap.put("state", "on");
        } else {
            hashMap.put("state", "off");
        }
        com.tencent.mm.sdk.platformtools.u3.h(new nw4.u(nVar, nw4.x2.c("onWXDeviceBluetoothStateChange", hashMap, nVar.f340903q, nVar.f340904r)));
    }
}
