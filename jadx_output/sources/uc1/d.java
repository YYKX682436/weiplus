package uc1;

/* loaded from: classes13.dex */
public class d extends uc1.b {
    public static final int CTRL_INDEX = 135;
    public static final java.lang.String NAME = "addMapCircles";

    @Override // uc1.b, com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        super.A(lVar, jSONObject, i17);
        if (jSONObject == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiAddMapCircles", "data is null");
            lVar.a(i17, o("fail:invalid data"));
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiAddMapCircles", "data:%s", jSONObject);
        vc1.a3 E = E(lVar, jSONObject);
        if (E == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiAddMapCircles", "mapView is null, return");
            lVar.a(i17, o("fail:mapview is null"));
            return;
        }
        try {
            if (jSONObject.has("circles")) {
                vc1.p1 p1Var = (vc1.p1) E;
                synchronized (p1Var.U) {
                    java.util.Iterator it = p1Var.U.iterator();
                    while (it.hasNext()) {
                        ((com.tencent.mapsdk.raster.model.Circle) it.next()).remove();
                    }
                    p1Var.U.clear();
                }
                org.json.JSONArray jSONArray = new org.json.JSONArray(jSONObject.optString("circles"));
                for (int i18 = 0; i18 < jSONArray.length(); i18++) {
                    org.json.JSONObject jSONObject2 = (org.json.JSONObject) jSONArray.get(i18);
                    double F = com.tencent.mm.sdk.platformtools.t8.F(jSONObject2.optString("latitude"), 0.0d);
                    double F2 = com.tencent.mm.sdk.platformtools.t8.F(jSONObject2.optString("longitude"), 0.0d);
                    java.lang.String optString = jSONObject2.optString("color", "");
                    int parseColor = android.graphics.Color.parseColor("#000000");
                    try {
                        parseColor = ik1.w.l(optString);
                    } catch (java.lang.Exception unused) {
                    }
                    java.lang.String optString2 = jSONObject2.optString("fillColor", "");
                    int parseColor2 = android.graphics.Color.parseColor("#00000000");
                    try {
                        parseColor2 = ik1.w.l(optString2);
                    } catch (java.lang.Exception unused2) {
                    }
                    int optInt = jSONObject2.optInt("radius");
                    int h17 = (int) ik1.w.h(jSONObject2, "strokeWidth", 0.0f);
                    java.lang.String optString3 = jSONObject2.optString(ya.b.LEVEL);
                    vc1.p1 p1Var2 = (vc1.p1) E;
                    com.tencent.mapsdk.raster.model.CircleOptions circleOptions = new com.tencent.mapsdk.raster.model.CircleOptions();
                    circleOptions.center(new com.tencent.mapsdk.raster.model.LatLng(F, F2));
                    circleOptions.radius(optInt);
                    circleOptions.strokeColor(parseColor);
                    circleOptions.strokeWidth(h17);
                    circleOptions.fillColor(parseColor2);
                    int y17 = p1Var2.y(optString3);
                    if (y17 >= 0) {
                        circleOptions.level(y17);
                    } else {
                        circleOptions.level(com.tencent.mapsdk.raster.model.OverlayLevel.OverlayLevelAboveLabels);
                    }
                    com.tencent.mapsdk.raster.model.Circle addCircle = p1Var2.f435068e.getMap().addCircle(circleOptions);
                    synchronized (p1Var2.U) {
                        p1Var2.U.add(addCircle);
                    }
                }
            }
            java.lang.String o17 = o("ok");
            vc1.p1 p1Var3 = (vc1.p1) E;
            p1Var3.getClass();
            C(lVar, i17, o17, true, p1Var3 instanceof dg1.h);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiAddMapCircles", "parse circles error, exception : %s", e17);
            java.lang.String o18 = o("fail:internal error");
            vc1.p1 p1Var4 = (vc1.p1) E;
            p1Var4.getClass();
            C(lVar, i17, o18, false, p1Var4 instanceof dg1.h);
        }
    }
}
