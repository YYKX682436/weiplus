package com.tencent.mm.plugin.lite.jsapi.comms;

/* loaded from: classes.dex */
public class g0 extends com.tencent.mm.plugin.lite.api.p {
    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        if (jSONObject == null) {
            this.f143443f.a("param is null");
            return;
        }
        java.lang.String optString = jSONObject.optString("src");
        int optInt = jSONObject.optInt("width");
        int optInt2 = jSONObject.optInt("height");
        if (android.text.TextUtils.isEmpty(optString)) {
            com.tencent.mars.xlog.Log.e("LiteAppJsApiCropImage", "cropImage fail, src is null");
            this.f143443f.a("cropImage fail, src is null");
            return;
        }
        if (optInt < 0 || optInt2 < 0) {
            com.tencent.mars.xlog.Log.e("LiteAppJsApiCropImage", "cropImage fail, src is null");
            this.f143443f.a("cropImage fail,  width or height is illegal");
            return;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("src", optString);
        hashMap.put("width", java.lang.String.valueOf(optInt));
        hashMap.put("height", java.lang.String.valueOf(optInt2));
        hashMap.put("appId", this.f143443f.f143440a.f299025b);
        hashMap.put("appUuid", java.lang.String.valueOf(this.f143443f.f143440a.f299024a));
        android.content.Intent intent = new android.content.Intent();
        intent.setClass(c(), com.tencent.mm.plugin.lite.ui.WxaLiteAppApiProxyUI.class);
        intent.putExtra("proxyui_action_code_key", 12);
        intent.putExtra("crop_image_params", hashMap);
        int i17 = m93.j.A + 1;
        m93.j.A = i17;
        m93.j.B.put(java.lang.Integer.valueOf(i17), this);
        intent.putExtra("callback_id", m93.j.A);
        android.content.Context c17 = c();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(c17, arrayList.toArray(), "com/tencent/mm/plugin/lite/jsapi/comms/LiteAppJsApiCropImage", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        c17.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(c17, "com/tencent/mm/plugin/lite/jsapi/comms/LiteAppJsApiCropImage", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    @Override // com.tencent.mm.plugin.lite.api.p
    public void h(int i17, int i18, android.content.Intent intent) {
        if (i17 == 1000) {
            if (intent == null) {
                com.tencent.mars.xlog.Log.e("LiteAppJsApiCropImage", "onActivityResult: data null");
                this.f143443f.a("data is null");
                return;
            }
            java.lang.String stringExtra = intent.getStringExtra("CropImage_OutputPath");
            if (stringExtra == null) {
                com.tencent.mars.xlog.Log.e("LiteAppJsApiCropImage", "onActivityResult: crop path null");
                this.f143443f.a("crop path is null");
                return;
            }
            if (i18 != -1) {
                com.tencent.mm.vfs.w6.h(stringExtra);
                this.f143443f.a("cancel");
                return;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(((yg0.u4) ((zg0.r3) i95.n0.c(zg0.r3.class))).Ai(stringExtra).f182736e);
            ((yg0.u4) ((zg0.r3) i95.n0.c(zg0.r3.class))).getClass();
            java.lang.String g17 = com.tencent.mm.plugin.webview.model.o5.g(arrayList);
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("localIds", g17);
            this.f143443f.b(hashMap);
        }
    }
}
