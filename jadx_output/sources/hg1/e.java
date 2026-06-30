package hg1;

/* loaded from: classes7.dex */
public class e extends hg1.d implements tf1.k {
    private static final int CTRL_INDEX = 536;
    public static final java.lang.String NAME = "insertXWebVideo";

    @Override // com.tencent.mm.plugin.appbrand.extendplugin.g, com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        if (lVar.q(com.tencent.mm.plugin.appbrand.wxassistant.q2.class) == null || !((com.tencent.mm.plugin.appbrand.wxassistant.q2) lVar.q(com.tencent.mm.plugin.appbrand.wxassistant.q2.class)).g4()) {
            super.A(lVar, jSONObject, i17);
            return;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.JsApiInsertXWebVideo", "wx assistant is enabled, return");
        java.lang.String str = android.text.TextUtils.isEmpty("fail:wx assistant is enabled.") ? "fail:internal error" : "fail:wx assistant is enabled.";
        java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        try {
            jSONObject2.put("errno", 4);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
        }
        lVar.a(i17, u(str, jSONObject2));
    }
}
