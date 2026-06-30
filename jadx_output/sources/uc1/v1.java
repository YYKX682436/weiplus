package uc1;

/* loaded from: classes13.dex */
public class v1 extends uc1.b {
    public static final int CTRL_INDEX = -2;
    public static final java.lang.String NAME = "setMapBoundary";

    @Override // uc1.b, com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        vc1.y1 y1Var;
        boolean z17;
        super.A(lVar, jSONObject, i17);
        if (jSONObject == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiSetMapBoundary", "data is null");
            lVar.a(i17, o("fail:invalid data"));
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiSetMapBoundary", "data:%s", jSONObject);
        vc1.a3 E = E(lVar, jSONObject);
        if (E == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiSetMapBoundary", "mapView is null, return");
            lVar.a(i17, o("fail:mapview is null"));
            return;
        }
        vc1.y1 y1Var2 = null;
        if (jSONObject.has("southwest")) {
            org.json.JSONObject optJSONObject = jSONObject.optJSONObject("southwest");
            y1Var = new vc1.y1(optJSONObject.optDouble("latitude", 0.0d), optJSONObject.optDouble("longitude", 0.0d));
        } else {
            y1Var = null;
        }
        if (jSONObject.has("northeast")) {
            org.json.JSONObject optJSONObject2 = jSONObject.optJSONObject("northeast");
            y1Var2 = new vc1.y1(optJSONObject2.optDouble("latitude", 0.0d), optJSONObject2.optDouble("longitude", 0.0d));
        }
        if (y1Var2 == null || y1Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiSetMapBoundary", "data is invalid");
            lVar.a(i17, o("fail:data is invalid"));
            return;
        }
        vc1.p1 p1Var = (vc1.p1) E;
        p1Var.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.Map.DefaultTencentMapView", NAME);
        if (y1Var == null || y1Var2 == null) {
            z17 = false;
        } else {
            com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng = new com.tencent.tencentmap.mapsdk.maps.model.LatLng();
            latLng.longitude = y1Var.f435224b;
            latLng.latitude = y1Var.f435223a;
            com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng2 = new com.tencent.tencentmap.mapsdk.maps.model.LatLng();
            latLng2.longitude = y1Var2.f435224b;
            latLng2.latitude = y1Var2.f435223a;
            p1Var.f435068e.getMap().setMapBoundary(new com.tencent.tencentmap.mapsdk.maps.model.LatLngBounds(latLng2, latLng));
            z17 = true;
        }
        if (z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiSetMapBoundary", "setMapBoundary success");
            lVar.a(i17, o("ok"));
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiSetMapBoundary", "data is invalid");
            lVar.a(i17, o("fail:setMapBoundary is fail"));
        }
    }
}
