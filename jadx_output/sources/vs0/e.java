package vs0;

/* loaded from: classes10.dex */
public final class e extends android.hardware.camera2.CameraCaptureSession.CaptureCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ vs0.j f439850a;

    public e(vs0.j jVar) {
        this.f439850a = jVar;
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureCompleted(android.hardware.camera2.CameraCaptureSession session, android.hardware.camera2.CaptureRequest request, android.hardware.camera2.TotalCaptureResult result) {
        kotlin.jvm.internal.o.g(session, "session");
        kotlin.jvm.internal.o.g(request, "request");
        kotlin.jvm.internal.o.g(result, "result");
        vs0.c cVar = vs0.c.f439830a;
        android.hardware.camera2.CaptureRequest.Builder builder = this.f439850a.E;
        kotlin.jvm.internal.o.d(builder);
        cVar.e(builder);
    }
}
