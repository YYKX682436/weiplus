package q36;

/* loaded from: classes16.dex */
public class d extends q36.b {

    /* renamed from: h, reason: collision with root package name */
    public final l36.k0 f359988h;

    /* renamed from: i, reason: collision with root package name */
    public long f359989i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f359990m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ q36.h f359991n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(q36.h hVar, l36.k0 k0Var) {
        super(hVar, null);
        this.f359991n = hVar;
        this.f359989i = -1L;
        this.f359990m = true;
        this.f359988h = k0Var;
    }

    @Override // q36.b, x36.h0
    public long B(x36.k kVar, long j17) {
        if (j17 < 0) {
            throw new java.lang.IllegalArgumentException("byteCount < 0: " + j17);
        }
        if (this.f359982e) {
            throw new java.lang.IllegalStateException("closed");
        }
        if (!this.f359990m) {
            return -1L;
        }
        long j18 = this.f359989i;
        if (j18 == 0 || j18 == -1) {
            q36.h hVar = this.f359991n;
            if (j18 != -1) {
                hVar.f360000c.L0();
            }
            try {
                this.f359989i = hVar.f360000c.t0();
                java.lang.String trim = hVar.f360000c.L0().trim();
                if (this.f359989i < 0 || !(trim.isEmpty() || trim.startsWith(";"))) {
                    throw new java.net.ProtocolException("expected chunk size and optional extensions but was \"" + this.f359989i + trim + "\"");
                }
                if (this.f359989i == 0) {
                    this.f359990m = false;
                    p36.g.d(hVar.f359998a.f315595o, this.f359988h, hVar.h());
                    a(true, null);
                }
                if (!this.f359990m) {
                    return -1L;
                }
            } catch (java.lang.NumberFormatException e17) {
                throw new java.net.ProtocolException(e17.getMessage());
            }
        }
        long B = super.B(kVar, java.lang.Math.min(j17, this.f359989i));
        if (B != -1) {
            this.f359989i -= B;
            return B;
        }
        java.net.ProtocolException protocolException = new java.net.ProtocolException("unexpected end of stream");
        a(false, protocolException);
        throw protocolException;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        boolean z17;
        if (this.f359982e) {
            return;
        }
        if (this.f359990m) {
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
