package nd1;

/* loaded from: classes7.dex */
public class d1 extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = 198;
    public static final java.lang.String NAME = "setNavigationBarColor";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        java.lang.String str;
        int i18;
        com.tencent.mm.plugin.appbrand.y yVar = (com.tencent.mm.plugin.appbrand.y) lVar;
        try {
            int l17 = ik1.w.l(jSONObject.getString("frontColor"));
            int l18 = ik1.w.l(jSONObject.getString("backgroundColor"));
            jSONObject.optDouble("alpha", 1.0d);
            org.json.JSONObject optJSONObject = jSONObject.optJSONObject("animation");
            if (optJSONObject != null) {
                int optInt = optJSONObject.optInt("duration");
                str = optJSONObject.optString("timingFunc");
                i18 = optInt;
            } else {
                str = "";
                i18 = 0;
            }
            nd1.c1 c1Var = new nd1.c1(this, yVar, i17, l18, l17, i18, str);
            if ((yVar instanceof com.tencent.mm.plugin.appbrand.page.v5) || !yVar.getRuntime().Q1()) {
                yVar.m(c1Var);
            } else {
                yVar.getRuntime().I1(c1Var);
            }
            java.lang.String str2 = android.text.TextUtils.isEmpty(null) ? "ok" : null;
            java.lang.String str3 = str2 != null ? str2 : "";
            java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            try {
                jSONObject2.put("errno", 0);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
            }
            yVar.a(i17, u(str3, jSONObject2));
        } catch (java.lang.Exception unused) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiSetNavigationBarColor", "Color parse error");
            yVar.a(i17, o("fail:invalid color"));
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public boolean z() {
        return true;
    }
}
