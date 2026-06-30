package ib1;

/* loaded from: classes7.dex */
public final class f0 extends com.tencent.mm.plugin.appbrand.jsapi.f {
    private static final int CTRL_INDEX = 738;
    private static final java.lang.String NAME = "setBLEMTU";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l service, org.json.JSONObject jSONObject, int i17) {
        kotlin.jvm.internal.o.g(service, "service");
        if (jSONObject == null || !jSONObject.has("deviceId") || !jSONObject.has("mtu")) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiSetBLEMtu", "setBLEMTU data is null, err");
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("errCode", 10013);
            java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
            hashMap.put("errno", 101);
            service.a(i17, t("fail:invalid data", hashMap));
            return;
        }
        java.lang.String appId = service.getAppId();
        kotlin.jvm.internal.o.f(appId, "getAppId(...)");
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiSetBLEMtu", "appId:%s setBLEMTU data %s", appId, jSONObject.toString());
        com.tencent.mm.plugin.appbrand.jsapi.bluetooth.e b17 = com.tencent.mm.plugin.appbrand.jsapi.bluetooth.b.b(service.getAppId());
        if (b17 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiSetBLEMtu", "bleWorker is null, may not open ble");
            java.util.HashMap hashMap2 = new java.util.HashMap();
            hashMap2.put("errCode", 10000);
            java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
            hashMap2.put("errno", 1500101);
            service.a(i17, t("fail:not init", hashMap2));
            com.tencent.mm.plugin.appbrand.jsapi.bluetooth.l.b(27, 30);
            return;
        }
        if (qb1.b.b()) {
            java.lang.String optString = jSONObject.optString("deviceId");
            b17.h(optString, new mb1.l(java.lang.Integer.valueOf(jSONObject.optInt("mtu")), optString), new ib1.e0(appId, this, i17, service));
            return;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.JsApiSetBLEMtu", "bleWorker is disable, may not open ble");
        java.util.HashMap hashMap3 = new java.util.HashMap();
        hashMap3.put("errCode", 10001);
        java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
        hashMap3.put("errno", 1500102);
        service.a(i17, t("fail:not available", hashMap3));
        com.tencent.mm.plugin.appbrand.jsapi.bluetooth.l.b(27, 32);
    }
}
