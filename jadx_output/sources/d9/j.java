package d9;

/* loaded from: classes15.dex */
public final class j implements d9.g0 {

    /* renamed from: a, reason: collision with root package name */
    public final d9.x f227351a;

    /* renamed from: b, reason: collision with root package name */
    public final d9.g0 f227352b;

    /* renamed from: c, reason: collision with root package name */
    public final long f227353c;

    /* renamed from: d, reason: collision with root package name */
    public final long f227354d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f227355e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f227356f;

    public j(d9.x xVar, d9.g0 g0Var, long j17, long j18, boolean z17) {
        this.f227351a = xVar;
        this.f227352b = g0Var;
        this.f227353c = j17;
        this.f227354d = j18;
        this.f227355e = z17;
    }

    @Override // d9.g0
    public int a(m8.s sVar, o8.g gVar, boolean z17) {
        if (this.f227355e) {
            return -3;
        }
        if (this.f227356f) {
            gVar.f343594d = 4;
            return -4;
        }
        int a17 = this.f227352b.a(sVar, gVar, z17);
        long j17 = this.f227354d;
        if (j17 == Long.MIN_VALUE || ((a17 != -4 || gVar.f343611g < j17) && !(a17 == -3 && this.f227351a.m() == Long.MIN_VALUE))) {
            if (a17 == -4 && !gVar.b(4)) {
                gVar.f343611g -= this.f227353c;
            }
            return a17;
        }
        gVar.l();
        gVar.f343594d = 4;
        this.f227356f = true;
        return -4;
    }

    @Override // d9.g0
    public void b() {
        this.f227352b.b();
    }

    @Override // d9.g0
    public void c(long j17) {
        this.f227352b.c(this.f227353c + j17);
    }

    @Override // d9.g0
    public boolean isReady() {
        return this.f227352b.isReady();
    }
}
