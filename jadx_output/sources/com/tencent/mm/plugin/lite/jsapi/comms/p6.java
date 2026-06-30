package com.tencent.mm.plugin.lite.jsapi.comms;

/* loaded from: classes.dex */
public class p6 extends com.tencent.mm.plugin.lite.api.p {
    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        android.content.Intent intent = new android.content.Intent();
        intent.setClass(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.plugin.lite.ui.WxaLiteAppApiProxyUI.class);
        intent.putExtra("proxyui_action_code_key", 11);
        int i17 = m93.j.f325063w + 1;
        m93.j.f325063w = i17;
        m93.j.f325064x.put(java.lang.Integer.valueOf(i17), this);
        intent.putExtra("callback_id", m93.j.f325063w);
        android.content.Context c17 = c();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(c17, arrayList.toArray(), "com/tencent/mm/plugin/lite/jsapi/comms/LiteAppJsApiSelectBank", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        c17.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(c17, "com/tencent/mm/plugin/lite/jsapi/comms/LiteAppJsApiSelectBank", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    @Override // com.tencent.mm.plugin.lite.api.p
    public void w(int i17, int i18, android.content.Intent intent) {
        if (intent == null) {
            this.f143443f.a("cancel");
            return;
        }
        java.lang.String stringExtra = intent.getStringExtra("bank_name");
        java.lang.String stringExtra2 = intent.getStringExtra("bank_icon");
        java.lang.String stringExtra3 = intent.getStringExtra("bank_type");
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("bankType", stringExtra3);
        hashMap.put("bankName", stringExtra);
        hashMap.put("bankIcon", stringExtra2);
        this.f143443f.b(hashMap);
    }
}
