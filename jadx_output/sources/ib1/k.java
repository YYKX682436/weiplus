package ib1;

/* loaded from: classes7.dex */
public class k extends com.tencent.mm.plugin.appbrand.jsapi.f {
    private static final int CTRL_INDEX = 175;
    private static final java.lang.String NAME = "getBluetoothAdapterState";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.tencent.mm.plugin.appbrand.jsapi.bluetooth.l.a(126);
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiGetBluetoothAdapterState", "appId:%s getBluetoothAdapterState", lVar.getAppId());
        com.tencent.mm.plugin.appbrand.jsapi.bluetooth.e b17 = com.tencent.mm.plugin.appbrand.jsapi.bluetooth.b.b(lVar.getAppId());
        if (b17 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiGetBluetoothAdapterState", "bleWorker is null, may not open ble");
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("errCode", 10000);
            java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
            hashMap.put("errno", 1500101);
            lVar.a(i17, t("fail:not init", hashMap));
            com.tencent.mm.plugin.appbrand.jsapi.bluetooth.l.b(128, 130);
            return;
        }
        boolean b18 = qb1.b.b();
        kb1.c i18 = b17.i();
        boolean z17 = i18 != null ? i18.f306223b.f353144e.get() : false;
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiGetBluetoothAdapterState", "availableState : " + b18 + ",discoveringState : " + z17);
        java.util.HashMap hashMap2 = new java.util.HashMap();
        hashMap2.put("available", java.lang.Boolean.valueOf(b18));
        hashMap2.put("discovering", java.lang.Boolean.valueOf(z17));
        java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
        hashMap2.put("errno", 0);
        lVar.a(i17, t("ok", hashMap2));
        com.tencent.mm.plugin.appbrand.jsapi.bluetooth.l.a(127);
    }
}
