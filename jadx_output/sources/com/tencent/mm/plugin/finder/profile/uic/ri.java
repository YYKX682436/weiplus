package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public final class ri extends com.tencent.mm.plugin.finder.profile.uic.i6 {

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f124193i;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f124194m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f124195n;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.feed.model.FinderProfileTingSongListLoader f124196o;

    /* renamed from: p, reason: collision with root package name */
    public final jz5.g f124197p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ri(androidx.fragment.app.Fragment fragment) {
        super(fragment);
        kotlin.jvm.internal.o.g(fragment, "fragment");
        this.f124193i = jz5.h.b(new com.tencent.mm.plugin.finder.profile.uic.qi(this));
        this.f124194m = jz5.h.b(new com.tencent.mm.plugin.finder.profile.uic.pi(this));
        this.f124195n = jz5.h.b(new com.tencent.mm.plugin.finder.profile.uic.oi(this));
        this.f124197p = jz5.h.b(new com.tencent.mm.plugin.finder.profile.uic.ji(this));
    }

    public static final vb2.n0 O6(com.tencent.mm.plugin.finder.profile.uic.ri riVar) {
        return (vb2.n0) ((jz5.n) riVar.f124193i).getValue();
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public int getLayoutId() {
        return com.tencent.mm.R.layout.b_j;
    }

    @Override // com.tencent.mm.plugin.finder.profile.uic.i6, com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        java.lang.String str;
        super.onCreate(bundle);
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.tencent.mm.R.id.dft);
        if (textView != null) {
            textView.setText(getString(com.tencent.mm.R.string.f09));
        }
        android.app.Activity context = getContext();
        kotlin.jvm.internal.o.g(context, "context");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        com.tencent.mm.plugin.finder.profile.uic.p2 p2Var = (com.tencent.mm.plugin.finder.profile.uic.p2) zVar.a((androidx.appcompat.app.AppCompatActivity) context).e(com.tencent.mm.plugin.finder.profile.uic.p2.class);
        if (p2Var == null || (str = p2Var.getUsername()) == null) {
            str = "";
        }
        java.lang.String str2 = str;
        int intExtra = getIntent().getIntExtra("key_enter_profile_type", 0);
        java.lang.String e17 = xy2.c.e(getContext());
        android.app.Activity context2 = getContext();
        kotlin.jvm.internal.o.g(context2, "context");
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context2 instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) zVar.a((androidx.appcompat.app.AppCompatActivity) context2).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
        r45.qt2 V6 = nyVar != null ? nyVar.V6() : null;
        androidx.fragment.app.Fragment fragment = getFragment();
        kotlin.jvm.internal.o.e(fragment, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.profile.uic.FinderProfileTingSongListFragment");
        com.tencent.mm.plugin.finder.feed.model.FinderProfileTingSongListLoader finderProfileTingSongListLoader = new com.tencent.mm.plugin.finder.feed.model.FinderProfileTingSongListLoader(3, 3, intExtra, str2, e17, V6, ((com.tencent.mm.plugin.finder.profile.uic.FinderProfileTingSongListFragment) fragment).f123497t);
        finderProfileTingSongListLoader.f107621o = new com.tencent.mm.plugin.finder.profile.uic.ki(this, finderProfileTingSongListLoader);
        this.f124196o = finderProfileTingSongListLoader;
        com.tencent.mm.plugin.finder.feed.model.internal.Dispatcher.register$default(finderProfileTingSongListLoader, (com.tencent.mm.plugin.finder.profile.uic.ii) ((jz5.n) this.f124197p).getValue(), false, 2, null);
        ((com.tencent.mm.plugin.finder.view.FinderRefreshLayout) ((jz5.n) this.f124194m).getValue()).setOnSimpleAction(new com.tencent.mm.plugin.finder.profile.uic.li(this));
        jz5.g gVar = this.f124195n;
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = (com.tencent.mm.view.recyclerview.WxRecyclerView) ((jz5.n) gVar).getValue();
        com.tencent.mm.plugin.finder.view.manager.FinderStaggeredGridLayoutManager finderStaggeredGridLayoutManager = new com.tencent.mm.plugin.finder.view.manager.FinderStaggeredGridLayoutManager(2, 1);
        finderStaggeredGridLayoutManager.setItemPrefetchEnabled(true);
        wxRecyclerView.setLayoutManager(finderStaggeredGridLayoutManager);
        ((com.tencent.mm.view.recyclerview.WxRecyclerView) ((jz5.n) gVar).getValue()).N(new com.tencent.mm.plugin.finder.profile.uic.mi());
        final boolean z17 = isSelf() && isSelfFlag();
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView2 = (com.tencent.mm.view.recyclerview.WxRecyclerView) ((jz5.n) gVar).getValue();
        in5.s sVar = new in5.s() { // from class: com.tencent.mm.plugin.finder.convert.FinderProfileTingSongListPatchConvert$Companion$buildItemCoverts$1
            @Override // in5.s
            public in5.r getItemConvert(int type) {
                if (type == ms2.e.class.hashCode()) {
                    return new com.tencent.mm.plugin.finder.convert.ou(z17);
                }
                java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                com.tencent.mm.sdk.platformtools.Log.c("Finder.FinderProfileTingSongListPatchConvert", "type invalid", new java.lang.Object[0]);
                return new com.tencent.mm.plugin.finder.convert.z2();
            }
        };
        com.tencent.mm.plugin.finder.feed.model.FinderProfileTingSongListLoader finderProfileTingSongListLoader2 = this.f124196o;
        if (finderProfileTingSongListLoader2 == null) {
            kotlin.jvm.internal.o.o("feedLoader");
            throw null;
        }
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = new com.tencent.mm.view.recyclerview.WxRecyclerAdapter(sVar, finderProfileTingSongListLoader2.getDataList(), false);
        wxRecyclerAdapter.f293105o = new com.tencent.mm.plugin.finder.profile.uic.ni();
        wxRecyclerView2.setAdapter(wxRecyclerAdapter);
        com.tencent.mm.plugin.finder.feed.model.FinderProfileTingSongListLoader finderProfileTingSongListLoader3 = this.f124196o;
        if (finderProfileTingSongListLoader3 != null) {
            com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader.requestInit$default(finderProfileTingSongListLoader3, false, 1, null);
        } else {
            kotlin.jvm.internal.o.o("feedLoader");
            throw null;
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        com.tencent.mm.plugin.finder.feed.model.FinderProfileTingSongListLoader finderProfileTingSongListLoader = this.f124196o;
        if (finderProfileTingSongListLoader != null) {
            finderProfileTingSongListLoader.unregister((com.tencent.mm.plugin.finder.profile.uic.ii) ((jz5.n) this.f124197p).getValue());
        } else {
            kotlin.jvm.internal.o.o("feedLoader");
            throw null;
        }
    }
}
