package v8;

/* loaded from: classes15.dex */
public class d implements v8.i, q8.m {

    /* renamed from: a, reason: collision with root package name */
    public long[] f433986a;

    /* renamed from: b, reason: collision with root package name */
    public long[] f433987b;

    /* renamed from: c, reason: collision with root package name */
    public long f433988c = -1;

    /* renamed from: d, reason: collision with root package name */
    public long f433989d = -1;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ v8.e f433990e;

    public d(v8.e eVar) {
        this.f433990e = eVar;
    }

    @Override // v8.i
    public q8.m a() {
        return this;
    }

    @Override // v8.i
    public long b(long j17) {
        long j18 = (this.f433990e.f434022i * j17) / 1000000;
        this.f433989d = this.f433986a[t9.d0.c(this.f433986a, j18, true, true)];
        return j18;
    }

    @Override // q8.m
    public boolean c() {
        return true;
    }

    @Override // q8.m
    public long d(long j17) {
        return this.f433988c + this.f433987b[t9.d0.c(this.f433986a, (this.f433990e.f434022i * j17) / 1000000, true, true)];
    }

    @Override // v8.i
    public long e(q8.f fVar) {
        long j17 = this.f433989d;
        if (j17 < 0) {
            return -1L;
        }
        long j18 = -(j17 + 2);
        this.f433989d = -1L;
        return j18;
    }

    @Override // q8.m
    public long g() {
        return (this.f433990e.f433991n.f416516d * 1000000) / r0.f416513a;
    }
}
