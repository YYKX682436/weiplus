package vs0;

/* loaded from: classes10.dex */
public final class f extends vs0.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ vs0.j f439851a;

    public f(vs0.j jVar) {
        this.f439851a = jVar;
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public void onDisconnected(android.hardware.camera2.CameraDevice camera) {
        kotlin.jvm.internal.o.g(camera, "camera");
        vs0.j jVar = this.f439851a;
        jVar.B.release();
        camera.close();
        jVar.D = null;
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public void onError(android.hardware.camera2.CameraDevice camera, int i17) {
        kotlin.jvm.internal.o.g(camera, "camera");
        onDisconnected(camera);
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public void onOpened(android.hardware.camera2.CameraDevice camera) {
        kotlin.jvm.internal.o.g(camera, "camera");
        vs0.j jVar = this.f439851a;
        jVar.B.release();
        jVar.D = camera;
    }
}
