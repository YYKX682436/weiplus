package ls0;

/* loaded from: classes10.dex */
public final class m0 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ls0.r0 f320874d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(ls0.r0 r0Var) {
        super(2);
        this.f320874d = r0Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        jz5.f0 f0Var;
        yz5.p pVar;
        java.nio.ByteBuffer byteBuffer = (java.nio.ByteBuffer) obj;
        android.media.MediaCodec.BufferInfo bufferInfo = (android.media.MediaCodec.BufferInfo) obj2;
        kotlin.jvm.internal.o.g(byteBuffer, "byteBuffer");
        kotlin.jvm.internal.o.g(bufferInfo, "bufferInfo");
        com.tencent.mars.xlog.Log.i(this.f320874d.f320916t, "onEncode: " + this.f320874d.Y + ", isDecodeEnd:" + this.f320874d.f320896e0 + ", drawFrameCount:" + this.f320874d.Z + ", decodeFrameCount:" + this.f320874d.X + ", " + bufferInfo.presentationTimeUs);
        ls0.r0 r0Var = this.f320874d;
        r0Var.Y = r0Var.Y + 1;
        ls0.w0 w0Var = r0Var.Q;
        jz5.f0 f0Var2 = jz5.f0.f302826a;
        if (w0Var == null || (pVar = w0Var.f320952l) == null) {
            f0Var = null;
        } else {
            ((ls0.v0) pVar).invoke(byteBuffer, bufferInfo);
            f0Var = f0Var2;
        }
        kotlin.jvm.internal.o.d(f0Var);
        ls0.r0.e(this.f320874d);
        if (this.f320874d.f320888a0 != 0) {
            long currentTimeMillis = java.lang.System.currentTimeMillis() - this.f320874d.f320888a0;
            com.tencent.mars.xlog.Log.i("MicroMsg.MediaEditorIDKeyStat", "markFrameHandlingTime time:" + currentTimeMillis);
            if (currentTimeMillis < 1000) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.C(986L, 130L, 1L);
            } else if (currentTimeMillis < 2000) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.C(986L, 131L, 1L);
            } else if (currentTimeMillis < 3000) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.C(986L, 132L, 1L);
            } else if (currentTimeMillis < 4000) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.C(986L, 133L, 1L);
            } else if (currentTimeMillis < 5000) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.C(986L, 134L, 1L);
            } else if (currentTimeMillis < androidx.camera.core.RetryPolicy.DEFAULT_RETRY_TIMEOUT_IN_MILLIS) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.C(986L, 135L, 1L);
            } else if (currentTimeMillis < 7000) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.C(986L, 136L, 1L);
            } else if (currentTimeMillis < 8000) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.C(986L, 137L, 1L);
            } else if (currentTimeMillis < 9000) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.C(986L, 138L, 1L);
            } else if (currentTimeMillis < com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.C(986L, 139L, 1L);
            } else if (currentTimeMillis < 15000) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.C(986L, 140L, 1L);
            } else if (currentTimeMillis < 20000) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.C(986L, 141L, 1L);
            } else {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.C(986L, 142L, 1L);
            }
        }
        this.f320874d.f320888a0 = java.lang.System.currentTimeMillis();
        this.f320874d.f320904i0.b();
        ((ku5.t0) ku5.t0.f312615d).k(this.f320874d.f320904i0, r2.f320894d0);
        return f0Var2;
    }
}
