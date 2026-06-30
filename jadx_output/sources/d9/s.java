package d9;

/* loaded from: classes15.dex */
public final class s implements d9.g0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f227395a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d9.t f227396b;

    public s(d9.t tVar, int i17) {
        this.f227396b = tVar;
        this.f227395a = i17;
    }

    @Override // d9.g0
    public int a(m8.s sVar, o8.g gVar, boolean z17) {
        d9.t tVar = this.f227396b;
        if (tVar.C || tVar.t()) {
            return -3;
        }
        return tVar.f227415x[this.f227395a].k(sVar, gVar, z17, tVar.N, tVar.K);
    }

    @Override // d9.g0
    public void b() {
        this.f227396b.f227407p.b();
    }

    @Override // d9.g0
    public void c(long j17) {
        long j18;
        d9.t tVar = this.f227396b;
        d9.f0 f0Var = tVar.f227415x[this.f227395a];
        if (tVar.N) {
            d9.c0 c0Var = f0Var.f227339c;
            synchronized (c0Var) {
                j18 = c0Var.f227306n;
            }
            if (j17 > j18) {
                d9.c0 c0Var2 = f0Var.f227339c;
                synchronized (c0Var2) {
                    if (c0Var2.f()) {
                        c0Var2.f227304l = c0Var2.f227301i;
                        return;
                    }
                    return;
                }
            }
        }
        f0Var.e(j17, true, true);
    }

    @Override // d9.g0
    public boolean isReady() {
        d9.t tVar = this.f227396b;
        return tVar.N || (!tVar.t() && tVar.f227415x[this.f227395a].f227339c.f());
    }
}
