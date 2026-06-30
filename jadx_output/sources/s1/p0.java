package s1;

/* loaded from: classes14.dex */
public final class p0 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s1.k0 f402055d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.p f402056e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(s1.k0 k0Var, yz5.p pVar) {
        super(2);
        this.f402055d = k0Var;
        this.f402056e = pVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        n0.o oVar = (n0.o) obj;
        if ((((java.lang.Number) obj2).intValue() & 11) == 2) {
            n0.y0 y0Var = (n0.y0) oVar;
            if (y0Var.v()) {
                y0Var.O();
                return jz5.f0.f302826a;
            }
        }
        boolean booleanValue = ((java.lang.Boolean) ((n0.q4) this.f402055d.f402023e).getValue()).booleanValue();
        n0.y0 y0Var2 = (n0.y0) oVar;
        y0Var2.W(207, java.lang.Boolean.valueOf(booleanValue));
        boolean f17 = y0Var2.f(booleanValue);
        if (booleanValue) {
            this.f402056e.invoke(oVar, 0);
        } else {
            if (!(y0Var2.f333772m == 0)) {
                n0.e1.c("No nodes can be emitted before calling dactivateToEndGroup".toString());
                throw null;
            }
            if (!y0Var2.L) {
                if (f17) {
                    n0.j4 j4Var = y0Var2.E;
                    int i17 = j4Var.f333574f;
                    int i18 = j4Var.f333575g;
                    int i19 = i17;
                    while (i19 < i18) {
                        n0.j4 j4Var2 = y0Var2.E;
                        n0.w wVar = new n0.w(y0Var2, i19);
                        j4Var2.getClass();
                        int j17 = n0.l4.j(j4Var2.f333570b, i19);
                        i19++;
                        n0.k4 k4Var = j4Var2.f333569a;
                        int b17 = i19 < k4Var.f333591e ? n0.l4.b(k4Var.f333590d, i19) : k4Var.f333593g;
                        for (int i27 = j17; i27 < b17; i27++) {
                            wVar.invoke(java.lang.Integer.valueOf(i27 - j17), j4Var2.f333572d[i27]);
                        }
                    }
                    n0.e1.a(y0Var2.f333778s, i17, i18);
                    y0Var2.E.l(i17);
                    y0Var2.E.n();
                } else {
                    y0Var2.N();
                }
            }
        }
        if (y0Var2.f333784y && y0Var2.E.f333576h == y0Var2.f333785z) {
            y0Var2.f333785z = -1;
            y0Var2.f333784y = false;
        }
        y0Var2.o(false);
        return jz5.f0.f302826a;
    }
}
