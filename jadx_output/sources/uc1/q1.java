package uc1;

/* loaded from: classes13.dex */
public class q1 extends uc1.b {
    public static final int CTRL_INDEX = -2;
    public static final java.lang.String NAME = "removeMapArc";

    @Override // uc1.b, com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        super.A(lVar, jSONObject, i17);
        if (jSONObject == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiRemoveMapArc", "data is null");
            lVar.a(i17, o("fail:invalid data"));
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiRemoveMapArc", "data:%s", jSONObject);
        vc1.a3 E = E(lVar, jSONObject);
        if (E == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiRemoveMapArc", "mapView is null, return");
            lVar.a(i17, o("fail:mapview is null"));
            return;
        }
        if (!jSONObject.has(dm.i4.COL_ID)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiRemoveMapArc", "id is empty");
            lVar.a(i17, o("fail:invalid data"));
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiRemoveMapArc", "removeMapArc success");
        int optInt = jSONObject.optInt(dm.i4.COL_ID);
        java.util.HashMap hashMap = ((vc1.p1) E).f435101u0;
        if (hashMap.containsKey("" + optInt)) {
            ((com.tencent.tencentmap.mapsdk.maps.model.Arc) hashMap.remove("" + optInt)).remove();
            com.tencent.mars.xlog.Log.i("MicroMsg.Map.DefaultTencentMapView", "removeMapArc success id:%d", java.lang.Integer.valueOf(optInt));
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.Map.DefaultTencentMapView", "removeMapArc fail id:%d", java.lang.Integer.valueOf(optInt));
        }
        lVar.a(i17, o("ok"));
    }
}
