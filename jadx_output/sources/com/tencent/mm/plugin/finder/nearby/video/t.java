package com.tencent.mm.plugin.finder.nearby.video;

/* loaded from: classes2.dex */
public final class t extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.nearby.video.NearbyVideoPresenter f122218d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.nearby.video.d0 f122219e;

    /* renamed from: f, reason: collision with root package name */
    public final ey2.k0 f122220f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(com.tencent.mm.ui.MMFragmentActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        androidx.lifecycle.c1 a17 = pf5.u.f353936a.e(c61.l7.class).a(ey2.k0.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        this.f122220f = (ey2.k0) a17;
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public int getLayoutId() {
        return com.tencent.mm.R.layout.c7e;
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        com.tencent.mm.plugin.finder.nearby.video.NearbyVideoPresenter nearbyVideoPresenter;
        com.tencent.mm.plugin.finder.nearby.video.d0 d0Var;
        int i19;
        com.tencent.mm.plugin.finder.nearby.video.NearbyVideoFeedLoader feedLoader;
        com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer<T> dataListJustForAdapter;
        if (i17 == 501) {
            if (i18 != -1 || intent == null || (nearbyVideoPresenter = this.f122218d) == null) {
                return;
            }
            nearbyVideoPresenter.refreshRV(intent);
            return;
        }
        if (i17 == 510 && i18 == -1 && (d0Var = this.f122219e) != null && (i19 = d0Var.f122180i) != -1) {
            com.tencent.mm.plugin.finder.nearby.video.NearbyVideoPresenter nearbyVideoPresenter2 = this.f122218d;
            if (nearbyVideoPresenter2 != null && (feedLoader = nearbyVideoPresenter2.getFeedLoader()) != null && (dataListJustForAdapter = feedLoader.getDataListJustForAdapter()) != 0) {
            }
            androidx.recyclerview.widget.f2 adapter = d0Var.getRecyclerView().getAdapter();
            if (adapter != null) {
                adapter.notifyItemRemoved(i19);
            }
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onConfigurationChanged(android.content.res.Configuration newConfig) {
        com.tencent.mm.plugin.finder.nearby.video.d0 d0Var;
        androidx.recyclerview.widget.RecyclerView recyclerView;
        androidx.recyclerview.widget.f2 adapter;
        kotlin.jvm.internal.o.g(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        if (!com.tencent.mm.ui.bk.Q() || (d0Var = this.f122219e) == null || (recyclerView = d0Var.getRecyclerView()) == null || (adapter = recyclerView.getAdapter()) == null) {
            return;
        }
        adapter.notifyDataSetChanged();
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        kotlin.jvm.internal.o.e(activity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        com.tencent.mm.plugin.finder.nearby.video.NearbyVideoPresenter nearbyVideoPresenter = new com.tencent.mm.plugin.finder.nearby.video.NearbyVideoPresenter((com.tencent.mm.ui.MMActivity) activity);
        this.f122218d = nearbyVideoPresenter;
        androidx.appcompat.app.AppCompatActivity activity2 = getActivity();
        kotlin.jvm.internal.o.e(activity2, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        androidx.fragment.app.Fragment fragment = getFragment();
        kotlin.jvm.internal.o.e(fragment, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.nearby.base.AbsNearByFragment");
        com.tencent.mm.plugin.finder.nearby.video.d0 d0Var = new com.tencent.mm.plugin.finder.nearby.video.d0((com.tencent.mm.ui.MMActivity) activity2, (com.tencent.mm.plugin.finder.nearby.base.AbsNearByFragment) fragment, nearbyVideoPresenter, getRootView());
        nearbyVideoPresenter.onAttach((com.tencent.mm.plugin.finder.nearby.video.b) d0Var);
        this.f122219e = d0Var;
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        com.tencent.mm.plugin.finder.nearby.video.NearbyVideoPresenter nearbyVideoPresenter = this.f122218d;
        if (nearbyVideoPresenter != null) {
            nearbyVideoPresenter.onDetach();
        }
        com.tencent.mm.plugin.finder.report.v1.f125393a.x(2, null);
        com.tencent.mm.plugin.finder.nearby.video.d0 d0Var = this.f122219e;
        if (d0Var != null) {
            d0Var.f122183o.f();
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onFinished() {
        super.onFinished();
        com.tencent.mm.plugin.finder.nearby.video.NearbyVideoPresenter nearbyVideoPresenter = this.f122218d;
        if (nearbyVideoPresenter != null) {
            nearbyVideoPresenter.onFinishing();
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onPause() {
        super.onPause();
        com.tencent.mars.xlog.Log.i("Finder.TimelineLbsUIC", "onPause");
        com.tencent.mm.plugin.finder.nearby.video.NearbyVideoPresenter nearbyVideoPresenter = this.f122218d;
        if (nearbyVideoPresenter != null) {
            nearbyVideoPresenter.onPause();
        }
        this.f122220f.N6();
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onRequestPermissionsResult(int i17, java.lang.String[] permissions, int[] grantResults) {
        kotlin.jvm.internal.o.g(permissions, "permissions");
        kotlin.jvm.internal.o.g(grantResults, "grantResults");
        super.onRequestPermissionsResult(i17, permissions, grantResults);
        com.tencent.mm.plugin.finder.nearby.video.NearbyVideoPresenter nearbyVideoPresenter = this.f122218d;
        if (nearbyVideoPresenter != null) {
            nearbyVideoPresenter.onRequestPermissionsResult(i17, permissions, grantResults);
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onResume() {
        com.tencent.mars.xlog.Log.i("Finder.TimelineLbsUIC", "onResume");
        com.tencent.mm.plugin.finder.nearby.video.NearbyVideoPresenter nearbyVideoPresenter = this.f122218d;
        if (nearbyVideoPresenter != null) {
            nearbyVideoPresenter.onResume();
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onUserVisibleFocused() {
        com.tencent.mars.xlog.Log.i("Finder.TimelineLbsUIC", "onUserVisibleFocused");
        super.onUserVisibleFocused();
        ((com.tencent.mm.plugin.finder.viewmodel.component.FinderVideoRecycler) pf5.u.f353936a.e(c61.l7.class).a(com.tencent.mm.plugin.finder.viewmodel.component.FinderVideoRecycler.class)).a7(com.tencent.mm.plugin.finder.nearby.video.s.f122217d);
        com.tencent.mm.plugin.finder.nearby.video.NearbyVideoPresenter nearbyVideoPresenter = this.f122218d;
        if (nearbyVideoPresenter != null) {
            nearbyVideoPresenter.onUserVisibleFocused();
        }
        ya2.o1.t4(this.f122220f, false, null, 2, null);
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onUserVisibleUnFocused() {
        com.tencent.mars.xlog.Log.i("Finder.TimelineLbsUIC", "onUserVisibleUnFocused");
        super.onUserVisibleUnFocused();
        com.tencent.mm.plugin.finder.nearby.video.NearbyVideoPresenter nearbyVideoPresenter = this.f122218d;
        if (nearbyVideoPresenter != null) {
            nearbyVideoPresenter.onUserVisibleUnFocused();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(androidx.fragment.app.Fragment fragment) {
        super(fragment);
        kotlin.jvm.internal.o.g(fragment, "fragment");
        androidx.lifecycle.c1 a17 = pf5.u.f353936a.e(c61.l7.class).a(ey2.k0.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        this.f122220f = (ey2.k0) a17;
    }
}
