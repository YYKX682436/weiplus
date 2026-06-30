package t;

/* loaded from: classes14.dex */
public final /* synthetic */ class a$$a implements androidx.camera.core.impl.CameraFactory.Provider {
    @Override // androidx.camera.core.impl.CameraFactory.Provider
    public final androidx.camera.core.impl.CameraFactory newInstance(android.content.Context context, androidx.camera.core.impl.CameraThreadConfig cameraThreadConfig, androidx.camera.core.CameraSelector cameraSelector, long j17) {
        return new androidx.camera.camera2.internal.Camera2CameraFactory(context, cameraThreadConfig, cameraSelector, j17);
    }
}
