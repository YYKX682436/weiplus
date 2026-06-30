package ib1;

/* loaded from: classes7.dex */
public class j extends com.tencent.mm.plugin.appbrand.jsapi.f {
    private static final int CTRL_INDEX = 182;
    private static final java.lang.String NAME = "getBLEDeviceServices";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.tencent.mm.plugin.appbrand.jsapi.bluetooth.l.a(136);
        if (jSONObject == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiGetBLEDeviceServices", "getBLEDeviceServices data is null");
            java.lang.String str = android.text.TextUtils.isEmpty("fail:invalid data") ? "fail:jsapi invalid request data" : "fail:invalid data";
            java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            try {
                jSONObject2.put("errno", 101);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
            }
            lVar.a(i17, u(str, jSONObject2));
            com.tencent.mm.plugin.appbrand.jsapi.bluetooth.l.b(138, 139);
            return;
        }
        java.lang.String appId = lVar.getAppId();
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiGetBLEDeviceServices", "appId:%s getBLEDeviceServices data %s", appId, jSONObject.toString());
        com.tencent.mm.plugin.appbrand.jsapi.bluetooth.e b17 = com.tencent.mm.plugin.appbrand.jsapi.bluetooth.b.b(lVar.getAppId());
        if (b17 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiGetBLEDeviceServices", "bleWorker is null, may not open ble");
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("errCode", 10000);
            java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
            hashMap.put("errno", 1500101);
            lVar.a(i17, t("fail:not init", hashMap));
            com.tencent.mm.plugin.appbrand.jsapi.bluetooth.l.b(138, 141);
            return;
        }
        if (qb1.b.b()) {
            java.lang.String optString = jSONObject.optString("deviceId");
            boolean optBoolean = jSONObject.optBoolean("doDiscover", false);
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiGetBLEDeviceServices", "deviceId: %s, doDiscover: %b", optString, java.lang.Boolean.valueOf(optBoolean));
            if (optBoolean) {
                b17.h(optString, new mb1.e(optString), new ib1.i(this, appId, b17, optString, lVar, i17));
                return;
            } else {
                C(lVar, i17, b17.j(optString, true));
                return;
            }
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.JsApiGetBLEDeviceServices", "adapter is null or not enabled!");
        java.util.HashMap hashMap2 = new java.util.HashMap();
        hashMap2.put("errCode", 10001);
        java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
        hashMap2.put("errno", 1500102);
        lVar.a(i17, t("fail:not available", hashMap2));
        com.tencent.mm.plugin.appbrand.jsapi.bluetooth.l.b(138, 145);
    }

    public final void C(com.tencent.mm.plugin.appbrand.jsapi.l lVar, int i17, java.util.List list) {
        java.util.HashMap hashMap = new java.util.HashMap();
        if (list == null || list.size() <= 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiGetBLEDeviceServices", "not found services");
            hashMap.put("errCode", java.lang.Integer.valueOf(com.tencent.thumbplayer.tmediacodec.codec.CodecError.CONFIG_SURFACE_NOT_VALID));
            java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
            hashMap.put("errno", 1500103);
            lVar.a(i17, t("fail:no service", hashMap));
            com.tencent.mm.plugin.appbrand.jsapi.bluetooth.l.b(138, 144);
            return;
        }
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            ob1.g gVar = (ob1.g) it.next();
            if (com.tencent.mm.sdk.platformtools.t8.K0(gVar.f344015a)) {
                com.tencent.mars.xlog.Log.e("MicroMsg.JsApiGetBLEDeviceServices", "get uuid is null");
            } else {
                try {
                    if (gVar.f344017c == null) {
                        org.json.JSONObject jSONObject = new org.json.JSONObject();
                        gVar.f344017c = jSONObject;
                        jSONObject.put("uuid", gVar.f344015a);
                        gVar.f344017c.put("isPrimary", gVar.f344016b);
                    }
                    jSONArray.put(gVar.f344017c);
                } catch (org.json.JSONException e17) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.JsApiGetBLEDeviceServices", "JSONException %s", e17.getMessage());
                }
            }
        }
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        try {
            jSONObject2.put(com.tencent.mapsdk.internal.cm.a_, jSONArray);
            jSONObject2.put("errCode", 0);
        } catch (org.json.JSONException e18) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.JsApiGetBLEDeviceServices", e18, "", new java.lang.Object[0]);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiGetBLEDeviceServices", "retJson %s", jSONObject2.toString());
        java.lang.String str2 = android.text.TextUtils.isEmpty(null) ? "ok" : null;
        java.lang.String str3 = str2 != null ? str2 : "";
        java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
        try {
            jSONObject2.put("errno", 0);
        } catch (java.lang.Exception e19) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e19);
        }
        lVar.a(i17, u(str3, jSONObject2));
        com.tencent.mm.plugin.appbrand.jsapi.bluetooth.l.a(137);
    }
}
