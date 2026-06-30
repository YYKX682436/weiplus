package wo5;

/* loaded from: classes13.dex */
public final class e implements uo5.p {

    /* renamed from: a, reason: collision with root package name */
    public final to5.c f448321a;

    /* renamed from: b, reason: collision with root package name */
    public final int f448322b;

    /* renamed from: c, reason: collision with root package name */
    public java.nio.ByteBuffer f448323c;

    /* renamed from: d, reason: collision with root package name */
    public final int f448324d;

    /* renamed from: e, reason: collision with root package name */
    public int f448325e;

    public e(to5.c engineOp, boolean z17, int i17) {
        kotlin.jvm.internal.o.g(engineOp, "engineOp");
        this.f448321a = engineOp;
        this.f448322b = i17;
        this.f448323c = java.nio.ByteBuffer.allocateDirect(0);
        this.f448324d = z17 ? 19 : 18;
    }

    @Override // uo5.p
    public void a(java.nio.ByteBuffer buffer, android.media.MediaCodec.BufferInfo info) {
        kotlin.jvm.internal.o.g(buffer, "buffer");
        kotlin.jvm.internal.o.g(info, "info");
        int i17 = info.flags;
        if (i17 == 2) {
            if (info.size != this.f448323c.capacity()) {
                this.f448323c = java.nio.ByteBuffer.allocateDirect(info.size);
            }
            this.f448323c.clear();
            buffer.clear();
            buffer.position(info.offset);
            buffer.limit(info.offset + info.size);
            this.f448323c.put(buffer);
            return;
        }
        if (i17 == 1) {
            this.f448323c.clear();
            to5.c cVar = this.f448321a;
            java.nio.ByteBuffer spsArray = this.f448323c;
            kotlin.jvm.internal.o.f(spsArray, "spsArray");
            cVar.a(spsArray, this.f448322b, 2, this.f448324d, wo5.c.f448319d);
        }
        buffer.clear();
        buffer.position(info.offset);
        buffer.limit(info.offset + info.size);
        this.f448321a.a(buffer, this.f448322b, info.flags, this.f448324d, wo5.d.f448320d);
        int i18 = this.f448325e + 1;
        this.f448325e = i18;
        if (i18 % 60 == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.HW.ILinkVoIPEncodeDataCallbackProxy", "onOutputBufferAvailable: send data " + this.f448325e + " for " + this.f448322b);
        }
    }

    @Override // uo5.p
    public void b(java.nio.ByteBuffer buffer, yz5.l callback) {
        kotlin.jvm.internal.o.g(buffer, "buffer");
        kotlin.jvm.internal.o.g(callback, "callback");
        throw new java.lang.RuntimeException("encoder not call this func");
    }

    @Override // uo5.p
    public void c(int i17, int i18) {
    }
}
