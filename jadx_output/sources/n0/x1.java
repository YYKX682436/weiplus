package n0;

/* loaded from: classes14.dex */
public final class x1 implements x0.z0, n0.y1 {

    /* renamed from: d, reason: collision with root package name */
    public final yz5.a f333745d;

    /* renamed from: e, reason: collision with root package name */
    public n0.v1 f333746e;

    public x1(yz5.a calculation) {
        kotlin.jvm.internal.o.g(calculation, "calculation");
        this.f333745d = calculation;
        this.f333746e = new n0.v1();
    }

    public final n0.v1 b(n0.v1 v1Var, x0.m snapshot, yz5.a aVar) {
        n0.v1 v1Var2;
        v1Var.getClass();
        kotlin.jvm.internal.o.g(snapshot, "snapshot");
        int i17 = 0;
        if (v1Var.f333727d != n0.v1.f333725f && v1Var.f333728e == v1Var.c(this, snapshot)) {
            return v1Var;
        }
        java.lang.Boolean bool = (java.lang.Boolean) n0.t4.f333708b.a();
        boolean booleanValue = bool != null ? bool.booleanValue() : false;
        java.util.HashSet hashSet = new java.util.HashSet();
        java.util.List list = (p0.e) n0.t4.f333707a.a();
        if (list == null) {
            list = q0.l.f359241f;
        }
        int d17 = ((kz5.b) list).d();
        for (int i18 = 0; i18 < d17; i18++) {
            ((yz5.l) ((jz5.l) list.get(i18)).f302833d).invoke(this);
        }
        if (!booleanValue) {
            try {
                n0.t4.f333708b.b(java.lang.Boolean.TRUE);
            } finally {
                int d18 = ((kz5.b) list).d();
                while (i17 < d18) {
                    ((yz5.l) ((jz5.l) list.get(i17)).f302834e).invoke(this);
                    i17++;
                }
            }
        }
        java.lang.Object a17 = x0.m.f450907e.a(new n0.w1(this, hashSet), null, aVar);
        if (!booleanValue) {
            n0.t4.f333708b.b(java.lang.Boolean.FALSE);
        }
        synchronized (x0.z.f450963b) {
            x0.m i19 = x0.z.i();
            v1Var2 = (n0.v1) x0.z.l(this.f333746e, this, i19);
            v1Var2.f333726c = hashSet;
            v1Var2.f333728e = v1Var2.c(this, i19);
            v1Var2.f333727d = a17;
        }
        if (!booleanValue) {
            x0.z.i().l();
        }
        return v1Var2;
    }

    @Override // x0.z0
    public x0.a1 d(x0.a1 a1Var, x0.a1 a1Var2, x0.a1 a1Var3) {
        x0.y0.a(this, a1Var, a1Var2, a1Var3);
        return null;
    }

    @Override // x0.z0
    public void e(x0.a1 value) {
        kotlin.jvm.internal.o.g(value, "value");
        this.f333746e = (n0.v1) value;
    }

    @Override // x0.z0
    public x0.a1 g() {
        return this.f333746e;
    }

    @Override // n0.e5
    public java.lang.Object getValue() {
        yz5.l f17 = x0.z.i().f();
        if (f17 != null) {
            f17.invoke(this);
        }
        return b((n0.v1) x0.z.h(this.f333746e, x0.z.i()), x0.z.i(), this.f333745d).f333727d;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("DerivedState(value=");
        n0.v1 v1Var = (n0.v1) x0.z.h(this.f333746e, x0.z.i());
        sb6.append(v1Var.f333727d != n0.v1.f333725f && v1Var.f333728e == v1Var.c(this, x0.z.i()) ? java.lang.String.valueOf(v1Var.f333727d) : "<Not calculated>");
        sb6.append(")@");
        sb6.append(hashCode());
        return sb6.toString();
    }
}
