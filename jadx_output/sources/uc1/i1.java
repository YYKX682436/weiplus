package uc1;

/* loaded from: classes13.dex */
public class i1 extends gb1.d {
    public static final int CTRL_INDEX = 2;
    public static final java.lang.String NAME = "insertMap";

    @Override // gb1.i
    public int H(org.json.JSONObject jSONObject) {
        try {
            return jSONObject.optInt("mapId");
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiInsertMap", "get mapId error, exception : %s", e17);
            return -1;
        }
    }

    @Override // gb1.d
    public android.view.View K(com.tencent.mm.plugin.appbrand.jsapi.t tVar, org.json.JSONObject jSONObject) {
        float L = com.tencent.mm.sdk.platformtools.t8.L(jSONObject.optString("centerLatitude"), 0.0f);
        float L2 = com.tencent.mm.sdk.platformtools.t8.L(jSONObject.optString("centerLongitude"), 0.0f);
        float L3 = com.tencent.mm.sdk.platformtools.t8.L(jSONObject.optString("scale"), 16.0f);
        int optInt = jSONObject.optInt(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_VIDEO_ROTATION, 0);
        int optInt2 = jSONObject.optInt("skew", 0);
        int L4 = (int) com.tencent.mm.sdk.platformtools.t8.L(jSONObject.optString("maxScale"), 20.0f);
        int L5 = (int) com.tencent.mm.sdk.platformtools.t8.L(jSONObject.optString("minScale"), 3.0f);
        if (java.lang.Math.abs(L) > 90.0f || java.lang.Math.abs(L2) > 180.0f) {
            return null;
        }
        vc1.d3.a(0);
        java.lang.String appId = tVar.getAppId();
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiInsertMap", "insertMap appId:%s viewId:%d data:%s", appId, java.lang.Integer.valueOf(H(jSONObject)), jSONObject);
        dg1.i iVar = (dg1.i) ((vc1.b3) nd.f.a(vc1.b3.class));
        iVar.getClass();
        try {
            jSONObject.put("mapType", 1);
            boolean optBoolean = jSONObject.optBoolean("enableDarkMode", false);
            nf.y yVar = nf.x.f336616b;
            if (!(yVar != null ? yVar.isDarkMode() : false)) {
                optBoolean = false;
            }
            jSONObject.put("enableDarkMode", optBoolean ? 1 : 0);
        } catch (org.json.JSONException e17) {
            com.tencent.mm.sdk.platformtools.Log.c("MicroMsg.WxaMapViewFactory", "", e17);
        }
        android.content.Context context = tVar.getContext();
        java.lang.String optString = jSONObject.optString("theme", "");
        int optInt3 = jSONObject.optInt("mapType", 1);
        java.lang.String optString2 = jSONObject.optString("subKey", "");
        java.lang.String appId2 = tVar.getAppId();
        java.lang.String optString3 = jSONObject.optString("pluginId", "");
        if (android.text.TextUtils.isEmpty(optString3)) {
            optString3 = appId2;
        }
        int optInt4 = jSONObject.optInt("styleId", 0);
        java.lang.String b17 = vc1.e3.b(tVar, jSONObject);
        int optInt5 = jSONObject.optInt("enableDarkMode", 0);
        boolean optBoolean2 = jSONObject.optBoolean("enableMSAA", false);
        java.util.HashMap hashMap = new java.util.HashMap(5);
        hashMap.put("theme", optString);
        hashMap.put("mapType", java.lang.Integer.valueOf(optInt3));
        hashMap.put("subKey", optString2);
        hashMap.put("subId", optString3);
        hashMap.put("styleId", java.lang.Integer.valueOf(optInt4));
        hashMap.put("enableDarkMode", java.lang.Integer.valueOf(optInt5));
        hashMap.put("isOverseasUser", java.lang.Boolean.valueOf(iVar.a()));
        hashMap.put("enableMSAA", java.lang.Boolean.valueOf(optBoolean2));
        vc1.p1 p1Var = new vc1.p1(context, b17, hashMap);
        if (!vc1.h3.d(appId, vc1.e3.b(tVar, jSONObject), p1Var)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiInsertMap", "initMapView is false, return");
            vc1.d3.a(1);
            return null;
        }
        vc1.d3.a(2);
        boolean optBoolean3 = jSONObject.optBoolean("enableZoom", true);
        com.tencent.mm.plugin.location_soso.api.SoSoMapView soSoMapView = p1Var.f435068e;
        soSoMapView.getUiSettings().setZoomGesturesEnabled(optBoolean3);
        soSoMapView.getUiSettings().setScrollGesturesEnabled(jSONObject.optBoolean("enableScroll", true));
        soSoMapView.getUiSettings().setRotateGesturesEnabled(jSONObject.optBoolean("enableRotate", false));
        soSoMapView.getUiSettings().setCompassEnabled(jSONObject.optBoolean("showCompass", false));
        soSoMapView.getMap().setBuilding3dEffectEnable(jSONObject.optBoolean("enable3D", false));
        soSoMapView.getUiSettings().setTiltGesturesEnabled(jSONObject.optBoolean("enableOverlooking", false));
        soSoMapView.getMap().enableAutoMaxOverlooking(jSONObject.optBoolean("enableAutoMaxOverlooking", false));
        soSoMapView.getMap().setSatelliteEnabled(jSONObject.optBoolean("enableSatellite", false));
        soSoMapView.getMap().setIndoorEnabled(jSONObject.optBoolean("enableIndoor", true));
        soSoMapView.getUiSettings().setIndoorLevelPickerEnabled(jSONObject.optBoolean("enableIndoorLevelPick", false));
        soSoMapView.getUiSettings().setScaleControlsEnabled(jSONObject.optBoolean("showScale", true));
        if (jSONObject.has("enablePoi")) {
            soSoMapView.getMap().setPoisEnabled(jSONObject.optBoolean("enablePoi", true));
        }
        if (jSONObject.has("enableBuilding")) {
            soSoMapView.getMap().showBuilding(jSONObject.optBoolean("enableBuilding", true));
        }
        p1Var.a0(L4);
        p1Var.b0(L5);
        p1Var.D(L, L2, L3, optInt, optInt2, false);
        tVar.R(new uc1.m0(this, p1Var));
        tVar.U(new uc1.n0(this, p1Var));
        tVar.w(new uc1.o0(this, tVar, appId, jSONObject));
        android.widget.FrameLayout frameLayout = p1Var.f435064c;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(frameLayout, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/jsapi/map/JsApiInsertMap", "inflateView", "(Lcom/tencent/mm/plugin/appbrand/jsapi/AppBrandComponentView;Lorg/json/JSONObject;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        frameLayout.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(frameLayout, "com/tencent/mm/plugin/appbrand/jsapi/map/JsApiInsertMap", "inflateView", "(Lcom/tencent/mm/plugin/appbrand/jsapi/AppBrandComponentView;Lorg/json/JSONObject;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        return new com.tencent.mm.plugin.appbrand.jsapi.coverview.CoverViewContainer(tVar.getContext(), frameLayout);
    }

    @Override // gb1.d
    public void N(com.tencent.mm.plugin.appbrand.jsapi.t tVar, int i17, android.view.View view, org.json.JSONObject jSONObject) {
        vc1.a3 b17 = vc1.h3.b(tVar.getAppId(), vc1.e3.b(tVar, jSONObject));
        if (b17 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiInsertMap", "mapView is null, error, return");
            return;
        }
        vc1.p1 p1Var = (vc1.p1) b17;
        p1Var.f435072g = new uc1.p0(this, i17, tVar);
        p1Var.f435074h = new uc1.q0(this, i17, tVar);
        p1Var.H = new uc1.r0(this, i17, tVar);
        p1Var.f435076i = new uc1.s0(this, i17, tVar);
        p1Var.I = new uc1.t0(this, i17, tVar);
        p1Var.e0(jSONObject.optBoolean("showLocation"));
        p1Var.c0(new uc1.u0(this, i17, tVar, b17));
        p1Var.M = new uc1.h0(this, i17, tVar);
        p1Var.f435078j = new uc1.i0(this, i17, tVar);
        p1Var.W(new uc1.j0(this, i17, tVar));
        p1Var.f435106x = new uc1.k0(this, i17, tVar);
        p1Var.f435108y = new uc1.l0(this, i17, tVar);
    }
}
