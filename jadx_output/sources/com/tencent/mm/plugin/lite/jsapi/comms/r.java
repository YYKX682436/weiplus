package com.tencent.mm.plugin.lite.jsapi.comms;

/* loaded from: classes.dex */
public class r extends com.tencent.mm.plugin.lite.api.p {
    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        if (jSONObject == null) {
            this.f143443f.a("fail: data is null");
            return;
        }
        java.lang.String optString = jSONObject.optString("card_list");
        java.lang.String optString2 = jSONObject.optString("srcUsername");
        java.lang.String optString3 = jSONObject.optString("url");
        java.lang.String optString4 = jSONObject.optString("consumedCardId");
        java.lang.String optString5 = jSONObject.optString("template_id");
        if (com.tencent.mm.sdk.platformtools.t8.K0(optString)) {
            this.f143443f.a("fail: cardlist is null");
            return;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("card_list", optString);
        hashMap.put("srcUsername", optString2);
        hashMap.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, java.lang.String.valueOf(7));
        hashMap.put("url", optString3);
        hashMap.put("consumedCardId", optString4);
        hashMap.put("template_id", optString5);
        android.content.Intent intent = new android.content.Intent();
        intent.setClass(c(), com.tencent.mm.plugin.lite.ui.WxaLiteAppApiProxyUI.class);
        intent.putExtra("proxyui_action_code_key", 1);
        intent.putExtra("batch_add_card_params", hashMap);
        int i17 = m93.j.f325043c + 1;
        m93.j.f325043c = i17;
        m93.j.f325044d.put(java.lang.Integer.valueOf(i17), this);
        intent.putExtra("callback_id", m93.j.f325043c);
        android.content.Context c17 = c();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(c17, arrayList.toArray(), "com/tencent/mm/plugin/lite/jsapi/comms/LiteAppJsApiBatchAddCard", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        c17.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(c17, "com/tencent/mm/plugin/lite/jsapi/comms/LiteAppJsApiBatchAddCard", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    @Override // com.tencent.mm.plugin.lite.api.p
    public void e(int i17, int i18, android.content.Intent intent) {
        if (i17 == 1) {
            java.util.HashMap hashMap = new java.util.HashMap();
            if (intent != null) {
                java.lang.String stringExtra = intent.getStringExtra("card_list");
                boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                if (stringExtra == null) {
                    stringExtra = "";
                }
                hashMap.put("card_list", stringExtra);
            }
            if (i18 == -1) {
                this.f143443f.b(hashMap);
                return;
            }
            if ((intent != null ? intent.getIntExtra("result_code", 2) : 2) == 2) {
                this.f143443f.a("fail");
            } else {
                this.f143443f.a("cancel");
            }
        }
    }

    @Override // com.tencent.mm.plugin.lite.api.p
    public int z() {
        return 1;
    }
}
