package n36;

/* loaded from: classes16.dex */
public final class j implements java.io.Closeable {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f334831d;

    /* renamed from: e, reason: collision with root package name */
    public final long f334832e;

    /* renamed from: f, reason: collision with root package name */
    public final x36.h0[] f334833f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ n36.k f334834g;

    public j(n36.k kVar, java.lang.String str, long j17, x36.h0[] h0VarArr, long[] jArr) {
        this.f334834g = kVar;
        this.f334831d = str;
        this.f334832e = j17;
        this.f334833f = h0VarArr;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        for (x36.h0 h0Var : this.f334833f) {
            m36.e.c(h0Var);
        }
    }
}
