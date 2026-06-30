package com.tencent.mm.plugin.finder.presenter.contract;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/finder/presenter/contract/BaseFinderLotteryContract;", "", "()V", "Presenter", "ViewCallback", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BaseFinderLotteryContract {

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/finder/presenter/contract/BaseFinderLotteryContract$Presenter;", "Lfs2/a;", "Lcom/tencent/mm/plugin/finder/presenter/contract/BaseFinderLotteryContract$ViewCallback;", "Companion", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes3.dex */
    public static abstract class Presenter implements fs2.a {

        /* renamed from: d, reason: collision with root package name */
        public final com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader f122551d;

        /* renamed from: e, reason: collision with root package name */
        public com.tencent.mm.view.recyclerview.WxRecyclerAdapter f122552e;

        /* renamed from: f, reason: collision with root package name */
        public com.tencent.mm.plugin.finder.presenter.contract.BaseFinderLotteryContract.ViewCallback f122553f;

        /* renamed from: g, reason: collision with root package name */
        public final ym5.q1 f122554g;

        @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/finder/presenter/contract/BaseFinderLotteryContract$Presenter$Companion;", "", "()V", "TAG", "", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.i iVar) {
                this();
            }
        }

        static {
            new com.tencent.mm.plugin.finder.presenter.contract.BaseFinderLotteryContract.Presenter.Companion(null);
        }

        public Presenter(com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader loader) {
            kotlin.jvm.internal.o.g(loader, "loader");
            this.f122551d = loader;
            this.f122554g = new ym5.q1() { // from class: com.tencent.mm.plugin.finder.presenter.contract.BaseFinderLotteryContract.Presenter.1
                @Override // ym5.m1
                public void onChanged() {
                    com.tencent.mm.plugin.finder.presenter.contract.BaseFinderLotteryContract.ViewCallback viewCallback = com.tencent.mm.plugin.finder.presenter.contract.BaseFinderLotteryContract.Presenter.this.f122553f;
                    if (viewCallback != null) {
                        viewCallback.a().onChanged();
                    }
                }

                @Override // ym5.m1
                public void onItemRangeChanged(int i17, int i18) {
                    com.tencent.mm.plugin.finder.presenter.contract.BaseFinderLotteryContract.Presenter presenter = com.tencent.mm.plugin.finder.presenter.contract.BaseFinderLotteryContract.Presenter.this;
                    com.tencent.mm.plugin.finder.presenter.contract.BaseFinderLotteryContract.ViewCallback viewCallback = presenter.f122553f;
                    if (viewCallback != null) {
                        viewCallback.a().onItemRangeChanged(i17 + presenter.f().a0(), i18);
                    }
                }

                @Override // ym5.m1
                public void onItemRangeInserted(int i17, int i18) {
                    com.tencent.mm.plugin.finder.presenter.contract.BaseFinderLotteryContract.Presenter presenter = com.tencent.mm.plugin.finder.presenter.contract.BaseFinderLotteryContract.Presenter.this;
                    com.tencent.mm.plugin.finder.presenter.contract.BaseFinderLotteryContract.ViewCallback viewCallback = presenter.f122553f;
                    if (viewCallback != null) {
                        viewCallback.a().onItemRangeInserted(i17 + presenter.f().a0(), i18);
                    }
                }

                @Override // ym5.m1
                public void onItemRangeMoved(int i17, int i18, int i19) {
                    com.tencent.mm.plugin.finder.presenter.contract.BaseFinderLotteryContract.Presenter presenter = com.tencent.mm.plugin.finder.presenter.contract.BaseFinderLotteryContract.Presenter.this;
                    com.tencent.mm.plugin.finder.presenter.contract.BaseFinderLotteryContract.ViewCallback viewCallback = presenter.f122553f;
                    if (viewCallback != null) {
                        viewCallback.a().onItemRangeMoved(i17 + presenter.f().a0(), i18 + presenter.f().a0(), i19);
                    }
                }

                @Override // ym5.m1
                public void onItemRangeRemoved(int i17, int i18) {
                    com.tencent.mm.plugin.finder.presenter.contract.BaseFinderLotteryContract.Presenter presenter = com.tencent.mm.plugin.finder.presenter.contract.BaseFinderLotteryContract.Presenter.this;
                    com.tencent.mm.plugin.finder.presenter.contract.BaseFinderLotteryContract.ViewCallback viewCallback = presenter.f122553f;
                    if (viewCallback != null) {
                        viewCallback.a().onItemRangeRemoved(i17 + presenter.f().a0(), i18);
                    }
                }

                @Override // ym5.p1
                public void onPreFinishLoadMore(ym5.s3 reason) {
                    kotlin.jvm.internal.o.g(reason, "reason");
                    com.tencent.mm.plugin.finder.presenter.contract.BaseFinderLotteryContract.ViewCallback viewCallback = com.tencent.mm.plugin.finder.presenter.contract.BaseFinderLotteryContract.Presenter.this.f122553f;
                    if (viewCallback != null) {
                        viewCallback.a().O(reason);
                    }
                }

                @Override // ym5.p1
                public void onPreFinishLoadMoreSmooth(ym5.s3 reason) {
                    kotlin.jvm.internal.o.g(reason, "reason");
                    com.tencent.mm.plugin.finder.presenter.contract.BaseFinderLotteryContract.ViewCallback viewCallback = com.tencent.mm.plugin.finder.presenter.contract.BaseFinderLotteryContract.Presenter.this.f122553f;
                    if (viewCallback != null) {
                        viewCallback.a().onPreFinishLoadMoreSmooth(reason);
                    }
                }

                @Override // ym5.p1
                public void onPreFinishRefresh(ym5.s3 reason) {
                    kotlin.jvm.internal.o.g(reason, "reason");
                    com.tencent.mm.plugin.finder.presenter.contract.BaseFinderLotteryContract.ViewCallback viewCallback = com.tencent.mm.plugin.finder.presenter.contract.BaseFinderLotteryContract.Presenter.this.f122553f;
                    if (viewCallback != null) {
                        viewCallback.a().Q(reason);
                    }
                }

                @Override // ym5.m1
                public void onItemRangeChanged(int i17, int i18, java.lang.Object obj) {
                    com.tencent.mm.plugin.finder.presenter.contract.BaseFinderLotteryContract.Presenter presenter = com.tencent.mm.plugin.finder.presenter.contract.BaseFinderLotteryContract.Presenter.this;
                    com.tencent.mm.plugin.finder.presenter.contract.BaseFinderLotteryContract.ViewCallback viewCallback = presenter.f122553f;
                    if (viewCallback != null) {
                        viewCallback.a().onItemRangeChanged(i17 + presenter.f().a0(), i18, obj);
                    }
                }
            };
        }

        public abstract com.tencent.mm.view.recyclerview.WxRecyclerAdapter c();

        public final com.tencent.mm.view.recyclerview.WxRecyclerAdapter f() {
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = this.f122552e;
            if (wxRecyclerAdapter != null) {
                return wxRecyclerAdapter;
            }
            kotlin.jvm.internal.o.o("adapter");
            throw null;
        }

        public void g(final com.tencent.mm.plugin.finder.presenter.contract.BaseFinderLotteryContract.ViewCallback callback) {
            kotlin.jvm.internal.o.g(callback, "callback");
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter c17 = c();
            kotlin.jvm.internal.o.g(c17, "<set-?>");
            this.f122552e = c17;
            this.f122553f = callback;
            com.tencent.mm.ui.MMActivity mMActivity = callback.f122556d;
            android.view.View findViewById = mMActivity.findViewById(com.tencent.mm.R.id.m6e);
            kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
            callback.f122558f = (com.tencent.mm.view.RefreshLoadMoreLayout) findViewById;
            callback.a().setEnableRefresh(false);
            final androidx.recyclerview.widget.RecyclerView recyclerView = callback.a().getRecyclerView();
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).pk(recyclerView, "finder_live_lottery_record_view");
            recyclerView.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(mMActivity));
            recyclerView.setAdapter(callback.f122557e.f());
            callback.a().setActionCallback(new ym5.q3() { // from class: com.tencent.mm.plugin.finder.presenter.contract.BaseFinderLotteryContract$ViewCallback$initView$1
                @Override // ym5.q3
                public void b(int i17) {
                    com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader.requestLoadMore$default(com.tencent.mm.plugin.finder.presenter.contract.BaseFinderLotteryContract.ViewCallback.this.f122557e.f122551d, false, 1, null);
                }

                @Override // ym5.q3
                public void c(ym5.s3 reason) {
                    kotlin.jvm.internal.o.g(reason, "reason");
                }

                @Override // ym5.q3
                public void d(int i17, rn5.a aVar, boolean z17) {
                    com.tencent.mm.plugin.finder.presenter.contract.BaseFinderLotteryContract.ViewCallback.this.f122557e.f122551d.requestRefresh();
                    ((c61.p2) ((c61.yb) i95.n0.c(c61.yb.class))).getClass();
                    recyclerView.setItemAnimator(new uw2.n0());
                }

                @Override // ym5.q3
                public void e(ym5.s3 reason) {
                    kotlin.jvm.internal.o.g(reason, "reason");
                    com.tencent.mm.plugin.finder.presenter.contract.BaseFinderLotteryContract.ViewCallback viewCallback = com.tencent.mm.plugin.finder.presenter.contract.BaseFinderLotteryContract.ViewCallback.this;
                    com.tencent.mm.view.RefreshLoadMoreLayout.u(viewCallback.a(), null, 1, null);
                    final androidx.recyclerview.widget.RecyclerView recyclerView2 = recyclerView;
                    recyclerView2.postDelayed(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.finder.presenter.contract.BaseFinderLotteryContract$ViewCallback$initView$1$onRefreshEnd$1
                        @Override // java.lang.Runnable
                        public final void run() {
                            androidx.recyclerview.widget.RecyclerView.this.setItemAnimator(new androidx.recyclerview.widget.z());
                        }
                    }, 1000L);
                    viewCallback.g(false);
                }
            });
            callback.g(true);
            pm0.v.V(300L, new com.tencent.mm.plugin.finder.presenter.contract.BaseFinderLotteryContract$ViewCallback$initView$2(callback));
            com.tencent.mm.plugin.finder.feed.model.internal.Dispatcher.register$default(this.f122551d, this.f122554g, false, 2, null);
        }

        @Override // fs2.a
        public void onDetach() {
            this.f122551d.unregister(this.f122554g);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/tencent/mm/plugin/finder/presenter/contract/BaseFinderLotteryContract$ViewCallback;", "Lfs2/c;", "Lcom/tencent/mm/plugin/finder/presenter/contract/BaseFinderLotteryContract$Presenter;", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes3.dex */
    public static class ViewCallback implements fs2.c {

        /* renamed from: d, reason: collision with root package name */
        public final com.tencent.mm.ui.MMActivity f122556d;

        /* renamed from: e, reason: collision with root package name */
        public final com.tencent.mm.plugin.finder.presenter.contract.BaseFinderLotteryContract.Presenter f122557e;

        /* renamed from: f, reason: collision with root package name */
        public com.tencent.mm.view.RefreshLoadMoreLayout f122558f;

        public ViewCallback(com.tencent.mm.ui.MMActivity activity, com.tencent.mm.plugin.finder.presenter.contract.BaseFinderLotteryContract.Presenter presenter, boolean z17) {
            kotlin.jvm.internal.o.g(activity, "activity");
            kotlin.jvm.internal.o.g(presenter, "presenter");
            this.f122556d = activity;
            this.f122557e = presenter;
        }

        public final com.tencent.mm.view.RefreshLoadMoreLayout a() {
            com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout = this.f122558f;
            if (refreshLoadMoreLayout != null) {
                return refreshLoadMoreLayout;
            }
            kotlin.jvm.internal.o.o("rlLayout");
            throw null;
        }

        public final void g(boolean z17) {
            android.view.View findViewById = this.f122556d.findViewById(com.tencent.mm.R.id.irl);
            if (findViewById == null) {
                return;
            }
            int i17 = z17 ? 0 : 8;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Integer.valueOf(i17));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/presenter/contract/BaseFinderLotteryContract$ViewCallback", "showProgress", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/presenter/contract/BaseFinderLotteryContract$ViewCallback", "showProgress", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }

        @Override // fs2.c
        public com.tencent.mm.ui.MMFragmentActivity getActivity() {
            return this.f122556d;
        }
    }

    static {
        new com.tencent.mm.plugin.finder.presenter.contract.BaseFinderLotteryContract();
    }

    private BaseFinderLotteryContract() {
    }
}
