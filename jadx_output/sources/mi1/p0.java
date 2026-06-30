package mi1;

/* loaded from: classes7.dex */
public abstract class p0 {
    public static final boolean a(mi1.j0 j0Var, mi1.j0 j0Var2) {
        kotlin.jvm.internal.o.g(j0Var, "<this>");
        if (j0Var2 == null) {
            return true;
        }
        if (kotlin.jvm.internal.o.b(j0Var2, j0Var)) {
            return false;
        }
        int i17 = j0Var.f326587c;
        int i18 = j0Var2.f326587c;
        if (i17 <= i18) {
            return j0Var2.f326589e == j0Var.f326589e && i18 == i17;
        }
        return true;
    }
}
