package ni3;

/* loaded from: classes10.dex */
public final class o1 {

    /* renamed from: a, reason: collision with root package name */
    public final kotlinx.coroutines.y0 f337654a;

    /* renamed from: b, reason: collision with root package name */
    public kotlinx.coroutines.r2 f337655b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f337656c;

    /* renamed from: d, reason: collision with root package name */
    public android.content.Context f337657d;

    /* renamed from: e, reason: collision with root package name */
    public yr2.k f337658e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer f337659f;

    /* renamed from: g, reason: collision with root package name */
    public cw2.f8 f337660g;

    /* renamed from: h, reason: collision with root package name */
    public java.util.concurrent.ConcurrentHashMap f337661h;

    /* renamed from: i, reason: collision with root package name */
    public long f337662i;

    /* renamed from: j, reason: collision with root package name */
    public final java.util.concurrent.CopyOnWriteArrayList f337663j;

    /* renamed from: k, reason: collision with root package name */
    public final java.util.concurrent.CopyOnWriteArrayList f337664k;

    /* renamed from: l, reason: collision with root package name */
    public final ni3.b1 f337665l;

    public o1() {
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
        this.f337654a = kotlinx.coroutines.z0.a(kotlinx.coroutines.internal.b0.f310484a);
        this.f337663j = new java.util.concurrent.CopyOnWriteArrayList();
        this.f337664k = new java.util.concurrent.CopyOnWriteArrayList();
        this.f337665l = new ni3.b1();
    }

