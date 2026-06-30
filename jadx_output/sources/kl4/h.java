package kl4;

/* loaded from: classes13.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final int f308908a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.ArrayDeque f308909b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.Object f308910c;

    public h(int i17, int i18, kotlin.jvm.internal.i iVar) {
        this.f308908a = (i18 & 1) != 0 ? 5 : i17;
        this.f308909b = new java.util.ArrayDeque();
        this.f308910c = new java.lang.Object();
    }

    public final com.tencent.unit_rc.ByteBuffer a(int i17, byte[] bArr) {
        synchronized (this.f308910c) {
            com.tencent.unit_rc.ByteBuffer byteBuffer = (com.tencent.unit_rc.ByteBuffer) this.f308909b.poll();
            if (byteBuffer != null) {
                if (!(byteBuffer.getData().capacity() >= i17)) {
                    byteBuffer = null;
                }
                if (byteBuffer != null) {
                    byteBuffer.getData().clear();
                    if (bArr != null) {
                        byteBuffer.getData().put(bArr);
                    }
                    return byteBuffer;
                }
            }
            com.tencent.unit_rc.ByteBuffer byteBuffer2 = new com.tencent.unit_rc.ByteBuffer(java.lang.Math.max(i17, bArr != null ? bArr.length : i17));
            if (bArr != null) {
                byteBuffer2.getData().put(bArr);
            }
            return byteBuffer2;
        }
    }

    public final void b(com.tencent.unit_rc.ByteBuffer... buffers) {
        kotlin.jvm.internal.o.g(buffers, "buffers");
        synchronized (this.f308910c) {
            for (com.tencent.unit_rc.ByteBuffer byteBuffer : buffers) {
                byteBuffer.getData().clear();
                if (this.f308909b.size() < this.f308908a) {
                    this.f308909b.offer(byteBuffer);
                }
            }
        }
    }
}
