package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public final class FinderProfileTingAudioUIC extends com.tencent.mm.plugin.finder.profile.uic.fk {

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f123480i;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f123481m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f123482n;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.feed.model.FinderProfileTingAudioListLoader f123483o;

    /* renamed from: p, reason: collision with root package name */
    public final jz5.g f123484p;

    /* renamed from: q, reason: collision with root package name */
    public long f123485q;

    /* renamed from: r, reason: collision with root package name */
    public long f123486r;

    /* renamed from: s, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f123487s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderProfileTingAudioUIC(androidx.fragment.app.Fragment fragment) {
        super(fragment);
        kotlin.jvm.internal.o.g(fragment, "fragment");
        this.f123480i = jz5.h.b(new com.tencent.mm.plugin.finder.profile.uic.qh(this));
        this.f123481m = jz5.h.b(new com.tencent.mm.plugin.finder.profile.uic.oh(this));
        this.f123482n = jz5.h.b(new com.tencent.mm.plugin.finder.profile.uic.lh(this));
        this.f123484p = jz5.h.b(new com.tencent.mm.plugin.finder.profile.uic.eh(this));
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.f123487s = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.TingFinderProfileEvent>(a0Var) { // from class: com.tencent.mm.plugin.finder.profile.uic.FinderProfileTingAudioUIC$tingFinderProfileEvent$1
            {
                this.__eventId = 1837692789;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.TingFinderProfileEvent tingFinderProfileEvent) {
                com.tencent.mm.autogen.events.TingFinderProfileEvent event = tingFinderProfileEvent;
                kotlin.jvm.internal.o.g(event, "event");
                com.tencent.mars.xlog.Log.i("Finder.FinderProfileTingAudioUIC", "tingFinderProfileEvent type " + event.f54895g.f6197a + ", listType = " + event.f54895g.f6198b);
                if (kotlin.jvm.internal.o.b(event.f54895g.f6197a, "refreshList") && kotlin.jvm.internal.o.b(event.f54895g.f6198b, "audio")) {
                    ku5.u0 u0Var = ku5.t0.f312615d;
                    com.tencent.mm.plugin.finder.profile.uic.ph phVar = new com.tencent.mm.plugin.finder.profile.uic.ph(com.tencent.mm.plugin.finder.profile.uic.FinderProfileTingAudioUIC.this);
                    ku5.t0 t0Var = (ku5.t0) u0Var;
                    t0Var.getClass();
                    t0Var.z(phVar, 1000L, false);
                }
                return false;
            }
        };
    }

    public static final vb2.m0 R6(com.tencent.mm.plugin.finder.profile.uic.FinderProfileTingAudioUIC finderProfileTingAudioUIC) {
        return (vb2.m0) ((jz5.n) finderProfileTingAudioUIC.f123480i).getValue();
    }

    public final java.lang.String S6() {
        android.app.Activity context = getContext();
        kotlin.jvm.internal.o.g(context, "context");
        pf5.z zVar = pf5.z.f353948a;
        if (context instanceof androidx.appcompat.app.AppCompatActivity) {
            return ((com.tencent.mm.plugin.finder.profile.uic.p2) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.profile.uic.p2.class)).getUsername();
        }
        throw new java.lang.IllegalStateException("Check failed.".toString());
    }

    public final void T6() {
        db2.e6 e6Var;
        android.view.View view;
        android.widget.TextView textView;
        androidx.recyclerview.widget.f2 adapter = ((com.tencent.mm.view.recyclerview.WxRecyclerView) ((jz5.n) this.f123482n).getValue()).getAdapter();
        kotlin.jvm.internal.o.e(adapter, "null cannot be cast to non-null type com.tencent.mm.view.recyclerview.WxRecyclerAdapter<com.tencent.mm.plugin.finder.model.RVFeed>");
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = (com.tencent.mm.view.recyclerview.WxRecyclerAdapter) adapter;
        androidx.fragment.app.Fragment fragment = getFragment();
        com.tencent.mm.plugin.finder.profile.uic.FinderProfileTingAudioFragment finderProfileTingAudioFragment = fragment instanceof com.tencent.mm.plugin.finder.profile.uic.FinderProfileTingAudioFragment ? (com.tencent.mm.plugin.finder.profile.uic.FinderProfileTingAudioFragment) fragment : null;
        if (finderProfileTingAudioFragment == null || (e6Var = finderProfileTingAudioFragment.f123478t) == null) {
            return;
        }
        long j17 = this.f123485q;
        if (j17 != 0) {
            in5.n0.j0(wxRecyclerAdapter, j17, false, 2, null);
        }
        long j18 = this.f123486r;
        if (j18 != 0) {
            in5.n0.j0(wxRecyclerAdapter, j18, false, 2, null);
        }
        if ((e6Var.K() || e6Var.L()) && isSelf() && isSelfFlag()) {
            if (e6Var.P()) {
                android.view.View inflate = com.tencent.mm.ui.id.b(getContext()).inflate(com.tencent.mm.R.layout.f489078b75, (android.view.ViewGroup) null);
                android.view.View findViewById = findViewById(com.tencent.mm.R.id.m7g);
                int[] iArr = new int[2];
                findViewById.getLocationOnScreen(iArr);
                findViewById.setPadding(findViewById.getPaddingLeft(), O6(iArr[1]), findViewById.getPaddingRight(), findViewById.getPaddingBottom());
                if (inflate != null && (textView = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.fyt)) != null) {
                    com.tencent.mm.ui.tools.d8.a(textView);
                    textView.setOnClickListener(new com.tencent.mm.plugin.finder.profile.uic.gh(e6Var, this));
                }
                kotlin.jvm.internal.o.d(inflate);
                this.f123485q = ((in5.b0) wxRecyclerAdapter.T(inflate, 1, false)).getItemId();
            } else {
                r45.sd1 O = e6Var.O();
                com.tencent.mm.protobuf.f fVar = e6Var.f227963i.f70711b.f70700a;
                kotlin.jvm.internal.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderAudioUserPageResponse");
                r45.sd1 sd1Var = ((r45.wu0) fVar).f389473q;
                if (((e6Var.K() && O != null) || (e6Var.L() && sd1Var != null)) && isSelf() && isSelfFlag()) {
                    android.view.View inflate2 = com.tencent.mm.ui.id.b(getContext()).inflate(com.tencent.mm.R.layout.b76, (android.view.ViewGroup) null);
                    android.widget.TextView textView2 = (android.widget.TextView) inflate2.findViewById(com.tencent.mm.R.id.f484933g00);
                    if (textView2 != null) {
                        com.tencent.mm.ui.tools.d8.a(textView2);
                        if (!e6Var.K() || O == null) {
                            textView2.setVisibility(8);
                            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("gotoLiteApp canPostTingMusic:");
                            sb6.append(e6Var.K());
                            sb6.append(' ');
                            sb6.append(O != null);
                            com.tencent.mars.xlog.Log.w("Finder.FinderProfileTingAudioUIC", sb6.toString());
                        } else {
                            textView2.setVisibility(0);
                            textView2.setOnClickListener(new com.tencent.mm.plugin.finder.profile.uic.hh(this, O));
                        }
                    }
                    android.widget.TextView textView3 = (android.widget.TextView) inflate2.findViewById(com.tencent.mm.R.id.fzc);
                    if (textView3 != null) {
                        com.tencent.mm.ui.tools.d8.a(textView3);
                        textView3.setText(textView3.getContext().getResources().getString(com.tencent.mm.R.string.f492026ez5));
                        if (!e6Var.L() || sd1Var == null) {
                            textView3.setVisibility(8);
                            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("gotoLiteApp canShowMusicManageEntrance:");
                            sb7.append(e6Var.L());
                            sb7.append(' ');
                            sb7.append(sd1Var != null);
                            com.tencent.mars.xlog.Log.w("Finder.FinderProfileTingAudioUIC", sb7.toString());
                        } else {
                            textView3.setVisibility(0);
                            textView3.setOnClickListener(new com.tencent.mm.plugin.finder.profile.uic.ih(this, sd1Var));
                        }
                    }
                    this.f123486r = ((in5.b0) wxRecyclerAdapter.T(inflate2, 0, false)).getItemId();
                }
            }
            if (e6Var.P()) {
                on5.c loadMoreFooter = getRlLayout().getLoadMoreFooter();
                view = loadMoreFooter != null ? loadMoreFooter.getView() : null;
                if (view != null) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    arrayList.add(4);
                    java.util.Collections.reverse(arrayList);
                    android.view.View view2 = view;
                    yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/finder/profile/uic/FinderProfileTingAudioUIC", "initAudioPostLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(view2, "com/tencent/mm/plugin/finder/profile/uic/FinderProfileTingAudioUIC", "initAudioPostLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                getRlLayout().A(false);
                return;
            }
            on5.c loadMoreFooter2 = getRlLayout().getLoadMoreFooter();
            view = loadMoreFooter2 != null ? loadMoreFooter2.getView() : null;
            if (view != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                android.view.View view3 = view;
                yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/plugin/finder/profile/uic/FinderProfileTingAudioUIC", "initAudioPostLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view3, "com/tencent/mm/plugin/finder/profile/uic/FinderProfileTingAudioUIC", "initAudioPostLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            getRlLayout().A(true);
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public int getLayoutId() {
        return com.tencent.mm.R.layout.b_i;
    }

    public final com.tencent.mm.plugin.finder.view.FinderRefreshLayout getRlLayout() {
        return (com.tencent.mm.plugin.finder.view.FinderRefreshLayout) ((jz5.n) this.f123481m).getValue();
    }

    @Override // com.tencent.mm.plugin.finder.profile.uic.i6, com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.tencent.mm.R.id.dft);
        if (textView != null) {
            textView.setText(getString(com.tencent.mm.R.string.f09));
        }
        int intExtra = getIntent().getIntExtra("key_enter_profile_type", 0);
        java.lang.String S6 = S6();
        java.lang.String e17 = xy2.c.e(getContext());
        android.app.Activity context = getContext();
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
        r45.qt2 V6 = nyVar != null ? nyVar.V6() : null;
        androidx.fragment.app.Fragment fragment = getFragment();
        kotlin.jvm.internal.o.e(fragment, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.profile.uic.FinderProfileTingAudioFragment");
        com.tencent.mm.plugin.finder.feed.model.FinderProfileTingAudioListLoader finderProfileTingAudioListLoader = new com.tencent.mm.plugin.finder.feed.model.FinderProfileTingAudioListLoader(0, intExtra, S6, e17, V6, ((com.tencent.mm.plugin.finder.profile.uic.FinderProfileTingAudioFragment) fragment).f123479u);
        finderProfileTingAudioListLoader.f107612n = new com.tencent.mm.plugin.finder.profile.uic.jh(this, finderProfileTingAudioListLoader);
        this.f123483o = finderProfileTingAudioListLoader;
        com.tencent.mm.plugin.finder.feed.model.internal.Dispatcher.register$default(finderProfileTingAudioListLoader, (com.tencent.mm.plugin.finder.profile.uic.dh) ((jz5.n) this.f123484p).getValue(), false, 2, null);
        if (isSelf() && isSelfFlag()) {
            this.f123487s.alive();
        }
        getRlLayout().setOnSimpleAction(new com.tencent.mm.plugin.finder.profile.uic.kh(this));
        jz5.g gVar = this.f123482n;
        ((com.tencent.mm.view.recyclerview.WxRecyclerView) ((jz5.n) gVar).getValue()).setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(getContext(), 1, false));
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = (com.tencent.mm.view.recyclerview.WxRecyclerView) ((jz5.n) gVar).getValue();
        in5.s sVar = new in5.s() { // from class: com.tencent.mm.plugin.finder.profile.uic.FinderProfileTingAudioUIC$buildItemCoverts$1
            @Override // in5.s
            public in5.r getItemConvert(int type) {
                boolean z17 = false;
                if (type != ms2.c.class.hashCode()) {
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                    com.tencent.mm.sdk.platformtools.Log.c("Finder.FinderProfileTingAudioUIC", "type invalid", new java.lang.Object[0]);
                    return new com.tencent.mm.plugin.finder.convert.z2();
                }
                if (com.tencent.mm.plugin.finder.profile.uic.FinderProfileTingAudioUIC.this.isSelf() && com.tencent.mm.plugin.finder.profile.uic.FinderProfileTingAudioUIC.this.isSelfFlag()) {
                    z17 = true;
                }
                return new com.tencent.mm.plugin.finder.convert.ku(z17);
            }
        };
        com.tencent.mm.plugin.finder.feed.model.FinderProfileTingAudioListLoader finderProfileTingAudioListLoader2 = this.f123483o;
        if (finderProfileTingAudioListLoader2 == null) {
            kotlin.jvm.internal.o.o("feedLoader");
            throw null;
        }
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = new com.tencent.mm.view.recyclerview.WxRecyclerAdapter(sVar, finderProfileTingAudioListLoader2.getDataList(), false);
        wxRecyclerAdapter.f293105o = new com.tencent.mm.plugin.finder.profile.uic.fh(wxRecyclerAdapter, this);
        wxRecyclerView.setAdapter(wxRecyclerAdapter);
        T6();
        com.tencent.mm.plugin.finder.feed.model.FinderProfileTingAudioListLoader finderProfileTingAudioListLoader3 = this.f123483o;
        if (finderProfileTingAudioListLoader3 != null) {
            com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader.requestInit$default(finderProfileTingAudioListLoader3, false, 1, null);
        } else {
            kotlin.jvm.internal.o.o("feedLoader");
            throw null;
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        com.tencent.mm.plugin.finder.feed.model.FinderProfileTingAudioListLoader finderProfileTingAudioListLoader = this.f123483o;
        if (finderProfileTingAudioListLoader == null) {
            kotlin.jvm.internal.o.o("feedLoader");
            throw null;
        }
        finderProfileTingAudioListLoader.unregister((com.tencent.mm.plugin.finder.profile.uic.dh) ((jz5.n) this.f123484p).getValue());
        if (isSelf() && isSelfFlag()) {
            this.f123487s.dead();
        }
    }
}
