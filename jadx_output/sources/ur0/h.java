package ur0;

/* loaded from: classes14.dex */
public final class h extends vs0.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ur0.s f430298a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f430299b;

    public h(ur0.s sVar, int i17) {
        this.f430298a = sVar;
        this.f430299b = i17;
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public void onDisconnected(android.hardware.camera2.CameraDevice camera) {
        kotlin.jvm.internal.o.g(camera, "camera");
        com.tencent.mars.xlog.Log.e("MicroMsg.Camera.Camera2Impl", "sessionCallback onDisconnected " + camera.hashCode());
        ur0.s sVar = this.f430298a;
        nr0.y yVar = sVar.f411433g;
        if (yVar != null) {
            ((pr0.n) yVar).m("Camera2Close", new ur0.e(camera, sVar, null));
        }
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public void onError(android.hardware.camera2.CameraDevice camera, int i17) {
        kotlin.jvm.internal.o.g(camera, "camera");
        com.tencent.mars.xlog.Log.e("MicroMsg.Camera.Camera2Impl", "sessionCallback onError:" + i17);
        as0.a.f13425a.b(this.f430299b, false);
        ur0.s sVar = this.f430298a;
        nr0.y yVar = sVar.f411433g;
        if (yVar != null) {
            ((pr0.n) yVar).m("Camera2Close", new ur0.f(camera, sVar, null));
        }
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public void onOpened(android.hardware.camera2.CameraDevice camera) {
        ur0.s sVar;
        nr0.y yVar;
        kotlin.jvm.internal.o.g(camera, "camera");
        com.tencent.mars.xlog.Log.i("MicroMsg.Camera.Camera2Impl", "sessionCallback onOpened " + camera.hashCode());
        if (this.f430298a.f411437n.f456160b.f456175a.f456173a > 0 && (yVar = (sVar = this.f430298a).f411433g) != null) {
            ((pr0.n) yVar).m("createCaptureSession", new ur0.g(camera, sVar, null));
        }
    }
}
