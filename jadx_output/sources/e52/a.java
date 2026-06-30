package e52;

/* loaded from: classes12.dex */
public final class a {
    public a(kotlin.jvm.internal.i iVar) {
    }

    public final java.util.ArrayList a(java.lang.Class cls) {
        if (cls == null) {
            return null;
        }
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        b(cls, linkedHashSet);
        return new java.util.ArrayList(linkedHashSet);
    }

    public final void b(java.lang.Class cls, java.util.HashSet hashSet) {
        while (cls != null) {
            java.lang.Class<?>[] interfaces = cls.getInterfaces();
            kotlin.jvm.internal.o.d(interfaces);
            for (java.lang.Class<?> cls2 : interfaces) {
                if (hashSet.add(cls2)) {
                    b(cls2, hashSet);
                }
            }
            cls = cls.getSuperclass();
        }
    }
}
