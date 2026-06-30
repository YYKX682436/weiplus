package o8;

/* loaded from: classes15.dex */
public class g extends o8.a {

    /* renamed from: e, reason: collision with root package name */
    public final o8.d f343609e = new o8.d();

    /* renamed from: f, reason: collision with root package name */
    public java.nio.ByteBuffer f343610f;

    /* renamed from: g, reason: collision with root package name */
    public long f343611g;

    /* renamed from: h, reason: collision with root package name */
    public final int f343612h;

    public g(int i17) {
        this.f343612h = i17;
    }

    public void l() {
        this.f343594d = 0;
        java.nio.ByteBuffer byteBuffer = this.f343610f;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
    }

    public final java.nio.ByteBuffer m(int i17) {
        int i18 = this.f343612h;
        if (i18 == 1) {
            return java.nio.ByteBuffer.allocate(i17);
        }
        if (i18 == 2) {
            return java.nio.ByteBuffer.allocateDirect(i17);
        }
        java.nio.ByteBuffer byteBuffer = this.f343610f;
        throw new java.lang.IllegalStateException("Buffer too small (" + (byteBuffer == null ? 0 : byteBuffer.capacity()) + " < " + i17 + ")");
    }

    public void n(int i17) {
        java.nio.ByteBuffer byteBuffer = this.f343610f;
        if (byteBuffer == null) {
            this.f343610f = m(i17);
            return;
        }
        int capacity = byteBuffer.capacity();
        int position = this.f343610f.position();
        int i18 = i17 + position;
        if (capacity >= i18) {
            return;
        }
        java.nio.ByteBuffer m17 = m(i18);
        if (position > 0) {
            this.f343610f.position(0);
            this.f343610f.limit(position);
            m17.put(this.f343610f);
        }
        this.f343610f = m17;
    }
}
