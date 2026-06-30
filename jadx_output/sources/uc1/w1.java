package uc1;

/* loaded from: classes13.dex */
public class w1 extends uc1.b {
    public static final int CTRL_INDEX = 690;
    public static final java.lang.String NAME = "setMapCenterOffset";

    @Override // uc1.b, com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        super.A(lVar, jSONObject, i17);
        if (jSONObject == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiSetMapCenterOffset", "data is null");
            lVar.a(i17, o("fail:invalid data"));
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiSetMapCenterOffset", "data:%s", jSONObject);
        vc1.a3 E = E(lVar, jSONObject);
        if (E == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiSetMapCenterOffset", "mapView is null, return");
            lVar.a(i17, o("fail:mapview is null"));
            return;
        }
        try {
            org.json.JSONArray jSONArray = jSONObject.getJSONArray("offset");
            float optDouble = (float) jSONArray.optDouble(0, 0.5d);
            float optDouble2 = (float) jSONArray.optDouble(1, 0.5d);
            boolean optBoolean = jSONObject.optBoolean("animated", false);
            vc1.p1 p1Var = (vc1.p1) E;
            com.tencent.mm.plugin.location_soso.api.SoSoMapView soSoMapView = p1Var.f435068e;
            com.tencent.mapsdk.raster.model.LatLng mapCenter = soSoMapView.getMap().getMapCenter();
            soSoMapView.setMapAnchor(optDouble, optDouble2);
            p1Var.D(mapCenter.getLatitude(), mapCenter.getLongitude(), -1.0f, -1.0f, -1.0f, optBoolean);
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiSetMapCenterOffset", "parse offset err:%s", e17);
        }
        java.lang.String o17 = o("ok");
        vc1.p1 p1Var2 = (vc1.p1) E;
        p1Var2.getClass();
        C(lVar, i17, o17, true, p1Var2 instanceof dg1.h);
    }
}
