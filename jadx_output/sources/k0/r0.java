package k0;

/* loaded from: classes14.dex */
public final class r0 implements j0.l3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k0.y0 f302958a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f302959b;

    public r0(k0.y0 y0Var, boolean z17) {
        this.f302958a = y0Var;
        this.f302959b = z17;
    }

    @Override // j0.l3
    public void a(long j17) {
        boolean z17 = this.f302959b;
        j0.u1 u1Var = z17 ? j0.u1.SelectionStart : j0.u1.SelectionEnd;
        k0.y0 y0Var = this.f302958a;
        k0.y0.b(y0Var, u1Var);
        k0.y0.a(y0Var, new d1.e(k0.y.a(y0Var.i(z17))));
    }

    @Override // j0.l3
    public void b(long j17) {
        j0.d5 d5Var;
        a2.k1 k1Var;
        int i17;
        int l17;
        k0.y0 y0Var = this.f302958a;
        long f17 = d1.e.f(y0Var.f302987m, j17);
        y0Var.f302987m = f17;
        j0.c5 c5Var = y0Var.f302978d;
        if (c5Var != null && (d5Var = c5Var.f296239g) != null && (k1Var = d5Var.f296265a) != null) {
            boolean z17 = this.f302959b;
            d1.e eVar = new d1.e(d1.e.f(y0Var.f302985k, f17));
            n0.v2 v2Var = y0Var.f302989o;
            ((n0.q4) v2Var).setValue(eVar);
            if (z17) {
                d1.e eVar2 = (d1.e) ((n0.q4) v2Var).getValue();
                kotlin.jvm.internal.o.d(eVar2);
                i17 = k1Var.l(eVar2.f225627a);
            } else {
                g2.v vVar = y0Var.f302976b;
                long j18 = y0Var.j().f267694b;
                int i18 = a2.m1.f782c;
                ((g2.t) vVar).getClass();
                i17 = (int) (j18 >> 32);
            }
            if (z17) {
                g2.v vVar2 = y0Var.f302976b;
                int c17 = a2.m1.c(y0Var.j().f267694b);
                ((g2.t) vVar2).getClass();
                l17 = c17;
            } else {
                d1.e eVar3 = (d1.e) ((n0.q4) v2Var).getValue();
                kotlin.jvm.internal.o.d(eVar3);
                l17 = k1Var.l(eVar3.f225627a);
            }
            k0.y0.c(y0Var, y0Var.j(), i17, l17, z17, k0.u.f302963b);
        }
        j0.c5 c5Var2 = y0Var.f302978d;
        if (c5Var2 == null) {
            return;
        }
        c5Var2.f296241i = false;
    }

    @Override // j0.l3
    public void c(long j17) {
        k0.y0 y0Var = this.f302958a;
        boolean z17 = this.f302959b;
        y0Var.f302985k = k0.y.a(y0Var.i(z17));
        k0.y0.a(y0Var, new d1.e(y0Var.f302985k));
        int i17 = d1.e.f225626e;
        y0Var.f302987m = d1.e.f225623b;
        k0.y0.b(y0Var, z17 ? j0.u1.SelectionStart : j0.u1.SelectionEnd);
        j0.c5 c5Var = y0Var.f302978d;
        if (c5Var == null) {
            return;
        }
        c5Var.f296241i = false;
    }

    @Override // j0.l3
    public void d() {
        k0.y0 y0Var = this.f302958a;
        k0.y0.b(y0Var, null);
        k0.y0.a(y0Var, null);
    }

    @Override // j0.l3
    public void onCancel() {
    }

    @Override // j0.l3
    public void onStop() {
        k0.y0 y0Var = this.f302958a;
        k0.y0.b(y0Var, null);
        k0.y0.a(y0Var, null);
        j0.c5 c5Var = y0Var.f302978d;
        if (c5Var != null) {
            c5Var.f296241i = true;
        }
        androidx.compose.ui.platform.c4 c4Var = y0Var.f302981g;
        if ((c4Var != null ? ((androidx.compose.ui.platform.c1) c4Var).f10530d : null) == androidx.compose.ui.platform.e4.Hidden) {
            y0Var.n();
        }
    }
}
