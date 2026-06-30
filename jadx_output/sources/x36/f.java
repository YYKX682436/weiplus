package x36;

/* loaded from: classes16.dex */
public final class f implements x36.h0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x36.g f451671d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ x36.h0 f451672e;

    public f(x36.g gVar, x36.h0 h0Var) {
        this.f451671d = gVar;
        this.f451672e = h0Var;
    }

    @Override // x36.h0
    public long B(x36.k sink, long j17) {
        kotlin.jvm.internal.o.g(sink, "sink");
        x36.g gVar = this.f451671d;
        gVar.i();
        try {
            long B = this.f451672e.B(sink, j17);
            if (gVar.j()) {
                throw gVar.k(null);
            }
            return B;
        } catch (java.io.IOException e17) {
            if (gVar.j()) {
                throw gVar.k(e17);
            }
            throw e17;
        } finally {
            gVar.j();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        x36.g gVar = this.f451671d;
        gVar.i();
        try {
            this.f451672e.close();
            if (gVar.j()) {
                throw gVar.k(null);
            }
        } catch (java.io.IOException e17) {
            if (!gVar.j()) {
                throw e17;
            }
            throw gVar.k(e17);
        } finally {
            gVar.j();
        }
    }

    @Override // x36.h0
    public x36.j0 h() {
        return this.f451671d;
    }

    public java.lang.String toString() {
        return "AsyncTimeout.source(" + this.f451672e + ')';
    }
}
