package com.tencent.mm.plugin.fts.ui;

/* loaded from: classes12.dex */
public class q2 extends com.tencent.mm.plugin.fts.ui.f0 implements t13.j {
    public long A;
    public long B;
    public long C;
    public long D;
    public boolean E;
    public final com.tencent.mm.sdk.platformtools.n3 F;
    public final com.tencent.mm.sdk.platformtools.n3 G;
    public int H;
    public boolean I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f138151J;

    /* renamed from: q, reason: collision with root package name */
    public final java.util.List f138152q;

    /* renamed from: r, reason: collision with root package name */
    public final g23.k f138153r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f138154s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f138155t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f138156u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f138157v;

    /* renamed from: w, reason: collision with root package name */
    public int f138158w;

    /* renamed from: x, reason: collision with root package name */
    public int f138159x;

    /* renamed from: y, reason: collision with root package name */
    public int f138160y;

    /* renamed from: z, reason: collision with root package name */
    public int f138161z;

    public q2(com.tencent.mm.plugin.fts.ui.w0 w0Var, int i17) {
        super(w0Var);
        this.f138156u = true;
        boolean z17 = false;
        this.f138157v = false;
        this.f138158w = -1;
        this.f138159x = -1;
        this.f138160y = -1;
        this.f138161z = 1;
        this.F = new com.tencent.mm.plugin.fts.ui.r2(this, android.os.Looper.getMainLooper());
        this.G = new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper());
        this.H = -1;
        this.f138153r = new g23.k();
        java.util.HashSet hashSet = new java.util.HashSet();
        hashSet.add(16);
        hashSet.add(32);
        if (!((uh4.c0) i95.n0.c(uh4.c0.class)).isTeenMode()) {
            hashSet.add(256);
        }
        hashSet.add(48);
        hashSet.add(51);
        hashSet.add(64);
        hashSet.add(128);
        hashSet.add(96);
        hashSet.add(97);
        if (((ox.g) ((tk.o) i95.n0.c(tk.o.class))).Ri()) {
            hashSet.add(98);
        }
        if (((w50.k) ((x50.j) i95.n0.c(x50.j.class))).f442956e) {
            hashSet.add(129);
        }
        hashSet.add(112);
        hashSet.add(133);
        if (gm0.j1.a()) {
            com.tencent.mm.autogen.events.ShouldShowAppBrandEntranceInFindMoreEvent shouldShowAppBrandEntranceInFindMoreEvent = new com.tencent.mm.autogen.events.ShouldShowAppBrandEntranceInFindMoreEvent();
            shouldShowAppBrandEntranceInFindMoreEvent.e();
            if (shouldShowAppBrandEntranceInFindMoreEvent.f54780h.f7576a) {
                z17 = true;
            }
        }
        if (z17) {
            hashSet.add(144);
        }
        if (((w50.k) ((x50.j) i95.n0.c(x50.j.class))).f442955d) {
            hashSet.add(272);
        }
        if (j62.e.g().c(new com.tencent.mm.repairer.config.search.RepairerConfigFTSAIHistoryEnabled()) == 1) {
            hashSet.add(304);
        }
        this.f138152q = ((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).Vi(hashSet, h(), this, i17);
        if (((w50.k) ((x50.j) i95.n0.c(x50.j.class))).f442956e) {
            androidx.appcompat.app.AppCompatActivity activity = (androidx.appcompat.app.AppCompatActivity) h();
            kotlin.jvm.internal.o.g(activity, "activity");
            kotlinx.coroutines.l.d(kotlinx.coroutines.z0.a(kotlinx.coroutines.q1.f310568a), null, null, new com.tencent.mm.plugin.fts.ui.x0(activity, "SettingSearch_Local", null), 3, null);
        }
    }

