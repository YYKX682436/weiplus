package le1;

/* loaded from: classes.dex */
public final class h extends com.tencent.mm.plugin.appbrand.jsapi.f {
    private static final int CTRL_INDEX = 1550;
    private static final java.lang.String NAME = "setHalfScreenState";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        java.lang.String str;
        com.tencent.mm.plugin.appbrand.y yVar = (com.tencent.mm.plugin.appbrand.y) lVar;
        if (yVar == null) {
            return;
        }
        if (!(yVar.getRuntime() instanceof com.tencent.mm.plugin.appbrand.o6)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.JsApiSetHalfScreenState", "env.runtime !is AppBrandRuntimeWC");
            str = android.text.TextUtils.isEmpty(null) ? "fail:internal error" : null;
            if (str == null) {
                str = "";
            }
            java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            try {
                jSONObject2.put("errno", 4);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
            }
            yVar.a(i17, u(str, jSONObject2));
            return;
        }
        com.tencent.mm.plugin.appbrand.AppBrandRuntime runtime = yVar.getRuntime();
        kotlin.jvm.internal.o.e(runtime, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC");
        com.tencent.mm.plugin.appbrand.o6 o6Var = (com.tencent.mm.plugin.appbrand.o6) runtime;
        if (o6Var.Q0()) {
            ((ku5.t0) ku5.t0.f312615d).B(new le1.g(o6Var, jSONObject != null ? jSONObject.optBoolean("forceForbidDragExpand", false) : false, yVar, i17, this));
            return;
        }
        str = android.text.TextUtils.isEmpty("fail:not currently a half-screen app") ? "fail:internal error" : "fail:not currently a half-screen app";
        java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
        org.json.JSONObject jSONObject3 = new org.json.JSONObject();
        try {
            jSONObject3.put("errno", 4);
        } catch (java.lang.Exception e18) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e18);
        }
        yVar.a(i17, u(str, jSONObject3));
    }
}
