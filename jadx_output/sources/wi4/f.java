package wi4;

/* loaded from: classes10.dex */
public abstract class f {
    public static final boolean a(java.util.List list, java.util.List list2) {
        kotlin.jvm.internal.o.g(list, "<this>");
        if (list2 == null || list.size() != list2.size()) {
            return false;
        }
        int i17 = 0;
        for (java.lang.Object obj : list) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            if (!b((pj4.j0) obj, (pj4.j0) list2.get(i17))) {
                return false;
            }
            i17 = i18;
        }
        return true;
    }

    public static final boolean b(pj4.j0 j0Var, pj4.j0 j0Var2) {
        kotlin.jvm.internal.o.g(j0Var, "<this>");
        if (j0Var2 == null || !kotlin.jvm.internal.o.b(j0Var.f355139d, j0Var2.f355139d)) {
            return false;
        }
        java.lang.String str = j0Var.f355142g;
        if (str == null) {
            str = "";
        }
        java.lang.String str2 = j0Var2.f355142g;
        return kotlin.jvm.internal.o.b(str, str2 != null ? str2 : "");
    }
}
