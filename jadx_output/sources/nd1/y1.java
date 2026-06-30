package nd1;

/* loaded from: classes7.dex */
public final class y1 extends com.tencent.mm.plugin.appbrand.jsapi.f {
    private static final int CTRL_INDEX = 1066;
    private static final java.lang.String NAME = "setVisualEffectOnCapture";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.tencent.mm.plugin.appbrand.utils.o4 o4Var;
        java.lang.String str;
        java.lang.String str2;
        com.tencent.mm.plugin.appbrand.y yVar = (com.tencent.mm.plugin.appbrand.y) lVar;
        if (yVar == null) {
            return;
        }
        java.lang.String optString = jSONObject != null ? jSONObject.optString("visualEffect", com.tencent.mm.plugin.lite.LiteAppCenter.FRAMEWORK_TYPE_NONE) : null;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.JsApiSetVisualEffectOnCapture", "invoke, visualEffect: " + optString);
        com.tencent.mm.plugin.appbrand.AppBrandRuntime runtime = yVar.getRuntime();
        if (runtime == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.SafeScreenShotRecordSwitcher", "get, runtime is null");
            o4Var = null;
        } else {
            o4Var = runtime.T1;
        }
        if (o4Var == null) {
            str = android.text.TextUtils.isEmpty(null) ? "fail:internal error" : null;
            str2 = str != null ? str : "";
            java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            try {
                jSONObject2.put("errno", 4);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
            }
            yVar.a(i17, u(str2, jSONObject2));
            return;
        }
        if (kotlin.jvm.internal.o.b(optString, "hidden")) {
            ((ku5.t0) ku5.t0.f312615d).B(new nd1.w1(o4Var));
            str = android.text.TextUtils.isEmpty(null) ? "ok" : null;
            str2 = str != null ? str : "";
            java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
            org.json.JSONObject jSONObject3 = new org.json.JSONObject();
            try {
                jSONObject3.put("errno", 0);
            } catch (java.lang.Exception e18) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e18);
            }
            yVar.a(i17, u(str2, jSONObject3));
            return;
        }
        if (!kotlin.jvm.internal.o.b(optString, com.tencent.mm.plugin.lite.LiteAppCenter.FRAMEWORK_TYPE_NONE)) {
            str = android.text.TextUtils.isEmpty(null) ? "fail:jsapi invalid request data" : null;
            str2 = str != null ? str : "";
            java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
            org.json.JSONObject jSONObject4 = new org.json.JSONObject();
            try {
                jSONObject4.put("errno", 101);
            } catch (java.lang.Exception e19) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e19);
            }
            yVar.a(i17, u(str2, jSONObject4));
            return;
        }
        ((ku5.t0) ku5.t0.f312615d).B(new nd1.x1(o4Var));
        str = android.text.TextUtils.isEmpty(null) ? "ok" : null;
        str2 = str != null ? str : "";
        java.lang.String str6 = com.tencent.mm.sdk.platformtools.z.f193105a;
        org.json.JSONObject jSONObject5 = new org.json.JSONObject();
        try {
            jSONObject5.put("errno", 0);
        } catch (java.lang.Exception e27) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e27);
        }
        yVar.a(i17, u(str2, jSONObject5));
    }
}
