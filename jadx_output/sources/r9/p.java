package r9;

/* loaded from: classes15.dex */
public final class p implements r9.e, r9.k0 {

    /* renamed from: a, reason: collision with root package name */
    public final t9.x f393397a;

    /* renamed from: b, reason: collision with root package name */
    public final t9.d f393398b;

    /* renamed from: c, reason: collision with root package name */
    public int f393399c;

    /* renamed from: d, reason: collision with root package name */
    public long f393400d;

    /* renamed from: e, reason: collision with root package name */
    public long f393401e;

    /* renamed from: f, reason: collision with root package name */
    public long f393402f;

    /* renamed from: g, reason: collision with root package name */
    public long f393403g;

    /* renamed from: h, reason: collision with root package name */
    public long f393404h;

    public p() {
        t9.d dVar = t9.d.f416497a;
        this.f393397a = new t9.x(2000);
        this.f393398b = dVar;
        this.f393404h = -1L;
    }

    @Override // r9.k0
    public synchronized void a(java.lang.Object obj, int i17) {
        this.f393401e += i17;
    }

    @Override // r9.k0
    public synchronized void b(java.lang.Object obj) {
        t9.a.d(this.f393399c > 0);
        ((t9.z) this.f393398b).getClass();
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        int i17 = (int) (elapsedRealtime - this.f393400d);
        long j17 = i17;
        this.f393402f += j17;
        long j18 = this.f393403g;
        long j19 = this.f393401e;
        this.f393403g = j18 + j19;
        if (i17 > 0) {
            this.f393397a.a((int) java.lang.Math.sqrt(j19), (float) ((8000 * j19) / j17));
            if (this.f393402f >= 2000 || this.f393403g >= 524288) {
                float b17 = this.f393397a.b(0.5f);
                this.f393404h = java.lang.Float.isNaN(b17) ? -1L : b17;
            }
        }
        int i18 = this.f393399c - 1;
        this.f393399c = i18;
        if (i18 > 0) {
            this.f393400d = elapsedRealtime;
        }
        this.f393401e = 0L;
    }

    @Override // r9.e
    public synchronized long c() {
        return this.f393404h;
    }

    @Override // r9.k0
    public synchronized void d(java.lang.Object obj, r9.n nVar) {
        if (this.f393399c == 0) {
            ((t9.z) this.f393398b).getClass();
            this.f393400d = android.os.SystemClock.elapsedRealtime();
        }
        this.f393399c++;
    }
}
