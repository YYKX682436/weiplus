package n0;

/* loaded from: classes14.dex */
public abstract class n1 {
    public static final void a(n0.i3[] values, yz5.p content, n0.o oVar, int i17) {
        p0.f f07;
        boolean z17;
        kotlin.jvm.internal.o.g(values, "values");
        kotlin.jvm.internal.o.g(content, "content");
        java.lang.Object obj = n0.e1.f333492a;
        n0.y0 y0Var = (n0.y0) oVar;
        y0Var.V(-1390796515);
        p0.f k17 = y0Var.k(null);
        y0Var.R(201, n0.e1.f333493b);
        y0Var.R(203, n0.e1.f333495d);
        n0.u0 u0Var = new n0.u0(values, k17);
        kotlin.jvm.internal.m0.e(u0Var, 2);
        p0.f fVar = (p0.f) u0Var.invoke(y0Var, 1);
        y0Var.o(false);
        if (y0Var.L) {
            f07 = y0Var.f0(k17, fVar);
            y0Var.H = true;
            z17 = false;
        } else {
            n0.j4 j4Var = y0Var.E;
            java.lang.Object f17 = j4Var.f(j4Var.f333574f, 0);
            if (f17 == null) {
                throw new java.lang.NullPointerException("null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<androidx.compose.runtime.CompositionLocal<kotlin.Any?>, androidx.compose.runtime.State<kotlin.Any?>>{ androidx.compose.runtime.ComposerKt.CompositionLocalMap }");
            }
            p0.f fVar2 = (p0.f) f17;
            n0.j4 j4Var2 = y0Var.E;
            java.lang.Object f18 = j4Var2.f(j4Var2.f333574f, 1);
            if (f18 == null) {
                throw new java.lang.NullPointerException("null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<androidx.compose.runtime.CompositionLocal<kotlin.Any?>, androidx.compose.runtime.State<kotlin.Any?>>{ androidx.compose.runtime.ComposerKt.CompositionLocalMap }");
            }
            p0.f fVar3 = (p0.f) f18;
            if (y0Var.v() && kotlin.jvm.internal.o.b(fVar3, fVar)) {
                y0Var.f333772m += y0Var.E.m();
                z17 = false;
                f07 = fVar2;
            } else {
                f07 = y0Var.f0(k17, fVar);
                z17 = !kotlin.jvm.internal.o.b(f07, fVar2);
            }
        }
        if (z17 && !y0Var.L) {
            y0Var.f333781v.put(java.lang.Integer.valueOf(y0Var.E.f333574f), f07);
        }
        boolean z18 = y0Var.f333782w;
        n0.h2 h2Var = y0Var.f333783x;
        h2Var.b(z18 ? 1 : 0);
        y0Var.f333782w = z17;
        y0Var.I = f07;
        y0Var.P(202, n0.e1.f333494c, false, f07);
        content.invoke(y0Var, java.lang.Integer.valueOf((i17 >> 3) & 14));
        y0Var.o(false);
        y0Var.o(false);
        y0Var.f333782w = h2Var.a() != 0;
        y0Var.I = null;
        n0.f4 q17 = y0Var.q();
        if (q17 == null) {
            return;
        }
        ((n0.l3) q17).f333608d = new n0.m1(values, content, i17);
    }

    public static n0.h3 b(n0.r4 policy, yz5.a defaultFactory, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            policy = n0.h5.f333529a;
        }
        kotlin.jvm.internal.o.g(policy, "policy");
        kotlin.jvm.internal.o.g(defaultFactory, "defaultFactory");
        return new n0.c2(policy, defaultFactory);
    }

    public static final n0.h3 c(yz5.a defaultFactory) {
        kotlin.jvm.internal.o.g(defaultFactory, "defaultFactory");
        return new n0.f5(defaultFactory);
    }
}
