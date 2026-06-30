package ur0;

/* loaded from: classes14.dex */
public final class i extends android.hardware.camera2.CameraCaptureSession.CaptureCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f430300a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ur0.s f430301b;

    public i(int i17, ur0.s sVar) {
        this.f430300a = i17;
        this.f430301b = sVar;
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureBufferLost(android.hardware.camera2.CameraCaptureSession session, android.hardware.camera2.CaptureRequest request, android.view.Surface target, long j17) {
        kotlin.jvm.internal.o.g(session, "session");
        kotlin.jvm.internal.o.g(request, "request");
        kotlin.jvm.internal.o.g(target, "target");
        super.onCaptureBufferLost(session, request, target, j17);
        com.tencent.mars.xlog.Log.i("MicroMsg.Camera.Camera2Impl", "onCaptureBufferLost request:" + request);
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureCompleted(android.hardware.camera2.CameraCaptureSession session, android.hardware.camera2.CaptureRequest request, android.hardware.camera2.TotalCaptureResult result) {
        kotlin.jvm.internal.o.g(session, "session");
        kotlin.jvm.internal.o.g(request, "request");
        kotlin.jvm.internal.o.g(result, "result");
        com.tencent.mars.xlog.Log.i("MicroMsg.Camera.Camera2Impl", "onCaptureCompleted");
        super.onCaptureCompleted(session, request, result);
        com.tencent.mars.xlog.Log.i("MicroMsg.Camera.Camera2Impl", "handleAFResult");
        java.lang.Integer num = (java.lang.Integer) result.get(android.hardware.camera2.CaptureResult.CONTROL_AF_STATE);
        if ((num != null && num.intValue() == 4) || (num != null && num.intValue() == 5)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Camera.Camera2Impl", "STATE_TOUCH_FOCUSING and state is  " + result.get(android.hardware.camera2.CaptureResult.CONTROL_AF_STATE));
            ur0.s sVar = this.f430301b;
            android.hardware.camera2.CaptureRequest.Builder builder = sVar.f430332v;
            if (builder != null) {
                builder.set(android.hardware.camera2.CaptureRequest.CONTROL_AF_TRIGGER, 2);
            }
            android.hardware.camera2.CaptureRequest.Builder builder2 = sVar.f430332v;
            if (builder2 != null) {
                builder2.set(android.hardware.camera2.CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 0);
            }
            sVar.O();
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureFailed(android.hardware.camera2.CameraCaptureSession session, android.hardware.camera2.CaptureRequest request, android.hardware.camera2.CaptureFailure failure) {
        kotlin.jvm.internal.o.g(session, "session");
        kotlin.jvm.internal.o.g(request, "request");
        kotlin.jvm.internal.o.g(failure, "failure");
        super.onCaptureFailed(session, request, failure);
        as0.a.f13425a.b(this.f430300a, false);
        com.tencent.mars.xlog.Log.e("MicroMsg.Camera.Camera2Impl", "onCaptureFailed request:" + request);
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureProgressed(android.hardware.camera2.CameraCaptureSession session, android.hardware.camera2.CaptureRequest request, android.hardware.camera2.CaptureResult partialResult) {
        kotlin.jvm.internal.o.g(session, "session");
        kotlin.jvm.internal.o.g(request, "request");
        kotlin.jvm.internal.o.g(partialResult, "partialResult");
        super.onCaptureProgressed(session, request, partialResult);
        com.tencent.mars.xlog.Log.i("MicroMsg.Camera.Camera2Impl", "onCaptureProgressed request:" + request);
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureSequenceAborted(android.hardware.camera2.CameraCaptureSession session, int i17) {
        kotlin.jvm.internal.o.g(session, "session");
        super.onCaptureSequenceAborted(session, i17);
        com.tencent.mars.xlog.Log.i("MicroMsg.Camera.Camera2Impl", "onCaptureSequenceAborted");
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureSequenceCompleted(android.hardware.camera2.CameraCaptureSession session, int i17, long j17) {
        kotlin.jvm.internal.o.g(session, "session");
        super.onCaptureSequenceCompleted(session, i17, j17);
        com.tencent.mars.xlog.Log.i("MicroMsg.Camera.Camera2Impl", "onCaptureSequenceCompleted sequenceId:" + i17);
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureStarted(android.hardware.camera2.CameraCaptureSession session, android.hardware.camera2.CaptureRequest request, long j17, long j18) {
        kotlin.jvm.internal.o.g(session, "session");
        kotlin.jvm.internal.o.g(request, "request");
        com.tencent.mars.xlog.Log.i("MicroMsg.Camera.Camera2Impl", "onCaptureStarted");
        super.onCaptureStarted(session, request, j17, j18);
    }
}
