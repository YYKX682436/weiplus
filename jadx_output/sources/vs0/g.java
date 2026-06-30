package vs0;

/* loaded from: classes10.dex */
public final class g extends android.hardware.camera2.CameraCaptureSession.CaptureCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ vs0.j f439852a;

    public g(vs0.j jVar) {
        this.f439852a = jVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01aa A[EDGE_INSN: B:128:0x01aa->B:129:0x01aa BREAK  A[LOOP:0: B:109:0x016e->B:205:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0204 A[EDGE_INSN: B:151:0x0204->B:152:0x0204 BREAK  A[LOOP:1: B:138:0x01d6->B:183:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:156:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:183:? A[LOOP:1: B:138:0x01d6->B:183:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:204:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:205:? A[LOOP:0: B:109:0x016e->B:205:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(android.hardware.camera2.CaptureResult r12) {
        /*
            Method dump skipped, instructions count: 746
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: vs0.g.a(android.hardware.camera2.CaptureResult):void");
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureCompleted(android.hardware.camera2.CameraCaptureSession session, android.hardware.camera2.CaptureRequest request, android.hardware.camera2.TotalCaptureResult result) {
        kotlin.jvm.internal.o.g(session, "session");
        kotlin.jvm.internal.o.g(request, "request");
        kotlin.jvm.internal.o.g(result, "result");
        a(result);
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureProgressed(android.hardware.camera2.CameraCaptureSession session, android.hardware.camera2.CaptureRequest request, android.hardware.camera2.CaptureResult partialResult) {
        kotlin.jvm.internal.o.g(session, "session");
        kotlin.jvm.internal.o.g(request, "request");
        kotlin.jvm.internal.o.g(partialResult, "partialResult");
        a(partialResult);
    }
}
