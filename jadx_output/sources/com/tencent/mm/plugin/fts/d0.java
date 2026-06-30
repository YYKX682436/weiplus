package com.tencent.mm.plugin.fts;

@j95.b
/* loaded from: classes12.dex */
public class d0 extends i95.w implements o13.z {
    public static volatile boolean D;
    public static boolean E;
    public final com.tencent.mm.sdk.event.IListener A;
    public final java.util.HashSet B;
    public final java.util.LinkedList C;

    /* renamed from: f, reason: collision with root package name */
    public volatile com.tencent.mm.plugin.fts.o f137381f;

    /* renamed from: r, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f137390r;

    /* renamed from: s, reason: collision with root package name */
    public final com.tencent.mm.modelbase.u0 f137391s;

    /* renamed from: t, reason: collision with root package name */
    public final android.content.BroadcastReceiver f137392t;

    /* renamed from: u, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f137393u;

    /* renamed from: v, reason: collision with root package name */
    public com.tencent.mm.plugin.fts.p f137394v;

    /* renamed from: w, reason: collision with root package name */
    public final android.util.SparseArray f137395w;

    /* renamed from: x, reason: collision with root package name */
    public final t13.g[] f137396x;

    /* renamed from: y, reason: collision with root package name */
    public final android.util.SparseArray f137397y;

    /* renamed from: z, reason: collision with root package name */
    public final android.util.SparseArray f137398z;

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.fts.t f137379d = new com.tencent.mm.plugin.fts.t();

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.fts.t f137380e = new com.tencent.mm.plugin.fts.t();

    /* renamed from: g, reason: collision with root package name */
    public volatile boolean f137382g = false;

    /* renamed from: h, reason: collision with root package name */
    public volatile boolean f137383h = false;

    /* renamed from: i, reason: collision with root package name */
    public volatile boolean f137384i = false;

    /* renamed from: m, reason: collision with root package name */
    public volatile boolean f137385m = false;

    /* renamed from: n, reason: collision with root package name */
    public boolean f137386n = false;

    /* renamed from: o, reason: collision with root package name */
    public boolean f137387o = false;

    /* renamed from: p, reason: collision with root package name */
    public final com.tencent.wcdb.DatabaseErrorHandler f137388p = new com.tencent.mm.plugin.fts.d0$$a(this);

    /* renamed from: q, reason: collision with root package name */
    public final c01.jd f137389q = new com.tencent.mm.plugin.fts.e0(this);

    public d0() {
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.f137390r = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.ActivateEvent>(a0Var) { // from class: com.tencent.mm.plugin.fts.PluginFTS$2
            {
                this.__eventId = -1435144905;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.ActivateEvent activateEvent) {
                com.tencent.mm.autogen.events.ActivateEvent activateEvent2 = activateEvent;
                com.tencent.mm.plugin.fts.d0 d0Var = com.tencent.mm.plugin.fts.d0.this;
                d0Var.f137379d.a().e(activateEvent2.f53964g.f6412a);
                d0Var.f137380e.a().e(activateEvent2.f53964g.f6412a);
                d0Var.f137387o = !r4.f6412a;
                return false;
            }
        };
        this.f137391s = new com.tencent.mm.plugin.fts.f0(this);
        this.f137392t = new com.tencent.mm.plugin.fts.g0(this);
        this.f137393u = new java.util.concurrent.ConcurrentHashMap();
        this.f137395w = new android.util.SparseArray();
        this.f137396x = new t13.g[]{null};
        this.f137397y = new android.util.SparseArray();
        this.f137398z = new android.util.SparseArray();
        this.A = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.CheckLanguageChangeEvent>(a0Var) { // from class: com.tencent.mm.plugin.fts.PluginFTS$6
            {
                this.__eventId = -1187832230;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.CheckLanguageChangeEvent checkLanguageChangeEvent) {
                com.tencent.mm.plugin.fts.d0 d0Var = com.tencent.mm.plugin.fts.d0.this;
                d0Var.getClass();
                d0Var.f137379d.b(65536, new com.tencent.mm.plugin.fts.h0(d0Var));
                return false;
            }
        };
        this.B = new java.util.HashSet();
        this.C = new java.util.LinkedList();
    }

