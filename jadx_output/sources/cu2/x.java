package cu2;

/* loaded from: classes10.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public static final cu2.x f222449a = new cu2.x();

    /* renamed from: b, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.x90 f222450b = (com.tencent.mm.plugin.finder.storage.x90) ((c61.l7) i95.n0.c(c61.l7.class)).B.getValue();

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f222451c = new java.util.concurrent.ConcurrentHashMap(100);

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f222452d = new java.util.concurrent.ConcurrentHashMap(100);

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.concurrent.locks.ReentrantReadWriteLock f222453e = new java.util.concurrent.locks.ReentrantReadWriteLock();

    public static void b(cu2.x xVar, long j17, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            j17 = 604800000;
        }
        xVar.getClass();
        long currentTimeMillis = java.lang.System.currentTimeMillis() - j17;
        long currentTimeMillis2 = java.lang.System.currentTimeMillis();
        p75.n0 n0Var = dm.w4.f240778J;
        n0Var.getClass();
        p75.m0 x17 = dm.w4.K.x(java.lang.Long.valueOf(currentTimeMillis));
        if (n0Var instanceof p75.z) {
            throw new java.lang.IllegalArgumentException("Not support multi table delete");
        }
        java.lang.String table = n0Var.b();
        p75.h hVar = (p75.h) x17;
        java.lang.String b17 = hVar.b();
        java.lang.String[] e17 = hVar.e();
        kotlin.jvm.internal.o.g(table, "table");
        l75.k0 k0Var = f222450b.f128296d;
        int delete = k0Var != null ? k0Var.delete(table, b17, e17) : -1;
        com.tencent.mars.xlog.Log.i("Finder.MediaCacheLogic", "[deleteExpired] before=" + currentTimeMillis + " ret=" + delete + " cost=" + (java.lang.System.currentTimeMillis() - currentTimeMillis2) + "ms");
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0066, code lost:
    
        if (r13 == null) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static so2.i3 c(cu2.x r7, java.lang.String r8, boolean r9, boolean r10, boolean r11, int r12, java.lang.Object r13) {
        /*
            Method dump skipped, instructions count: 246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: cu2.x.c(cu2.x, java.lang.String, boolean, boolean, boolean, int, java.lang.Object):so2.i3");
    }

    public static void h(cu2.x xVar, long j17, java.lang.String mediaId, java.lang.String originalMediaId, java.lang.String url, int i17, java.lang.String specFormat, int i18, long j18, long j19, int i19, int i27, java.lang.String str, java.lang.String str2, boolean z17, boolean z18, int i28, java.lang.Object obj) {
        boolean z19 = (i28 & 8192) != 0 ? false : z17;
        boolean z27 = (i28 & 16384) != 0 ? false : z18;
        xVar.getClass();
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        kotlin.jvm.internal.o.g(originalMediaId, "originalMediaId");
        kotlin.jvm.internal.o.g(url, "url");
        kotlin.jvm.internal.o.g(specFormat, "specFormat");
        so2.i3 c17 = c(xVar, mediaId, false, false, false, 12, null);
        c17.field_feedId = j17;
        c17.field_mediaId = mediaId;
        c17.field_originMediaId = originalMediaId;
        c17.field_url = url;
        c17.field_reqFormat = i17;
        c17.field_fileFormat = specFormat;
        c17.field_dynamicRangeType = i18;
        c17.field_cacheSize = j18;
        c17.field_totalSize = j19;
        c17.field_state = i19;
        c17.field_duration = i27;
        c17.field_urlToken = str;
        c17.field_decodeKey = str2;
        if (z19) {
            c17.field_moovReady = true;
        }
        c17.field_isHlsSpec = z27;
        xVar.g(c17, "store");
        com.tencent.mars.xlog.Log.i("Finder.MediaCacheLogic", "store feedId:" + pm0.v.u(j17) + " mediaId:" + mediaId + " cache:" + c17);
    }

    /* JADX WARN: Finally extract failed */
    public final boolean a() {
        java.util.concurrent.locks.ReentrantReadWriteLock reentrantReadWriteLock = f222453e;
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        for (int i17 = 0; i17 < readHoldCount; i17++) {
            readLock.unlock();
        }
        java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            com.tencent.mm.plugin.finder.storage.x90 x90Var = f222450b;
            int delete = x90Var.f128296d.delete(x90Var.getTableName(), "rowid >= ?", new java.lang.String[]{"0"});
            for (int i18 = 0; i18 < readHoldCount; i18++) {
                readLock.lock();
            }
            writeLock.unlock();
            com.tencent.mars.xlog.Log.i("Finder.MediaCacheLogic", "[deleteAll] ret=" + delete);
            f222451c.clear();
            return delete >= 0;
        } catch (java.lang.Throwable th6) {
            for (int i19 = 0; i19 < readHoldCount; i19++) {
                readLock.lock();
            }
            writeLock.unlock();
            throw th6;
        }
    }

    public final java.util.List d(java.lang.String originalMediaId) {
        kotlin.jvm.internal.o.g(originalMediaId, "originalMediaId");
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock readLock = f222453e.readLock();
        readLock.lock();
        try {
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = f222452d;
            java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = (java.util.concurrent.CopyOnWriteArrayList) concurrentHashMap.get(originalMediaId);
            if (copyOnWriteArrayList == null) {
                copyOnWriteArrayList = new java.util.concurrent.CopyOnWriteArrayList(f222450b.D0(originalMediaId));
                concurrentHashMap.put(originalMediaId, copyOnWriteArrayList);
            }
            return copyOnWriteArrayList;
        } finally {
            readLock.unlock();
        }
    }

    public final float e(java.lang.String mediaId, java.lang.String originalMediaId, long j17) {
        float f17;
        int i17;
        float f18;
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        kotlin.jvm.internal.o.g(originalMediaId, "originalMediaId");
        if (android.text.TextUtils.isEmpty(mediaId)) {
            java.lang.Object obj = null;
            if (!android.text.TextUtils.isEmpty(originalMediaId)) {
                java.util.Iterator it = d(originalMediaId).iterator();
                if (it.hasNext()) {
                    obj = it.next();
                    if (it.hasNext()) {
                        long j18 = ((so2.i3) obj).field_updateTime;
                        do {
                            java.lang.Object next = it.next();
                            long j19 = ((so2.i3) next).field_updateTime;
                            if (j18 < j19) {
                                obj = next;
                                j18 = j19;
                            }
                        } while (it.hasNext());
                    }
                }
                so2.i3 i3Var = (so2.i3) obj;
                if (i3Var != null) {
                    f17 = i3Var.field_playProgress;
                    i17 = i3Var.field_duration;
                    f18 = i17;
                }
                return 0.0f;
            }
            if (j17 != 0) {
                java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock readLock = f222453e.readLock();
                readLock.lock();
                try {
                    java.util.LinkedList y07 = f222450b.y0(j17);
                    readLock.unlock();
                    java.util.Iterator it6 = y07.iterator();
                    if (it6.hasNext()) {
                        obj = it6.next();
                        if (it6.hasNext()) {
                            long j27 = ((so2.i3) obj).field_updateTime;
                            do {
                                java.lang.Object next2 = it6.next();
                                long j28 = ((so2.i3) next2).field_updateTime;
                                if (j27 < j28) {
                                    obj = next2;
                                    j27 = j28;
                                }
                            } while (it6.hasNext());
                        }
                    }
                    so2.i3 i3Var2 = (so2.i3) obj;
                    if (i3Var2 != null) {
                        f17 = i3Var2.field_playProgress;
                        i17 = i3Var2.field_duration;
                        f18 = i17;
                    }
                } catch (java.lang.Throwable th6) {
                    readLock.unlock();
                    throw th6;
                }
            }
            return 0.0f;
        }
        so2.i3 c17 = c(this, mediaId, false, false, false, 14, null);
        f18 = c17.field_playProgress;
        f17 = c17.field_duration;
        return f18 * f17;
    }

    public final jz5.l f(long j17) {
        float f17;
        int i17;
        java.lang.Object obj;
        if (j17 != 0) {
            java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock readLock = f222453e.readLock();
            readLock.lock();
            try {
                java.util.LinkedList y07 = f222450b.y0(j17);
                readLock.unlock();
                java.util.Iterator it = y07.iterator();
                if (it.hasNext()) {
                    java.lang.Object next = it.next();
                    if (it.hasNext()) {
                        long j18 = ((so2.i3) next).field_updateTime;
                        do {
                            java.lang.Object next2 = it.next();
                            long j19 = ((so2.i3) next2).field_updateTime;
                            if (j18 > j19) {
                                next = next2;
                                j18 = j19;
                            }
                        } while (it.hasNext());
                    }
                    obj = next;
                } else {
                    obj = null;
                }
                so2.i3 i3Var = (so2.i3) obj;
                if (i3Var != null) {
                    float f18 = i3Var.field_playProgress;
                    i17 = i3Var.field_duration;
                    f17 = f18 * i17;
                    return new jz5.l(java.lang.Float.valueOf(f17), java.lang.Integer.valueOf(i17));
                }
            } catch (java.lang.Throwable th6) {
                readLock.unlock();
                throw th6;
            }
        }
        f17 = 0.0f;
        i17 = 0;
        return new jz5.l(java.lang.Float.valueOf(f17), java.lang.Integer.valueOf(i17));
    }

    public final void g(so2.i3 cache, java.lang.String invokeSource) {
        kotlin.jvm.internal.o.g(cache, "cache");
        kotlin.jvm.internal.o.g(invokeSource, "invokeSource");
        cache.field_updateTime = c01.id.c();
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = f222451c;
        java.lang.String field_mediaId = cache.field_mediaId;
        kotlin.jvm.internal.o.f(field_mediaId, "field_mediaId");
        concurrentHashMap.put(field_mediaId, cache);
        java.lang.String field_mediaId2 = cache.field_mediaId;
        kotlin.jvm.internal.o.f(field_mediaId2, "field_mediaId");
        i(field_mediaId2, cache, true);
        com.tencent.mars.xlog.Log.i("Finder.MediaCacheLogic", "replaced " + invokeSource + ' ' + cache + ' ');
    }

    public final void i(java.lang.String str, so2.i3 i3Var, boolean z17) {
        pm0.v.N("FinderMediaCacheUpdateThread", false, new cu2.w(i3Var, z17, str));
    }

    public final void j(java.lang.String mediaId, java.lang.Integer num, java.lang.String str) {
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        so2.i3 c17 = c(this, mediaId, false, false, false, 14, null);
        if (num != null) {
            c17.field_reqFormat = num.intValue();
        }
        if (str != null) {
            c17.field_fileFormat = str;
        }
        i(mediaId, c17, false);
    }

    public final so2.i3 k(java.lang.String mediaId, java.lang.String fileFormat) {
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        kotlin.jvm.internal.o.g(fileFormat, "fileFormat");
        so2.i3 c17 = c(this, mediaId, false, false, false, 14, null);
        c17.field_moovReady = true;
        if (!kotlin.jvm.internal.o.b(c17.field_fileFormat, fileFormat)) {
            c17.field_fileFormat = fileFormat;
        }
        i(mediaId, c17, false);
        return c17;
    }

    public final void l(java.lang.String mediaId, java.lang.String profile) {
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        kotlin.jvm.internal.o.g(profile, "profile");
        if (profile.length() == 0) {
            return;
        }
        try {
            so2.i3 c17 = c(this, mediaId, false, false, false, 14, null);
            com.tencent.mars.xlog.Log.i("Finder.MediaCacheLogic", "[netprofile] update " + mediaId + " with " + profile);
            c17.field_netProfile = profile;
            f222450b.P0(c17);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("Finder.MediaCacheLogic", "[netprofile] update " + mediaId + " failed " + e17.getLocalizedMessage());
        }
    }

    public final void m(java.lang.String mediaId, long j17, long j18) {
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        so2.i3 c17 = c(this, mediaId, false, false, false, 14, null);
        java.lang.Long valueOf = java.lang.Long.valueOf(j18);
        if (!java.lang.Boolean.valueOf(valueOf.longValue() > 0).booleanValue()) {
            valueOf = null;
        }
        c17.field_playProgress = valueOf != null ? java.lang.Float.valueOf((((float) j17) * 1.0f) / ((float) valueOf.longValue())).floatValue() : 0.0f;
        kotlinx.coroutines.flow.i2 i2Var = cu2.z.f222457a;
        float f17 = c17.field_playProgress;
        long j19 = c17.field_feedId;
        x.g gVar = cu2.z.f222458b;
        java.lang.Float f18 = (java.lang.Float) gVar.get(java.lang.Long.valueOf(j19));
        if (f18 == null) {
            f18 = java.lang.Float.valueOf(0.0f);
        }
        if (f17 > f18.floatValue()) {
            gVar.put(java.lang.Long.valueOf(j19), java.lang.Float.valueOf(f17));
            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
            kotlinx.coroutines.l.d(kotlinx.coroutines.z0.a(((t26.a) kotlinx.coroutines.internal.b0.f310484a).f415347h), null, null, new cu2.y(c17, f17, null), 3, null);
        }
        i(mediaId, c17, false);
    }

    public final so2.i3 n(java.lang.String mediaId, long j17, long j18, int i17) {
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        so2.i3 c17 = c(this, mediaId, false, false, false, 14, null);
        c17.field_cacheSize = j17;
        c17.field_totalSize = j18;
        c17.field_state = i17;
        i(mediaId, c17, false);
        return c17;
    }
}
