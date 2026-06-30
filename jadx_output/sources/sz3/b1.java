package sz3;

/* loaded from: classes15.dex */
public final class b1 {

    /* renamed from: a, reason: collision with root package name */
    public final java.nio.ByteBuffer f413966a;

    /* renamed from: b, reason: collision with root package name */
    public byte[] f413967b;

    /* renamed from: c, reason: collision with root package name */
    public int f413968c = -1;

    /* renamed from: d, reason: collision with root package name */
    public int f413969d;

    /* renamed from: e, reason: collision with root package name */
    public int f413970e;

    /* renamed from: f, reason: collision with root package name */
    public int f413971f;

    public b1(byte[] bArr) {
        if (bArr != null) {
            this.f413966a = java.nio.ByteBuffer.wrap(bArr);
        } else {
            this.f413966a = null;
        }
    }

    public final byte[] a() {
        byte[] bArr = null;
        java.nio.ByteBuffer byteBuffer = this.f413966a;
        if (byteBuffer == null) {
            return null;
        }
        if (byteBuffer.hasArray()) {
            return byteBuffer.array();
        }
        if (this.f413967b == null) {
            if (byteBuffer != null && byteBuffer.remaining() > 0) {
                bArr = et5.h.f(byteBuffer);
            }
            this.f413967b = bArr;
        }
        return this.f413967b;
    }

    public b1(java.nio.ByteBuffer byteBuffer) {
        this.f413966a = byteBuffer;
    }
}
