package tb1;

/* loaded from: classes7.dex */
public class h implements bi3.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.camera.AppBrandCameraView f416898a;

    public h(com.tencent.mm.plugin.appbrand.jsapi.camera.AppBrandCameraView appBrandCameraView) {
        this.f416898a = appBrandCameraView;
    }

    @Override // bi3.f
    public void a() {
        com.tencent.mars.xlog.Log.w("MicroMsg.AppBrandCameraView", "InitErrorCallback");
        java.util.HashMap hashMap = new java.util.HashMap();
        com.tencent.mm.plugin.appbrand.jsapi.camera.AppBrandCameraView appBrandCameraView = this.f416898a;
        hashMap.put("cameraId", java.lang.Integer.valueOf(appBrandCameraView.f80173i));
        java.lang.String jSONObject = new org.json.JSONObject(hashMap).toString();
        tb1.d0 d0Var = new tb1.d0();
        d0Var.f82374f = jSONObject;
        appBrandCameraView.f80169e.i(d0Var, null);
    }
}
