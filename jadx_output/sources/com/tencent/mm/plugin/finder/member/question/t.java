package com.tencent.mm.plugin.finder.member.question;

/* loaded from: classes2.dex */
public final class t extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.feed.model.FinderMemberQAFeedLoader f121355d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.member.question.s f121356e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.member.question.w f121357f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f121358g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(androidx.fragment.app.Fragment fragment) {
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
        androidx.fragment.app.Fragment fragment = getFragment();
        com.tencent.mm.plugin.finder.member.ui.FinderMemberQASubTabFragment finderMemberQASubTabFragment = fragment instanceof com.tencent.mm.plugin.finder.member.ui.FinderMemberQASubTabFragment ? (com.tencent.mm.plugin.finder.member.ui.FinderMemberQASubTabFragment) fragment : null;
        int i17 = finderMemberQASubTabFragment != null ? finderMemberQASubTabFragment.f129265p : 0;
        androidx.fragment.app.Fragment fragment2 = getFragment();
        com.tencent.mm.plugin.finder.member.ui.FinderMemberQASubTabFragment finderMemberQASubTabFragment2 = fragment2 instanceof com.tencent.mm.plugin.finder.member.ui.FinderMemberQASubTabFragment ? (com.tencent.mm.plugin.finder.member.ui.FinderMemberQASubTabFragment) fragment2 : null;
        int i18 = finderMemberQASubTabFragment2 != null ? finderMemberQASubTabFragment2.f121401z : 0;
        long longExtra = i18 == 5 ? getContext().getIntent().getLongExtra("key_member_top_feed", 0L) : 0L;
        this.f121358g = false;
        androidx.fragment.app.Fragment fragment3 = getFragment();
        com.tencent.mm.plugin.finder.member.ui.FinderMemberQASubTabFragment finderMemberQASubTabFragment3 = fragment3 instanceof com.tencent.mm.plugin.finder.member.ui.FinderMemberQASubTabFragment ? (com.tencent.mm.plugin.finder.member.ui.FinderMemberQASubTabFragment) fragment3 : null;
        if (finderMemberQASubTabFragment3 == null || (str = finderMemberQASubTabFragment3.f121384t) == null) {
            str = "";
        }
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f121355d = new com.tencent.mm.plugin.finder.feed.model.FinderMemberQAFeedLoader(((com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6(), str, xy2.c.e(getContext()), null, i18, longExtra);
        androidx.appcompat.app.AppCompatActivity activity2 = getActivity();
        kotlin.jvm.internal.o.e(activity2, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        com.tencent.mm.ui.MMActivity mMActivity = (com.tencent.mm.ui.MMActivity) activity2;
        com.tencent.mm.plugin.finder.feed.model.FinderMemberQAFeedLoader finderMemberQAFeedLoader = this.f121355d;
        if (finderMemberQAFeedLoader == null) {
            kotlin.jvm.internal.o.o("feedLoader");
            throw null;
        }
        this.f121356e = new com.tencent.mm.plugin.finder.member.question.s(mMActivity, str, finderMemberQAFeedLoader);
        androidx.appcompat.app.AppCompatActivity activity3 = getActivity();
        kotlin.jvm.internal.o.e(activity3, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        com.tencent.mm.ui.MMActivity mMActivity2 = (com.tencent.mm.ui.MMActivity) activity3;
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.qny);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        com.tencent.mm.plugin.finder.member.question.s sVar = this.f121356e;
        if (sVar == null) {
            kotlin.jvm.internal.o.o("presenter");
            throw null;
        }
        final com.tencent.mm.plugin.finder.member.question.w wVar = new com.tencent.mm.plugin.finder.member.question.w(mMActivity2, findViewById, sVar, str, i18, i17);
        this.f121357f = wVar;
        android.view.View view = wVar.f121370d;
        android.view.View findViewById2 = view.findViewById(com.tencent.mm.R.id.f484229dg3);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        wVar.f121376m = findViewById2;
        android.view.View findViewById3 = view.findViewById(com.tencent.mm.R.id.lbi);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        wVar.f121377n = findViewById3;
        android.view.View findViewById4 = view.findViewById(com.tencent.mm.R.id.m2g);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        wVar.f121378o = findViewById4;
        android.view.View findViewById5 = view.findViewById(com.tencent.mm.R.id.dft);
        kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
        wVar.f121379p = findViewById5;
        android.view.View findViewById6 = view.findViewById(com.tencent.mm.R.id.q0u);
        kotlin.jvm.internal.o.f(findViewById6, "findViewById(...)");
        wVar.f121380q = (com.tencent.mm.plugin.finder.view.FinderRefreshLayout) findViewById6;
        android.view.View findViewById7 = view.findViewById(com.tencent.mm.R.id.q0t);
        kotlin.jvm.internal.o.f(findViewById7, "findViewById(...)");
        wVar.f121381r = (androidx.recyclerview.widget.RecyclerView) findViewById7;
        android.view.View findViewById8 = view.findViewById(com.tencent.mm.R.id.ilg);
        kotlin.jvm.internal.o.f(findViewById8, "findViewById(...)");
        wVar.f121382s = findViewById8;
        wVar.f121383t = new com.tencent.mm.plugin.finder.member.convert.c(wVar.f121371e, wVar.f121375i, wVar.f121372f, false, wVar.f121374h);
        androidx.recyclerview.widget.RecyclerView recyclerView = wVar.f121381r;
        if (recyclerView == null) {
            kotlin.jvm.internal.o.o("recyclerView");
            throw null;
        }
        recyclerView.setItemAnimator(null);
        androidx.recyclerview.widget.RecyclerView recyclerView2 = wVar.f121381r;
        if (recyclerView2 == null) {
            kotlin.jvm.internal.o.o("recyclerView");
            throw null;
        }
        com.tencent.mm.plugin.finder.member.convert.c cVar = wVar.f121383t;
        if (cVar == null) {
            kotlin.jvm.internal.o.o("config");
            throw null;
        }
        recyclerView2.setLayoutManager(cVar.d(wVar.f121375i));
        androidx.recyclerview.widget.RecyclerView recyclerView3 = wVar.f121381r;
        if (recyclerView3 == null) {
            kotlin.jvm.internal.o.o("recyclerView");
            throw null;
        }
        com.tencent.mm.plugin.finder.member.convert.c cVar2 = wVar.f121383t;
        if (cVar2 == null) {
            kotlin.jvm.internal.o.o("config");
            throw null;
        }
        recyclerView3.N(cVar2.c());
        androidx.recyclerview.widget.RecyclerView recyclerView4 = wVar.f121381r;
        if (recyclerView4 == null) {
            kotlin.jvm.internal.o.o("recyclerView");
            throw null;
        }
        recyclerView4.setAdapter(new com.tencent.mm.view.recyclerview.WxRecyclerAdapter(new in5.s() { // from class: com.tencent.mm.plugin.finder.member.question.FinderMemberQAViewCallback$initRecycleView$1
            @Override // in5.s
            public in5.r getItemConvert(int type) {
                com.tencent.mm.plugin.finder.member.convert.c cVar3 = com.tencent.mm.plugin.finder.member.question.w.this.f121383t;
                if (cVar3 != null) {
                    return cVar3.b(null).getItemConvert(type);
                }
                kotlin.jvm.internal.o.o("config");
                throw null;
            }
        }, wVar.f121371e.f121346f.getDataList(), false));
        wVar.a().setOnSimpleAction(new com.tencent.mm.plugin.finder.member.question.u(wVar));
        com.tencent.mm.plugin.finder.member.question.s sVar2 = this.f121356e;
        if (sVar2 == null) {
            kotlin.jvm.internal.o.o("presenter");
            throw null;
        }
        com.tencent.mm.plugin.finder.member.question.w wVar2 = this.f121357f;
        if (wVar2 == null) {
            kotlin.jvm.internal.o.o("viewCallback");
            throw null;
        }
        sVar2.f121347g = wVar2;
        sVar2.f121348h = new com.tencent.mm.plugin.finder.member.question.d(sVar2, wVar2.a());
        com.tencent.mm.plugin.finder.feed.model.FinderMemberQAFeedLoader finderMemberQAFeedLoader2 = sVar2.f121346f;
        long j17 = 0;
        if (finderMemberQAFeedLoader2.f107515g != 0) {
            com.tencent.mm.ui.MMActivity mMActivity3 = sVar2.f121344d;
            long longExtra2 = mMActivity3.getIntent().getLongExtra("mention_id", 0L);
            if (longExtra2 != 0) {
                int intExtra = mMActivity3.getIntent().getIntExtra("mention_create_time", 0);
                int intExtra2 = mMActivity3.getIntent().getIntExtra("from_scene", 0);
                dm.pd z17 = com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract.f122820a.z(mMActivity3, intExtra2);
                dm.pd d17 = cu2.b0.f222371a.d(longExtra2, intExtra, intExtra2);
                if (d17 != null) {
                    z17 = d17;
                }
                if (z17 != null && (z17.field_type == 3 || z17.field_commentId != 0)) {
                    j17 = z17.field_commentId;
                }
            }
        }
        sVar2.f121349i = j17;
        finderMemberQAFeedLoader2.f107518m = new com.tencent.mm.plugin.finder.member.question.q(sVar2);
        finderMemberQAFeedLoader2.f107519n = new com.tencent.mm.plugin.finder.member.question.r(sVar2);
        com.tencent.mm.plugin.finder.member.question.w wVar3 = sVar2.f121347g;
        if (wVar3 != null) {
            wVar3.g();
        }
        com.tencent.mm.plugin.finder.member.question.d dVar = sVar2.f121348h;
        if (dVar == null) {
            kotlin.jvm.internal.o.o("actionCallback");
            throw null;
        }
        com.tencent.mm.plugin.finder.feed.model.internal.Dispatcher.register$default(finderMemberQAFeedLoader2, dVar, false, 2, null);
        sVar2.f121351n.alive();
        sVar2.f121352o.alive();
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        com.tencent.mm.plugin.finder.member.question.s sVar = this.f121356e;
        if (sVar != null) {
            sVar.onDetach();
        } else {
            kotlin.jvm.internal.o.o("presenter");
            throw null;
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onUserVisibleFocused() {
        super.onUserVisibleFocused();
        if (this.f121358g) {
            return;
        }
        this.f121358g = true;
        com.tencent.mm.plugin.finder.member.question.s sVar = this.f121356e;
        if (sVar == null) {
            kotlin.jvm.internal.o.o("presenter");
            throw null;
        }
        com.tencent.mm.plugin.finder.feed.model.FinderMemberQAFeedLoader finderMemberQAFeedLoader = sVar.f121346f;
        com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader.requestInit$default(finderMemberQAFeedLoader, false, 1, null);
        finderMemberQAFeedLoader.requestRefresh();
    }
}
