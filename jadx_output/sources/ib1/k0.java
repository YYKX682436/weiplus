package ib1;

/* loaded from: classes7.dex */
public class k0 extends com.tencent.mm.plugin.appbrand.jsapi.f {
    private static final int CTRL_INDEX = 177;
    private static final java.lang.String NAME = "stopBluetoothDevicesDiscovery";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.tencent.mm.plugin.appbrand.jsapi.bluetooth.l.a(101);
        java.lang.String appId = lVar.getAppId();
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = appId;
        java.lang.Object obj = jSONObject;
        if (jSONObject == null) {
            obj = "";
        }
        objArr[1] = obj;
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiStopBluetoothDevicesDiscovery", "appId:%s stopBluetoothDevicesDiscovery data:%s", objArr);
        com.tencent.mm.plugin.appbrand.jsapi.bluetooth.e b17 = com.tencent.mm.plugin.appbrand.jsapi.bluetooth.b.b(appId);
        if (b17 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiStopBluetoothDevicesDiscovery", "bleWorker is null, may not open ble");
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("errCode", 10000);
            java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
            hashMap.put("errno", 1500101);
            lVar.a(i17, t("fail:not init", hashMap));
            com.tencent.mm.plugin.appbrand.jsapi.bluetooth.l.b(103, 106);
            return;
        }
        if (!qb1.b.b()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiStopBluetoothDevicesDiscovery", "adapter is null or not enabled!");
            java.util.HashMap hashMap2 = new java.util.HashMap();
            hashMap2.put("errCode", 10001);
            java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
            hashMap2.put("errno", 1500102);
            lVar.a(i17, t("fail:not available", hashMap2));
            com.tencent.mm.plugin.appbrand.jsapi.bluetooth.l.b(103, 108);
            return;
        }
        kb1.c i18 = b17.i();
        ob1.m d17 = i18 != null ? i18.f306223b.d() : ob1.m.f344019f;
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiStopBluetoothDevicesDiscovery", "stopBleScan result:%s", d17);
        java.util.HashMap hashMap3 = new java.util.HashMap();
        if (d17.f344038a != 0) {
            hashMap3.put("isDiscovering", java.lang.Boolean.FALSE);
            java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
            hashMap3.put("errno", 1510000);
            lVar.a(i17, t("fail", hashMap3));
            com.tencent.mm.plugin.appbrand.jsapi.bluetooth.l.a(103);
            return;
        }
        hashMap3.put("isDiscovering", java.lang.Boolean.FALSE);
        java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
        hashMap3.put("errno", 0);
        lVar.a(i17, t("ok", hashMap3));
        com.tencent.mm.plugin.appbrand.jsapi.bluetooth.l.a(102);
        ib1.b0.u(lVar, true, false);
    }
}
