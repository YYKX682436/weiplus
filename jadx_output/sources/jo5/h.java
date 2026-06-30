package jo5;

/* loaded from: classes14.dex */
public final class h extends android.hardware.camera2.CameraCaptureSession.StateCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ jo5.c f300944a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.hardware.camera2.CameraDevice f300945b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.view.Surface f300946c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jo5.i f300947d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f300948e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.CountDownLatch f300949f;

    public h(jo5.c cVar, android.hardware.camera2.CameraDevice cameraDevice, android.view.Surface surface, jo5.i iVar, kotlin.jvm.internal.c0 c0Var, java.util.concurrent.CountDownLatch countDownLatch) {
        this.f300944a = cVar;
        this.f300945b = cameraDevice;
        this.f300946c = surface;
        this.f300947d = iVar;
        this.f300948e = c0Var;
        this.f300949f = countDownLatch;
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public void onConfigureFailed(android.hardware.camera2.CameraCaptureSession session) {
        kotlin.jvm.internal.o.g(session, "session");
        this.f300949f.countDown();
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public void onConfigured(android.hardware.camera2.CameraCaptureSession session) {
        kotlin.jvm.internal.o.g(session, "session");
        jo5.c cVar = this.f300944a;
        cVar.f300937d = session;
        try {
            android.hardware.camera2.CaptureRequest.Builder createCaptureRequest = this.f300945b.createCaptureRequest(1);
            kotlin.jvm.internal.o.f(createCaptureRequest, "createCaptureRequest(...)");
            createCaptureRequest.addTarget(this.f300946c);
            android.hardware.camera2.CaptureRequest.Key key = android.hardware.camera2.CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE;
            android.util.Range range = cVar.f300939f;
            if (range == null) {
                range = new android.util.Range(15, 15);
            }
            createCaptureRequest.set(key, range);
            session.setRepeatingRequest(createCaptureRequest.build(), null, this.f300947d.b());
            cVar.f300936c.f300930f = com.tencent.mm.plugin.voipmp.platform.e.VoIPMPCameraStatusStarted;
            this.f300948e.f310112d = true;
        } catch (java.lang.Exception unused) {
        }
        this.f300949f.countDown();
    }
}
