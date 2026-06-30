package ib1;

/* loaded from: classes7.dex */
public final class h extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = 777;
    public static final java.lang.String NAME = "getBLEDeviceRSSI";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        if (lVar == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.JsApiGetBLEDeviceRSSI", "env is null", new java.lang.Object[0]);
            return;
        }
        if (jSONObject == null || !jSONObject.has("deviceId")) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.JsApiGetBLEDeviceRSSI", "data is null or do not have key: deviceId", new java.lang.Object[0]);
            java.util.Map l17 = kz5.c1.l(new jz5.l("errCode", 10013));
            java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
            l17.put("errno", 101);
            lVar.a(i17, t("fail:invalid data", l17));
            return;
        }
        java.lang.String appId = lVar.getAppId();
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.JsApiGetBLEDeviceRSSI", "appId: " + appId + ", data: " + jSONObject, new java.lang.Object[0]);
        com.tencent.mm.plugin.appbrand.jsapi.bluetooth.e b17 = com.tencent.mm.plugin.appbrand.jsapi.bluetooth.b.b(appId);
        if (b17 == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.JsApiGetBLEDeviceRSSI", "bleWorker is null", new java.lang.Object[0]);
            java.util.Map l18 = kz5.c1.l(new jz5.l("errCode", 10000));
            java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
            l18.put("errno", 1500101);
            lVar.a(i17, t("fail:not init", l18));
            return;
        }
        java.lang.String optString = jSONObject.optString("deviceId");
        if (optString != null) {
            b17.h(optString, new mb1.f(), new ib1.g(appId, this, i17, lVar));
            return;
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.JsApiGetBLEDeviceRSSI", "deviceId is null", new java.lang.Object[0]);
        java.util.Map l19 = kz5.c1.l(new jz5.l("errCode", 10013));
        java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
        l19.put("errno", 101);
        lVar.a(i17, t("fail:invalid data", l19));
    }
}
