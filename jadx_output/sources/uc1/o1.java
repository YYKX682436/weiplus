package uc1;

/* loaded from: classes13.dex */
public class o1 extends uc1.b {
    public static final int CTRL_INDEX = 890;
    public static final java.lang.String NAME = "removeMapGroundOverlay";

    @Override // uc1.b, com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        super.A(lVar, jSONObject, i17);
        if (jSONObject == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiRemoveGroundOverlay", "data is null");
            lVar.a(i17, o("fail:invalid data"));
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiRemoveGroundOverlay", "data:%s", jSONObject);
        vc1.a3 E = E(lVar, jSONObject);
        if (E == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiRemoveGroundOverlay", "mapView is null, return");
            lVar.a(i17, o("fail:mapview is null"));
            return;
        }
        try {
            if (((vc1.p1) E).O(jSONObject.getInt(dm.i4.COL_ID))) {
                com.tencent.mars.xlog.Log.i("MicroMsg.JsApiRemoveGroundOverlay", "removeGroundOverlay success");
                lVar.a(i17, o("ok"));
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.JsApiRemoveGroundOverlay", "removeGroundOverlay fail");
                lVar.a(i17, o("fail"));
            }
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiRemoveGroundOverlay", "");
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiRemoveGroundOverlay", "parse remove groundOverlay error, exception : %s", e17);
            java.lang.String o17 = o("fail:internal error");
            vc1.p1 p1Var = (vc1.p1) E;
            p1Var.getClass();
            C(lVar, i17, o17, false, p1Var instanceof dg1.h);
        }
    }
}
