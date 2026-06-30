package uc1;

/* loaded from: classes13.dex */
public class n1 extends uc1.b {
    public static final int CTRL_INDEX = 141;
    public static final java.lang.String NAME = "moveToMapLocation";

    @Override // uc1.b, com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        super.A(lVar, jSONObject, i17);
        if (jSONObject == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiMoveToMapLocation", "data is null");
            lVar.a(i17, o("fail:invalid data"));
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiMoveToMapLocation", "moveToMapLocation data:%s", jSONObject);
        vc1.a3 E = E(lVar, jSONObject);
        if (E == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiMoveToMapLocation", "mapView is null, return");
            lVar.a(i17, o("fail:mapview is null"));
            return;
        }
        if (jSONObject.has("latitude") || jSONObject.has("longitude")) {
            ((vc1.p1) E).D(com.tencent.mm.sdk.platformtools.t8.F(jSONObject.optString("latitude"), 0.0d), com.tencent.mm.sdk.platformtools.t8.F(jSONObject.optString("longitude"), 0.0d), -1.0f, -1.0f, -1.0f, true);
        } else {
            vc1.p1 p1Var = (vc1.p1) E;
            p1Var.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.Map.DefaultTencentMapView", "map:%s moveToMapLocation", p1Var);
            vc1.e eVar = new vc1.e(p1Var);
            p1Var.L = eVar;
            if (p1Var.f435065c0 != null && p1Var.f435063b0) {
                eVar.run();
                p1Var.L = null;
            }
        }
        java.lang.String o17 = o("ok");
        vc1.p1 p1Var2 = (vc1.p1) E;
        p1Var2.getClass();
        C(lVar, i17, o17, true, p1Var2 instanceof dg1.h);
    }
}
