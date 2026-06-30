package uc1;

/* loaded from: classes13.dex */
public class q extends uc1.b {
    public static final int CTRL_INDEX = -2;
    public static final java.lang.String NAME = "addMapVisualLayer";

    @Override // uc1.b, com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        super.A(lVar, jSONObject, i17);
        if (jSONObject == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiAddMapVisualLayer", "data is null");
            lVar.a(i17, o("fail:invalid data"));
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiAddMapVisualLayer", "data:%s", jSONObject);
        vc1.a3 E = E(lVar, jSONObject);
        if (E == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiAddMapVisualLayer", "mapView is null, return");
            lVar.a(i17, o("fail:mapview is null"));
            return;
        }
        java.lang.String optString = jSONObject.optString("layerId");
        if (android.text.TextUtils.isEmpty(optString)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiAddMapVisualLayer", "layerId is empty");
            lVar.a(i17, o("fail:invalid data"));
            return;
        }
        boolean z17 = false;
        int optInt = jSONObject.optInt("interval", 0);
        double optDouble = jSONObject.optDouble("opacity", 1.0d);
        int optInt2 = jSONObject.optInt("zIndex", 0);
        java.lang.String optString2 = jSONObject.optString(ya.b.LEVEL);
        ((vc1.p1) E).f435105w0 = new uc1.p(this, jSONObject, lVar);
        vc1.p1 p1Var = (vc1.p1) E;
        java.util.HashMap hashMap = p1Var.f435099t0;
        if (hashMap.containsKey("" + optString)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Map.DefaultTencentMapView", "VisualLayer not exist, remove visualLayer id:%s first, and than add again", optString);
            p1Var.R(optString);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Map.DefaultTencentMapView", "addMapVisualLayer id:%s", optString);
        com.tencent.map.sdk.comps.vis.VisualLayerOptionsBuilder newBuilder = new com.tencent.map.sdk.comps.vis.VisualLayerOptions(optString).newBuilder();
        newBuilder.setTimeInterval(optInt);
        newBuilder.setZIndex(optInt2);
        newBuilder.setAlpha((float) optDouble);
        if (android.text.TextUtils.isEmpty(optString2)) {
            newBuilder.setLevel(com.tencent.mapsdk.raster.model.OverlayLevel.OverlayLevelAboveBuildings);
        } else {
            int y17 = p1Var.y(optString2);
            if (y17 >= 0) {
                newBuilder.setLevel(y17);
            } else {
                newBuilder.setLevel(com.tencent.mapsdk.raster.model.OverlayLevel.OverlayLevelAboveBuildings);
            }
        }
        com.tencent.map.sdk.comps.vis.VisualLayer addVisualLayer = p1Var.f435068e.getMap().addVisualLayer(newBuilder.build());
        if (addVisualLayer == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Map.DefaultTencentMapView", "addMapVisualLayer fail id:%s", optString);
        } else {
            vc1.m1 m1Var = new vc1.m1(p1Var, optString);
            addVisualLayer.addLayerStatusChangedListener(m1Var);
            hashMap.put(optString, addVisualLayer);
            p1Var.f435103v0.put(optString, m1Var);
            z17 = true;
        }
        if (z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiAddMapVisualLayer", "addMapVisualLayer ok");
            lVar.a(i17, o("ok"));
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiAddMapVisualLayer", "addMapVisualLayer fail");
            lVar.a(i17, o("fail"));
        }
    }
}
