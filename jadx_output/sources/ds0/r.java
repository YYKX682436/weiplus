package ds0;

/* loaded from: classes10.dex */
public final class r extends kotlin.jvm.internal.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ds0.d0 f242827d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(ds0.d0 d0Var) {
        super(3);
        this.f242827d = d0Var;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        java.nio.ByteBuffer pcmData = (java.nio.ByteBuffer) obj;
        android.media.MediaCodec.BufferInfo bufferInfo = (android.media.MediaCodec.BufferInfo) obj2;
        android.media.MediaFormat desMediaFormat = (android.media.MediaFormat) obj3;
        kotlin.jvm.internal.o.g(pcmData, "pcmData");
        kotlin.jvm.internal.o.g(bufferInfo, "bufferInfo");
        kotlin.jvm.internal.o.g(desMediaFormat, "desMediaFormat");
        ds0.d0.a(this.f242827d, pcmData, bufferInfo, desMediaFormat);
        return jz5.f0.f302826a;
    }
}
