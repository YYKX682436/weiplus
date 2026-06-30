package pj;

/* loaded from: classes12.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final pj.d f354902a = new pj.d();

    public final java.lang.reflect.Method a(java.lang.Class javaClass, java.lang.String name, java.lang.Class[] clsArr) {
        java.lang.Object obj;
        java.lang.reflect.Method b17;
        kotlin.jvm.internal.o.g(javaClass, "javaClass");
        kotlin.jvm.internal.o.g(name, "name");
        java.util.Iterator it = g06.f.a(kotlin.jvm.internal.i0.a(javaClass)).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (kotlin.jvm.internal.o.b(((f06.g) obj).getName(), name)) {
                break;
            }
        }
        f06.g gVar = (f06.g) obj;
        if (gVar != null && (b17 = h06.c.b(gVar)) != null) {
            return b17;
        }
        if (clsArr == null) {
            java.lang.reflect.Method method = javaClass.getMethod(name, new java.lang.Class[0]);
            kotlin.jvm.internal.o.f(method, "getMethod(...)");
            return method;
        }
        java.lang.reflect.Method method2 = javaClass.getMethod(name, (java.lang.Class[]) java.util.Arrays.copyOf(clsArr, clsArr.length));
        kotlin.jvm.internal.o.f(method2, "getMethod(...)");
        return method2;
    }
}
