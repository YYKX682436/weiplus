package t93;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lt93/w;", "Lcom/tencent/mm/plugin/lite/api/p;", "<init>", "()V", "luggage-lite-app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class w extends com.tencent.mm.plugin.lite.api.p {
    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        android.content.Intent intent = new android.content.Intent();
        intent.setClass(c(), com.tencent.mm.plugin.lite.ui.WxaLiteAppApiProxyUI.class);
        intent.putExtra("proxyui_action_code_key", 6);
        int i17 = m93.j.f325053m + 1;
        m93.j.f325053m = i17;
        m93.j.f325054n.put(java.lang.Integer.valueOf(i17), this);
        intent.putExtra("callback_id", m93.j.f325053m);
        android.content.Context c17 = c();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(c17, arrayList.toArray(), "com/tencent/mm/plugin/lite/jsapi/finder/LiteAppJsApiRequestVerifyPwd", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        c17.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(c17, "com/tencent/mm/plugin/lite/jsapi/finder/LiteAppJsApiRequestVerifyPwd", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    @Override // com.tencent.mm.plugin.lite.api.p
    public void v(int i17, int i18, android.content.Intent intent) {
        if (i18 != -1 || intent == null || i17 != 1000) {
            this.f143443f.a("fail");
            return;
        }
        java.lang.String stringExtra = intent.getStringExtra("key_ticket");
        java.util.HashMap hashMap = new java.util.HashMap();
        if (stringExtra == null) {
            stringExtra = "";
        }
        hashMap.put("ticket", stringExtra);
        hashMap.put("sucessful", "true");
        this.f143443f.b(hashMap);
    }

    @Override // com.tencent.mm.plugin.lite.api.p
    public int z() {
        return 1;
    }
}
