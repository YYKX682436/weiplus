package vc1;

/* loaded from: classes13.dex */
public class l0 implements com.tencent.tencentmap.mapsdk.vector.compat.utils.animation.MarkerTranslateAnimator.MarkerTranslateStatusListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ vc1.r2 f435004a;

    public l0(vc1.p1 p1Var, vc1.r2 r2Var) {
        this.f435004a = r2Var;
    }

    @Override // com.tencent.tencentmap.mapsdk.vector.compat.utils.animation.MarkerTranslateAnimator.MarkerTranslateStatusListener
    public void onInterpolatePoint(com.tencent.mapsdk.raster.model.LatLng latLng, int i17, com.tencent.tencentmap.mapsdk.vector.compat.utils.animation.MarkerTranslateAnimator.MarkerTranslateStatusListener.AnimationStatus animationStatus) {
        com.tencent.mm.plugin.appbrand.jsapi.t Q;
        vc1.r2 r2Var = this.f435004a;
        if (r2Var == null || latLng == null) {
            return;
        }
        double latitude = latLng.getLatitude();
        double longitude = latLng.getLongitude();
        int ordinal = animationStatus.ordinal();
        uc1.k1 k1Var = (uc1.k1) r2Var;
        k1Var.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiMoveMapMarkerAlong", "onInterpolatePoint index::%d, animationStatus:%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(ordinal));
        k1Var.f426327e.getClass();
        com.tencent.mm.plugin.appbrand.jsapi.l lVar = k1Var.f426323a;
        gb1.k kVar = (gb1.k) lVar.q(gb1.k.class);
        if (kVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiMoveMapMarkerAlong", "getComponentView NULL IComponentConverter");
            Q = null;
        } else {
            Q = kVar.Q(lVar, k1Var.f426324b);
        }
        if (Q == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiMoveMapMarkerAlong", "ComponentView is null.");
            return;
        }
        uc1.b1 b1Var = new uc1.b1();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("mapId", k1Var.f426325c);
            jSONObject.put("markerId", k1Var.f426326d);
            jSONObject.put("latitude", latitude);
            jSONObject.put("longitude", longitude);
            jSONObject.put(ya.b.INDEX, i17);
            jSONObject.put("animationStatus", ordinal);
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiMoveMapMarkerAlong", "put JSON data error : %s", e17);
        }
        b1Var.f82374f = jSONObject.toString();
        int componentId = Q.getComponentId();
        b1Var.p(lVar);
        b1Var.f82376h = componentId;
        b1Var.m();
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiMoveMapMarkerAlong", "OnMapInterpolatePointJsEvent:%s", jSONObject.toString());
    }

    @Override // com.tencent.tencentmap.mapsdk.vector.compat.utils.animation.MarkerTranslateAnimator.MarkerTranslateStatusListener
    public void onInterpolateRotation(float f17, com.tencent.tencentmap.mapsdk.vector.compat.utils.animation.MarkerTranslateAnimator.MarkerTranslateStatusListener.AnimationStatus animationStatus) {
    }
}
