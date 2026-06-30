package xz0;

/* loaded from: classes15.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final xz0.b f458171a = new xz0.b();

    /* renamed from: b, reason: collision with root package name */
    public static final yz0.b f458172b;

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f458173c;

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.concurrent.locks.ReentrantReadWriteLock f458174d;

    static {
        cf0.z zVar = (cf0.z) i95.n0.c(cf0.z.class);
        zVar.getClass();
        gm0.j1.b().c();
        yz0.b bVar = zVar.f40868m;
        if (bVar == null) {
            zVar.requireAccountInitialized();
            zVar.Ai();
            d95.b0 b0Var = zVar.f40866h;
            kotlin.jvm.internal.o.d(b0Var);
            bVar = new yz0.b(b0Var);
        }
        zVar.f40868m = bVar;
        f458172b = bVar;
        f458173c = new java.util.concurrent.ConcurrentHashMap(100);
        f458174d = new java.util.concurrent.locks.ReentrantReadWriteLock();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0051, code lost:
    
        if (r3 == null) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final yz0.a a(java.lang.String r10, boolean r11) {
        /*
            r9 = this;
            java.lang.String r0 = "mediaId"
            kotlin.jvm.internal.o.g(r10, r0)
            int r0 = r10.length()
            r1 = 1
            r2 = 0
            if (r0 != 0) goto Lf
            r0 = r1
            goto L10
        Lf:
            r0 = r2
        L10:
            if (r0 == 0) goto L1a
            yz0.a r11 = new yz0.a
            r11.<init>()
            r11.field_mediaId = r10
            return r11
        L1a:
            java.util.concurrent.ConcurrentHashMap r0 = xz0.b.f458173c
            java.lang.Object r3 = r0.get(r10)
            yz0.a r3 = (yz0.a) r3
            java.lang.String r4 = ", memoryCache size:"
            java.lang.String r5 = "[query] mediaId="
            java.lang.String r6 = "Finder.MediaCacheLogic"
            if (r3 == 0) goto L53
            java.lang.Object r3 = r0.get(r10)
            yz0.a r3 = (yz0.a) r3
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>(r5)
            r7.append(r10)
            java.lang.String r8 = " hit memory cache:"
            r7.append(r8)
            r7.append(r3)
            r7.append(r4)
            int r8 = r0.size()
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            com.tencent.mars.xlog.Log.i(r6, r7)
            if (r3 != 0) goto L8a
        L53:
            java.util.concurrent.locks.ReentrantReadWriteLock r3 = xz0.b.f458174d
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r3 = r3.readLock()
            r3.lock()
            yz0.b r7 = xz0.b.f458172b     // Catch: java.lang.Throwable -> Le8
            yz0.a r7 = r7.y0(r10)     // Catch: java.lang.Throwable -> Le8
            r3.unlock()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r5)
            r3.append(r10)
            java.lang.String r8 = " hit db cache:"
            r3.append(r8)
            r3.append(r7)
            r3.append(r4)
            int r4 = r0.size()
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            com.tencent.mars.xlog.Log.i(r6, r3)
            r0.put(r10, r7)
            r3 = r7
        L8a:
            if (r11 == 0) goto Le7
            java.lang.String r11 = r3.t0()
            int r11 = r11.length()
            if (r11 <= 0) goto L97
            goto L98
        L97:
            r1 = r2
        L98:
            if (r1 == 0) goto Le7
            java.lang.String r11 = r3.t0()
            boolean r11 = com.tencent.mm.vfs.w6.j(r11)
            if (r11 != 0) goto Le7
            r0 = 0
            r3.field_cacheSize = r0
            r3.field_totalSize = r0
            r3.field_hasPlayed = r2
            java.lang.String r11 = ""
            r3.field_specFormat = r11
            r3.field_codecFormat = r2
            r3.field_moovReady = r2
            r3.field_audioBitrate = r2
            r3.field_videoBitrate = r2
            r3.field_frameRate = r2
            r3.field_netProfile = r11
            r11 = -2
            r3.field_state = r11
            java.lang.String r11 = "query"
            r9.b(r3, r11)
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>(r5)
            r11.append(r10)
            java.lang.String r10 = " not found file. cache:"
            r11.append(r10)
            r11.append(r3)
            java.lang.String r10 = " filePath="
            r11.append(r10)
            java.lang.String r10 = r3.t0()
            r11.append(r10)
            java.lang.String r10 = r11.toString()
            com.tencent.mars.xlog.Log.i(r6, r10)
        Le7:
            return r3
        Le8:
            r10 = move-exception
            r3.unlock()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: xz0.b.a(java.lang.String, boolean):yz0.a");
    }

    public final void b(yz0.a cache, java.lang.String invokeSource) {
        kotlin.jvm.internal.o.g(cache, "cache");
        kotlin.jvm.internal.o.g(invokeSource, "invokeSource");
        cache.field_updateTime = c01.id.c();
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = f458173c;
        java.lang.String field_mediaId = cache.field_mediaId;
        kotlin.jvm.internal.o.f(field_mediaId, "field_mediaId");
        concurrentHashMap.put(field_mediaId, cache);
        java.lang.String field_mediaId2 = cache.field_mediaId;
        kotlin.jvm.internal.o.f(field_mediaId2, "field_mediaId");
        pm0.v.N("FinderMediaCacheUpdateThread", false, new xz0.a(cache, field_mediaId2));
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("replaced ");
        sb6.append(invokeSource);
        sb6.append(" isExist=");
        java.lang.String field_mediaId3 = cache.field_mediaId;
        kotlin.jvm.internal.o.f(field_mediaId3, "field_mediaId");
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock readLock = f458174d.readLock();
        readLock.lock();
        try {
            boolean D0 = f458172b.D0(field_mediaId3);
            readLock.unlock();
            sb6.append(D0);
            sb6.append(' ');
            sb6.append(cache);
            sb6.append(' ');
            com.tencent.mars.xlog.Log.i("Finder.MediaCacheLogic", sb6.toString());
        } catch (java.lang.Throwable th6) {
            readLock.unlock();
            throw th6;
        }
    }

    public final void c(java.lang.String mediaId, java.lang.String originalMediaId, java.lang.String url, int i17, java.lang.String specFormat, int i18, long j17, long j18, int i19, int i27, java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        kotlin.jvm.internal.o.g(originalMediaId, "originalMediaId");
        kotlin.jvm.internal.o.g(url, "url");
        kotlin.jvm.internal.o.g(specFormat, "specFormat");
        yz0.a a17 = a(mediaId, false);
        a17.field_mediaId = mediaId;
        a17.field_originMediaId = originalMediaId;
        a17.field_url = url;
        a17.field_specFormat = specFormat;
        a17.field_codecFormat = i17;
        a17.field_dynamicRangeType = i18;
        a17.field_cacheSize = j17;
        a17.field_totalSize = j18;
        a17.field_state = i19;
        a17.field_duration = i27;
        a17.field_urlToken = str;
        a17.field_decodeKey = str2;
        b(a17, "store");
        com.tencent.mars.xlog.Log.i("Finder.MediaCacheLogic", "store mediaId:" + mediaId + " cache:" + a17);
    }
}
