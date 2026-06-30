package ib1;

/* loaded from: classes7.dex */
public class e extends com.tencent.mm.plugin.appbrand.jsapi.f {
    private static final int CTRL_INDEX = 180;
    private static final java.lang.String NAME = "createBLEConnection";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.tencent.mm.plugin.appbrand.jsapi.bluetooth.l.a(25);
        if (jSONObject == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiCreateBLEConnection", "createBLEConnection data is null, err");
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("errCode", 10013);
            java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
            hashMap.put("errno", 101);
            lVar.a(i17, t("fail:invalid data", hashMap));
            return;
        }
        java.lang.String appId = lVar.getAppId();
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiCreateBLEConnection", "appId:%s createBLEConnection data %s", appId, jSONObject.toString());
        com.tencent.mm.plugin.appbrand.jsapi.bluetooth.e b17 = com.tencent.mm.plugin.appbrand.jsapi.bluetooth.b.b(lVar.getAppId());
        if (b17 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiCreateBLEConnection", "bleWorker is null, may not open ble");
            java.util.HashMap hashMap2 = new java.util.HashMap();
            hashMap2.put("errCode", 10000);
            java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
            hashMap2.put("errno", 1500101);
            lVar.a(i17, t("fail:not init", hashMap2));
            com.tencent.mm.plugin.appbrand.jsapi.bluetooth.l.b(27, 30);
            return;
        }
        if (!qb1.b.b()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiCreateBLEConnection", "bleWorker is disable, may not open ble");
            java.util.HashMap hashMap3 = new java.util.HashMap();
            hashMap3.put("errCode", 10001);
            java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
            hashMap3.put("errno", 1500102);
            lVar.a(i17, t("fail:not available", hashMap3));
            com.tencent.mm.plugin.appbrand.jsapi.bluetooth.l.b(27, 32);
            return;
        }
        boolean optBoolean = jSONObject.optBoolean("debug", false);
        boolean optBoolean2 = jSONObject.optBoolean("mainThread", true);
        boolean optBoolean3 = jSONObject.optBoolean("autoConnect", false);
        java.lang.String optString = jSONObject.optString("transport", "LE");
        long optLong = jSONObject.optLong("discoverDelay", 0L);
        java.lang.String optString2 = jSONObject.optString("connectionPriority", null);
        java.lang.String optString3 = jSONObject.optString("deviceId");
        boolean optBoolean4 = jSONObject.optBoolean("doDiscover", true);
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiCreateBLEConnection", "deviceId: %s, doDiscover: %b", optString3, java.lang.Boolean.valueOf(optBoolean4));
        mb1.d dVar = new mb1.d(optString3);
        dVar.f343991f = optBoolean;
        dVar.f343992g = optBoolean2;
        dVar.f325300o = optBoolean3;
        dVar.f325301p = optString;
        dVar.f325302q = optLong;
        dVar.f325303r = optString2;
        dVar.f325304s = optBoolean4;
        b17.h(optString3, dVar, new ib1.d(this, appId, lVar, i17, optString3));
    }

    public void C(com.tencent.mm.plugin.appbrand.jsapi.l lVar, java.lang.String str, boolean z17) {
    }
}
