package zd1;

/* loaded from: classes7.dex */
public final class p extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = -2;
    public static final java.lang.String NAME = "setAcquireWebviewDom";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        java.lang.String[] strArr;
        zd1.c cVar;
        java.lang.String str;
        java.lang.String str2;
        of1.w1 s37;
        com.tencent.mm.plugin.appbrand.service.c0 c0Var = (com.tencent.mm.plugin.appbrand.service.c0) lVar;
        if (c0Var == null) {
            return;
        }
        jz5.g gVar = zd1.c.f471527f;
        if (jSONObject == null) {
            cVar = null;
        } else {
            boolean optBoolean = jSONObject.optBoolean("enableAcquireWebviewDom", false);
            if (optBoolean) {
                org.json.JSONArray optJSONArray = jSONObject.optJSONArray("type");
                if (optJSONArray != null) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    c75.c.d(optJSONArray, new zd1.b(arrayList));
                    strArr = (java.lang.String[]) arrayList.toArray(new java.lang.String[0]);
                } else {
                    strArr = null;
                }
                if (strArr == null) {
                    strArr = new java.lang.String[0];
                }
                cVar = new zd1.c(optBoolean, strArr);
            } else {
                cVar = (zd1.c) ((jz5.n) zd1.c.f471527f).getValue();
            }
        }
        if (cVar == null) {
            str = android.text.TextUtils.isEmpty(null) ? "fail:jsapi invalid request data" : null;
            str2 = str != null ? str : "";
            java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            try {
                jSONObject2.put("errno", 101);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
            }
            c0Var.a(i17, u(str2, jSONObject2));
            return;
        }
        com.tencent.mm.plugin.appbrand.o6 t37 = c0Var.t3();
        if (t37 != null) {
            t37.N1(cVar, true);
        }
        com.tencent.mm.plugin.appbrand.page.n7 V0 = c0Var.V0();
        if (V0 != null && (s37 = V0.s3()) != null) {
            s37.t0(s37.f345039m);
        }
        str = android.text.TextUtils.isEmpty(null) ? "ok" : null;
        str2 = str != null ? str : "";
        java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
        org.json.JSONObject jSONObject3 = new org.json.JSONObject();
        try {
            jSONObject3.put("errno", 0);
        } catch (java.lang.Exception e18) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e18);
        }
        c0Var.a(i17, u(str2, jSONObject3));
    }
}
