package j0;

/* loaded from: classes14.dex */
public final class h3 implements j0.l3 {

    /* renamed from: a, reason: collision with root package name */
    public long f296314a;

    /* renamed from: b, reason: collision with root package name */
    public long f296315b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j0.j3 f296316c;

    public h3(j0.j3 j3Var, k0.i0 i0Var) {
        this.f296316c = j3Var;
        int i17 = d1.e.f225626e;
        long j17 = d1.e.f225623b;
        this.f296314a = j17;
        this.f296315b = j17;
    }

    @Override // j0.l3
    public void a(long j17) {
    }

    @Override // j0.l3
    public void b(long j17) {
        j0.j3 j3Var = this.f296316c;
        s1.z zVar = j3Var.f296382d.f296291d;
        if (zVar != null && ((u1.c1) zVar).p0() && k0.k0.a(null, j3Var.f296382d.f296289b)) {
            long f17 = d1.e.f(this.f296315b, j17);
            this.f296315b = f17;
            if (j0.j3.a(j3Var, this.f296314a, d1.e.f(this.f296314a, f17))) {
                return;
            }
            int i17 = k0.v.f302966a;
            throw null;
        }
    }

    @Override // j0.l3
    public void c(long j17) {
        j0.j3 j3Var = this.f296316c;
        j0.f5 f5Var = j3Var.f296382d;
        s1.z zVar = f5Var.f296291d;
        if (zVar == null) {
            if (k0.k0.a(null, f5Var.f296289b)) {
                int i17 = d1.e.f225626e;
                this.f296315b = d1.e.f225623b;
                return;
            }
            return;
        }
        if (((u1.c1) zVar).p0()) {
            if (j0.j3.a(j3Var, j17, j17)) {
                long j18 = j3Var.f296382d.f296289b;
                throw null;
            }
            int i18 = k0.v.f302966a;
            throw null;
        }
    }

    @Override // j0.l3
    public void d() {
    }

    @Override // j0.l3
    public void onCancel() {
        if (k0.k0.a(null, this.f296316c.f296382d.f296289b)) {
            throw null;
        }
    }

    @Override // j0.l3
    public void onStop() {
        if (k0.k0.a(null, this.f296316c.f296382d.f296289b)) {
            throw null;
        }
    }
}
