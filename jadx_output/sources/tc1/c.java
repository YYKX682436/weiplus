package tc1;

/* loaded from: classes7.dex */
public class c extends com.tencent.mm.plugin.appbrand.jsapi.m0 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [android.content.Intent] */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4, types: [int] */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9 */
    @Override // com.tencent.mm.plugin.appbrand.jsapi.m0
    public boolean a(android.app.Activity activity, org.json.JSONObject jSONObject, int i17) {
        ?? r112;
        java.lang.String optString = jSONObject.optString("defaultWishingWord", null);
        org.json.JSONArray optJSONArray = jSONObject.optJSONArray("scope");
        if (optJSONArray != null) {
            boolean contains = optJSONArray.toString().contains("friend");
            boolean contains2 = optJSONArray.toString().contains("public");
            r112 = contains2;
            r112 = contains2;
            if (contains2 && contains) {
                r112 = 2;
            }
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiSendRedPacket", "launch scope is nil");
            r112 = 0;
        }
        kb3.i iVar = (kb3.i) i95.n0.c(kb3.i.class);
        java.lang.String appId = this.f82355a.getAppId();
        ((kb3.j) iVar).getClass();
        android.content.Intent putExtra = new android.content.Intent(activity, (java.lang.Class<?>) com.tencent.mm.plugin.luckymoney.appbrand.ui.prepare.WxaLuckyMoneyPrepareUI.class).putExtra("appId", appId).putExtra("defaultWishingWord", optString).putExtra("range", r112);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(putExtra);
        java.util.Collections.reverse(arrayList);
        yj0.a.k(activity, arrayList.toArray(), "com/tencent/mm/plugin/luckymoney/appbrand/IWxaLuckyMoneyImpl", "launchPrepareLuckyMoney", "(Landroid/app/Activity;Ljava/lang/String;ILjava/lang/String;I)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
        return true;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.m0
    public void b(int i17, java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiSendRedPacket", "onError errCode: %d,errMsg: %s", java.lang.Integer.valueOf(i17), str);
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("errCode", java.lang.Integer.valueOf(i17));
        this.f82355a.a(this.f82357c, this.f82358d.p(str, hashMap));
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.m0
    public void c(int i17, android.content.Intent intent) {
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiSendRedPacket", "PrepareLuckyMoneyRequest.onResult ");
        if (intent == null || intent.getStringExtra("sendId") == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiSendRedPacket", "onResult data = [%s]", intent);
            b(-1, "fail:system error {{result data error or sendId is null}}");
            return;
        }
        java.lang.String stringExtra = intent.getStringExtra("sendId");
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiSendRedPacket", "PrepareLuckyMoneyRequest.onResult sendId = %s,share = %b", stringExtra, java.lang.Boolean.valueOf(intent.getBooleanExtra("result_share_msg", false)));
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiSendRedPacket", "GetLuckMoneyRequest.onResult");
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("errCode", 0);
        hashMap.put("redPacketId", stringExtra);
        this.f82355a.a(this.f82357c, this.f82358d.p("ok", hashMap));
    }
}
