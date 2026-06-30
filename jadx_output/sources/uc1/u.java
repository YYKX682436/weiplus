package uc1;

/* loaded from: classes13.dex */
public class u extends uc1.b {
    public static final int CTRL_INDEX = 893;
    public static final java.lang.String NAME = "fromScreenLocation";

    @Override // uc1.b, com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        super.A(lVar, jSONObject, i17);
        if (jSONObject == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiFromScreenLocation", "data is null");
            lVar.a(i17, o("fail:invalid data"));
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiFromScreenLocation", "data:%s", jSONObject);
        vc1.a3 E = E(lVar, jSONObject);
        if (E == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiFromScreenLocation", "mapView is null, return");
            lVar.a(i17, o("fail:mapview is null"));
            return;
        }
        try {
            int i18 = jSONObject.getInt("x");
            int i19 = jSONObject.getInt("y");
            android.graphics.Point point = new android.graphics.Point();
            point.x = ik1.w.c(i18);
            point.y = ik1.w.c(i19);
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiFromScreenLocation", "x:%d, y:%d", java.lang.Integer.valueOf(point.x), java.lang.Integer.valueOf(point.y));
            vc1.p1 p1Var = (vc1.p1) E;
            p1Var.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.Map.DefaultTencentMapView", NAME);
            com.tencent.mapsdk.raster.model.LatLng fromScreenLocation = p1Var.f435068e.getMap().getProjection().fromScreenLocation(point);
            double latitude = fromScreenLocation.getLatitude();
            double longitude = fromScreenLocation.getLongitude();
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("latitude", java.lang.Double.valueOf(latitude));
            hashMap.put("longitude", java.lang.Double.valueOf(longitude));
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiFromScreenLocation", "fromScreenLocation ok values:%s", hashMap.toString());
            lVar.a(i17, p("ok", hashMap));
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiFromScreenLocation", "");
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiFromScreenLocation", "parse fromScreenLocation error, exception : %s", e17);
            java.lang.String o17 = o("fail:internal error");
            vc1.p1 p1Var2 = (vc1.p1) E;
            p1Var2.getClass();
            C(lVar, i17, o17, false, p1Var2 instanceof dg1.h);
        }
    }
}
