package ib1;

/* loaded from: classes7.dex */
public class t extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = 173;
    public static final java.lang.String NAME = "openBluetoothAdapter";

    /* renamed from: g, reason: collision with root package name */
    public boolean f290083g = false;

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(final com.tencent.mm.plugin.appbrand.jsapi.l lVar, final org.json.JSONObject jSONObject, final int i17) {
        com.tencent.mm.plugin.appbrand.jsapi.bluetooth.l.a(0);
        java.lang.String appId = lVar.getAppId();
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiOpenBluetoothAdapter", "appid:%s openBluetoothAdapter!", appId);
        if (android.os.Build.VERSION.SDK_INT < 31) {
            C(lVar, jSONObject, i17, appId);
        } else if (this.f290083g) {
            D(nf.t.b(lVar.getContext(), lVar, "android.permission.BLUETOOTH_CONNECT") ? com.tencent.mm.plugin.appbrand.utils.i4.f90479e : com.tencent.mm.plugin.appbrand.utils.i4.f90480f, lVar, jSONObject, i17);
        } else {
            com.tencent.mm.plugin.appbrand.utils.y.b(lVar, "android.permission.BLUETOOTH_CONNECT", 144, "", "", new com.tencent.mm.plugin.appbrand.utils.y3() { // from class: ib1.t$$a
                @Override // com.tencent.mm.plugin.appbrand.utils.y3
                public final void a(com.tencent.mm.plugin.appbrand.utils.i4 i4Var) {
                    ib1.t tVar = ib1.t.this;
                    tVar.getClass();
                    com.tencent.mars.xlog.Log.i("MicroMsg.JsApiOpenBluetoothAdapter", "onRequestPermissionResult, result: %s", i4Var);
                    tVar.f290083g = true;
                    tVar.D(i4Var, lVar, jSONObject, i17);
                }
            });
        }
    }

    public final void C(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17, java.lang.String str) {
        ob1.m mVar;
        ib1.u uVar = new ib1.u(this, lVar);
        ib1.v vVar = new ib1.v(this, lVar);
        ib1.w wVar = new ib1.w(this, lVar);
        ib1.x xVar = new ib1.x(this, lVar);
        java.util.Map map = com.tencent.mm.plugin.appbrand.jsapi.bluetooth.b.f80046a;
        synchronized (com.tencent.mm.plugin.appbrand.jsapi.bluetooth.b.class) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Ble.BleManager", "open appId:%s", str);
            if (qb1.b.c()) {
                java.util.Map map2 = com.tencent.mm.plugin.appbrand.jsapi.bluetooth.b.f80046a;
                if (((java.util.HashMap) map2).containsKey(str)) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.Ble.BleManager", "already open appId:%s", str);
                } else {
                    com.tencent.mm.plugin.appbrand.jsapi.bluetooth.e eVar = new com.tencent.mm.plugin.appbrand.jsapi.bluetooth.e(str);
                    synchronized (eVar) {
                        kb1.c cVar = new kb1.c(com.tencent.mm.sdk.platformtools.x2.f193071a);
                        eVar.f80058f = cVar;
                        cVar.a();
                        eVar.f80058f.f306222a.f317709c = new com.tencent.mm.plugin.appbrand.jsapi.bluetooth.c(eVar);
                    }
                    ((java.util.concurrent.CopyOnWriteArrayList) eVar.f80059g).add(uVar);
                    ((java.util.concurrent.CopyOnWriteArrayList) eVar.f80060h).add(vVar);
                    kb1.c i18 = eVar.i();
                    if (i18 != null) {
                        i18.f306222a.f317710d = wVar;
                    }
                    kb1.c i19 = eVar.i();
                    if (i19 != null) {
                        i19.f306222a.f317711e = xVar;
                    }
                    ((java.util.HashMap) map2).put(str, eVar);
                    com.tencent.mm.plugin.appbrand.x0.a(str, eVar);
                    com.tencent.mm.plugin.appbrand.jsapi.bluetooth.g.f80069a.a(str, eVar);
                    com.tencent.mm.plugin.appbrand.jsapi.bluetooth.b.c();
                }
                if (qb1.b.b()) {
                    mVar = ob1.m.f344018e;
                } else {
                    com.tencent.mars.xlog.Log.e("MicroMsg.Ble.BleManager", "bluetooth not enable, err");
                    mVar = ob1.m.f344022i;
                }
            } else {
                com.tencent.mars.xlog.Log.e("MicroMsg.Ble.BleManager", "api version is below 18");
                mVar = ob1.m.f344028o;
            }
        }
        ob1.m E = E(lVar, mVar);
        java.util.HashMap hashMap = new java.util.HashMap();
        int i27 = E.f344038a;
        if (i27 == 0) {
            if (jSONObject != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.JsApiOpenBluetoothAdapter", "doSomeGlobalConfigAfterOpenBluetoothAdapter, data: " + jSONObject);
                if (jSONObject.has("refreshCache")) {
                    try {
                        boolean z17 = jSONObject.getBoolean("refreshCache");
                        com.tencent.mars.xlog.Log.i("MicroMsg.Ble.BleConfig", "setDefaultRefreshCache, defaultRefreshCache: " + z17);
                        kb1.b.f306216g = z17;
                    } catch (org.json.JSONException unused) {
                    }
                }
            }
            java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
            hashMap.put("errno", 0);
            lVar.a(i17, t("ok", hashMap));
            com.tencent.mm.plugin.appbrand.jsapi.bluetooth.l.a(1);
            return;
        }
        if (i27 == 10001) {
            hashMap.put("errCode", 10001);
            java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
            hashMap.put("errno", 1500102);
            lVar.a(i17, t("fail:not available", hashMap));
            com.tencent.mm.plugin.appbrand.jsapi.bluetooth.l.b(2, 7);
            return;
        }
        if (i27 != 10009) {
            hashMap.put("errCode", java.lang.Integer.valueOf(i27));
            lVar.a(i17, q(E.f344039b, E.f344040c, hashMap));
            com.tencent.mm.plugin.appbrand.jsapi.bluetooth.l.a(2);
        } else {
            hashMap.put("errCode", 10009);
            java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
            hashMap.put("errno", 1500105);
            lVar.a(i17, t("fail:system not support", hashMap));
            com.tencent.mm.plugin.appbrand.jsapi.bluetooth.l.b(2, 8);
        }
    }

    public final void D(com.tencent.mm.plugin.appbrand.utils.i4 i4Var, com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        java.lang.String str;
        java.lang.String str2;
        int ordinal = i4Var.ordinal();
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
            lVar.a(i17, u(str2, jSONObject2));
            return;
        }
        if (ordinal == 1) {
            C(lVar, jSONObject, i17, lVar.getAppId());
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
        lVar.a(i17, u(str2, jSONObject3));
    }

    public ob1.m E(com.tencent.mm.plugin.appbrand.jsapi.l lVar, ob1.m mVar) {
        return mVar;
    }
}
