package wo;

/* loaded from: classes14.dex */
public class m implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f447735d;

    public m(wo.n nVar, int i17) {
        this.f447735d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17 = this.f447735d;
        try {
            android.hardware.Camera.CameraInfo cameraInfo = new android.hardware.Camera.CameraInfo();
            android.hardware.Camera.getCameraInfo(i17, cameraInfo);
            uo.q.f429532a.g(i17, cameraInfo);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("CameraUtilImplConfig", "CameraUtilImplConfig update CameraInfo Cache failed : " + th6.getMessage());
        }
    }
}
