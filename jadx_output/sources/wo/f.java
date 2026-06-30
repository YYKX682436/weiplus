package wo;

/* loaded from: classes14.dex */
public class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f447684d;

    public f(int i17) {
        this.f447684d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            int d17 = uo.q.f429532a.d();
            android.hardware.Camera.CameraInfo cameraInfo = new android.hardware.Camera.CameraInfo();
            int i17 = 0;
            while (true) {
                if (i17 >= d17) {
                    i17 = 0;
                    break;
                }
                android.hardware.Camera.getCameraInfo(i17, cameraInfo);
                if (cameraInfo.facing == 0) {
                    break;
                } else {
                    i17++;
                }
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.CameraUtil", "getBackCameraId cacheBid = %d, noCacheBid = %d", java.lang.Integer.valueOf(this.f447684d), java.lang.Integer.valueOf(i17));
            uo.q qVar = uo.q.f429532a;
            com.tencent.mars.xlog.Log.i("MicroMsg.PluginCamera", "updateBackCameraId " + i17);
            uo.q.f429539h = i17;
            com.tencent.mm.sdk.platformtools.o4.L().A("PluginCamera_BackCameraId", i17);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CameraUtil", "getBackCameraId get cache failed : " + th6.getMessage());
        }
    }
}
