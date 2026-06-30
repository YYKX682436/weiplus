package d7;

/* loaded from: classes7.dex */
public final class l implements d7.n {

    /* renamed from: a, reason: collision with root package name */
    public final java.nio.ByteBuffer f226821a;

    public l(java.nio.ByteBuffer byteBuffer) {
        this.f226821a = byteBuffer;
        byteBuffer.order(java.nio.ByteOrder.BIG_ENDIAN);
    }

    @Override // d7.n
    public int a() {
        return ((b() << 8) & 65280) | (b() & 255);
    }

    @Override // d7.n
    public int b() {
        java.nio.ByteBuffer byteBuffer = this.f226821a;
        if (byteBuffer.remaining() < 1) {
            return -1;
        }
        return byteBuffer.get();
    }

    @Override // d7.n
    public int c(byte[] bArr, int i17) {
        java.nio.ByteBuffer byteBuffer = this.f226821a;
        int min = java.lang.Math.min(i17, byteBuffer.remaining());
        if (min == 0) {
            return -1;
        }
        byteBuffer.get(bArr, 0, min);
        return min;
    }

    @Override // d7.n
    public long skip(long j17) {
        java.nio.ByteBuffer byteBuffer = this.f226821a;
        int min = (int) java.lang.Math.min(byteBuffer.remaining(), j17);
        byteBuffer.position(byteBuffer.position() + min);
        return min;
    }
}
