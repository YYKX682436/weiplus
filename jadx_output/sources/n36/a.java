package n36;

/* loaded from: classes16.dex */
public class a implements x36.h0 {

    /* renamed from: d, reason: collision with root package name */
    public boolean f334809d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ x36.m f334810e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ n36.c f334811f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ x36.l f334812g;

    public a(n36.b bVar, x36.m mVar, n36.c cVar, x36.l lVar) {
        this.f334810e = mVar;
        this.f334811f = cVar;
        this.f334812g = lVar;
    }

    @Override // x36.h0
    public long B(x36.k kVar, long j17) {
        try {
            long B = this.f334810e.B(kVar, j17);
            x36.l lVar = this.f334812g;
            if (B != -1) {
                kVar.b(lVar.m(), kVar.f451694e - B, B);
                lVar.z0();
                return B;
            }
            if (!this.f334809d) {
                this.f334809d = true;
                lVar.close();
            }
            return -1L;
        } catch (java.io.IOException e17) {
            if (!this.f334809d) {
                this.f334809d = true;
                ((l36.f) this.f334811f).a();
            }
            throw e17;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        boolean z17;
        if (!this.f334809d) {
            try {
                z17 = m36.e.q(this, 100, java.util.concurrent.TimeUnit.MILLISECONDS);
            } catch (java.io.IOException unused) {
                z17 = false;
            }
            if (!z17) {
                this.f334809d = true;
                ((l36.f) this.f334811f).a();
            }
        }
        this.f334810e.close();
    }

    @Override // x36.h0
    public x36.j0 h() {
        return this.f334810e.h();
    }
}