    public static final void a(ni3.o1 o1Var) {
        java.lang.String videoMediaId;
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = o1Var.f337661h;
        java.lang.Object obj = null;
        if (concurrentHashMap == null) {
            kotlin.jvm.internal.o.o("sourceLife");
            throw null;
        }
        ni3.p0 p0Var = (ni3.p0) concurrentHashMap.get(java.lang.Long.valueOf(o1Var.f337662i));
        if (p0Var == null) {
            return;
        }
        ni3.o0 o0Var = p0Var.f337671b;
        int i17 = o0Var.f337650d;
        yr2.k kVar = o1Var.f337658e;
        if (kVar == null) {
            kotlin.jvm.internal.o.o("model");
            throw null;
        }
        int i18 = kVar.f464685b;
        int i19 = kVar.f464686c;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("checkPlayFeed pos:");
        sb6.append(i17);
        sb6.append(' ');
        sb6.append(o0Var);
        sb6.append(" checkRange[");
        sb6.append(java.lang.Math.max(0, i17 - i18));
        sb6.append(", ");
        int i27 = i17 + i19;
        com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer dataBuffer = o1Var.f337659f;
        if (dataBuffer == null) {
            kotlin.jvm.internal.o.o(ya.b.SOURCE);
            throw null;
        }
        sb6.append(java.lang.Math.min(i27, dataBuffer.size()));
        sb6.append(", ] ");
        com.tencent.mars.xlog.Log.i("StrategyAsyncMonitor", sb6.toString());
        cw2.f8 f8Var = o1Var.f337660g;
        if (f8Var == null) {
            kotlin.jvm.internal.o.o("videoCore");
            throw null;
        }
        android.content.Context context = o1Var.f337657d;
        if (context == null) {
            kotlin.jvm.internal.o.o("context");
            throw null;
        }
        cw2.da S6 = ((com.tencent.mm.plugin.finder.viewmodel.component.FinderVideoRecycler) f8Var.f223700h).S6(context);
        com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy finderThumbPlayerProxy = S6 instanceof com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy ? (com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy) S6 : null;
        if (finderThumbPlayerProxy == null || (videoMediaId = finderThumbPlayerProxy.getVideoMediaId()) == null) {
            return;
        }
        boolean A0 = cu2.x.c(cu2.x.f222449a, videoMediaId, false, false, false, 10, null).A0();
        boolean j17 = com.tencent.mm.vfs.w6.j(p0Var.f337672c.f337720b);
        if (A0 && j17) {
            return;
        }
        ek4.s Di = ((cf0.z) ((df0.s) i95.n0.c(df0.s.class))).Di();
        Di.getClass();
        if (Di.f253685a.containsKey(videoMediaId)) {
            return;
        }
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = o1Var.f337663j;
        java.util.Iterator it = copyOnWriteArrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            if (((ni3.j1) next).f337617a.f337670a.getItemId() == p0Var.f337670a.getItemId()) {
                obj = next;
                break;
            }
        }
        ni3.j1 j1Var = (ni3.j1) obj;
        if (j1Var != null) {
            j1Var.f337618b++;
        } else {
            j1Var = new ni3.j1(p0Var, 0);
            copyOnWriteArrayList.add(j1Var);
        }
        com.tencent.mars.xlog.Log.e("StrategyAsyncMonitor", "Async.handleCheckFail " + j1Var);
    }

    public static final void b(ni3.o1 o1Var) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = o1Var.f337661h;
        if (concurrentHashMap == null) {
            kotlin.jvm.internal.o.o("sourceLife");
            throw null;
        }
        ni3.p0 p0Var = (ni3.p0) concurrentHashMap.get(java.lang.Long.valueOf(o1Var.f337662i));
        if (p0Var == null) {
            return;
        }
        ni3.o0 o0Var = p0Var.f337671b;
        int i17 = o0Var.f337650d;
        yr2.k kVar = o1Var.f337658e;
        if (kVar == null) {
            kotlin.jvm.internal.o.o("model");
            throw null;
        }
        int i18 = kVar.f464685b;
        int i19 = kVar.f464686c;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("checkPreloadFeed pos:");
        sb6.append(i17);
        sb6.append(' ');
        sb6.append(o0Var);
        sb6.append(" checkRange[");
        sb6.append(java.lang.Math.max(0, i17 - i18));
        sb6.append(", ");
        int i27 = i17 + i19;
        com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer dataBuffer = o1Var.f337659f;
        if (dataBuffer == null) {
            kotlin.jvm.internal.o.o(ya.b.SOURCE);
            throw null;
        }
        sb6.append(java.lang.Math.min(i27, dataBuffer.size()));
        sb6.append("] ");
        com.tencent.mars.xlog.Log.i("StrategyAsyncMonitor", sb6.toString());
        cw2.f8 f8Var = o1Var.f337660g;
        if (f8Var == null) {
            kotlin.jvm.internal.o.o("videoCore");
            throw null;
        }
        android.content.Context context = o1Var.f337657d;
        if (context == null) {
            kotlin.jvm.internal.o.o("context");
            throw null;
        }
        cw2.da S6 = ((com.tencent.mm.plugin.finder.viewmodel.component.FinderVideoRecycler) f8Var.f223700h).S6(context);
        com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy finderThumbPlayerProxy = S6 instanceof com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy ? (com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy) S6 : null;
        if (finderThumbPlayerProxy == null) {
            return;
        }
        com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer dataBuffer2 = o1Var.f337659f;
        if (dataBuffer2 == null) {
            kotlin.jvm.internal.o.o(ya.b.SOURCE);
            throw null;
        }
        java.util.List V0 = kz5.n0.V0(dataBuffer2);
        java.util.concurrent.ConcurrentHashMap concurrentHashMap2 = o1Var.f337661h;
        if (concurrentHashMap2 == null) {
            kotlin.jvm.internal.o.o("sourceLife");
            throw null;
        }
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        int i28 = 0;
        for (int i29 = i17 - 1; i28 < i18 && i29 >= 0; i29--) {
            so2.j5 j5Var = (so2.j5) ((java.util.ArrayList) V0).get(i29);
            if (d(j5Var) != null) {
                ni3.p0 p0Var2 = (ni3.p0) concurrentHashMap2.get(java.lang.Long.valueOf(j5Var.getItemId()));
                if (p0Var2 != null) {
                    linkedHashMap.put(java.lang.Long.valueOf(j5Var.getItemId()), p0Var2);
                }
                i28++;
            }
        }
        int i37 = 0;
        while (true) {
            i17++;
            if (i37 >= i19) {
                break;
            }
            java.util.ArrayList arrayList = (java.util.ArrayList) V0;
            if (i17 >= arrayList.size()) {
                break;
            }
            so2.j5 j5Var2 = (so2.j5) arrayList.get(i17);
            if (d(j5Var2) != null) {
                ni3.p0 p0Var3 = (ni3.p0) concurrentHashMap2.get(java.lang.Long.valueOf(j5Var2.getItemId()));
                if (p0Var3 != null) {
                    linkedHashMap.put(java.lang.Long.valueOf(j5Var2.getItemId()), p0Var3);
                }
                i37++;
            }
        }
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("checkPreloadFeed player:");
        sb7.append(finderThumbPlayerProxy.getFTPPTag());
        sb7.append(" list: ");
        java.util.ArrayList arrayList2 = new java.util.ArrayList(linkedHashMap.size());
        java.util.Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            arrayList2.add(((ni3.p0) ((java.util.Map.Entry) it.next()).getValue()).toString());
        }
        sb7.append(kz5.n0.g0(arrayList2, " ", null, null, 0, null, null, 62, null));
        sb7.append(" context:");
        android.content.Context context2 = o1Var.f337657d;
        if (context2 == null) {
            kotlin.jvm.internal.o.o("context");
            throw null;
        }
        sb7.append(context2);
        com.tencent.mars.xlog.Log.i("StrategyAsyncMonitor", sb7.toString());
        if (finderThumbPlayerProxy.isPlaying()) {
            cw2.e0 bufferProgressConsumer = finderThumbPlayerProxy.getBufferProgressConsumer();
            if (bufferProgressConsumer != null && bufferProgressConsumer.f223664f) {
                for (java.util.Map.Entry entry : linkedHashMap.entrySet()) {
                    if (((java.lang.Number) entry.getKey()).longValue() == o1Var.f337662i) {
                        return;
                    }
                    if (((ni3.p0) entry.getValue()).f337676g.f337731a && !((ni3.p0) entry.getValue()).f337676g.f337732b) {
                        return;
                    }
                    so2.i3 c17 = cu2.x.c(cu2.x.f222449a, ((ni3.p0) entry.getValue()).f337672c.f337719a, false, false, false, 10, null);
                    boolean A0 = c17.A0();
                    boolean j17 = com.tencent.mm.vfs.w6.j(((ni3.p0) entry.getValue()).f337672c.f337720b);
                    if (!A0 || !j17) {
                        if (c17.field_cacheSize < ((ni3.p0) entry.getValue()).f337676g.f337734d.f337736a || !j17) {
                            c(o1Var, ni3.l1.f337627d, (ni3.p0) entry.getValue(), "target:[" + ((ni3.p0) entry.getValue()).f337677h.f337734d.f337736a + ", " + ((ni3.p0) entry.getValue()).f337677h.f337734d.f337737b + "]result:[" + c17.field_cacheSize + "]isExist:" + j17);
                            return;
                        }
                    }
                }
                for (java.util.Map.Entry entry2 : linkedHashMap.entrySet()) {
                    if (((java.lang.Number) entry2.getKey()).longValue() == o1Var.f337662i) {
                        return;
                    }
                    if (((ni3.p0) entry2.getValue()).f337677h.f337731a && !((ni3.p0) entry2.getValue()).f337677h.f337732b) {
                        return;
                    }
                    so2.i3 c18 = cu2.x.c(cu2.x.f222449a, ((ni3.p0) entry2.getValue()).f337672c.f337719a, false, false, false, 10, null);
                    boolean A02 = c18.A0();
                    boolean j18 = com.tencent.mm.vfs.w6.j(((ni3.p0) entry2.getValue()).f337672c.f337720b);
                    if (!A02 || !j18) {
                        float ceil = (float) java.lang.Math.ceil((((float) c18.field_cacheSize) * 100.0f) / ((float) c18.field_totalSize));
                        if (ceil < ((ni3.p0) entry2.getValue()).f337677h.f337734d.f337737b || !j18) {
                            c(o1Var, ni3.l1.f337628e, (ni3.p0) entry2.getValue(), "target:[" + ((ni3.p0) entry2.getValue()).f337677h.f337734d.f337736a + ", " + ((ni3.p0) entry2.getValue()).f337677h.f337734d.f337737b + "]result:[" + c18.field_cacheSize + ", " + ceil + "]isExist:" + j18 + " cacheState:" + c18.field_state);
                            return;
                        }
                    }
                }
            }
        }
    }

    public static final void c(ni3.o1 o1Var, ni3.l1 l1Var, ni3.p0 p0Var, java.lang.String str) {
        java.lang.Object obj;
        java.util.Iterator it = o1Var.f337664k.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            ni3.k1 k1Var = (ni3.k1) obj;
            if (k1Var.f337622b.f337670a.getItemId() == p0Var.f337670a.getItemId() && k1Var.f337621a == l1Var) {
                break;
            }
        }
        ni3.k1 k1Var2 = (ni3.k1) obj;
        if (k1Var2 != null) {
            k1Var2.f337623c++;
        } else {
            k1Var2 = new ni3.k1(l1Var, p0Var, 0, str);
            o1Var.f337664k.add(k1Var2);
        }
        com.tencent.mars.xlog.Log.e("StrategyAsyncMonitor", "async.handleCheckFail " + k1Var2);
    }

    public static final so2.j5 d(so2.j5 j5Var) {
        com.tencent.mm.plugin.finder.storage.FinderItem feedObject;
        if (j5Var.h() == 4) {
            boolean z17 = j5Var instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed;
            com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = z17 ? (com.tencent.mm.plugin.finder.model.BaseFinderFeed) j5Var : null;
            if ((baseFinderFeed == null || (feedObject = baseFinderFeed.getFeedObject()) == null || !feedObject.isUrlValid()) ? false : true) {
                com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed2 = z17 ? (com.tencent.mm.plugin.finder.model.BaseFinderFeed) j5Var : null;
                if (baseFinderFeed2 != null && baseFinderFeed2.getNeedToPreload()) {
                    return j5Var;
                }
            }
        }
        return null;
    }

    public final void e() {
        kotlinx.coroutines.r2 r2Var;
        if (this.f337656c) {
            return;
        }
        com.tencent.mars.xlog.Log.i("StrategyAsyncMonitor", "startMonitorAsync");
        kotlinx.coroutines.r2 r2Var2 = this.f337655b;
        boolean z17 = false;
        if (r2Var2 != null && r2Var2.a()) {
            z17 = true;
        }
        if (z17 && (r2Var = this.f337655b) != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        this.f337655b = kotlinx.coroutines.l.d(this.f337654a, null, null, new ni3.n1(this, null), 3, null);
        this.f337656c = true;
    }

    public final void f() {
        com.tencent.mars.xlog.Log.i("StrategyAsyncMonitor", "stopMonitor isLooping:" + this.f337656c);
        kotlinx.coroutines.r2 r2Var = this.f337655b;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        this.f337656c = false;
    }
}
