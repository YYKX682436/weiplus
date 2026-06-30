package iz5;

/* loaded from: classes7.dex */
public abstract class a {
    public static void a(int i17, int i18) {
        b(null, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
    }

    public static void b(java.lang.String str, java.lang.Object obj, java.lang.Object obj2) {
        if (obj == null && obj2 == null) {
            return;
        }
        if (obj == null || !obj.equals(obj2)) {
            h(i(str, obj, obj2));
            throw null;
        }
    }

    public static void c(java.lang.String str, boolean z17) {
        g(str, !z17);
    }

    public static void d(java.lang.String str, java.lang.Object obj) {
        g(str, obj != null);
    }

    public static void e(java.lang.Object obj, java.lang.Object obj2) {
        if (obj != obj2) {
            return;
        }
        h("expected not same");
        throw null;
    }

    public static void f(java.lang.Object obj, java.lang.Object obj2) {
        if (obj == obj2) {
            return;
        }
        h("expected same:<" + obj + "> was not:<" + obj2 + ">");
        throw null;
    }

    public static void g(java.lang.String str, boolean z17) {
        if (z17) {
            return;
        }
        h(str);
        throw null;
    }

    public static void h(java.lang.String str) {
        if (str != null) {
            throw new iz5.b(str);
        }
        throw new iz5.b();
    }

    public static java.lang.String i(java.lang.String str, java.lang.Object obj, java.lang.Object obj2) {
        return ((str == null || str.length() <= 0) ? "" : str.concat(" ")) + "expected:<" + obj + "> but was:<" + obj2 + ">";
    }
}
