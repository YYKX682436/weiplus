package es2;

/* loaded from: classes2.dex */
public class h0 {

    /* renamed from: a, reason: collision with root package name */
    public final yr2.k f256368a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.concurrent.locks.ReentrantLock f256369b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f256370c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.HashMap f256371d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f256372e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f256373f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentLinkedQueue f256374g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f256375h;

    /* renamed from: i, reason: collision with root package name */
    public final es2.g0 f256376i;

    /* renamed from: j, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicInteger f256377j;

    /* renamed from: k, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f256378k;

    public h0(yr2.k model, java.lang.String sceneTag) {
        kotlin.jvm.internal.o.g(model, "model");
        kotlin.jvm.internal.o.g(sceneTag, "sceneTag");
        this.f256368a = model;
        this.f256369b = new java.util.concurrent.locks.ReentrantLock();
        this.f256371d = new java.util.HashMap();
        this.f256372e = new java.util.LinkedList();
        this.f256373f = "";
        this.f256374g = new java.util.concurrent.ConcurrentLinkedQueue();
        this.f256375h = "FVPW2_" + sceneTag + '_' + hashCode();
        this.f256376i = new es2.g0(this);
        this.f256377j = new java.util.concurrent.atomic.AtomicInteger();
        this.f256378k = new java.util.concurrent.atomic.AtomicBoolean(false);
    }

    public static final so2.j5 d(so2.j5 j5Var) {
        com.tencent.mm.plugin.finder.storage.FinderItem feedObject;
        if (j5Var.h() == 4) {
            com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = j5Var instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed ? (com.tencent.mm.plugin.finder.model.BaseFinderFeed) j5Var : null;
            boolean z17 = false;
            if (baseFinderFeed != null && (feedObject = baseFinderFeed.getFeedObject()) != null && feedObject.isUrlValid()) {
                z17 = true;
            }
            if (z17 && ((com.tencent.mm.plugin.finder.model.BaseFinderFeed) j5Var).getNeedToPreload()) {
                return j5Var;
            }
        }
        return null;
    }

    public final cs2.p a(java.lang.String str, boolean z17, java.lang.String str2) {
        return (cs2.p) j("cancel", new es2.u(this, str, z17, str2));
    }

    public final int b(cs2.p pVar) {
        java.util.concurrent.locks.ReentrantLock reentrantLock;
        java.util.concurrent.locks.ReentrantLock reentrantLock2 = this.f256369b;
        reentrantLock2.lock();
        try {
            boolean z17 = this.f256370c;
            java.lang.String str = "";
            es2.g0 g0Var = this.f256376i;
            java.lang.String str2 = this.f256375h;
            if (z17) {
                com.tencent.mars.xlog.Log.i(str2, "[enqueue] VideoPreloadWorker has release. " + pVar + " just return.");
                java.lang.String string = pVar.f222088e2.f330002e.getString(9);
                if (string != null) {
                    str = string;
                }
                g0Var.h(str, pVar);
                reentrantLock2.unlock();
                return -1;
            }
            cu2.x xVar = cu2.x.f222449a;
            so2.i3 c17 = cu2.x.c(xVar, pVar.f222092i2, false, false, false, 14, null);
            es2.g0 g0Var2 = this.f256376i;
            java.lang.String field_mediaId = c17.field_mediaId;
            kotlin.jvm.internal.o.f(field_mediaId, "field_mediaId");
            g0Var2.g(field_mediaId, c17.w0(), pVar.V1, pVar.k(), pVar.field_requestVideoFormat == 1 ? "H264" : "H265", pVar);
            es2.h e17 = e(pVar, c17, "enqueue");
            es2.h hVar = es2.h.f256364d;
            mn2.g4 g4Var = pVar.f222088e2;
            if (e17 == hVar) {
                java.lang.String string2 = g4Var.f330002e.getString(9);
                if (string2 != null) {
                    str = string2;
                }
                g0Var.h(str, pVar);
                reentrantLock2.unlock();
                return -1;
            }
            es2.h hVar2 = es2.h.f256366f;
            java.util.HashMap hashMap = this.f256371d;
            java.util.LinkedList linkedList = this.f256372e;
            if (e17 == hVar2) {
                this.f256376i.d(pVar.f222092i2, c17.w0() >= 100, c17.w0(), pVar, c17.field_totalSize, hashMap.size(), linkedList.size());
                reentrantLock2.unlock();
                return 1;
            }
            int size = hashMap.size();
            int i17 = this.f256368a.f464689f;
            java.util.concurrent.atomic.AtomicBoolean atomicBoolean = this.f256378k;
            try {
                if (i17 > size && !atomicBoolean.get()) {
                    pVar.f222090g2 = cs2.o.f222083d;
                    long j17 = pVar.f222089f2;
                    java.lang.String str3 = pVar.f222092i2;
                    java.lang.String str4 = pVar.f222093j2;
                    java.lang.String url = g4Var.getUrl();
                    r45.mb4 mb4Var = g4Var.f330002e;
                    int i18 = pVar.field_requestVideoFormat;
                    java.lang.String k17 = pVar.k();
                    int i19 = g4Var.f330006i;
                    long j18 = c17.field_cacheSize;
                    try {
                        long j19 = c17.field_totalSize;
                        reentrantLock = reentrantLock2;
                        try {
                            if (((c61.l7) i95.n0.c(c61.l7.class)).ek().I != 0) {
                            }
                            cu2.x.h(xVar, j17, str3, str4, url, i18, k17, i19, j18, j19, 1, mb4Var.getInteger(3), mb4Var.getString(18), mb4Var.getString(17), false, false, 24576, null);
                            hashMap.put(pVar.f222092i2, pVar);
                            mn2.u0 u0Var = new mn2.u0(g4Var.f330002e, com.tencent.mm.plugin.finder.storage.y90.f128356f, null, 4, null);
                            mn2.g1 g1Var = mn2.g1.f329975a;
                            g1Var.e().b(u0Var, g1Var.h(mn2.f1.f329953d)).a();
                            ((cf0.z) ((df0.s) i95.n0.c(df0.s.class))).Di().g(pVar, new es2.z(this, pVar, c17));
                            com.tencent.mars.xlog.Log.i(str2, "[enqueue] begin to preloadVideo... " + pVar);
                            reentrantLock.unlock();
                            return 1;
                        } catch (java.lang.Throwable th6) {
                            th = th6;
                            reentrantLock.unlock();
                            throw th;
                        }
                    } catch (java.lang.Throwable th7) {
                        th = th7;
                        reentrantLock = reentrantLock2;
                        reentrantLock.unlock();
                        throw th;
                    }
                }
                kz5.h0.B(linkedList, new es2.x(pVar));
                linkedList.add(pVar);
                pVar.f222090g2 = cs2.o.f222085f;
                com.tencent.mars.xlog.Log.i(str2, "enqueue " + pVar + " wait to preLoad, just return. isStop=" + atomicBoolean + " preLoadingCount=" + size + " waitingSize=" + linkedList.size());
                reentrantLock2.unlock();
                return 1;
            } catch (java.lang.Throwable th8) {
                th = th8;
            }
        } catch (java.lang.Throwable th9) {
            th = th9;
        }
    }

    public final java.util.List c(so2.j5 feed) {
        com.tencent.mm.plugin.finder.storage.FinderItem feedObject;
        java.util.LinkedList<r45.mb4> mediaList;
        kotlin.jvm.internal.o.g(feed, "feed");
        if (!(feed instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed)) {
            if (!(feed instanceof com.tencent.mm.plugin.finder.feed.ys)) {
                return new java.util.LinkedList();
            }
            com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = (com.tencent.mm.plugin.finder.model.BaseFinderFeed) kz5.n0.Z(((com.tencent.mm.plugin.finder.feed.ys) feed).f111194f);
            return (baseFinderFeed == null || (feedObject = baseFinderFeed.getFeedObject()) == null || (mediaList = feedObject.getMediaList()) == null) ? new java.util.LinkedList() : kz5.n0.V0(mediaList);
        }
        java.util.LinkedList linkedList = new java.util.LinkedList();
        r45.mb4 mb4Var = (r45.mb4) kz5.n0.Z(com.tencent.mm.plugin.finder.storage.FeedData.Companion.a((com.tencent.mm.plugin.finder.model.BaseFinderFeed) feed).getMediaList());
        if (mb4Var != null) {
            linkedList.add(mb4Var);
        }
        return linkedList;
    }

    public final es2.h e(cs2.p pVar, so2.i3 i3Var, java.lang.String str) {
        r45.mb4 mb4Var = pVar.f222088e2.f330002e;
        java.lang.String str2 = this.f256373f;
        java.lang.String string = mb4Var.getString(9);
        if (string == null) {
            string = "";
        }
        boolean o17 = r26.i0.o(str2, string, false, 2, null);
        java.lang.String str3 = this.f256375h;
        if (o17) {
            com.tencent.mars.xlog.Log.i(str3, str + " is focused task " + pVar + " just return.");
            return es2.h.f256364d;
        }
        if (i3Var == null) {
            i3Var = cu2.x.c(cu2.x.f222449a, pVar.f222092i2, false, false, false, 14, null);
        }
        if (i3Var.D0() && com.tencent.mm.vfs.w6.j(i3Var.u0())) {
            com.tencent.mars.xlog.Log.i(str3, str + ' ' + pVar + " has complete file(" + i3Var.w0() + "%)! just return.");
            return es2.h.f256366f;
        }
        long[] jArr = new long[3];
        ((com.tencent.mars.cdn.CdnManager) com.tencent.mars.MarsContext.getManager(com.tencent.mars.cdn.CdnManager.class)).queryDownloadedSize(i3Var.field_mediaId, jArr);
        long max = java.lang.Math.max(0L, jArr[0]);
        long j17 = i3Var.field_totalSize;
        if ((j17 > 0 ? (int) ((((float) max) / ((float) j17)) * 100) : 0) < pVar.V1 || max < pVar.f241805x || !com.tencent.mm.vfs.w6.j(i3Var.u0())) {
            return es2.h.f256365e;
        }
        com.tencent.mars.xlog.Log.i(str3, str + ' ' + pVar + " has finish preload(" + i3Var.w0() + "%)! received:" + max + " just return.");
        return es2.h.f256366f;
    }

    public void f() {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        j("onClearAll", new es2.c0(linkedList, this));
        com.tencent.mars.xlog.Log.i(this.f256375h, "[onClearAll] " + linkedList);
    }

    public void g(java.lang.String mediaId, boolean z17, int i17) {
        java.lang.String substring;
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[onMediaFocus] mediaId=");
        sb6.append(i17);
        sb6.append('_');
        if (mediaId.length() == 0) {
            substring = "";
        } else if (mediaId.length() <= 13) {
            substring = mediaId;
        } else {
            int length = mediaId.length();
            if (length > 24) {
                length = 24;
            }
            substring = mediaId.substring(13, length);
            kotlin.jvm.internal.o.f(substring, "substring(...)");
        }
        sb6.append(substring);
        sb6.append(" isFocused=");
        sb6.append(z17);
        com.tencent.mars.xlog.Log.i(this.f256375h, sb6.toString());
        if (!z17) {
            this.f256373f = "";
            return;
        }
        j("onMediaFocus", new es2.d0(this, mediaId));
        a(mediaId, true, "onMediaFocus");
        h();
    }

    public final void h() {
        j("pollWaiting", new es2.e0(this));
    }

    public final void i(ek4.b bVar, java.util.List sourceList, int i17, java.lang.String invokeSource) {
        ek4.b taskContext = bVar;
        kotlin.jvm.internal.o.g(taskContext, "taskContext");
        kotlin.jvm.internal.o.g(sourceList, "sourceList");
        kotlin.jvm.internal.o.g(invokeSource, "invokeSource");
        java.util.LinkedList linkedList = new java.util.LinkedList();
        int i18 = 0;
        for (java.lang.Object obj : sourceList) {
            int i19 = i18 + 1;
            if (i18 < 0) {
                kz5.c0.p();
                throw null;
            }
            so2.j5 j5Var = (so2.j5) obj;
            if (j5Var instanceof so2.u1) {
                r45.mb4 mb4Var = (r45.mb4) kz5.n0.X(c(j5Var));
                int i27 = 0;
                for (java.lang.Object obj2 : this.f256368a.x(ek4.b.a(bVar, 0, 0, 0, 0, mb4Var.getLong(24), hc2.b0.e(j5Var, "PREL", i18), 0, 79, null), j5Var.getItemId(), mb4Var, i17)) {
                    int i28 = i27 + 1;
                    if (i27 < 0) {
                        kz5.c0.p();
                        throw null;
                    }
                    yr2.h hVar = (yr2.h) obj2;
                    yr2.d dVar = yr2.d.f464663a;
                    long itemId = j5Var.getItemId();
                    int i29 = taskContext.f253626c;
                    int i37 = hVar.f464673b;
                    long j17 = hVar.f464674c;
                    java.util.HashMap hashMap = this.f256371d;
                    java.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue = this.f256374g;
                    java.util.LinkedList linkedList2 = linkedList;
                    int i38 = i18;
                    cs2.p b17 = dVar.b(hVar, itemId, i29, i38, new es2.o(this, i37, j17, hashMap, concurrentLinkedQueue, hVar.f464677f), new es2.l(this, hVar.f464673b, android.os.SystemClock.uptimeMillis(), hashMap, concurrentLinkedQueue), this.f256375h);
                    b17.f222091h2 = -this.f256377j.getAndIncrement();
                    linkedList2.add(b17);
                    taskContext = bVar;
                    linkedList = linkedList2;
                    i27 = i28;
                    j5Var = j5Var;
                    i18 = i38;
                }
            }
            taskContext = bVar;
            linkedList = linkedList;
            i18 = i19;
        }
        java.util.LinkedList linkedList3 = linkedList;
        com.tencent.mars.xlog.Log.i(this.f256375h, "buildList input:[" + sourceList.size() + "] outList:\n" + kz5.n0.g0(linkedList3, "\n", null, null, 0, null, es2.p.f256397d, 30, null) + " invokeSource:" + invokeSource);
        kz5.g0.s(linkedList3);
        j("mergePendingList", new es2.a0(linkedList3, this));
        java.util.Iterator it = linkedList3.iterator();
        while (it.hasNext()) {
            b((cs2.p) it.next());
        }
    }

    public final java.lang.Object j(java.lang.String str, yz5.a aVar) {
        java.lang.String str2 = this.f256375h;
        long uptimeMillis = android.os.SystemClock.uptimeMillis();
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.f256369b;
        reentrantLock.lock();
        try {
            return aVar.invoke();
        } finally {
            reentrantLock.unlock();
            long uptimeMillis2 = android.os.SystemClock.uptimeMillis() - uptimeMillis;
            if (uptimeMillis2 > 100) {
                com.tencent.mars.xlog.Log.w(str2, "[syncLock] tag=" + str + " so slow! cost=" + uptimeMillis2 + "ms");
            }
        }
    }

    public final boolean k(cs2.p pVar, cs2.p pVar2) {
        return kotlin.jvm.internal.o.b(pVar.f222092i2, pVar2.f222092i2) && pVar.f222095l2 == pVar2.f222095l2 && pVar.field_requestVideoFormat == pVar2.field_requestVideoFormat && kotlin.jvm.internal.o.b(pVar.k(), pVar2.k());
    }
}
