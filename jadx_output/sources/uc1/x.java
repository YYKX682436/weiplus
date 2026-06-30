package uc1;

/* loaded from: classes13.dex */
public class x extends uc1.b {
    public static final int CTRL_INDEX = -2;
    public static final java.lang.String NAME = "getMapRegion";

    @Override // uc1.b, com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        super.A(lVar, jSONObject, i17);
        if (jSONObject == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiGetMapRegion", "data is null");
            lVar.a(i17, o("fail:invalid data"));
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiGetMapRegion", "data:%s", jSONObject);
        vc1.a3 E = E(lVar, jSONObject);
        if (E == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiGetMapRegion", "mapView is null, return");
            lVar.a(i17, o("fail:mapview is null"));
            return;
        }
        vc1.p1 p1Var = (vc1.p1) E;
        vc1.z2 z2Var = p1Var.A().f435225a;
        if (z2Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiGetMapRegion", "visibleRegion is  null");
            lVar.a(i17, o("fail:visibleRegion is null"));
            return;
        }
        vc1.z1 z1Var = z2Var.f435232a;
        if (z1Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiGetMapRegion", "latLngBounds is  null");
            lVar.a(i17, o("fail:latLngBounds is null"));
            return;
        }
        vc1.y1 y1Var = z1Var.f435230a;
        vc1.y1 y1Var2 = z1Var.f435231b;
        java.util.HashMap hashMap = new java.util.HashMap();
        if (y1Var != null) {
            hashMap.put("latitude", java.lang.Double.valueOf(y1Var.f435223a));
            hashMap.put("longitude", java.lang.Double.valueOf(y1Var.f435224b));
        }
        java.util.HashMap hashMap2 = new java.util.HashMap();
        if (y1Var2 != null) {
            hashMap2.put("latitude", java.lang.Double.valueOf(y1Var2.f435223a));
            hashMap2.put("longitude", java.lang.Double.valueOf(y1Var2.f435224b));
        }
        java.util.HashMap hashMap3 = new java.util.HashMap();
        hashMap3.put("southwest", hashMap);
        hashMap3.put("northeast", hashMap2);
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiGetMapRegion", "getMapRegion ok, values:%s", hashMap3.toString());
        C(lVar, i17, p("ok", hashMap3), true, p1Var instanceof dg1.h);
    }
}
