package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class mn extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public long f135179d;

    /* renamed from: e, reason: collision with root package name */
    public int f135180e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f135181f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f135182g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.feed.bc f135183h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.feed.cc f135184i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.feed.model.FinderFeedShareRelativeListLoader f135185m;

    /* renamed from: n, reason: collision with root package name */
    public so2.u1 f135186n;

    /* renamed from: o, reason: collision with root package name */
    public final int f135187o;

    /* renamed from: p, reason: collision with root package name */
    public final jz5.g f135188p;

    /* renamed from: q, reason: collision with root package name */
    public final jz5.g f135189q;

    /* renamed from: r, reason: collision with root package name */
    public com.tencent.mm.view.recyclerview.WxRecyclerAdapter f135190r;

    /* renamed from: s, reason: collision with root package name */
    public final jz5.g f135191s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mn(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f135180e = 1;
        this.f135181f = "";
        this.f135182g = "";
        android.app.Activity context = getContext();
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
        this.f135187o = nyVar != null ? nyVar.f135380n : 0;
        this.f135188p = jz5.h.b(new com.tencent.mm.plugin.finder.viewmodel.component.zm(this));
        this.f135189q = jz5.h.b(new com.tencent.mm.plugin.finder.viewmodel.component.kn(this));
        this.f135191s = jz5.h.b(new com.tencent.mm.plugin.finder.viewmodel.component.sm(this));
    }

    public static final void O6(com.tencent.mm.plugin.finder.viewmodel.component.mn mnVar, boolean z17) {
        mnVar.getClass();
        com.tencent.mars.xlog.Log.i("FinderHorizontalVideoNewFormUIC", "showRetryTips ifShow:" + z17);
        android.view.View findViewById = mnVar.getContext().findViewById(com.tencent.mm.R.id.m2d);
        if (findViewById != null) {
            if (!z17) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderHorizontalVideoNewFormUIC", "showRetryTips", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/viewmodel/component/FinderHorizontalVideoNewFormUIC", "showRetryTips", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderHorizontalVideoNewFormUIC", "showRetryTips", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/viewmodel/component/FinderHorizontalVideoNewFormUIC", "showRetryTips", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setOnClickListener(new com.tencent.mm.plugin.finder.viewmodel.component.ln(mnVar, findViewById));
        }
    }

    public final void P6(com.tencent.mm.plugin.finder.model.BaseFinderFeed feed) {
        androidx.recyclerview.widget.f2 adapter;
        java.util.AbstractCollection dataList;
        java.util.AbstractCollection dataList2;
        kotlin.jvm.internal.o.g(feed, "feed");
        com.tencent.mm.plugin.finder.feed.bc bcVar = this.f135183h;
        if (bcVar == null) {
            kotlin.jvm.internal.o.o("presenter");
            throw null;
        }
        com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader baseFeedLoader = bcVar.f106570t;
        if (baseFeedLoader != null && (dataList2 = baseFeedLoader.getDataList()) != null) {
            dataList2.clear();
        }
        com.tencent.mm.plugin.finder.feed.bc bcVar2 = this.f135183h;
        if (bcVar2 == null) {
            kotlin.jvm.internal.o.o("presenter");
            throw null;
        }
        com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader baseFeedLoader2 = bcVar2.f106570t;
        if (baseFeedLoader2 != null && (dataList = baseFeedLoader2.getDataList()) != null) {
            dataList.add(feed);
        }
        com.tencent.mm.plugin.finder.feed.cc ccVar = this.f135184i;
        if (ccVar == null) {
            kotlin.jvm.internal.o.o("viewCallback");
            throw null;
        }
        androidx.recyclerview.widget.RecyclerView recyclerView = ccVar.getRecyclerView();
        if (recyclerView != null && (adapter = recyclerView.getAdapter()) != null) {
            adapter.notifyDataSetChanged();
        }
        this.f135179d = feed.getItemId();
        S6().f107433d = feed.getFeedObject().getId();
        S6().d(feed.getFeedObject().getObjectNonceId());
        S6().getDataListJustForAdapter().clear();
        androidx.recyclerview.widget.f2 adapter2 = T6().getRecyclerView().getAdapter();
        if (adapter2 != null) {
            adapter2.notifyDataSetChanged();
        }
        S6().requestRefresh();
        V6(true);
    }

    public final android.view.View Q6() {
        return (android.view.View) ((jz5.n) this.f135188p).getValue();
    }

    public final in5.s0 R6() {
        com.tencent.mm.plugin.finder.feed.cc ccVar = this.f135184i;
        if (ccVar == null) {
            return null;
        }
        if (ccVar == null) {
            kotlin.jvm.internal.o.o("viewCallback");
            throw null;
        }
        androidx.recyclerview.widget.RecyclerView recyclerView = ccVar.getRecyclerView();
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager finderLinearLayoutManager = layoutManager instanceof com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager ? (com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager) layoutManager : null;
        if (finderLinearLayoutManager == null) {
            return null;
        }
        int w17 = finderLinearLayoutManager.w();
        com.tencent.mars.xlog.Log.i("FinderHorizontalVideoNewFormUIC", "getCurrentVideoHolder: pos=" + w17);
        androidx.recyclerview.widget.k3 p07 = recyclerView.p0(w17);
        if (p07 instanceof in5.s0) {
            return (in5.s0) p07;
        }
        return null;
    }

    public final com.tencent.mm.plugin.finder.feed.model.FinderFeedShareRelativeListLoader S6() {
        com.tencent.mm.plugin.finder.feed.model.FinderFeedShareRelativeListLoader finderFeedShareRelativeListLoader = this.f135185m;
        if (finderFeedShareRelativeListLoader != null) {
            return finderFeedShareRelativeListLoader;
        }
        kotlin.jvm.internal.o.o("recommendFeedLoader");
        throw null;
    }

    public final com.tencent.mm.view.RefreshLoadMoreLayout T6() {
        java.lang.Object value = ((jz5.n) this.f135189q).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (com.tencent.mm.view.RefreshLoadMoreLayout) value;
    }

    public final void U6() {
        com.tencent.mm.plugin.finder.viewmodel.component.in inVar = new com.tencent.mm.plugin.finder.viewmodel.component.in(this);
        com.tencent.mm.plugin.finder.viewmodel.component.jn jnVar = new com.tencent.mm.plugin.finder.viewmodel.component.jn(this);
        if (((com.tencent.mm.plugin.finder.storage.mj0) ((zy2.qb) i95.n0.c(zy2.qb.class))).Ai() && ((java.lang.Number) com.tencent.mm.plugin.finder.storage.t70.f127590a.O().r()).intValue() == 1) {
            pm0.v.X(new com.tencent.mm.plugin.finder.viewmodel.component.fn(jnVar, this));
            return;
        }
        long j17 = this.f135179d;
        java.lang.String str = this.f135182g;
        int i17 = this.f135187o;
        java.lang.String str2 = this.f135181f;
        android.app.Activity context = getContext();
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
        pq5.g l17 = new db2.g4(j17, str, i17, 2, "", true, null, null, 0L, null, false, false, str2, nyVar != null ? nyVar.V6() : null, 0, null, false, null, null, null, null, null, 0, 0, null, null, true, null, null, 469749696, null).l();
        android.app.Activity context2 = getContext();
        kotlin.jvm.internal.o.e(context2, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        l17.f((com.tencent.mm.ui.MMActivity) context2);
        l17.h(new com.tencent.mm.plugin.finder.viewmodel.component.hn(this, jnVar, inVar));
    }

    public final void V6(boolean z17) {
        android.view.View findViewById = getContext().findViewById(com.tencent.mm.R.id.iql);
        if (findViewById != null) {
            int i17 = z17 ? 0 : 8;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Integer.valueOf(i17));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderHorizontalVideoNewFormUIC", "setRelativeListProgressVisible", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/viewmodel/component/FinderHorizontalVideoNewFormUIC", "setRelativeListProgressVisible", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    public final void W6(boolean z17) {
        android.view.View findViewById = getContext().findViewById(com.tencent.mm.R.id.mst);
        if (findViewById == null) {
            return;
        }
        int i17 = z17 ? 0 : 8;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderHorizontalVideoNewFormUIC", "showProgress", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/viewmodel/component/FinderHorizontalVideoNewFormUIC", "showProgress", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