    @Override // t13.j
    public void a(t13.k kVar, java.lang.String str, boolean z17) {
        int i17;
        int i18;
        int i19;
        if (!this.f138157v && (i17 = this.H) >= 0) {
            java.util.List list = this.f138152q;
            java.util.LinkedList linkedList = (java.util.LinkedList) list;
            if (i17 < linkedList.size() && ((s50.m0) ((u50.x) i95.n0.c(u50.x.class))).f403091d.f351161a) {
                if (kVar instanceof j23.y) {
                    this.f138159x = this.H;
                } else if (kVar instanceof j23.g) {
                    this.f138158w = this.H;
                }
                if (this.f138159x >= 0 && (i18 = this.f138158w) >= 0) {
                    t13.k kVar2 = (t13.k) linkedList.get(i18);
                    if (kVar2 instanceof j23.g) {
                        this.f138157v = true;
                        if (((j23.g) kVar2).f297271p && (i19 = this.f138159x) < this.f138158w) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTSMainAdapter", "tryReSortUIUnit, relevantSearchUIUnitIdx: (%d)<->chatRoomUIUnitIdx: (%d)", java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(this.f138158w));
                            java.util.Collections.swap(list, this.f138158w, this.f138159x);
                            int i27 = this.f138158w;
                            this.f138158w = this.f138159x;
                            this.f138159x = i27;
                        }
                    }
                }
            }
        }
        boolean z18 = kVar instanceof com.tencent.mm.plugin.fts.ui.a;
        g23.k kVar3 = this.f138153r;
        if (z18) {
            com.tencent.mm.plugin.fts.ui.a aVar = (com.tencent.mm.plugin.fts.ui.a) kVar;
            if (str.equals(this.f138050g)) {
                q(aVar.f138010o);
            }
            try {
                if (aVar.r() > 0 && this.A == 0) {
                    long c17 = c01.id.c() - this.f138051h;
                    this.A = c17;
                    com.tencent.mm.plugin.fts.ui.x2.j(9, c17);
                    com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTSMainAdapter", "firstItemTime=%d", java.lang.Long.valueOf(this.A));
                }
            } catch (java.util.ConcurrentModificationException e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.FTS.FTSMainAdapter", e17, "", new java.lang.Object[0]);
            }
            int type = aVar.getType();
            if (type != 16) {
                if (type != 32) {
                    if (type == 48 && this.D == 0) {
                        long c18 = c01.id.c() - this.f138051h;
                        this.D = c18;
                        com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTSMainAdapter", "firstGetChatroomTime=%d", java.lang.Long.valueOf(c18));
                        com.tencent.mm.plugin.fts.ui.x2.j(6, this.D);
                    }
                } else if (this.C == 0) {
                    long c19 = c01.id.c() - this.f138051h;
                    this.C = c19;
                    com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTSMainAdapter", "firstGetContactTime=%d", java.lang.Long.valueOf(c19));
                    com.tencent.mm.plugin.fts.ui.x2.j(3, this.C);
                }
            } else if (this.B == 0) {
                long c27 = c01.id.c() - this.f138051h;
                this.B = c27;
                com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTSMainAdapter", "firstGetTopHitsTime=%d", java.lang.Long.valueOf(c27));
                com.tencent.mm.plugin.fts.ui.x2.j(0, this.B);
            }
            kVar3.getClass();
            for (t13.i iVar : aVar.f138009n) {
                int size = iVar.f414570f.size() + (iVar.f414568d ? 1 : 0);
                int i28 = iVar.f414569e;
                if (i28 != -32) {
                    if (i28 != -27) {
                        if (i28 == -13) {
                            kVar3.f267953r = size;
                            kVar3.f267954s = kVar3.d(iVar);
                        } else if (i28 == -11) {
                            kVar3.f267952q = size;
                        } else if (i28 == -24) {
                            kVar3.f267944i = size;
                        } else if (i28 == -23) {
                            kVar3.f267946k = size;
                            kVar3.f267947l = kVar3.d(iVar);
                        } else if (i28 == -8) {
                            kVar3.f267939d = size;
                        } else if (i28 != -7) {
                            if (i28 == -6) {
                                kVar3.f267950o = size;
                            } else if (i28 == -4) {
                                kVar3.f267940e = size;
                            } else if (i28 == -3) {
                                if (iVar.f414570f.size() > 0) {
                                    java.util.List list2 = iVar.f414570f;
                                    if (((p13.y) list2.get(list2.size() - 1)).f351187e.equals("create_chatroom\u200b")) {
                                        kVar3.f267942g = 1;
                                        kVar3.f267941f = size - 1;
                                    }
                                }
                                kVar3.f267941f = size;
                            } else if (i28 != -2) {
                                if (i28 == -1) {
                                    kVar3.f267951p = size;
                                }
                            } else if (iVar.f414570f.size() <= 0 || !((p13.y) iVar.f414570f.get(0)).f351187e.equals("create_talker_message\u200b")) {
                                kVar3.f267948m = size;
                            } else {
                                kVar3.f267949n = 1;
                                kVar3.f267948m = size - 1;
                            }
                        }
                    }
                    kVar3.f267943h = size;
                    kVar3.f267945j = kVar3.d(iVar);
                } else {
                    kVar3.f267959x = size;
                }
            }
        } else if (kVar instanceof j23.y) {
            j23.y yVar = (j23.y) kVar;
            if (str.equals(this.f138050g)) {
                q(yVar.f297292h);
            }
            kVar3.f267957v = yVar.e();
        }
        kVar3.D = s();
        new com.tencent.mm.plugin.fts.ui.s2(this, kVar, str).run();
    }

    @Override // com.tencent.mm.plugin.fts.ui.f0
    public void c() {
        super.c();
        for (t13.k kVar : this.f138152q) {
            kVar.cancelSearch();
            kVar.c();
        }
    }

    @Override // com.tencent.mm.plugin.fts.ui.f0
    public u13.g d(int i17) {
        g23.k kVar;
        int i18;
        j23.y yVar;
        int i19;
        java.util.List list = this.f138152q;
        java.util.Iterator it = list.iterator();
        u13.g gVar = null;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            t13.k kVar2 = (t13.k) it.next();
            u13.g b17 = kVar2.b(i17);
            kVar2.d();
            if (b17 != null) {
                gVar = b17;
                break;
            }
            gVar = b17;
        }
        if (gVar != null) {
            gVar.f423768k = java.lang.String.valueOf(o13.p.f342251d);
            java.util.LinkedList linkedList = new java.util.LinkedList();
            java.util.Iterator it6 = list.iterator();
            int i27 = 0;
            while (true) {
                boolean hasNext = it6.hasNext();
                kVar = this.f138153r;
                if (!hasNext) {
                    break;
                }
                t13.k kVar3 = (t13.k) it6.next();
                linkedList.addAll(kVar3.g());
                if ((kVar3 instanceof j23.y) && i17 > (i19 = (yVar = (j23.y) kVar3).f297302u)) {
                    i27 = (yVar.f297296o ? 0 : yVar.f297301t) - 1;
                    kVar.K = i19;
                    kVar.f267935J = i27;
                }
            }
            kVar.I = linkedList;
            int size = linkedList.size();
            while (true) {
                size--;
                if (size < 0) {
                    i18 = i17 + i27;
                    break;
                }
                if (i17 > ((java.lang.Integer) linkedList.get(size)).intValue()) {
                    i18 = (i17 - size) + i27;
                    break;
                }
            }
            gVar.f423766i = i18;
            this.f138161z = i18 + 1;
            gVar.f423763f = 1;
            gVar.f423773p = this.f138053m.f138084a;
        }
        if (gVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FTS.FTSMainAdapter", "Create Data Item Error: getCount-%d position-%d", java.lang.Integer.valueOf(getCount()), java.lang.Integer.valueOf(i17));
        }
        return gVar;
    }

    @Override // com.tencent.mm.plugin.fts.ui.f0
    public void f() {
        int i17;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f138153r.f267936a) && !this.f138154s) {
            g23.k kVar = this.f138153r;
            if (kVar.B != 0) {
                kVar.L = z13.f.Y6(h()).b7();
                com.tencent.mm.plugin.fts.ui.x2.l(this.f138153r);
                com.tencent.mm.plugin.fts.ui.x2.i(this.f138153r);
            }
        }
        int i18 = this.f138159x;
        if (i18 >= 0 && (i17 = this.f138158w) >= 0 && i18 > i17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTSMainAdapter", "doSearch, relevantSearchUIUnitIdx=%d, chatRoomUIUnitIdx=%d, query=%s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(this.f138158w), this.f138050g);
            java.util.Collections.swap(this.f138152q, this.f138158w, this.f138159x);
        }
        this.f138154s = false;
        this.f138155t = false;
        this.f138151J = false;
        this.H = -1;
        this.I = false;
        this.f138153r.e();
        long g17 = o13.n.g(3);
        o13.p.f342251d = g17;
        g23.k kVar2 = this.f138153r;
        kVar2.B = g17;
        kVar2.f267936a = this.f138050g;
        kVar2.f267937b = c01.id.c();
        this.A = 0L;
        this.B = 0L;
        this.C = 0L;
        this.D = 0L;
        this.f138156u = true;
        this.f138157v = false;
        this.f138158w = -1;
        this.f138159x = -1;
        this.f138160y = -1;
        this.f138161z = 1;
        if (this.f138053m.f138085b) {
            ku5.u0 u0Var = ku5.t0.f312615d;
            java.lang.Runnable runnable = new java.lang.Runnable() { // from class: com.tencent.mm.plugin.fts.ui.q2$$a
                @Override // java.lang.Runnable
                public final void run() {
                    com.tencent.mm.plugin.fts.ui.q2 q2Var = com.tencent.mm.plugin.fts.ui.q2.this;
                    q2Var.getClass();
                    com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTSMainAdapter", "[fts][sug] onlyWebSearch notifyLocalSearchEnd directly");
                    q2Var.l(10, true);
                    q2Var.t(false, false);
                }
            };
            ku5.t0 t0Var = (ku5.t0) u0Var;
            t0Var.getClass();
            t0Var.z(runnable, 0L, false);
            return;
        }
        boolean isTeenMode = ((uh4.c0) i95.n0.c(uh4.c0.class)).isTeenMode();
        java.util.HashSet hashSet = new java.util.HashSet();
        hashSet.add("filehelper");
        hashSet.add("gh_051d9102de63");
        boolean s17 = c01.z1.s();
        if (!s17) {
            s17 = com.tencent.mm.sdk.platformtools.t8.P(((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("BindQQSwitch"), 1) == 1;
        }
        if (!s17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTSMainAdapter", "summerqq BindQQSwitch off");
            hashSet.add(java.lang.String.valueOf(22));
            hashSet.add(java.lang.String.valueOf(23));
        }
        hashSet.add("62");
        if (u11.c.f((java.lang.String) gm0.j1.u().c().l(274436, null))) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTSMainAdapter", "checkLookVisibility EuropeanUnionCountry");
            hashSet.add("65");
        }
        ((zq1.a0) gm0.j1.s(zq1.a0.class)).getClass();
        hashSet.add("63");
        if (j62.e.g().c(new com.tencent.mm.repairer.config.global.RepairerConfigQQAssistant()) == 0 || c01.e2.a0()) {
            hashSet.add("96");
        }
        ((ab5.a) ((com.tencent.mm.plugin.appbrand.service.b5) i95.n0.c(com.tencent.mm.plugin.appbrand.service.b5.class))).getClass();
        if (!(((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().p("appbrandcustomerservicemsg") != null)) {
            hashSet.add(java.lang.String.valueOf(69));
        }
        if (!((ab5.j) ((com.tencent.mm.plugin.appbrand.service.j5) i95.n0.c(com.tencent.mm.plugin.appbrand.service.j5.class))).wi()) {
            hashSet.add(java.lang.String.valueOf(71));
        }
        if (!((l41.b2) ((j41.y) i95.n0.c(j41.y.class))).wi()) {
            hashSet.add(java.lang.String.valueOf(74));
        }
        if (!((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n("gh_b4af18eac3d5", true).r2()) {
            hashSet.add(java.lang.String.valueOf(73));
        }
        if (!((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n("gh_e087bb5b95e6", true).r2()) {
            hashSet.add(java.lang.String.valueOf(76));
        }
        if (isTeenMode || ((ef0.y2) ((qk.o8) i95.n0.c(qk.o8.class))).bj()) {
            hashSet.add(java.lang.String.valueOf(79));
            hashSet.add(java.lang.String.valueOf(80));
            hashSet.add(java.lang.String.valueOf(28));
        }
        if (((ef0.y2) ((qk.o8) i95.n0.c(qk.o8.class))).Vi() || !((ef0.y2) ((qk.o8) i95.n0.c(qk.o8.class))).Bi()) {
            hashSet.add(java.lang.String.valueOf(18));
        }
        if (c01.z1.x()) {
            hashSet.add(java.lang.String.valueOf(27));
        }
        if (((bw.k) i95.n0.c(bw.k.class)) == null || !zv.q.f476079a.f()) {
            hashSet.add(java.lang.String.valueOf(88));
        }
        if (isTeenMode) {
            hashSet.add(java.lang.String.valueOf(78));
        }
        hashSet.add("1@fackuser");
        java.util.Iterator it = ((java.util.HashSet) ((vh0.f3) ((vh0.n1) i95.n0.c(vh0.n1.class))).Ri()).iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            if (!((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str, true).r2()) {
                hashSet.add(str);
            }
        }
        q(hashSet);
    }

    @Override // com.tencent.mm.plugin.fts.ui.f0
    public void g() {
        boolean z17 = this.f138155t;
        g23.k kVar = this.f138153r;
        if (!z17) {
            this.f138155t = true;
            if (!this.f138151J) {
                com.tencent.mm.plugin.fts.ui.x2.n(this.f138050g, false, s(), 0, kVar);
            }
        }
        if (!this.f138154s) {
            this.f138154s = true;
            kVar.L = z13.f.Y6(h()).b7();
            com.tencent.mm.plugin.fts.ui.x2.l(kVar);
            com.tencent.mm.plugin.fts.ui.x2.i(kVar);
        }
        kVar.e();
        super.g();
    }

    @Override // com.tencent.mm.plugin.fts.ui.f0
    public boolean k(android.view.View view, u13.g gVar, boolean z17) {
        java.util.Iterator it = this.f138152q.iterator();
        while (it.hasNext() && !(z17 = ((t13.k) it.next()).a(view, gVar, z17))) {
        }
        boolean z18 = this.f138155t;
        g23.k kVar = this.f138153r;
        if (!z18 && !(gVar instanceof e23.s0)) {
            com.tencent.mm.plugin.fts.ui.x2.n(this.f138050g, true, s(), 0, kVar);
            this.f138155t = true;
        }
        if (gVar.f423772o) {
            kVar.b(gVar);
            kVar.L = z13.f.Y6(h()).b7();
            com.tencent.mm.plugin.fts.ui.x2.f(gVar, kVar);
            return true;
        }
        if (gVar instanceof e23.x) {
            this.f138151J = true;
            kVar.b(gVar);
            kVar.L = z13.f.Y6(h()).b7();
            com.tencent.mm.plugin.fts.ui.x2.f(gVar, kVar);
        } else if (gVar instanceof e23.a0) {
            kVar.L = z13.f.Y6(h()).b7();
            com.tencent.mm.plugin.fts.ui.x2.f(gVar, kVar);
            kVar.b(gVar);
        }
        return false;
    }

    @Override // com.tencent.mm.plugin.fts.ui.f0
    public void m(android.content.Context context, u13.g gVar) {
        super.m(context, gVar);
        g23.k kVar = this.f138153r;
        kVar.getClass();
        int i17 = gVar.f423758a;
        if (i17 == -1 || i17 == 0 || i17 == 11) {
            return;
        }
        long c17 = c01.id.c();
        java.util.Iterator it = ((java.util.ArrayList) kVar.N).iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            p13.e eVar = (p13.e) it.next();
            if (eVar.f351074b == gVar.f423759b) {
                eVar.f351077e = c17 - kVar.f267937b;
                eVar.f351083k = c17;
                break;
            }
        }
        java.lang.String wi6 = ((w50.k) ((x50.j) i95.n0.c(x50.j.class))).wi(gVar);
        if (wi6 != "") {
            ((java.util.ArrayList) kVar.M).add(wi6);
        }
    }

    @Override // com.tencent.mm.plugin.fts.ui.f0, android.widget.AbsListView.OnScrollListener
    public void onScroll(android.widget.AbsListView absListView, int i17, int i18, int i19) {
        super.onScroll(absListView, i17, i18, i19);
        com.tencent.mm.plugin.fts.ui.FTSMainUI fTSMainUI = (com.tencent.mm.plugin.fts.ui.FTSMainUI) this.f138047d;
        fTSMainUI.getClass();
        int headerViewsCount = ((android.widget.ListView) absListView).getHeaderViewsCount();
        if (fTSMainUI.V1 == 1 && absListView.getLastVisiblePosition() >= fTSMainUI.L1.getCount() + headerViewsCount && fTSMainUI.L1.I && fTSMainUI.N1.getVisibility() == 0) {
            fTSMainUI.V1 = 2;
            g23.k kVar = fTSMainUI.L1.f138153r;
            kVar.getClass();
            long c17 = c01.id.c();
            java.util.Iterator it = ((java.util.ArrayList) kVar.N).iterator();
            while (it.hasNext()) {
                p13.e eVar = (p13.e) it.next();
                if ("SearchContactBar".equals(eVar.f351079g)) {
                    eVar.f351077e = c17 - kVar.f267937b;
                    eVar.f351083k = c17;
                }
            }
        }
        fTSMainUI.getStateCenter().B3(new fi0.g(fTSMainUI.b7(), o13.p.f342251d, absListView));
    }

    @Override // com.tencent.mm.plugin.fts.ui.f0, android.widget.AbsListView.OnScrollListener
    public void onScrollStateChanged(android.widget.AbsListView absListView, int i17) {
        super.onScrollStateChanged(absListView, i17);
        if (i17 == 2) {
            this.E = true;
            ((com.tencent.mm.plugin.fts.n) ((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).bj()).g();
            ((com.tencent.mm.plugin.sns.model.i1) p94.w0.d()).G();
        } else {
            this.E = false;
            if (((com.tencent.mm.plugin.fts.n) ((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).bj()).f137769c) {
                return;
            }
            com.tencent.mm.sdk.platformtools.n3 n3Var = this.F;
            n3Var.removeMessages(1);
            n3Var.sendEmptyMessageDelayed(1, 200L);
        }
    }

    @Override // com.tencent.mm.plugin.fts.ui.f0
    public void p() {
        this.F.removeMessages(1);
        super.p();
    }

    public final void q(java.util.HashSet hashSet) {
        int i17 = this.H + 1;
        this.H = i17;
        java.util.List list = this.f138152q;
        if (i17 < ((java.util.LinkedList) list).size()) {
            t13.k kVar = (t13.k) ((java.util.LinkedList) list).get(this.H);
            if (kVar.getType() == 32) {
                ((j23.i) kVar).f297273p = this.f138053m.f138086c;
            }
            kVar.f(this.f138050g, this.G, hashSet, o13.p.f342251d);
        }
    }

    public java.lang.String r(int i17) {
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            z13.f.Y6(h()).U6(jSONObject2);
            jSONObject.put("intention", this.f138153r.H ? 1 : 2);
            jSONObject.put("sectionpos", i17);
            jSONObject.put("uistyle", jSONObject2.optInt("uiStyle", 0));
            jSONObject.put("isfromvoice", jSONObject2.optInt("isFromVoice", 0));
            jSONObject.put("changeReason", jSONObject2.optInt("changeReason", 0));
            jSONObject.put("isaskrealpeople", jSONObject2.optInt("isAskRealPeople", 0));
            jSONObject.put("isdeepthink", jSONObject2.optInt("isDeepThink", 0));
            jSONObject.put("actiontype", jSONObject2.optInt("actionType", 0));
            return fp.s0.b(jSONObject.toString(), com.tencent.mapsdk.internal.rv.f51270c);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.FTS.FTSMainAdapter", e17, "", new java.lang.Object[0]);
            return "";
        }
    }

    public int s() {
        java.util.Iterator it = this.f138152q.iterator();
        int i17 = 0;
        while (it.hasNext()) {
            i17 += ((t13.k) it.next()).e();
        }
        return i17;
    }

    public void t(boolean z17, boolean z18) {
        if (h() instanceof com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity) {
            j75.f stateCenter = ((com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity) h()).getStateCenter();
            java.lang.String str = this.f138050g;
            g23.k kVar = this.f138153r;
            stateCenter.B3(new fi0.a(str, kVar.B, kVar.H, z17, z18, this.f138053m.f138084a));
        }
    }
}
