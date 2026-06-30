package z0;

/* loaded from: classes14.dex */
public abstract class m {
    public static final z0.t a(z0.t tVar, yz5.l inspectorInfo, yz5.q factory) {
        kotlin.jvm.internal.o.g(tVar, "<this>");
        kotlin.jvm.internal.o.g(inspectorInfo, "inspectorInfo");
        kotlin.jvm.internal.o.g(factory, "factory");
        return tVar.k(new z0.j(inspectorInfo, factory));
    }

    public static /* synthetic */ z0.t b(z0.t tVar, yz5.l lVar, yz5.q qVar, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            boolean z17 = androidx.compose.ui.platform.f3.f10562a;
            lVar = androidx.compose.ui.platform.e3.f10553d;
        }
        return a(tVar, lVar, qVar);
    }

    public static final z0.t c(n0.o oVar, z0.t modifier) {
        kotlin.jvm.internal.o.g(oVar, "<this>");
        kotlin.jvm.internal.o.g(modifier, "modifier");
        if (modifier.E(z0.k.f468912d)) {
            return modifier;
        }
        n0.y0 y0Var = (n0.y0) oVar;
        y0Var.U(1219399079);
        int i17 = z0.t.f468922q1;
        z0.t tVar = (z0.t) modifier.u(z0.p.f468921d, new z0.l(oVar));
        y0Var.o(false);
        return tVar;
    }
}
