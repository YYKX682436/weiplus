package g16;

/* loaded from: classes15.dex */
public abstract class e1 {
    public static final java.lang.Object a(g16.g0 g0Var, java.lang.Object possiblyPrimitiveType, boolean z17) {
        w16.e eVar;
        kotlin.jvm.internal.o.g(g0Var, "<this>");
        kotlin.jvm.internal.o.g(possiblyPrimitiveType, "possiblyPrimitiveType");
        if (!z17) {
            return possiblyPrimitiveType;
        }
        g16.h0 h0Var = (g16.h0) g0Var;
        g16.f0 f0Var = (g16.f0) possiblyPrimitiveType;
        if (!(f0Var instanceof g16.e0) || (eVar = ((g16.e0) f0Var).f267616i) == null) {
            return f0Var;
        }
        java.lang.String e17 = w16.d.c(eVar.j()).e();
        kotlin.jvm.internal.o.f(e17, "getInternalName(...)");
        return h0Var.b(e17);
    }
}
