package pk1;

/* loaded from: classes12.dex */
public final class l0 extends com.tencent.thumbplayer.datatransport.resourceloader.AbsTPAssetResourceLoader {

    /* renamed from: s, reason: collision with root package name */
    public static final java.util.concurrent.atomic.AtomicInteger f355465s = new java.util.concurrent.atomic.AtomicInteger(1);

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f355466d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f355467e;

    /* renamed from: f, reason: collision with root package name */
    public final yz5.p f355468f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.video.player.thumb.a f355469g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f355470h;

    /* renamed from: i, reason: collision with root package name */
    public final pk1.v f355471i;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f355472m;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f355473n;

    /* renamed from: o, reason: collision with root package name */
    public volatile java.lang.Boolean f355474o;

    /* renamed from: p, reason: collision with root package name */
    public final yz5.l f355475p;

    /* renamed from: q, reason: collision with root package name */
    public final yz5.p f355476q;

    /* renamed from: r, reason: collision with root package name */
    public final pk1.a0 f355477r;

    public l0(java.lang.String srcUrl, java.lang.String str, yz5.p pVar, yz5.l lVar, com.tencent.mm.plugin.appbrand.video.player.thumb.a aVar) {
        com.tencent.mm.vfs.x1 m17;
        com.tencent.mm.vfs.x1 m18;
        kotlin.jvm.internal.o.g(srcUrl, "srcUrl");
        this.f355466d = srcUrl;
        this.f355467e = str;
        this.f355468f = pVar;
        this.f355469g = aVar;
        java.lang.String str2 = "MicroMsg.AppBrand.ThumbCdnResourceLoader#" + hashCode();
        this.f355470h = str2;
        pk1.v b17 = pk1.z.f355530a.b(srcUrl);
        this.f355471i = b17;
        pk1.u uVar = b17.f355526a;
        java.lang.String downloadId = uVar.f355523b;
        this.f355472m = downloadId;
        java.lang.String str3 = uVar.f355524c;
        this.f355473n = str3;
        pk1.j0 j0Var = new pk1.j0(this);
        this.f355475p = j0Var;
        pk1.i0 i0Var = new pk1.i0(this);
        this.f355476q = i0Var;
        pk1.k0 k0Var = new pk1.k0(this);
        this.f355477r = k0Var;
        com.tencent.mars.xlog.Log.i(str2, "<init>, srcUrl: " + srcUrl + ", downloadId: " + downloadId + ", cachePath: " + str3);
        long j17 = 0;
        if (b17.f355526a.f355525d) {
            com.tencent.mars.xlog.Log.i(str2, "<init>, already cached, startRet: true");
            this.f355474o = java.lang.Boolean.TRUE;
            com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(str3);
            java.lang.String str4 = a17.f213279f;
            if (str4 != null) {
                java.lang.String l17 = com.tencent.mm.vfs.e8.l(str4, false, false);
                if (!a17.f213279f.equals(l17)) {
                    a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
                }
            }
            com.tencent.mm.vfs.z2 m19 = com.tencent.mm.vfs.a3.f212781a.m(a17, null);
            long j18 = (m19.a() && (m17 = m19.f213266a.m(m19.f213267b)) != null) ? m17.f213233c : 0L;
            com.tencent.mars.xlog.Log.i(str2, "<init>, already cached, total: " + j18);
            if (pVar != null) {
                pVar.invoke(java.lang.Long.valueOf(j18), java.lang.Long.valueOf(j18));
            }
            if (aVar != null) {
                pk1.r rVar = (pk1.r) aVar;
                rVar.f355492d = j18;
                com.tencent.mars.xlog.Log.i(rVar.f355486a, "updateVideoFileSize:%d", java.lang.Long.valueOf(j18));
            }
            if (aVar != null) {
                pk1.r rVar2 = (pk1.r) aVar;
                java.lang.System.currentTimeMillis();
                rVar2.f355492d = j18;
                com.tencent.mars.xlog.Log.i(rVar2.f355486a, "markDownloadFinish videoFileSize:%d", java.lang.Long.valueOf(j18));
            }
        } else {
            pk1.c0 c0Var = pk1.c0.f355423d;
            kotlin.jvm.internal.o.g(downloadId, "downloadId");
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.ThumbCdnDownloadManager", "listenDownload, downloadId: ".concat(downloadId));
            java.util.concurrent.locks.ReentrantLock reentrantLock = pk1.c0.f355430n;
            reentrantLock.lock();
            try {
                java.util.HashMap hashMap = pk1.c0.f355431o;
                java.lang.Object obj = hashMap.get(downloadId);
                if (obj == null) {
                    obj = new java.util.HashSet();
                    hashMap.put(downloadId, obj);
                }
                ((java.util.HashSet) obj).add(new java.lang.ref.WeakReference(i0Var));
                reentrantLock.unlock();
                java.util.concurrent.locks.ReentrantLock reentrantLock2 = pk1.c0.f355427h;
                reentrantLock2.lock();
                try {
                    java.lang.Boolean bool = (java.lang.Boolean) pk1.c0.f355428i.get(downloadId);
                    if (bool == null) {
                        java.util.HashMap hashMap2 = pk1.c0.f355429m;
                        java.lang.Object obj2 = hashMap2.get(downloadId);
                        if (obj2 == null) {
                            obj2 = new java.util.HashSet();
                            hashMap2.put(downloadId, obj2);
                        }
                        bool = java.lang.Boolean.valueOf(((java.util.HashSet) obj2).add(new java.lang.ref.WeakReference(j0Var)));
                    }
                    reentrantLock2.unlock();
                    kotlin.jvm.internal.o.f(bool, "withLock(...)");
                    bool.booleanValue();
                    java.util.concurrent.locks.ReentrantLock reentrantLock3 = pk1.c0.f355432p;
                    reentrantLock3.lock();
                    try {
                        java.util.HashMap hashMap3 = pk1.c0.f355433q;
                        java.lang.Object obj3 = hashMap3.get(downloadId);
                        if (obj3 == null) {
                            obj3 = new java.util.HashSet();
                            hashMap3.put(downloadId, obj3);
                        }
                        ((java.util.HashSet) obj3).add(new java.lang.ref.WeakReference(k0Var));
                        reentrantLock3.unlock();
                        pk1.h0 h0Var = pk1.h0.f355453d;
                        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.ThumbCdnCacheManager", "onCacheStart, cacheInfo: " + b17.f355526a);
                        ((ku5.t0) ku5.t0.f312615d).h(new pk1.y(h0Var), "MicroMsg.AppBrand.ThumbCdnCacheManager");
                    } catch (java.lang.Throwable th6) {
                        reentrantLock3.unlock();
                        throw th6;
                    }
                } catch (java.lang.Throwable th7) {
                    reentrantLock2.unlock();
                    throw th7;
                }
            } catch (java.lang.Throwable th8) {
                reentrantLock.unlock();
                throw th8;
            }
        }
        if (lVar != null) {
            com.tencent.mm.vfs.z7 a18 = com.tencent.mm.vfs.z7.a(str3);
            java.lang.String str5 = a18.f213279f;
            if (str5 != null) {
                java.lang.String l18 = com.tencent.mm.vfs.e8.l(str5, false, false);
                if (!a18.f213279f.equals(l18)) {
                    a18 = new com.tencent.mm.vfs.z7(a18.f213277d, a18.f213278e, l18, a18.f213280g, a18.f213281h);
                }
            }
            com.tencent.mm.vfs.z2 m27 = com.tencent.mm.vfs.a3.f212781a.m(a18, null);
            if (m27.a() && (m18 = m27.f213266a.m(m27.f213267b)) != null) {
                j17 = m18.f213233c;
            }
            lVar.invoke(java.lang.Long.valueOf(j17));
        }
    }

