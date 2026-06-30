package com.tencent.mm.plugin.lite.jsapi.comms;

/* loaded from: classes.dex */
public class p7 extends com.tencent.mm.plugin.lite.api.p {
    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        if (((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f24068d.c()) {
            this.f143443f.a("has already bind phone number");
            return;
        }
        com.tencent.mars.xlog.Log.i("LiteAppJsApiStartBindPhone", "startBindPhone");
        android.content.Intent intent = new android.content.Intent();
        intent.setClass(c(), com.tencent.mm.plugin.lite.ui.WxaLiteAppApiProxyUI.class);
        intent.putExtra("proxyui_action_code_key", 17);
        int i17 = m93.j.I + 1;
        m93.j.I = i17;
        m93.j.f325040J.put(java.lang.Integer.valueOf(i17), this);
        intent.putExtra("callback_id", m93.j.I);
        intent.putExtra("bind_phone_direct", false);
        android.content.Context c17 = c();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(c17, arrayList.toArray(), "com/tencent/mm/plugin/lite/jsapi/comms/LiteAppJsApiStartBindPhone", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        c17.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(c17, "com/tencent/mm/plugin/lite/jsapi/comms/LiteAppJsApiStartBindPhone", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    @Override // com.tencent.mm.plugin.lite.api.p
    public void f(int i17, int i18, android.content.Intent intent) {
        if (i17 != 1000) {
            return;
        }
        if (((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f24068d.c()) {
            this.f143443f.d(false);
        } else {
            this.f143443f.a("bind phone fail");
        }
    }
}
