package ib1;

/* loaded from: classes7.dex */
public class g0 extends com.tencent.mm.plugin.appbrand.jsapi.f {
    private static final int CTRL_INDEX = 176;
    private static final java.lang.String NAME = "startBluetoothDevicesDiscovery";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(final com.tencent.mm.plugin.appbrand.jsapi.l lVar, final org.json.JSONObject jSONObject, final int i17) {
        com.tencent.mm.plugin.appbrand.jsapi.bluetooth.l.a(11);
        if (jSONObject == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiStartBluetoothDevicesDiscovery", "startBluetoothDevicesDiscovery data is null");
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("errCode", 10013);
            java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
            hashMap.put("errno", 101);
            lVar.a(i17, t("fail:invalid data", hashMap));
            com.tencent.mm.plugin.appbrand.jsapi.bluetooth.l.b(13, 14);
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiStartBluetoothDevicesDiscovery", "appId:%s startBluetoothDevicesDiscovery data:%s", lVar.getAppId(), jSONObject);
        final com.tencent.mm.plugin.appbrand.jsapi.bluetooth.e b17 = com.tencent.mm.plugin.appbrand.jsapi.bluetooth.b.b(lVar.getAppId());
        if (b17 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiStartBluetoothDevicesDiscovery", "bleWorker is null, may not open ble");
            java.util.HashMap hashMap2 = new java.util.HashMap();
            hashMap2.put("errCode", 10000);
            java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
            hashMap2.put("errno", 1500101);
            lVar.a(i17, t("fail:not init", hashMap2));
            com.tencent.mm.plugin.appbrand.jsapi.bluetooth.l.b(13, 16);
            return;
        }
        if (qb1.b.b()) {
            if (android.os.Build.VERSION.SDK_INT >= 31) {
                com.tencent.mm.plugin.appbrand.utils.y.b(lVar, "android.permission.BLUETOOTH_SCAN", 144, "", "", new com.tencent.mm.plugin.appbrand.utils.y3() { // from class: ib1.g0$$a
                    @Override // com.tencent.mm.plugin.appbrand.utils.y3
                    public final void a(com.tencent.mm.plugin.appbrand.utils.i4 i4Var) {
                        java.lang.String str3;
                        java.lang.String str4;
                        ib1.g0 g0Var = ib1.g0.this;
                        g0Var.getClass();
                        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiStartBluetoothDevicesDiscovery", "onRequestPermissionResult, result: %s", i4Var);
                        int ordinal = i4Var.ordinal();
                        com.tencent.mm.plugin.appbrand.jsapi.l lVar2 = lVar;
                        int i18 = i17;
                        if (ordinal == 0) {
                            str3 = android.text.TextUtils.isEmpty(null) ? "fail:internal error" : null;
                            str4 = str3 != null ? str3 : "";
                            java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
                            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                            try {
                                jSONObject2.put("errno", 4);
                            } catch (java.lang.Exception e17) {
                                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
                            }
                            lVar2.a(i18, g0Var.u(str4, jSONObject2));
                            return;
                        }
                        if (ordinal == 1) {
                            g0Var.C(lVar2, jSONObject, i18, b17);
                            return;
                        }
                        if (ordinal != 2) {
                            return;
                        }
                        str3 = android.text.TextUtils.isEmpty(null) ? "fail:system permission denied" : null;
                        str4 = str3 != null ? str3 : "";
                        java.lang.String str6 = com.tencent.mm.sdk.platformtools.z.f193105a;
                        org.json.JSONObject jSONObject3 = new org.json.JSONObject();
                        try {
                            jSONObject3.put("errno", 3);
                        } catch (java.lang.Exception e18) {
                            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e18);
                        }
                        lVar2.a(i18, g0Var.u(str4, jSONObject3));
                    }
                });
                return;
            } else {
                C(lVar, jSONObject, i17, b17);
                return;
            }
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.JsApiStartBluetoothDevicesDiscovery", "adapter is null or not enabled!");
        java.util.HashMap hashMap3 = new java.util.HashMap();
        hashMap3.put("errCode", 10001);
        java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
        hashMap3.put("errno", 1500102);
        lVar.a(i17, t("fail:not available", hashMap3));
        com.tencent.mm.plugin.appbrand.jsapi.bluetooth.l.b(13, 18);
    }

    public final void C(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17, com.tencent.mm.plugin.appbrand.jsapi.bluetooth.e eVar) {
        java.util.ArrayList arrayList;
        boolean optBoolean = jSONObject.optBoolean("allowDuplicatesKey");
        int optInt = jSONObject.optInt("interval");
        java.lang.String optString = jSONObject.optString("powerLevel", ya.b.MEDIUM);
        com.tencent.mars.xlog.Log.i("MicroMsg.Ble.BleConfig", "isDefaultRefreshCache, defaultRefreshCache: " + kb1.b.f306216g);
        boolean optBoolean2 = jSONObject.optBoolean("refreshCache", kb1.b.f306216g);
        boolean optBoolean3 = jSONObject.optBoolean("scanWorkaround", true);
        if (jSONObject.has(com.tencent.mapsdk.internal.cm.a_)) {
            arrayList = new java.util.ArrayList();
            try {
                org.json.JSONArray jSONArray = new org.json.JSONArray(jSONObject.optString(com.tencent.mapsdk.internal.cm.a_));
                for (int i18 = 0; i18 < jSONArray.length(); i18++) {
                    arrayList.add(new com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.scan.ScanFilterCompat(null, null, android.os.ParcelUuid.fromString(jSONArray.getString(i18).toUpperCase()), null, null, null, null, -1, null, null, null));
                }
            } catch (java.lang.Exception unused) {
                com.tencent.mars.xlog.Log.e("MicroMsg.JsApiStartBluetoothDevicesDiscovery", "get uuid error!");
                java.util.HashMap hashMap = new java.util.HashMap();
                hashMap.put("isDiscovering", java.lang.Boolean.FALSE);
                hashMap.put("errCode", java.lang.Integer.valueOf(com.tencent.thumbplayer.tmediacodec.codec.CodecError.CONFIG_SURFACE_NOT_VALID));
                java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                hashMap.put("errno", 101);
                lVar.a(i17, t("fail:no service", hashMap));
                com.tencent.mm.plugin.appbrand.jsapi.bluetooth.l.a(13);
                return;
            }
        } else {
            arrayList = null;
        }
        kb1.a aVar = new kb1.a();
        aVar.f306210a = optInt;
        aVar.f306211b = optBoolean;
        aVar.f306212c = optString;
        aVar.f306213d = optBoolean2;
        aVar.f306214e = optBoolean3;
        kb1.b bVar = new kb1.b(aVar);
        if (eVar.i() != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Ble.BleManager", "initBleConfig:%s", bVar);
            synchronized (kb1.b.class) {
                kb1.b.f306215f = bVar;
            }
        }
        ib1.h0 h0Var = new ib1.h0(this, lVar, i17);
        ib1.i0 i0Var = new ib1.i0(this, lVar);
        kb1.c i19 = eVar.i();
        if (i19 != null) {
            pb1.i iVar = i19.f306223b;
            synchronized (iVar) {
                pb1.h hVar = new pb1.h(h0Var, arrayList, i0Var);
                iVar.f353150k = hVar;
                iVar.c(hVar);
            }
        }
        ib1.b0.u(lVar, true, true);
    }
}
