package uc1;

/* loaded from: classes13.dex */
public class v extends uc1.b {
    public static final int CTRL_INDEX = 144;
    public static final java.lang.String NAME = "getMapCenterLocation";

    @Override // uc1.b, com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        super.A(lVar, jSONObject, i17);
        if (jSONObject == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiGetMapCenterLocation", "data is null");
            lVar.a(i17, o("fail:invalid data"));
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiGetMapCenterLocation", "data:%s", jSONObject);
        vc1.a3 E = E(lVar, jSONObject);
        if (E == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiGetMapCenterLocation", "mapView is null, return");
            lVar.a(i17, o("fail:mapview is null"));
            return;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        vc1.p1 p1Var = (vc1.p1) E;
        com.tencent.mapsdk.raster.model.LatLng mapCenter = p1Var.f435068e.getMap().getMapCenter();
        double latitude = mapCenter.getLatitude();
        double longitude = mapCenter.getLongitude();
        hashMap.put("latitude", java.lang.Double.valueOf(latitude));
        hashMap.put("longitude", java.lang.Double.valueOf(longitude));
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiGetMapCenterLocation", "ok, values:%s", hashMap.toString());
        C(lVar, i17, p("ok", hashMap), true, p1Var instanceof dg1.h);
    }
}
