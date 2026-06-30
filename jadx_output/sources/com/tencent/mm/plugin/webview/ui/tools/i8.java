package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes.dex */
public class i8 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.WebViewUI f184830d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nw4.n f184831e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f184832f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ byte[] f184833g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f184834h;

    public i8(com.tencent.mm.plugin.webview.ui.tools.u7 u7Var, com.tencent.mm.plugin.webview.ui.tools.WebViewUI webViewUI, nw4.n nVar, java.lang.String str, byte[] bArr, java.lang.String str2) {
        this.f184830d = webViewUI;
        this.f184831e = nVar;
        this.f184832f = str;
        this.f184833g = bArr;
        this.f184834h = str2;
    }

    @Override // java.lang.Runnable
    public void run() {
        nw4.n nVar;
        byte[] bArr;
        com.tencent.mm.plugin.webview.ui.tools.WebViewUI webViewUI = this.f184830d;
        if (webViewUI == null || webViewUI.isFinishing() || (nVar = this.f184831e) == null) {
            return;
        }
        if (!nVar.f340895i) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiHandler", "onReceiveDataFromWXDevice fail, not ready");
            return;
        }
        java.lang.String str = this.f184832f;
        java.lang.String str2 = this.f184834h;
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiHandler", "onReceiveDataFromWXDevice: device id = %s, brandName = %s", str, str2);
        if (com.tencent.mm.sdk.platformtools.t8.K0(str) || com.tencent.mm.sdk.platformtools.t8.K0(str2) || (bArr = this.f184833g) == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiHandler", "parameter error!!!");
            return;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("deviceId", str);
        hashMap.put("base64Data", android.util.Base64.encodeToString(bArr, 2));
        com.tencent.mm.sdk.platformtools.u3.h(new nw4.s(nVar, nw4.x2.c("onReceiveDataFromWXDevice", hashMap, nVar.f340903q, nVar.f340904r)));
    }
}
