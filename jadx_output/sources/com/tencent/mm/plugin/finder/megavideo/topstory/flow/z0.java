package com.tencent.mm.plugin.finder.megavideo.topstory.flow;

/* loaded from: classes2.dex */
public final class z0 implements com.tencent.mm.plugin.finder.megavideo.topstory.flow.j {

    /* renamed from: a, reason: collision with root package name */
    public final android.app.Activity f121037a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f121038b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f121039c;

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f121040d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f121041e;

    /* renamed from: f, reason: collision with root package name */
    public long f121042f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.megavideo.topstory.flow.i f121043g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f121044h;

    /* renamed from: i, reason: collision with root package name */
    public int f121045i;

    public z0(android.app.Activity activity, java.lang.String finderContextId) {
        kotlin.jvm.internal.o.g(activity, "activity");
        kotlin.jvm.internal.o.g(finderContextId, "finderContextId");
        this.f121037a = activity;
        this.f121038b = finderContextId;
        this.f121039c = "Finder.MegaVideo.MegaVideoNativeStrategy";
        this.f121040d = jz5.h.b(new com.tencent.mm.plugin.finder.megavideo.topstory.flow.x0(this));
        jz5.g b17 = jz5.h.b(new com.tencent.mm.plugin.finder.megavideo.topstory.flow.y0(this));
        this.f121041e = b17;
        this.f121043g = com.tencent.mm.plugin.finder.megavideo.topstory.flow.i.f120929e;
        xn2.p0 f17 = f();
        xn2.f1 callback = (xn2.f1) ((jz5.n) b17).getValue();
        f17.getClass();
        kotlin.jvm.internal.o.g(callback, "callback");
        vn2.u0 u0Var = vn2.u0.f438387a;
        u0Var.m(f17.f455545c, "onAttach callback=" + callback.hashCode());
        pf5.u uVar = pf5.u.f353936a;
        android.app.Activity activity2 = f17.f455543a;
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = (com.tencent.mm.plugin.finder.viewmodel.component.ny) uVar.b(activity2).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
        java.lang.String e17 = xy2.c.e(activity2);
        nyVar.getClass();
        kotlin.jvm.internal.o.g(e17, "<set-?>");
        nyVar.F = e17;
        f17.f455547e = callback;
        androidx.recyclerview.widget.RecyclerView recyclerView = callback.getRecyclerView();
        recyclerView.i(new xn2.u(f17));
        recyclerView.setLayoutManager(new com.tencent.mm.plugin.finder.megavideo.topstory.flow.LinearLayoutManagerWrapper(activity2));
        com.tencent.mm.plugin.finder.megavideo.topstory.flow.k kVar = new com.tencent.mm.plugin.finder.megavideo.topstory.flow.k(f17.j().getDataListJustForAdapter(), false, f17);
        kVar.f293105o = new xn2.v(f17, recyclerView);
        recyclerView.setAdapter(kVar);
        androidx.lifecycle.c1 a17 = uVar.b(activity2).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        fc2.o Z6 = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) a17).Z6(-1);
        if (Z6 != null) {
            Z6.d(recyclerView);
        }
        ym5.a1.g(recyclerView, new xn2.w(f17, recyclerView));
        boolean z17 = u0Var.g() && !u0Var.h();
        cw2.f8 f8Var = f17.f455550h;
        f8Var.f223713x = z17;
        androidx.appcompat.app.AppCompatActivity appCompatActivity = (androidx.appcompat.app.AppCompatActivity) activity2;
        cw2.f8.L0(f8Var, appCompatActivity, null, new xn2.y(f17), false, 8, null);
        com.tencent.mm.plugin.finder.feed.model.internal.Dispatcher.register$default(f17.j(), callback.a(), false, 2, null);
        f17.j().f120887g = new xn2.w0(callback);
        f17.j().f120888h = new xn2.a0(f17);
        fc2.c Y6 = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) uVar.c(appCompatActivity).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).Y6(9);
        if (Y6 != null) {
            Y6.a(new xn2.b0(f17));
        }
        f17.f455556n.alive();
        f17.f455559q.alive();
        f17.f455557o.alive();
        f17.f455568z.alive();
    }

    @Override // com.tencent.mm.plugin.finder.megavideo.topstory.flow.j
    public void a(com.tencent.mm.plugin.finder.megavideo.topstory.flow.i targetPage) {
        kotlin.jvm.internal.o.g(targetPage, "targetPage");
        this.f121043g = targetPage;
    }

    @Override // com.tencent.mm.plugin.finder.megavideo.topstory.flow.j
    public void b(com.tencent.mm.plugin.finder.extension.reddot.a baseRedDotResult) {
        kotlin.jvm.internal.o.g(baseRedDotResult, "baseRedDotResult");
    }

    @Override // com.tencent.mm.plugin.finder.megavideo.topstory.flow.j
    public void c() {
        this.f121044h = false;
        ((xn2.f1) ((jz5.n) this.f121041e).getValue()).l(false);
        xn2.p0 f17 = f();
        f17.f455553k = false;
        f17.E.clear();
        f17.D.clear();
        f17.k().d();
        cw2.f8 f8Var = f17.f455550h;
        f8Var.getClass();
        android.app.Activity context = f17.f455543a;
        kotlin.jvm.internal.o.g(context, "context");
        ((com.tencent.mm.plugin.finder.viewmodel.component.FinderVideoRecycler) f8Var.f223700h).c7(context);
        f17.d();
        if (!f17.i()) {
            com.tencent.mars.xlog.Log.i(f17.f455545c, "mega_verify stop");
            kotlinx.coroutines.r2 r2Var = f17.f455560r;
            if (r2Var != null) {
                kotlinx.coroutines.p2.a(r2Var, null, 1, null);
            }
            f17.f455560r = null;
        }
        com.tencent.mars.xlog.Log.i(this.f121039c, "MegaVideoReportTrace page_out unselect");
        long currentTimeMillis = this.f121042f > 0 ? java.lang.System.currentTimeMillis() - this.f121042f : -1L;
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        jz5.l lVar = new jz5.l("page_name", "TopStoryFinderLongVideoListPage");
        iy1.c cVar = iy1.c.MainUI;
        ((cy1.a) rVar).yj("page_out", null, kz5.c1.k(lVar, new jz5.l("page_id", 50030), new jz5.l("finder_context_id", this.f121038b), new jz5.l("comment_scene", 281), new jz5.l("finder_username", ((k40.f) ((l40.e) i95.n0.c(l40.e.class))).Ui(this.f121037a)), new jz5.l("page_out_type", 1), new jz5.l("stay_time", java.lang.Long.valueOf(currentTimeMillis))), 1, false);
    }

    @Override // com.tencent.mm.plugin.finder.megavideo.topstory.flow.j
    public void d(int i17, int i18, java.lang.String reportFeedId, r45.vs2 vs2Var) {
        com.tencent.mm.plugin.finder.extension.reddot.jb jbVar;
        int i19;
        java.lang.String str;
        kotlin.jvm.internal.o.g(reportFeedId, "reportFeedId");
        this.f121044h = true;
        this.f121043g = com.tencent.mm.plugin.finder.megavideo.topstory.flow.i.f120929e;
        this.f121045i = i17;
        ((xn2.f1) ((jz5.n) this.f121041e).getValue()).l(true);
        xn2.p0 f17 = f();
        java.util.ArrayList dataListJustForAdapter = f17.j().getDataListJustForAdapter();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = dataListJustForAdapter.iterator();
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            if (next instanceof zn2.a) {
                arrayList.add(next);
            }
        }
        boolean z17 = !arrayList.isEmpty();
        java.lang.String str2 = f17.f455545c;
        if (z17) {
            com.tencent.mars.xlog.Log.i(str2, "requestInit but data cache exist!");
        } else {
            if (vs2Var != null) {
                jbVar = new com.tencent.mm.plugin.finder.extension.reddot.jb();
                jbVar.t0(vs2Var);
            } else {
                jbVar = null;
            }
            if (!(((jbVar != null ? jbVar.field_tipsId : null) == null || jbVar.field_tips_uuid == null || jbVar.N.getLong(3) == 0) ? false : true)) {
                jbVar = null;
            }
            vn2.u0.f438387a.m(str2, "source1 requestInit, reddot=" + jbVar);
            ey2.g1 g1Var = (ey2.g1) pf5.u.f353936a.e(c61.l7.class).a(ey2.g1.class);
            r45.qt2 reportContextObj = f17.l();
            g1Var.getClass();
            kotlin.jvm.internal.o.g(reportContextObj, "reportContextObj");
            f17.j().f(jbVar);
            com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader.requestInit$default(f17.j(), false, 1, null);
        }
        xn2.p0 f18 = f();
        f18.getClass();
        f18.f455553k = true;
        int i27 = i18 == 0 ? 2 : 1;
        ao2.a k17 = f18.k();
        long longValue = ((java.lang.Number) ((jz5.n) f18.f455546d).getValue()).longValue();
        iy1.c cVar = iy1.c.MainUI;
        long j17 = 50030;
        int i28 = f18.j().f120895r;
        k17.getClass();
        java.lang.String sessionKey = f18.f455544b;
        kotlin.jvm.internal.o.g(sessionKey, "sessionKey");
        if (k17.f12535d) {
            i19 = 1;
        } else {
            k17.f12535d = true;
            k17.f12540i = i27;
            k17.f12533b = i28;
            k17.f12541j = java.lang.System.currentTimeMillis();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("MegaVideo-Trace onEnterPage, enterType:");
            sb6.append(i27);
            sb6.append(" hitCache:");
            sb6.append(k17.f12533b);
            sb6.append(", sessionId:");
            long j18 = k17.f12532a;
            sb6.append(j18);
            com.tencent.mars.xlog.Log.i("MicroMsg.MegaVideoPerformanceMonitor", sb6.toString());
            com.tencent.mm.plugin.report.service.g0.INSTANCE.E(31240, 1, java.lang.Integer.valueOf(k17.f12533b), 0, 0, java.lang.Long.valueOf(j18), java.lang.Integer.valueOf(i27));
            i19 = 1;
        }
        k17.b(sessionKey, longValue, j17, 1, i27, i19 == i28);
        f18.k().e();
        cw2.f8 f8Var = f18.f455550h;
        f8Var.getClass();
        android.app.Activity context = f18.f455543a;
        kotlin.jvm.internal.o.g(context, "context");
        f8Var.Z();
        ((com.tencent.mm.plugin.finder.viewmodel.component.FinderVideoRecycler) f8Var.f223700h).f7(context);
        f18.g();
        if (f18.f455553k) {
            kotlinx.coroutines.l.d(f18.f455555m, null, null, new xn2.o0(null), 3, null);
        }
        f18.p();
        com.tencent.mars.xlog.Log.i(this.f121039c, "MegaVideoReportTrace page_in select");
        this.f121042f = java.lang.System.currentTimeMillis();
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        jz5.l[] lVarArr = new jz5.l[9];
        lVarArr[0] = new jz5.l("page_name", "TopStoryFinderLongVideoListPage");
        lVarArr[1] = new jz5.l("page_id", 50030);
        lVarArr[2] = new jz5.l("finder_context_id", this.f121038b);
        lVarArr[3] = new jz5.l("comment_scene", 281);
        lVarArr[4] = new jz5.l("finder_username", ((k40.f) ((l40.e) i95.n0.c(l40.e.class))).Ui(this.f121037a));
        lVarArr[5] = new jz5.l("page_enter_type", java.lang.Integer.valueOf(i17));
        if (vs2Var == null || (str = vs2Var.f388490h) == null) {
            str = "";
        }
        lVarArr[6] = new jz5.l("tipsid", str);
        lVarArr[7] = new jz5.l("from_tab_type", java.lang.Integer.valueOf(i18));
        lVarArr[8] = new jz5.l("source_feedid", reportFeedId);
        ((cy1.a) rVar).yj("page_in", null, kz5.c1.k(lVarArr), 1, false);
    }

    @Override // com.tencent.mm.plugin.finder.megavideo.topstory.flow.j
    public boolean e(boolean z17) {
        java.lang.Object obj;
        dw2.c0 c0Var;
        gp1.v Bi;
        xn2.p0 f17 = f();
        f17.getClass();
        long F0 = kd2.p1.N.a().F0();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onResume fromCreate=");
        sb6.append(z17);
        sb6.append(" autoPlayMode=");
        vn2.u0 u0Var = vn2.u0.f438387a;
        sb6.append(vn2.u0.f438389c);
        sb6.append(", floatballFeedId=");
        sb6.append(pm0.v.u(F0));
        java.lang.String sb7 = sb6.toString();
        java.lang.String str = f17.f455545c;
        com.tencent.mars.xlog.Log.i(str, sb7);
        if (u0Var.g()) {
            cw2.f8 f8Var = f17.f455550h;
            if (F0 != 0) {
                gp1.a0 a0Var = f17.A;
                if (a0Var == null) {
                    a0Var = new xn2.d0(f17);
                }
                f17.A = a0Var;
                gp1.v Bi2 = ((ov.i0) ((pv.d0) i95.n0.c(pv.d0.class))).Bi();
                if (Bi2 != null) {
                    Bi2.a0(32, f17.A);
                }
                f8Var.f223712w = false;
            } else {
                f8Var.f223712w = true;
                gp1.a0 a0Var2 = f17.A;
                if (a0Var2 != null && (Bi = ((ov.i0) ((pv.d0) i95.n0.c(pv.d0.class))).Bi()) != null) {
                    Bi.L(32, a0Var2);
                }
                xn2.b bVar = f17.f455547e;
                if (bVar != null) {
                    android.view.View h17 = ((xn2.f1) bVar).h();
                    kotlin.jvm.internal.o.f(h17, "<get-root>(...)");
                    h17.post(xn2.e0.f455488d);
                }
                if (!z17 && (c0Var = f8Var.f223703n) != null) {
                    c0Var.w0(str + "_resume");
                }
            }
        }
        if (!z17) {
            java.util.Iterator it = f17.j().getDataListJustForAdapter().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((so2.j5) obj) instanceof zn2.c) {
                    break;
                }
            }
            so2.j5 j5Var = (so2.j5) obj;
            java.lang.Long valueOf = j5Var != null ? java.lang.Long.valueOf(j5Var.getItemId()) : null;
            xn2.b bVar2 = f17.f455547e;
            androidx.recyclerview.widget.f2 adapter = bVar2 != null ? ((xn2.f1) bVar2).getRecyclerView().getAdapter() : null;
            com.tencent.mm.plugin.finder.megavideo.topstory.flow.k kVar = adapter instanceof com.tencent.mm.plugin.finder.megavideo.topstory.flow.k ? (com.tencent.mm.plugin.finder.megavideo.topstory.flow.k) adapter : null;
            in5.s0 s0Var = kVar != null ? (in5.s0) in5.n0.Y(kVar, valueOf != null ? valueOf.longValue() : -1L, false, 2, null) : null;
            so2.j5 j5Var2 = s0Var != null ? (so2.j5) s0Var.f293125i : null;
            com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = j5Var2 instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed ? (com.tencent.mm.plugin.finder.model.BaseFinderFeed) j5Var2 : null;
            if (s0Var != null && baseFinderFeed != null) {
                yn2.r.f464007f.a(s0Var, baseFinderFeed, false);
            }
            java.util.LinkedList linkedList = new java.util.LinkedList();
            ey2.g1 g1Var = (ey2.g1) pf5.u.f353936a.e(c61.l7.class).a(ey2.g1.class);
            java.util.List N6 = g1Var.N6();
            kotlin.jvm.internal.o.f(N6, "<get-seeLaterFeedList>(...)");
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(N6, 10));
            java.util.Iterator it6 = N6.iterator();
            while (it6.hasNext()) {
                arrayList.add((com.tencent.mm.plugin.finder.model.BaseFinderFeed) it6.next());
            }
            g1Var.N6().clear();
            com.tencent.mars.xlog.Log.i("Finder.LongVideoVM", "removeSeeLaterList size=" + arrayList.size() + ",map size=" + g1Var.N6().size());
            java.util.Iterator it7 = arrayList.iterator();
            while (it7.hasNext()) {
                so2.j5 j5Var3 = (so2.j5) it7.next();
                if (j5Var3 instanceof bo2.c) {
                    linkedList.add(j5Var3);
                } else if (j5Var3 instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed) {
                    linkedList.add((bo2.c) cu2.u.f222441a.o(((com.tencent.mm.plugin.finder.model.BaseFinderFeed) j5Var3).getFeedObject(), 11003));
                }
            }
            if (!linkedList.isEmpty()) {
                java.util.List V0 = kz5.n0.V0(f17.j().c().c());
                java.util.ArrayList arrayList2 = (java.util.ArrayList) V0;
                if (arrayList2.isEmpty()) {
                    f17.j().i(linkedList, linkedList);
                } else {
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    for (java.lang.Object obj2 : linkedList) {
                        bo2.c cVar = (bo2.c) obj2;
                        java.util.Iterator it8 = arrayList2.iterator();
                        int i17 = 0;
                        while (true) {
                            if (!it8.hasNext()) {
                                i17 = -1;
                                break;
                            }
                            if (((bo2.c) it8.next()).getItemId() == cVar.getItemId()) {
                                break;
                            }
                            i17++;
                        }
                        if (i17 == -1) {
                            arrayList3.add(obj2);
                        }
                    }
                    if (!arrayList3.isEmpty()) {
                        arrayList2.addAll(0, arrayList3);
                        f17.j().i(V0, arrayList3);
                    }
                }
            }
        }
        f17.k().e();
        if (f17.f455553k) {
            kotlinx.coroutines.l.d(f17.f455555m, null, null, new xn2.o0(null), 3, null);
        }
        if (!z17 && this.f121044h) {
            com.tencent.mars.xlog.Log.i(this.f121039c, "MegaVideoReportTrace page_in onResume");
            this.f121042f = java.lang.System.currentTimeMillis();
            dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
            jz5.l[] lVarArr = new jz5.l[7];
            lVarArr[0] = new jz5.l("page_name", "TopStoryFinderLongVideoListPage");
            iy1.c cVar2 = iy1.c.MainUI;
            lVarArr[1] = new jz5.l("page_id", 50030);
            lVarArr[2] = new jz5.l("finder_context_id", this.f121038b);
            lVarArr[3] = new jz5.l("comment_scene", 281);
            lVarArr[4] = new jz5.l("finder_username", ((k40.f) ((l40.e) i95.n0.c(l40.e.class))).Ui(this.f121037a));
            lVarArr[5] = new jz5.l("page_enter_type", java.lang.Integer.valueOf(this.f121045i));
            com.tencent.mm.plugin.finder.megavideo.topstory.flow.i iVar = this.f121043g;
            lVarArr[6] = new jz5.l("page_in_type", java.lang.Integer.valueOf(iVar == com.tencent.mm.plugin.finder.megavideo.topstory.flow.i.f120929e ? 1 : iVar.f120934d));
            ((cy1.a) rVar).yj("page_in", null, kz5.c1.k(lVarArr), 1, false);
            xn2.p0 f18 = f();
            f18.g();
            f18.p();
        }
        com.tencent.mm.plugin.finder.megavideo.topstory.flow.i iVar2 = this.f121043g;
        iVar2.getClass();
        boolean z18 = !(iVar2 == com.tencent.mm.plugin.finder.megavideo.topstory.flow.i.f120930f || iVar2 == com.tencent.mm.plugin.finder.megavideo.topstory.flow.i.f120931g || iVar2 == com.tencent.mm.plugin.finder.megavideo.topstory.flow.i.f120932h);
        this.f121043g = com.tencent.mm.plugin.finder.megavideo.topstory.flow.i.f120929e;
        return z18;
    }

    public final xn2.p0 f() {
        return (xn2.p0) this.f121040d.getValue();
    }

    @Override // com.tencent.mm.plugin.finder.megavideo.topstory.flow.j
    public void onCreate(android.os.Bundle bundle) {
    }

    @Override // com.tencent.mm.plugin.finder.megavideo.topstory.flow.j
    public void onDestroy() {
        xn2.p0 f17 = f();
        f17.getClass();
        vn2.u0 u0Var = vn2.u0.f438387a;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onDetach callback=");
        xn2.b bVar = f17.f455547e;
        sb6.append(bVar != null ? bVar.hashCode() : 0);
        u0Var.m(f17.f455545c, sb6.toString());
        f17.k().d();
        f17.f455556n.dead();
        f17.f455559q.dead();
        f17.f455557o.dead();
        f17.f455568z.dead();
        f17.d();
        ((ey2.g1) pf5.u.f353936a.e(c61.l7.class).a(ey2.g1.class)).getClass();
        xn2.b bVar2 = f17.f455547e;
        if (bVar2 != null) {
            f17.j().unregister(((xn2.f1) bVar2).a());
        }
        f17.f455547e = null;
        f17.A = null;
    }

    @Override // com.tencent.mm.plugin.finder.megavideo.topstory.flow.j
    public boolean onPause() {
        ((xn2.f1) ((jz5.n) this.f121041e).getValue()).l(false);
        if (this.f121044h) {
            com.tencent.mars.xlog.Log.i(this.f121039c, "MegaVideoReportTrace page_out onPause");
            long currentTimeMillis = this.f121042f > 0 ? java.lang.System.currentTimeMillis() - this.f121042f : -1L;
            dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
            jz5.l lVar = new jz5.l("page_name", "TopStoryFinderLongVideoListPage");
            iy1.c cVar = iy1.c.MainUI;
            ((cy1.a) rVar).yj("page_out", null, kz5.c1.k(lVar, new jz5.l("page_id", 50030), new jz5.l("finder_context_id", this.f121038b), new jz5.l("comment_scene", 281), new jz5.l("finder_username", ((k40.f) ((l40.e) i95.n0.c(l40.e.class))).Ui(this.f121037a)), new jz5.l("page_out_type", 2), new jz5.l("stay_time", java.lang.Long.valueOf(currentTimeMillis))), 1, false);
            xn2.p0 f17 = f();
            f17.E.clear();
            f17.D.clear();
            ao2.a k17 = f17.k();
            synchronized (k17) {
                if (k17.f12543l != null) {
                    if (!k17.f12545n) {
                        k17.f12545n = true;
                        k17.a(3);
                    }
                }
            }
            if (!f17.i()) {
                com.tencent.mars.xlog.Log.i(f17.f455545c, "mega_verify stop");
                kotlinx.coroutines.r2 r2Var = f17.f455560r;
                if (r2Var != null) {
                    kotlinx.coroutines.p2.a(r2Var, null, 1, null);
                }
                f17.f455560r = null;
            }
        }
        com.tencent.mm.plugin.finder.megavideo.topstory.flow.i iVar = this.f121043g;
        iVar.getClass();
        return !(iVar == com.tencent.mm.plugin.finder.megavideo.topstory.flow.i.f120930f || iVar == com.tencent.mm.plugin.finder.megavideo.topstory.flow.i.f120931g || iVar == com.tencent.mm.plugin.finder.megavideo.topstory.flow.i.f120932h);
    }

    @Override // com.tencent.mm.plugin.finder.megavideo.topstory.flow.j
    public void onStart() {
    }

    @Override // com.tencent.mm.plugin.finder.megavideo.topstory.flow.j
    public void onStop() {
        gp1.v Bi;
        xn2.p0 f17 = f();
        f17.f455550h.f223712w = true;
        gp1.a0 a0Var = f17.A;
        if (a0Var == null || (Bi = ((ov.i0) ((pv.d0) i95.n0.c(pv.d0.class))).Bi()) == null) {
            return;
        }
        Bi.L(32, a0Var);
    }
}
