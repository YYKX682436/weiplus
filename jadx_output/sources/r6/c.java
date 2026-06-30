package r6;

/* loaded from: classes13.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final r6.d f392744a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean[] f392745b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f392746c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r6.f f392747d;

    public c(r6.f fVar, r6.d dVar, r6.a aVar) {
        this.f392747d = fVar;
        this.f392744a = dVar;
        this.f392745b = dVar.f392752e ? null : new boolean[fVar.f392763m];
    }

    public void a() {
        r6.f.a(this.f392747d, this, false);
    }

    public java.io.File b(int i17) {
        java.io.File file;
        synchronized (this.f392747d) {
            r6.d dVar = this.f392744a;
            if (dVar.f392753f != this) {
                throw new java.lang.IllegalStateException();
            }
            if (!dVar.f392752e) {
                this.f392745b[i17] = true;
            }
            file = dVar.f392751d[i17];
            if (!this.f392747d.f392757d.exists()) {
                this.f392747d.f392757d.mkdirs();
            }
        }
        return file;
    }
}
