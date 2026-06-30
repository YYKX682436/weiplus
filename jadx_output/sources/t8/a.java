package t8;

/* loaded from: classes14.dex */
public final class a implements t8.b {

    /* renamed from: a, reason: collision with root package name */
    public final long f416319a;

    /* renamed from: b, reason: collision with root package name */
    public final int f416320b;

    /* renamed from: c, reason: collision with root package name */
    public final long f416321c;

    public a(long j17, int i17, long j18) {
        this.f416319a = j17;
        this.f416320b = i17;
        this.f416321c = j18 == -1 ? -9223372036854775807L : f(j18);
    }

    @Override // q8.m
    public boolean c() {
        return this.f416321c != -9223372036854775807L;
    }

    @Override // q8.m
    public long d(long j17) {
        long j18 = this.f416321c;
        if (j18 == -9223372036854775807L) {
            return 0L;
        }
        int i17 = t9.d0.f416498a;
        return this.f416319a + ((java.lang.Math.max(0L, java.lang.Math.min(j17, j18)) * this.f416320b) / 8000000);
    }

    @Override // t8.b
    public long f(long j17) {
        return ((java.lang.Math.max(0L, j17 - this.f416319a) * 1000000) * 8) / this.f416320b;
    }

    @Override // q8.m
    public long g() {
        return this.f416321c;
    }
}
