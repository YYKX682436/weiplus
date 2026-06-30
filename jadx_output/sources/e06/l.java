package e06;

/* loaded from: classes10.dex */
public abstract class l implements java.lang.Iterable, zz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final long f246217d;

    /* renamed from: e, reason: collision with root package name */
    public final long f246218e;

    /* renamed from: f, reason: collision with root package name */
    public final long f246219f;

    public l(long j17, long j18, long j19) {
        if (j19 == 0) {
            throw new java.lang.IllegalArgumentException("Step must be non-zero.");
        }
        if (j19 == Long.MIN_VALUE) {
            throw new java.lang.IllegalArgumentException("Step must be greater than Long.MIN_VALUE to avoid overflow on negation.");
        }
        this.f246217d = j17;
        this.f246218e = sz5.b.b(j17, j18, j19);
        this.f246219f = j19;
    }

    @Override // java.lang.Iterable
    public java.util.Iterator iterator() {
        return new e06.m(this.f246217d, this.f246218e, this.f246219f);
    }
}
