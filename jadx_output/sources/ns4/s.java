package ns4;

/* loaded from: classes8.dex */
public final class s implements js4.k {

    /* renamed from: a, reason: collision with root package name */
    public final androidx.fragment.app.FragmentActivity f339636a;

    /* renamed from: b, reason: collision with root package name */
    public final js4.n f339637b;

    /* renamed from: c, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.y1 f339638c;

    /* renamed from: d, reason: collision with root package name */
    public ns4.v f339639d;

    /* renamed from: e, reason: collision with root package name */
    public final ms4.h f339640e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f339641f;

    /* renamed from: g, reason: collision with root package name */
    public ns4.d f339642g;

    /* renamed from: h, reason: collision with root package name */
    public ns4.d f339643h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.View f339644i;

    /* renamed from: j, reason: collision with root package name */
    public android.widget.TextView f339645j;

    /* renamed from: k, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.u3 f339646k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f339647l;

    /* renamed from: m, reason: collision with root package name */
    public js4.j f339648m;

    /* renamed from: n, reason: collision with root package name */
    public js4.e f339649n;

    public s(final androidx.fragment.app.FragmentActivity context, js4.n params) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(params, "params");
        this.f339636a = context;
        this.f339637b = params;
        this.f339641f = false;
        ms4.i iVar = new ms4.i(params);
        if (params.f301555m) {
            this.f339640e = (ms4.h) iVar.a(ms4.h.class);
        } else {
            androidx.lifecycle.c1 a17 = androidx.lifecycle.k1.a(context, iVar).a(ms4.h.class);
            kotlin.jvm.internal.o.f(a17, "get(...)");
            this.f339640e = (ms4.h) a17;
        }
        ms4.h hVar = this.f339640e;
        hVar.getClass();
        hVar.f331036o = os4.h.d(params.f301543a);
        java.lang.String uuid = java.util.UUID.randomUUID().toString();
        kotlin.jvm.internal.o.f(uuid, "toString(...)");
        hVar.f331038q = uuid;
        int i17 = params.f301543a;
        if (i17 != 0 && ((i17 != 1 && i17 != 2) || (uuid = params.f301545c) == null)) {
            uuid = "";
        }
        hVar.f331037p = uuid;
        ms4.h hVar2 = this.f339640e;
        hVar2.f331030f.removeObservers(context);
        hVar2.f331031g.removeObservers(context);
        hVar2.f331029e.removeObservers(context);
        hVar2.f331032h.removeObservers(context);
        com.tencent.mm.ui.widget.dialog.y1 y1Var = params.f301551i;
        this.f339638c = y1Var == null ? new com.tencent.mm.ui.widget.dialog.y1(context, 0, false, true) : y1Var;
        r45.js3 js3Var = null;
        if (context.getResources().getConfiguration().orientation == 2) {
            com.tencent.mm.ui.widget.dialog.y1 y1Var2 = this.f339638c;
            if (y1Var2 == null) {
                kotlin.jvm.internal.o.o("mBottomSheet");
                throw null;
            }
            y1Var2.m(java.lang.Boolean.TRUE);
        }
        com.tencent.mm.ui.widget.dialog.y1 y1Var3 = this.f339638c;
        if (y1Var3 == null) {
            kotlin.jvm.internal.o.o("mBottomSheet");
            throw null;
        }
        y1Var3.p(false);
        com.tencent.mm.ui.widget.dialog.y1 y1Var4 = this.f339638c;
        if (y1Var4 == null) {
            kotlin.jvm.internal.o.o("mBottomSheet");
            throw null;
        }
        y1Var4.o(new ns4.k(this));
        com.tencent.mm.ui.widget.dialog.y1 y1Var5 = this.f339638c;
        if (y1Var5 == null) {
            kotlin.jvm.internal.o.o("mBottomSheet");
            throw null;
        }
        y1Var5.n(new ns4.l(this));
        androidx.recyclerview.widget.i0 i0Var = new androidx.recyclerview.widget.i0(context, 0);
        i0Var.d(context.getResources().getDrawable(com.tencent.mm.R.drawable.bb8, null));
        android.view.View inflate = android.view.View.inflate(context, com.tencent.mm.R.layout.f488254o8, null);
        kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        this.f339644i = inflate;
        android.view.View findViewById = inflate.findViewById(com.tencent.mm.R.id.gyf);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f339645j = (android.widget.TextView) findViewById;
        android.view.View view = this.f339644i;
        if (view == null) {
            kotlin.jvm.internal.o.o("mCustomView");
            throw null;
        }
        android.view.View findViewById2 = view.findViewById(com.tencent.mm.R.id.b4m);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        android.widget.TextView textView = (android.widget.TextView) findViewById2;
        android.view.View view2 = this.f339644i;
        if (view2 == null) {
            kotlin.jvm.internal.o.o("mCustomView");
            throw null;
        }
        android.view.View findViewById3 = view2.findViewById(com.tencent.mm.R.id.pk9);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) findViewById3;
        com.tencent.mm.ui.bk.r0(textView.getPaint(), 0.8f);
        os4.h.m(textView, 15);
        android.widget.TextView textView2 = this.f339645j;
        if (textView2 == null) {
            kotlin.jvm.internal.o.o("headerDesc");
            throw null;
        }
        os4.h.m(textView2, 10);
        if (params.f301551i != null) {
            weImageView.setImageResource(com.tencent.mm.R.raw.icons_outlined_back);
        } else {
            weImageView.setImageResource(com.tencent.mm.R.raw.icons_outlined_close);
        }
        int i18 = params.f301543a;
        if (i18 == 2 || i18 == 4 || i18 == 8 || i18 == 10 || i18 == 12 || i18 == 14 || i18 == 16 || i18 == 18 || i18 == 20) {
            textView.setText(com.tencent.mm.R.string.f493679l91);
        }
        weImageView.setOnClickListener(new ns4.j(this));
        android.view.View view3 = this.f339644i;
        if (view3 == null) {
            kotlin.jvm.internal.o.o("mCustomView");
            throw null;
        }
        android.view.View findViewById4 = view3.findViewById(com.tencent.mm.R.id.avc);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        androidx.recyclerview.widget.RecyclerView recyclerView = (androidx.recyclerview.widget.RecyclerView) findViewById4;
        androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = new androidx.recyclerview.widget.LinearLayoutManager(context) { // from class: com.tencent.mm.plugin.wallet.wecoin.ui.BuyGoodsBottomDialog$initCustomView$layoutManager$1
            @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
            public boolean canScrollHorizontally() {
                return false;
            }
        };
        linearLayoutManager.Q(0);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.N(i0Var);
        ns4.d dVar = new ns4.d(this);
        this.f339642g = dVar;
        recyclerView.setAdapter(dVar);
        androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager2 = new androidx.recyclerview.widget.LinearLayoutManager(context) { // from class: com.tencent.mm.plugin.wallet.wecoin.ui.BuyGoodsBottomDialog$initCustomView$secondLayoutManager$1
            @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
            public boolean canScrollHorizontally() {
                return false;
            }
        };
        linearLayoutManager2.Q(0);
        android.view.View view4 = this.f339644i;
        if (view4 == null) {
            kotlin.jvm.internal.o.o("mCustomView");
            throw null;
        }
        android.view.View findViewById5 = view4.findViewById(com.tencent.mm.R.id.avg);
        kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
        androidx.recyclerview.widget.RecyclerView recyclerView2 = (androidx.recyclerview.widget.RecyclerView) findViewById5;
        recyclerView2.setLayoutManager(linearLayoutManager2);
        recyclerView2.N(i0Var);
        ns4.d dVar2 = new ns4.d(this);
        this.f339643h = dVar2;
        recyclerView2.setAdapter(dVar2);
        android.view.View view5 = this.f339644i;
        if (view5 == null) {
            kotlin.jvm.internal.o.o("mCustomView");
            throw null;
        }
        dy1.a.i(view5, "buy_coin_view");
        android.view.View view6 = this.f339644i;
        if (view6 == null) {
            kotlin.jvm.internal.o.o("mCustomView");
            throw null;
        }
        dy1.a.k(view6, kz5.c1.l(new jz5.l("coin_report_session_id", js4.r.f301567c), new jz5.l("coin_business_id", java.lang.Integer.valueOf(js4.r.f301565a))));
        android.view.View view7 = this.f339644i;
        if (view7 == null) {
            kotlin.jvm.internal.o.o("mCustomView");
            throw null;
        }
        dy1.a.l(view7, 32, 25955);
        c(java.lang.Boolean.TRUE);
        ms4.h hVar3 = this.f339640e;
        hVar3.f331029e.observe(context, new ns4.e(this));
        hVar3.f331030f.observe(context, new ns4.f(this));
        hVar3.f331031g.observe(context, new ns4.g(this));
        hVar3.f331032h.observe(context, new ns4.h(this));
        ms4.h hVar4 = this.f339640e;
        com.tencent.mars.xlog.Log.i("MicroMsg.RechargeProductsDialogViewModel", "getCacheData, isCacheDataLoaded: %s", java.lang.Boolean.valueOf(hVar4.f331035n));
        if (!hVar4.f331035n) {
            hVar4.f331035n = true;
            int a18 = js4.s.a(hVar4.f331028d.f301543a);
            java.lang.String str = (java.lang.String) gm0.j1.u().c().p(a18 + "USERINFO_WECOIN_PRICE_LIST_RESPONSE_STRING_SYNC", "");
            if (!(str == null || str.length() == 0)) {
                r45.js3 js3Var2 = new r45.js3();
                byte[] bytes = str.getBytes(r26.c.f368867c);
                kotlin.jvm.internal.o.f(bytes, "getBytes(...)");
                try {
                    js3Var2.parseFrom(bytes);
                    js3Var = js3Var2;
                } catch (java.lang.Exception e17) {
                    com.tencent.mm.sdk.platformtools.Log.a("safeParser", "", e17);
                }
            }
            androidx.lifecycle.j0 j0Var = hVar4.f331032h;
            if (js3Var != null) {
                j0Var.postValue(js3Var);
            }
            r45.js3 js3Var3 = (r45.js3) j0Var.getValue();
            if (js3Var3 != null) {
                hVar4.f331034m = js3Var3.f378088g;
            }
            long i19 = os4.h.i();
            if (i19 > 0) {
                hVar4.f331030f.postValue(java.lang.Long.valueOf(i19));
            }
        }
        js4.n nVar = this.f339637b;
        int i27 = nVar.f301543a;
        int i28 = nVar.f301544b;
        int i29 = (int) nVar.f301553k;
        hVar4.N6(8, 1, 0, "");
        ks4.g gVar = new ks4.g(i28 >= 1 ? i28 : js4.s.a(i27), i27, java.lang.Integer.valueOf(i29));
        hVar4.f331033i = gVar;
        pq5.g l17 = gVar.l();
        if (l17 != null) {
            l17.h(new ms4.g(hVar4, i28));
        }
        new ks4.e().l().h(new ms4.f(hVar4));
    }

    public static final void a(ns4.s sVar, r45.ja7 info) {
        com.tencent.mm.plugin.finder.live.view.k0 Y0;
        android.view.View view = sVar.f339644i;
        if (view == null) {
            kotlin.jvm.internal.o.o("mCustomView");
            throw null;
        }
        boolean isChecked = ((android.widget.CheckBox) view.findViewById(com.tencent.mm.R.id.lmb)).isChecked();
        ms4.h hVar = sVar.f339640e;
        if (isChecked) {
            sVar.f339647l = true;
            js4.j jVar = sVar.f339648m;
            if (jVar != null) {
                jVar.a(sVar, java.lang.Boolean.FALSE);
            }
            js4.e eVar = sVar.f339649n;
            if (eVar != null && (Y0 = ((com.tencent.mm.plugin.finder.live.plugin.yk) eVar).f115207a.Y0()) != null) {
                Y0.changeScreenToPortrait();
            }
            com.tencent.mm.ui.widget.dialog.y1 y1Var = sVar.f339638c;
            if (y1Var == null) {
                kotlin.jvm.internal.o.o("mBottomSheet");
                throw null;
            }
            y1Var.q();
            ((q30.k) ((r30.p) i95.n0.c(r30.p.class))).Ai();
            int i17 = sVar.f339637b.f301543a;
            hVar.getClass();
            androidx.fragment.app.FragmentActivity context = sVar.f339636a;
            kotlin.jvm.internal.o.g(context, "context");
            kotlin.jvm.internal.o.g(info, "info");
            js4.n nVar = new js4.n();
            nVar.f301548f = info.f377679d;
            nVar.f301547e = hVar.f331034m;
            nVar.f301543a = i17;
            java.lang.String str = hVar.f331037p;
            if (str == null) {
                kotlin.jvm.internal.o.o("mSceneSessionID");
                throw null;
            }
            nVar.f301545c = str;
            js4.n nVar2 = hVar.f331028d;
            nVar.f301546d = nVar2.f301546d;
            nVar.f301544b = nVar2.f301544b;
            nVar.f301553k = nVar2.f301553k;
            nVar.f301554l = (r45.js3) hVar.f331032h.getValue();
            nVar.f301550h = info.f377680e;
            ms4.j0.f331046e.c(context, nVar);
        } else {
            sVar.b();
        }
        hVar.O6(5);
    }

    public final void b() {
        android.view.animation.Animation loadAnimation = android.view.animation.AnimationUtils.loadAnimation(this.f339636a, com.tencent.mm.R.anim.f477737y);
        android.view.View view = this.f339644i;
        if (view != null) {
            ((android.widget.LinearLayout) view.findViewById(com.tencent.mm.R.id.lmc)).startAnimation(loadAnimation);
        } else {
            kotlin.jvm.internal.o.o("mCustomView");
            throw null;
        }
    }

    public final void c(java.lang.Boolean bool) {
        com.tencent.mm.ui.widget.dialog.u3 u3Var;
        if (bool == null) {
            return;
        }
        if (bool.booleanValue()) {
            androidx.fragment.app.FragmentActivity fragmentActivity = this.f339636a;
            u3Var = com.tencent.mm.ui.widget.dialog.u3.f(fragmentActivity, fragmentActivity.getString(com.tencent.mm.R.string.ggc), true, 3, new ns4.n(this));
        } else {
            com.tencent.mm.ui.widget.dialog.u3 u3Var2 = this.f339646k;
            if (u3Var2 != null) {
                u3Var2.dismiss();
            }
            u3Var = null;
        }
        this.f339646k = u3Var;
    }

    public void d() {
        com.tencent.mm.ui.widget.dialog.y1 y1Var = this.f339638c;
        if (y1Var != null) {
            y1Var.q();
        } else {
            kotlin.jvm.internal.o.o("mBottomSheet");
            throw null;
        }
    }
}
