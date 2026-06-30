package wo;

/* loaded from: classes14.dex */
public class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f447686d;

    public g(int i17) {
        this.f447686d = i17;
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
                if (cameraInfo.facing == 1) {
                    break;
                } else {
                    i17++;
                }
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.CameraUtil", "getFrontCameraId cacheFid = %d, noCacheFid = %d", java.lang.Integer.valueOf(this.f447686d), java.lang.Integer.valueOf(i17));
            uo.q qVar = uo.q.f429532a;
            com.tencent.mars.xlog.Log.i("MicroMsg.PluginCamera", "updateFrontCameraId " + i17);
            uo.q.f429540i = i17;
            com.tencent.mm.sdk.platformtools.o4.L().A("PluginCamera_FrontCameraId", i17);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CameraUtil", "getFrontCameraId get cache failed : " + th6.getMessage());
        }
    }
}
