package od1;

/* loaded from: classes7.dex */
public final class f extends com.tencent.mm.plugin.appbrand.jsapi.f {
    private static final int CTRL_INDEX = 1407;
    private static final java.lang.String NAME = "listenNewPerformanceMetric";

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r3v0, types: [kz5.p0] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.Collection, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v0, types: [com.tencent.mm.plugin.appbrand.jsapi.k0, od1.f] */
    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        ?? r37;
        java.lang.String str;
        org.json.JSONArray optJSONArray;
        com.tencent.mm.plugin.appbrand.e9 e9Var = (com.tencent.mm.plugin.appbrand.e9) lVar;
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiNewPerformanceMetric", "listenNewPerformanceMetric be used");
        if (e9Var == null) {
            return;
        }
        com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader x17 = e9Var.x();
        if (!com.tencent.mm.sdk.platformtools.t8.y(x17 != null ? x17.qe("supportListenNewPerformanceMetric") : null, false)) {
            str = android.text.TextUtils.isEmpty(null) ? "fail:jsapi not supported" : null;
            if (str == null) {
                str = "";
            }
            java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            try {
                jSONObject2.put("errno", 100);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
            }
            e9Var.a(i17, u(str, jSONObject2));
            return;
        }
        if (jSONObject == null || (optJSONArray = jSONObject.optJSONArray("names")) == null) {
            r37 = kz5.p0.f313996d;
        } else {
            int length = optJSONArray.length();
            r37 = new java.util.ArrayList(length);
            for (int i18 = 0; i18 < length; i18++) {
                r37.add(optJSONArray.optString(i18));
            }
        }
        if (e9Var.k(od1.i.class) == null) {
            synchronized (e9Var) {
                if (e9Var.k(od1.i.class) == null) {
                    e9Var.l(new od1.i());
                }
            }
        }
        od1.i iVar = (od1.i) e9Var.k(od1.i.class);
        if (iVar == null) {
            str = android.text.TextUtils.isEmpty(null) ? "fail:internal error" : null;
            if (str == null) {
                str = "";
            }
            java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
            org.json.JSONObject jSONObject3 = new org.json.JSONObject();
            try {
                jSONObject3.put("errno", 4);
            } catch (java.lang.Exception e18) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e18);
            }
            e9Var.a(i17, u(str, jSONObject3));
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiNewPerformanceMetric", "can not find instantiated object of NewPerformanceMetricStateManager from the provided AppBrandService instance.");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.NewPerformanceMetricStateManager", "setListenName:" + r37);
        java.util.HashSet hashSet = new java.util.HashSet();
        iVar.f344606d = hashSet;
        hashSet.addAll(r37);
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("cachePerformanceMetric", new org.json.JSONArray((java.util.Collection) iVar.f344607e));
        java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
        hashMap.put("errno", 0);
        java.lang.String t17 = t("ok", hashMap);
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiNewPerformanceMetric", "callback ok, content:" + t17);
        e9Var.a(i17, t17);
        iVar.f344607e.clear();
    }
}
