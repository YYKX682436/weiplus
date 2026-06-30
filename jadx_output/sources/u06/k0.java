package u06;

/* loaded from: classes16.dex */
public abstract class k0 implements e16.u {
    @Override // e16.d
    public e16.a a(n16.c fqName) {
        java.lang.Object obj;
        kotlin.jvm.internal.o.g(fqName, "fqName");
        java.util.Iterator it = getAnnotations().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (kotlin.jvm.internal.o.b(u06.i.a(xz5.a.b(xz5.a.a(((u06.j) ((e16.a) obj)).f423510a))).b(), fqName)) {
                break;
            }
        }
        return (e16.a) obj;
    }

    public abstract java.lang.reflect.Type c();

    public boolean equals(java.lang.Object obj) {
        return (obj instanceof u06.k0) && kotlin.jvm.internal.o.b(c(), ((u06.k0) obj).c());
    }

    public int hashCode() {
        return c().hashCode();
    }

    public java.lang.String toString() {
        return getClass().getName() + ": " + c();
    }
}
