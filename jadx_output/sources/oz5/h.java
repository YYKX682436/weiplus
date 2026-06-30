package oz5;

/* loaded from: classes14.dex */
public abstract class h {
    public static oz5.i a(oz5.i iVar, oz5.j key) {
        kotlin.jvm.internal.o.g(key, "key");
        if (kotlin.jvm.internal.o.b(iVar.getKey(), key)) {
            return iVar;
        }
        return null;
    }

    public static oz5.l b(oz5.i iVar, oz5.j key) {
        kotlin.jvm.internal.o.g(key, "key");
        return kotlin.jvm.internal.o.b(iVar.getKey(), key) ? oz5.m.f350329d : iVar;
    }
}
