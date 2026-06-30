package com.tencent.mm.plugin.webview.luggage.jsapi;

/* loaded from: classes.dex */
public class f0 implements com.tencent.mm.ui.da {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.luggage.jsapi.g0 f182305d;

    public f0(com.tencent.mm.plugin.webview.luggage.jsapi.g0 g0Var) {
        this.f182305d = g0Var;
    }

    @Override // com.tencent.mm.ui.xc
    public void mmOnActivityResult(int i17, int i18, android.content.Intent intent) {
        com.tencent.mm.plugin.webview.luggage.jsapi.g0 g0Var = this.f182305d;
        if (i17 == (g0Var.hashCode() & 65535)) {
            if (i18 != -1) {
                if (i18 != 0) {
                    g0Var.h("fail", null);
                    return;
                } else {
                    g0Var.h("cancel", null);
                    return;
                }
            }
            if (intent == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.JsApiChooseMedia", "mmOnActivityResult REQUEST_CHOOSE_MEDIA bundle is null,");
                g0Var.h("fail", null);
                return;
            }
            int intExtra = intent.getIntExtra("key_pick_local_media_callback_type", 0);
            if (intExtra != 1) {
                if (intExtra != 2) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.JsApiChooseMedia", "type:%d is error", java.lang.Integer.valueOf(intExtra));
                    g0Var.h("fail", null);
                    return;
                }
                java.lang.String stringExtra = intent.getStringExtra("key_pick_local_media_local_ids");
                com.tencent.mars.xlog.Log.i("MicroMsg.JsApiChooseMedia", "chooseMedia localIds:%s", stringExtra);
                if (com.tencent.mm.sdk.platformtools.t8.K0(stringExtra)) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.JsApiChooseMedia", "mmOnActivityResult REQUEST_CHOOSE_MEDIA image localIds is null");
                    g0Var.h("fail", null);
                    return;
                } else {
                    java.util.HashMap hashMap = new java.util.HashMap();
                    hashMap.put("type", 2);
                    hashMap.put("localIds", stringExtra);
                    g0Var.h("", hashMap);
                    return;
                }
            }
            java.lang.String stringExtra2 = intent.getStringExtra("key_pick_local_media_local_id");
            java.lang.String stringExtra3 = intent.getStringExtra("key_pick_local_media_thumb_local_id");
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiChooseMedia", "video localId:%s", stringExtra2);
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiChooseMedia", "video thumbLocalId:%s", stringExtra3);
            if (com.tencent.mm.sdk.platformtools.t8.K0(stringExtra2)) {
                com.tencent.mars.xlog.Log.e("MicroMsg.JsApiChooseMedia", "mmOnActivityResult REQUEST_CHOOSE_MEDIA video localId is null");
                g0Var.h("fail", null);
                return;
            }
            com.tencent.mm.plugin.webview.model.WebViewJSSDKFileItem a17 = com.tencent.mm.plugin.webview.luggage.util.g.a(stringExtra2);
            if (a17 == null || !(a17 instanceof com.tencent.mm.plugin.webview.model.WebViewJSSDKVideoItem)) {
                com.tencent.mars.xlog.Log.e("MicroMsg.JsApiChooseMedia", "mmOnActivityResult REQUEST_CHOOSE_MEDIA nor the videoitem");
                g0Var.h("fail", null);
                return;
            }
            com.tencent.mm.plugin.webview.model.WebViewJSSDKVideoItem webViewJSSDKVideoItem = (com.tencent.mm.plugin.webview.model.WebViewJSSDKVideoItem) a17;
            java.lang.String i19 = com.tencent.mm.plugin.webview.model.o5.i(stringExtra2, stringExtra3, webViewJSSDKVideoItem.f182754w, webViewJSSDKVideoItem.f182745q, webViewJSSDKVideoItem.f182744p, webViewJSSDKVideoItem.f182743o);
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiChooseMedia", "after parse to json data : %s", i19);
            java.util.HashMap hashMap2 = new java.util.HashMap();
            hashMap2.put("type", 1);
            hashMap2.put("localIds", i19);
            g0Var.h("", hashMap2);
        }
    }
}
