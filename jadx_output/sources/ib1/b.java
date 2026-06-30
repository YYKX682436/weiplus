package ib1;

/* loaded from: classes7.dex */
public class b extends com.tencent.mm.plugin.appbrand.jsapi.f {
    private static final int CTRL_INDEX = 181;
    private static final java.lang.String NAME = "closeBLEConnection";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.tencent.mm.plugin.appbrand.jsapi.bluetooth.l.a(91);
        if (jSONObject == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiCloseBLEConnection", "JsApiCloseBLEConnection data is null");
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("errCode", 10013);
            java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
            hashMap.put("errno", 101);
            lVar.a(i17, t("fail:invalid data", hashMap));
            com.tencent.mm.plugin.appbrand.jsapi.bluetooth.l.b(93, 94);
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiCloseBLEConnection", "appId:%s closeBLEConnection data %s", lVar.getAppId(), jSONObject.toString());
        com.tencent.mm.plugin.appbrand.jsapi.bluetooth.e b17 = com.tencent.mm.plugin.appbrand.jsapi.bluetooth.b.b(lVar.getAppId());
        if (b17 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiCloseBLEConnection", "bleWorker is null, may not open ble");
            java.util.HashMap hashMap2 = new java.util.HashMap();
            hashMap2.put("errCode", 10000);
            java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
            hashMap2.put("errno", 1500101);
            lVar.a(i17, t("fail:not init", hashMap2));
            com.tencent.mm.plugin.appbrand.jsapi.bluetooth.l.b(93, 96);
            return;
        }
        if (qb1.b.b()) {
            java.lang.String optString = jSONObject.optString("deviceId");
            boolean optBoolean = jSONObject.optBoolean("debug", false);
            boolean optBoolean2 = jSONObject.optBoolean("mainThread", true);
            mb1.a aVar = new mb1.a();
            aVar.f343991f = optBoolean;
            aVar.f343992g = optBoolean2;
            b17.h(optString, aVar, new ib1.a(this, lVar, i17));
            return;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.JsApiCloseBLEConnection", "adapter is null or not enabled!");
        java.util.HashMap hashMap3 = new java.util.HashMap();
        hashMap3.put("errCode", 10001);
        java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
        hashMap3.put("errno", 1500102);
        lVar.a(i17, t("fail:not available", hashMap3));
        com.tencent.mm.plugin.appbrand.jsapi.bluetooth.l.b(93, 98);
    }
}
