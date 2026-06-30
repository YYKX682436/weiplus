package h06;

/* loaded from: classes16.dex */
public abstract class a {
    public static final boolean a(f06.c cVar) {
        j06.k i17;
        j06.k k17;
        kotlin.jvm.internal.o.g(cVar, "<this>");
        if (cVar instanceof f06.m) {
            f06.v vVar = (f06.v) cVar;
            java.lang.reflect.Field a17 = h06.c.a(vVar);
            if (a17 != null ? a17.isAccessible() : true) {
                java.lang.reflect.Method b17 = h06.c.b(vVar.c());
                if (b17 != null ? b17.isAccessible() : true) {
                    java.lang.reflect.Method b18 = h06.c.b(((f06.m) cVar).b());
                    if (b18 != null ? b18.isAccessible() : true) {
                        return true;
                    }
                }
            }
        } else if (cVar instanceof f06.v) {
            f06.v vVar2 = (f06.v) cVar;
            java.lang.reflect.Field a18 = h06.c.a(vVar2);
            if (a18 != null ? a18.isAccessible() : true) {
                java.lang.reflect.Method b19 = h06.c.b(vVar2.c());
                if (b19 != null ? b19.isAccessible() : true) {
                    return true;
                }
            }
        } else if (cVar instanceof f06.q) {
            java.lang.reflect.Field a19 = h06.c.a(((f06.q) cVar).f());
            if (a19 != null ? a19.isAccessible() : true) {
                java.lang.reflect.Method b27 = h06.c.b((f06.g) cVar);
                if (b27 != null ? b27.isAccessible() : true) {
                    return true;
                }
            }
        } else if (cVar instanceof f06.h) {
            java.lang.reflect.Field a27 = h06.c.a(((f06.h) cVar).f());
            if (a27 != null ? a27.isAccessible() : true) {
                java.lang.reflect.Method b28 = h06.c.b((f06.g) cVar);
                if (b28 != null ? b28.isAccessible() : true) {
                    return true;
                }
            }
        } else {
            if (!(cVar instanceof f06.g)) {
                throw new java.lang.UnsupportedOperationException("Unknown callable: " + cVar + " (" + cVar.getClass() + ')');
            }
            f06.g gVar = (f06.g) cVar;
            java.lang.reflect.Method b29 = h06.c.b(gVar);
            if (b29 != null ? b29.isAccessible() : true) {
                i06.k0 a28 = i06.o4.a(cVar);
                java.lang.Object b37 = (a28 == null || (k17 = a28.k()) == null) ? null : k17.b();
                java.lang.reflect.AccessibleObject accessibleObject = b37 instanceof java.lang.reflect.AccessibleObject ? (java.lang.reflect.AccessibleObject) b37 : null;
                if (accessibleObject != null ? accessibleObject.isAccessible() : true) {
                    i06.k0 a29 = i06.o4.a(gVar);
                    java.lang.Object b38 = (a29 == null || (i17 = a29.i()) == null) ? null : i17.b();
                    java.lang.reflect.Constructor constructor = b38 instanceof java.lang.reflect.Constructor ? (java.lang.reflect.Constructor) b38 : null;
                    if (constructor != null ? constructor.isAccessible() : true) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
