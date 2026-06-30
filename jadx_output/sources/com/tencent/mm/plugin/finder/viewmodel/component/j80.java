package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class j80 extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.feed.zu f134830d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.feed.yt f134831e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.feed.hv f134832f;

    /* renamed from: g, reason: collision with root package name */
    public final ey2.k0 f134833g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f134834h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f134835i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j80(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        androidx.lifecycle.c1 a17 = pf5.u.f353936a.e(c61.l7.class).a(ey2.k0.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        this.f134833g = (ey2.k0) a17;
        this.f134834h = true;
        this.f134835i = true;
    }

    public final void O6() {
        if (this.f134835i) {
            this.f134835i = false;
            com.tencent.mm.plugin.finder.feed.zu zuVar = this.f134830d;
            if (zuVar != null) {
                zuVar.c(100L, false);
            }
            com.tencent.mm.plugin.finder.feed.yt ytVar = this.f134831e;
            if (ytVar != null) {
                ytVar.c(100L, false);
            }
            ((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).qj(getActivity(), 5);
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public int getLayoutId() {
        return com.tencent.mm.R.layout.b_c;
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        com.tencent.mm.plugin.finder.feed.zu zuVar;
        androidx.recyclerview.widget.RecyclerView recyclerView;
        com.tencent.mm.protobuf.g gVar;
        if (i17 != 501 || i18 != -1 || intent == null || (zuVar = this.f134830d) == null || (recyclerView = zuVar.g().getRecyclerView()) == null) {
            return;
        }
        com.tencent.mm.plugin.finder.feed.model.r9 v17 = hc2.f1.v(recyclerView, intent, zuVar.f111297i, false, com.tencent.mm.plugin.finder.feed.xu.f111104d);
        gm0.j1.u().c().x(hc2.d0.c(2), com.tencent.mm.sdk.platformtools.t8.l((v17 == null || (gVar = v17.f108301b) == null) ? null : gVar.g()));
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        int intValue = ((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f127705g0).getValue()).r()).intValue();
        pf5.u uVar = pf5.u.f353936a;
        if (intValue == 1) {
            androidx.appcompat.app.AppCompatActivity activity = getActivity();
            kotlin.jvm.internal.o.e(activity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            com.tencent.mm.plugin.finder.feed.zu zuVar = new com.tencent.mm.plugin.finder.feed.zu((com.tencent.mm.ui.MMActivity) activity, (com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment) getFragment());
            this.f134830d = zuVar;
            androidx.appcompat.app.AppCompatActivity activity2 = getActivity();
            kotlin.jvm.internal.o.e(activity2, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            com.tencent.mm.plugin.finder.feed.hv hvVar = new com.tencent.mm.plugin.finder.feed.hv((com.tencent.mm.ui.MMActivity) activity2, zuVar, getRootView());
            zuVar.f111293e = hvVar;
            com.tencent.mm.plugin.finder.feed.ft g17 = zuVar.g();
            com.tencent.mm.plugin.finder.feed.model.FinderTimelineFeedLoader finderTimelineFeedLoader = zuVar.f111297i;
            g17.r(finderTimelineFeedLoader.getDataListJustForAdapter());
            com.tencent.mm.plugin.finder.feed.model.internal.Dispatcher.register$default(finderTimelineFeedLoader, zuVar.f111298m, false, 2, null);
            if (((ey2.k0) ((ya2.o1) uVar.e(zy2.b6.class).c(ya2.o1.class))).N6()) {
                zuVar.f111294f.N6(2).f257443c.size();
                com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader.requestInit$default(finderTimelineFeedLoader, false, 1, null);
                androidx.recyclerview.widget.RecyclerView recyclerView = zuVar.g().getRecyclerView();
                if (recyclerView != null) {
                    recyclerView.i(new com.tencent.mm.plugin.finder.feed.mu(zuVar));
                }
            } else {
                ym5.s3 s3Var = new ym5.s3(0);
                s3Var.f463517b = -2;
                pm0.v.X(new com.tencent.mm.plugin.finder.feed.hu(s3Var, zuVar));
            }
            this.f134832f = hvVar;
            return;
        }
        androidx.appcompat.app.AppCompatActivity activity3 = getActivity();
        kotlin.jvm.internal.o.e(activity3, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        com.tencent.mm.plugin.finder.feed.yt ytVar = new com.tencent.mm.plugin.finder.feed.yt((com.tencent.mm.ui.MMActivity) activity3, (com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment) getFragment());
        this.f134831e = ytVar;
        androidx.appcompat.app.AppCompatActivity activity4 = getActivity();
        kotlin.jvm.internal.o.e(activity4, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        com.tencent.mm.plugin.finder.feed.fu fuVar = new com.tencent.mm.plugin.finder.feed.fu((com.tencent.mm.ui.MMActivity) activity4, ytVar, getRootView());
        ytVar.f111203m = c01.id.c();
        ytVar.f111199f = fuVar;
        com.tencent.mm.ui.MMActivity activity5 = ytVar.f111197d;
        kotlin.jvm.internal.o.g(activity5, "activity");
        com.tencent.mm.plugin.finder.feed.model.FinderLbsLoader finderLbsLoader = new com.tencent.mm.plugin.finder.feed.model.FinderLbsLoader(((com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(activity5).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6());
        finderLbsLoader.setInitDone(new com.tencent.mm.plugin.finder.feed.kt(finderLbsLoader, ytVar));
        finderLbsLoader.f107467d = new com.tencent.mm.plugin.finder.feed.lt(ytVar);
        ytVar.f111198e = finderLbsLoader;
        ytVar.h().r(ytVar.g().getDataListJustForAdapter());
        com.tencent.mm.plugin.finder.feed.model.internal.Dispatcher.register$default(ytVar.g(), ytVar.f111207q, false, 2, null);
        if (((ey2.k0) ((ya2.o1) uVar.e(zy2.b6.class).c(ya2.o1.class))).N6()) {
            ytVar.f111200g.N6(1000).f257444d.size();
            ytVar.g().requestInit(false);
            androidx.recyclerview.widget.RecyclerView recyclerView2 = ytVar.h().getRecyclerView();
            if (recyclerView2 != null) {
                recyclerView2.i(new com.tencent.mm.plugin.finder.feed.mt(ytVar));
            }
        } else {
            ym5.s3 s3Var2 = new ym5.s3(0);
            s3Var2.f463517b = -2;
            pm0.v.X(new com.tencent.mm.plugin.finder.feed.ht(s3Var2, ytVar));
        }
        androidx.recyclerview.widget.RecyclerView recyclerView3 = ytVar.h().getRecyclerView();
        if (recyclerView3 != null) {
            in5.o.b(recyclerView3, new com.tencent.mm.plugin.finder.feed.nt(ytVar), com.tencent.mm.plugin.finder.feed.ot.f108679d);
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        i95.m c17 = i95.n0.c(zy2.zb.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        zy2.zb zbVar = (zy2.zb) c17;
        ml2.x1 x1Var = ml2.x1.f328201e;
        ml2.q1 q1Var = ml2.q1.f327812e;
        zy2.zb.Kh(zbVar, null, x1Var, "temp_10", ml2.y.f328244i, 0, 0L, 0, 112, null);
        com.tencent.mm.plugin.finder.feed.zu zuVar = this.f134830d;
        if (zuVar != null) {
            zuVar.onDetach();
        }
        com.tencent.mm.plugin.finder.feed.yt ytVar = this.f134831e;
        if (ytVar != null) {
            ytVar.onDetach();
        }
        com.tencent.mm.plugin.finder.report.v1 v1Var = com.tencent.mm.plugin.finder.report.v1.f125393a;
        androidx.appcompat.app.AppCompatActivity context = getActivity();
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
        v1Var.x(2, nyVar != null ? nyVar.V6() : null);
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onFinished() {
        androidx.recyclerview.widget.RecyclerView recyclerView;
        androidx.recyclerview.widget.RecyclerView recyclerView2;
        super.onFinished();
        com.tencent.mm.plugin.finder.feed.zu zuVar = this.f134830d;
        if (zuVar != null && (recyclerView2 = zuVar.g().getRecyclerView()) != null) {
            com.tencent.mars.xlog.Log.i("Finder.TimelineLbsPresenter", "[onFinishing] position=" + zuVar.f(recyclerView2) + " totalDy=" + zuVar.f111296h);
            com.tencent.mm.plugin.finder.feed.model.FinderTimelineFeedLoader finderTimelineFeedLoader = zuVar.f111297i;
            java.util.Iterator it = finderTimelineFeedLoader.getDataListJustForAdapter().iterator();
            while (it.hasNext()) {
                so2.j5 j5Var = (so2.j5) it.next();
                if (j5Var instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed) {
                    ((com.tencent.mm.plugin.finder.model.BaseFinderFeed) j5Var).T0();
                }
            }
            ey2.t0.V6(zuVar.f111294f, "Finder.TimelineLbsPresenter", 2, 0, zuVar.f111296h, finderTimelineFeedLoader.getDataListJustForAdapter(), null, null, false, false, 480, null);
        }
        com.tencent.mm.plugin.finder.feed.yt ytVar = this.f134831e;
        if (ytVar == null || (recyclerView = ytVar.h().getRecyclerView()) == null) {
            return;
        }
        int f17 = ytVar.f(recyclerView);
        com.tencent.mars.xlog.Log.i("Finder.FinderTimelineLbsMixPresenter", "[onFinishing] position=" + f17 + " totalDy=" + ytVar.f111202i);
        ey2.t0.V6(ytVar.f111200g, "Finder.FinderTimelineLbsMixPresenter", 1000, f17, ytVar.f111202i, new java.util.ArrayList(0), ytVar.g().getDataListJustForAdapter(), null, false, false, com.tencent.wcdb.FileUtils.S_IRWXU, null);
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onPause() {
        super.onPause();
        this.f134834h = this.f134833g.N6();
        i95.m c17 = i95.n0.c(zy2.zb.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        zy2.zb zbVar = (zy2.zb) c17;
        com.tencent.mm.plugin.finder.feed.hv hvVar = this.f134832f;
        androidx.recyclerview.widget.RecyclerView recyclerView = hvVar != null ? hvVar.getRecyclerView() : null;
        ml2.x1 x1Var = ml2.x1.f328201e;
        ml2.q1 q1Var = ml2.q1.f327812e;
        zy2.zb.Kh(zbVar, recyclerView, x1Var, "temp_10", ml2.y.f328241f, 0, 0L, 0, 112, null);
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onRequestPermissionsResult(int i17, java.lang.String[] permissions, int[] grantResults) {
        kotlin.jvm.internal.o.g(permissions, "permissions");
        kotlin.jvm.internal.o.g(grantResults, "grantResults");
        if (i17 == 79) {
            if (grantResults[0] == 0) {
                O6();
            } else {
                ((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).qj(getActivity(), 3);
            }
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onResume() {
        if (!this.f134834h && this.f134833g.N6()) {
            O6();
        }
        com.tencent.mm.plugin.finder.report.v1.f125393a.s(2);
        i95.m c17 = i95.n0.c(zy2.zb.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        zy2.zb zbVar = (zy2.zb) c17;
        com.tencent.mm.plugin.finder.feed.hv hvVar = this.f134832f;
        androidx.recyclerview.widget.RecyclerView recyclerView = hvVar != null ? hvVar.getRecyclerView() : null;
        ml2.x1 x1Var = ml2.x1.f328201e;
        ml2.q1 q1Var = ml2.q1.f327812e;
        zy2.zb.Kh(zbVar, recyclerView, x1Var, "temp_10", ml2.y.f328240e, 0, 0L, 0, 112, null);
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onUserVisibleFocused() {
        super.onUserVisibleFocused();
        pf5.u uVar = pf5.u.f353936a;
        ((ey2.t0) uVar.e(c61.l7.class).a(ey2.t0.class)).getClass();
        com.tencent.mm.plugin.finder.feed.zu zuVar = this.f134830d;
        if (zuVar != null) {
            pm0.v.K(null, new com.tencent.mm.plugin.finder.feed.wu(zuVar));
            if (zuVar.f111300o) {
                ((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).qj(zuVar.f111292d, 1);
            }
        }
        com.tencent.mm.plugin.finder.feed.yt ytVar = this.f134831e;
        if (ytVar != null) {
            if (ytVar.f111205o) {
                ((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).qj(ytVar.f111197d, 1);
            }
            ((c61.l7) i95.n0.c(c61.l7.class)).nk().N("finder_tl_nearby_tab");
            ((c61.l7) i95.n0.c(c61.l7.class)).nk().q0("finder_tl_nearby_tab", "onRefreshEnd");
        }
        ((com.tencent.mm.plugin.finder.viewmodel.component.FinderVideoRecycler) uVar.e(c61.l7.class).a(com.tencent.mm.plugin.finder.viewmodel.component.FinderVideoRecycler.class)).a7(com.tencent.mm.plugin.finder.viewmodel.component.i80.f134720d);
        ya2.o1.t4(this.f134833g, false, null, 2, null);
        if (((c61.l7) i95.n0.c(c61.l7.class)).nk().h0(2)) {
            com.tencent.mars.xlog.Log.i("Finder.TimelineLbsUIC", "[onUserVisibleFocused] tabType=2 autoFlingToRefresh");
            com.tencent.mm.plugin.finder.feed.zu zuVar2 = this.f134830d;
            if (zuVar2 != null) {
                zuVar2.c(0L, false);
            }
            com.tencent.mm.plugin.finder.feed.yt ytVar2 = this.f134831e;
            if (ytVar2 != null) {
                ytVar2.c(0L, false);
            }
            if (((java.lang.Number) com.tencent.mm.plugin.finder.storage.t70.f127590a.Q0().r()).intValue() == 1) {
                androidx.appcompat.app.AppCompatActivity context = getActivity();
                kotlin.jvm.internal.o.g(context, "context");
                com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
                if (nyVar != null) {
                    i95.m c17 = i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
                    kotlin.jvm.internal.o.f(c17, "getService(...)");
                    ((com.tencent.mm.plugin.finder.report.o3) c17).aj(nyVar.V6(), 6, 0);
                }
            }
        }
        ((c61.l7) i95.n0.c(c61.l7.class)).nk().N("finder_tl_nearby_tab");
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onUserVisibleUnFocused() {
        super.onUserVisibleUnFocused();
        ((ey2.t0) pf5.u.f353936a.e(c61.l7.class).a(ey2.t0.class)).T6(2);
    }
}
