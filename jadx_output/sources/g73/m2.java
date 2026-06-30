package g73;

/* loaded from: classes15.dex */
public final class m2 implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public boolean f269290d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentLinkedQueue f269291e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f269292f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f269293g;

    /* renamed from: h, reason: collision with root package name */
    public int f269294h;

    /* renamed from: i, reason: collision with root package name */
    public final int f269295i;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f269296m;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.Map f269297n;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.Map f269298o;

    /* renamed from: p, reason: collision with root package name */
    public final java.util.Map f269299p;

    /* renamed from: q, reason: collision with root package name */
    public final java.util.Map f269300q;

    /* renamed from: r, reason: collision with root package name */
    public final java.util.Map f269301r;

    /* renamed from: s, reason: collision with root package name */
    public java.util.Collection f269302s;

    /* renamed from: t, reason: collision with root package name */
    public long f269303t;

    /* renamed from: u, reason: collision with root package name */
    public long f269304u;

    /* renamed from: v, reason: collision with root package name */
    public final g73.l2 f269305v;

    public m2(android.os.Looper looper) {
        kotlin.jvm.internal.o.g(looper, "looper");
        this.f269291e = new java.util.concurrent.ConcurrentLinkedQueue();
        this.f269292f = true;
        this.f269293g = "4G";
        this.f269295i = 3;
        this.f269296m = true;
        this.f269297n = new java.util.LinkedHashMap();
        this.f269298o = new java.util.LinkedHashMap();
        this.f269299p = new java.util.LinkedHashMap();
        this.f269300q = new java.util.LinkedHashMap();
        this.f269301r = new java.util.LinkedHashMap();
        this.f269305v = new g73.l2(looper, this);
    }

    public final void a() {
        g73.l2 l2Var = this.f269305v;
        if (l2Var.hasMessages(1)) {
            return;
        }
        l2Var.sendEmptyMessageDelayed(1, 300L);
    }

    public final void b() {
        java.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue = this.f269291e;
        if (concurrentLinkedQueue.isEmpty()) {
            com.tencent.mars.xlog.Log.i("HandOff.StatusManager", "message queue is empty, set queueWorking = false");
            this.f269290d = false;
            return;
        }
        try {
            java.lang.String str = (java.lang.String) kz5.n0.W(concurrentLinkedQueue);
            kotlin.jvm.internal.o.d(str);
            i(str);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("HandOff.StatusManager", e17, "", new java.lang.Object[0]);
            this.f269290d = false;
        }
    }

    public final void c() {
        ((java.util.LinkedHashMap) this.f269297n).clear();
        ((java.util.LinkedHashMap) this.f269298o).clear();
        ((java.util.LinkedHashMap) this.f269299p).clear();
        ((java.util.LinkedHashMap) this.f269300q).clear();
        ((java.util.LinkedHashMap) this.f269301r).clear();
    }

    public final void d(com.tencent.mm.plugin.handoff.model.HandOff handOff) {
        kotlin.jvm.internal.o.g(handOff, "handOff");
        com.tencent.mars.xlog.Log.i("HandOff.StatusManager", "del " + handOff.getId());
        java.util.Map map = this.f269300q;
        if (!map.containsKey(handOff.getKey())) {
            map.put(handOff.getKey(), java.lang.Boolean.TRUE);
            this.f269301r.put(handOff.getKey(), handOff.getId());
        }
        this.f269297n.remove(handOff.getKey());
        this.f269298o.remove(handOff.getKey());
        this.f269299p.put(handOff.getKey(), handOff);
        a();
    }

    public final void e(java.util.Collection handOffList) {
        kotlin.jvm.internal.o.g(handOffList, "handOffList");
        try {
            java.lang.String formatedNetType = com.tencent.mars.comm.NetStatusUtil.getFormatedNetType(com.tencent.mm.sdk.platformtools.x2.f193071a);
            kotlin.jvm.internal.o.f(formatedNetType, "getFormatedNetType(...)");
            this.f269293g = formatedNetType;
            this.f269303t = gm0.j1.u().c().t(com.tencent.mm.storage.u3.USERINFO_HANDOFF_SEQ_LONG_SYNC, 0L);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("HandOff.StatusManager", e17, "restoreFromBallInfoList fail, exp:%s", e17);
            this.f269303t = 0L;
        }
        gm0.j1.n().f273288b.q(251, this);
        gm0.j1.n().f273288b.a(251, this);
        g73.o0.f269311d.k8();
    }

    public final void f() {
        if (this.f269290d) {
            return;
        }
        com.tencent.mars.xlog.Log.i("HandOff.StatusManager", "launch queue, set queueWorking = true");
        this.f269290d = true;
        b();
    }

    public final void g() {
        boolean z17 = true;
        int i17 = this.f269294h + 1;
        this.f269294h = i17;
        int i18 = this.f269295i;
        java.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue = this.f269291e;
        if (i17 >= i18) {
            concurrentLinkedQueue.poll();
            this.f269294h = 0;
        }
        com.tencent.mars.xlog.Log.i("HandOff.StatusManager", "send handoff failed, retry: " + this.f269294h);
        int n17 = gm0.j1.d().n();
        if (n17 != 4 && n17 != 6) {
            z17 = false;
        }
        if (z17) {
            if (!this.f269292f) {
                com.tencent.mars.xlog.Log.i("HandOff.StatusManager", "network become available, send all list");
                java.lang.String formatedNetType = com.tencent.mars.comm.NetStatusUtil.getFormatedNetType(com.tencent.mm.sdk.platformtools.x2.f193071a);
                kotlin.jvm.internal.o.f(formatedNetType, "getFormatedNetType(...)");
                this.f269293g = formatedNetType;
                g73.o0.f269311d.k8();
            }
            b();
        } else {
            com.tencent.mars.xlog.Log.i("HandOff.StatusManager", "network unavailable, clear message queue and retry after 30s");
            concurrentLinkedQueue.clear();
            this.f269305v.sendEmptyMessageDelayed(2, 30000L);
        }
        this.f269292f = z17;
    }

    public final void h(int i17, java.util.Collection collection) {
        this.f269291e.add(new e73.k(i17, collection, 0L, 4, null).a(wo.w0.k(), this.f269293g, 1000, 57344));
        f();
    }

    public final void i(java.lang.String str) {
        boolean z17;
        boolean z18;
        boolean x17 = c01.z1.x();
        java.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue = this.f269291e;
        if (x17) {
            com.tencent.mars.xlog.Log.i("HandOff.StatusManager", "device is ex device, don't send handoff: " + str);
            concurrentLinkedQueue.poll();
            b();
            return;
        }
        if (!z65.c.a() && !(z18 = this.f269296m)) {
            com.tencent.mars.xlog.Log.i("HandOff.StatusManager", "debugger: " + z65.c.a() + ", handoff enabled: " + z18 + ", don't send handoff: " + str);
            concurrentLinkedQueue.poll();
            b();
            return;
        }
        this.f269304u = this.f269303t;
        java.lang.String str2 = str;
        while (true) {
            z17 = false;
            if (!r26.n0.D(str2, "<![CSEQ]>", false, 2, null)) {
                break;
            }
            str2 = r26.i0.x(str2, "<![CSEQ]>", java.lang.String.valueOf(this.f269304u), false, 4, null);
            if (this.f269304u == com.tencent.wcdb.core.Database.DictDefaultMatchValue) {
                this.f269304u = 0L;
            }
            this.f269304u++;
        }
        com.tencent.mars.xlog.Log.i("HandOff.StatusManager", "send handoff: " + str2);
        java.util.HashSet hashSet = com.tencent.mm.modelsimple.g1.f71326g;
        if (!gm0.j1.b().m()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneStatusNotify", "sendHandOffSyncCmd fail due to account has not initialized");
        } else if (!com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            gm0.j1.n().f273288b.g(new com.tencent.mm.modelsimple.g1(c01.z1.r(), 11, "HandOffMaster", str2));
            z17 = true;
        }
        if (z17) {
            return;
        }
        g();
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 scene) {
        kotlin.jvm.internal.o.g(scene, "scene");
        if (scene.getReqResp() instanceof com.tencent.mm.modelbase.o) {
            com.tencent.mm.network.v0 reqResp = scene.getReqResp();
            kotlin.jvm.internal.o.e(reqResp, "null cannot be cast to non-null type com.tencent.mm.modelbase.CommReqResp");
            if (((com.tencent.mm.modelbase.o) reqResp).f70710a.f70684a instanceof r45.yd6) {
                com.tencent.mm.network.v0 reqResp2 = scene.getReqResp();
                kotlin.jvm.internal.o.e(reqResp2, "null cannot be cast to non-null type com.tencent.mm.modelbase.CommReqResp");
                com.tencent.mm.protobuf.f fVar = ((com.tencent.mm.modelbase.o) reqResp2).f70710a.f70684a;
                kotlin.jvm.internal.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.StatusNotifyRequest");
                r45.xd6 xd6Var = ((r45.yd6) fVar).f391000m;
                if (xd6Var == null || !kotlin.jvm.internal.o.b(xd6Var.f389998d, "HandOffMaster")) {
                    return;
                }
                if (i17 == 0 && i18 == 0) {
                    this.f269291e.poll();
                    this.f269294h = 0;
                    this.f269303t = this.f269304u;
                    gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_HANDOFF_SEQ_LONG_SYNC, java.lang.Long.valueOf(this.f269303t));
                    com.tencent.mars.xlog.Log.i("HandOff.StatusManager", "send handoff succeed, check next message");
                    b();
                    return;
                }
                com.tencent.mars.xlog.Log.e("HandOff.StatusManager", "send handoff fail, errType:" + i17 + ", errCode:" + i18);
                g();
            }
        }
    }
}
