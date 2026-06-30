package y00;

/* loaded from: classes3.dex */
public final class n implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.HashMap f458539d;

    public n(java.util.HashMap hashMap) {
        this.f458539d = hashMap;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.util.LruCache lruCache;
        for (java.util.Map.Entry entry : this.f458539d.entrySet()) {
            java.lang.String str = (java.lang.String) entry.getKey();
            java.util.Iterator it = ((java.util.List) entry.getValue()).iterator();
            while (it.hasNext()) {
                long longValue = ((java.lang.Number) it.next()).longValue();
                android.util.LruCache lruCache2 = y00.h.f458527a;
                if (!kotlin.jvm.internal.o.b(android.os.Looper.myLooper(), android.os.Looper.getMainLooper())) {
                    throw new java.lang.IllegalStateException(("EcsKfProductCardMemCache.remove must be called on main thread, actual=" + java.lang.Thread.currentThread().getName()).toString());
                }
                if (!(str == null || str.length() == 0) && longValue > 0 && (lruCache = (android.util.LruCache) y00.h.f458527a.get(str)) != null) {
                }
            }
        }
    }
}
