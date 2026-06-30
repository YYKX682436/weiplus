package hc2;

/* loaded from: classes10.dex */
public abstract class l0 {
    public static final java.lang.String a(r45.mb4 mb4Var) {
        java.util.LinkedList linkedList;
        r45.ho6 ho6Var;
        kotlin.jvm.internal.o.g(mb4Var, "<this>");
        if (4 != mb4Var.getInteger(2)) {
            return null;
        }
        java.lang.String string = mb4Var.getString(0);
        if (!(string == null || string.length() == 0)) {
            return mb4Var.getString(0);
        }
        r45.h70 h70Var = (r45.h70) mb4Var.getCustom(21);
        if (h70Var == null || (linkedList = h70Var.f375897d) == null || (ho6Var = (r45.ho6) kz5.n0.Z(linkedList)) == null) {
            return null;
        }
        return ho6Var.f376333d;
    }

    public static final int b(r45.mb4 mb4Var) {
        if (mb4Var != null && mb4Var.getInteger(2) == 9) {
            return 2;
        }
        if (mb4Var != null) {
            r45.h70 h70Var = (r45.h70) mb4Var.getCustom(21);
            if (h70Var != null && h70Var.f375903m) {
                return 1;
            }
        }
        return 0;
    }

    public static final boolean c(r45.mb4 mb4Var) {
        if (mb4Var == null) {
            return true;
        }
        r45.h70 h70Var = (r45.h70) mb4Var.getCustom(21);
        return !(h70Var != null && h70Var.f375903m);
    }
}
