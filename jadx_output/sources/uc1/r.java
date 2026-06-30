package uc1;

/* loaded from: classes13.dex */
public class r extends uc1.b {
    public static final int CTRL_INDEX = -2;
    public static final java.lang.String NAME = "eraseMapLines";

    @Override // uc1.b, com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        org.json.JSONArray jSONArray;
        super.A(lVar, jSONObject, i17);
        if (jSONObject == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiEraseMapLines", "data is null");
            lVar.a(i17, o("fail:invalid data"));
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiEraseMapLines", "data:%s", jSONObject);
        vc1.a3 E = E(lVar, jSONObject);
        if (E == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiEraseMapLines", "mapView is null, return");
            lVar.a(i17, o("fail:mapview is null"));
            return;
        }
        if (!jSONObject.has("lines")) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiEraseMapLines", "data has not lines info");
            java.lang.String o17 = o("fail:invalid data");
            vc1.p1 p1Var = (vc1.p1) E;
            p1Var.getClass();
            C(lVar, i17, o17, false, p1Var instanceof dg1.h);
            return;
        }
        try {
            org.json.JSONArray jSONArray2 = new org.json.JSONArray(jSONObject.optString("lines"));
            int i18 = 0;
            int i19 = 0;
            while (i19 < jSONArray2.length()) {
                org.json.JSONObject jSONObject2 = (org.json.JSONObject) jSONArray2.get(i19);
                java.lang.String optString = jSONObject2.optString(dm.i4.COL_ID);
                if (!com.tencent.mm.sdk.platformtools.t8.K0(optString)) {
                    org.json.JSONObject optJSONObject = jSONObject2.optJSONObject("point");
                    vc1.y1 y1Var = optJSONObject != null ? new vc1.y1(com.tencent.mm.sdk.platformtools.t8.F(optJSONObject.optString("latitude"), 0.0d), com.tencent.mm.sdk.platformtools.t8.F(optJSONObject.optString("longitude"), 0.0d)) : null;
                    if (y1Var != null) {
                        int optInt = jSONObject2.optInt(ya.b.INDEX, i18);
                        boolean optBoolean = jSONObject2.optBoolean("clear", true);
                        com.tencent.mapsdk.raster.model.Polyline polyline = (com.tencent.mapsdk.raster.model.Polyline) ((java.util.concurrent.ConcurrentHashMap) ((vc1.p1) E).W).get(optString);
                        if (polyline == null) {
                            com.tencent.mars.xlog.Log.w("MicroMsg.Map.DefaultTencentMapView", "lineId:%s is null", optString);
                        } else {
                            polyline.setEraseable(optBoolean);
                            jSONArray = jSONArray2;
                            polyline.eraseTo(optInt, new com.tencent.mapsdk.raster.model.LatLng(y1Var.f435223a, y1Var.f435224b));
                            i19++;
                            jSONArray2 = jSONArray;
                            i18 = 0;
                        }
                    }
                }
                jSONArray = jSONArray2;
                i19++;
                jSONArray2 = jSONArray;
                i18 = 0;
            }
            java.lang.String o18 = o("ok");
            vc1.p1 p1Var2 = (vc1.p1) E;
            p1Var2.getClass();
            C(lVar, i17, o18, true, p1Var2 instanceof dg1.h);
        } catch (org.json.JSONException e17) {
            com.tencent.mm.sdk.platformtools.Log.c("MicroMsg.JsApiEraseMapLines", "", e17);
            java.lang.String o19 = o("fail:internal error");
            vc1.p1 p1Var3 = (vc1.p1) E;
            p1Var3.getClass();
            C(lVar, i17, o19, false, p1Var3 instanceof dg1.h);
        }
    }
}