    public final void a() {
        java.lang.Object obj;
        java.lang.Object obj2;
        java.lang.String str = this.f355470h;
        com.tencent.mars.xlog.Log.i(str, "onRelease");
        if (this.f355471i.f355526a.f355525d) {
            com.tencent.mars.xlog.Log.i(str, "onRelease, already cached");
            return;
        }
        c();
        pk1.c0 c0Var = pk1.c0.f355423d;
        yz5.l startCallback = this.f355475p;
        yz5.p progressCallback = this.f355476q;
        pk1.a0 thumbCdnDownloadCallback = this.f355477r;
        java.lang.String downloadId = this.f355472m;
        kotlin.jvm.internal.o.g(downloadId, "downloadId");
        kotlin.jvm.internal.o.g(startCallback, "startCallback");
        kotlin.jvm.internal.o.g(progressCallback, "progressCallback");
        kotlin.jvm.internal.o.g(thumbCdnDownloadCallback, "thumbCdnDownloadCallback");
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.ThumbCdnDownloadManager", "unListenDownload, downloadId: ".concat(downloadId));
        java.util.concurrent.locks.ReentrantLock reentrantLock = pk1.c0.f355427h;
        reentrantLock.lock();
        java.util.HashMap hashMap = pk1.c0.f355429m;
        try {
            java.util.HashSet hashSet = (java.util.HashSet) hashMap.get(downloadId);
            java.lang.Object obj3 = null;
            if (hashSet != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (java.lang.Object obj4 : hashSet) {
                    if (((java.lang.ref.WeakReference) obj4).get() == null) {
                        arrayList.add(obj4);
                    }
                }
                java.util.Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    hashSet.remove((java.lang.ref.WeakReference) it.next());
                }
                java.util.Iterator it6 = hashSet.iterator();
                while (true) {
                    if (it6.hasNext()) {
                        obj = it6.next();
                        if (kotlin.jvm.internal.o.b(startCallback, ((java.lang.ref.WeakReference) obj).get())) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) obj;
                if (weakReference != null) {
                    hashSet.remove(weakReference);
                }
                if (hashSet.isEmpty()) {
                    hashMap.remove(downloadId);
                }
            }
            reentrantLock.unlock();
            java.util.concurrent.locks.ReentrantLock reentrantLock2 = pk1.c0.f355430n;
            reentrantLock2.lock();
            java.util.HashMap hashMap2 = pk1.c0.f355431o;
            try {
                java.util.HashSet hashSet2 = (java.util.HashSet) hashMap2.get(downloadId);
                if (hashSet2 != null) {
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    for (java.lang.Object obj5 : hashSet2) {
                        if (((java.lang.ref.WeakReference) obj5).get() == null) {
                            arrayList2.add(obj5);
                        }
                    }
                    java.util.Iterator it7 = arrayList2.iterator();
                    while (it7.hasNext()) {
                        hashSet2.remove((java.lang.ref.WeakReference) it7.next());
                    }
                    java.util.Iterator it8 = hashSet2.iterator();
                    while (true) {
                        if (it8.hasNext()) {
                            obj2 = it8.next();
                            if (kotlin.jvm.internal.o.b(progressCallback, ((java.lang.ref.WeakReference) obj2).get())) {
                                break;
                            }
                        } else {
                            obj2 = null;
                            break;
                        }
                    }
                    java.lang.ref.WeakReference weakReference2 = (java.lang.ref.WeakReference) obj2;
                    if (weakReference2 != null) {
                        hashSet2.remove(weakReference2);
                    }
                    if (hashSet2.isEmpty()) {
                        hashMap2.remove(downloadId);
                    }
                }
                reentrantLock2.unlock();
                java.util.concurrent.locks.ReentrantLock reentrantLock3 = pk1.c0.f355432p;
                reentrantLock3.lock();
                java.util.HashMap hashMap3 = pk1.c0.f355433q;
                try {
                    java.util.HashSet hashSet3 = (java.util.HashSet) hashMap3.get(downloadId);
                    if (hashSet3 != null) {
                        java.util.ArrayList arrayList3 = new java.util.ArrayList();
                        for (java.lang.Object obj6 : hashSet3) {
                            if (((java.lang.ref.WeakReference) obj6).get() == null) {
                                arrayList3.add(obj6);
                            }
                        }
                        java.util.Iterator it9 = arrayList3.iterator();
                        while (it9.hasNext()) {
                            hashSet3.remove((java.lang.ref.WeakReference) it9.next());
                        }
                        java.util.Iterator it10 = hashSet3.iterator();
                        while (true) {
                            if (!it10.hasNext()) {
                                break;
                            }
                            java.lang.Object next = it10.next();
                            if (kotlin.jvm.internal.o.b(thumbCdnDownloadCallback, ((java.lang.ref.WeakReference) next).get())) {
                                obj3 = next;
                                break;
                            }
                        }
                        java.lang.ref.WeakReference weakReference3 = (java.lang.ref.WeakReference) obj3;
                        if (weakReference3 != null) {
                            hashSet3.remove(weakReference3);
                        }
                        if (hashSet3.isEmpty()) {
                            hashMap3.remove(downloadId);
                        }
                    }
                } finally {
                    reentrantLock3.unlock();
                }
            } catch (java.lang.Throwable th6) {
                reentrantLock2.unlock();
                throw th6;
            }
        } catch (java.lang.Throwable th7) {
            reentrantLock.unlock();
            throw th7;
        }
    }

