package q36;

/* loaded from: classes16.dex */
public class f extends q36.b {

    /* renamed from: h, reason: collision with root package name */
    public long f359996h;

    public f(q36.h hVar, long j17) {
        super(hVar, null);
        this.f359996h = j17;
        if (j17 == 0) {
            a(true, null);
        }
    }

    @Override // q36.b, x36.h0
    public long B(x36.k kVar, long j17) {
        if (j17 < 0) {
            throw new java.lang.IllegalArgumentException("byteCount < 0: " + j17);
        }
        if (this.f359982e) {
            throw new java.lang.IllegalStateException("closed");
        }
        long j18 = this.f359996h;
        if (j18 == 0) {
            return -1L;
        }
        long B = super.B(kVar, java.lang.Math.min(j18, j17));
        if (B == -1) {
            java.net.ProtocolException protocolException = new java.net.ProtocolException("unexpected end of stream");
            a(false, protocolException);
            throw protocolException;
        }
        long j19 = this.f359996h - B;
        this.f359996h = j19;
        if (j19 == 0) {
            a(true, null);
        }
        return B;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        boolean z17;
        if (this.f359982e) {
            return;
        }
        if (this.f359996h != 0) {
            try {
                z17 = m36.e.q(this, 100, java.util.concurrent.TimeUnit.MILLISECONDS);
            } catch (java.io.IOException unused) {
                z17 = false;
            }
            if (!z17) {
                a(false, null);
            }
        }
        this.f359982e = true;
    }
}
