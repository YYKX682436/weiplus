package com.tencent.mm.ui.chatting.gallery;

/* loaded from: classes3.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.ui.chatting.gallery.p f201254a = new com.tencent.mm.ui.chatting.gallery.p();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f201255b = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.concurrent.locks.ReentrantReadWriteLock f201256c = new java.util.concurrent.locks.ReentrantReadWriteLock();

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.HashMap f201257d = new java.util.HashMap();

    public final boolean a(long j17) {
        java.lang.Boolean bool = (java.lang.Boolean) f201257d.get(java.lang.Long.valueOf(j17));
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public final void b() {
        f201256c.writeLock().lock();
        try {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("pauseAll: pausing all downloaders, size=");
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = f201255b;
            sb6.append(concurrentHashMap.size());
            com.tencent.mars.xlog.Log.i("MicroMsg.Imagegallery.C2CThumbVideoDownloader", sb6.toString());
            java.util.Set keySet = concurrentHashMap.keySet();
            kotlin.jvm.internal.o.f(keySet, "<get-keys>(...)");
            java.util.Iterator it = keySet.iterator();
            while (it.hasNext()) {
                long longValue = ((java.lang.Number) it.next()).longValue();
                fk4.k kVar = (fk4.k) f201255b.get(java.lang.Long.valueOf(longValue));
                if (kVar != null) {
                    if (kVar.f263618f) {
                        c(longValue);
                    } else if (kVar.i()) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.Imagegallery.C2CThumbVideoDownloader", "pauseAll: pausing downloader[" + longValue + ']');
                        kVar.l();
                    }
                }
            }
        } finally {
            f201256c.writeLock().unlock();
        }
    }

    public final fk4.k c(long j17) {
        return (fk4.k) f201255b.remove(java.lang.Long.valueOf(j17));
    }
}
