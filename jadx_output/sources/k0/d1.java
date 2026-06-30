package k0;

/* loaded from: classes14.dex */
public final class d1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k0.y0 f302885d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ n0.v2 f302886e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(k0.y0 y0Var, n0.v2 v2Var) {
        super(0);
        this.f302885d = y0Var;
        this.f302886e = v2Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        long j17;
        int i17;
        j0.d5 d5Var;
        a2.k1 k1Var;
        s1.z zVar;
        s1.z zVar2;
        long j18 = ((p2.q) this.f302886e.getValue()).f351396a;
        k0.y0 manager = this.f302885d;
        kotlin.jvm.internal.o.g(manager, "manager");
        if (manager.j().f267693a.f681d.length() == 0) {
            j17 = d1.e.f225625d;
        } else {
            j0.u1 u1Var = (j0.u1) ((n0.q4) manager.f302988n).getValue();
            int i18 = u1Var == null ? -1 : k0.b1.f302872a[u1Var.ordinal()];
            if (i18 != -1) {
                if (i18 == 1 || i18 == 2) {
                    long j19 = manager.j().f267694b;
                    int i19 = a2.m1.f782c;
                    i17 = (int) (j19 >> 32);
                } else {
                    if (i18 != 3) {
                        throw new jz5.j();
                    }
                    i17 = a2.m1.c(manager.j().f267694b);
                }
                ((g2.t) manager.f302976b).getClass();
                int g17 = e06.p.g(i17, r26.n0.G(manager.j().f267693a.f681d));
                j0.c5 c5Var = manager.f302978d;
                if (c5Var == null || (d5Var = c5Var.f296239g) == null || (k1Var = d5Var.f296265a) == null) {
                    j17 = d1.e.f225625d;
                } else {
                    long a17 = k1Var.b(g17).a();
                    j0.c5 c5Var2 = manager.f302978d;
                    if (c5Var2 == null || (zVar = c5Var2.f296238f) == null) {
                        j17 = d1.e.f225625d;
                    } else {
                        j0.d5 d5Var2 = c5Var2.f296239g;
                        if (d5Var2 == null || (zVar2 = d5Var2.f296266b) == null) {
                            j17 = d1.e.f225625d;
                        } else {
                            d1.e eVar = (d1.e) ((n0.q4) manager.f302989o).getValue();
                            if (eVar != null) {
                                float c17 = d1.e.c(((u1.c1) zVar2).s0(zVar, eVar.f225627a));
                                int f17 = k1Var.f(g17);
                                int j27 = k1Var.j(f17);
                                int e17 = k1Var.e(f17, true);
                                boolean z17 = ((int) (manager.j().f267694b >> 32)) > a2.m1.c(manager.j().f267694b);
                                float a18 = k0.m1.a(k1Var, j27, true, z17);
                                float a19 = k0.m1.a(k1Var, e17, false, z17);
                                float e18 = e06.p.e(c17, java.lang.Math.min(a18, a19), java.lang.Math.max(a18, a19));
                                j17 = java.lang.Math.abs(c17 - e18) > ((float) (((int) (j18 >> 32)) / 2)) ? d1.e.f225625d : ((u1.c1) zVar).s0(zVar2, d1.f.a(e18, d1.e.d(a17)));
                            } else {
                                j17 = d1.e.f225625d;
                            }
                        }
                    }
                }
            } else {
                j17 = d1.e.f225625d;
            }
        }
        return new d1.e(j17);
    }
}
