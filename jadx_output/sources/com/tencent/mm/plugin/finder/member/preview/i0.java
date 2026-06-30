package com.tencent.mm.plugin.finder.member.preview;

/* loaded from: classes2.dex */
public final class i0 extends com.tencent.mm.plugin.finder.feed.k0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(com.tencent.mm.ui.MMActivity context, int i17, int i18, com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader loader) {
        super(context, i17, i18, loader);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(loader, "loader");
        com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader baseFeedLoader = this.f107156e;
        com.tencent.mm.plugin.finder.member.preview.FinderPreviewFeedListLoader finderPreviewFeedListLoader = baseFeedLoader instanceof com.tencent.mm.plugin.finder.member.preview.FinderPreviewFeedListLoader ? (com.tencent.mm.plugin.finder.member.preview.FinderPreviewFeedListLoader) baseFeedLoader : null;
        if (finderPreviewFeedListLoader == null) {
            return;
        }
        finderPreviewFeedListLoader.f121164h = new com.tencent.mm.plugin.finder.member.preview.g0(this, context);
    }

    @Override // com.tencent.mm.plugin.finder.feed.k0
    public in5.s c() {
        com.tencent.mm.plugin.finder.feed.a1 a1Var = this.f107157f;
        com.tencent.mm.plugin.finder.storage.vj0 q17 = a1Var != null ? a1Var.q() : null;
        kotlin.jvm.internal.o.d(q17);
        return q17.a();
    }

    @Override // com.tencent.mm.plugin.finder.feed.k0
    public void g() {
        com.tencent.mm.plugin.finder.feed.a1 a1Var = this.f107157f;
        if (a1Var != null) {
            a1Var.r(this.f107156e.getDataListJustForAdapter());
        }
    }

    @Override // com.tencent.mm.plugin.finder.feed.k0
    public void h() {
        com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader.requestInit$default(this.f107156e, false, 1, null);
    }

    @Override // com.tencent.mm.plugin.finder.feed.k0
    public void i() {
        com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader.requestLoadMore$default(this.f107156e, false, 1, null);
        pm0.v.X(new com.tencent.mm.plugin.finder.member.preview.h0(this));
    }

    @Override // com.tencent.mm.plugin.finder.feed.k0
    public void onRefreshEnd(ym5.s3 reason) {
        kotlin.jvm.internal.o.g(reason, "reason");
        if (reason.f463521f) {
            return;
        }
        com.tencent.mm.plugin.finder.feed.a1 a1Var = this.f107157f;
        com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout = a1Var != null ? a1Var.f106180m : null;
        if (refreshLoadMoreLayout != null) {
            refreshLoadMoreLayout.setHasBottomMore(false);
        }
        y();
    }

    @Override // com.tencent.mm.plugin.finder.feed.k0
    public void p(ym5.s3 reason) {
        com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout;
        kotlin.jvm.internal.o.g(reason, "reason");
        if (!reason.f463521f) {
            y();
            return;
        }
        com.tencent.mm.plugin.finder.feed.a1 a1Var = this.f107157f;
        android.view.View findViewById = (a1Var == null || (refreshLoadMoreLayout = a1Var.f106180m) == null) ? null : refreshLoadMoreLayout.findViewById(com.tencent.mm.R.id.ilh);
        if (findViewById == null) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/member/preview/FinderPreviewFeedListContract$FeedListPresenter", "onLoadMoreEnd", "(Lcom/tencent/mm/view/RefreshLoadMoreLayout$MoreReason;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/member/preview/FinderPreviewFeedListContract$FeedListPresenter", "onLoadMoreEnd", "(Lcom/tencent/mm/view/RefreshLoadMoreLayout$MoreReason;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // com.tencent.mm.plugin.finder.feed.k0
    public void v() {
        this.f107156e.requestRefresh();
    }

    public final void y() {
        com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout;
        com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout2;
        com.tencent.mm.plugin.finder.feed.a1 a1Var = this.f107157f;
        android.view.View view = null;
        android.view.View findViewById = (a1Var == null || (refreshLoadMoreLayout2 = a1Var.f106180m) == null) ? null : refreshLoadMoreLayout2.findViewById(com.tencent.mm.R.id.ilg);
        if (findViewById != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/member/preview/FinderPreviewFeedListContract$FeedListPresenter", "setLoadMoreEndState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/member/preview/FinderPreviewFeedListContract$FeedListPresenter", "setLoadMoreEndState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.tencent.mm.plugin.finder.feed.a1 a1Var2 = this.f107157f;
        if (a1Var2 != null && (refreshLoadMoreLayout = a1Var2.f106180m) != null) {
            view = refreshLoadMoreLayout.findViewById(com.tencent.mm.R.id.ilh);
        }
        if (view == null) {
            return;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/finder/member/preview/FinderPreviewFeedListContract$FeedListPresenter", "setLoadMoreEndState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/member/preview/FinderPreviewFeedListContract$FeedListPresenter", "setLoadMoreEndState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
