package tc1;

/* loaded from: classes7.dex */
public class a extends com.tencent.mm.plugin.appbrand.jsapi.m0 {
    @Override // com.tencent.mm.plugin.appbrand.jsapi.m0
    public boolean a(android.app.Activity activity, org.json.JSONObject jSONObject, int i17) {
        java.lang.String appId = this.f82355a.getAppId();
        java.lang.String optString = jSONObject.optString("redPacketId", null);
        if (com.tencent.mm.sdk.platformtools.t8.K0(appId) || com.tencent.mm.sdk.platformtools.t8.K0(optString)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiOpenRedPacket", "GetLuckMoneyRequest.launch appId = [%s] sendId = [%s]", appId, optString);
            return false;
        }
        ((kb3.j) ((kb3.i) i95.n0.c(kb3.i.class))).getClass();
        android.content.Intent putExtra = new android.content.Intent(activity, (java.lang.Class<?>) com.tencent.mm.plugin.luckymoney.appbrand.ui.receive.WxaLuckyMoneyReceiveUI.class).putExtra("appId", appId).putExtra("sendId", optString);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(putExtra);
        java.util.Collections.reverse(arrayList);
        yj0.a.k(activity, arrayList.toArray(), "com/tencent/mm/plugin/luckymoney/appbrand/IWxaLuckyMoneyImpl", "launchReceiveLuckyMoney", "(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;I)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
        return true;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.m0
    public void b(int i17, java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiOpenRedPacket", "onError errCode: %d,errMsg: %s", java.lang.Integer.valueOf(i17), str);
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("errCode", java.lang.Integer.valueOf(i17));
        this.f82355a.a(this.f82357c, this.f82358d.p(str, hashMap));
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.m0
    public void c(int i17, android.content.Intent intent) {
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiOpenRedPacket", "GetLuckMoneyRequest.onResult");
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("errCode", 0);
        this.f82355a.a(this.f82357c, this.f82358d.p("ok", hashMap));
    }
}
