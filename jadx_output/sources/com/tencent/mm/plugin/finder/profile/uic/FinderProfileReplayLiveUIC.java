package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public final class FinderProfileReplayLiveUIC extends com.tencent.mm.plugin.finder.profile.uic.i6 {

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f123448i;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f123449m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f123450n;

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f123451o;

    /* renamed from: p, reason: collision with root package name */
    public final jz5.g f123452p;

    /* renamed from: q, reason: collision with root package name */
    public final jz5.g f123453q;

    /* renamed from: r, reason: collision with root package name */
    public final jz5.g f123454r;

    /* renamed from: s, reason: collision with root package name */
    public int f123455s;

    /* renamed from: t, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.profile.uic.FinderProfileReplayLiveUIC$feedChangeListener$1 f123456t;

    /* renamed from: u, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.profile.uic.FinderProfileReplayLiveUIC$feedStickyListener$1 f123457u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v1, types: [com.tencent.mm.plugin.finder.profile.uic.FinderProfileReplayLiveUIC$feedChangeListener$1] */
    /* JADX WARN: Type inference failed for: r0v2, types: [com.tencent.mm.plugin.finder.profile.uic.FinderProfileReplayLiveUIC$feedStickyListener$1] */
    public FinderProfileReplayLiveUIC(androidx.fragment.app.Fragment fragment) {
        super(fragment);
        kotlin.jvm.internal.o.g(fragment, "fragment");
        this.f123448i = "FinderProfileReplayLiveUIC";
        this.f123449m = jz5.h.b(new com.tencent.mm.plugin.finder.profile.uic.zd(this));
        this.f123450n = jz5.h.b(new com.tencent.mm.plugin.finder.profile.uic.yd(this));
        this.f123451o = jz5.h.b(new com.tencent.mm.plugin.finder.profile.uic.xd(this));
        this.f123452p = jz5.h.b(new com.tencent.mm.plugin.finder.profile.uic.nd(this));
        this.f123453q = jz5.h.b(new com.tencent.mm.plugin.finder.profile.uic.qd(this));
        this.f123454r = jz5.h.b(new com.tencent.mm.plugin.finder.profile.uic.ld(this));
        this.f123455s = 1;
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.f123456t = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.FeedUpdateEvent>(a0Var) { // from class: com.tencent.mm.plugin.finder.profile.uic.FinderProfileReplayLiveUIC$feedChangeListener$1
            {
                this.__eventId = 439877283;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.FeedUpdateEvent feedUpdateEvent) {
                com.tencent.mm.autogen.events.FeedUpdateEvent event = feedUpdateEvent;
                kotlin.jvm.internal.o.g(event, "event");
                am.ia iaVar = event.f54252g;
                int i17 = iaVar.f6919b;
                com.tencent.mm.plugin.finder.profile.uic.FinderProfileReplayLiveUIC finderProfileReplayLiveUIC = com.tencent.mm.plugin.finder.profile.uic.FinderProfileReplayLiveUIC.this;
                if (i17 != 24) {
                    if (i17 != 27) {
                        return false;
                    }
                    finderProfileReplayLiveUIC.O6().requestRefresh();
                    return false;
                }
                long j17 = iaVar.f6918a;
                finderProfileReplayLiveUIC.P6().post(new com.tencent.mm.plugin.finder.profile.uic.md(finderProfileReplayLiveUIC.O6().getDataListJustForAdapter(), finderProfileReplayLiveUIC, j17));
                return false;
            }
        };
        this.f123457u = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.FeedStickyEvent>(a0Var) { // from class: com.tencent.mm.plugin.finder.profile.uic.FinderProfileReplayLiveUIC$feedStickyListener$1
            {
                this.__eventId = -1128941181;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.FeedStickyEvent feedStickyEvent) {
                com.tencent.mm.autogen.events.FeedStickyEvent event = feedStickyEvent;
                kotlin.jvm.internal.o.g(event, "event");
                if (event.f54251g.f6828a != 1000) {
                    return false;
                }
                com.tencent.mm.plugin.finder.profile.uic.FinderProfileReplayLiveUIC finderProfileReplayLiveUIC = com.tencent.mm.plugin.finder.profile.uic.FinderProfileReplayLiveUIC.this;
                finderProfileReplayLiveUIC.O6().getStore().f108495f.clear();
                finderProfileReplayLiveUIC.O6().requestRefresh();
                return false;
            }
        };
    }

    public final com.tencent.mm.plugin.finder.live.loader.FinderProfileLiveUserPageLoader O6() {
        return (com.tencent.mm.plugin.finder.live.loader.FinderProfileLiveUserPageLoader) ((jz5.n) this.f123452p).getValue();
    }

    public final androidx.recyclerview.widget.RecyclerView P6() {
        return (androidx.recyclerview.widget.RecyclerView) ((jz5.n) this.f123451o).getValue();
    }

    @Override // com.tencent.mm.plugin.finder.profile.uic.i6
    public void doRefreshRequest() {
        com.tencent.mm.plugin.finder.profile.uic.i6.handleLoadState$default(this, com.tencent.mm.plugin.finder.feed.model.FinderProfileFeedLoader.State.LOADING, null, 2, null);
        O6().requestRefresh();
        android.app.Activity context = getContext();
        kotlin.jvm.internal.o.g(context, "context");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        com.tencent.mm.plugin.finder.profile.uic.p2 p2Var = (com.tencent.mm.plugin.finder.profile.uic.p2) zVar.a((androidx.appcompat.app.AppCompatActivity) context).e(com.tencent.mm.plugin.finder.profile.uic.p2.class);
        if (p2Var != null) {
            p2Var.O6(5870, 6, 4);
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public int getLayoutId() {
        return com.tencent.mm.R.layout.b6m;
    }

    public final com.tencent.mm.plugin.finder.view.FinderRefreshLayout getRlLayout() {
        return (com.tencent.mm.plugin.finder.view.FinderRefreshLayout) ((jz5.n) this.f123450n).getValue();
    }

    @Override // com.tencent.mm.plugin.finder.profile.uic.i6, com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar;
        fc2.o Z6;
        super.onCreate(bundle);
        androidx.core.widget.NestedScrollView nestedScrollView = ((vb2.z) ((jz5.n) this.f123449m).getValue()).f434784e;
        if (nestedScrollView != null) {
            nestedScrollView.setVisibility(8);
        }
        com.tencent.mm.plugin.finder.feed.model.internal.Dispatcher.register$default(O6(), (com.tencent.mm.plugin.finder.view.mj) ((jz5.n) this.f123454r).getValue(), false, 2, null);
        alive();
        alive();
        com.tencent.mm.plugin.finder.view.refresh.FinderProfileLoaderMoreFooter finderProfileLoaderMoreFooter = new com.tencent.mm.plugin.finder.view.refresh.FinderProfileLoaderMoreFooter(getActivity(), null);
        finderProfileLoaderMoreFooter.j(com.tencent.mm.R.layout.bsd);
        getRlLayout().D(finderProfileLoaderMoreFooter);
        getRlLayout().setOnSimpleAction(new com.tencent.mm.plugin.finder.profile.uic.sd(this));
        androidx.recyclerview.widget.RecyclerView P6 = P6();
        jz5.g gVar = this.f123453q;
        P6.setLayoutManager(((com.tencent.mm.plugin.finder.profile.h) ((jz5.n) gVar).getValue()).d(getActivity()));
        P6().N(((com.tencent.mm.plugin.finder.profile.h) ((jz5.n) gVar).getValue()).c());
        androidx.recyclerview.widget.RecyclerView P62 = P6();
        com.tencent.mm.plugin.finder.profile.h hVar = (com.tencent.mm.plugin.finder.profile.h) ((jz5.n) gVar).getValue();
        hVar.getClass();
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = new com.tencent.mm.view.recyclerview.WxRecyclerAdapter(new com.tencent.mm.plugin.finder.profile.FinderProfileLayoutConfig$getItemConvertFactory$1(hVar, null), O6().getDataListJustForAdapter(), false);
        wxRecyclerAdapter.f293105o = new com.tencent.mm.plugin.finder.profile.uic.td(this, wxRecyclerAdapter);
        P62.setAdapter(wxRecyclerAdapter);
        ym5.a1.g(P6(), new com.tencent.mm.plugin.finder.profile.uic.ud());
        O6().f111697g = new com.tencent.mm.plugin.finder.profile.uic.vd(this);
        O6().f111698h = new com.tencent.mm.plugin.finder.profile.uic.wd(this);
        androidx.fragment.app.Fragment fragment = getFragment();
        if (fragment == null || (nyVar = (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.b(fragment).e(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)) == null || (Z6 = nyVar.Z6(-1)) == null) {
            return;
        }
        Z6.d(P6());
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        dead();
        dead();
        O6().unregister((com.tencent.mm.plugin.finder.view.mj) ((jz5.n) this.f123454r).getValue());
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onResume() {
        if (isSelf() && isSelfFlag()) {
            com.tencent.mars.xlog.Log.i(this.f123448i, "#onResume anchor refresh");
            O6().requestRefresh();
        }
    }
}
