package com.tencent.mm.plugin.lite.jsapi.comms;

/* loaded from: classes.dex */
public class s3 extends com.tencent.mm.plugin.lite.api.p {
    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        com.tencent.mars.xlog.Log.i("LiteAppJsApiOpenCTID", "Invoke openCTID");
        if (jSONObject == null) {
            this.f143443f.a("data is null");
            return;
        }
        java.lang.String optString = jSONObject.optString("orgID");
        java.lang.String optString2 = jSONObject.optString("appID");
        java.lang.String optString3 = jSONObject.optString("bizSeq");
        java.lang.String optString4 = jSONObject.optString("type");
        if (com.tencent.mm.sdk.platformtools.t8.K0(optString) || com.tencent.mm.sdk.platformtools.t8.K0(optString2)) {
            this.f143443f.a("invalid arguments");
            return;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("orgID", optString);
        hashMap.put("appID", optString2);
        hashMap.put("bizSeq", optString3);
        hashMap.put("type", optString4);
        android.content.Intent intent = new android.content.Intent();
        intent.setClass(c(), com.tencent.mm.plugin.lite.ui.WxaLiteAppApiProxyUI.class);
        intent.putExtra("proxyui_action_code_key", 18);
        int i17 = m93.j.K + 1;
        m93.j.K = i17;
        m93.j.L.put(java.lang.Integer.valueOf(i17), this);
        intent.putExtra("callback_id", m93.j.K);
        intent.putExtra("open_ctid_params", hashMap);
        android.content.Context c17 = c();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(c17, arrayList.toArray(), "com/tencent/mm/plugin/lite/jsapi/comms/LiteAppJsApiOpenCTID", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        c17.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(c17, "com/tencent/mm/plugin/lite/jsapi/comms/LiteAppJsApiOpenCTID", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    @Override // com.tencent.mm.plugin.lite.api.p
    public void o(int i17, int i18, android.content.Intent intent) {
        if (i17 != 18) {
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("JsApiOpenCTID onActivityResult requestCode: ");
        sb6.append(i17);
        sb6.append(", resultCode: ");
        sb6.append(i18);
        sb6.append(", retData: ");
        sb6.append(intent == null);
        com.tencent.mars.xlog.Log.i("LiteAppJsApiOpenCTID", sb6.toString());
        if (i18 != -1 || intent == null) {
            this.f143443f.a("open CTID fail");
            return;
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.String stringExtra = intent.getStringExtra("resultCode");
            if (stringExtra == null) {
                stringExtra = "";
            }
            jSONObject.put("resultCode", stringExtra);
            java.lang.String stringExtra2 = intent.getStringExtra("resultDesc");
            if (stringExtra2 == null) {
                stringExtra2 = "";
            }
            jSONObject.put("resultDesc", stringExtra2);
            java.lang.String stringExtra3 = intent.getStringExtra("idCardAuthData");
            if (stringExtra3 == null) {
                stringExtra3 = "";
            }
            jSONObject.put("idCardAuthData", stringExtra3);
            java.lang.String stringExtra4 = intent.getStringExtra("certPwdData");
            if (stringExtra4 == null) {
                stringExtra4 = "";
            }
            jSONObject.put("certPwdData", stringExtra4);
            java.lang.String stringExtra5 = intent.getStringExtra("resultData");
            jSONObject.put("resultData", stringExtra5 != null ? stringExtra5 : "");
            this.f143443f.c(jSONObject, false);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("LiteAppJsApiOpenCTID", "json exception: %s", e17.getMessage());
            this.f143443f.a("open CTID json exception");
        }
    }
}
