package r9;

/* loaded from: classes7.dex */
public final class i0 implements r9.c0 {

    /* renamed from: a, reason: collision with root package name */
    public final r9.n f393368a;

    /* renamed from: b, reason: collision with root package name */
    public final r9.k f393369b;

    /* renamed from: c, reason: collision with root package name */
    public final r9.h0 f393370c;

    /* renamed from: d, reason: collision with root package name */
    public volatile java.lang.Object f393371d;

    /* renamed from: e, reason: collision with root package name */
    public volatile boolean f393372e;

    /* renamed from: f, reason: collision with root package name */
    public volatile long f393373f;

    public i0(r9.k kVar, android.net.Uri uri, int i17, r9.h0 h0Var) {
        this.f393369b = kVar;
        this.f393368a = new r9.n(uri, 1);
        this.f393370c = h0Var;
    }

    @Override // r9.c0
    public final void a() {
        r9.m mVar = new r9.m(this.f393369b, this.f393368a);
        try {
            if (!mVar.f393380g) {
                mVar.f393377d.b(mVar.f393378e);
                mVar.f393380g = true;
            }
            this.f393371d = ((h9.g) this.f393370c).b(this.f393369b.getUri(), mVar);
        } finally {
            this.f393373f = mVar.f393382i;
            t9.d0.d(mVar);
        }
    }

    @Override // r9.c0
    public final boolean b() {
        return this.f393372e;
    }

    @Override // r9.c0
    public final void c() {
        this.f393372e = true;
    }
}
