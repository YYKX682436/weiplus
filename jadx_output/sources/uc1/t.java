package uc1;

/* loaded from: classes13.dex */
public class t extends uc1.b {
    public static final int CTRL_INDEX = -2;
    public static final java.lang.String NAME = "executeMapVisualLayerCommand";

    @Override // uc1.b, com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        super.A(lVar, jSONObject, i17);
        if (jSONObject == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiExecuteMapVisualLayerCommand", "data is null");
            lVar.a(i17, o("fail:invalid data"));
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiExecuteMapVisualLayerCommand", "data:%s", jSONObject);
        vc1.a3 E = E(lVar, jSONObject);
        if (E == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiExecuteMapVisualLayerCommand", "mapView is null, return");
            lVar.a(i17, o("fail:mapview is null"));
            return;
        }
        java.lang.String optString = jSONObject.optString("layerId");
        java.lang.String optString2 = jSONObject.optString("command");
        if (android.text.TextUtils.isEmpty(optString2)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiExecuteMapVisualLayerCommand", "command is empty");
            lVar.a(i17, o("fail:invalid data"));
            return;
        }
        vc1.p1 p1Var = (vc1.p1) E;
        com.tencent.mm.plugin.location_soso.api.SoSoMapView soSoMapView = p1Var.f435068e;
        java.lang.String str = "";
        if (soSoMapView == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Map.DefaultTencentMapView", "executeMapVisualLayerCommand fail, tencentMapView null");
        } else {
            java.util.HashMap hashMap = p1Var.f435099t0;
            if (hashMap.containsKey("" + optString)) {
                com.tencent.map.sdk.comps.vis.VisualLayer visualLayer = (com.tencent.map.sdk.comps.vis.VisualLayer) hashMap.get("" + optString);
                if (visualLayer != null) {
                    str = soSoMapView.getMap().executeMapVisualLayerCommand(visualLayer, optString2);
                }
            } else {
                com.tencent.mars.xlog.Log.e("MicroMsg.Map.DefaultTencentMapView", "executeMapVisualLayerCommand layerId not exist");
                str = soSoMapView.getMap().executeMapVisualLayerCommand(null, optString2);
            }
        }
        if (android.text.TextUtils.isEmpty(str) || !str.contains(ya.b.SUCCESS)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiExecuteMapVisualLayerCommand", "executeMapVisualLayerCommand fail");
            lVar.a(i17, o("fail"));
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiExecuteMapVisualLayerCommand", "executeMapVisualLayerCommand ok");
            java.util.HashMap hashMap2 = new java.util.HashMap();
            hashMap2.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, str);
            lVar.a(i17, p("ok", hashMap2));
        }
    }
}
