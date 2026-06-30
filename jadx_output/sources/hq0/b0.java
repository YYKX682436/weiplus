package hq0;

/* loaded from: classes7.dex */
public final class b0 extends hq0.i implements qq0.j {
    public final java.util.Set A;
    public gq0.v B;
    public final java.util.concurrent.ConcurrentHashMap C;
    public final java.util.concurrent.ConcurrentHashMap D;
    public final mq0.l0 E;
    public final java.util.concurrent.ConcurrentHashMap F;
    public final int G;
    public boolean H;
    public boolean I;

    /* renamed from: J, reason: collision with root package name */
    public java.lang.ref.WeakReference f282969J;
    public int K;
    public yz5.a L;
    public boolean M;
    public volatile java.util.List N;
    public volatile boolean P;
    public volatile boolean Q;
    public volatile long R;
    public volatile kotlinx.coroutines.r2 S;
    public final java.util.Collection T;
    public final hq0.k U;
    public boolean V;

    /* renamed from: x, reason: collision with root package name */
    public final iq0.g f282970x;

    /* renamed from: y, reason: collision with root package name */
    public final java.lang.String f282971y;

    /* renamed from: z, reason: collision with root package name */
    public final java.lang.String f282972z;

    public b0(iq0.g bizConfig) {
        kotlin.jvm.internal.o.g(bizConfig, "bizConfig");
        this.f282970x = bizConfig;
        this.f282971y = "MicroMsg.MagicCardStarterBiz." + bizConfig.f293634a;
        this.f282972z = "SclBizDefaultTouchListener";
        this.A = new java.util.HashSet();
        Q1();
        this.C = new java.util.concurrent.ConcurrentHashMap();
        this.D = new java.util.concurrent.ConcurrentHashMap();
        this.E = new mq0.l0(bizConfig.f293634a);
        this.F = new java.util.concurrent.ConcurrentHashMap();
        this.G = 8;
        this.N = kz5.p0.f313996d;
        this.R = bizConfig.f293664j;
        this.T = kz5.n0.t0(kz5.n0.t0(kz5.b0.c(new lq0.g()), ((com.tencent.mm.plugin.magicbrush.f6) ((com.tencent.mm.plugin.magicbrush.f4) i95.n0.c(com.tencent.mm.plugin.magicbrush.f4.class))).Ni(bizConfig.f293634a)), bizConfig.f293636c);
        this.U = new hq0.k(this);
    }

