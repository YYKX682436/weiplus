package nu4;

/* loaded from: classes7.dex */
public abstract class d0 {
    public static final java.lang.String a(java.lang.String host) {
        kotlin.jvm.internal.o.g(host, "host");
        return "_manifest_" + host.hashCode();
    }

    public static final java.lang.String b(nu4.a aVar) {
        kotlin.jvm.internal.o.g(aVar, "<this>");
        r45.m83 m83Var = aVar.f340234b;
        java.lang.String str = m83Var.f380235i;
        boolean z17 = true;
        if (!(str == null || str.length() == 0)) {
            kotlin.jvm.internal.o.d(str);
            return str;
        }
        java.lang.String str2 = m83Var.f380230d;
        if (str2 != null && str2.length() != 0) {
            z17 = false;
        }
        r45.l83 l83Var = aVar.f340233a;
        if (z17) {
            java.lang.String str3 = l83Var.f379226d;
            return str3 == null ? "" : str3;
        }
        java.lang.String str4 = m83Var.f380230d;
        kotlin.jvm.internal.o.d(str4);
        if (!r26.i0.y(str4, "/", false)) {
            str4 = "/".concat(str4);
        }
        kotlin.jvm.internal.o.f(str4, "let(...)");
        java.lang.String t17 = r26.i0.t(str4, "/", "_", false);
        java.lang.String str5 = l83Var.f379226d;
        return (str5 != null ? str5 : "").concat(t17);
    }
}
