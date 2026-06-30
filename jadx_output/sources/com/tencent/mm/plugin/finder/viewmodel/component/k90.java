package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class k90 extends com.tencent.mm.ui.component.UIComponent implements ya2.x1 {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f134937d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.feed.oa f134938e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.feed.xa f134939f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k90(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f134937d = jz5.h.b(new com.tencent.mm.plugin.finder.viewmodel.component.j90(this));
    }

    public final int O6() {
        return ((java.lang.Number) this.f134937d.getValue()).intValue();
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public int getLayoutId() {
        return com.tencent.mm.R.layout.b_a;
    }

    @Override // ya2.x1
    public void j7(r45.hx0 cmdItem, int i17, int i18) {
        kotlin.jvm.internal.o.g(cmdItem, "cmdItem");
        cmdItem.getInteger(0);
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        androidx.recyclerview.widget.RecyclerView recyclerView;
        if (i17 == 10001 && i18 == -1 && intent != null) {
            com.tencent.mm.plugin.finder.feed.oa oaVar = this.f134938e;
            if (oaVar == null) {
                kotlin.jvm.internal.o.o("presenter");
                throw null;
            }
            com.tencent.mm.plugin.finder.feed.a1 a1Var = oaVar.f107157f;
            if (a1Var == null || (recyclerView = a1Var.getRecyclerView()) == null) {
                return;
            }
            hc2.f1.v(recyclerView, intent, oaVar.f107156e, true, null);
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public boolean onBackPressed() {
        if (isBelongFragment()) {
            if (this.f134938e != null) {
                return false;
            }
            kotlin.jvm.internal.o.o("presenter");
            throw null;
        }
        if (this.f134938e != null) {
            getActivity().finish();
            return true;
        }
        kotlin.jvm.internal.o.o("presenter");
        throw null;
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onBeforeFinish(android.content.Intent intent) {
        android.view.View view;
        com.tencent.mm.plugin.finder.feed.oa oaVar = this.f134938e;
        if (oaVar == null) {
            kotlin.jvm.internal.o.o("presenter");
            throw null;
        }
        com.tencent.mm.plugin.finder.feed.a1 a1Var = oaVar.f107157f;
        if (a1Var != null) {
            androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = a1Var.getRecyclerView().getLayoutManager();
            kotlin.jvm.internal.o.e(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.StaggeredGridLayoutManager");
            int[] u17 = ((androidx.recyclerview.widget.StaggeredGridLayoutManager) layoutManager).u(null);
            int i17 = 0;
            int a07 = u17[0] - a1Var.o().a0();
            androidx.recyclerview.widget.k3 q07 = a1Var.getRecyclerView().q0(u17[0], false);
            if (q07 != null && (view = q07.itemView) != null) {
                i17 = view.getTop();
            }
            int i18 = i17;
            com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader baseFeedLoader = oaVar.f107156e;
            java.util.Iterator it = baseFeedLoader.getDataListJustForAdapter().iterator();
            while (it.hasNext()) {
                so2.j5 j5Var = (so2.j5) it.next();
                if (j5Var instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed) {
                    ((com.tencent.mm.plugin.finder.model.BaseFinderFeed) j5Var).T0();
                }
            }
            androidx.lifecycle.c1 a17 = pf5.u.f353936a.e(c61.l7.class).a(ey2.t0.class);
            kotlin.jvm.internal.o.f(a17, "get(...)");
            ey2.t0.V6((ey2.t0) a17, "FinderFollowFeedUIContract.Presenter", oaVar.f108627m, a07, i18, baseFeedLoader.getDataListJustForAdapter(), null, null, false, false, 224, null);
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        int d17;
        int r17 = gm0.j1.u().c().r(com.tencent.mm.storage.u3.USERINFO_FINDER_NEW_CGI_INT_SYNC, 0);
        if (r17 == 1) {
            db2.u4.f228188a = "/cgi-bin/mmfinder-bin";
        } else if (r17 != 2) {
            db2.u4.f228188a = "/cgi-bin/micromsg-bin";
        } else {
            db2.u4.f228188a = "/cgi-bin/micromsg-bin";
        }
        com.tencent.mars.xlog.Log.i("Finder.FinderCgiConstants", "config " + r17 + ' ' + db2.u4.f228188a);
        mv2.l lVar = mv2.l.f331597d;
        mv2.l.f331597d.e();
        androidx.fragment.app.Fragment fragment = getFragment();
        com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment finderHomeTabFragment = fragment instanceof com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment ? (com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment) fragment : null;
        if (finderHomeTabFragment != null) {
            d17 = finderHomeTabFragment.getF121515s();
        } else {
            androidx.appcompat.app.AppCompatActivity activity = getActivity();
            com.tencent.mm.plugin.finder.ui.MMFinderUI mMFinderUI = activity instanceof com.tencent.mm.plugin.finder.ui.MMFinderUI ? (com.tencent.mm.plugin.finder.ui.MMFinderUI) activity : null;
            d17 = mMFinderUI != null ? mMFinderUI.getD() : 0;
        }
        int i17 = d17;
        androidx.appcompat.app.AppCompatActivity activity2 = getActivity();
        kotlin.jvm.internal.o.e(activity2, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        com.tencent.mm.ui.MMActivity mMActivity = (com.tencent.mm.ui.MMActivity) activity2;
        int O6 = O6();
        androidx.fragment.app.Fragment fragment2 = getFragment();
        this.f134938e = new com.tencent.mm.plugin.finder.feed.oa(mMActivity, i17, O6, fragment2 instanceof com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment ? (com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment) fragment2 : null);
        androidx.appcompat.app.AppCompatActivity activity3 = getActivity();
        kotlin.jvm.internal.o.e(activity3, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        com.tencent.mm.plugin.finder.feed.xa xaVar = new com.tencent.mm.plugin.finder.feed.xa((com.tencent.mm.ui.MMActivity) activity3, i17, O6(), getRootView(), getFragment());
        android.view.View findViewById = getRootView().findViewById(com.tencent.mm.R.id.m6e);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        xaVar.f106180m = (com.tencent.mm.view.RefreshLoadMoreLayout) findViewById;
        this.f134939f = xaVar;
        com.tencent.mm.plugin.finder.feed.oa oaVar = this.f134938e;
        if (oaVar == null) {
            kotlin.jvm.internal.o.o("presenter");
            throw null;
        }
        xaVar.T(oaVar);
        com.tencent.mm.plugin.finder.feed.oa oaVar2 = this.f134938e;
        if (oaVar2 == null) {
            kotlin.jvm.internal.o.o("presenter");
            throw null;
        }
        com.tencent.mm.plugin.finder.feed.xa xaVar2 = this.f134939f;
        if (xaVar2 == null) {
            kotlin.jvm.internal.o.o("viewCallback");
            throw null;
        }
        oaVar2.m(xaVar2);
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        if (((java.lang.Number) t70Var.M().r()).intValue() >= 1) {
            com.tencent.mm.plugin.finder.feed.xa xaVar3 = this.f134939f;
            if (xaVar3 == null) {
                kotlin.jvm.internal.o.o("viewCallback");
                throw null;
            }
            oj5.x.d(xaVar3.getRecyclerView(), 6, 12, false, null, null, 28, null).f345880c = ((java.lang.Number) t70Var.M().r()).intValue() == 2;
        }
        ((qs2.q) ((w40.e) i95.n0.c(w40.e.class))).getClass();
        mv2.f0.f331561a.c();
        ((c61.l7) i95.n0.c(c61.l7.class)).P.b(104, this);
        ((c61.l7) i95.n0.c(c61.l7.class)).P.b(108, this);
        android.view.View decorView = getActivity().getWindow().getDecorView();
        kotlin.jvm.internal.o.f(decorView, "getDecorView(...)");
        decorView.getViewTreeObserver().addOnPreDrawListener(new com.tencent.mm.plugin.finder.viewmodel.component.f90(decorView, this));
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onCreateAfter(android.os.Bundle bundle) {
        if (!isBelongFragment()) {
            o25.n1.c((com.tencent.mm.ui.MMActivity) getActivity());
        }
        final androidx.appcompat.app.AppCompatActivity activity = getActivity();
        new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.FinderNextTabPreloadEvent>(activity) { // from class: com.tencent.mm.plugin.finder.viewmodel.component.FinderTwoFlowTimelineUIC$onCreateAfter$1
            {
                this.__eventId = 1338237085;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.FinderNextTabPreloadEvent finderNextTabPreloadEvent) {
                com.tencent.mm.autogen.events.FinderNextTabPreloadEvent event = finderNextTabPreloadEvent;
                kotlin.jvm.internal.o.g(event, "event");
                int i17 = event.f54313g.f7892a;
                com.tencent.mm.plugin.finder.viewmodel.component.k90 k90Var = com.tencent.mm.plugin.finder.viewmodel.component.k90.this;
                if (i17 != k90Var.O6()) {
                    return false;
                }
                pm0.v.X(new com.tencent.mm.plugin.finder.viewmodel.component.g90(k90Var));
                return false;
            }
        }.alive();
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onCreateBefore(android.os.Bundle bundle) {
        if (isBelongFragment()) {
            return;
        }
        o25.n1.e(getActivity());
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        com.tencent.mars.xlog.Log.i("FinderTwoFlowTimelineUIC", "onDestroy");
        ((c61.l7) i95.n0.c(c61.l7.class)).P.l(104, this);
        ((c61.l7) i95.n0.c(c61.l7.class)).P.l(108, this);
        com.tencent.mm.plugin.finder.feed.oa oaVar = this.f134938e;
        if (oaVar == null) {
            kotlin.jvm.internal.o.o("presenter");
            throw null;
        }
        oaVar.onDetach();
        kk.l lVar = so2.f0.f410334a;
        so2.f0.f410334a.clear();
        pm0.v.K(null, com.tencent.mm.plugin.finder.viewmodel.component.h90.f134599d);
        com.tencent.mm.plugin.finder.feed.xa xaVar = this.f134939f;
        if (xaVar == null) {
            kotlin.jvm.internal.o.o("viewCallback");
            throw null;
        }
        xaVar.getRecyclerView().setAdapter(null);
        com.tencent.mm.plugin.finder.report.v1 v1Var = com.tencent.mm.plugin.finder.report.v1.f125393a;
        int O6 = O6();
        androidx.appcompat.app.AppCompatActivity context = getActivity();
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
        v1Var.x(O6, nyVar != null ? nyVar.V6() : null);
        v1Var.v(-1);
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onPause() {
        super.onPause();
        com.tencent.mm.plugin.finder.feed.oa oaVar = this.f134938e;
        if (oaVar == null) {
            kotlin.jvm.internal.o.o("presenter");
            throw null;
        }
        oaVar.q();
        com.tencent.mm.plugin.finder.report.v1.f125393a.v(-1);
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onResume() {
        com.tencent.mm.plugin.finder.feed.oa oaVar = this.f134938e;
        if (oaVar == null) {
            kotlin.jvm.internal.o.o("presenter");
            throw null;
        }
        oaVar.s();
        if (com.tencent.mm.plugin.finder.viewmodel.component.t80.f135993m && O6() == 3) {
            com.tencent.mars.xlog.Log.i("FinderTwoFlowTimelineUIC", "[onResume] shouldScrollToPostingItem");
            com.tencent.mm.plugin.finder.feed.xa xaVar = this.f134939f;
            if (xaVar == null) {
                kotlin.jvm.internal.o.o("viewCallback");
                throw null;
            }
            androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = xaVar.getRecyclerView().getLayoutManager();
            androidx.recyclerview.widget.StaggeredGridLayoutManager staggeredGridLayoutManager = layoutManager instanceof androidx.recyclerview.widget.StaggeredGridLayoutManager ? (androidx.recyclerview.widget.StaggeredGridLayoutManager) layoutManager : null;
            if (staggeredGridLayoutManager != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(staggeredGridLayoutManager, arrayList.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderTwoFlowTimelineUIC", "onResume", "()V", "Undefined", "scrollToPositionWithOffset", "(II)V");
                staggeredGridLayoutManager.O(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue());
                yj0.a.f(staggeredGridLayoutManager, "com/tencent/mm/plugin/finder/viewmodel/component/FinderTwoFlowTimelineUIC", "onResume", "()V", "Undefined", "scrollToPositionWithOffset", "(II)V");
            }
            com.tencent.mm.plugin.finder.viewmodel.component.t80.f135993m = false;
        }
        com.tencent.mm.plugin.finder.report.v1.f125393a.s(O6());
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onStop() {
        super.onStop();
        if (!getActivity().isFinishing()) {
            com.tencent.mm.plugin.finder.report.v1.f125393a.j(O6(), false);
            return;
        }
        com.tencent.mm.plugin.finder.report.v1 v1Var = com.tencent.mm.plugin.finder.report.v1.f125393a;
        int O6 = O6();
        androidx.appcompat.app.AppCompatActivity context = getActivity();
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
        v1Var.x(O6, nyVar != null ? nyVar.V6() : null);
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onUserVisibleFocused() {
        super.onUserVisibleFocused();
        pf5.u uVar = pf5.u.f353936a;
        ey2.t0 t0Var = (ey2.t0) uVar.e(c61.l7.class).a(ey2.t0.class);
        O6();
        t0Var.getClass();
        ((com.tencent.mm.plugin.finder.viewmodel.component.FinderVideoRecycler) uVar.e(c61.l7.class).a(com.tencent.mm.plugin.finder.viewmodel.component.FinderVideoRecycler.class)).a7(com.tencent.mm.plugin.finder.viewmodel.component.i90.f134722d);
        androidx.lifecycle.c1 a17 = uVar.b(getContext()).a(uo2.v.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        ((uo2.v) a17).R6(null);
        if (this.f134938e == null) {
            kotlin.jvm.internal.o.o("presenter");
            throw null;
        }
        android.content.Intent intent = getActivity().getIntent();
        boolean booleanExtra = intent != null ? intent.getBooleanExtra("KEY_FINDER_JUMP_FOLLOW_TAB", false) : false;
        android.content.Intent intent2 = getActivity().getIntent();
        if (intent2 != null) {
            intent2.removeExtra("KEY_FINDER_JUMP_FOLLOW_TAB");
        }
        boolean h07 = ((c61.l7) i95.n0.c(c61.l7.class)).nk().h0(O6());
        if (booleanExtra) {
            com.tencent.mm.plugin.finder.feed.oa oaVar = this.f134938e;
            if (oaVar == null) {
                kotlin.jvm.internal.o.o("presenter");
                throw null;
            }
            oaVar.y(true, false);
            com.tencent.mars.xlog.Log.i("FinderTwoFlowTimelineUIC", "[onUserVisibleFocused] pass this check");
        } else {
            com.tencent.mm.plugin.finder.feed.oa oaVar2 = this.f134938e;
            if (oaVar2 == null) {
                kotlin.jvm.internal.o.o("presenter");
                throw null;
            }
            oaVar2.y(false, true);
            if (((java.lang.Number) com.tencent.mm.plugin.finder.storage.t70.f127590a.Q0().r()).intValue() == 1 && h07) {
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
        fc2.c Y6 = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) uVar.c(getActivity()).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).Y6(O6());
        if (Y6 != null) {
            Y6.b(new fc2.x(O6()));
        }
        if (getActivity() instanceof com.tencent.mm.plugin.finder.ui.MMFinderUI) {
            androidx.appcompat.app.AppCompatActivity activity = getActivity();
            com.tencent.mm.plugin.finder.ui.MMFinderUI mMFinderUI = activity instanceof com.tencent.mm.plugin.finder.ui.MMFinderUI ? (com.tencent.mm.plugin.finder.ui.MMFinderUI) activity : null;
            int d17 = mMFinderUI != null ? mMFinderUI.getD() : 0;
            ((ml2.j0) ((zy2.zb) i95.n0.c(zy2.zb.class))).getClass();
            ml2.j0.f327583i.f328314v = d17;
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onUserVisibleUnFocused() {
        super.onUserVisibleUnFocused();
        ((ey2.t0) pf5.u.f353936a.e(c61.l7.class).a(ey2.t0.class)).T6(O6());
        if (this.f134938e == null) {
            kotlin.jvm.internal.o.o("presenter");
            throw null;
        }
        com.tencent.mm.plugin.finder.report.v1 v1Var = com.tencent.mm.plugin.finder.report.v1.f125393a;
        v1Var.v(O6());
        v1Var.j(O6(), true);
        com.tencent.mm.plugin.finder.report.e1 e1Var = com.tencent.mm.plugin.finder.report.e1.f125004a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k90(androidx.fragment.app.Fragment fragment) {
        super(fragment);
        kotlin.jvm.internal.o.g(fragment, "fragment");
        this.f134937d = jz5.h.b(new com.tencent.mm.plugin.finder.viewmodel.component.j90(this));
    }
}
