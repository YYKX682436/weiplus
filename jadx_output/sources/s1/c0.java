package s1;

/* loaded from: classes14.dex */
public abstract class c0 {
    public static final java.lang.Object a(s1.r0 r0Var) {
        kotlin.jvm.internal.o.g(r0Var, "<this>");
        java.lang.Object g17 = r0Var.g();
        s1.d0 d0Var = g17 instanceof s1.d0 ? (s1.d0) g17 : null;
        if (d0Var != null) {
            return ((s1.b0) d0Var).f401989d;
        }
        return null;
    }

    public static final z0.t b(z0.t tVar, java.lang.Object layoutId) {
        kotlin.jvm.internal.o.g(tVar, "<this>");
        kotlin.jvm.internal.o.g(layoutId, "layoutId");
        boolean z17 = androidx.compose.ui.platform.f3.f10562a;
        return tVar.k(new s1.b0(layoutId, androidx.compose.ui.platform.e3.f10553d));
    }
}
