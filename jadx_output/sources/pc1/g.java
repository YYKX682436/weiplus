package pc1;

/* loaded from: classes7.dex */
public class g extends com.tencent.mm.plugin.appbrand.jsapi.f {
    private static final int CTRL_INDEX = 221;
    private static final java.lang.String NAME = "startBeaconDiscovery";

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.v0 f353351g = null;

    /* renamed from: h, reason: collision with root package name */
    public pc1.c f353352h;

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(final com.tencent.mm.plugin.appbrand.jsapi.l lVar, final org.json.JSONObject jSONObject, final int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiStartBeaconDiscovery", "startBeaconDiscovery data %s", jSONObject);
        if (android.os.Build.VERSION.SDK_INT >= 31) {
            com.tencent.mm.plugin.appbrand.utils.y.b(lVar, "android.permission.BLUETOOTH_SCAN", 144, "", "", new com.tencent.mm.plugin.appbrand.utils.y3() { // from class: pc1.g$$a
                @Override // com.tencent.mm.plugin.appbrand.utils.y3
                public final void a(com.tencent.mm.plugin.appbrand.utils.i4 i4Var) {
                    java.lang.String str;
                    java.lang.String str2;
                    pc1.g gVar = pc1.g.this;
                    gVar.getClass();
                    com.tencent.mars.xlog.Log.i("MicroMsg.JsApiStartBeaconDiscovery", "onRequestPermissionResult, result: %s", i4Var);
                    int ordinal = i4Var.ordinal();
                    com.tencent.mm.plugin.appbrand.jsapi.l lVar2 = lVar;
                    int i18 = i17;
                    if (ordinal == 0) {
                        str = android.text.TextUtils.isEmpty(null) ? "fail:internal error" : null;
                        str2 = str != null ? str : "";
                        java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                        try {
                            jSONObject2.put("errno", 4);
                        } catch (java.lang.Exception e17) {
                            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
                        }
                        lVar2.a(i18, gVar.u(str2, jSONObject2));
                        return;
                    }
                    if (ordinal == 1) {
                        gVar.C(lVar2, jSONObject, i18);
                        return;
                    }
                    if (ordinal != 2) {
                        return;
                    }
                    str = android.text.TextUtils.isEmpty(null) ? "fail:system permission denied" : null;
                    str2 = str != null ? str : "";
                    java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
                    org.json.JSONObject jSONObject3 = new org.json.JSONObject();
                    try {
                        jSONObject3.put("errno", 3);
                    } catch (java.lang.Exception e18) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e18);
                    }
                    lVar2.a(i18, gVar.u(str2, jSONObject3));
                }
            });
        } else {
            C(lVar, jSONObject, i17);
        }
    }

    public final void C(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        boolean z17;
        nm5.b c17;
        java.util.UUID[] uuidArr = null;
        if (jSONObject.has("uuids")) {
            try {
                org.json.JSONArray jSONArray = new org.json.JSONArray(jSONObject.optString("uuids"));
                uuidArr = new java.util.UUID[jSONArray.length()];
                for (int i18 = 0; i18 < jSONArray.length(); i18++) {
                    uuidArr[i18] = java.util.UUID.fromString(jSONArray.getString(i18));
                }
            } catch (org.json.JSONException unused) {
                com.tencent.mars.xlog.Log.e("MicroMsg.JsApiStartBeaconDiscovery", "get uuid error!");
            }
        }
        if (uuidArr == null || uuidArr.length <= 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiStartBeaconDiscovery", "serviceUuids is empty");
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("errCode", 11006);
            lVar.a(i17, p("fail:invalid data", hashMap));
            return;
        }
        java.lang.String appId = lVar.getAppId();
        java.lang.String appId2 = lVar.getAppId();
        java.util.Map map = pc1.e.f353348a;
        pc1.d dVar = (pc1.d) ((java.util.concurrent.ConcurrentHashMap) map).get(appId2);
        if (dVar == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiStartBeaconDiscovery", "beaconWorker init");
            dVar = new pc1.d();
            ((java.util.concurrent.ConcurrentHashMap) map).put(appId, dVar);
            if (pc1.e.f353349b == null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.BeaconManager", "bluetoothStateListener init");
                pc1.e.f353349b = new pc1.a();
                com.tencent.mm.sdk.platformtools.x2.f193071a.registerReceiver(pc1.e.f353349b, new android.content.IntentFilter("android.bluetooth.adapter.action.STATE_CHANGED"));
            }
        }
        if (this.f353352h == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiStartBeaconDiscovery", "onBeaconScanCallback init");
            this.f353352h = new pc1.h(this, lVar);
        }
        if (this.f353351g == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiStartBeaconDiscovery", "listener init");
            this.f353351g = new pc1.i(this, lVar);
            com.tencent.mm.plugin.appbrand.x0.a(lVar.getAppId(), this.f353351g);
        }
        dVar.f353342c = uuidArr;
        dVar.f353343d = this.f353352h;
        com.tencent.mars.xlog.Log.i("MicroMsg.BeaconManager", "BeaconWorker:%d start", java.lang.Integer.valueOf(dVar.hashCode()));
        synchronized (dVar) {
            z17 = dVar.f353344e;
        }
        if (z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.BeaconManager", "BeaconWorker:%d, already start", java.lang.Integer.valueOf(dVar.hashCode()));
            c17 = nm5.j.c(11003, "fail:already start");
        } else if (fp.h.a(18)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.BeaconManager", "API version is below 18!");
            c17 = nm5.j.c(11000, "fail:not support");
        } else {
            android.bluetooth.BluetoothAdapter bluetoothAdapter = dVar.f353340a;
            if (bluetoothAdapter == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.BeaconManager", "bluetoothAdapter is null!");
                c17 = nm5.j.c(11001, "fail:bluetooth service is unavailable");
            } else if (!bluetoothAdapter.isEnabled()) {
                com.tencent.mars.xlog.Log.e("MicroMsg.BeaconManager", "bluetoothAdapter is not enabled!");
                c17 = nm5.j.c(11001, "fail:bluetooth service is unavailable");
            } else if (dVar.f353340a.isDiscovering()) {
                com.tencent.mars.xlog.Log.e("MicroMsg.BeaconManager", "bluetoothAdapter is Discovering!");
                c17 = nm5.j.c(11003, "fail:already start");
            } else {
                ((java.util.concurrent.ConcurrentHashMap) dVar.f353341b).clear();
                com.tencent.mars.xlog.Log.i("MicroMsg.BeaconManager", "[BluetoothTrace] start scan");
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.BeaconManager", new java.lang.Throwable(), "[BluetoothTrace] ble scan stacktrace", new java.lang.Object[0]);
                android.bluetooth.BluetoothAdapter bluetoothAdapter2 = dVar.f353340a;
                android.bluetooth.BluetoothAdapter.LeScanCallback leScanCallback = dVar.f353347h;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(leScanCallback);
                java.util.Collections.reverse(arrayList);
                boolean booleanValue = ((java.lang.Boolean) yj0.a.k(bluetoothAdapter2, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/jsapi/ibeacon/BeaconManager$BeaconWorker", "start", "()Lcom/tencent/mm/vending/tuple/Tuple2;", "android/bluetooth/BluetoothAdapter", "startLeScan", "(Landroid/bluetooth/BluetoothAdapter$LeScanCallback;)Z")).booleanValue();
                com.tencent.mars.xlog.Log.i("MicroMsg.BeaconManager", "startLeScan:%b", java.lang.Boolean.valueOf(booleanValue));
                if (booleanValue) {
                    dVar.f353344e = true;
                    c17 = nm5.j.c(0, "");
                } else {
                    c17 = nm5.j.c(11005, "fail:system error");
                }
            }
        }
        java.util.HashMap hashMap2 = new java.util.HashMap();
        hashMap2.put("errCode", c17.a(0));
        lVar.a(i17, p(((java.lang.Integer) c17.a(0)).intValue() == 0 ? "ok" : (java.lang.String) c17.a(1), hashMap2));
    }
}
