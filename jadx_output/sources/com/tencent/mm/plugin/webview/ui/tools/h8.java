package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes.dex */
public class h8 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.WebViewUI f184801d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nw4.n f184802e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f184803f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ byte[] f184804g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f184805h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f184806i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.permission.w f184807m;

    public h8(com.tencent.mm.plugin.webview.ui.tools.u7 u7Var, com.tencent.mm.plugin.webview.ui.tools.WebViewUI webViewUI, nw4.n nVar, java.lang.String str, byte[] bArr, boolean z17, boolean z18, com.tencent.mm.plugin.webview.permission.w wVar) {
        this.f184801d = webViewUI;
        this.f184802e = nVar;
        this.f184803f = str;
        this.f184804g = bArr;
        this.f184805h = z17;
        this.f184806i = z18;
        this.f184807m = wVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.webview.ui.tools.WebViewUI webViewUI = this.f184801d;
        if (webViewUI == null || webViewUI.isFinishing()) {
            return;
        }
        nw4.n nVar = this.f184802e;
        if (nVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WebViewStubCallbackAIDLStub", "hakon can not call onScanWXDeviceResult, %s, %s", nVar, this.f184807m);
            return;
        }
        boolean z17 = this.f184806i;
        if (!nVar.f340895i) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiHandler", "onScanWXDeviceResult fail, not ready");
            return;
        }
        java.lang.Object[] objArr = new java.lang.Object[3];
        boolean z18 = false;
        java.lang.String str = this.f184803f;
        objArr[0] = str;
        boolean z19 = this.f184805h;
        objArr[1] = java.lang.Boolean.valueOf(z19);
        byte[] bArr = this.f184804g;
        objArr[2] = java.lang.Integer.valueOf(bArr == null ? 0 : bArr.length);
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiHandler", "onScanWXDeviceResult: device id = %s, isCompleted = %s, %s", objArr);
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiHandler", "parameter error!!!");
            return;
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            org.json.JSONArray jSONArray = new org.json.JSONArray();
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            jSONObject2.put("deviceId", str);
            com.tencent.mm.plugin.webview.jsapi.exdevice.b.d().getClass();
            if (bArr != null && bArr.length >= 9 && bArr[bArr.length - 7] == 1 && bArr[bArr.length - 8] == 1 && bArr[bArr.length - 9] == -2) {
                z18 = true;
            }
            if (z18 || (bArr != null && z17)) {
                jSONObject2.put("base64BroadcastData", android.util.Base64.encodeToString(bArr, 2));
            }
            jSONArray.put(jSONObject2);
            jSONObject.put("devices", jSONArray);
            if (z19) {
                jSONObject.put("isCompleted", "1");
            } else {
                jSONObject.put("isCompleted", "0");
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiHandler", "Ex in onScanWXDeviceResult, %s", e17.getMessage());
        }
        java.lang.String d17 = nw4.x2.d("onScanWXDeviceResult", jSONObject, nVar.f340903q, nVar.f340904r);
        try {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiHandler", "hakon onScanWXDeviceResult, %s", d17);
            nVar.f340887a.evaluateJavascript("javascript:WeixinJSBridge._handleMessageFromWeixin(" + d17 + ")", null);
        } catch (java.lang.Exception e18) {
            com.tencent.mars.xlog.Log.w("MicroMsg.JsApiHandler", "onScanWXDeviceResult, %s", e18.getMessage());
        }
        if (z17) {
            return;
        }
        com.tencent.mm.plugin.webview.jsapi.exdevice.b.d().getClass();
    }
}
