package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class zp extends com.tencent.mm.ui.component.UIComponent implements ya2.x1 {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f136709d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.feed.um f136710e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.feed.ym f136711f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zp(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f136709d = jz5.h.b(new com.tencent.mm.plugin.finder.viewmodel.component.yp(this));
    }

    public final int O6() {
        return ((java.lang.Number) this.f136709d.getValue()).intValue();
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public int getLayoutId() {
        return com.tencent.mm.R.layout.b_a;
    }

    @Override // ya2.x1
    public void j7(r45.hx0 cmdItem, int i17, int i18) {
        kotlin.jvm.internal.o.g(cmdItem, "cmdItem");
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public boolean onBackPressed() {
        if (isBelongFragment()) {
            if (this.f136710e != null) {
                return false;
            }
            kotlin.jvm.internal.o.o("presenter");
            throw null;
        }
        if (this.f136710e != null) {
            getActivity().finish();
            return true;
        }
        kotlin.jvm.internal.o.o("presenter");
        throw null;
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onBeforeFinish(android.content.Intent intent) {
        android.view.View view;
        com.tencent.mm.plugin.finder.feed.um umVar = this.f136710e;
        if (umVar == null) {
            kotlin.jvm.internal.o.o("presenter");
            throw null;
        }
        com.tencent.mm.plugin.finder.feed.a1 a1Var = umVar.f107157f;
        if (a1Var != null) {
            androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = a1Var.getRecyclerView().getLayoutManager();
            androidx.recyclerview.widget.StaggeredGridLayoutManager staggeredGridLayoutManager = layoutManager instanceof androidx.recyclerview.widget.StaggeredGridLayoutManager ? (androidx.recyclerview.widget.StaggeredGridLayoutManager) layoutManager : null;
            int[] u17 = staggeredGridLayoutManager != null ? staggeredGridLayoutManager.u(null) : null;
            if (u17 != null) {
                int i17 = 0;
                if (u17.length == 0) {
                    return;
                }
                int a07 = u17[0] - a1Var.o().a0();
                androidx.recyclerview.widget.k3 q07 = a1Var.getRecyclerView().q0(u17[0], false);
                if (q07 != null && (view = q07.itemView) != null) {
                    i17 = view.getTop();
                }
                int i18 = i17;
                com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader baseFeedLoader = umVar.f107156e;
                com.tencent.mm.plugin.finder.feed.NativeDramaGridLoader nativeDramaGridLoader = baseFeedLoader instanceof com.tencent.mm.plugin.finder.feed.NativeDramaGridLoader ? (com.tencent.mm.plugin.finder.feed.NativeDramaGridLoader) baseFeedLoader : null;
                java.lang.String str = nativeDramaGridLoader != null ? nativeDramaGridLoader.f106165d.f250736e : null;
                androidx.lifecycle.c1 a17 = pf5.u.f353936a.e(c61.l7.class).a(ey2.t0.class);
                kotlin.jvm.internal.o.f(a17, "get(...)");
                ey2.t0.V6((ey2.t0) a17, "FinderNativeDramaGridUIContract.Presenter", umVar.f110823i, a07, i18, baseFeedLoader.getDataListJustForAdapter(), null, str != null ? com.tencent.mm.protobuf.g.c(str) : null, false, false, 160, null);
            }
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        com.tencent.mars.xlog.Log.i("FinderNativeDramaGridUIC", "onCreate");
        androidx.fragment.app.Fragment fragment = getFragment();
        com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment finderHomeTabFragment = fragment instanceof com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment ? (com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment) fragment : null;
        int f121515s = finderHomeTabFragment != null ? finderHomeTabFragment.getF121515s() : 0;
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        kotlin.jvm.internal.o.e(activity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        this.f136710e = new com.tencent.mm.plugin.finder.feed.um((com.tencent.mm.ui.MMActivity) activity, f121515s, O6());
        androidx.appcompat.app.AppCompatActivity activity2 = getActivity();
        kotlin.jvm.internal.o.e(activity2, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        com.tencent.mm.plugin.finder.feed.ym ymVar = new com.tencent.mm.plugin.finder.feed.ym((com.tencent.mm.ui.MMActivity) activity2, f121515s, O6(), getRootView());
        android.view.View findViewById = getRootView().findViewById(com.tencent.mm.R.id.m6e);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        ymVar.f106180m = (com.tencent.mm.view.RefreshLoadMoreLayout) findViewById;
        this.f136711f = ymVar;
        com.tencent.mm.plugin.finder.feed.um umVar = this.f136710e;
        if (umVar == null) {
            kotlin.jvm.internal.o.o("presenter");
            throw null;
        }
        ymVar.T(umVar);
        com.tencent.mm.plugin.finder.feed.um umVar2 = this.f136710e;
        if (umVar2 == null) {
            kotlin.jvm.internal.o.o("presenter");
            throw null;
        }
        com.tencent.mm.plugin.finder.feed.ym ymVar2 = this.f136711f;
        if (ymVar2 == null) {
            kotlin.jvm.internal.o.o("viewCallback");
            throw null;
        }
        umVar2.m(ymVar2);
        ((c61.l7) i95.n0.c(c61.l7.class)).P.b(104, this);
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        if (((java.lang.Number) t70Var.M().r()).intValue() >= 1) {
            com.tencent.mm.plugin.finder.feed.ym ymVar3 = this.f136711f;
            if (ymVar3 == null) {
                kotlin.jvm.internal.o.o("viewCallback");
                throw null;
            }
            oj5.x.d(ymVar3.getRecyclerView(), 6, 12, false, null, null, 28, null).f345880c = ((java.lang.Number) t70Var.M().r()).intValue() == 2;
        }
        android.view.ViewGroup.LayoutParams layoutParams = getRootView().findViewById(com.tencent.mm.R.id.f482428ec).getLayoutParams();
        if (layoutParams != null) {
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
            if (marginLayoutParams == null) {
                return;
            }
            marginLayoutParams.topMargin = com.tencent.mm.ui.bl.h(getActivity()) + com.tencent.mm.ui.bl.a(getActivity());
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onCreateAfter(android.os.Bundle bundle) {
        if (!isBelongFragment()) {
            androidx.appcompat.app.AppCompatActivity activity = getActivity();
            o25.n1.c(activity instanceof com.tencent.mm.ui.MMActivity ? (com.tencent.mm.ui.MMActivity) activity : null);
        }
        final androidx.appcompat.app.AppCompatActivity activity2 = getActivity();
        new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.FinderNextTabPreloadEvent>(activity2) { // from class: com.tencent.mm.plugin.finder.viewmodel.component.FinderNativeDramaGridUIC$onCreateAfter$1
            {
                this.__eventId = 1338237085;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.FinderNextTabPreloadEvent finderNextTabPreloadEvent) {
                com.tencent.mm.autogen.events.FinderNextTabPreloadEvent event = finderNextTabPreloadEvent;
                kotlin.jvm.internal.o.g(event, "event");
                int i17 = event.f54313g.f7892a;
                com.tencent.mm.plugin.finder.viewmodel.component.zp zpVar = com.tencent.mm.plugin.finder.viewmodel.component.zp.this;
                if (i17 != zpVar.O6()) {
                    return false;
                }
                pm0.v.X(new com.tencent.mm.plugin.finder.viewmodel.component.vp(zpVar));
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
        com.tencent.mars.xlog.Log.i("FinderNativeDramaGridUIC", "onDestroy");
        ((c61.l7) i95.n0.c(c61.l7.class)).P.l(104, this);
        com.tencent.mm.plugin.finder.feed.um umVar = this.f136710e;
        if (umVar == null) {
            kotlin.jvm.internal.o.o("presenter");
            throw null;
        }
        umVar.onDetach();
        kk.l lVar = so2.f0.f410334a;
        so2.f0.f410334a.clear();
        pm0.v.K(null, com.tencent.mm.plugin.finder.viewmodel.component.wp.f136357d);
        com.tencent.mm.plugin.finder.feed.ym ymVar = this.f136711f;
        if (ymVar == null) {
            kotlin.jvm.internal.o.o("viewCallback");
            throw null;
        }
        ymVar.getRecyclerView().setAdapter(null);
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
        if (this.f136710e != null) {
            com.tencent.mm.plugin.finder.report.v1.f125393a.v(-1);
        } else {
            kotlin.jvm.internal.o.o("presenter");
            throw null;
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onResume() {
        if (this.f136710e != null) {
            com.tencent.mm.plugin.finder.report.v1.f125393a.s(O6());
        } else {
            kotlin.jvm.internal.o.o("presenter");
            throw null;
        }
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
        androidx.recyclerview.widget.RecyclerView recyclerView;
        super.onUserVisibleFocused();
        pf5.u uVar = pf5.u.f353936a;
        ey2.t0 t0Var = (ey2.t0) uVar.e(c61.l7.class).a(ey2.t0.class);
        O6();
        t0Var.getClass();
        ((com.tencent.mm.plugin.finder.viewmodel.component.FinderVideoRecycler) uVar.e(c61.l7.class).a(com.tencent.mm.plugin.finder.viewmodel.component.FinderVideoRecycler.class)).a7(com.tencent.mm.plugin.finder.viewmodel.component.xp.f136486d);
        androidx.lifecycle.c1 a17 = uVar.b(getContext()).a(uo2.v.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        ((uo2.v) a17).R6(null);
        com.tencent.mars.xlog.Log.i("FinderNativeDramaGridUIC", "onUserVisibleFocused isHasRedDot=" + ((c61.l7) i95.n0.c(c61.l7.class)).nk().h0(O6()));
        com.tencent.mm.plugin.finder.feed.um umVar = this.f136710e;
        if (umVar == null) {
            kotlin.jvm.internal.o.o("presenter");
            throw null;
        }
        ey2.t0 t0Var2 = umVar.f110824m;
        int i17 = umVar.f110823i;
        boolean R6 = t0Var2.R6(i17);
        com.tencent.mars.xlog.Log.i("FinderNativeDramaGridUIContract.Presenter", "checkAutoFlingToRefresh isHard=false isWithRefresh=true isAutoRefresh=" + R6 + " tabType=" + i17);
        if (R6) {
            com.tencent.mm.plugin.finder.feed.a1 a1Var = umVar.f107157f;
            androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = (a1Var == null || (recyclerView = a1Var.getRecyclerView()) == null) ? null : recyclerView.getLayoutManager();
            androidx.recyclerview.widget.StaggeredGridLayoutManager staggeredGridLayoutManager = layoutManager instanceof androidx.recyclerview.widget.StaggeredGridLayoutManager ? (androidx.recyclerview.widget.StaggeredGridLayoutManager) layoutManager : null;
            if (staggeredGridLayoutManager != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(staggeredGridLayoutManager, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/FinderNativeDramaGridUIContract$Presenter", "checkAutoFlingToRefresh", "(ZZ)Z", "Undefined", "scrollToPositionWithOffset", "(II)V");
                staggeredGridLayoutManager.O(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue());
                yj0.a.f(staggeredGridLayoutManager, "com/tencent/mm/plugin/finder/feed/FinderNativeDramaGridUIContract$Presenter", "checkAutoFlingToRefresh", "(ZZ)Z", "Undefined", "scrollToPositionWithOffset", "(II)V");
            }
            com.tencent.mm.plugin.finder.report.v1.f125393a.b(i17);
            com.tencent.mm.plugin.finder.feed.a1 a1Var2 = umVar.f107157f;
            com.tencent.mm.plugin.finder.feed.ym ymVar = a1Var2 instanceof com.tencent.mm.plugin.finder.feed.ym ? (com.tencent.mm.plugin.finder.feed.ym) a1Var2 : null;
            if (ymVar != null) {
                ymVar.f106180m.postDelayed(new com.tencent.mm.plugin.finder.feed.vm(ymVar, false), 0L);
            }
        }
        com.tencent.mm.plugin.finder.report.v1.f125393a.c();
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
        com.tencent.mm.plugin.finder.report.v1 v1Var = com.tencent.mm.plugin.finder.report.v1.f125393a;
        v1Var.v(O6());
        v1Var.j(O6(), true);
        com.tencent.mm.plugin.finder.report.e1 e1Var = com.tencent.mm.plugin.finder.report.e1.f125004a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zp(androidx.fragment.app.Fragment fragment) {
        super(fragment);
        kotlin.jvm.internal.o.g(fragment, "fragment");
        this.f136709d = jz5.h.b(new com.tencent.mm.plugin.finder.viewmodel.component.yp(this));
    }
}
