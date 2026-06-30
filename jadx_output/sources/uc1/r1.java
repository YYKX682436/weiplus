package uc1;

/* loaded from: classes13.dex */
public class r1 extends uc1.b {
    public static final int CTRL_INDEX = 786;
    public static final java.lang.String NAME = "removeMapCustomLayer";

    @Override // uc1.b, com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        super.A(lVar, jSONObject, i17);
        if (jSONObject == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiRemoveMapCustomLayer", "data is null");
            lVar.a(i17, o("fail:invalid data"));
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiRemoveMapCustomLayer", "data:%s", jSONObject);
        vc1.a3 E = E(lVar, jSONObject);
        if (E == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiRemoveMapCustomLayer", "mapView is null, return");
            lVar.a(i17, o("fail:mapview is null"));
            return;
        }
        java.lang.String optString = jSONObject.optString("layerId", "");
        com.tencent.mapsdk.raster.model.CustomLayer customLayer = (com.tencent.mapsdk.raster.model.CustomLayer) ((java.util.concurrent.ConcurrentHashMap) ((vc1.p1) E).O).remove(optString);
        if (customLayer != null) {
            customLayer.remove();
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.Map.DefaultTencentMapView", "removeCustomLayer fail, layerId:%s", optString);
        }
        C(lVar, i17, o("ok"), true, ((vc1.p1) E) instanceof dg1.h);
    }
}