    public static final java.util.List J1(hq0.b0 b0Var, iq0.e eVar, wq0.b bVar) {
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = (java.util.concurrent.CopyOnWriteArrayList) b0Var.D.get(eVar.a());
        if (copyOnWriteArrayList == null) {
            return kz5.p0.f313996d;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            java.util.Collection values = ((java.util.HashMap) it.next()).values();
            kotlin.jvm.internal.o.f(values, "<get-values>(...)");
            kz5.h0.u(arrayList, values);
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator it6 = arrayList.iterator();
        while (it6.hasNext()) {
            java.lang.Object next = it6.next();
            if (((com.tencent.mm.magicbrush.plugin.scl.view.MagicSclViewContainer) next).getViewState() == bVar) {
                arrayList2.add(next);
            }
        }
        return arrayList2;
    }

    @Override // lc3.e
    public android.app.Activity B0() {
        android.app.Activity activity;
        java.lang.ref.WeakReference weakReference = this.f282969J;
        return (weakReference == null || (activity = (android.app.Activity) weakReference.get()) == null) ? B1() : activity;
    }

    @Override // lc3.s
    public void E0(org.json.JSONObject data, yz5.l callback) {
        kotlin.jvm.internal.o.g(data, "data");
        kotlin.jvm.internal.o.g(callback, "callback");
        gq0.v vVar = this.B;
        if (vVar != null) {
            vVar.og(data, callback);
        }
    }

    @Override // lc3.s
    public jc3.m F0(java.lang.String containerTag) {
        kotlin.jvm.internal.o.g(containerTag, "containerTag");
        gq0.v vVar = this.B;
        if (vVar == null) {
            return null;
        }
        jc3.m xc6 = vVar.xc(containerTag);
        return xc6 == null ? new tp0.l() : xc6;
    }

    public void N1(iq0.e eVar, android.view.ViewGroup containerView, java.lang.String frameSetName, java.lang.String frameSetData, int i17, yz5.l lVar) {
        kotlin.jvm.internal.o.g(containerView, "containerView");
        kotlin.jvm.internal.o.g(frameSetName, "frameSetName");
        kotlin.jvm.internal.o.g(frameSetData, "frameSetData");
        if (eVar == null) {
            eVar = this.f282970x.f293663i;
        }
        iq0.e eVar2 = eVar;
        java.lang.String str = this.f282971y;
        if (eVar2 == null) {
            com.tencent.mars.xlog.Log.e(str, "bindFrameSetView rootConfig nil");
            return;
        }
        com.tencent.mars.xlog.Log.i(str, "bindFrameSetView rootPath:" + eVar2.f293657a + " frameSetName:" + frameSetName);
        d75.b.g(new hq0.q(this, eVar2, frameSetName, containerView, false, lVar, i17, frameSetData));
    }

    @Override // hq0.i0
    public java.lang.String O0() {
        return this.f282970x.f293634a;
    }

    public void O1(java.lang.String event, java.util.HashMap hashMap, yz5.q callback) {
        kotlin.jvm.internal.o.g(event, "event");
        kotlin.jvm.internal.o.g(callback, "callback");
        gq0.v vVar = (gq0.v) this.f282970x.f293638e;
        if (vVar != null) {
            vVar.ca(event, hashMap, callback);
        }
    }

    public final void Q1() {
        com.tencent.mars.xlog.Log.i(this.f282971y, "initBiz");
        d75.b.g(new hq0.l(this));
        this.L = new hq0.n(this);
    }

    public final void R1(iq0.e eVar, boolean z17) {
        java.lang.String str = "innerCreateFrameSetRoot path:" + eVar.f293657a;
        java.lang.String str2 = this.f282971y;
        com.tencent.mars.xlog.Log.i(str2, str);
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.C;
        if (concurrentHashMap.get(eVar.a()) == null) {
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            concurrentHashMap.put(eVar.a(), Y0(this, context, this.f282970x.f293634a, eVar.f293657a, eVar.f293658b, false, z17));
            if (eVar.f293659c != 0) {
                com.tencent.mars.xlog.Log.i(str2, "innerCreateFrameSetRoot, create cache reporter");
                java.lang.String rootConfigId = eVar.a();
                java.lang.String frameSetRootId = eVar.a();
                mq0.l0 l0Var = this.E;
                l0Var.getClass();
                kotlin.jvm.internal.o.g(rootConfigId, "rootConfigId");
                kotlin.jvm.internal.o.g(frameSetRootId, "frameSetRootId");
                l0Var.f330584b.put(rootConfigId, new mq0.k0(frameSetRootId, 0L, 0L, 0L, 0.0d, null, 0L, 0L, 0L, 0L, com.tencent.rtmp.TXLiveConstants.PUSH_EVT_ROOM_IN_FAILED, null));
            }
        }
    }

    @Override // jc3.i0
    public void S(jc3.l0 listener) {
        kotlin.jvm.internal.o.g(listener, "listener");
        ((java.util.HashSet) this.A).add(listener);
    }

    public final void U1(java.lang.String rootConfigId) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap;
        hq0.e0 e0Var = (hq0.e0) this.C.get(rootConfigId);
        if (e0Var != null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("innerDestroyFrameSetRoot id:");
            java.lang.String str = e0Var.f282984e;
            sb6.append(str);
            com.tencent.mars.xlog.Log.i(this.f282971y, sb6.toString());
            F1(str);
            mq0.l0 l0Var = this.E;
            l0Var.getClass();
            kotlin.jvm.internal.o.g(rootConfigId, "rootConfigId");
            mq0.k0 k0Var = (mq0.k0) l0Var.f330584b.get(rootConfigId);
            if (k0Var != null) {
                if (0 == k0Var.f330581i) {
                    com.tencent.mars.xlog.Log.i("MagicCardFrameSetCacheReporter", "exit scene, but start time not found");
                    k0Var.f330582j = 0L;
                } else {
                    k0Var.f330582j = java.lang.System.currentTimeMillis() - k0Var.f330581i;
                }
            }
            l0Var.getClass();
            java.util.concurrent.ConcurrentHashMap concurrentHashMap2 = l0Var.f330584b;
            mq0.k0 k0Var2 = (mq0.k0) concurrentHashMap2.get(rootConfigId);
            if (k0Var2 != null) {
                long j17 = k0Var2.f330574b;
                if (j17 != 0) {
                    long j18 = k0Var2.f330579g;
                    if (j18 != 0) {
                        long j19 = k0Var2.f330580h;
                        if (j19 != 0) {
                            long j27 = k0Var2.f330575c;
                            long j28 = k0Var2.f330576d;
                            long j29 = (j17 - j27) - j28;
                            double d17 = j17;
                            double d18 = j27 / d17;
                            double d19 = j28 / d17;
                            concurrentHashMap = concurrentHashMap2;
                            double d27 = j29 / d17;
                            double d28 = j19 - j18;
                            double d29 = j19;
                            double d37 = d28 / d29;
                            double d38 = k0Var2.f330577e;
                            double d39 = d38 / j18;
                            double d47 = d38 / d29;
                            kotlin.jvm.internal.o.f(java.lang.String.format("report, missRate: %.2f, hitRate: %.2f, avgRenderTime: %.2f, avgPerfRenderTime: %.2f", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Double.valueOf(d18), java.lang.Double.valueOf(d19), java.lang.Double.valueOf(d39), java.lang.Double.valueOf(d47)}, 4)), "format(...)");
                            org.json.JSONObject jSONObject = new org.json.JSONObject();
                            jSONObject.put("num_totalCache", k0Var2.f330574b);
                            jSONObject.put("num_hitCache", k0Var2.f330576d);
                            jSONObject.put("num_missCache", k0Var2.f330575c);
                            jSONObject.put("num_natureMissCache", j29);
                            jSONObject.put("rate_hit", d19);
                            jSONObject.put("rate_miss", d18);
                            jSONObject.put("rate_natureMiss", d27);
                            jSONObject.put("num_expose", k0Var2.f330580h);
                            jSONObject.put("num_render", k0Var2.f330579g);
                            jSONObject.put("rate_cache", d37);
                            jSONObject.put("avg_renderTime", d39);
                            jSONObject.put("avg_perfRenderTime", d47);
                            jSONObject.put("time_sceneActive", k0Var2.f330582j);
                            jSONObject.toString();
                            ((je3.i) i95.n0.c(je3.i.class)).qa(k0Var2.f330573a + '-' + java.lang.System.currentTimeMillis(), l0Var.f330583a, k0Var2.f330573a, com.tencent.mm.plugin.magicbrush.report.IMagicBrushMonitor$PerformanceScene.FrameSetCache, 0L, kz5.p0.f313996d, jSONObject);
                            concurrentHashMap.remove(rootConfigId);
                        }
                    }
                }
            }
            concurrentHashMap = concurrentHashMap2;
            concurrentHashMap.remove(rootConfigId);
        }
    }

    @Override // jc3.i0
    public synchronized void V(android.app.Activity activity) {
        com.tencent.mars.xlog.Log.i(this.f282971y, "activeBiz activity:" + activity);
        this.f282969J = new java.lang.ref.WeakReference(activity);
        a2(false);
        H1(true);
        this.Q = true;
    }

    public void Y1(iq0.e eVar, java.lang.String frameSetName, java.lang.String frameSetData, android.graphics.Rect containerRect, hq0.m0 preloadStrategy) {
        kotlin.jvm.internal.o.g(frameSetName, "frameSetName");
        kotlin.jvm.internal.o.g(frameSetData, "frameSetData");
        kotlin.jvm.internal.o.g(containerRect, "containerRect");
        kotlin.jvm.internal.o.g(preloadStrategy, "preloadStrategy");
        iq0.g gVar = this.f282970x;
        if (eVar == null) {
            eVar = gVar.f293663i;
        }
        iq0.e eVar2 = eVar;
        java.lang.String str = this.f282971y;
        if (eVar2 == null) {
            com.tencent.mars.xlog.Log.e(str, "preload rootConfig nil");
            return;
        }
        com.tencent.mars.xlog.Log.i(str, "preload rootPath:" + eVar2.f293657a + " frameSetName:" + frameSetName + " preloadStrategy:" + preloadStrategy);
        if (preloadStrategy.ordinal() != 3) {
            return;
        }
        if (((qq0.m) ((qq0.i) i95.n0.c(qq0.i.class))).Bi(gVar.f293634a)) {
            d75.b.g(new hq0.s(this, frameSetName, frameSetData, containerRect, eVar2));
            return;
        }
        com.tencent.mars.xlog.Log.i(str, "not support preload, bizName: " + gVar.f293634a);
    }

    public final void Z1(mq0.z zVar, boolean z17) {
        java.lang.String str;
        try {
            mq0.c0 c0Var = (mq0.c0) i95.n0.c(mq0.c0.class);
            java.util.List<java.lang.String> list = z17 ? this.N : kz5.p0.f313996d;
            java.lang.String bizName = this.f282970x.f293634a;
            int i17 = mq0.c0.T0;
            kotlin.jvm.internal.o.g(bizName, "bizName");
            java.lang.String str2 = kotlin.jvm.internal.o.b(bizName, "MagicAdMiniProgram") ? "RewardAd" : "";
            if (list.isEmpty()) {
                if (c0Var != null) {
                    mq0.c0.Xa(c0Var, zVar, bizName, str2, "", "", mq0.a0.f330532e, null, null, 192, null);
                    return;
                }
                return;
            }
            for (java.lang.String frameSetName : list) {
                int i18 = mq0.c0.T0;
                kotlin.jvm.internal.o.g(frameSetName, "frameSetName");
                if (frameSetName.length() == 0) {
                    str = "";
                } else {
                    java.util.List f07 = r26.n0.f0(frameSetName, new java.lang.String[]{"_"}, false, 0, 6, null);
                    str = f07.size() >= 3 ? (java.lang.String) f07.get(1) : frameSetName;
                }
                if (c0Var != null) {
                    mq0.c0.Xa(c0Var, zVar, bizName, str2, str, frameSetName, mq0.a0.f330532e, null, null, 192, null);
                }
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MBADFullLinkReporter", "report " + zVar.f330651d + " full-link failed", e17);
        }
    }

    public final void a2(boolean z17) {
        com.tencent.mars.xlog.Log.i(this.f282971y, "startImpl mb: " + this.f282995g + ", isPreload: " + z17);
        d75.b.g(new hq0.z(this, z17));
    }

    @Override // hq0.i0, jc3.u
    public void b1() {
        java.lang.String str;
        java.lang.String str2;
        boolean isForeground = com.tencent.matrix.lifecycle.supervisor.AppUIForegroundOwner.INSTANCE.isForeground();
        com.tencent.mars.xlog.Log.i(this.f282971y, "onConnException foreground: " + isForeground);
        gq0.v vVar = this.B;
        java.util.List V2 = vVar != null ? vVar.V2() : null;
        if (V2 == null) {
            V2 = kz5.p0.f313996d;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : V2) {
            if (((gq0.u) obj).f274489b) {
                arrayList.add(obj);
            }
        }
        java.util.ArrayList<java.lang.String> arrayList2 = new java.util.ArrayList(kz5.d0.q(arrayList, 10));
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((gq0.u) it.next()).f274488a);
        }
        this.N = arrayList2;
        this.P = false;
        try {
            mq0.c0 c0Var = (mq0.c0) i95.n0.c(mq0.c0.class);
            java.lang.String bizName = this.f282970x.f293634a;
            int i17 = mq0.c0.T0;
            kotlin.jvm.internal.o.g(bizName, "bizName");
            java.lang.String str3 = kotlin.jvm.internal.o.b(bizName, "MagicAdMiniProgram") ? "RewardAd" : "";
            if (!arrayList2.isEmpty()) {
                for (java.lang.String frameSetName : arrayList2) {
                    int i18 = mq0.c0.T0;
                    kotlin.jvm.internal.o.g(frameSetName, "frameSetName");
                    if (frameSetName.length() == 0) {
                        str = "";
                    } else {
                        java.util.List f07 = r26.n0.f0(frameSetName, new java.lang.String[]{"_"}, false, 0, 6, null);
                        str = f07.size() >= 3 ? (java.lang.String) f07.get(1) : frameSetName;
                    }
                    if (c0Var != null) {
                        str2 = bizName;
                        mq0.c0.Xa(c0Var, mq0.z.f330639m, bizName, str3, str, frameSetName, mq0.a0.f330532e, null, kz5.b1.e(new jz5.l("isFg", java.lang.Boolean.valueOf(isForeground))), 64, null);
                    } else {
                        str2 = bizName;
                    }
                    bizName = str2;
                }
            } else if (c0Var != null) {
                mq0.c0.Xa(c0Var, mq0.z.f330639m, bizName, str3, "", "", mq0.a0.f330532e, null, kz5.b1.e(new jz5.l("isFg", java.lang.Boolean.valueOf(isForeground))), 64, null);
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MBADFullLinkReporter", "report ConnException full-link failed", e17);
        }
        je3.i iVar = (je3.i) i95.n0.c(je3.i.class);
        if (iVar != null) {
            je3.j.a(iVar, com.tencent.mm.plugin.magicbrush.report.IMagicBrushMonitor$Key.MagicStarterConnException, this.f282970x.f293634a, kz5.b1.e(new jz5.l("isFg", java.lang.Boolean.valueOf(isForeground))));
        }
        java.util.Iterator it6 = this.A.iterator();
        while (it6.hasNext()) {
            ((jc3.l0) it6.next()).b1();
        }
        super.b1();
        if (!isForeground) {
            com.tencent.matrix.lifecycle.supervisor.AppUIForegroundOwner appUIForegroundOwner = com.tencent.matrix.lifecycle.supervisor.AppUIForegroundOwner.INSTANCE;
            appUIForegroundOwner.removeLifecycleCallback(this.U);
            appUIForegroundOwner.addLifecycleCallback(this.U);
        } else {
            com.tencent.mars.xlog.Log.i(this.f282971y, "connect exception");
            yz5.a aVar = this.L;
            if (aVar != null) {
                ((hq0.n) aVar).invoke();
            }
        }
    }

    @Override // hq0.i0, jc3.g0
    public void c(int i17, boolean z17) {
        java.lang.String str;
        super.c(i17, z17);
        fq0.x S0 = S0(i17);
        if (S0 != null) {
            i95.m c17 = i95.n0.c(mq0.d0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            mq0.d0 d0Var = (mq0.d0) c17;
            java.lang.String str2 = this.f282970x.f293634a;
            hq0.e0 e0Var = S0.f265479c;
            ((mq0.s0) d0Var).Ai(str2, (e0Var == null || (str = e0Var.f282982c) == null) ? "" : str, S0.f265478b, mq0.a.f330516h, true, S0.f265477a, kz5.q0.f314001d);
            if (e0Var != null) {
                java.lang.String query = (12 & 2) == 0 ? e0Var.f282983d : "";
                java.lang.String rootConfigId = e0Var.f282982c;
                kotlin.jvm.internal.o.g(rootConfigId, "path");
                kotlin.jvm.internal.o.g(query, "query");
                if (!(query.length() == 0)) {
                    rootConfigId = rootConfigId + '-' + query;
                }
                mq0.l0 l0Var = this.E;
                l0Var.getClass();
                kotlin.jvm.internal.o.g(rootConfigId, "rootConfigId");
                java.lang.String frameSetId = S0.f265478b;
                kotlin.jvm.internal.o.g(frameSetId, "frameSetId");
                mq0.k0 k0Var = (mq0.k0) l0Var.f330584b.get(rootConfigId);
                if (k0Var != null) {
                    java.util.concurrent.ConcurrentHashMap concurrentHashMap = k0Var.f330578f;
                    java.lang.Long l17 = (java.lang.Long) concurrentHashMap.get(frameSetId);
                    if (l17 != null) {
                        long currentTimeMillis = java.lang.System.currentTimeMillis() - l17.longValue();
                        k0Var.f330577e += currentTimeMillis;
                        concurrentHashMap.remove(frameSetId);
                        kotlin.jvm.internal.o.f(java.lang.String.format("record frameSet render time: %d", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Long.valueOf(currentTimeMillis)}, 1)), "format(...)");
                    }
                }
            }
        }
    }

    @Override // jc3.i0
    public synchronized void deactivate() {
        com.tencent.mars.xlog.Log.i(this.f282971y, "deactiveBiz");
        H1(false);
    }

    @Override // hq0.i0
    public synchronized void destroy() {
        com.tencent.mars.xlog.Log.i(this.f282971y, "destroy");
        if (this.f283005t && !this.M) {
            com.tencent.mars.xlog.Log.i(this.f282971y, "isBizActive destroy return");
            return;
        }
        com.tencent.matrix.lifecycle.supervisor.AppUIForegroundOwner.INSTANCE.removeLifecycleCallback(this.U);
        super.destroy();
        kotlinx.coroutines.r2 r2Var = this.S;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        this.S = null;
        this.Q = false;
        this.H = false;
        this.I = false;
        java.util.Iterator it = ((java.util.HashSet) this.A).iterator();
        while (it.hasNext()) {
            ((jc3.l0) it.next()).onDestroy();
        }
        this.B = null;
        this.f282969J = null;
        this.C.clear();
        for (java.util.Map.Entry entry : this.D.entrySet()) {
            kotlin.jvm.internal.o.d(entry);
            java.lang.String str = (java.lang.String) entry.getKey();
            kotlin.jvm.internal.o.d(str);
            d75.b.g(new hq0.t(this, str));
        }
        this.D.clear();
        this.E.f330584b.clear();
        this.F.clear();
        ((java.util.HashSet) this.A).clear();
        this.N = kz5.p0.f313996d;
        this.P = false;
    }

    @Override // jc3.i0
    public void l(com.tencent.mm.plugin.magicbrush.base.MBJsEventBase event) {
        kotlin.jvm.internal.o.g(event, "event");
        com.tencent.mars.xlog.Log.i(this.f282971y, "notifyJsEvent");
        G1(event.f147881d, event.f147882e);
    }

    @Override // hq0.i0, jc3.u
    public void n() {
        super.n();
        com.tencent.mars.xlog.Log.i(this.f282971y, "onMainScriptInjected");
        try {
            mq0.c0 c0Var = (mq0.c0) i95.n0.c(mq0.c0.class);
            if (c0Var != null) {
                mq0.z zVar = mq0.z.f330638i;
                java.lang.String bizName = this.f282970x.f293634a;
                int i17 = mq0.c0.T0;
                kotlin.jvm.internal.o.g(bizName, "bizName");
                mq0.c0.Xa(c0Var, zVar, bizName, kotlin.jvm.internal.o.b(bizName, "MagicAdMiniProgram") ? "RewardAd" : "", null, null, mq0.a0.f330532e, null, null, 216, null);
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MBADFullLinkReporter", "report BizCreated full-link failed", e17);
        }
        gq0.v vVar = this.B;
        if (vVar != null) {
            vVar.n();
        }
    }

    @Override // hq0.i0, jc3.u
    public void onDestroy(int i17) {
        super.onDestroy(i17);
        com.tencent.mars.xlog.Log.i(this.f282971y, "onDestroy");
    }

    @Override // jc3.i0
    public void pause() {
        com.tencent.mars.xlog.Log.i(this.f282971y, "pauseBiz");
        java.util.Iterator it = this.C.values().iterator();
        while (it.hasNext()) {
            ((hq0.e0) it.next()).f();
        }
        kc3.f fVar = this.f283004s;
        if (fVar != null) {
            ym5.a1.f(new com.tencent.mm.plugin.magicbrush.o5((com.tencent.mm.plugin.magicbrush.s5) fVar));
        } else {
            kotlin.jvm.internal.o.o("autoPauseExt");
            throw null;
        }
    }

    @Override // jc3.i0
    public void resume() {
        com.tencent.mars.xlog.Log.i(this.f282971y, "resumeBiz");
        com.tencent.mars.xlog.Log.i(getTag(), "resume");
        jc3.j0 j0Var = this.f282995g;
        if (j0Var != null) {
            ((rc3.w0) j0Var).A();
        }
        java.util.Iterator it = this.C.values().iterator();
        while (it.hasNext()) {
            ((hq0.e0) it.next()).j();
        }
    }

    @Override // hq0.i0
    public void s1(hq0.e0 root, fq0.x frameSet, java.lang.String info) {
        kotlin.jvm.internal.o.g(root, "root");
        kotlin.jvm.internal.o.g(frameSet, "frameSet");
        kotlin.jvm.internal.o.g(info, "info");
        java.lang.String concat = "onBind: info is ".concat(info);
        java.lang.String str = this.f282971y;
        com.tencent.mars.xlog.Log.i(str, concat);
        com.tencent.mm.magicbrush.plugin.scl.view.MagicSclViewContainer magicSclViewContainer = frameSet.f265488l;
        if (magicSclViewContainer == null) {
            com.tencent.mars.xlog.Log.e(str, "sclView empty, addCustomView error");
        } else if (frameSet.f265492p == 0) {
            int C0 = C0(magicSclViewContainer);
            frameSet.f265492p = C0;
            com.tencent.mars.xlog.Log.i(str, "viewId is assigned:" + C0);
        } else {
            com.tencent.mars.xlog.Log.i(str, "viewId is already assigned:" + frameSet.f265492p);
        }
        super.s1(root, frameSet, info);
    }

    @Override // jc3.i0
    public void t0(java.lang.String script, yz5.l lVar) {
        kotlin.jvm.internal.o.g(script, "script");
        boolean a17 = z65.c.a();
        java.lang.String str = this.f282971y;
        if (!a17) {
            com.tencent.mars.xlog.Log.e(str, "testEvaluateMBJs blocked, not in debug environment");
            if (lVar != null) {
                lVar.invoke("not in debug environment");
                return;
            }
            return;
        }
        com.tencent.mars.xlog.Log.i(str, "testEvaluateMBJs, ".concat(script));
        jc3.j0 j0Var = this.f282995g;
        if (j0Var != null) {
            ((rc3.w0) j0Var).l(script, lVar);
            return;
        }
        com.tencent.mars.xlog.Log.e(str, "testEvaluateMBJs, but MB is null");
        if (lVar != null) {
            lVar.invoke("mb is null");
        }
    }
}
