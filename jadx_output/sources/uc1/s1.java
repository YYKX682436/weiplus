package uc1;

/* loaded from: classes13.dex */
public class s1 extends uc1.b {
    public static final int CTRL_INDEX = 555;
    public static final java.lang.String NAME = "removeMapLines";

    @Override // uc1.b, com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        super.A(lVar, jSONObject, i17);
        if (jSONObject == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiRemoveMapLines", "data is null");
            lVar.a(i17, o("fail:invalid data"));
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiRemoveMapLines", "data:%s", jSONObject);
        vc1.a3 E = E(lVar, jSONObject);
        if (E == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiRemoveMapLines", "mapView is null, return");
            lVar.a(i17, o("fail:mapview is null"));
            return;
        }
        if (jSONObject.has("lines")) {
            try {
                org.json.JSONArray jSONArray = new org.json.JSONArray(jSONObject.optString("lines"));
                for (int i18 = 0; i18 < jSONArray.length(); i18++) {
                    ((vc1.p1) E).Q(jSONArray.getString(i18));
                }
            } catch (org.json.JSONException e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.JsApiRemoveMapLines", e17, "", new java.lang.Object[0]);
                lVar.a(i17, o("fail:internal error"));
                return;
            }
        }
        java.lang.String o17 = o("ok");
        vc1.p1 p1Var = (vc1.p1) E;
        p1Var.getClass();
        C(lVar, i17, o17, true, p1Var instanceof dg1.h);
    }
}
