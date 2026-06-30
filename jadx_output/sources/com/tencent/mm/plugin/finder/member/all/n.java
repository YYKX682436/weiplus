package com.tencent.mm.plugin.finder.member.all;

/* loaded from: classes2.dex */
public final class n extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.feed.model.FinderMemberAllFeedLoader f121098d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.member.all.m f121099e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.member.all.q f121100f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f121101g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(androidx.fragment.app.Fragment fragment) {
        super(fragment);
        kotlin.jvm.internal.o.g(fragment, "fragment");
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public int getLayoutId() {
        return com.tencent.mm.R.layout.dcb;
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        java.lang.String str;
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        r45.qt2 V6 = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6();
        androidx.fragment.app.Fragment fragment = getFragment();
        com.tencent.mm.plugin.finder.member.ui.FinderMemberAllSubTabFragment finderMemberAllSubTabFragment = fragment instanceof com.tencent.mm.plugin.finder.member.ui.FinderMemberAllSubTabFragment ? (com.tencent.mm.plugin.finder.member.ui.FinderMemberAllSubTabFragment) fragment : null;
        if (finderMemberAllSubTabFragment == null || (str = finderMemberAllSubTabFragment.f121384t) == null) {
            str = "";
        }
        java.lang.String str2 = str;
        androidx.fragment.app.Fragment fragment2 = getFragment();
        com.tencent.mm.plugin.finder.member.ui.FinderMemberAllSubTabFragment finderMemberAllSubTabFragment2 = fragment2 instanceof com.tencent.mm.plugin.finder.member.ui.FinderMemberAllSubTabFragment ? (com.tencent.mm.plugin.finder.member.ui.FinderMemberAllSubTabFragment) fragment2 : null;
        int i17 = finderMemberAllSubTabFragment2 != null ? finderMemberAllSubTabFragment2.f129265p : 0;
        this.f121098d = new com.tencent.mm.plugin.finder.feed.model.FinderMemberAllFeedLoader(V6, str2, xy2.c.e(getContext()), null, i17 == 10 ? 1 : 0);
        androidx.appcompat.app.AppCompatActivity activity2 = getActivity();
        kotlin.jvm.internal.o.e(activity2, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        com.tencent.mm.ui.MMActivity mMActivity = (com.tencent.mm.ui.MMActivity) activity2;
        com.tencent.mm.plugin.finder.feed.model.FinderMemberAllFeedLoader finderMemberAllFeedLoader = this.f121098d;
        if (finderMemberAllFeedLoader == null) {
            kotlin.jvm.internal.o.o("feedLoader");
            throw null;
        }
        this.f121099e = new com.tencent.mm.plugin.finder.member.all.m(mMActivity, str2, finderMemberAllFeedLoader);
        androidx.appcompat.app.AppCompatActivity activity3 = getActivity();
        kotlin.jvm.internal.o.e(activity3, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        com.tencent.mm.ui.MMActivity mMActivity2 = (com.tencent.mm.ui.MMActivity) activity3;
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.qny);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        com.tencent.mm.plugin.finder.member.all.m mVar = this.f121099e;
        if (mVar == null) {
            kotlin.jvm.internal.o.o("presenter");
            throw null;
        }
        final com.tencent.mm.plugin.finder.member.all.q qVar = new com.tencent.mm.plugin.finder.member.all.q(mMActivity2, findViewById, mVar, str2, i17);
        this.f121100f = qVar;
        android.view.View view = qVar.f121104d;
        android.view.View findViewById2 = view.findViewById(com.tencent.mm.R.id.f484229dg3);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        qVar.f121109i = findViewById2;
        android.view.View findViewById3 = view.findViewById(com.tencent.mm.R.id.lbi);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        qVar.f121110m = findViewById3;
        android.view.View findViewById4 = view.findViewById(com.tencent.mm.R.id.m2g);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        qVar.f121111n = findViewById4;
        android.view.View findViewById5 = view.findViewById(com.tencent.mm.R.id.dft);
        kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
        qVar.f121112o = findViewById5;
        android.view.View findViewById6 = view.findViewById(com.tencent.mm.R.id.q0u);
        kotlin.jvm.internal.o.f(findViewById6, "findViewById(...)");
        qVar.f121113p = (com.tencent.mm.plugin.finder.view.FinderRefreshLayout) findViewById6;
        android.view.View findViewById7 = view.findViewById(com.tencent.mm.R.id.q0t);
        kotlin.jvm.internal.o.f(findViewById7, "findViewById(...)");
        qVar.f121114q = (androidx.recyclerview.widget.RecyclerView) findViewById7;
        android.view.View findViewById8 = view.findViewById(com.tencent.mm.R.id.ilg);
        kotlin.jvm.internal.o.f(findViewById8, "findViewById(...)");
        qVar.f121115r = findViewById8;
        qVar.f121116s = new com.tencent.mm.plugin.finder.member.convert.c(qVar.f121105e, qVar.f121108h, qVar.f121106f, false, qVar.f121107g);
        androidx.recyclerview.widget.RecyclerView recyclerView = qVar.f121114q;
        if (recyclerView == null) {
            kotlin.jvm.internal.o.o("recyclerView");
            throw null;
        }
        recyclerView.setItemAnimator(null);
        androidx.recyclerview.widget.RecyclerView recyclerView2 = qVar.f121114q;
        if (recyclerView2 == null) {
            kotlin.jvm.internal.o.o("recyclerView");
            throw null;
        }
        com.tencent.mm.plugin.finder.member.convert.c cVar = qVar.f121116s;
        if (cVar == null) {
            kotlin.jvm.internal.o.o("config");
            throw null;
        }
        recyclerView2.setLayoutManager(cVar.d(qVar.f121108h));
        androidx.recyclerview.widget.RecyclerView recyclerView3 = qVar.f121114q;
        if (recyclerView3 == null) {
            kotlin.jvm.internal.o.o("recyclerView");
            throw null;
        }
        com.tencent.mm.plugin.finder.member.convert.c cVar2 = qVar.f121116s;
        if (cVar2 == null) {
            kotlin.jvm.internal.o.o("config");
            throw null;
        }
        recyclerView3.N(cVar2.c());
        androidx.recyclerview.widget.RecyclerView recyclerView4 = qVar.f121114q;
        if (recyclerView4 == null) {
            kotlin.jvm.internal.o.o("recyclerView");
            throw null;
        }
        recyclerView4.setAdapter(new com.tencent.mm.view.recyclerview.WxRecyclerAdapter(new in5.s() { // from class: com.tencent.mm.plugin.finder.member.all.FinderMemberAllViewCallback$initRecycleView$1
            @Override // in5.s
            public in5.r getItemConvert(int type) {
                com.tencent.mm.plugin.finder.member.convert.c cVar3 = com.tencent.mm.plugin.finder.member.all.q.this.f121116s;
                if (cVar3 != null) {
                    return cVar3.b(null).getItemConvert(type);
                }
                kotlin.jvm.internal.o.o("config");
                throw null;
            }
        }, qVar.f121105e.f121090f.getDataList(), false));
        qVar.a().setOnSimpleAction(new com.tencent.mm.plugin.finder.member.all.o(qVar));
        com.tencent.mm.plugin.finder.member.all.m mVar2 = this.f121099e;
        if (mVar2 == null) {
            kotlin.jvm.internal.o.o("presenter");
            throw null;
        }
        com.tencent.mm.plugin.finder.member.all.q qVar2 = this.f121100f;
        if (qVar2 == null) {
            kotlin.jvm.internal.o.o("viewCallback");
            throw null;
        }
        mVar2.f121091g = qVar2;
        mVar2.f121092h = new com.tencent.mm.plugin.finder.member.all.a(mVar2, qVar2.a());
        com.tencent.mm.plugin.finder.member.all.l lVar = new com.tencent.mm.plugin.finder.member.all.l(mVar2);
        com.tencent.mm.plugin.finder.feed.model.FinderMemberAllFeedLoader finderMemberAllFeedLoader2 = mVar2.f121090f;
        finderMemberAllFeedLoader2.f107505i = lVar;
        com.tencent.mm.plugin.finder.member.all.q qVar3 = mVar2.f121091g;
        if (qVar3 != null) {
            android.view.View view2 = qVar3.f121109i;
            if (view2 == null) {
                kotlin.jvm.internal.o.o("emptyLayout");
                throw null;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/finder/member/all/FinderMemberAllViewCallback", "showLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/member/all/FinderMemberAllViewCallback", "showLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view3 = qVar3.f121112o;
            if (view3 == null) {
                kotlin.jvm.internal.o.o("emptyTip");
                throw null;
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/plugin/finder/member/all/FinderMemberAllViewCallback", "showLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/finder/member/all/FinderMemberAllViewCallback", "showLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view4 = qVar3.f121111n;
            if (view4 == null) {
                kotlin.jvm.internal.o.o("retryTip");
                throw null;
            }
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view4, arrayList3.toArray(), "com/tencent/mm/plugin/finder/member/all/FinderMemberAllViewCallback", "showLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view4, "com/tencent/mm/plugin/finder/member/all/FinderMemberAllViewCallback", "showLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view5 = qVar3.f121110m;
            if (view5 == null) {
                kotlin.jvm.internal.o.o("progress");
                throw null;
            }
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(0);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view5, arrayList4.toArray(), "com/tencent/mm/plugin/finder/member/all/FinderMemberAllViewCallback", "showLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view5.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(view5, "com/tencent/mm/plugin/finder/member/all/FinderMemberAllViewCallback", "showLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.tencent.mm.plugin.finder.member.all.a aVar = mVar2.f121092h;
        if (aVar == null) {
            kotlin.jvm.internal.o.o("actionCallback");
            throw null;
        }
        com.tencent.mm.plugin.finder.feed.model.internal.Dispatcher.register$default(finderMemberAllFeedLoader2, aVar, false, 2, null);
        mVar2.f121094m.alive();
        mVar2.f121095n.alive();
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        com.tencent.mm.plugin.finder.member.all.m mVar = this.f121099e;
        if (mVar != null) {
            mVar.onDetach();
        } else {
            kotlin.jvm.internal.o.o("presenter");
            throw null;
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onUserVisibleFocused() {
        super.onUserVisibleFocused();
        if (this.f121101g) {
            return;
        }
        this.f121101g = true;
        com.tencent.mm.plugin.finder.member.all.m mVar = this.f121099e;
        if (mVar == null) {
            kotlin.jvm.internal.o.o("presenter");
            throw null;
        }
        com.tencent.mm.plugin.finder.feed.model.FinderMemberAllFeedLoader finderMemberAllFeedLoader = mVar.f121090f;
        com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader.requestInit$default(finderMemberAllFeedLoader, false, 1, null);
        finderMemberAllFeedLoader.requestRefresh();
    }
}
