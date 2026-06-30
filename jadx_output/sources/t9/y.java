package t9;

/* loaded from: classes15.dex */
public final class y implements t9.j {

    /* renamed from: d, reason: collision with root package name */
    public boolean f416560d;

    /* renamed from: e, reason: collision with root package name */
    public long f416561e;

    /* renamed from: f, reason: collision with root package name */
    public long f416562f;

    /* renamed from: g, reason: collision with root package name */
    public m8.y f416563g = m8.y.f324678d;

    @Override // t9.j
    public m8.y a(m8.y yVar) {
        if (this.f416560d) {
            b(e());
        }
        this.f416563g = yVar;
        return yVar;
    }

    public void b(long j17) {
        this.f416561e = j17;
        if (this.f416560d) {
            this.f416562f = android.os.SystemClock.elapsedRealtime();
        }
    }

    @Override // t9.j
    public m8.y d() {
        return this.f416563g;
    }

    @Override // t9.j
    public long e() {
        long j17 = this.f416561e;
        if (!this.f416560d) {
            return j17;
        }
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime() - this.f416562f;
        return j17 + (this.f416563g.f324679a == 1.0f ? m8.b.a(elapsedRealtime) : elapsedRealtime * r4.f324681c);
    }
}
