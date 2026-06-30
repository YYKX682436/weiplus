package g26;

/* loaded from: classes15.dex */
public abstract class h0 {
    public static final java.lang.String a(f26.c2 c2Var) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        b("type: " + c2Var, sb6);
        b("hashCode: " + c2Var.hashCode(), sb6);
        b("javaClass: " + c2Var.getClass().getCanonicalName(), sb6);
        for (o06.m i17 = c2Var.i(); i17 != null; i17 = i17.e()) {
            b("fqName: ".concat(q16.s.f359780a.p(i17)), sb6);
            b("javaClass: " + i17.getClass().getCanonicalName(), sb6);
        }
        java.lang.String sb7 = sb6.toString();
        kotlin.jvm.internal.o.f(sb7, "toString(...)");
        return sb7;
    }

    public static final java.lang.StringBuilder b(java.lang.String str, java.lang.StringBuilder sb6) {
        kotlin.jvm.internal.o.g(str, "<this>");
        sb6.append(str);
        sb6.append('\n');
        return sb6;
    }
}
