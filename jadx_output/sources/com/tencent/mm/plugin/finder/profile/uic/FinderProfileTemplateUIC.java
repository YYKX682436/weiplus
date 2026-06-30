package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public final class FinderProfileTemplateUIC extends com.tencent.mm.plugin.finder.profile.uic.i6 {

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f123465i;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f123466m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f123467n;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.view.recyclerview.WxRecyclerAdapter f123468o;

    /* renamed from: p, reason: collision with root package name */
    public long f123469p;

    /* renamed from: q, reason: collision with root package name */
    public long f123470q;

    /* renamed from: r, reason: collision with root package name */
    public final jz5.g f123471r;

    /* renamed from: s, reason: collision with root package name */
    public final jz5.g f123472s;

    /* renamed from: t, reason: collision with root package name */
    public android.widget.FrameLayout f123473t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f123474u;

    /* renamed from: v, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.profile.uic.FinderProfileTemplateUIC$templatePublishListener$1 f123475v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r1v0, types: [com.tencent.mm.plugin.finder.profile.uic.FinderProfileTemplateUIC$templatePublishListener$1] */
    public FinderProfileTemplateUIC(final androidx.fragment.app.Fragment fragment) {
        super(fragment);
        kotlin.jvm.internal.o.g(fragment, "fragment");
        this.f123465i = jz5.h.b(new com.tencent.mm.plugin.finder.profile.uic.ah(this));
        this.f123466m = jz5.h.b(new com.tencent.mm.plugin.finder.profile.uic.wg(this));
        this.f123467n = jz5.h.b(new com.tencent.mm.plugin.finder.profile.uic.vg(this));
        this.f123471r = jz5.h.b(new com.tencent.mm.plugin.finder.profile.uic.xg(this));
        this.f123472s = jz5.h.b(new com.tencent.mm.plugin.finder.profile.uic.og(this));
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.f123475v = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.FinderTemplatePublishEvent>(a0Var) { // from class: com.tencent.mm.plugin.finder.profile.uic.FinderProfileTemplateUIC$templatePublishListener$1
            {
                this.__eventId = -1942446117;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.FinderTemplatePublishEvent finderTemplatePublishEvent) {
                com.tencent.mm.autogen.events.FinderTemplatePublishEvent event = finderTemplatePublishEvent;
                kotlin.jvm.internal.o.g(event, "event");
                java.lang.String str = event.f54332g.f7241a;
                if (!(str == null || str.length() == 0)) {
                    pm0.v.X(new com.tencent.mm.plugin.finder.profile.uic.zg(androidx.fragment.app.Fragment.this, event, this, str));
                }
                return false;
            }
        };
    }

    public static final void O6(com.tencent.mm.plugin.finder.profile.uic.FinderProfileTemplateUIC finderProfileTemplateUIC) {
        finderProfileTemplateUIC.getClass();
        int e17 = c01.id.e();
        i95.m c17 = i95.n0.c(zy2.b6.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        zy2.ta.f(ya2.e1.f460472a, finderProfileTemplateUIC.getActivity(), "wxalite94c410838e79a4cecb3dcd66bc6054a3", "pages/home/entry", "effect_post_sessionid=" + e17, false, false, false, "0.0.4", null, 368, null);
    }

    public static final void P6(com.tencent.mm.plugin.finder.profile.uic.FinderProfileTemplateUIC finderProfileTemplateUIC) {
        android.widget.TextView textView;
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = finderProfileTemplateUIC.f123468o;
        if (wxRecyclerAdapter != null && finderProfileTemplateUIC.isSelfFlag()) {
            if (!finderProfileTemplateUIC.R6().getDataListJustForAdapter().isEmpty()) {
                long j17 = finderProfileTemplateUIC.f123470q;
                if (j17 != 0) {
                    in5.n0.j0(wxRecyclerAdapter, j17, false, 2, null);
                    finderProfileTemplateUIC.f123470q = 0L;
                }
                if (finderProfileTemplateUIC.f123469p != 0) {
                    return;
                }
                android.widget.TextView textView2 = new android.widget.TextView(finderProfileTemplateUIC.getContext());
                textView2.setText(textView2.getContext().getResources().getString(com.tencent.mm.R.string.p4n));
                textView2.setTextColor(textView2.getResources().getColor(com.tencent.mm.R.color.LinkFinder_100));
                textView2.setTextSize(14.0f);
                textView2.setPadding(textView2.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479693cs), textView2.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479738dv), 0, textView2.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479688cn));
                textView2.setOnClickListener(new com.tencent.mm.plugin.finder.profile.uic.qg(finderProfileTemplateUIC));
                finderProfileTemplateUIC.f123469p = ((in5.b0) wxRecyclerAdapter.T(textView2, 10000002, false)).getItemId();
                return;
            }
            long j18 = finderProfileTemplateUIC.f123469p;
            if (j18 != 0) {
                in5.n0.j0(wxRecyclerAdapter, j18, false, 2, null);
                finderProfileTemplateUIC.f123469p = 0L;
            }
            if (finderProfileTemplateUIC.f123470q == 0) {
                android.view.View inflate = com.tencent.mm.ui.id.b(finderProfileTemplateUIC.getContext()).inflate(com.tencent.mm.R.layout.edv, (android.view.ViewGroup) null);
                if (inflate != null && (textView = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.f487250vd4)) != null) {
                    textView.setOnClickListener(new com.tencent.mm.plugin.finder.profile.uic.pg(finderProfileTemplateUIC));
                }
                kotlin.jvm.internal.o.d(inflate);
                finderProfileTemplateUIC.f123470q = ((in5.b0) wxRecyclerAdapter.T(inflate, 10000003, false)).getItemId();
            }
            finderProfileTemplateUIC.Q6().setHasBottomMore(false);
            finderProfileTemplateUIC.Q6().setShowLoadMoreLoading(false);
            android.view.View f213435x = finderProfileTemplateUIC.Q6().getF213435x();
            if (f213435x != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(f213435x, arrayList.toArray(), "com/tencent/mm/plugin/finder/profile/uic/FinderProfileTemplateUIC", "updateTemplateHeader", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                f213435x.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(f213435x, "com/tencent/mm/plugin/finder/profile/uic/FinderProfileTemplateUIC", "updateTemplateHeader", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            finderProfileTemplateUIC.Q6().setSuperNestedScroll(true);
        }
    }

    public final com.tencent.mm.view.RefreshLoadMoreLayout Q6() {
        return (com.tencent.mm.view.RefreshLoadMoreLayout) ((jz5.n) this.f123466m).getValue();
    }

    public final com.tencent.mm.plugin.finder.feed.FinderProfileTemplateLoader R6() {
        return (com.tencent.mm.plugin.finder.feed.FinderProfileTemplateLoader) ((jz5.n) this.f123471r).getValue();
    }

    public final vb2.c0 S6() {
        return (vb2.c0) ((jz5.n) this.f123465i).getValue();
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public int getLayoutId() {
        return com.tencent.mm.R.layout.b7d;
    }

    /* JADX WARN: Type inference failed for: r9v15, types: [com.tencent.mm.plugin.finder.profile.uic.FinderProfileTemplateUIC$initLayout$3] */
    @Override // com.tencent.mm.plugin.finder.profile.uic.i6, com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        android.view.View findViewById;
        android.view.View findViewById2;
        super.onCreate(bundle);
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) findViewById(com.tencent.mm.R.id.l9h);
        this.f123473t = frameLayout;
        if (frameLayout != null) {
            frameLayout.setBackgroundResource(com.tencent.mm.R.drawable.abi);
        }
        android.widget.FrameLayout frameLayout2 = this.f123473t;
        if (frameLayout2 != null) {
            frameLayout2.setVisibility(0);
        }
        R6().initFromCache(getIntent());
        alive();
        com.tencent.mm.plugin.finder.feed.model.internal.Dispatcher.register$default(R6(), (com.tencent.mm.plugin.finder.profile.uic.ng) ((jz5.n) this.f123472s).getValue(), false, 2, null);
        Q6().setEnableRefresh(false);
        Q6().setSuperNestedScroll(true);
        Q6().setActionCallback(new com.tencent.mm.plugin.finder.profile.uic.rg(this));
        android.view.View inflate = com.tencent.mm.ui.id.b(getActivity()).inflate(com.tencent.mm.R.layout.f489227bs5, (android.view.ViewGroup) null);
        android.app.Activity context = getContext();
        kotlin.jvm.internal.o.g(context, "context");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        if (((com.tencent.mm.plugin.finder.profile.uic.FinderProfileUiStyleUIC) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.profile.uic.FinderProfileUiStyleUIC.class)).a2()) {
            if (inflate != null && (findViewById2 = inflate.findViewById(com.tencent.mm.R.id.ilg)) != null) {
                findViewById2.setBackgroundColor(getResources().getColor(com.tencent.mm.R.color.a9e));
            }
        } else if (inflate != null && (findViewById = inflate.findViewById(com.tencent.mm.R.id.ilg)) != null) {
            findViewById.setBackgroundColor(getResources().getColor(com.tencent.mm.R.color.aaw));
        }
        com.tencent.mm.view.RefreshLoadMoreLayout Q6 = Q6();
        kotlin.jvm.internal.o.d(inflate);
        Q6.setLoadMoreFooter(inflate);
        this.f123468o = new com.tencent.mm.plugin.finder.profile.uic.sg(new in5.s() { // from class: com.tencent.mm.plugin.finder.profile.uic.FinderProfileTemplateUIC$initLayout$3
            @Override // in5.s
            public in5.r getItemConvert(int type) {
                if (type != so2.d5.class.getName().hashCode()) {
                    kotlin.jvm.internal.o.d(null);
                    throw new jz5.d();
                }
                com.tencent.mm.plugin.finder.convert.bu buVar = new com.tencent.mm.plugin.finder.convert.bu();
                buVar.f102998e = java.lang.Boolean.valueOf(com.tencent.mm.plugin.finder.profile.uic.FinderProfileTemplateUIC.this.isSelfFlag());
                return buVar;
            }
        }, R6().getDataListJustForAdapter());
        jz5.g gVar = this.f123467n;
        androidx.recyclerview.widget.RecyclerView recyclerView = (androidx.recyclerview.widget.RecyclerView) ((jz5.n) gVar).getValue();
        recyclerView.setLayoutManager(new com.tencent.mm.plugin.finder.view.manager.FinderStaggeredGridLayoutManager(2, 1));
        recyclerView.setAdapter(this.f123468o);
        recyclerView.i(new sc2.u8("Finder.ProfileTemplateUIC", new com.tencent.mm.plugin.finder.profile.uic.tg(this)));
        R6().f106109g = new com.tencent.mm.plugin.finder.profile.uic.ug(this);
        com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader.requestInit$default(R6(), false, 1, null);
        androidx.fragment.app.Fragment fragment = getFragment();
        if (fragment != null) {
            androidx.lifecycle.c1 a17 = zVar.b(fragment).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
            kotlin.jvm.internal.o.f(a17, "get(...)");
            fc2.o Z6 = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) a17).Z6(-1);
            if (Z6 != null) {
                Z6.d((androidx.recyclerview.widget.RecyclerView) ((jz5.n) gVar).getValue());
            }
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        R6().unregister((com.tencent.mm.plugin.finder.profile.uic.ng) ((jz5.n) this.f123472s).getValue());
        dead();
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onResume() {
        if (this.f123474u) {
            R6().requestRefresh();
            this.f123474u = false;
        }
    }
}
