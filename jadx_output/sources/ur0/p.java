package ur0;

/* loaded from: classes14.dex */
public final class p extends android.hardware.camera2.CameraCaptureSession.StateCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ur0.s f430321a;

    public p(ur0.s sVar) {
        this.f430321a = sVar;
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public void onClosed(android.hardware.camera2.CameraCaptureSession session) {
        kotlin.jvm.internal.o.g(session, "session");
        super.onClosed(session);
        com.tencent.mars.xlog.Log.i("MicroMsg.Camera.Camera2Impl", "sessionCallback onClosed");
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public void onConfigureFailed(android.hardware.camera2.CameraCaptureSession session) {
        kotlin.jvm.internal.o.g(session, "session");
        com.tencent.mars.xlog.Log.e("MicroMsg.Camera.Camera2Impl", "sessionCallback onConfigureFailed");
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public void onConfigured(android.hardware.camera2.CameraCaptureSession session) {
        kotlin.jvm.internal.o.g(session, "session");
        com.tencent.mars.xlog.Log.i("MicroMsg.Camera.Camera2Impl", "sessionCallback onConfigured");
        ur0.s sVar = this.f430321a;
        nr0.y yVar = sVar.f411433g;
        if (yVar != null) {
            ((pr0.n) yVar).m("afterSessionFinishToPreview", new ur0.o(sVar, session, null));
        }
    }
}
