package d0;

/* loaded from: classes14.dex */
public abstract class o2 {
    public static z0.t a(d0.p2 p2Var, z0.t tVar, float f17, boolean z17, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: weight");
        }
        if ((i17 & 2) != 0) {
            z17 = true;
        }
        ((d0.q2) p2Var).getClass();
        kotlin.jvm.internal.o.g(tVar, "<this>");
        if (((double) f17) > 0.0d) {
            boolean z18 = androidx.compose.ui.platform.f3.f10562a;
            return tVar.k(new d0.u1(f17, z17, androidx.compose.ui.platform.e3.f10553d));
        }
        throw new java.lang.IllegalArgumentException(("invalid weight " + f17 + "; must be greater than zero").toString());
    }
}
