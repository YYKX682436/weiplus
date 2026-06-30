package zd1;

/* loaded from: classes7.dex */
public final class t extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = -2;
    public static final java.lang.String NAME = "setSecuritySnapshotStrategy";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject data, int i17) {
        java.lang.String str;
        java.lang.String str2;
        com.tencent.mm.plugin.appbrand.service.c0 service = (com.tencent.mm.plugin.appbrand.service.c0) lVar;
        kotlin.jvm.internal.o.g(service, "service");
        kotlin.jvm.internal.o.g(data, "data");
        boolean optBoolean = data.optBoolean("enabledSnapshot", false);
        long optLong = data.optLong("snapshotIntervalMillis", 2000L);
        int optInt = data.optInt("shortEdge", 300);
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.JsApiSetSecuritySnapshotStrategy", "invoke(" + service.getAppId() + ") data:" + data);
        if (optInt <= 0) {
            str2 = android.text.TextUtils.isEmpty(null) ? "fail:jsapi invalid request data" : null;
            str = str2 != null ? str2 : "";
            java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                jSONObject.put("errno", 101);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
            }
            service.a(i17, u(str, jSONObject));
            return;
        }
        if (!optBoolean) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.JsApiSetSecuritySnapshotStrategy", "invoke(" + service.getAppId() + ") call stop()");
            zd1.a0 X2 = service.t3().X2();
            if (X2 != null) {
                X2.b(true);
            }
        } else {
            if (!wo.w0.q()) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.JsApiSetSecuritySnapshotStrategy", "not support in 32bit device");
                str2 = android.text.TextUtils.isEmpty(null) ? "fail forbidden" : null;
                str = str2 != null ? str2 : "";
                java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                try {
                    jSONObject2.put("errno", 0);
                } catch (java.lang.Exception e18) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e18);
                }
                service.a(i17, u(str, jSONObject2));
                return;
            }
            e42.e0 e0Var = (e42.e0) i95.n0.c(e42.e0.class);
            e42.d0 d0Var = e42.d0.clicfg_android_appbrand_security_detect_snapshot;
            java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
            if (!((h62.d) e0Var).fj(d0Var, false)) {
                java.lang.String str6 = android.text.TextUtils.isEmpty(null) ? "fail forbidden" : null;
                str = str6 != null ? str6 : "";
                org.json.JSONObject jSONObject3 = new org.json.JSONObject();
                try {
                    jSONObject3.put("errno", 0);
                } catch (java.lang.Exception e19) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e19);
                }
                service.a(i17, u(str, jSONObject3));
                return;
            }
            if (optLong <= 0) {
                java.lang.String str7 = android.text.TextUtils.isEmpty(null) ? "fail invalid snapshotIntervalMillis" : null;
                str = str7 != null ? str7 : "";
                org.json.JSONObject jSONObject4 = new org.json.JSONObject();
                try {
                    jSONObject4.put("errno", 0);
                } catch (java.lang.Exception e27) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e27);
                }
                service.a(i17, u(str, jSONObject4));
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.JsApiSetSecuritySnapshotStrategy", "invoke(" + service.getAppId() + ") call start()");
            zd1.a0 X22 = service.t3().X2();
            if (X22 != null) {
                X22.a(optLong, ik1.w.c(optInt));
            }
        }
        java.lang.String str8 = android.text.TextUtils.isEmpty(null) ? "ok" : null;
        str = str8 != null ? str8 : "";
        java.lang.String str9 = com.tencent.mm.sdk.platformtools.z.f193105a;
        org.json.JSONObject jSONObject5 = new org.json.JSONObject();
        try {
            jSONObject5.put("errno", 0);
        } catch (java.lang.Exception e28) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e28);
        }
        service.a(i17, u(str, jSONObject5));
    }
}
