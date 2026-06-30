package h06;

/* loaded from: classes16.dex */
public abstract class c {
    public static final java.lang.reflect.Field a(f06.v vVar) {
        kotlin.jvm.internal.o.g(vVar, "<this>");
        i06.q3 c17 = i06.o4.c(vVar);
        if (c17 != null) {
            return (java.lang.reflect.Field) c17.f286735q.getValue();
        }
        return null;
    }

    public static final java.lang.reflect.Method b(f06.g gVar) {
        j06.k i17;
        kotlin.jvm.internal.o.g(gVar, "<this>");
        i06.k0 a17 = i06.o4.a(gVar);
        java.lang.reflect.Member b17 = (a17 == null || (i17 = a17.i()) == null) ? null : i17.b();
        if (b17 instanceof java.lang.reflect.Method) {
            return (java.lang.reflect.Method) b17;
        }
        return null;
    }
}
