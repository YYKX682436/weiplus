package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes15.dex */
public final class FinderEmojiListUIC extends com.tencent.mm.plugin.finder.profile.uic.f6 {
    public androidx.recyclerview.widget.GridLayoutManager A;
    public final com.tencent.wechat.aff.emoticon.i B;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.FrameLayout f133536e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f133537f;

    /* renamed from: g, reason: collision with root package name */
    public int f133538g;

    /* renamed from: h, reason: collision with root package name */
    public int f133539h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f133540i;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f133541m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f133542n;

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f133543o;

    /* renamed from: p, reason: collision with root package name */
    public com.tencent.mm.view.recyclerview.WxRecyclerAdapter f133544p;

    /* renamed from: q, reason: collision with root package name */
    public final r45.qt2 f133545q;

    /* renamed from: r, reason: collision with root package name */
    public final jz5.g f133546r;

    /* renamed from: s, reason: collision with root package name */
    public final jz5.g f133547s;

    /* renamed from: t, reason: collision with root package name */
    public yz5.q f133548t;

    /* renamed from: u, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f133549u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f133550v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f133551w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f133552x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f133553y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f133554z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderEmojiListUIC(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        r45.qt2 V6;
        androidx.fragment.app.Fragment parentFragment;
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f133537f = "";
        this.f133540i = jz5.h.b(new com.tencent.mm.plugin.finder.viewmodel.component.za(this));
        this.f133541m = jz5.h.b(new com.tencent.mm.plugin.finder.viewmodel.component.ya(this));
        this.f133542n = jz5.h.b(new com.tencent.mm.plugin.finder.viewmodel.component.bb(this));
        this.f133543o = jz5.h.b(new com.tencent.mm.plugin.finder.viewmodel.component.la(this));
        androidx.fragment.app.Fragment fragment = getFragment();
        if (fragment != null && (parentFragment = fragment.getParentFragment()) != null) {
            V6 = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.b(parentFragment).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6();
        } else {
            androidx.appcompat.app.AppCompatActivity activity2 = getActivity();
            kotlin.jvm.internal.o.g(activity2, "activity");
            V6 = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(activity2).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6();
        }
        this.f133545q = V6;
        this.f133546r = jz5.h.b(new com.tencent.mm.plugin.finder.viewmodel.component.ma(this));
        this.f133547s = jz5.h.b(new com.tencent.mm.plugin.finder.viewmodel.component.wa(this));
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.f133549u = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.UgcEmojiChangedEvent>(a0Var) { // from class: com.tencent.mm.plugin.finder.viewmodel.component.FinderEmojiListUIC$eventListener$1
            {
                this.__eventId = -664387125;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.UgcEmojiChangedEvent ugcEmojiChangedEvent) {
                com.tencent.mm.autogen.events.UgcEmojiChangedEvent event = ugcEmojiChangedEvent;
                kotlin.jvm.internal.o.g(event, "event");
                event.f54908g.getClass();
                com.tencent.mars.xlog.Log.i("FinderEmojiListUIC", "UgcEmojiChangedEvent: null");
                com.tencent.mm.plugin.finder.viewmodel.component.FinderEmojiListUIC.this.Q6().requestRefresh();
                return false;
            }
        };
        this.B = new com.tencent.wechat.aff.emoticon.i();
    }

    public static final boolean O6(com.tencent.mm.plugin.finder.viewmodel.component.FinderEmojiListUIC finderEmojiListUIC) {
        return kotlin.jvm.internal.o.b(finderEmojiListUIC.getUsername(), xy2.c.e(finderEmojiListUIC.getContext())) || bm5.o1.f22719a.h(new com.tencent.mm.repairer.config.emoji.RepairerConfigEmoticonFinderProfileIsAuthor()) == 1;
    }

    public final int P6() {
        r45.aw0 aw0Var;
        java.util.LinkedList list;
        java.lang.Object obj;
        r45.uw2 uw2Var;
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        int i17 = ((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.R8).getValue()).r()).intValue() == 1 ? -1272779573 : 0;
        ya2.b2 b17 = ya2.h.f460484a.b(getUsername());
        if (b17 == null || (aw0Var = b17.field_bindInfoList) == null || (list = aw0Var.getList(0)) == null) {
            return i17;
        }
        java.util.Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((r45.zv0) obj).getInteger(0) == 5) {
                break;
            }
        }
        r45.zv0 zv0Var = (r45.zv0) obj;
        return (zv0Var == null || (uw2Var = (r45.uw2) zv0Var.getCustom(5)) == null) ? i17 : uw2Var.getInteger(0);
    }

    public final com.tencent.mm.plugin.finder.feed.model.FinderEmojiListLoader Q6() {
        return (com.tencent.mm.plugin.finder.feed.model.FinderEmojiListLoader) this.f133546r.getValue();
    }

    public final java.util.Map R6() {
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.HashMap hashMap2 = new java.util.HashMap();
        iy1.c cVar = iy1.c.MainUI;
        hashMap2.put("page_id", 50090);
        hashMap2.put("page_name", "FinderProfileEmoticonTab");
        hashMap.put("cur_page", hashMap2);
        hashMap.put("designer_uin", java.lang.Integer.valueOf(P6()));
        hashMap.put("emoticon_enter_scene", java.lang.Integer.valueOf(this.f133539h));
        hashMap.put("enter_isred", java.lang.Integer.valueOf(this.f133538g));
        hashMap.put("emoticon_sessionid", this.f133537f);
        return hashMap;
    }

    public final vb2.k S6() {
        return (vb2.k) this.f133542n.getValue();
    }

    public final void T6() {
        if (!this.f133550v) {
            com.tencent.mm.feature.emoji.api.s5 s5Var = (com.tencent.mm.feature.emoji.api.s5) i95.n0.c(com.tencent.mm.feature.emoji.api.s5.class);
            java.lang.Object obj = ((java.util.Map) ((jz5.n) this.f133547s).getValue()).get("emoticonEnterScene");
            java.lang.Integer num = obj instanceof java.lang.Integer ? (java.lang.Integer) obj : null;
            int intValue = num != null ? num.intValue() : 0;
            androidx.appcompat.app.AppCompatActivity activity = getActivity();
            kotlin.jvm.internal.o.g(activity, "activity");
            ((com.tencent.mm.feature.emoji.b0) s5Var).bj(intValue, 4, 57, ((com.tencent.mm.plugin.finder.profile.uic.p2) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.profile.uic.p2.class)).getUsername());
            this.f133550v = true;
            U6();
            ((com.tencent.mm.feature.emoji.b0) ((com.tencent.mm.feature.emoji.api.s5) i95.n0.c(com.tencent.mm.feature.emoji.api.s5.class))).Vi(P6());
        }
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = this.f133544p;
        if (wxRecyclerAdapter == null) {
            kotlin.jvm.internal.o.o("emojiAdapter");
            throw null;
        }
        com.tencent.mm.plugin.finder.convert.m2 m2Var = (com.tencent.mm.plugin.finder.convert.m2) wxRecyclerAdapter.w0(so2.l0.class.getName().hashCode());
        m2Var.f103968m.clear();
        m2Var.n();
        this.f133552x = true;
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).yj("page_in", this, R6(), 10, false);
    }

    public final void U6() {
        if (this.f133554z && this.f133550v && !this.f133553y) {
            java.lang.Object obj = ((java.util.Map) ((jz5.n) this.f133547s).getValue()).get("needJumpToSingleEmoji");
            java.lang.Boolean bool = obj instanceof java.lang.Boolean ? (java.lang.Boolean) obj : null;
            if (bool != null ? bool.booleanValue() : false) {
                kotlin.jvm.internal.f0 f0Var = new kotlin.jvm.internal.f0();
                f0Var.f310116d = -1;
                kotlin.jvm.internal.f0 f0Var2 = new kotlin.jvm.internal.f0();
                f0Var2.f310116d = -1;
                java.util.Iterator it = Q6().getDataListJustForAdapter().iterator();
                int i17 = 0;
                while (it.hasNext()) {
                    java.lang.Object next = it.next();
                    int i18 = i17 + 1;
                    if (i17 < 0) {
                        kz5.c0.p();
                        throw null;
                    }
                    if (((so2.j5) next) instanceof so2.n0) {
                        if (f0Var.f310116d == -1) {
                            f0Var.f310116d = i17;
                        }
                        f0Var2.f310116d = i17;
                    }
                    i17 = i18;
                }
                if (f0Var.f310116d >= 0) {
                    androidx.appcompat.app.AppCompatActivity activity = getActivity();
                    kotlin.jvm.internal.o.g(activity, "activity");
                    com.google.android.material.appbar.AppBarLayout X6 = ((com.tencent.mm.plugin.finder.profile.uic.o0) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.profile.uic.o0.class)).X6();
                    kotlin.jvm.internal.o.f(X6, "<get-appBarLayout>(...)");
                    int height = X6.getHeight() - X6.getTotalScrollRange();
                    X6.d(false, true, true);
                    ku5.u0 u0Var = ku5.t0.f312615d;
                    com.tencent.mm.plugin.finder.viewmodel.component.ab abVar = new com.tencent.mm.plugin.finder.viewmodel.component.ab(this, f0Var, f0Var2, height);
                    ku5.t0 t0Var = (ku5.t0) u0Var;
                    t0Var.getClass();
                    t0Var.z(abVar, 300L, false);
                }
            }
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public int getLayoutId() {
        return com.tencent.mm.R.layout.agg;
    }

    public final com.tencent.mm.plugin.finder.view.FinderRefreshLayout getRlLayout() {
        return (com.tencent.mm.plugin.finder.view.FinderRefreshLayout) this.f133540i.getValue();
    }

    public final java.lang.String getUsername() {
        java.lang.String stringExtra = getActivity().getIntent().getStringExtra("finder_username");
        return stringExtra == null ? "" : stringExtra;
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        yz5.q qVar = this.f133548t;
        if (qVar != null) {
            qVar.invoke(java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), intent);
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        ((com.tencent.mm.feature.emoji.b0) ((com.tencent.mm.feature.emoji.api.s5) i95.n0.c(com.tencent.mm.feature.emoji.api.s5.class))).getClass();
        com.tencent.mm.plugin.emoji.model.q.f97591c.c();
        jz5.g gVar = this.f133547s;
        java.lang.Object obj = ((java.util.Map) ((jz5.n) gVar).getValue()).get("sdkRequestID");
        java.lang.String str = obj instanceof java.lang.String ? (java.lang.String) obj : null;
        if (str == null) {
            str = java.lang.String.valueOf(java.lang.System.currentTimeMillis());
        }
        this.f133537f = str;
        java.lang.Object obj2 = ((java.util.Map) ((jz5.n) gVar).getValue()).get("enterHasRedDot");
        java.lang.Integer num = obj2 instanceof java.lang.Integer ? (java.lang.Integer) obj2 : null;
        this.f133538g = num != null ? num.intValue() : 0;
        java.lang.Object obj3 = ((java.util.Map) ((jz5.n) gVar).getValue()).get("emoticonEnterScene");
        java.lang.Integer num2 = obj3 instanceof java.lang.Integer ? (java.lang.Integer) obj3 : null;
        this.f133539h = num2 != null ? num2.intValue() : 0;
        getRlLayout().setOnSimpleAction(new com.tencent.mm.plugin.finder.viewmodel.component.pa(this));
        getRlLayout().A(true);
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.dbv);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f133536e = (android.widget.FrameLayout) findViewById;
        com.tencent.mm.plugin.finder.view.refresh.FinderProfileLoaderMoreFooter finderProfileLoaderMoreFooter = new com.tencent.mm.plugin.finder.view.refresh.FinderProfileLoaderMoreFooter(getActivity(), null);
        finderProfileLoaderMoreFooter.j(com.tencent.mm.R.layout.bsd);
        getRlLayout().D(finderProfileLoaderMoreFooter);
        this.f133544p = new com.tencent.mm.view.recyclerview.WxRecyclerAdapter(new in5.s() { // from class: com.tencent.mm.plugin.finder.viewmodel.component.FinderEmojiListUIC$initView$2
            @Override // in5.s
            public in5.r getItemConvert(int type) {
                if (type == so2.m0.class.getName().hashCode()) {
                    return new com.tencent.mm.plugin.finder.convert.s2();
                }
                if (type == so2.p.class.getName().hashCode()) {
                    com.tencent.mm.feature.emoji.api.s5 s5Var = (com.tencent.mm.feature.emoji.api.s5) i95.n0.c(com.tencent.mm.feature.emoji.api.s5.class);
                    androidx.lifecycle.o lifecycle = com.tencent.mm.plugin.finder.viewmodel.component.FinderEmojiListUIC.this.getLifecycle();
                    boolean z17 = com.tencent.mm.plugin.finder.viewmodel.component.FinderEmojiListUIC.this.getActivity() instanceof com.tencent.mm.plugin.finder.feed.ui.FinderEmojiSelectUI;
                    com.tencent.mm.plugin.finder.viewmodel.component.FinderEmojiListUIC finderEmojiListUIC = com.tencent.mm.plugin.finder.viewmodel.component.FinderEmojiListUIC.this;
                    java.lang.String str2 = finderEmojiListUIC.f133537f;
                    java.lang.Integer valueOf = java.lang.Integer.valueOf(finderEmojiListUIC.f133538g);
                    java.lang.Integer valueOf2 = java.lang.Integer.valueOf(com.tencent.mm.plugin.finder.viewmodel.component.FinderEmojiListUIC.this.f133539h);
                    com.tencent.mm.plugin.finder.viewmodel.component.FinderEmojiListUIC finderEmojiListUIC2 = com.tencent.mm.plugin.finder.viewmodel.component.FinderEmojiListUIC.this;
                    com.tencent.mm.plugin.finder.viewmodel.component.qa qaVar = new com.tencent.mm.plugin.finder.viewmodel.component.qa(finderEmojiListUIC2);
                    com.tencent.mm.plugin.finder.viewmodel.component.ra raVar = new com.tencent.mm.plugin.finder.viewmodel.component.ra(finderEmojiListUIC2);
                    boolean O6 = com.tencent.mm.plugin.finder.viewmodel.component.FinderEmojiListUIC.O6(finderEmojiListUIC2);
                    ((com.tencent.mm.feature.emoji.b0) s5Var).getClass();
                    return new com.tencent.mm.plugin.emoji.ui.u4(lifecycle, 57, z17, str2, valueOf.intValue(), valueOf2.intValue(), qaVar, raVar, O6);
                }
                if (type == so2.l0.class.getName().hashCode()) {
                    return new com.tencent.mm.plugin.finder.convert.m2(com.tencent.mm.plugin.finder.viewmodel.component.FinderEmojiListUIC.this.P6(), com.tencent.mm.plugin.finder.viewmodel.component.FinderEmojiListUIC.this.Q6().f107403i);
                }
                if (type != so2.n0.class.getName().hashCode()) {
                    if (type == js2.e.class.hashCode()) {
                        return new com.tencent.mm.plugin.finder.convert.jt();
                    }
                    if (type == js2.d.class.hashCode()) {
                        return new com.tencent.mm.plugin.finder.convert.ht(com.tencent.mm.plugin.finder.viewmodel.component.FinderEmojiListUIC.this.P6(), com.tencent.mm.plugin.finder.viewmodel.component.FinderEmojiListUIC.O6(com.tencent.mm.plugin.finder.viewmodel.component.FinderEmojiListUIC.this), com.tencent.mm.plugin.finder.viewmodel.component.FinderEmojiListUIC.this.getUsername(), com.tencent.mm.plugin.finder.viewmodel.component.FinderEmojiListUIC.this.f133537f);
                    }
                    hc2.l.a("FinderEmojiListUIC", type);
                    return new com.tencent.mm.plugin.finder.convert.z2();
                }
                android.app.Activity context = com.tencent.mm.plugin.finder.viewmodel.component.FinderEmojiListUIC.this.getContext();
                kotlin.jvm.internal.o.g(context, "context");
                pf5.z zVar = pf5.z.f353948a;
                if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
                    throw new java.lang.IllegalStateException("Check failed.".toString());
                }
                java.lang.String username = ((com.tencent.mm.plugin.finder.profile.uic.p2) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.profile.uic.p2.class)).getUsername();
                com.tencent.mm.plugin.finder.viewmodel.component.FinderEmojiListUIC finderEmojiListUIC3 = com.tencent.mm.plugin.finder.viewmodel.component.FinderEmojiListUIC.this;
                return new com.tencent.mm.plugin.finder.convert.u2(username, 57, finderEmojiListUIC3.f133537f, com.tencent.mm.plugin.finder.viewmodel.component.FinderEmojiListUIC.O6(finderEmojiListUIC3));
            }
        }, Q6().getDataListJustForAdapter(), true);
        jz5.g gVar2 = this.f133541m;
        ((com.tencent.mm.view.recyclerview.WxRecyclerView) ((jz5.n) gVar2).getValue()).setPadding(ym5.x.a(getContext(), 20.0f), 0, 0, 0);
        androidx.recyclerview.widget.GridLayoutManager gridLayoutManager = new androidx.recyclerview.widget.GridLayoutManager(getActivity(), 3);
        gridLayoutManager.B = new com.tencent.mm.plugin.finder.viewmodel.component.sa(this);
        this.A = gridLayoutManager;
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = (com.tencent.mm.view.recyclerview.WxRecyclerView) ((jz5.n) gVar2).getValue();
        wxRecyclerView.setLayoutManager(this.A);
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = this.f133544p;
        if (wxRecyclerAdapter == null) {
            kotlin.jvm.internal.o.o("emojiAdapter");
            throw null;
        }
        wxRecyclerView.setAdapter(wxRecyclerAdapter);
        Q6().f107401g = new com.tencent.mm.plugin.finder.viewmodel.component.ta(this);
        Q6().f107402h = new com.tencent.mm.plugin.finder.viewmodel.component.ua(this);
        android.widget.FrameLayout frameLayout = this.f133536e;
        if (frameLayout == null) {
            kotlin.jvm.internal.o.o("stateLayout");
            throw null;
        }
        frameLayout.setBackgroundResource(com.tencent.mm.R.drawable.abi);
        android.widget.FrameLayout frameLayout2 = this.f133536e;
        if (frameLayout2 == null) {
            kotlin.jvm.internal.o.o("stateLayout");
            throw null;
        }
        frameLayout2.setVisibility(0);
        com.tencent.mm.plugin.finder.feed.model.internal.Dispatcher.register$default(Q6(), (com.tencent.mm.plugin.finder.viewmodel.component.ka) ((jz5.n) this.f133543o).getValue(), false, 2, null);
        this.f133549u.alive();
        if (getActivity() instanceof com.tencent.mm.plugin.finder.feed.ui.FinderEmojiSelectUI) {
            pf5.e.launch$default(this, null, null, new com.tencent.mm.plugin.finder.viewmodel.component.oa(this, null), 3, null);
            return;
        }
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        Q6().c(((com.tencent.mm.plugin.finder.profile.uic.FinderProfileAllLayoutUIC) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.profile.uic.FinderProfileAllLayoutUIC.class)).f123416f, null);
        com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader.requestInit$default(Q6(), false, 1, null);
        Q6().requestRefresh();
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        this.f133549u.dead();
        Q6().unregister((com.tencent.mm.plugin.finder.viewmodel.component.ka) ((jz5.n) this.f133543o).getValue());
        this.B.c();
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onPause() {
        super.onPause();
        if (this.f133552x) {
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).yj("page_out", this, R6(), 10, false);
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onResume() {
        boolean z17 = this.f133552x;
        if (!z17 && !this.f133551w) {
            this.f133551w = true;
        } else if (z17) {
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).yj("page_in", this, R6(), 10, false);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderEmojiListUIC(androidx.fragment.app.Fragment fragment) {
        super(fragment);
        r45.qt2 V6;
        androidx.fragment.app.Fragment parentFragment;
        kotlin.jvm.internal.o.g(fragment, "fragment");
        this.f133537f = "";
        this.f133540i = jz5.h.b(new com.tencent.mm.plugin.finder.viewmodel.component.za(this));
        this.f133541m = jz5.h.b(new com.tencent.mm.plugin.finder.viewmodel.component.ya(this));
        this.f133542n = jz5.h.b(new com.tencent.mm.plugin.finder.viewmodel.component.bb(this));
        this.f133543o = jz5.h.b(new com.tencent.mm.plugin.finder.viewmodel.component.la(this));
        androidx.fragment.app.Fragment fragment2 = getFragment();
        if (fragment2 != null && (parentFragment = fragment2.getParentFragment()) != null) {
            V6 = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.b(parentFragment).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6();
        } else {
            androidx.appcompat.app.AppCompatActivity activity = getActivity();
            kotlin.jvm.internal.o.g(activity, "activity");
            V6 = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6();
        }
        this.f133545q = V6;
        this.f133546r = jz5.h.b(new com.tencent.mm.plugin.finder.viewmodel.component.ma(this));
        this.f133547s = jz5.h.b(new com.tencent.mm.plugin.finder.viewmodel.component.wa(this));
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.f133549u = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.UgcEmojiChangedEvent>(a0Var) { // from class: com.tencent.mm.plugin.finder.viewmodel.component.FinderEmojiListUIC$eventListener$1
            {
                this.__eventId = -664387125;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.UgcEmojiChangedEvent ugcEmojiChangedEvent) {
                com.tencent.mm.autogen.events.UgcEmojiChangedEvent event = ugcEmojiChangedEvent;
                kotlin.jvm.internal.o.g(event, "event");
                event.f54908g.getClass();
                com.tencent.mars.xlog.Log.i("FinderEmojiListUIC", "UgcEmojiChangedEvent: null");
                com.tencent.mm.plugin.finder.viewmodel.component.FinderEmojiListUIC.this.Q6().requestRefresh();
                return false;
            }
        };
        this.B = new com.tencent.wechat.aff.emoticon.i();
    }
}
