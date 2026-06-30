package p56;

/* loaded from: classes16.dex */
public abstract class r implements p56.m, p56.s {

    /* renamed from: d, reason: collision with root package name */
    public final u56.o f352103d;

    /* renamed from: e, reason: collision with root package name */
    public final p56.r f352104e;

    /* renamed from: f, reason: collision with root package name */
    public p56.n f352105f;

    /* renamed from: g, reason: collision with root package name */
    public long f352106g;

    public r() {
        this(null, false);
    }

    @Override // p56.s
    public final boolean b() {
        return this.f352103d.f424839e;
    }

    @Override // p56.s
    public final void c() {
        this.f352103d.c();
    }

    public final void d(p56.s sVar) {
        this.f352103d.a(sVar);
    }

    public void e() {
    }

    public final void f(long j17) {
        if (j17 < 0) {
            throw new java.lang.IllegalArgumentException("number requested cannot be negative: " + j17);
        }
        synchronized (this) {
            p56.n nVar = this.f352105f;
            if (nVar != null) {
                nVar.d(j17);
                return;
            }
            long j18 = this.f352106g;
            if (j18 == Long.MIN_VALUE) {
                this.f352106g = j17;
            } else {
                long j19 = j18 + j17;
                if (j19 < 0) {
                    this.f352106g = com.tencent.wcdb.core.Database.DictDefaultMatchValue;
                } else {
                    this.f352106g = j19;
                }
            }
        }
    }

    public void g(p56.n nVar) {
        long j17;
        p56.r rVar;
        boolean z17;
        synchronized (this) {
            j17 = this.f352106g;
            this.f352105f = nVar;
            rVar = this.f352104e;
            z17 = rVar != null && j17 == Long.MIN_VALUE;
        }
        if (z17) {
            rVar.g(nVar);
        } else if (j17 == Long.MIN_VALUE) {
            nVar.d(com.tencent.wcdb.core.Database.DictDefaultMatchValue);
        } else {
            nVar.d(j17);
        }
    }

    public r(p56.r rVar, boolean z17) {
        this.f352106g = Long.MIN_VALUE;
        this.f352104e = rVar;
        this.f352103d = (!z17 || rVar == null) ? new u56.o() : rVar.f352103d;
    }
}
