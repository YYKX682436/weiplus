package tb1;

/* loaded from: classes7.dex */
public class t0 extends gb1.h {
    private static final int CTRL_INDEX = 331;
    public static final java.lang.String NAME = "updateCamera";

    @Override // gb1.i
    public int H(org.json.JSONObject jSONObject) {
        return jSONObject.optInt("cameraId");
    }

    @Override // gb1.h
    public boolean K(com.tencent.mm.plugin.appbrand.jsapi.t tVar, int i17, android.view.View view, org.json.JSONObject jSONObject) {
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiUpdateCamera", "onUpdateView : cameraId=%d", java.lang.Integer.valueOf(i17));
        if (!(view instanceof com.tencent.mm.plugin.appbrand.jsapi.coverview.CoverViewContainer)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.JsApiUpdateCamera", "the view(%s) is not a instance of CoverViewContainer", java.lang.Integer.valueOf(i17));
            return false;
        }
        android.view.KeyEvent.Callback callback = (android.view.View) ((com.tencent.mm.plugin.appbrand.jsapi.coverview.CoverViewContainer) view).d(android.view.View.class);
        if (callback == null || !(callback instanceof tb1.a0)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.JsApiUpdateCamera", "the camera view(%s) is null", java.lang.Integer.valueOf(i17));
            return false;
        }
        tb1.a0 a0Var = (tb1.a0) callback;
        jSONObject.optInt("cameraId");
        java.lang.String optString = jSONObject.optString(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_DEVICE_POSITION, "back");
        java.lang.String optString2 = jSONObject.optString("flash", "auto");
        boolean optBoolean = jSONObject.optBoolean("needOutput", false);
        a0Var.setAppId(tVar.getAppId());
        com.tencent.mm.plugin.appbrand.jsapi.camera.AppBrandCameraView appBrandCameraView = (com.tencent.mm.plugin.appbrand.jsapi.camera.AppBrandCameraView) a0Var;
        appBrandCameraView.k(optString, false);
        a0Var.setFlash(optString2);
        a0Var.setNeedOutput(optBoolean);
        org.json.JSONObject optJSONObject = jSONObject.optJSONObject("position");
        int j17 = ik1.w.j(optJSONObject, "width", 0);
        int j18 = ik1.w.j(optJSONObject, "height", 0);
        boolean p17 = (j17 == 0 || j18 == 0) ? false : appBrandCameraView.p(j17, j18, false);
        tb1.y yVar = (tb1.y) tVar.q(tb1.y.class);
        if (yVar != null) {
            int[] a17 = ((uf1.h) yVar).a(tVar);
            if (a17.length == 2 && a17[0] > 0 && a17[1] > 0) {
                a0Var.setDisplayScreenSize(new android.util.Size(a17[0], a17[1]));
                com.tencent.mars.xlog.Log.i("MicroMsg.JsApiUpdateCamera", "onUpdateView screen width: %d, screen height: %d", java.lang.Integer.valueOf(a17[0]), java.lang.Integer.valueOf(a17[1]));
            }
        }
        java.lang.String optString3 = jSONObject.optString("mode");
        if (!com.tencent.mm.sdk.platformtools.t8.K0(optString3)) {
            a0Var.setMode(optString3);
        }
        org.json.JSONArray optJSONArray = jSONObject.optJSONArray("scanArea");
        if (optJSONArray != null && optJSONArray.length() == 4) {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiUpdateCamera", "scanAreaArray:%s, scanAreaArray.length:%d", optJSONArray, java.lang.Integer.valueOf(optJSONArray.length()));
            appBrandCameraView.n(ik1.w.c(optJSONArray.optInt(0)), ik1.w.c(optJSONArray.optInt(1)), ik1.w.c(optJSONArray.optInt(2)), ik1.w.c(optJSONArray.optInt(3)));
        }
        a0Var.setScanFreq(jSONObject.optInt("scanFreq"));
        if (p17) {
            appBrandCameraView.i();
            appBrandCameraView.h();
        } else {
            appBrandCameraView.r();
        }
        return true;
    }
}
