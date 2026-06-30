package uc1;

/* loaded from: classes13.dex */
public class g0 extends uc1.b {
    public static final int CTRL_INDEX = 857;
    public static final java.lang.String NAME = "initMapMarkerCluster";

    @Override // uc1.b, com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        super.A(lVar, jSONObject, i17);
        if (jSONObject == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiInitMapMarkerCluster", "data is null");
            lVar.a(i17, o("fail:invalid data"));
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiInitMapMarkerCluster", "data:%s", jSONObject);
        vc1.a3 E = E(lVar, jSONObject);
        if (E == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiInitMapMarkerCluster", "mapView is null, return");
            lVar.a(i17, o("fail:mapview is null"));
            return;
        }
        boolean optBoolean = jSONObject.optBoolean("enableDefaultStyle", true);
        boolean optBoolean2 = jSONObject.optBoolean("zoomOnClick", true);
        int optInt = jSONObject.optInt("minimumClusterSize", 2);
        int optInt2 = jSONObject.optInt("gridSize", 60);
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiInitMapMarkerCluster", "enableDefaultStyle:%b, zoomOnClick:%b, minimumClusterSize:%d, gridSize:%d", java.lang.Boolean.valueOf(optBoolean), java.lang.Boolean.valueOf(optBoolean2), java.lang.Integer.valueOf(optInt), java.lang.Integer.valueOf(optInt2));
        ((vc1.p1) E).C(optBoolean, optBoolean2, optInt, optInt2, new uc1.d0(this, jSONObject, lVar));
        lVar.a(i17, o("ok"));
    }
}
