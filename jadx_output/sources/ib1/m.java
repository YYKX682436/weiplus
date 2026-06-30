package ib1;

/* loaded from: classes7.dex */
public class m extends com.tencent.mm.plugin.appbrand.jsapi.f {
    private static final int CTRL_INDEX = 179;
    private static final java.lang.String NAME = "getConnectedBluetoothDevices";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        java.util.ArrayList arrayList;
        java.util.List<ob1.f> list;
        com.tencent.mm.plugin.appbrand.jsapi.bluetooth.l.a(191);
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiGetConnectedBluetoothDevices", "getConnectedBluetoothDevices!");
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiGetConnectedBluetoothDevices", "appId:%s getConnectedBluetoothDevices data %s", lVar.getAppId(), jSONObject.toString());
        com.tencent.mm.plugin.appbrand.jsapi.bluetooth.e b17 = com.tencent.mm.plugin.appbrand.jsapi.bluetooth.b.b(lVar.getAppId());
        if (b17 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiGetConnectedBluetoothDevices", "bleWorker is null, may not open ble");
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("errCode", 10000);
            java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
            hashMap.put("errno", 1500101);
            lVar.a(i17, t("fail:not init", hashMap));
            com.tencent.mm.plugin.appbrand.jsapi.bluetooth.l.b(193, 195);
            return;
        }
        if (!qb1.b.b()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiGetConnectedBluetoothDevices", "adapter is null or not enabled!");
            java.util.HashMap hashMap2 = new java.util.HashMap();
            hashMap2.put("errCode", 10001);
            java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
            hashMap2.put("errno", 1500102);
            lVar.a(i17, t("fail:not available", hashMap2));
            com.tencent.mm.plugin.appbrand.jsapi.bluetooth.l.b(193, 197);
            return;
        }
        org.json.JSONArray optJSONArray = jSONObject.optJSONArray(com.tencent.mapsdk.internal.cm.a_);
        if (optJSONArray != null) {
            int length = optJSONArray.length();
            arrayList = new java.util.ArrayList(length);
            for (int i18 = 0; i18 < length; i18++) {
                java.lang.String optString = optJSONArray.optString(i18);
                if (optString != null) {
                    arrayList.add(optString);
                }
            }
        } else {
            arrayList = null;
        }
        boolean optBoolean = jSONObject.optBoolean("useOldImpl", false);
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiGetConnectedBluetoothDevices", "useOldImpl: " + optBoolean);
        kb1.c i19 = b17.i();
        if (i19 != null) {
            lb1.i iVar = i19.f306222a;
            if (optBoolean) {
                list = iVar.b(arrayList);
            } else {
                if (arrayList != null) {
                    iVar.getClass();
                    if (!arrayList.isEmpty()) {
                        list = iVar.b(arrayList);
                    }
                }
                list = iVar.c(lb1.h.f317706a);
            }
        } else {
            list = null;
        }
        if (list == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiGetConnectedBluetoothDevices", "bluetoothDevices is null!");
            java.lang.String str3 = android.text.TextUtils.isEmpty("fail:internal error") ? "fail:unknown Bluetooth error" : "fail:internal error";
            java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            try {
                jSONObject2.put("errno", 1510000);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
            }
            lVar.a(i17, u(str3, jSONObject2));
            com.tencent.mm.plugin.appbrand.jsapi.bluetooth.l.b(193, nd1.d1.CTRL_INDEX);
            return;
        }
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        for (ob1.f fVar : list) {
            java.lang.String str5 = fVar.f344008b;
            java.lang.String str6 = fVar.f344007a;
            org.json.JSONObject jSONObject3 = new org.json.JSONObject();
            try {
                jSONObject3.put("deviceId", str5);
                jSONObject3.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME, str6);
                jSONArray.put(jSONObject3);
            } catch (org.json.JSONException e18) {
                com.tencent.mars.xlog.Log.e("MicroMsg.JsApiGetConnectedBluetoothDevices", "put JSON data error : %s", e18);
            }
        }
        org.json.JSONObject jSONObject4 = new org.json.JSONObject();
        try {
            jSONObject4.put("devices", jSONArray);
        } catch (org.json.JSONException e19) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.JsApiGetConnectedBluetoothDevices", e19, "", new java.lang.Object[0]);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiGetConnectedBluetoothDevices", "retJson %s", jSONObject4.toString());
        java.lang.String str7 = android.text.TextUtils.isEmpty(null) ? "ok" : null;
        java.lang.String str8 = str7 != null ? str7 : "";
        java.lang.String str9 = com.tencent.mm.sdk.platformtools.z.f193105a;
        try {
            jSONObject4.put("errno", 0);
        } catch (java.lang.Exception e27) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e27);
        }
        lVar.a(i17, u(str8, jSONObject4));
        com.tencent.mm.plugin.appbrand.jsapi.bluetooth.l.a(192);
    }
}
