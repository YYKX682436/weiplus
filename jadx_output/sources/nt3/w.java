package nt3;

/* loaded from: classes10.dex */
public final class w extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nt3.a0 f339813d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(nt3.a0 a0Var) {
        super(2);
        this.f339813d = a0Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        jz5.f0 f0Var;
        yz5.p pVar;
        java.nio.ByteBuffer byteBuffer = (java.nio.ByteBuffer) obj;
        android.media.MediaCodec.BufferInfo bufferInfo = (android.media.MediaCodec.BufferInfo) obj2;
        kotlin.jvm.internal.o.g(byteBuffer, "byteBuffer");
        kotlin.jvm.internal.o.g(bufferInfo, "bufferInfo");
        com.tencent.mars.xlog.Log.i(this.f339813d.f339722m, "onEncode: " + this.f339813d.I + ", isDecodeEnd:" + this.f339813d.K + ", drawFrameCount:" + this.f339813d.f339709J + ", decodeFrameCount:" + this.f339813d.H);
        nt3.a0 a0Var = this.f339813d;
        a0Var.I = a0Var.I + 1;
        ls0.w0 w0Var = a0Var.B;
        jz5.f0 f0Var2 = jz5.f0.f302826a;
        if (w0Var == null || (pVar = w0Var.f320952l) == null) {
            f0Var = null;
        } else {
            ((ls0.v0) pVar).invoke(byteBuffer, bufferInfo);
            f0Var = f0Var2;
        }
        kotlin.jvm.internal.o.d(f0Var);
        nt3.a0.e(this.f339813d);
        return f0Var2;
    }
}
