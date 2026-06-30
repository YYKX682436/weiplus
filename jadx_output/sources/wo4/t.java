package wo4;

/* loaded from: classes10.dex */
public final class t extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wo4.y f448289d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(wo4.y yVar) {
        super(2);
        this.f448289d = yVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        java.nio.ByteBuffer byteBuffer = (java.nio.ByteBuffer) obj;
        android.media.MediaCodec.BufferInfo bufferInfo = (android.media.MediaCodec.BufferInfo) obj2;
        kotlin.jvm.internal.o.g(byteBuffer, "byteBuffer");
        kotlin.jvm.internal.o.g(bufferInfo, "bufferInfo");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("writeH264Data  ,bufferInfo.size : ");
        sb6.append(bufferInfo.size);
        sb6.append("  frameCount :");
        wo4.y yVar = this.f448289d;
        int i17 = yVar.f448300g;
        yVar.f448300g = i17 + 1;
        sb6.append(i17);
        sb6.append("  presentationTimeUs:");
        sb6.append(bufferInfo.presentationTimeUs);
        com.tencent.mars.xlog.Log.i("MicroMsg.VLogRemuxer", sb6.toString());
        yVar.f448311r.e(byteBuffer, bufferInfo);
        return jz5.f0.f302826a;
    }
}
