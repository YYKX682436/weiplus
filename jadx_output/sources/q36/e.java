package q36;

/* loaded from: classes16.dex */
public final class e implements x36.f0 {

    /* renamed from: d, reason: collision with root package name */
    public final x36.r f359992d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f359993e;

    /* renamed from: f, reason: collision with root package name */
    public long f359994f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ q36.h f359995g;

    public e(q36.h hVar, long j17) {
        this.f359995g = hVar;
        this.f359992d = new x36.r(hVar.f360001d.h());
        this.f359994f = j17;
    }

    @Override // x36.f0
    public void U(x36.k kVar, long j17) {
        if (this.f359993e) {
            throw new java.lang.IllegalStateException("closed");
        }
        long j18 = kVar.f451694e;
        byte[] bArr = m36.e.f323386a;
        if ((0 | j17) < 0 || 0 > j18 || j18 - 0 < j17) {
            throw new java.lang.ArrayIndexOutOfBoundsException();
        }
        if (j17 <= this.f359994f) {
            this.f359995g.f360001d.U(kVar, j17);
            this.f359994f -= j17;
        } else {
            throw new java.net.ProtocolException("expected " + this.f359994f + " bytes but received " + j17);
        }
    }

    @Override // x36.f0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f359993e) {
            return;
        }
        this.f359993e = true;
        if (this.f359994f > 0) {
            throw new java.net.ProtocolException("unexpected end of stream");
        }
        q36.h hVar = this.f359995g;
        hVar.getClass();
        x36.r rVar = this.f359992d;
        x36.j0 j0Var = rVar.f451702e;
        rVar.f451702e = x36.j0.f451689d;
        j0Var.a();
        j0Var.b();
        hVar.f360002e = 3;
    }

    @Override // x36.f0, java.io.Flushable
    public void flush() {
        if (this.f359993e) {
            return;
        }
        this.f359995g.f360001d.flush();
    }

    @Override // x36.f0
    public x36.j0 h() {
        return this.f359992d;
    }
}
