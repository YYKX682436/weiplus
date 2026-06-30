package j0;

/* loaded from: classes14.dex */
public abstract class t1 {

    /* renamed from: a, reason: collision with root package name */
    public static final jz5.l f296568a;

    static {
        kz5.p0 p0Var = kz5.p0.f313996d;
        f296568a = new jz5.l(p0Var, p0Var);
    }

    public static final void a(a2.d text, java.util.List inlineContents, n0.o oVar, int i17) {
        kotlin.jvm.internal.o.g(text, "text");
        kotlin.jvm.internal.o.g(inlineContents, "inlineContents");
        java.lang.Object obj = n0.e1.f333492a;
        n0.y0 y0Var = (n0.y0) oVar;
        y0Var.V(-110905764);
        int size = inlineContents.size();
        for (int i18 = 0; i18 < size; i18++) {
            a2.c cVar = (a2.c) inlineContents.get(i18);
            yz5.q qVar = (yz5.q) cVar.f675a;
            j0.r1 r1Var = j0.r1.f296539a;
            y0Var.U(-1323940314);
            int i19 = z0.t.f468922q1;
            z0.p pVar = z0.p.f468921d;
            p2.f fVar = (p2.f) y0Var.i(androidx.compose.ui.platform.m2.f10646e);
            p2.s sVar = (p2.s) y0Var.i(androidx.compose.ui.platform.m2.f10652k);
            androidx.compose.ui.platform.k4 k4Var = (androidx.compose.ui.platform.k4) y0Var.i(androidx.compose.ui.platform.m2.f10656o);
            u1.f fVar2 = u1.g.f423594i1;
            fVar2.getClass();
            yz5.a aVar = u1.f.f423587b;
            yz5.q a17 = s1.g0.a(pVar);
            if (!(y0Var.f333761b instanceof n0.e)) {
                n0.l.a();
                throw null;
            }
            y0Var.X();
            if (y0Var.L) {
                y0Var.j(aVar);
            } else {
                y0Var.i0();
            }
            y0Var.f333784y = false;
            fVar2.getClass();
            n0.i5.a(y0Var, r1Var, u1.f.f423590e);
            fVar2.getClass();
            n0.i5.a(y0Var, fVar, u1.f.f423589d);
            fVar2.getClass();
            n0.i5.a(y0Var, sVar, u1.f.f423591f);
            fVar2.getClass();
            n0.i5.a(y0Var, k4Var, u1.f.f423592g);
            y0Var.n();
            ((u0.i) a17).invoke(new n0.i4(y0Var), y0Var, 0);
            y0Var.U(2058660585);
            y0Var.U(-72427749);
            qVar.invoke(text.subSequence(cVar.f676b, cVar.f677c).f681d, y0Var, 0);
            y0Var.o(false);
            y0Var.o(false);
            y0Var.o(true);
            y0Var.o(false);
        }
        n0.f4 q17 = y0Var.q();
        if (q17 != null) {
            ((n0.l3) q17).f333608d = new j0.s1(text, inlineContents, i17);
        }
        java.lang.Object obj2 = n0.e1.f333492a;
    }

    public static final j0.k3 b(j0.k3 current, a2.d text, a2.o1 style, p2.f density, f2.g fontFamilyResolver, boolean z17, int i17, int i18, java.util.List placeholders) {
        kotlin.jvm.internal.o.g(current, "current");
        kotlin.jvm.internal.o.g(text, "text");
        kotlin.jvm.internal.o.g(style, "style");
        kotlin.jvm.internal.o.g(density, "density");
        kotlin.jvm.internal.o.g(fontFamilyResolver, "fontFamilyResolver");
        kotlin.jvm.internal.o.g(placeholders, "placeholders");
        if (kotlin.jvm.internal.o.b(current.f296403a, text) && kotlin.jvm.internal.o.b(current.f296404b, style)) {
            if (current.f296406d == z17) {
                if (current.f296407e == i17) {
                    if (current.f296405c == i18 && kotlin.jvm.internal.o.b(current.f296408f, density) && kotlin.jvm.internal.o.b(current.f296410h, placeholders) && current.f296409g == fontFamilyResolver) {
                        return current;
                    }
                    return new j0.k3(text, style, i18, z17, i17, density, fontFamilyResolver, placeholders, null);
                }
                return new j0.k3(text, style, i18, z17, i17, density, fontFamilyResolver, placeholders, null);
            }
        }
        return new j0.k3(text, style, i18, z17, i17, density, fontFamilyResolver, placeholders, null);
    }
}
