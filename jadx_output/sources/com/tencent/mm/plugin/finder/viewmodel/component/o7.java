package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class o7 extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.view.FinderRefreshLayout f135428d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.view.recyclerview.WxRecyclerView f135429e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.view.recyclerview.WxRecyclerAdapter f135430f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.ArrayList f135431g;

    /* renamed from: h, reason: collision with root package name */
    public rl5.r f135432h;

    /* renamed from: i, reason: collision with root package name */
    public volatile com.tencent.mm.protobuf.g f135433i;

    /* renamed from: m, reason: collision with root package name */
    public int f135434m;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f135435n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o7(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f135431g = new java.util.ArrayList();
        this.f135435n = "Finder.FinderContinueWatchUIC";
    }

    public final void O6() {
        android.app.Activity context = getContext();
        kotlin.jvm.internal.o.g(context, "context");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        pq5.g l17 = new db2.p0(((com.tencent.mm.plugin.finder.viewmodel.component.ny) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6().getInteger(5), this.f135433i).l();
        l17.I(getActivity());
        pm0.v.T(l17, new com.tencent.mm.plugin.finder.viewmodel.component.n7(this));
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public int getLayoutId() {
        return com.tencent.mm.R.layout.e6g;
    }

    public final com.tencent.mm.view.recyclerview.WxRecyclerView getRecyclerView() {
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = this.f135429e;
        if (wxRecyclerView != null) {
            return wxRecyclerView;
        }
        kotlin.jvm.internal.o.o("recyclerView");
        throw null;
    }

    public final com.tencent.mm.plugin.finder.view.FinderRefreshLayout getRlLayout() {
        com.tencent.mm.plugin.finder.view.FinderRefreshLayout finderRefreshLayout = this.f135428d;
        if (finderRefreshLayout != null) {
            return finderRefreshLayout;
        }
        kotlin.jvm.internal.o.o("rlLayout");
        throw null;
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        java.util.List V0;
        this.f135432h = new rl5.r(getContext());
        this.f135434m = getIntent().getIntExtra("key_continue_flag", 0);
        this.f135431g.clear();
        java.util.ArrayList arrayList = this.f135431g;
        java.lang.String stringExtra = getIntent().getStringExtra("key_continue_prompt");
        if (stringExtra == null) {
            stringExtra = "";
        }
        arrayList.add(new com.tencent.mm.plugin.finder.viewmodel.component.k7(stringExtra));
        java.util.ArrayList arrayList2 = this.f135431g;
        synchronized (bu2.q.f24556a) {
            V0 = kz5.n0.V0(bu2.q.f24557b);
        }
        arrayList2.addAll(V0);
        byte[] byteArrayExtra = getIntent().getByteArrayExtra("key_continue_lastbuf");
        if (byteArrayExtra != null) {
            this.f135433i = new com.tencent.mm.protobuf.g(byteArrayExtra, 0, byteArrayExtra.length);
        }
        android.view.View findViewById = getRootView().findViewById(com.tencent.mm.R.id.m6e);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f135428d = (com.tencent.mm.plugin.finder.view.FinderRefreshLayout) findViewById;
        com.tencent.mm.plugin.finder.view.refresh.FinderProfileLoaderMoreFooter finderProfileLoaderMoreFooter = new com.tencent.mm.plugin.finder.view.refresh.FinderProfileLoaderMoreFooter(getContext(), null);
        finderProfileLoaderMoreFooter.j(com.tencent.mm.R.layout.bsd);
        getRlLayout().D(finderProfileLoaderMoreFooter);
        android.view.View findViewById2 = getRootView().findViewById(com.tencent.mm.R.id.lqa);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f135429e = (com.tencent.mm.view.recyclerview.WxRecyclerView) findViewById2;
        getRecyclerView().setHasFixedSize(true);
        getRecyclerView().setItemViewCacheSize(4);
        androidx.recyclerview.widget.n2 itemAnimator = getRecyclerView().getItemAnimator();
        if (itemAnimator != null) {
            itemAnimator.f12171f = 0L;
        }
        getRecyclerView().setLayoutManager(new com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager(getContext()));
        com.tencent.mm.view.recyclerview.WxRecyclerView recyclerView = getRecyclerView();
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = new com.tencent.mm.view.recyclerview.WxRecyclerAdapter(new in5.s() { // from class: com.tencent.mm.plugin.finder.viewmodel.component.FinderContinueWatchUIC$getAdapter$1
            @Override // in5.s
            public in5.r getItemConvert(int type) {
                if (type == so2.j0.class.getName().hashCode()) {
                    return new com.tencent.mm.plugin.finder.viewmodel.component.j7(com.tencent.mm.plugin.finder.viewmodel.component.o7.this);
                }
                if (type == com.tencent.mm.plugin.finder.viewmodel.component.k7.class.getName().hashCode()) {
                    return new com.tencent.mm.plugin.finder.viewmodel.component.l7();
                }
                hc2.l.a(com.tencent.mm.plugin.finder.viewmodel.component.o7.this.f135435n, type);
                return new com.tencent.mm.plugin.finder.convert.z2();
            }
        }, this.f135431g, false);
        this.f135430f = wxRecyclerAdapter;
        recyclerView.setAdapter(wxRecyclerAdapter);
        getRlLayout().setOnSimpleAction(new com.tencent.mm.plugin.finder.viewmodel.component.m7(this));
        if (this.f135434m == 1) {
            O6();
        } else {
            getRlLayout().E(true);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o7(androidx.fragment.app.Fragment fragment) {
        super(fragment);
        kotlin.jvm.internal.o.g(fragment, "fragment");
        this.f135431g = new java.util.ArrayList();
        this.f135435n = "Finder.FinderContinueWatchUIC";
    }
}
