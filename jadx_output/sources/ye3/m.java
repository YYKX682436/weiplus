package ye3;

/* loaded from: classes15.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public static final ye3.m f461226a = new ye3.m();

    /* renamed from: b, reason: collision with root package name */
    public static final jz5.g f461227b = jz5.h.b(ye3.l.f461225d);

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f461228c = new java.util.concurrent.ConcurrentHashMap(100);

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.concurrent.locks.ReentrantReadWriteLock f461229d = new java.util.concurrent.locks.ReentrantReadWriteLock();

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0106, code lost:
    
        r13 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x010a, code lost:
    
        throw r13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final ye3.n a(java.lang.String r13, boolean r14) {
        /*
            Method dump skipped, instructions count: 267
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ye3.m.a(java.lang.String, boolean):ye3.n");
    }

    public final void b(ye3.n cache, java.lang.String invokeSource) {
        boolean D0;
        boolean insert;
        kotlin.jvm.internal.o.g(cache, "cache");
        kotlin.jvm.internal.o.g(invokeSource, "invokeSource");
        java.lang.String str = cache.field_mediaId;
        int i17 = 0;
        boolean z17 = true;
        if (str == null || str.length() == 0) {
            com.tencent.mars.xlog.Log.w("MB_External_surface_DB", "[replace] mediaId is isNullOrEmpty, skip. invokeSource=".concat(invokeSource));
            return;
        }
        cache.field_updateTime = c01.id.c();
        c(cache);
        java.lang.String field_mediaId = cache.field_mediaId;
        kotlin.jvm.internal.o.f(field_mediaId, "field_mediaId");
        jz5.g gVar = f461227b;
        ye3.o oVar = (ye3.o) ((jz5.n) gVar).getValue();
        if (oVar != null) {
            java.util.concurrent.locks.ReentrantReadWriteLock reentrantReadWriteLock = f461229d;
            java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
            int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
            for (int i18 = 0; i18 < readHoldCount; i18++) {
                readLock.unlock();
            }
            java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
            writeLock.lock();
            try {
                if (field_mediaId.length() != 0) {
                    z17 = false;
                }
                if (z17) {
                    D0 = false;
                } else {
                    java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock readLock2 = reentrantReadWriteLock.readLock();
                    readLock2.lock();
                    try {
                        ye3.o oVar2 = (ye3.o) ((jz5.n) gVar).getValue();
                        D0 = oVar2 != null ? oVar2.D0(field_mediaId) : false;
                    } finally {
                        readLock2.unlock();
                    }
                }
                if (D0) {
                    insert = oVar.J0(cache);
                    com.tencent.mars.xlog.Log.i("MB_External_surface_DB", "[syncMemoryCacheToDbAsync] update success. mediaId=" + field_mediaId + " ret=" + insert);
                } else {
                    insert = oVar.insert(cache);
                    com.tencent.mars.xlog.Log.i("MB_External_surface_DB", "[syncMemoryCacheToDbAsync] insert success. mediaId=" + field_mediaId + " ret=" + insert);
                }
                if (!insert) {
                    com.tencent.mars.xlog.Log.e("MB_External_surface_DB", "[syncMemoryCacheToDbAsync] operation failed. mediaId=" + field_mediaId + " isExist=" + D0 + " cache=" + cache);
                }
            } finally {
                while (i17 < readHoldCount) {
                    readLock.lock();
                    i17++;
                }
                writeLock.unlock();
            }
        }
        com.tencent.mars.xlog.Log.i("MB_External_surface_DB", "[replace] success. invokeSource=" + invokeSource + " mediaId=" + cache.field_mediaId + " state=" + cache.field_state + " filePath=" + cache.t0());
    }

    public final void c(ye3.n nVar) {
        java.lang.String str = nVar.field_mediaId;
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = f461228c;
        if (concurrentHashMap.size() >= 100 && !concurrentHashMap.containsKey(str)) {
            java.util.Set keySet = concurrentHashMap.keySet();
            kotlin.jvm.internal.o.f(keySet, "<get-keys>(...)");
            java.lang.Object W = kz5.n0.W(keySet);
            kotlin.jvm.internal.o.f(W, "first(...)");
            java.lang.String str2 = (java.lang.String) W;
            concurrentHashMap.remove(str2);
            com.tencent.mars.xlog.Log.i("MB_External_surface_DB", "[updateMemoryCache] memory cache full, remove oldest. removed=" + str2 + " size=" + concurrentHashMap.size());
        }
        kotlin.jvm.internal.o.d(str);
        concurrentHashMap.put(str, nVar);
    }
}
