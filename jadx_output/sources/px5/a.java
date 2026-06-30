package px5;

/* loaded from: classes11.dex */
public final class a {
    public a(kotlin.jvm.internal.i iVar) {
    }

    public final long a(java.lang.String key) {
        kotlin.jvm.internal.o.g(key, "key");
        java.util.HashMap hashMap = px5.b.f358958b;
        if (!hashMap.containsKey(key)) {
            return 0L;
        }
        java.lang.Object obj = hashMap.get(key);
        kotlin.jvm.internal.o.d(obj);
        long longValue = ((java.lang.Number) obj).longValue();
        hashMap.remove(key);
        return java.lang.System.currentTimeMillis() - longValue;
    }
}
