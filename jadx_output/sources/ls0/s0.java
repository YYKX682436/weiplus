package ls0;

/* loaded from: classes10.dex */
public final class s0 extends kotlin.jvm.internal.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ls0.w0 f320924d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(ls0.w0 w0Var) {
        super(3);
        this.f320924d = w0Var;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        java.nio.ByteBuffer data = (java.nio.ByteBuffer) obj;
        android.media.MediaCodec.BufferInfo bufferInfo = (android.media.MediaCodec.BufferInfo) obj2;
        android.media.MediaFormat format = (android.media.MediaFormat) obj3;
        kotlin.jvm.internal.o.g(data, "data");
        kotlin.jvm.internal.o.g(bufferInfo, "bufferInfo");
        kotlin.jvm.internal.o.g(format, "format");
        ls0.b1 b1Var = this.f320924d.f320943c;
        if (b1Var != null) {
            b1Var.c(data, bufferInfo, format);
        }
        return jz5.f0.f302826a;
    }
}
