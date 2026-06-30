package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public final class dk extends com.tencent.mm.plugin.finder.profile.uic.i6 {

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f123635i;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f123636m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f123637n;

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f123638o;

    /* renamed from: p, reason: collision with root package name */
    public final jz5.g f123639p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f123640q;

    /* renamed from: r, reason: collision with root package name */
    public final js2.b f123641r;

    /* renamed from: s, reason: collision with root package name */
    public final js2.b f123642s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f123643t;

    /* renamed from: u, reason: collision with root package name */
    public int f123644u;

    /* renamed from: v, reason: collision with root package name */
    public long f123645v;

    /* renamed from: w, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.profile.uic.yi f123646w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dk(androidx.fragment.app.Fragment fragment) {
        super(fragment);
        kotlin.jvm.internal.o.g(fragment, "fragment");
        this.f123635i = jz5.h.b(new com.tencent.mm.plugin.finder.profile.uic.zj(this));
        this.f123636m = jz5.h.b(new com.tencent.mm.plugin.finder.profile.uic.wj(this));
        this.f123637n = jz5.h.b(new com.tencent.mm.plugin.finder.profile.uic.zi(this));
        this.f123638o = jz5.h.b(new com.tencent.mm.plugin.finder.profile.uic.gj(this));
        jz5.h.b(new com.tencent.mm.plugin.finder.profile.uic.bj(this));
        this.f123639p = jz5.h.b(new com.tencent.mm.plugin.finder.profile.uic.vj(this));
        java.lang.String string = getContext().getResources().getString(com.tencent.mm.R.string.cky);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        this.f123641r = new js2.b(12, string, false, 0, false, false, null, false, false, null, null, com.tencent.mm.plugin.finder.profile.uic.hj.f123776d, 2016, null);
        java.lang.String string2 = getContext().getResources().getString(com.tencent.mm.R.string.cky);
        kotlin.jvm.internal.o.f(string2, "getString(...)");
        this.f123642s = new js2.b(3, string2, false, 0, false, false, null, false, false, null, null, com.tencent.mm.plugin.finder.profile.uic.aj.f123543d, 2016, null);
        this.f123644u = -1;
        this.f123645v = -1L;
        this.f123646w = new com.tencent.mm.plugin.finder.profile.uic.yi(this);
    }

    public final java.util.ArrayList O6() {
        return (java.util.ArrayList) ((jz5.n) this.f123637n).getValue();
    }

    public final com.tencent.mm.plugin.finder.view.FinderRefreshLayout P6() {
        return (com.tencent.mm.plugin.finder.view.FinderRefreshLayout) ((jz5.n) this.f123636m).getValue();
    }

    public final void Q6(boolean z17) {
        int i17;
        androidx.recyclerview.widget.f2 adapter;
        java.util.List I = kz5.j0.I(getFeedLoader().getDataList(), com.tencent.mm.plugin.finder.model.BaseFinderFeed.class);
        java.util.List I2 = kz5.j0.I(O6(), com.tencent.mm.plugin.finder.model.BaseFinderFeed.class);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = I2.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            if ((((com.tencent.mm.plugin.finder.model.BaseFinderFeed) next).getFeedObject().getProfileTabScene() == 3 ? 1 : 0) != 0) {
                arrayList.add(next);
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj : I) {
            com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = (com.tencent.mm.plugin.finder.model.BaseFinderFeed) obj;
            java.util.Iterator it6 = arrayList.iterator();
            int i18 = 0;
            while (true) {
                if (!it6.hasNext()) {
                    i18 = -1;
                    break;
                } else if (((com.tencent.mm.plugin.finder.model.BaseFinderFeed) it6.next()).getItemId() == baseFinderFeed.getItemId()) {
                    break;
                } else {
                    i18++;
                }
            }
            if (i18 < 0) {
                arrayList2.add(obj);
            }
        }
        for (java.lang.Object obj2 : arrayList2) {
            int i19 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed2 = (com.tencent.mm.plugin.finder.model.BaseFinderFeed) obj2;
            baseFinderFeed2.getFeedObject().setProfileTabIndex(i17);
            baseFinderFeed2.getFeedObject().setProfileTabScene(12);
            i17 = i19;
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList(O6());
        kz5.h0.B(O6(), new com.tencent.mm.plugin.finder.profile.uic.ak(arrayList2));
        kz5.h0.B(O6(), new com.tencent.mm.plugin.finder.profile.uic.bk(this));
        if (!arrayList2.isEmpty()) {
            O6().add(this.f123641r);
            O6().addAll(arrayList2);
        }
        if (z17) {
            androidx.recyclerview.widget.c0 a17 = androidx.recyclerview.widget.h0.a(new com.tencent.mm.plugin.finder.profile.uic.ck(arrayList3, this), true);
            androidx.recyclerview.widget.RecyclerView recyclerView = P6().getRecyclerView();
            if (recyclerView == null || (adapter = recyclerView.getAdapter()) == null) {
                return;
            }
            a17.b(adapter);
        }
    }

    public final com.tencent.mm.plugin.finder.feed.model.FinderProfileFeedLoader getFeedLoader() {
        return (com.tencent.mm.plugin.finder.feed.model.FinderProfileFeedLoader) ((jz5.n) this.f123638o).getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.tencent.mm.plugin.finder.profile.uic.i6, com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        java.util.LinkedList list;
        r45.wj6 wj6Var;
        java.util.LinkedList list2;
        super.onCreate(bundle);
        r45.vj6 vj6Var = null;
        com.tencent.mm.plugin.finder.view.refresh.FinderProfileLoaderMoreFooter finderProfileLoaderMoreFooter = new com.tencent.mm.plugin.finder.view.refresh.FinderProfileLoaderMoreFooter(getActivity(), null);
        finderProfileLoaderMoreFooter.j(com.tencent.mm.R.layout.bsd);
        com.tencent.mm.plugin.finder.view.refresh.FinderProfileLoaderMoreHeader finderProfileLoaderMoreHeader = new com.tencent.mm.plugin.finder.view.refresh.FinderProfileLoaderMoreHeader(getActivity(), null);
        finderProfileLoaderMoreHeader.removeAllViews();
        android.view.View.inflate(finderProfileLoaderMoreHeader.getContext(), com.tencent.mm.R.layout.f489228dv4, finderProfileLoaderMoreHeader);
        com.tencent.mm.plugin.finder.feed.model.internal.Dispatcher.register$default(getFeedLoader(), this.f123646w, false, 2, null);
        getFeedLoader().getProgressUpdateOperator().a(v65.m.b(getActivity()));
        r45.zc1 zc1Var = (r45.zc1) ((jz5.n) this.f123639p).getValue();
        if (zc1Var != null && (list2 = zc1Var.getList(0)) != null) {
            java.util.Iterator it = list2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                java.lang.Object next = it.next();
                if (((r45.vj6) next).getInteger(0) == 3) {
                    vj6Var = next;
                    break;
                }
            }
            vj6Var = vj6Var;
        }
        int integer = (vj6Var == null || (list = vj6Var.getList(1)) == null || (wj6Var = (r45.wj6) kz5.n0.Z(list)) == null) ? 0 : wj6Var.getInteger(1);
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        pf5.z zVar = pf5.z.f353948a;
        int S6 = integer * ((com.tencent.mm.plugin.finder.profile.uic.FinderProfileAllLayoutUIC) zVar.a(activity).a(com.tencent.mm.plugin.finder.profile.uic.FinderProfileAllLayoutUIC.class)).S6(so2.u1.class);
        androidx.fragment.app.Fragment fragment = getFragment();
        kotlin.jvm.internal.o.d(fragment);
        androidx.lifecycle.c1 a17 = zVar.b(fragment).a(com.tencent.mm.plugin.finder.profile.uic.f4.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        com.tencent.mm.plugin.finder.profile.uic.f4 f4Var = (com.tencent.mm.plugin.finder.profile.uic.f4) a17;
        getFeedLoader().setJustWathcedCallback(new com.tencent.mm.plugin.finder.profile.uic.lj(S6, f4Var, this));
        getFeedLoader().setClickToLoadJustWatch(new com.tencent.mm.plugin.finder.profile.uic.mj(f4Var));
        f4Var.f123702z = new com.tencent.mm.plugin.finder.profile.uic.nj(this);
        getFeedLoader().setReadFeedId(java.lang.Long.valueOf(getIntent().getLongExtra("finder_read_feed_id", -1L)));
        getFeedLoader().setReadDupFlag(getIntent().getStringExtra("finder_read_feed_dup_flag"));
        getFeedLoader().setPoiInteractionInfo(f4Var.Y6());
        getFeedLoader().setJustWatchingCallback(new com.tencent.mm.plugin.finder.profile.uic.oj(this));
        getFeedLoader().setFetchEndCallback(new com.tencent.mm.plugin.finder.profile.uic.pj(this));
        getFeedLoader().setOnFetchCallback(new com.tencent.mm.plugin.finder.profile.uic.qj(this));
        getFeedLoader().setOnUserPageCgiSuccessCallback(new com.tencent.mm.plugin.finder.profile.uic.sj(this));
        getFeedLoader().setRefreshPullTopStatusCallback(new com.tencent.mm.plugin.finder.profile.uic.tj(this));
        P6().D(finderProfileLoaderMoreFooter);
        P6().F(finderProfileLoaderMoreHeader);
        P6().getCommonConfig().f330193c = false;
        P6().setOnSimpleAction(new com.tencent.mm.plugin.finder.profile.uic.uj(this));
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        getFeedLoader().unregister(this.f123646w);
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onResume() {
        getFeedLoader().getProgressUpdateOperator().b("UnlimitedUIC.onResume");
    }
}
