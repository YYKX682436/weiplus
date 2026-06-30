package ib1;

/* loaded from: classes7.dex */
public class d0 extends com.tencent.mm.plugin.appbrand.jsapi.f {
    private static final int CTRL_INDEX = 185;
    private static final java.lang.String NAME = "readBLECharacteristicValue";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        java.lang.Integer valueOf;
        com.tencent.mm.plugin.appbrand.jsapi.bluetooth.l.a(41);
        if (jSONObject == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiReadBLECharacteristicValue", "JsApiReadBLECharacteristicValue data is null");
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("errCode", 10013);
            java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
            hashMap.put("errno", 101);
            lVar.a(i17, t("fail:invalid data", hashMap));
            com.tencent.mm.plugin.appbrand.jsapi.bluetooth.l.b(43, 44);
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiReadBLECharacteristicValue", "appId:%s readBLECharacteristicValue data %s", lVar.getAppId(), jSONObject.toString());
        com.tencent.mm.plugin.appbrand.jsapi.bluetooth.e b17 = com.tencent.mm.plugin.appbrand.jsapi.bluetooth.b.b(lVar.getAppId());
        if (b17 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiReadBLECharacteristicValue", "bleWorker is null, may not open ble");
            java.util.HashMap hashMap2 = new java.util.HashMap();
            hashMap2.put("errCode", 10000);
            java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
            hashMap2.put("errno", 1500101);
            lVar.a(i17, t("fail:not init", hashMap2));
            com.tencent.mm.plugin.appbrand.jsapi.bluetooth.l.b(43, 46);
            return;
        }
        if (!qb1.b.b()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiReadBLECharacteristicValue", "adapter is null or not enabled!");
            java.util.HashMap hashMap3 = new java.util.HashMap();
            hashMap3.put("errCode", 10001);
            java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
            hashMap3.put("errno", 1500102);
            lVar.a(i17, t("fail:not available", hashMap3));
            com.tencent.mm.plugin.appbrand.jsapi.bluetooth.l.b(43, 48);
            return;
        }
        java.lang.String optString = jSONObject.optString("deviceId");
        java.lang.String optString2 = jSONObject.optString("serviceId");
        java.lang.String optString3 = jSONObject.optString("characteristicId");
        if (jSONObject.has("handle")) {
            try {
                valueOf = java.lang.Integer.valueOf(jSONObject.getInt("handle"));
            } catch (java.lang.Exception unused) {
            }
            boolean optBoolean = jSONObject.optBoolean("debug", false);
            boolean optBoolean2 = jSONObject.optBoolean("mainThread", false);
            mb1.k kVar = new mb1.k(optString2, optString3, valueOf);
            kVar.f343991f = optBoolean;
            kVar.f343992g = optBoolean2;
            b17.h(optString, kVar, new ib1.c0(this, lVar, i17));
        }
        valueOf = null;
        boolean optBoolean3 = jSONObject.optBoolean("debug", false);
        boolean optBoolean22 = jSONObject.optBoolean("mainThread", false);
        mb1.k kVar2 = new mb1.k(optString2, optString3, valueOf);
        kVar2.f343991f = optBoolean3;
        kVar2.f343992g = optBoolean22;
        b17.h(optString, kVar2, new ib1.c0(this, lVar, i17));
    }
}
