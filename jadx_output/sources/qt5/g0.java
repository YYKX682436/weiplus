package qt5;

/* loaded from: classes14.dex */
public class g0 implements android.hardware.Camera.ErrorCallback {
    public g0(qt5.h0 h0Var) {
    }

    @Override // android.hardware.Camera.ErrorCallback
    public void onError(int i17, android.hardware.Camera camera) {
        com.tencent.stubs.logger.Log.e("CameraUtilImpl23", "camera.onError: %d", java.lang.Integer.valueOf(i17));
    }
}
