package tb1;

/* loaded from: classes7.dex */
public class s0 extends gb1.f {
    private static final int CTRL_INDEX = 330;
    public static final java.lang.String NAME = "removeCamera";

    @Override // gb1.i
    public int H(org.json.JSONObject jSONObject) {
        return jSONObject.optInt("cameraId", 0);
    }

    @Override // gb1.f
    public boolean J(com.tencent.mm.plugin.appbrand.jsapi.t tVar, int i17, android.view.View view, org.json.JSONObject jSONObject) {
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiRemoveCamera", "onRemoveView cameraId=%d", java.lang.Integer.valueOf(i17));
        if (!(view instanceof com.tencent.mm.plugin.appbrand.jsapi.coverview.CoverViewContainer)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.JsApiRemoveCamera", "the view(%s) is not a instance of CoverViewContainer", java.lang.Integer.valueOf(i17));
            return false;
        }
        android.view.KeyEvent.Callback callback = (android.view.View) ((com.tencent.mm.plugin.appbrand.jsapi.coverview.CoverViewContainer) view).d(android.view.View.class);
        if (callback == null || !(callback instanceof tb1.a0)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.JsApiRemoveCamera", "the camera view(%s) is null", java.lang.Integer.valueOf(i17));
            return false;
        }
        tb1.a0 a0Var = (tb1.a0) callback;
        tVar.I(a0Var);
        tVar.O(a0Var);
        tVar.K(a0Var);
        tb1.b.f416889a.b(a0Var.getCameraId(), true);
        ((com.tencent.mm.plugin.appbrand.jsapi.camera.AppBrandCameraView) a0Var).i();
        return true;
    }
}
