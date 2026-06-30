package xc1;

/* loaded from: classes7.dex */
public final class f extends com.tencent.mm.plugin.appbrand.jsapi.f {
    private static final int CTRL_INDEX = 1145;
    private static final java.lang.String NAME = "callbackDataToNative";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        java.lang.String str;
        java.lang.String str2;
        com.tencent.mm.plugin.appbrand.AppBrandRuntime runtime;
        com.tencent.mm.plugin.appbrand.y yVar = (com.tencent.mm.plugin.appbrand.y) lVar;
        if (jSONObject == null || jSONObject.length() <= 0) {
            if (yVar != null) {
                str = android.text.TextUtils.isEmpty(null) ? "fail:invalid data" : null;
                str2 = str != null ? str : "";
                java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                try {
                    jSONObject2.put("errno", 0);
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
                }
                yVar.a(i17, u(str2, jSONObject2));
                return;
            }
            return;
        }
        if (yVar == null || (runtime = yVar.getRuntime()) == null) {
            if (yVar != null) {
                str = android.text.TextUtils.isEmpty(null) ? "fail:internal error" : null;
                str2 = str != null ? str : "";
                java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
                org.json.JSONObject jSONObject3 = new org.json.JSONObject();
                try {
                    jSONObject3.put("errno", 4);
                } catch (java.lang.Exception e18) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e18);
                }
                yVar.a(i17, u(str2, jSONObject3));
                return;
            }
            return;
        }
        java.lang.String jSONObject4 = jSONObject.toString();
        kotlin.jvm.internal.o.f(jSONObject4, "toString(...)");
        java.lang.String str5 = runtime.f74803n;
        kotlin.jvm.internal.o.f(str5, "getAppId(...)");
        uk0.a.b(new com.tencent.mm.plugin.appbrand.jsapi.native_navigator.NativeDataChannel$WxaToNative$CallbackDataToNativeMessage(str5, jSONObject4), new xc1.q(), null);
        if (!com.tencent.mm.sdk.platformtools.x2.n()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.NativeDataChannel", "callbackDataToNative, in appbrand process, notify again");
            xc1.s sVar = xc1.s.f453057a;
            java.lang.String str6 = runtime.f74803n;
            kotlin.jvm.internal.o.f(str6, "getAppId(...)");
            sVar.a(str6, jSONObject4);
        }
        str = android.text.TextUtils.isEmpty(null) ? "ok" : null;
        str2 = str != null ? str : "";
        java.lang.String str7 = com.tencent.mm.sdk.platformtools.z.f193105a;
        org.json.JSONObject jSONObject5 = new org.json.JSONObject();
        try {
            jSONObject5.put("errno", 0);
        } catch (java.lang.Exception e19) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e19);
        }
        yVar.a(i17, u(str2, jSONObject5));
    }
}
