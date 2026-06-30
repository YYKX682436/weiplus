package r36;

/* loaded from: classes16.dex */
public class h extends x36.q {

    /* renamed from: e, reason: collision with root package name */
    public boolean f369406e;

    /* renamed from: f, reason: collision with root package name */
    public long f369407f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r36.i f369408g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(r36.i iVar, x36.h0 h0Var) {
        super(h0Var);
        this.f369408g = iVar;
        this.f369406e = false;
        this.f369407f = 0L;
    }

    @Override // x36.q, x36.h0
    public long B(x36.k kVar, long j17) {
        try {
            long B = this.f451701d.B(kVar, j17);
            if (B > 0) {
                this.f369407f += B;
            }
            return B;
        } catch (java.io.IOException e17) {
            if (!this.f369406e) {
                this.f369406e = true;
                r36.i iVar = this.f369408g;
                iVar.f369419b.i(false, iVar, this.f369407f, e17);
            }
            throw e17;
        }
    }

    @Override // x36.q, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        super.close();
        if (this.f369406e) {
            return;
        }
        this.f369406e = true;
        r36.i iVar = this.f369408g;
        iVar.f369419b.i(false, iVar, this.f369407f, null);
    }
}
