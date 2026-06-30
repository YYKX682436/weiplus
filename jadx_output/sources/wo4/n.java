package wo4;

/* loaded from: classes10.dex */
public final class n extends kotlin.jvm.internal.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wo4.y f448282d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(wo4.y yVar) {
        super(3);
        this.f448282d = yVar;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        java.nio.ByteBuffer buffer = (java.nio.ByteBuffer) obj;
        android.media.MediaCodec.BufferInfo bufferInfo = (android.media.MediaCodec.BufferInfo) obj2;
        android.media.MediaFormat format = (android.media.MediaFormat) obj3;
        kotlin.jvm.internal.o.g(buffer, "buffer");
        kotlin.jvm.internal.o.g(bufferInfo, "bufferInfo");
        kotlin.jvm.internal.o.g(format, "format");
        this.f448282d.f448311r.c(buffer, bufferInfo, format);
        return jz5.f0.f302826a;
    }
}
