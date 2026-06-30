package d75;

/* loaded from: classes13.dex */
public final class d {
    public d(kotlin.jvm.internal.i iVar) {
    }

    public final java.lang.Object a(java.lang.String key) {
        kotlin.jvm.internal.o.g(key, "key");
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = d75.e.f226891b;
        java.lang.Object obj = concurrentHashMap.get(key);
        if (obj == null) {
            obj = null;
        }
        if (obj != null) {
            concurrentHashMap.remove(key);
        }
        return obj;
    }
}
