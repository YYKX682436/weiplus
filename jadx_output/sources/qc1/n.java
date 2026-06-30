package qc1;

/* loaded from: classes7.dex */
public final class n extends com.tencent.mm.plugin.appbrand.jsapi.f {
    private static final int CTRL_INDEX = 77;
    private static final java.lang.String NAME = "setKeyboardValue";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.Integer num;
        com.tencent.mm.plugin.appbrand.y yVar = (com.tencent.mm.plugin.appbrand.y) lVar;
        com.tencent.mm.plugin.appbrand.page.v5 a17 = com.tencent.mm.plugin.appbrand.jsapi.gg.a(yVar);
        if (a17 == null || !a17.isRunning()) {
            yVar.a(i17, o("fail current page not available"));
            return;
        }
        try {
            java.lang.String string = jSONObject.getString("value");
            try {
                num = java.lang.Integer.valueOf(jSONObject.getInt("cursor"));
            } catch (java.lang.Exception unused) {
                num = null;
            }
            java.util.Map map = com.tencent.mm.plugin.appbrand.widget.input.r1.f91641d;
            ik1.h0.b(new com.tencent.mm.plugin.appbrand.widget.input.n1(a17, string, num));
            str = android.text.TextUtils.isEmpty(null) ? "ok" : null;
            str2 = str != null ? str : "";
            java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            try {
                jSONObject2.put("errno", 0);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
            }
            yVar.a(i17, u(str2, jSONObject2));
        } catch (java.lang.Exception unused2) {
            str = android.text.TextUtils.isEmpty(null) ? "fail:jsapi invalid request data" : null;
            str2 = str != null ? str : "";
            java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
            org.json.JSONObject jSONObject3 = new org.json.JSONObject();
            try {
                jSONObject3.put("errno", 101);
            } catch (java.lang.Exception e18) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e18);
            }
            yVar.a(i17, u(str2, jSONObject3));
        }
    }
}