    public final void b() {
        boolean z17 = this.f355471i.f355526a.f355525d;
        java.lang.String str = this.f355470h;
        if (z17) {
            com.tencent.mars.xlog.Log.i(str, "startDownload, already cached");
        } else {
            com.tencent.mars.xlog.Log.i(str, "startDownload");
            pk1.c0.f355423d.a(this, this.f355466d, this.f355467e, this.f355472m, this.f355473n, 0L, -1L);
        }
    }

    public final void c() {
        boolean z17 = this.f355471i.f355526a.f355525d;
        java.lang.String str = this.f355470h;
        if (z17) {
            com.tencent.mars.xlog.Log.i(str, "stopDownload, already cached");
            return;
        }
        com.tencent.mars.xlog.Log.i(str, "stopDownload");
        try {
            pk1.c0.f355423d.b(this, this.f355472m);
        } catch (java.util.ConcurrentModificationException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace(str, e17, "stopDownload failure, ConcurrentModificationException", new java.lang.Object[0]);
        }
    }

    @Override // com.tencent.thumbplayer.datatransport.resourceloader.ITPAssetResourceLoader
    public java.lang.String getContentType(int i17, java.lang.String fileName, java.lang.String str) {
        kotlin.jvm.internal.o.g(fileName, "fileName");
        return com.tencent.thumbplayer.tmediacodec.util.MimeTypes.VIDEO_MP4;
    }

