package com.tencent.mm.plugin.lite.jsapi.comms;

/* loaded from: classes.dex */
public class c3 extends com.tencent.mm.plugin.lite.api.p {
    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        if (jSONObject == null) {
            this.f143443f.a("data is null");
            return;
        }
        java.lang.String optString = jSONObject.optString("tousername");
        java.lang.String optString2 = jSONObject.optString("extmsg");
        java.lang.String uj6 = ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).uj(str);
        if (com.tencent.mm.sdk.platformtools.t8.K0(optString)) {
            this.f143443f.a("fail: username is null");
            return;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("tousername", optString);
        hashMap.put("extmsg", optString2);
        hashMap.put("url", uj6);
        android.content.Intent intent = new android.content.Intent();
        intent.setClass(c(), com.tencent.mm.plugin.lite.ui.WxaLiteAppApiProxyUI.class);
        intent.putExtra("proxyui_action_code_key", 3);
        intent.putExtra("jump_to_biz_profile_params", hashMap);
        int i17 = m93.j.f325047g + 1;
        m93.j.f325047g = i17;
        m93.j.f325048h.put(java.lang.Integer.valueOf(i17), this);
        intent.putExtra("callback_id", m93.j.f325047g);
        android.content.Context c17 = c();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(c17, arrayList.toArray(), "com/tencent/mm/plugin/lite/jsapi/comms/LiteAppJsApiJumpToBizProfile", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        c17.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(c17, "com/tencent/mm/plugin/lite/jsapi/comms/LiteAppJsApiJumpToBizProfile", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    @Override // com.tencent.mm.plugin.lite.api.p
    public void n(int i17, int i18, android.content.Intent intent) {
        if (i17 == 3) {
            if (i18 == -1) {
                this.f143443f.d(false);
                return;
            }
            if (i18 == 0) {
                this.f143443f.a("canceled");
            } else if (i18 == 2 || i18 == 3) {
                this.f143443f.a("check_fail");
            } else {
                this.f143443f.a("fail");
                com.tencent.mars.xlog.Log.e("LiteAppJsApiJumpToBizProfile", "unknown resultCode");
            }
        }
    }

    @Override // com.tencent.mm.plugin.lite.api.p
    public int z() {
        return 1;
    }
}
