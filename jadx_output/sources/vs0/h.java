package vs0;

/* loaded from: classes10.dex */
public final class h extends android.hardware.camera2.CameraCaptureSession.StateCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ vs0.j f439853a;

    public h(vs0.j jVar) {
        this.f439853a = jVar;
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public void onClosed(android.hardware.camera2.CameraCaptureSession session) {
        kotlin.jvm.internal.o.g(session, "session");
        super.onClosed(session);
        vs0.j jVar = this.f439853a;
        com.tencent.mars.xlog.Log.i(jVar.f439857y, "session on close");
        jVar.K = true;
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public void onConfigureFailed(android.hardware.camera2.CameraCaptureSession session) {
        kotlin.jvm.internal.o.g(session, "session");
        com.tencent.mars.xlog.Log.i(this.f439853a.f439857y, "configure failed ");
        com.tencent.mars.xlog.Log.i("MicroMsg.MediaEditorIDKeyStat", "markCameraOpenFailed");
        com.tencent.mm.plugin.report.service.g0.INSTANCE.C(985L, 5L, 1L);
        com.tencent.mars.xlog.Log.i("MicroMsg.Camera2ProcessIDKeyStat", "markCamera2OpenFailed");
        com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1099L, 2L, 1L);
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public void onConfigured(android.hardware.camera2.CameraCaptureSession session) {
        kotlin.jvm.internal.o.g(session, "session");
        vs0.j jVar = this.f439853a;
        com.tencent.mars.xlog.Log.i(jVar.f439857y, "session on onConfigured");
        if (jVar.D == null) {
            return;
        }
        jVar.K = false;
        jVar.F = session;
        com.tencent.mars.xlog.Log.i("MicroMsg.MediaEditorIDKeyStat", "markCameraOpenSuccess");
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        g0Var.C(985L, 4L, 1L);
        com.tencent.mars.xlog.Log.i("MicroMsg.Camera2ProcessIDKeyStat", "markCamera2OpenSuccess");
        g0Var.C(1099L, 1L, 1L);
        try {
            android.hardware.camera2.CaptureRequest.Builder builder = jVar.E;
            kotlin.jvm.internal.o.d(builder);
            android.hardware.camera2.CaptureRequest build = builder.build();
            kotlin.jvm.internal.o.f(build, "build(...)");
            jVar.G = build;
            android.hardware.camera2.CameraCaptureSession cameraCaptureSession = jVar.F;
            if (cameraCaptureSession != null) {
                cameraCaptureSession.setRepeatingRequest(build, jVar.T, jVar.f421523e.f430449c);
            }
        } catch (android.hardware.camera2.CameraAccessException unused) {
        }
    }
}