    public static void Ai(com.tencent.mm.plugin.fts.d0 d0Var) {
        d0Var.getClass();
        d0Var.qj(1, new com.tencent.mm.plugin.fts.logic.m3());
        d0Var.qj(2, new com.tencent.mm.plugin.fts.logic.l());
        d0Var.qj(3, new com.tencent.mm.plugin.fts.logic.l2());
        d0Var.qj(4, new com.tencent.mm.plugin.fts.logic.f1());
        d0Var.qj(8, new com.tencent.mm.plugin.fts.logic.q2());
        d0Var.qj(11, new com.tencent.mm.plugin.fts.logic.k());
        d0Var.qj(12, new com.tencent.mm.plugin.fts.logic.e3());
        d0Var.qj(16, new com.tencent.mm.plugin.fts.logic.h3());
        d0Var.qj(10000, new com.tencent.mm.plugin.fts.logic.c4());
        d0Var.qj(14, new com.tencent.mm.plugin.fts.logic.s1());
    }

    public static void Bi(final com.tencent.mm.plugin.fts.d0 d0Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FTS.PluginFTS", "Create Index Storage %d", java.lang.Integer.valueOf(d0Var.f137393u.size()));
        if (!d0Var.mj() && !D) {
            D = true;
            com.tencent.mm.plugin.report.service.d1.f158158b.d("fts_start_create_fail", true, pm0.w.f356804e, null, true, false, new yz5.a() { // from class: com.tencent.mm.plugin.fts.d0$$c
                @Override // yz5.a
                public final java.lang.Object invoke() {
                    return java.lang.String.format("ftsInitExptEnabled=%b", java.lang.Boolean.valueOf(com.tencent.mm.plugin.fts.d0.this.f137385m));
                }
            });
        }
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.Iterator it = d0Var.f137393u.values().iterator();
        while (it.hasNext()) {
            linkedList.add((o13.u) it.next());
        }
        java.util.Collections.sort(linkedList);
        for (int i17 = 0; i17 < linkedList.size(); i17++) {
            ((o13.u) linkedList.get(i17)).create();
        }
    }

    public static void Di(com.tencent.mm.plugin.fts.d0 d0Var) {
        d0Var.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.FTS.PluginFTS", "Create Native Logic");
        int i17 = 0;
        while (true) {
            android.util.SparseArray sparseArray = d0Var.f137398z;
            if (i17 >= sparseArray.size()) {
                return;
            }
            o13.w wVar = (o13.w) sparseArray.get(sparseArray.keyAt(i17));
            if (wVar != null) {
                try {
                    ((o13.b) wVar).f();
                } catch (java.lang.Exception e17) {
                    java.lang.String name = wVar.getName();
                    boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                    com.tencent.mars.xlog.Log.e("MicroMsg.FTS.PluginFTS", "Create Native Logic name=%s \nexception=%s", name, com.tencent.mm.sdk.platformtools.z3.c(e17));
                }
            }
            i17++;
        }
    }

    public static void wi(com.tencent.mm.plugin.fts.d0 d0Var) {
        d0Var.getClass();
        d0Var.pj(new w13.k());
        d0Var.pj(new w13.b());
        d0Var.pj(new w13.f());
        d0Var.pj(new w13.h());
        d0Var.pj(new w13.i());
        d0Var.pj(new w13.a());
        d0Var.pj(new w13.j());
        d0Var.pj(new w13.g());
    }

    public void Ni(p13.c cVar) {
        com.tencent.mm.plugin.fts.t tVar = this.f137379d;
        if (cVar != null) {
            tVar.a().a(cVar);
        } else {
            tVar.getClass();
        }
        com.tencent.mm.plugin.fts.t tVar2 = this.f137380e;
        if (cVar != null) {
            tVar2.a().a(cVar);
        } else {
            tVar2.getClass();
        }
    }

    public final void Ri() {
        if (this.f137381f != null) {
            try {
                this.f137381f.c();
            } finally {
                try {
                } finally {
                }
            }
        }
    }

