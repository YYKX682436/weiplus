package hx0;

/* loaded from: classes5.dex */
public abstract class f {
    public static final void a(boolean z17, java.lang.String outputFilePath) {
        kotlin.jvm.internal.o.g(outputFilePath, "outputFilePath");
        i95.m c17 = i95.n0.c(m40.k0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        if (!((c61.p7) ((m40.k0) c17)).bj() || z17) {
            return;
        }
        i95.m c18 = i95.n0.c(bg0.v.class);
        kotlin.jvm.internal.o.f(c18, "getService(...)");
        ((b92.u2) ((bg0.v) c18)).bj(outputFilePath);
    }

    public static final void b(du0.g gVar) {
        kotlin.jvm.internal.o.g(gVar, "<this>");
        yy0.m7 m7Var = (yy0.m7) gVar.R6().O6();
        kotlinx.coroutines.l.d(m7Var.Di(), null, null, new yy0.z0(m7Var, null), 3, null);
    }
}
