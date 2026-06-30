package com.tencent.mm.plugin.finder.presenter.contract;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/finder/presenter/contract/FinderLiveChargeIncomeContract;", "", "()V", "Presenter", "ViewCallback", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FinderLiveChargeIncomeContract {

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/finder/presenter/contract/FinderLiveChargeIncomeContract$Presenter;", "Lfs2/a;", "Lcom/tencent/mm/plugin/finder/presenter/contract/FinderLiveChargeIncomeContract$ViewCallback;", "Companion", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes3.dex */
    public static final class Presenter implements fs2.a {

        /* renamed from: d, reason: collision with root package name */
        public final com.tencent.mm.plugin.finder.feed.model.FinderLiveWecoinHotLoader f122716d;

        /* renamed from: e, reason: collision with root package name */
        public com.tencent.mm.view.recyclerview.WxRecyclerAdapter f122717e;

        /* renamed from: f, reason: collision with root package name */
        public com.tencent.mm.plugin.finder.presenter.contract.FinderLiveChargeIncomeContract.ViewCallback f122718f;

        /* renamed from: g, reason: collision with root package name */
        public final ym5.q1 f122719g;

        @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/finder/presenter/contract/FinderLiveChargeIncomeContract$Presenter$Companion;", "", "()V", "TAG", "", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.i iVar) {
                this();
            }
        }

        static {
            new com.tencent.mm.plugin.finder.presenter.contract.FinderLiveChargeIncomeContract.Presenter.Companion(null);
        }

        public Presenter(com.tencent.mm.plugin.finder.feed.model.FinderLiveWecoinHotLoader loader) {
            kotlin.jvm.internal.o.g(loader, "loader");
            this.f122716d = loader;
            this.f122719g = new ym5.q1() { // from class: com.tencent.mm.plugin.finder.presenter.contract.FinderLiveChargeIncomeContract.Presenter.1
                @Override // ym5.m1
                public void onChanged() {
                }

                @Override // ym5.m1
                public void onItemRangeChanged(int i17, int i18) {
                }

                @Override // ym5.m1
                public void onItemRangeInserted(int i17, int i18) {
                }

                @Override // ym5.m1
                public void onItemRangeMoved(int i17, int i18, int i19) {
                }

                @Override // ym5.m1
                public void onItemRangeRemoved(int i17, int i18) {
                }

                @Override // ym5.p1
                public void onPreFinishLoadMore(ym5.s3 reason) {
                    kotlin.jvm.internal.o.g(reason, "reason");
                }

                @Override // ym5.p1
                public void onPreFinishLoadMoreSmooth(ym5.s3 reason) {
                    kotlin.jvm.internal.o.g(reason, "reason");
                }

                @Override // ym5.p1
                public void onPreFinishRefresh(ym5.s3 reason) {
                    kotlin.jvm.internal.o.g(reason, "reason");
                }

                @Override // ym5.m1
                public void onItemRangeChanged(int i17, int i18, java.lang.Object obj) {
                }
            };
        }

        public void c(final com.tencent.mm.plugin.finder.presenter.contract.FinderLiveChargeIncomeContract.ViewCallback callback) {
            kotlin.jvm.internal.o.g(callback, "callback");
            in5.s sVar = new in5.s() { // from class: com.tencent.mm.plugin.finder.presenter.contract.FinderLiveChargeIncomeContract$Presenter$onAttach$1
                @Override // in5.s
                public in5.r getItemConvert(int type) {
                    return new com.tencent.mm.plugin.finder.convert.tl();
                }
            };
            com.tencent.mm.plugin.finder.feed.model.FinderLiveWecoinHotLoader finderLiveWecoinHotLoader = this.f122716d;
            this.f122717e = new com.tencent.mm.view.recyclerview.WxRecyclerAdapter(sVar, finderLiveWecoinHotLoader.getDataListJustForAdapter(), false);
            finderLiveWecoinHotLoader.f107499i = new com.tencent.mm.plugin.finder.presenter.contract.FinderLiveChargeIncomeContract$Presenter$onAttach$3(this);
            this.f122718f = callback;
            com.tencent.mm.ui.MMActivity mMActivity = callback.f122721d;
            android.view.View findViewById = mMActivity.findViewById(com.tencent.mm.R.id.eum);
            kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
            callback.f122724g = (android.widget.RelativeLayout) findViewById;
            android.view.View findViewById2 = mMActivity.findViewById(com.tencent.mm.R.id.eul);
            kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
            callback.f122725h = findViewById2;
            android.view.View findViewById3 = mMActivity.findViewById(com.tencent.mm.R.id.euk);
            kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
            callback.f122726i = (android.widget.TextView) findViewById3;
            android.view.View findViewById4 = mMActivity.findViewById(com.tencent.mm.R.id.eur);
            kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
            callback.f122727m = (android.widget.TextView) findViewById4;
            android.view.View findViewById5 = mMActivity.findViewById(com.tencent.mm.R.id.f483612bf3);
            kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
            callback.f122728n = (android.widget.TextView) findViewById5;
            android.view.View findViewById6 = mMActivity.findViewById(com.tencent.mm.R.id.euh);
            kotlin.jvm.internal.o.f(findViewById6, "findViewById(...)");
            callback.f122729o = findViewById6;
            android.view.View findViewById7 = mMActivity.findViewById(com.tencent.mm.R.id.eug);
            kotlin.jvm.internal.o.f(findViewById7, "findViewById(...)");
            androidx.recyclerview.widget.RecyclerView recyclerView = (androidx.recyclerview.widget.RecyclerView) findViewById7;
            callback.f122723f = recyclerView;
            recyclerView.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(mMActivity));
            androidx.recyclerview.widget.RecyclerView recyclerView2 = callback.f122723f;
            if (recyclerView2 == null) {
                kotlin.jvm.internal.o.o("chargeCustomerRecyclerView");
                throw null;
            }
            com.tencent.mm.plugin.finder.presenter.contract.FinderLiveChargeIncomeContract.Presenter presenter = callback.f122722e;
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = presenter.f122717e;
            if (wxRecyclerAdapter == null) {
                kotlin.jvm.internal.o.o("adapter");
                throw null;
            }
            recyclerView2.setAdapter(wxRecyclerAdapter);
            android.widget.RelativeLayout relativeLayout = callback.f122724g;
            if (relativeLayout == null) {
                kotlin.jvm.internal.o.o("topGroup");
                throw null;
            }
            android.view.ViewGroup.LayoutParams layoutParams = relativeLayout.getLayoutParams();
            kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ((android.view.ViewGroup.MarginLayoutParams) layoutParams).topMargin += com.tencent.mm.ui.bl.h(mMActivity);
            android.view.View view = callback.f122725h;
            if (view == null) {
                kotlin.jvm.internal.o.o("topBackBtn");
                throw null;
            }
            view.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.tencent.mm.plugin.finder.presenter.contract.FinderLiveChargeIncomeContract$ViewCallback$initView$1
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view2) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    arrayList.add(view2);
                    java.lang.Object[] array = arrayList.toArray();
                    arrayList.clear();
                    yj0.a.b("com/tencent/mm/plugin/finder/presenter/contract/FinderLiveChargeIncomeContract$ViewCallback$initView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                    com.tencent.mm.plugin.finder.presenter.contract.FinderLiveChargeIncomeContract.ViewCallback.this.f122721d.finish();
                    yj0.a.h(this, "com/tencent/mm/plugin/finder/presenter/contract/FinderLiveChargeIncomeContract$ViewCallback$initView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                }
            });
            android.widget.TextView textView = callback.f122726i;
            if (textView == null) {
                kotlin.jvm.internal.o.o("topActionTv");
                throw null;
            }
            textView.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.tencent.mm.plugin.finder.presenter.contract.FinderLiveChargeIncomeContract$ViewCallback$initView$2
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view2) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    arrayList.add(view2);
                    java.lang.Object[] array = arrayList.toArray();
                    arrayList.clear();
                    yj0.a.b("com/tencent/mm/plugin/finder/presenter/contract/FinderLiveChargeIncomeContract$ViewCallback$initView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                    js4.i iVar = (js4.i) gm0.j1.s(js4.i.class);
                    com.tencent.mm.ui.MMActivity mMActivity2 = com.tencent.mm.plugin.finder.presenter.contract.FinderLiveChargeIncomeContract.ViewCallback.this.f122721d;
                    java.lang.String Ai = ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ai();
                    if (Ai == null) {
                        Ai = "";
                    }
                    ((ms4.z) iVar).h(mMActivity2, null, Ai, 1, false, "");
                    yj0.a.h(this, "com/tencent/mm/plugin/finder/presenter/contract/FinderLiveChargeIncomeContract$ViewCallback$initView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                }
            });
            presenter.f122716d.requestRefresh();
            com.tencent.mm.plugin.finder.presenter.contract.FinderLiveChargeIncomeContract.ViewCallback viewCallback = presenter.f122718f;
            if (viewCallback != null) {
                android.view.View view2 = viewCallback.f122729o;
                if (view2 == null) {
                    kotlin.jvm.internal.o.o("loadingView");
                    throw null;
                }
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/finder/presenter/contract/FinderLiveChargeIncomeContract$ViewCallback", "showProgress", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/finder/presenter/contract/FinderLiveChargeIncomeContract$ViewCallback", "showProgress", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            com.tencent.mm.plugin.finder.feed.model.internal.Dispatcher.register$default(finderLiveWecoinHotLoader, this.f122719g, false, 2, null);
        }

        @Override // fs2.a
        public void onDetach() {
            this.f122716d.unregister(this.f122719g);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/tencent/mm/plugin/finder/presenter/contract/FinderLiveChargeIncomeContract$ViewCallback;", "Lfs2/c;", "Lcom/tencent/mm/plugin/finder/presenter/contract/FinderLiveChargeIncomeContract$Presenter;", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes3.dex */
    public static final class ViewCallback implements fs2.c {

        /* renamed from: d, reason: collision with root package name */
        public final com.tencent.mm.ui.MMActivity f122721d;

        /* renamed from: e, reason: collision with root package name */
        public final com.tencent.mm.plugin.finder.presenter.contract.FinderLiveChargeIncomeContract.Presenter f122722e;

        /* renamed from: f, reason: collision with root package name */
        public androidx.recyclerview.widget.RecyclerView f122723f;

        /* renamed from: g, reason: collision with root package name */
        public android.widget.RelativeLayout f122724g;

        /* renamed from: h, reason: collision with root package name */
        public android.view.View f122725h;

        /* renamed from: i, reason: collision with root package name */
        public android.widget.TextView f122726i;

        /* renamed from: m, reason: collision with root package name */
        public android.widget.TextView f122727m;

        /* renamed from: n, reason: collision with root package name */
        public android.widget.TextView f122728n;

        /* renamed from: o, reason: collision with root package name */
        public android.view.View f122729o;

        public ViewCallback(com.tencent.mm.ui.MMActivity activity, com.tencent.mm.plugin.finder.presenter.contract.FinderLiveChargeIncomeContract.Presenter presenter) {
            kotlin.jvm.internal.o.g(activity, "activity");
            kotlin.jvm.internal.o.g(presenter, "presenter");
            this.f122721d = activity;
            this.f122722e = presenter;
        }

        @Override // fs2.c
        public com.tencent.mm.ui.MMFragmentActivity getActivity() {
            return this.f122721d;
        }
    }

    static {
        new com.tencent.mm.plugin.finder.presenter.contract.FinderLiveChargeIncomeContract();
    }

    private FinderLiveChargeIncomeContract() {
    }
}
