package y00;

/* loaded from: classes3.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public static final android.util.LruCache f458527a = new android.util.LruCache(10);

    public static final y00.g a(java.lang.String str, long j17) {
        android.util.LruCache lruCache;
        if ((str == null || str.length() == 0) || j17 <= 0 || (lruCache = (android.util.LruCache) f458527a.get(str)) == null) {
            return null;
        }
        return (y00.g) lruCache.get(java.lang.Long.valueOf(j17));
    }

    public static final void b(java.lang.String str, long j17, java.util.Map map, long j18) {
        if (!kotlin.jvm.internal.o.b(android.os.Looper.myLooper(), android.os.Looper.getMainLooper())) {
            throw new java.lang.IllegalStateException(("EcsKfProductCardMemCache.put must be called on main thread, actual=" + java.lang.Thread.currentThread().getName()).toString());
        }
        if (str == null || str.length() == 0) {
            com.tencent.mars.xlog.Log.w("MicroMsg.EcsKfProductCardMemCache", "put fail: empty talker, msgSvrId=%d", java.lang.Long.valueOf(j17));
            return;
        }
        if (j17 <= 0) {
            com.tencent.mars.xlog.Log.w("MicroMsg.EcsKfProductCardMemCache", "put fail: invalid msgSvrId=%d, talker=%s", java.lang.Long.valueOf(j17), str);
            return;
        }
        if (map == null || map.isEmpty()) {
            com.tencent.mars.xlog.Log.w("MicroMsg.EcsKfProductCardMemCache", "put fail: empty values, msgSvrId=%d, talker=%s", java.lang.Long.valueOf(j17), str);
            return;
        }
        android.util.LruCache lruCache = f458527a;
        android.util.LruCache lruCache2 = (android.util.LruCache) lruCache.get(str);
        if (lruCache2 == null) {
            lruCache2 = new android.util.LruCache(15);
            lruCache.put(str, lruCache2);
        }
        lruCache2.put(java.lang.Long.valueOf(j17), new y00.g(map, j18));
    }
}
