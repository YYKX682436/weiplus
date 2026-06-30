package t8;

/* loaded from: classes15.dex */
public final class d implements t8.b {

    /* renamed from: a, reason: collision with root package name */
    public final long[] f416337a;

    /* renamed from: b, reason: collision with root package name */
    public final long[] f416338b;

    /* renamed from: c, reason: collision with root package name */
    public final long f416339c;

    public d(long[] jArr, long[] jArr2, long j17) {
        this.f416337a = jArr;
        this.f416338b = jArr2;
        this.f416339c = j17;
    }

    @Override // q8.m
    public boolean c() {
        return true;
    }

    @Override // q8.m
    public long d(long j17) {
        return this.f416338b[t9.d0.c(this.f416337a, j17, true, true)];
    }

    @Override // t8.b
    public long f(long j17) {
        return this.f416337a[t9.d0.c(this.f416338b, j17, true, true)];
    }

    @Override // q8.m
    public long g() {
        return this.f416339c;
    }
}
