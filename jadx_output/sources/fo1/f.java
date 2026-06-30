package fo1;

/* loaded from: classes5.dex */
public abstract class f {
    public static final java.lang.Object a(java.util.Collection collection, yz5.l predicate) {
        kotlin.jvm.internal.o.g(collection, "<this>");
        kotlin.jvm.internal.o.g(predicate, "predicate");
        java.util.Iterator it = collection.iterator();
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            if (((java.lang.Boolean) predicate.invoke(next)).booleanValue()) {
                it.remove();
                return next;
            }
        }
        return null;
    }

    public static final boolean b(java.util.Collection collection, yz5.l predicate) {
        kotlin.jvm.internal.o.g(collection, "<this>");
        kotlin.jvm.internal.o.g(predicate, "predicate");
        java.util.Iterator it = collection.iterator();
        boolean z17 = false;
        while (it.hasNext()) {
            if (((java.lang.Boolean) predicate.invoke(it.next())).booleanValue()) {
                it.remove();
                z17 = true;
            }
        }
        return z17;
    }

    public static final java.util.Map.Entry c(java.util.Map map, yz5.l predicate) {
        kotlin.jvm.internal.o.g(map, "<this>");
        kotlin.jvm.internal.o.g(predicate, "predicate");
        for (java.util.Map.Entry entry : map.entrySet()) {
            if (((java.lang.Boolean) predicate.invoke(entry)).booleanValue()) {
                return entry;
            }
        }
        return null;
    }
}
