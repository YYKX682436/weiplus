package rd1;

/* loaded from: classes7.dex */
public final class a extends com.tencent.mm.plugin.appbrand.jsapi.f {
    private static final int CTRL_INDEX = -2;
    private static final java.lang.String NAME = "appendRuntimeContext";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        java.lang.String optString;
        java.lang.String str;
        java.lang.String str2;
        org.json.JSONObject jSONObject2;
        com.tencent.mm.plugin.appbrand.e9 e9Var = (com.tencent.mm.plugin.appbrand.e9) lVar;
        if (jSONObject != null) {
            try {
                optString = jSONObject.optString(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA);
            } catch (java.lang.Throwable th6) {
                if (e9Var != null) {
                    str = android.text.TextUtils.isEmpty(null) ? "ok" : null;
                    str2 = str != null ? str : "";
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                    org.json.JSONObject jSONObject3 = new org.json.JSONObject();
                    try {
                        jSONObject3.put("errno", 0);
                    } catch (java.lang.Exception e17) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
                    }
                    e9Var.a(i17, u(str2, jSONObject3));
                }
                throw th6;
            }
        } else {
            optString = null;
        }
        if (optString != null) {
            com.tencent.mm.plugin.appbrand.AppBrandRuntime runtime = e9Var != null ? e9Var.getRuntime() : null;
            com.tencent.mm.plugin.appbrand.o6 o6Var = runtime instanceof com.tencent.mm.plugin.appbrand.o6 ? (com.tencent.mm.plugin.appbrand.o6) runtime : null;
            com.tencent.mm.plugin.appbrand.report.quality.h1 h1Var = o6Var != null ? o6Var.R2 : null;
            if (h1Var != null) {
                h1Var.f88200b = optString;
            }
            if (e9Var == null) {
                return;
            }
            str = android.text.TextUtils.isEmpty(null) ? "ok" : null;
            str2 = str != null ? str : "";
            java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
            jSONObject2 = new org.json.JSONObject();
            try {
                jSONObject2.put("errno", 0);
            } catch (java.lang.Exception e18) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e18);
            }
        } else {
            if (e9Var == null) {
                return;
            }
            str = android.text.TextUtils.isEmpty(null) ? "ok" : null;
            str2 = str != null ? str : "";
            java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
            jSONObject2 = new org.json.JSONObject();
            try {
                jSONObject2.put("errno", 0);
            } catch (java.lang.Exception e19) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e19);
            }
        }
        e9Var.a(i17, u(str2, jSONObject2));
    }
}
