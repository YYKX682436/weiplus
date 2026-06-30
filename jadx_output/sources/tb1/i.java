package tb1;

/* loaded from: classes7.dex */
public class i implements bi3.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.camera.AppBrandCameraView f416899a;

    public i(com.tencent.mm.plugin.appbrand.jsapi.camera.AppBrandCameraView appBrandCameraView) {
        this.f416899a = appBrandCameraView;
    }

    @Override // bi3.e
    public void a() {
        com.tencent.mm.plugin.appbrand.jsapi.camera.AppBrandCameraView appBrandCameraView = this.f416899a;
        appBrandCameraView.Q = true;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandCameraView", "InitDoneCallback");
        tb1.c0 c0Var = new tb1.c0();
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("cameraId", java.lang.Integer.valueOf(appBrandCameraView.f80173i));
        com.tencent.mm.plugin.mmsight.api.MMSightRecordView mMSightRecordView = appBrandCameraView.F;
        float[] supportZoomMultiple = mMSightRecordView != null ? mMSightRecordView.getSupportZoomMultiple() : null;
        if (supportZoomMultiple != null && supportZoomMultiple.length > 0) {
            appBrandCameraView.R = supportZoomMultiple[supportZoomMultiple.length - 1];
        }
        hashMap.put("maxZoom", java.lang.Float.valueOf(appBrandCameraView.R));
        c0Var.f82374f = new org.json.JSONObject(hashMap).toString();
        appBrandCameraView.f80169e.i(c0Var, null);
        java.util.List list = appBrandCameraView.W;
        if (list != null) {
            java.util.Iterator it = ((java.util.ArrayList) list).iterator();
            while (it.hasNext()) {
                ((java.lang.Runnable) it.next()).run();
            }
            ((java.util.ArrayList) appBrandCameraView.W).clear();
        }
        tb1.z zVar = appBrandCameraView.D;
        if (zVar != null) {
            zVar.onInit();
        }
    }
}
