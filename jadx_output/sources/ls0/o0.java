package ls0;

/* loaded from: classes10.dex */
public final class o0 extends kotlin.jvm.internal.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ls0.r0 f320878d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(ls0.r0 r0Var) {
        super(3);
        this.f320878d = r0Var;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        yz5.q qVar;
        java.nio.ByteBuffer buffer = (java.nio.ByteBuffer) obj;
        android.media.MediaCodec.BufferInfo bufferInfo = (android.media.MediaCodec.BufferInfo) obj2;
        android.media.MediaFormat format = (android.media.MediaFormat) obj3;
        kotlin.jvm.internal.o.g(buffer, "buffer");
        kotlin.jvm.internal.o.g(bufferInfo, "bufferInfo");
        kotlin.jvm.internal.o.g(format, "format");
        ls0.w0 w0Var = this.f320878d.Q;
        if (w0Var != null && (qVar = w0Var.f320953m) != null) {
            ((ls0.s0) qVar).invoke(buffer, bufferInfo, format);
        }
        return jz5.f0.f302826a;
    }
}
