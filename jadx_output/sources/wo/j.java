package wo;

/* loaded from: classes14.dex */
public class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f447727d;

    public j(wo.k kVar, int i17) {
        this.f447727d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17 = this.f447727d;
        try {
            android.hardware.Camera.CameraInfo cameraInfo = new android.hardware.Camera.CameraInfo();
            android.hardware.Camera.getCameraInfo(i17, cameraInfo);
            uo.q.f429532a.g(i17, cameraInfo);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CameraUtil.CameraUtilImpl22", "CameraUtilImpl22 update cache failed : " + th6.getMessage());
        }
    }
}
