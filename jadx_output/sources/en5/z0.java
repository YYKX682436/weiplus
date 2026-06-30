package en5;

/* loaded from: classes14.dex */
public final class z0 extends kotlin.jvm.internal.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n0.e5 f255535d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f255536e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ a2.o1 f255537f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(n0.e5 e5Var, java.lang.String str, a2.o1 o1Var) {
        super(3);
        this.f255535d = e5Var;
        this.f255536e = str;
        this.f255537f = o1Var;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        yz5.p innerTextField = (yz5.p) obj;
        n0.o oVar = (n0.o) obj2;
        int intValue = ((java.lang.Number) obj3).intValue();
        kotlin.jvm.internal.o.g(innerTextField, "innerTextField");
        if ((intValue & 14) == 0) {
            intValue |= ((n0.y0) oVar).e(innerTextField) ? 4 : 2;
        }
        if ((intValue & 91) == 18) {
            n0.y0 y0Var = (n0.y0) oVar;
            if (y0Var.v()) {
                y0Var.O();
                return jz5.f0.f302826a;
            }
        }
        java.lang.Object obj4 = n0.e1.f333492a;
        java.lang.Object value = this.f255535d.getValue();
        kotlin.jvm.internal.o.f(value, "<get-value>(...)");
        if (r26.n0.N((java.lang.CharSequence) value)) {
            java.lang.String str = this.f255536e;
            if (!(str == null || str.length() == 0)) {
                n0.y0 y0Var2 = (n0.y0) oVar;
                y0Var2.U(-2026264481);
                int i17 = z0.t.f468922q1;
                z0.t e17 = d0.a3.e(z0.p.f468921d, 0.0f, 1, null);
                int i18 = z0.d.f468903a;
                z0.d dVar = z0.a.f468892d;
                java.lang.String str2 = this.f255536e;
                a2.o1 o1Var = this.f255537f;
                y0Var2.U(733328855);
                s1.t0 c17 = d0.y.c(dVar, false, y0Var2, 6);
                y0Var2.U(-1323940314);
                p2.f fVar = (p2.f) y0Var2.i(androidx.compose.ui.platform.m2.f10646e);
                p2.s sVar = (p2.s) y0Var2.i(androidx.compose.ui.platform.m2.f10652k);
                androidx.compose.ui.platform.k4 k4Var = (androidx.compose.ui.platform.k4) y0Var2.i(androidx.compose.ui.platform.m2.f10656o);
                u1.g.f423594i1.getClass();
                yz5.a aVar = u1.f.f423587b;
                yz5.q a17 = s1.g0.a(e17);
                if (!(y0Var2.f333761b instanceof n0.e)) {
                    n0.l.a();
                    throw null;
                }
                y0Var2.X();
                if (y0Var2.L) {
                    y0Var2.j(aVar);
                } else {
                    y0Var2.i0();
                }
                y0Var2.f333784y = false;
                n0.i5.a(y0Var2, c17, u1.f.f423590e);
                n0.i5.a(y0Var2, fVar, u1.f.f423589d);
                n0.i5.a(y0Var2, sVar, u1.f.f423591f);
                n0.i5.a(y0Var2, k4Var, u1.f.f423592g);
                y0Var2.n();
                ((u0.i) a17).invoke(new n0.i4(y0Var2), y0Var2, 0);
                y0Var2.U(2058660585);
                y0Var2.U(-2137368960);
                innerTextField.invoke(y0Var2, java.lang.Integer.valueOf(intValue & 14));
                tz0.x.b(str2, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, null, o1Var, y0Var2, 0, com.tencent.mm.boot.BuildConfig.VERSION_CODE, 22526);
                y0Var2.o(false);
                y0Var2.o(false);
                y0Var2.o(true);
                y0Var2.o(false);
                y0Var2.o(false);
                y0Var2.o(false);
                return jz5.f0.f302826a;
            }
        }
        n0.y0 y0Var3 = (n0.y0) oVar;
        y0Var3.U(-2026264128);
        innerTextField.invoke(y0Var3, java.lang.Integer.valueOf(intValue & 14));
        y0Var3.o(false);
        return jz5.f0.f302826a;
    }
}
