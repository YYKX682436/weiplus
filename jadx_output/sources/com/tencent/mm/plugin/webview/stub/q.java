package com.tencent.mm.plugin.webview.stub;

/* loaded from: classes.dex */
public class q implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.stub.WebViewStubProxyUI f183563d;

    public q(com.tencent.mm.plugin.webview.stub.WebViewStubProxyUI webViewStubProxyUI) {
        this.f183563d = webViewStubProxyUI;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        com.tencent.mm.plugin.webview.stub.WebViewStubProxyUI webViewStubProxyUI = this.f183563d;
        if (webViewStubProxyUI.getWindow() == null || webViewStubProxyUI.getWindow().getDecorView() == null || webViewStubProxyUI.getWindow().getDecorView().getWindowToken() == null) {
            int i17 = webViewStubProxyUI.f183478p;
            if (i17 < 10) {
                webViewStubProxyUI.f183478p = i17 + 1;
                return true;
            }
            com.tencent.mars.xlog.Log.e("MicroMsg.WebViewStubProxyUI", "timer reach max retry time, finish ProxyUI");
            webViewStubProxyUI.finish();
            return false;
        }
        int i18 = com.tencent.mm.plugin.webview.stub.WebViewStubProxyUI.f183468s;
        android.content.Intent intent = webViewStubProxyUI.getIntent();
        int intExtra = intent.getIntExtra("proxyui_action_code_key", 0);
        com.tencent.mars.xlog.Log.i("MicroMsg.WebViewStubProxyUI", "onCreate, dealAfterWindowTokenInited = " + intExtra);
        com.tencent.mm.plugin.webview.stub.z0 z0Var = webViewStubProxyUI.f183476n;
        if (intExtra == 1) {
            nw4.y2 y2Var = new nw4.y2();
            y2Var.f341012b = intent.getStringExtra("proxyui_type_key");
            y2Var.f341019i = intent.getStringExtra("proxyui_function_key");
            y2Var.f341013c = intent.getStringExtra("proxyui_callback_key");
            android.os.Bundle extras = intent.getExtras();
            if (extras == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.WebViewStubProxyUI", "getExtras from intent, returned NULL");
                extras = android.os.Bundle.EMPTY;
            }
            y2Var.f340790a = nw4.a.a(extras.getBundle("compatParams"));
            y2Var.f341015e = extras.getBundle("jsEngine");
            try {
                java.lang.String string = extras.getString("rawParams");
                if (!android.text.TextUtils.isEmpty(string)) {
                    y2Var.f341014d = new org.json.JSONObject(string);
                }
            } catch (org.json.JSONException e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.WebViewStubProxyUI", "get rawParams, e = %s", e17);
            }
            com.tencent.mm.protocal.JsapiPermissionWrapper jsapiPermissionWrapper = (com.tencent.mm.protocal.JsapiPermissionWrapper) intent.getExtras().getParcelable("proxyui_perm_key");
            if (jsapiPermissionWrapper == null) {
                jsapiPermissionWrapper = new com.tencent.mm.protocal.JsapiPermissionWrapper(2);
            }
            com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 a17 = com.tencent.mm.plugin.webview.ui.tools.jsapi.k8.a(webViewStubProxyUI.f183472g);
            a17.f184995x = false;
            com.tencent.mars.xlog.Log.i("MicroMsg.MsgHandler", "markAwaitingProxyUI %d, %b", java.lang.Integer.valueOf(a17.B), java.lang.Boolean.FALSE);
            a17.W6(webViewStubProxyUI, z0Var, webViewStubProxyUI.f183470e);
            if (!a17.A6(y2Var, jsapiPermissionWrapper)) {
                try {
                    ((com.tencent.mm.plugin.webview.stub.o) z0Var).aj(null, null, null, true);
                } catch (java.lang.Exception e18) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.WebViewStubProxyUI", "onHandleEnd, ex = " + e18.getMessage());
                }
            }
        } else if (intExtra != 4) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WebViewStubProxyUI", "dealAfterWindowTokenInited unknown actionCode = " + intExtra);
            webViewStubProxyUI.finish();
        } else {
            com.tencent.mm.protocal.JsapiPermissionWrapper jsapiPermissionWrapper2 = (com.tencent.mm.protocal.JsapiPermissionWrapper) intent.getExtras().getParcelable("proxyui_perm_key");
            if (jsapiPermissionWrapper2 == null) {
                jsapiPermissionWrapper2 = new com.tencent.mm.protocal.JsapiPermissionWrapper(2);
            }
            com.tencent.mm.plugin.webview.ui.tools.jsapi.k8.a(webViewStubProxyUI.f183472g).V6(webViewStubProxyUI, z0Var);
            if (!com.tencent.mm.plugin.webview.ui.tools.jsapi.k8.a(webViewStubProxyUI.f183472g).M5(intent.getStringExtra("proxyui_username_key"), jsapiPermissionWrapper2)) {
                com.tencent.mars.xlog.Log.w("MicroMsg.WebViewStubProxyUI", "doProfile fail, finish");
                webViewStubProxyUI.finish();
            }
        }
        webViewStubProxyUI.f183471f = true;
        return false;
    }
}