    @Override // com.tencent.thumbplayer.datatransport.resourceloader.ITPAssetResourceLoader
    public java.lang.String getDataFilePath(int i17, java.lang.String fileName, java.lang.String str) {
        kotlin.jvm.internal.o.g(fileName, "fileName");
        return this.f355473n;
    }

    @Override // com.tencent.thumbplayer.datatransport.resourceloader.ITPAssetResourceLoader
    public long getDataTotalSize(int i17, java.lang.String fileName, java.lang.String str) {
        com.tencent.mm.vfs.x1 m17;
        kotlin.jvm.internal.o.g(fileName, "fileName");
        long j17 = 0;
        if (!this.f355471i.f355526a.f355525d) {
            pk1.c0 c0Var = pk1.c0.f355423d;
            java.lang.String downloadId = this.f355472m;
            kotlin.jvm.internal.o.g(downloadId, "downloadId");
            java.util.concurrent.locks.ReentrantLock reentrantLock = pk1.c0.f355424e;
            reentrantLock.lock();
            try {
                pk1.b0 b0Var = (pk1.b0) pk1.c0.f355425f.get(downloadId);
                if (b0Var != null) {
                    j17 = b0Var.f355421b;
                }
                return j17;
            } finally {
                reentrantLock.unlock();
            }
        }
        com.tencent.mars.xlog.Log.i(this.f355470h, "getDataTotalSize, already cached");
        com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(this.f355473n);
        java.lang.String str2 = a17.f213279f;
        if (str2 != null) {
            java.lang.String l17 = com.tencent.mm.vfs.e8.l(str2, false, false);
            if (!str2.equals(l17)) {
                a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
            }
        }
        com.tencent.mm.vfs.z2 m18 = com.tencent.mm.vfs.a3.f212781a.m(a17, null);
        if (m18.a() && (m17 = m18.f213266a.m(m18.f213267b)) != null) {
            return m17.f213233c;
        }
        return 0L;
    }

