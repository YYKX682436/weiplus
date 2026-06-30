package q36;

/* loaded from: classes16.dex */
public class g extends q36.b {

    /* renamed from: h, reason: collision with root package name */
    public boolean f359997h;

    public g(q36.h hVar) {
        super(hVar, null);
    }

    @Override // q36.b, x36.h0
    public long B(x36.k kVar, long j17) {
        if (j17 < 0) {
            throw new java.lang.IllegalArgumentException("byteCount < 0: " + j17);
        }
        if (this.f359982e) {
            throw new java.lang.IllegalStateException("closed");
        }
        if (this.f359997h) {
            return -1L;
        }
        long B = super.B(kVar, j17);
        if (B != -1) {
            return B;
        }
        this.f359997h = true;
        a(true, null);
        return -1L;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f359982e) {
            return;
        }
        if (!this.f359997h) {
            a(false, null);
        }
        this.f359982e = true;
    }
}
