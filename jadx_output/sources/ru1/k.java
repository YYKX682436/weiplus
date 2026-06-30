package ru1;

/* loaded from: classes13.dex */
public final class k extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ru1.t f399721d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(ru1.t tVar) {
        super(2);
        this.f399721d = tVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        java.nio.ByteBuffer data = (java.nio.ByteBuffer) obj;
        android.media.MediaCodec.BufferInfo bufferInfo = (android.media.MediaCodec.BufferInfo) obj2;
        kotlin.jvm.internal.o.g(data, "data");
        kotlin.jvm.internal.o.g(bufferInfo, "bufferInfo");
        ru1.t.b(this.f399721d, bufferInfo, data);
        return jz5.f0.f302826a;
    }
}
