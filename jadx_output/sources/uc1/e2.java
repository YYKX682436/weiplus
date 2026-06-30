package uc1;

/* loaded from: classes13.dex */
public class e2 extends gb1.h {
    public static final int CTRL_INDEX = 4;
    public static final java.lang.String NAME = "updateMap";

    @Override // gb1.i
    public int H(org.json.JSONObject jSONObject) {
        try {
            return jSONObject.optInt("mapId");
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiUpdateMap", "get mapId error, exception : %s", e17);
            return -1;
        }
    }

    @Override // gb1.h
    public boolean K(com.tencent.mm.plugin.appbrand.jsapi.t tVar, int i17, android.view.View view, org.json.JSONObject jSONObject) {
        vc1.d3.a(3);
        if (jSONObject == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiUpdateMap", "data is null");
            return false;
        }
        java.lang.String appId = tVar.getAppId();
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiUpdateMap", "updateView appId:%s viewId:%d data:%s", appId, java.lang.Integer.valueOf(i17), jSONObject);
        vc1.a3 b17 = vc1.h3.b(appId, vc1.e3.b(tVar, jSONObject));
        if (b17 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiUpdateMap", "mapView is null, return");
            return false;
        }
        if (jSONObject.has("enableZoom")) {
            ((vc1.p1) b17).f435068e.getUiSettings().setZoomGesturesEnabled(jSONObject.optBoolean("enableZoom", true));
        }
        if (jSONObject.has("enableScroll")) {
            ((vc1.p1) b17).f435068e.getUiSettings().setScrollGesturesEnabled(jSONObject.optBoolean("enableScroll", true));
        }
        if (jSONObject.has("enableRotate")) {
            ((vc1.p1) b17).f435068e.getUiSettings().setRotateGesturesEnabled(jSONObject.optBoolean("enableRotate", true));
        }
        if (jSONObject.has("showCompass")) {
            ((vc1.p1) b17).f435068e.getUiSettings().setCompassEnabled(jSONObject.optBoolean("showCompass", false));
        }
        if (jSONObject.has("enable3D")) {
            ((vc1.p1) b17).f435068e.getMap().setBuilding3dEffectEnable(jSONObject.optBoolean("enable3D", false));
        }
        if (jSONObject.has("enableOverlooking")) {
            ((vc1.p1) b17).f435068e.getUiSettings().setTiltGesturesEnabled(jSONObject.optBoolean("enableOverlooking", false));
        }
        if (jSONObject.has("enableAutoMaxOverlooking")) {
            ((vc1.p1) b17).f435068e.getMap().enableAutoMaxOverlooking(jSONObject.optBoolean("enableAutoMaxOverlooking", false));
        }
        if (jSONObject.has("enableSatellite")) {
            ((vc1.p1) b17).f435068e.getMap().setSatelliteEnabled(jSONObject.optBoolean("enableSatellite", false));
        }
        if (jSONObject.has("enableTraffic")) {
            ((vc1.p1) b17).f435068e.getMap().setTrafficEnabled(jSONObject.optBoolean("enableTraffic", false));
        }
        if (jSONObject.has("enableIndoor")) {
            ((vc1.p1) b17).f435068e.getMap().setIndoorEnabled(jSONObject.optBoolean("enableIndoor", false));
        }
        if (jSONObject.has("enableIndoorLevelPick")) {
            ((vc1.p1) b17).f435068e.getUiSettings().setIndoorLevelPickerEnabled(jSONObject.optBoolean("enableIndoorLevelPick", false));
        }
        if (jSONObject.has("showLocation")) {
            ((vc1.p1) b17).e0(jSONObject.optBoolean("showLocation", false));
        }
        if (jSONObject.has("showScale")) {
            ((vc1.p1) b17).f435068e.getUiSettings().setScaleControlsEnabled(jSONObject.optBoolean("showScale", true));
        }
        if (jSONObject.has("styleId")) {
            int optInt = jSONObject.optInt("styleId", 0);
            vc1.p1 p1Var = (vc1.p1) b17;
            com.tencent.mars.xlog.Log.i("MicroMsg.Map.DefaultTencentMapView", "map:%s setMapStyle: %d", p1Var, java.lang.Integer.valueOf(optInt));
            p1Var.f435068e.getMap().setMapStyle(optInt);
        }
        if (jSONObject.has("maxScale")) {
            ((vc1.p1) b17).a0((int) com.tencent.mm.sdk.platformtools.t8.L(jSONObject.optString("maxScale"), 20.0f));
        }
        if (jSONObject.has("minScale")) {
            ((vc1.p1) b17).b0((int) com.tencent.mm.sdk.platformtools.t8.L(jSONObject.optString("minScale"), 3.0f));
        }
        if (jSONObject.has("enablePoi")) {
            ((vc1.p1) b17).f435068e.getMap().setPoisEnabled(jSONObject.optBoolean("enablePoi", true));
        }
        if (jSONObject.has("enableBuilding")) {
            ((vc1.p1) b17).f435068e.getMap().showBuilding(jSONObject.optBoolean("enableBuilding", true));
        }
        try {
            if (jSONObject.has("covers")) {
                vc1.p1 p1Var2 = (vc1.p1) b17;
                p1Var2.K();
                org.json.JSONArray jSONArray = new org.json.JSONArray(jSONObject.optString("covers"));
                int i18 = 0;
                while (i18 < jSONArray.length()) {
                    org.json.JSONObject jSONObject2 = (org.json.JSONObject) jSONArray.get(i18);
                    double F = com.tencent.mm.sdk.platformtools.t8.F(jSONObject2.optString("latitude"), 0.0d);
                    org.json.JSONArray jSONArray2 = jSONArray;
                    double F2 = com.tencent.mm.sdk.platformtools.t8.F(jSONObject2.optString("longitude"), 0.0d);
                    java.lang.String T0 = ((o91.e) tVar.q(o91.e.class)).T0(tVar, jSONObject2.optString("iconPath"));
                    float optDouble = (float) jSONObject2.optDouble(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_VIDEO_ROTATION, 0.0d);
                    vc1.s1 s1Var = new vc1.s1();
                    s1Var.f435168a = F;
                    s1Var.f435169b = F2;
                    s1Var.f435170c = T0;
                    s1Var.f435171d = optDouble;
                    p1Var2.l(s1Var, (o91.d) tVar.q(o91.d.class));
                    i18++;
                    jSONArray = jSONArray2;
                }
            }
            if (jSONObject.has("scale") || jSONObject.has(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_VIDEO_ROTATION) || jSONObject.has("skew") || jSONObject.has("centerLatitude") || jSONObject.has("centerLongitude")) {
                float optDouble2 = (float) jSONObject.optDouble("scale", -1.0d);
                float optDouble3 = (float) jSONObject.optDouble(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_VIDEO_ROTATION, -1.0d);
                float optDouble4 = (float) jSONObject.optDouble("skew", -1.0d);
                vc1.p1 p1Var3 = (vc1.p1) b17;
                p1Var3.D(com.tencent.mm.sdk.platformtools.t8.F(jSONObject.optString("centerLatitude", "-1"), -1.0d), com.tencent.mm.sdk.platformtools.t8.F(jSONObject.optString("centerLongitude", "-1"), -1.0d), -1.0f, -1.0f, -1.0f, false);
                if (optDouble2 != -1.0f) {
                    p1Var3.U(new vc1.h(p1Var3, optDouble2));
                }
                if (optDouble3 != -1.0f || optDouble4 != -1.0f) {
                    p1Var3.E(optDouble3, optDouble4);
                }
            }
            vc1.d3.a(4);
            return true;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiUpdateMap", "parse covers error, exception : %s", e17);
            return false;
        }
    }
}
