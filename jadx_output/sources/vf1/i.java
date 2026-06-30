package vf1;

/* loaded from: classes7.dex */
public class i extends vf1.a {
    private static final int CTRL_INDEX = 807;
    public static final java.lang.String NAME = "updateXWebCamera";

    /* JADX WARN: Multi-variable type inference failed */
    public boolean F(com.tencent.mm.plugin.appbrand.jsapi.l lVar, android.view.Surface surface, tb1.b0 b0Var, org.json.JSONObject jSONObject) {
        boolean z17;
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiUpdateXWebCamera", "update xweb camera view");
        if (b0Var == 0) {
            com.tencent.mars.xlog.Log.w("MicroMsg.JsApiUpdateXWebCamera", "the camera view is null");
            return false;
        }
        jSONObject.optInt("cameraId");
        java.lang.String optString = jSONObject.optString(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_DEVICE_POSITION, "back");
        java.lang.String optString2 = jSONObject.optString("flash", "auto");
        boolean optBoolean = jSONObject.optBoolean("needOutput", false);
        b0Var.setAppId(lVar.getAppId());
        com.tencent.mm.plugin.appbrand.jsapi.camera.AppBrandCameraView appBrandCameraView = (com.tencent.mm.plugin.appbrand.jsapi.camera.AppBrandCameraView) b0Var;
        appBrandCameraView.k(optString, false);
        b0Var.setFlash(optString2);
        b0Var.setNeedOutput(optBoolean);
        if (surface != null) {
            b0Var.setCustomSurface(surface);
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiUpdateXWebCamera", "set a new surface when update camera");
            z17 = true;
        } else {
            z17 = false;
        }
        org.json.JSONObject optJSONObject = jSONObject.optJSONObject("position");
        int j17 = ik1.w.j(optJSONObject, "width", 0);
        int j18 = ik1.w.j(optJSONObject, "height", 0);
        boolean p17 = (j17 == 0 || j18 == 0) ? false : appBrandCameraView.p(j17, j18, false);
        if (lVar instanceof com.tencent.mm.plugin.appbrand.page.v5) {
            int[] a17 = com.tencent.mm.plugin.appbrand.utils.f5.a((com.tencent.mm.plugin.appbrand.page.v5) lVar);
            b0Var.setDisplayScreenSize(new android.util.Size(a17[0], a17[1]));
        }
        java.lang.String optString3 = jSONObject.optString("mode");
        if (!com.tencent.mm.sdk.platformtools.t8.K0(optString3)) {
            b0Var.setMode(optString3);
        }
        org.json.JSONArray optJSONArray = jSONObject.optJSONArray("scanArea");
        if (optJSONArray != null && optJSONArray.length() == 4) {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiUpdateXWebCamera", "scanAreaArray:%s, scanAreaArray.length:%d", optJSONArray, java.lang.Integer.valueOf(optJSONArray.length()));
            appBrandCameraView.n(ik1.w.c(optJSONArray.optInt(0)), ik1.w.c(optJSONArray.optInt(1)), ik1.w.c(optJSONArray.optInt(2)), ik1.w.c(optJSONArray.optInt(3)));
        }
        b0Var.setScanFreq(jSONObject.optInt("scanFreq"));
        if (p17 || z17) {
            appBrandCameraView.i();
            appBrandCameraView.h();
        } else {
            appBrandCameraView.r();
        }
        return true;
    }
}