    @Override // com.tencent.thumbplayer.datatransport.resourceloader.ITPAssetResourceLoader
    public int onReadData(int i17, java.lang.String fileName, java.lang.String str, long j17, long j18) {
        com.tencent.mm.plugin.appbrand.video.player.thumb.a aVar;
        int i18;
        kotlin.jvm.internal.o.g(fileName, "fileName");
        if (0 >= j18) {
            return 0;
        }
        pk1.v vVar = this.f355471i;
        boolean z17 = vVar.f355526a.f355525d;
        com.tencent.mm.plugin.appbrand.video.player.thumb.a aVar2 = this.f355469g;
        java.lang.String str2 = this.f355470h;
        if (z17) {
            com.tencent.mars.xlog.Log.i(str2, "onReadData, already cached");
            pk1.z zVar = pk1.z.f355530a;
            pk1.u uVar = vVar.f355526a;
            com.tencent.mm.vfs.r6 c17 = zVar.c();
            java.lang.String l17 = com.tencent.mm.vfs.e8.l(uVar.f355523b + ".res", false, true);
            com.tencent.mm.vfs.z7 z7Var = c17 == null ? com.tencent.mm.vfs.z7.f213276i : c17.f213166d;
            if (l17 != null && !l17.isEmpty()) {
                java.lang.String str3 = z7Var.f213279f;
                z7Var = new com.tencent.mm.vfs.z7(z7Var.f213277d, z7Var.f213278e, str3 + '/' + l17, z7Var.f213280g, z7Var.f213281h);
            }
            com.tencent.mm.vfs.b3 b3Var = com.tencent.mm.vfs.a3.f212781a;
            com.tencent.mm.vfs.z2 m17 = b3Var.m(z7Var, null);
            boolean F = !m17.a() ? false : m17.f213266a.F(m17.f213267b);
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.ThumbCdnCacheManager", "checkCacheExist, exists: " + F + ", cacheInfo: " + uVar);
            com.tencent.mm.vfs.z2 m18 = b3Var.m(z7Var, m17);
            if (!(!m18.a() ? false : m18.f213266a.F(m18.f213267b))) {
                vVar.f355526a = pk1.u.a(uVar, null, null, null, false, 7, null);
            }
            if (F) {
                zVar.e(vVar);
                return (int) j18;
            }
            com.tencent.mars.xlog.Log.i(str2, "onReadData, cache has been delete, startDownload");
            pk1.c0.f355423d.a(this, this.f355466d, this.f355467e, this.f355472m, this.f355473n, j17, j18);
            if (aVar2 == null) {
                return 0;
            }
            ((pk1.r) aVar2).I++;
            return 0;
        }
        pk1.c0 c0Var = pk1.c0.f355423d;
        java.lang.String downloadId = this.f355472m;
        kotlin.jvm.internal.o.g(downloadId, "downloadId");
        java.util.concurrent.locks.ReentrantLock reentrantLock = pk1.c0.f355424e;
        reentrantLock.lock();
        try {
            pk1.b0 b0Var = (pk1.b0) pk1.c0.f355425f.get(downloadId);
            if (b0Var == null) {
                reentrantLock.unlock();
                i18 = 0;
                aVar = aVar2;
            } else {
                aVar = aVar2;
                long j19 = b0Var.f355421b;
                if (0 != j19) {
                    if (j19 == b0Var.f355420a) {
                        long j27 = j19 - j17;
                        if (j18 <= j27) {
                            j27 = j18;
                        }
                        i18 = (int) j27;
                    }
                }
                reentrantLock.unlock();
                long[] jArr = new long[2];
                if (((com.tencent.mars.cdn.CdnManager) com.tencent.mars.MarsContext.getManager(com.tencent.mars.cdn.CdnManager.class)).queryContinuousSize(downloadId, j17, jArr) == 0) {
                    long j28 = jArr[0];
                    if (-1 != j28) {
                        if (j28 > j18) {
                            j28 = j18;
                        }
                        i18 = (int) j28;
                        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.ThumbCdnDownloadManager", "getCachedLength, downloadId: " + downloadId + ", offset: " + j17 + ", expectedLength: " + j18 + ", lengthRet: " + i18);
                    }
                }
                i18 = 0;
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.ThumbCdnDownloadManager", "getCachedLength, downloadId: " + downloadId + ", offset: " + j17 + ", expectedLength: " + j18 + ", lengthRet: " + i18);
            }
            if (i18 != 0) {
                com.tencent.mars.xlog.Log.i(str2, "onReadData, hasCachedLength: " + i18);
                return i18;
            }
            c0Var.a(this, this.f355466d, this.f355467e, this.f355472m, this.f355473n, j17, j18);
            if (aVar != null) {
                ((pk1.r) aVar).I++;
            }
            return 0;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // com.tencent.thumbplayer.datatransport.resourceloader.ITPAssetResourceLoader
    public int onStartReadData(int i17, java.lang.String fileName, java.lang.String str, long j17, long j18) {
        kotlin.jvm.internal.o.g(fileName, "fileName");
        b();
        java.lang.Boolean bool = this.f355474o;
        if (!(bool != null ? bool.booleanValue() : false)) {
            com.tencent.mars.xlog.Log.i(this.f355470h, "onStartReadData, start fail");
        }
        int andIncrement = f355465s.getAndIncrement();
        com.tencent.mars.xlog.Log.i(this.f355470h, "onStartReadData, requestId: " + andIncrement);
        return andIncrement;
    }

    @Override // com.tencent.thumbplayer.datatransport.resourceloader.ITPAssetResourceLoader
    public int onStopReadData(int i17, java.lang.String fileName, java.lang.String str, int i18) {
        kotlin.jvm.internal.o.g(fileName, "fileName");
        return 0;
    }
}