    public t13.k Ui(int i17, android.content.Context context, t13.j jVar, int i18) {
        t13.h hVar = (t13.h) this.f137395w.get(i17);
        if (hVar != null) {
            return hVar.j0(context, jVar, i18);
        }
        for (fs.q qVar : ((fs.c) fs.g.f(t13.l.class)).all()) {
            if (qVar.hasKey(java.lang.Integer.valueOf(i17))) {
                return ((t13.l) qVar.get()).j0(context, jVar, i18);
            }
        }
        return null;
    }

    public java.util.LinkedList Vi(java.util.HashSet hashSet, android.content.Context context, t13.j jVar, int i17) {
        t13.h hVar;
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        java.util.Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            int intValue = ((java.lang.Integer) it.next()).intValue();
            t13.h hVar2 = (t13.h) this.f137395w.get(intValue);
            if (hVar2 != null) {
                linkedList2.add(hVar2);
            } else {
                for (fs.q qVar : ((fs.c) fs.g.f(t13.l.class)).all()) {
                    if (qVar.hasKey(java.lang.Integer.valueOf(intValue)) && (hVar = (t13.h) qVar.get()) != null) {
                        linkedList2.add(hVar);
                    }
                }
            }
        }
        java.util.Collections.sort(linkedList2);
        java.util.Iterator it6 = linkedList2.iterator();
        while (it6.hasNext()) {
            linkedList.add(((t13.h) it6.next()).j0(context, jVar, i17));
        }
        return linkedList;
    }

    public final void Zi() {
        com.tencent.mars.xlog.Log.i("MicroMsg.FTS.PluginFTS", "Destroy Native Logic");
        int i17 = 0;
        while (true) {
            android.util.SparseArray sparseArray = this.f137398z;
            if (i17 >= sparseArray.size()) {
                return;
            }
            o13.w wVar = (o13.w) sparseArray.get(sparseArray.keyAt(i17));
            if (wVar != null) {
                try {
                    ((o13.b) wVar).g();
                } catch (java.lang.Exception e17) {
                    java.lang.String name = wVar.getName();
                    boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                    com.tencent.mars.xlog.Log.e("MicroMsg.FTS.PluginFTS", "Create Native Logic name=%s \nexception=%s", name, com.tencent.mm.sdk.platformtools.z3.c(e17));
                }
            }
            i17++;
        }
    }

    public final void aj() {
        com.tencent.mars.xlog.Log.i("MicroMsg.FTS.PluginFTS", "Destroy Index Storage");
        for (o13.u uVar : this.f137393u.values()) {
            if (uVar != null) {
                uVar.destroy();
            }
        }
    }

    public t13.g bj() {
        t13.g[] gVarArr = this.f137396x;
        if (gVarArr[0] == null) {
            synchronized (gVarArr) {
                t13.g[] gVarArr2 = this.f137396x;
                if (gVarArr2[0] == null) {
                    gVarArr2[0] = new com.tencent.mm.plugin.fts.n();
                }
            }
        }
        return this.f137396x[0];
    }

    public o13.u cj(int i17) {
        return (o13.u) this.f137393u.get(java.lang.Integer.valueOf(i17));
    }

    public o13.v fj() {
        if (this.f137394v == null) {
            this.f137394v = new com.tencent.mm.plugin.fts.p();
        }
        return this.f137394v;
    }

    public u13.h hj(int i17) {
        u13.h hVar = (u13.h) this.f137397y.get(i17);
        if (hVar != null) {
            return hVar;
        }
        for (fs.q qVar : ((fs.c) fs.g.f(u13.i.class)).all()) {
            if (qVar.hasKey(java.lang.Integer.valueOf(i17))) {
                return (u13.h) qVar.get();
            }
        }
        return null;
    }

    public com.tencent.mm.plugin.fts.logic.m3 ij() {
        com.tencent.mm.plugin.fts.logic.m3 m3Var;
        synchronized (this.f137398z) {
            m3Var = (com.tencent.mm.plugin.fts.logic.m3) this.f137398z.get(1);
        }
        return m3Var;
    }

    public boolean mj() {
        return this.f137379d.a().b() && this.f137380e.a().b();
    }

    public void nj() {
        int i17 = 0;
        while (true) {
            java.util.LinkedList linkedList = this.C;
            if (i17 >= linkedList.size()) {
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.FTS.PluginFTS", "lastIndexBuildContent[%d][%s]", java.lang.Integer.valueOf(i17), (java.lang.String) linkedList.get(i17));
            i17++;
        }
    }

    public void oj(t13.h hVar) {
        try {
            this.f137395w.put(hVar.getType(), hVar);
        } catch (java.lang.Exception unused) {
        }
    }

    @Override // i95.w
    public void onAccountInitialized(android.content.Context context) {
        com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(o13.d.f342234t);
        java.lang.String str = a17.f213279f;
        if (str != null) {
            java.lang.String l17 = com.tencent.mm.vfs.e8.l(str, false, false);
            if (!a17.f213279f.equals(l17)) {
                a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
            }
        }
        com.tencent.mm.vfs.b3 b3Var = com.tencent.mm.vfs.a3.f212781a;
        com.tencent.mm.vfs.z2 m17 = b3Var.m(a17, null);
        if (!(!m17.a() ? false : m17.f213266a.F(m17.f213267b))) {
            com.tencent.mm.vfs.z2 m18 = b3Var.m(a17, m17);
            if (m18.a()) {
                m18.f213266a.r(m18.f213267b);
            }
        }
        android.content.Intent registerReceiver = com.tencent.mm.sdk.platformtools.x2.f193071a.registerReceiver(null, new android.content.IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (registerReceiver != null) {
            int intExtra = registerReceiver.getIntExtra("status", -1);
            this.f137386n = intExtra == 2 || intExtra == 5;
        } else {
            this.f137386n = false;
        }
        android.content.IntentFilter intentFilter = new android.content.IntentFilter();
        intentFilter.addAction("android.intent.action.ACTION_POWER_CONNECTED");
        intentFilter.addAction("android.intent.action.ACTION_POWER_DISCONNECTED");
        com.tencent.mm.sdk.platformtools.x2.f193071a.registerReceiver(this.f137392t, intentFilter);
        c01.kd f17 = gm0.j1.f();
        c01.jd jdVar = this.f137389q;
        if (f17.f37290a) {
            com.tencent.mars.xlog.Log.e("MicroMsg.UninitForUEH", "add , is running , forbid add");
        } else {
            ((java.util.HashSet) f17.f37291b).add(jdVar);
        }
        this.f137390r.alive();
        this.A.alive();
        gm0.j1.d().a(138, this.f137391s);
        this.f137385m = bm5.o1.f22719a.h(new com.tencent.mm.repairer.config.fts.RepairerConfigFtsInitExpttest()) == 1;
        if (this.f137385m) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FTS.PluginFTS", "ftsInitExptEnabled=true, defer postTask to startDaemon");
        } else {
            this.f137379d.b(-131072, new com.tencent.mm.plugin.fts.j0(this));
            this.f137379d.b(-131071, new com.tencent.mm.plugin.fts.i0(this, null));
            this.f137379d.b(65536, new com.tencent.mm.plugin.fts.h0(this));
        }
        this.f137383h = true;
        yj(1);
    }

    @Override // i95.w
    public void onAccountReleased(android.content.Context context) {
        Zi();
        this.f137395w.clear();
        this.f137397y.clear();
        aj();
        com.tencent.mars.xlog.Log.i("MicroMsg.FTS.PluginFTS", "resetFTSTaskDaemon");
        com.tencent.mm.plugin.fts.t tVar = this.f137379d;
        tVar.a().c();
        tVar.a().quit();
        com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTSTaskDaemon", "searchTaskThread quit");
        com.tencent.mm.plugin.fts.t tVar2 = this.f137380e;
        tVar2.a().c();
        tVar2.a().quit();
        com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTSTaskDaemon", "searchTaskThread quit");
        Ri();
        synchronized (this.f137396x) {
            t13.g gVar = this.f137396x[0];
            if (gVar != null) {
                ((com.tencent.mm.plugin.fts.n) gVar).c();
                this.f137396x[0] = null;
            }
        }
        try {
            com.tencent.mm.sdk.platformtools.x2.f193071a.unregisterReceiver(this.f137392t);
        } catch (java.lang.Exception unused) {
        }
        this.f137390r.dead();
        this.A.dead();
        gm0.j1.d().q(138, this.f137391s);
        c01.kd f17 = gm0.j1.f();
        c01.jd jdVar = this.f137389q;
        if (f17.f37290a) {
            com.tencent.mars.xlog.Log.e("MicroMsg.UninitForUEH", "remove , is running , forbid remove");
        } else {
            ((java.util.HashSet) f17.f37291b).remove(jdVar);
        }
        this.f137382g = false;
        this.f137383h = false;
        this.f137384i = false;
        this.f137385m = false;
    }

    public void pj(o13.u uVar) {
        this.f137393u.put(java.lang.Integer.valueOf(uVar.getType()), uVar);
    }

    public void qj(int i17, o13.w wVar) {
        synchronized (this.f137398z) {
            this.f137398z.put(i17, wVar);
        }
    }

    public void rj(java.lang.String str) {
        if (this.B.add(str) && !E && gm0.j1.b().h() % 9 == 0) {
            com.tencent.mm.autogen.mmdata.rpt.FTSBuildInfoReportStruct fTSBuildInfoReportStruct = new com.tencent.mm.autogen.mmdata.rpt.FTSBuildInfoReportStruct();
            fTSBuildInfoReportStruct.f56135d = fTSBuildInfoReportStruct.b("Action", str, true);
            fTSBuildInfoReportStruct.f56136e = c01.id.c();
            fTSBuildInfoReportStruct.k();
        }
    }

    public p13.c sj(int i17, p13.u uVar) {
        if (!mj()) {
            ((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).rj("SearchButContextNotReady");
            com.tencent.mm.plugin.fts.g gVar = new com.tencent.mm.plugin.fts.g(-2, uVar);
            s75.d.b(gVar, "FTSExceptionHandler");
            return gVar;
        }
        android.util.SparseArray sparseArray = this.f137398z;
        if (sparseArray.indexOfKey(i17) < 0) {
            ((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).rj("SearchButNotFindSearchLogic");
            com.tencent.mars.xlog.Log.e("MicroMsg.FTS.PluginFTS", "Not Found Search Logic, LogicArraySize=%d", java.lang.Integer.valueOf(sparseArray.size()));
            com.tencent.mm.plugin.fts.g gVar2 = new com.tencent.mm.plugin.fts.g(-2, uVar);
            s75.d.b(gVar2, "FTSExceptionHandler");
            return gVar2;
        }
        o13.w wVar = (o13.w) sparseArray.get(i17);
        if (((o13.b) wVar).f342207d) {
            return wVar.b(uVar);
        }
        ((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).rj("SearchButLogicNotCreated");
        com.tencent.mm.plugin.fts.g gVar3 = new com.tencent.mm.plugin.fts.g(-2, uVar);
        s75.d.b(gVar3, "FTSExceptionHandler");
        return gVar3;
    }

    public void tj(int i17, int i18, long j17, java.lang.String str, java.lang.String str2) {
        java.lang.String format = java.lang.String.format(java.util.Locale.CHINA, "type:%s subtype:%s entityId:%s auxIndex:%s content:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Long.valueOf(j17), str, str2);
        java.util.LinkedList linkedList = this.C;
        if (linkedList.size() > 5) {
            linkedList.removeFirst();
        }
        linkedList.addLast(format);
    }

    public void uj(int i17) {
        try {
            this.f137395w.remove(i17);
        } catch (java.lang.Exception unused) {
        }
    }

    public void vj(int i17) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f137393u;
        if (concurrentHashMap.containsKey(java.lang.Integer.valueOf(i17))) {
            o13.u uVar = (o13.u) concurrentHashMap.get(java.lang.Integer.valueOf(i17));
            try {
                uVar.destroy();
            } catch (java.lang.Exception e17) {
                java.lang.String name = uVar.getName();
                boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                com.tencent.mars.xlog.Log.e("MicroMsg.FTS.PluginFTS", "Destroy Index Storage name=%s \nexception=%s", name, com.tencent.mm.sdk.platformtools.z3.c(e17));
            }
        }
        concurrentHashMap.remove(java.lang.Integer.valueOf(i17));
    }

    public void wj(int i17) {
        synchronized (this.f137398z) {
            o13.w wVar = (o13.w) this.f137398z.get(i17);
            if (wVar != null) {
                try {
                    ((o13.b) wVar).g();
                } catch (java.lang.Exception e17) {
                    boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                    com.tencent.mars.xlog.Log.e("MicroMsg.FTS.PluginFTS", "Destroy Native Logic name=%s \nexception=%s", wVar.getName(), com.tencent.mm.sdk.platformtools.z3.c(e17));
                }
                this.f137398z.remove(i17);
            }
        }
    }

    public void xj(java.lang.String str, p13.y yVar, int i17) {
        if (mj()) {
            android.util.SparseArray sparseArray = this.f137398z;
            if (sparseArray.indexOfKey(1) >= 0) {
                o13.w wVar = (o13.w) sparseArray.get(1);
                java.util.HashMap hashMap = o13.n.f342241a;
                java.util.HashMap hashMap2 = new java.util.HashMap();
                for (java.util.Map.Entry entry : o13.n.f342241a.entrySet()) {
                    hashMap2.put((java.lang.String) entry.getKey(), (java.lang.String) entry.getValue());
                }
                wVar.d(str, yVar, i17, hashMap2);
            }
        }
    }

    public void yj(int i17) {
        gm0.j1.i();
        this.f137382g = com.tencent.mm.sdk.platformtools.t8.q1((java.lang.Integer) gm0.j1.u().c().l(15, null)) != 0;
        if (this.f137382g) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FTS.PluginFTS", "waitAndStartDaemon user is initialized, source=%s", java.lang.Integer.valueOf(i17));
        } else {
            gm0.j1.d().a(138, this.f137391s);
            com.tencent.mars.xlog.Log.i("MicroMsg.FTS.PluginFTS", "waitAndStartDaemon wait for account initialized, source=%s", java.lang.Integer.valueOf(i17));
        }
        if (this.f137383h) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FTS.PluginFTS", "waitAndStartDaemon plugin fts account init source=%s", java.lang.Integer.valueOf(i17));
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.FTS.PluginFTS", "waitAndStartDaemon wait for plugin fts account init source=%s", java.lang.Integer.valueOf(i17));
        }
        if (this.f137382g && this.f137383h) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FTS.PluginFTS", "startDaemon source=%s", java.lang.Integer.valueOf(i17));
            if (!this.f137379d.a().b()) {
                this.f137379d.a().start();
                com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTSTaskDaemon", "searchTaskThread start");
            }
            if (!this.f137380e.a().b()) {
                this.f137380e.a().start();
                com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTSTaskDaemon", "searchTaskThread start");
            }
            if (!this.f137385m || this.f137384i) {
                return;
            }
            this.f137384i = true;
            com.tencent.mars.xlog.Log.i("MicroMsg.FTS.PluginFTS", "ftsInitExptEnabled=true, postTask to main looper after both daemons started");
            com.tencent.mm.sdk.platformtools.u3.h(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.fts.d0$$b
                @Override // java.lang.Runnable
                public final void run() {
                    com.tencent.mm.plugin.fts.d0 d0Var = com.tencent.mm.plugin.fts.d0.this;
                    d0Var.getClass();
                    com.tencent.mm.plugin.fts.j0 j0Var = new com.tencent.mm.plugin.fts.j0(d0Var);
                    com.tencent.mm.plugin.fts.t tVar = d0Var.f137379d;
                    tVar.b(-131072, j0Var);
                    tVar.b(-131071, new com.tencent.mm.plugin.fts.i0(d0Var, null));
                    tVar.b(65536, new com.tencent.mm.plugin.fts.h0(d0Var));
                }
            });
        }
    }
}
