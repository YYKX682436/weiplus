package tb1;

/* loaded from: classes7.dex */
public class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.camera.AppBrandCameraView f416905d;

    public k(com.tencent.mm.plugin.appbrand.jsapi.camera.AppBrandCameraView appBrandCameraView) {
        this.f416905d = appBrandCameraView;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.jsapi.camera.AppBrandCameraView appBrandCameraView = this.f416905d;
        if (appBrandCameraView.f80175n.equals("auto")) {
            appBrandCameraView.F.setFlashMode(3);
            return;
        }
        if (appBrandCameraView.f80175n.equals("torch")) {
            appBrandCameraView.F.setFlashMode(1);
            return;
        }
        if (!appBrandCameraView.f80175n.equals("on")) {
            if (appBrandCameraView.f80175n.equals("torch")) {
                appBrandCameraView.F.setFlashMode(1);
                return;
            } else {
                appBrandCameraView.F.setFlashMode(2);
                return;
            }
        }
        int i17 = appBrandCameraView.f80167J;
        if (i17 == 2 || i17 == 4 || !appBrandCameraView.f80175n.equals("on")) {
            appBrandCameraView.F.setFlashMode(1);
        } else {
            appBrandCameraView.F.setFlashMode(2);
        }
    }
}
