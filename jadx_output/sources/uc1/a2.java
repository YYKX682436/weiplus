package uc1;

/* loaded from: classes13.dex */
public class a2 extends uc1.b {
    public static final int CTRL_INDEX = 892;
    public static final java.lang.String NAME = "toScreenLocation";

    @Override // uc1.b, com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        super.A(lVar, jSONObject, i17);
        if (jSONObject == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiToScreenLocation", "data is null");
            lVar.a(i17, o("fail:invalid data"));
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiToScreenLocation", "data:%s", jSONObject);
        vc1.a3 E = E(lVar, jSONObject);
        if (E == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiToScreenLocation", "mapView is null, return");
            lVar.a(i17, o("fail:mapview is null"));
            return;
        }
        try {
            double d17 = jSONObject.getDouble("longitude");
            double d18 = jSONObject.getDouble("latitude");
            vc1.p1 p1Var = (vc1.p1) E;
            p1Var.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.Map.DefaultTencentMapView", NAME);
            android.graphics.Point screenLocation = p1Var.f435068e.getMap().getProjection().toScreenLocation(new com.tencent.mapsdk.raster.model.LatLng(d18, d17));
            if (screenLocation == null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.JsApiToScreenLocation", "toScreenLocation fail");
                lVar.a(i17, o("fail:point is empty"));
                return;
            }
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("x", java.lang.Integer.valueOf(ik1.w.d(screenLocation.x)));
            hashMap.put("y", java.lang.Integer.valueOf(ik1.w.d(screenLocation.y)));
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiToScreenLocation", "toScreenLocation ok values:%s", hashMap.toString());
            lVar.a(i17, p("ok", hashMap));
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiToScreenLocation", "");
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiToScreenLocation", "parse toScreenLocation error, exception : %s", e17);
            java.lang.String o17 = o("fail:internal error");
            vc1.p1 p1Var2 = (vc1.p1) E;
            p1Var2.getClass();
            C(lVar, i17, o17, false, p1Var2 instanceof dg1.h);
        }
    }
}
