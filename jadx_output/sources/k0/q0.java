package k0;

/* loaded from: classes14.dex */
public final class q0 implements j0.l3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k0.y0 f302957a;

    public q0(k0.y0 y0Var) {
        this.f302957a = y0Var;
    }

    @Override // j0.l3
    public void a(long j17) {
        j0.u1 u1Var = j0.u1.Cursor;
        k0.y0 y0Var = this.f302957a;
        k0.y0.b(y0Var, u1Var);
        k0.y0.a(y0Var, new d1.e(k0.y.a(y0Var.i(true))));
    }

    @Override // j0.l3
    public void b(long j17) {
        j0.d5 d5Var;
        a2.k1 k1Var;
        k0.y0 y0Var = this.f302957a;
        long f17 = d1.e.f(y0Var.f302987m, j17);
        y0Var.f302987m = f17;
        j0.c5 c5Var = y0Var.f302978d;
        if (c5Var == null || (d5Var = c5Var.f296239g) == null || (k1Var = d5Var.f296265a) == null) {
            return;
        }
        d1.e eVar = new d1.e(d1.e.f(y0Var.f302985k, f17));
        n0.v2 v2Var = y0Var.f302989o;
        ((n0.q4) v2Var).setValue(eVar);
        d1.e eVar2 = (d1.e) ((n0.q4) v2Var).getValue();
        kotlin.jvm.internal.o.d(eVar2);
        int l17 = k1Var.l(eVar2.f225627a);
        long a17 = a2.n1.a(l17, l17);
        if (a2.m1.a(a17, y0Var.j().f267694b)) {
            return;
        }
        k1.a aVar = y0Var.f302982h;
        if (aVar != null) {
            ((k1.b) aVar).a(9);
        }
        y0Var.f302977c.invoke(y0Var.e(y0Var.j().f267693a, a17));
    }

    @Override // j0.l3
    public void c(long j17) {
        k0.y0 y0Var = this.f302957a;
        y0Var.f302985k = k0.y.a(y0Var.i(true));
        k0.y0.a(y0Var, new d1.e(y0Var.f302985k));
        int i17 = d1.e.f225626e;
        y0Var.f302987m = d1.e.f225623b;
        k0.y0.b(y0Var, j0.u1.Cursor);
    }

    @Override // j0.l3
    public void d() {
        k0.y0 y0Var = this.f302957a;
        k0.y0.b(y0Var, null);
        k0.y0.a(y0Var, null);
    }

    @Override // j0.l3
    public void onCancel() {
    }

    @Override // j0.l3
    public void onStop() {
        k0.y0 y0Var = this.f302957a;
        k0.y0.b(y0Var, null);
        k0.y0.a(y0Var, null);
    }
}
