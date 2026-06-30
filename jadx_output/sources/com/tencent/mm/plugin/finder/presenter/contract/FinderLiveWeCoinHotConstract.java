package com.tencent.mm.plugin.finder.presenter.contract;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/finder/presenter/contract/FinderLiveWeCoinHotConstract;", "", "()V", "Presenter", "ViewCallback", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FinderLiveWeCoinHotConstract {

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/finder/presenter/contract/FinderLiveWeCoinHotConstract$Presenter;", "Lfs2/a;", "Lcom/tencent/mm/plugin/finder/presenter/contract/FinderLiveWeCoinHotConstract$ViewCallback;", "Companion", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes3.dex */
    public static final class Presenter implements fs2.a {

        /* renamed from: d, reason: collision with root package name */
        public final com.tencent.mm.plugin.finder.feed.model.FinderLiveWecoinHotLoader f122797d;

        /* renamed from: e, reason: collision with root package name */
        public com.tencent.mm.view.recyclerview.WxRecyclerAdapter f122798e;

        /* renamed from: f, reason: collision with root package name */
        public com.tencent.mm.plugin.finder.presenter.contract.FinderLiveWeCoinHotConstract.ViewCallback f122799f;

        /* renamed from: g, reason: collision with root package name */
        public final ym5.q1 f122800g;

        @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/finder/presenter/contract/FinderLiveWeCoinHotConstract$Presenter$Companion;", "", "()V", "TAG", "", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.i iVar) {
                this();
            }
        }

        static {
            new com.tencent.mm.plugin.finder.presenter.contract.FinderLiveWeCoinHotConstract.Presenter.Companion(null);
        }

        public Presenter(com.tencent.mm.plugin.finder.feed.model.FinderLiveWecoinHotLoader loader) {
            kotlin.jvm.internal.o.g(loader, "loader");
            this.f122797d = loader;
            this.f122800g = new ym5.q1() { // from class: com.tencent.mm.plugin.finder.presenter.contract.FinderLiveWeCoinHotConstract.Presenter.1
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

        public void c(final com.tencent.mm.plugin.finder.presenter.contract.FinderLiveWeCoinHotConstract.ViewCallback callback) {
            kotlin.jvm.internal.o.g(callback, "callback");
            in5.s sVar = new in5.s() { // from class: com.tencent.mm.plugin.finder.presenter.contract.FinderLiveWeCoinHotConstract$Presenter$onAttach$1
                @Override // in5.s
                public in5.r getItemConvert(int type) {
                    return new com.tencent.mm.plugin.finder.convert.zm();
                }
            };
            com.tencent.mm.plugin.finder.feed.model.FinderLiveWecoinHotLoader finderLiveWecoinHotLoader = this.f122797d;
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = new com.tencent.mm.view.recyclerview.WxRecyclerAdapter(sVar, finderLiveWecoinHotLoader.getDataListJustForAdapter(), false);
            wxRecyclerAdapter.f293105o = new in5.x() { // from class: com.tencent.mm.plugin.finder.presenter.contract.FinderLiveWeCoinHotConstract$Presenter$onAttach$2$1
                @Override // in5.x
                public void s2(androidx.recyclerview.widget.f2 adapter, android.view.View view, int i17, androidx.recyclerview.widget.k3 k3Var) {
                    com.tencent.mm.plugin.finder.live.widget.hp hpVar;
                    in5.s0 holder = (in5.s0) k3Var;
                    kotlin.jvm.internal.o.g(adapter, "adapter");
                    kotlin.jvm.internal.o.g(view, "view");
                    kotlin.jvm.internal.o.g(holder, "holder");
                    r45.xn1 xn1Var = (r45.xn1) ((so2.w2) holder.f293125i).f410691f.getCustom(0);
                    if (xn1Var != null) {
                        ((ml2.j0) i95.n0.c(ml2.j0.class)).Mj(ml2.p1.f327780f);
                        com.tencent.mm.plugin.finder.presenter.contract.FinderLiveWeCoinHotConstract.ViewCallback viewCallback = com.tencent.mm.plugin.finder.presenter.contract.FinderLiveWeCoinHotConstract.Presenter.this.f122799f;
                        if (viewCallback != null && (hpVar = viewCallback.f122814r) != null) {
                            hpVar.x0(xn1Var, (r16 & 2) != 0 ? "" : "", 0, (r16 & 8) != 0 ? null : null, false, (r16 & 32) != 0 ? "" : null);
                        }
                        ((ml2.j0) i95.n0.c(ml2.j0.class)).Mj(ml2.p1.f327781g);
                    }
                }
            };
            this.f122798e = wxRecyclerAdapter;
            finderLiveWecoinHotLoader.f107499i = new com.tencent.mm.plugin.finder.presenter.contract.FinderLiveWeCoinHotConstract$Presenter$onAttach$3(this);
            this.f122799f = callback;
            com.tencent.mm.ui.MMActivity mMActivity = callback.f122803d;
            android.view.View findViewById = mMActivity.findViewById(com.tencent.mm.R.id.fr6);
            kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
            callback.f122806g = (android.widget.RelativeLayout) findViewById;
            android.view.View findViewById2 = mMActivity.findViewById(com.tencent.mm.R.id.f484863fr5);
            kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
            callback.f122807h = findViewById2;
            android.view.View findViewById3 = mMActivity.findViewById(com.tencent.mm.R.id.f484862fr4);
            kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
            callback.f122808i = (android.widget.TextView) findViewById3;
            android.view.View findViewById4 = mMActivity.findViewById(com.tencent.mm.R.id.f484859fr1);
            kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
            callback.f122809m = (android.widget.RelativeLayout) findViewById4;
            android.view.View findViewById5 = mMActivity.findViewById(com.tencent.mm.R.id.f484861fr3);
            kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
            android.view.View findViewById6 = mMActivity.findViewById(com.tencent.mm.R.id.f484860fr2);
            kotlin.jvm.internal.o.f(findViewById6, "findViewById(...)");
            callback.f122810n = (com.tencent.mm.ui.widget.imageview.WeImageView) findViewById6;
            android.view.View findViewById7 = mMActivity.findViewById(com.tencent.mm.R.id.f484858fr0);
            kotlin.jvm.internal.o.f(findViewById7, "findViewById(...)");
            callback.f122811o = (android.widget.TextView) findViewById7;
            android.view.View findViewById8 = mMActivity.findViewById(com.tencent.mm.R.id.fqp);
            kotlin.jvm.internal.o.f(findViewById8, "findViewById(...)");
            callback.f122812p = (android.widget.TextView) findViewById8;
            android.view.View findViewById9 = mMActivity.findViewById(com.tencent.mm.R.id.fqx);
            kotlin.jvm.internal.o.f(findViewById9, "findViewById(...)");
            callback.f122813q = findViewById9;
            android.view.View findViewById10 = mMActivity.findViewById(com.tencent.mm.R.id.fqw);
            kotlin.jvm.internal.o.f(findViewById10, "findViewById(...)");
            callback.f122805f = (androidx.recyclerview.widget.RecyclerView) findViewById10;
            callback.a().setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(mMActivity));
            androidx.recyclerview.widget.RecyclerView a17 = callback.a();
            com.tencent.mm.plugin.finder.presenter.contract.FinderLiveWeCoinHotConstract.Presenter presenter = callback.f122804e;
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter2 = presenter.f122798e;
            if (wxRecyclerAdapter2 == null) {
                kotlin.jvm.internal.o.o("adapter");
                throw null;
            }
            a17.setAdapter(wxRecyclerAdapter2);
            android.widget.RelativeLayout relativeLayout = callback.f122809m;
            if (relativeLayout == null) {
                kotlin.jvm.internal.o.o("titleGroup");
                throw null;
            }
            relativeLayout.setVisibility(8);
            callback.a().setVisibility(8);
            android.widget.TextView textView = callback.f122812p;
            if (textView == null) {
                kotlin.jvm.internal.o.o("emptyTv");
                throw null;
            }
            textView.setVisibility(8);
            android.view.View view = callback.f122813q;
            if (view == null) {
                kotlin.jvm.internal.o.o("loadingView");
                throw null;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/presenter/contract/FinderLiveWeCoinHotConstract$ViewCallback", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/presenter/contract/FinderLiveWeCoinHotConstract$ViewCallback", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView = callback.f122810n;
            if (weImageView == null) {
                kotlin.jvm.internal.o.o("titleIv");
                throw null;
            }
            weImageView.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.tencent.mm.plugin.finder.presenter.contract.FinderLiveWeCoinHotConstract$ViewCallback$initView$1
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view2) {
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    arrayList2.add(view2);
                    java.lang.Object[] array = arrayList2.toArray();
                    arrayList2.clear();
                    yj0.a.b("com/tencent/mm/plugin/finder/presenter/contract/FinderLiveWeCoinHotConstract$ViewCallback$initView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                    android.content.Intent intent = new android.content.Intent();
                    com.tencent.mm.plugin.finder.presenter.contract.FinderLiveWeCoinHotConstract.ViewCallback viewCallback = com.tencent.mm.plugin.finder.presenter.contract.FinderLiveWeCoinHotConstract.ViewCallback.this;
                    intent.putExtra("rawUrl", kotlin.jvm.internal.o.b(viewCallback.f122804e.f122797d.f107498h, java.lang.Boolean.TRUE) ? "https://support.weixin.qq.com/cgi-bin/mmsupport-bin/newreadtemplate?t=support/we-coin/protocol/index#/base-protocol/v2" : "https://support.weixin.qq.com/cgi-bin/mmsupport-bin/newreadtemplate?t=support/we-coin/protocol/index");
                    j45.l.j(viewCallback.f122803d, "webview", ".ui.tools.WebViewUI", intent, null);
                    yj0.a.h(this, "com/tencent/mm/plugin/finder/presenter/contract/FinderLiveWeCoinHotConstract$ViewCallback$initView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                }
            });
            android.widget.RelativeLayout relativeLayout2 = callback.f122806g;
            if (relativeLayout2 == null) {
                kotlin.jvm.internal.o.o("topGroup");
                throw null;
            }
            android.view.ViewGroup.LayoutParams layoutParams = relativeLayout2.getLayoutParams();
            kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ((android.view.ViewGroup.MarginLayoutParams) layoutParams).topMargin += com.tencent.mm.ui.bl.h(mMActivity);
            android.view.View view2 = callback.f122807h;
            if (view2 == null) {
                kotlin.jvm.internal.o.o("topBackBtn");
                throw null;
            }
            view2.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.tencent.mm.plugin.finder.presenter.contract.FinderLiveWeCoinHotConstract$ViewCallback$initView$2
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view3) {
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    arrayList2.add(view3);
                    java.lang.Object[] array = arrayList2.toArray();
                    arrayList2.clear();
                    yj0.a.b("com/tencent/mm/plugin/finder/presenter/contract/FinderLiveWeCoinHotConstract$ViewCallback$initView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                    com.tencent.mm.plugin.finder.presenter.contract.FinderLiveWeCoinHotConstract.ViewCallback.this.f122803d.finish();
                    if (zl2.r4.f473950a.w1()) {
                        ml2.j0 j0Var = (ml2.j0) i95.n0.c(ml2.j0.class);
                        ml2.i1 i1Var = ml2.i1.f327548f;
                        ml2.p1 p1Var = ml2.p1.f327779e;
                        j0Var.Lj(i1Var, java.lang.String.valueOf(3));
                    }
                    yj0.a.h(this, "com/tencent/mm/plugin/finder/presenter/contract/FinderLiveWeCoinHotConstract$ViewCallback$initView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                }
            });
            android.widget.TextView textView2 = callback.f122808i;
            if (textView2 == null) {
                kotlin.jvm.internal.o.o("topActionTv");
                throw null;
            }
            textView2.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.tencent.mm.plugin.finder.presenter.contract.FinderLiveWeCoinHotConstract$ViewCallback$initView$3
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view3) {
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    arrayList2.add(view3);
                    java.lang.Object[] array = arrayList2.toArray();
                    arrayList2.clear();
                    yj0.a.b("com/tencent/mm/plugin/finder/presenter/contract/FinderLiveWeCoinHotConstract$ViewCallback$initView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                    if (zl2.r4.f473950a.w1()) {
                        ml2.j0 j0Var = (ml2.j0) i95.n0.c(ml2.j0.class);
                        ml2.i1 i1Var = ml2.i1.f327548f;
                        ml2.p1 p1Var = ml2.p1.f327779e;
                        j0Var.Lj(i1Var, java.lang.String.valueOf(2));
                    }
                    js4.i iVar = (js4.i) gm0.j1.s(js4.i.class);
                    com.tencent.mm.ui.MMActivity mMActivity2 = com.tencent.mm.plugin.finder.presenter.contract.FinderLiveWeCoinHotConstract.ViewCallback.this.f122803d;
                    java.lang.String Ai = ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ai();
                    if (Ai == null) {
                        Ai = "";
                    }
                    ((ms4.z) iVar).h(mMActivity2, null, Ai, 1, false, "");
                    yj0.a.h(this, "com/tencent/mm/plugin/finder/presenter/contract/FinderLiveWeCoinHotConstract$ViewCallback$initView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                }
            });
            android.content.Context context = ((android.view.ViewGroup) mMActivity.findViewById(com.tencent.mm.R.id.f_b)).getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            com.tencent.mm.plugin.finder.live.widget.hp hpVar = new com.tencent.mm.plugin.finder.live.widget.hp(context, null, null, 6, null);
            callback.f122814r = hpVar;
            hpVar.f0();
            hpVar.L = new com.tencent.mm.plugin.finder.presenter.contract.FinderLiveWeCoinHotConstract$ViewCallback$initView$4$1(callback, hpVar);
            presenter.f122797d.requestRefresh();
            com.tencent.mm.plugin.finder.feed.model.internal.Dispatcher.register$default(finderLiveWecoinHotLoader, this.f122800g, false, 2, null);
        }

        @Override // fs2.a
        public void onDetach() {
            com.tencent.mm.plugin.finder.live.widget.hp hpVar;
            this.f122797d.unregister(this.f122800g);
            com.tencent.mm.plugin.finder.presenter.contract.FinderLiveWeCoinHotConstract.ViewCallback viewCallback = this.f122799f;
            if (viewCallback == null || (hpVar = viewCallback.f122814r) == null) {
                return;
            }
            hpVar.g0();
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/tencent/mm/plugin/finder/presenter/contract/FinderLiveWeCoinHotConstract$ViewCallback;", "Lfs2/c;", "Lcom/tencent/mm/plugin/finder/presenter/contract/FinderLiveWeCoinHotConstract$Presenter;", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes3.dex */
    public static final class ViewCallback implements fs2.c {

        /* renamed from: d, reason: collision with root package name */
        public final com.tencent.mm.ui.MMActivity f122803d;

        /* renamed from: e, reason: collision with root package name */
        public final com.tencent.mm.plugin.finder.presenter.contract.FinderLiveWeCoinHotConstract.Presenter f122804e;

        /* renamed from: f, reason: collision with root package name */
        public androidx.recyclerview.widget.RecyclerView f122805f;

        /* renamed from: g, reason: collision with root package name */
        public android.widget.RelativeLayout f122806g;

        /* renamed from: h, reason: collision with root package name */
        public android.view.View f122807h;

        /* renamed from: i, reason: collision with root package name */
        public android.widget.TextView f122808i;

        /* renamed from: m, reason: collision with root package name */
        public android.widget.RelativeLayout f122809m;

        /* renamed from: n, reason: collision with root package name */
        public com.tencent.mm.ui.widget.imageview.WeImageView f122810n;

        /* renamed from: o, reason: collision with root package name */
        public android.widget.TextView f122811o;

        /* renamed from: p, reason: collision with root package name */
        public android.widget.TextView f122812p;

        /* renamed from: q, reason: collision with root package name */
        public android.view.View f122813q;

        /* renamed from: r, reason: collision with root package name */
        public com.tencent.mm.plugin.finder.live.widget.hp f122814r;

        public ViewCallback(com.tencent.mm.ui.MMActivity activity, com.tencent.mm.plugin.finder.presenter.contract.FinderLiveWeCoinHotConstract.Presenter presenter) {
            kotlin.jvm.internal.o.g(activity, "activity");
            kotlin.jvm.internal.o.g(presenter, "presenter");
            this.f122803d = activity;
            this.f122804e = presenter;
        }

        public final androidx.recyclerview.widget.RecyclerView a() {
            androidx.recyclerview.widget.RecyclerView recyclerView = this.f122805f;
            if (recyclerView != null) {
                return recyclerView;
            }
            kotlin.jvm.internal.o.o("wecoinRecyclerView");
            throw null;
        }

        @Override // fs2.c
        public com.tencent.mm.ui.MMFragmentActivity getActivity() {
            return this.f122803d;
        }
    }

    static {
        new com.tencent.mm.plugin.finder.presenter.contract.FinderLiveWeCoinHotConstract();
    }

    private FinderLiveWeCoinHotConstract() {
    }
}
