package com.tencent.mm.ui.contact.address;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007"}, d2 = {"Lcom/tencent/mm/ui/contact/address/MvvmAddressUIFragment;", "Lcom/tencent/mm/ui/contact/address/BaseAddressUIFragment;", "<init>", "()V", "tf5/n", "tf5/o", "tf5/p", "app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class MvvmAddressUIFragment extends com.tencent.mm.ui.contact.address.BaseAddressUIFragment {
    public static final /* synthetic */ int S = 0;
    public com.tencent.mm.ui.contact.q3 A;
    public com.tencent.mm.ui.base.AlphabetScrollBar B;
    public rl5.r C;
    public int D;
    public int E;

    /* renamed from: J, reason: collision with root package name */
    public final androidx.recyclerview.widget.y2 f206601J;
    public com.tencent.mm.view.recyclerview.WxLinearLayoutManager K;
    public final jz5.g L;
    public final jz5.g M;
    public android.view.animation.Animation N;
    public android.view.animation.Animation P;
    public final jz5.g Q;
    public final java.lang.Runnable R;

    /* renamed from: p, reason: collision with root package name */
    public com.tencent.mm.view.recyclerview.WxRecyclerView f206603p;

    /* renamed from: q, reason: collision with root package name */
    public android.view.View f206604q;

    /* renamed from: r, reason: collision with root package name */
    public com.tencent.mm.ui.contact.a4 f206605r;

    /* renamed from: s, reason: collision with root package name */
    public com.tencent.mm.ui.contact.BizContactEntranceView f206606s;

    /* renamed from: t, reason: collision with root package name */
    public com.tencent.mm.ui.contact.BizContactEntranceView f206607t;

    /* renamed from: u, reason: collision with root package name */
    public com.tencent.mm.ui.contact.g0 f206608u;

    /* renamed from: v, reason: collision with root package name */
    public com.tencent.mm.ui.contact.g0 f206609v;

    /* renamed from: w, reason: collision with root package name */
    public com.tencent.mm.ui.contact.g0 f206610w;

    /* renamed from: x, reason: collision with root package name */
    public com.tencent.mm.ui.contact.g0 f206611x;

    /* renamed from: y, reason: collision with root package name */
    public com.tencent.mm.ui.contact.ContactCountView f206612y;

    /* renamed from: z, reason: collision with root package name */
    public com.tencent.mm.ui.contact.g8 f206613z;

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f206602o = jz5.h.b(tf5.k0.f418999d);
    public final jz5.g F = jz5.h.b(tf5.r.f419012d);
    public final jz5.g G = jz5.h.b(tf5.s.f419013d);
    public final jz5.g H = jz5.h.b(new tf5.t(this));
    public final jz5.g I = jz5.h.b(new tf5.a0(this));

    public MvvmAddressUIFragment() {
        androidx.recyclerview.widget.y2 y2Var = new androidx.recyclerview.widget.y2();
        y2Var.e(2, 30);
        y2Var.e(1, 10);
        this.f206601J = y2Var;
        this.L = jz5.h.b(new tf5.q(this));
        this.M = jz5.h.b(new tf5.j0(this));
        this.Q = jz5.h.b(new tf5.c0(this));
        this.R = new tf5.u(this);
    }

    public final void A0(int i17) {
        int i18 = 0;
        for (java.lang.Object obj : z0().f152065o) {
            int i19 = i18 + 1;
            if (i18 < 0) {
                kz5.c0.p();
                throw null;
            }
            tf5.g gVar = (tf5.g) obj;
            if (gVar.f418980f == i17 && gVar.f418981g) {
                com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = this.f206603p;
                if (wxRecyclerView != null) {
                    wxRecyclerView.f1();
                }
                com.tencent.mm.view.recyclerview.WxLinearLayoutManager wxLinearLayoutManager = this.K;
                if (wxLinearLayoutManager != null) {
                    int a07 = i18 + y0().a0();
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    arrayList.add(0);
                    arrayList.add(java.lang.Integer.valueOf(a07));
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(wxLinearLayoutManager, arrayList.toArray(), "com/tencent/mm/ui/contact/address/MvvmAddressUIFragment", "scrollToShowHead", "(I)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
                    wxLinearLayoutManager.P(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue());
                    yj0.a.f(wxLinearLayoutManager, "com/tencent/mm/ui/contact/address/MvvmAddressUIFragment", "scrollToShowHead", "(I)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
                    return;
                }
                return;
            }
            i18 = i19;
        }
    }

    @Override // com.tencent.mm.ui.contact.address.BaseAddressUIFragment, com.tencent.mm.ui.y7
    public void B() {
        tf5.m mVar;
        androidx.fragment.app.FragmentActivity activity = getActivity();
        if (activity == null) {
            mVar = null;
        } else {
            pf5.z zVar = pf5.z.f353948a;
            if (!(activity instanceof androidx.appcompat.app.AppCompatActivity)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            mVar = (tf5.m) zVar.a((androidx.appcompat.app.AppCompatActivity) activity).e(tf5.m.class);
        }
        if (mVar != null) {
            mVar.f419004e = false;
            mVar.f419003d = c01.id.c();
        }
    }

    @Override // com.tencent.mm.ui.contact.address.BaseAddressUIFragment, com.tencent.mm.ui.y7
    public void e0() {
        com.tencent.mm.ui.contact.BizContactEntranceView bizContactEntranceView = this.f206606s;
        if (bizContactEntranceView != null) {
            bizContactEntranceView.destroyDrawingCache();
        }
        com.tencent.mm.ui.contact.BizContactEntranceView bizContactEntranceView2 = this.f206607t;
        if (bizContactEntranceView2 != null) {
            bizContactEntranceView2.destroyDrawingCache();
        }
        com.tencent.mm.ui.contact.g0 g0Var = this.f206608u;
        if (g0Var != null) {
            g0Var.destroyDrawingCache();
        }
        com.tencent.mm.ui.contact.g0 g0Var2 = this.f206610w;
        if (g0Var2 != null) {
            g0Var2.destroyDrawingCache();
        }
        com.tencent.mm.ui.contact.g0 g0Var3 = this.f206611x;
        if (g0Var3 != null) {
            g0Var3.destroyDrawingCache();
        }
        com.tencent.mm.ui.contact.ContactCountView contactCountView = this.f206612y;
        if (contactCountView != null) {
            contactCountView.destroyDrawingCache();
        }
        com.tencent.mm.ui.contact.a4 a4Var = this.f206605r;
        if (a4Var != null) {
            a4Var.destroyDrawingCache();
        }
    }

    @Override // com.tencent.mm.ui.AbstractTabChildActivity.AbStractTabFragment, com.tencent.mm.ui.MMFragment
    /* renamed from: getLayoutId */
    public int getF72225d() {
        return 0;
    }

    @Override // com.tencent.mm.ui.MMFragment
    public android.view.View getLayoutView() {
        com.tencent.mm.ui.td a17 = com.tencent.mm.ui.td.f209893c.a("LayoutsForLauncherUI");
        android.view.LayoutInflater from = android.view.LayoutInflater.from(getContext());
        kotlin.jvm.internal.o.f(from, "from(...)");
        return a17.a(from, com.tencent.mm.R.layout.f487989df, null, false);
    }

    @Override // com.tencent.mm.ui.contact.address.BaseAddressUIFragment, com.tencent.mm.ui.AbstractTabChildActivity.AbStractTabFragment
    public void l0(android.os.Bundle bundle) {
        com.tencent.mm.ui.contact.q3 q3Var;
        android.view.View view;
        com.tencent.mars.xlog.Log.i("MicroMsg.Mvvm.MvvmAddressUIFragment", "onTabCreate");
        tf5.l0 l0Var = (tf5.l0) ((jz5.n) this.f206602o).getValue();
        l0Var.getClass();
        l0Var.f419000a = c01.id.c();
        l0Var.f419001b = "MvvmAddressUI";
        java.lang.String uuid = java.util.UUID.randomUUID().toString();
        kotlin.jvm.internal.o.f(uuid, "toString(...)");
        l0Var.f419002c = uuid;
        x0();
        android.app.Activity context = getContext();
        if (context != null && com.tencent.mm.ui.b4.c(context) && (view = getView()) != null) {
            view.setBackgroundColor(context.getColor(com.tencent.mm.R.color.BW_93));
        }
        android.view.View view2 = getView();
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = view2 != null ? (com.tencent.mm.view.recyclerview.WxRecyclerView) view2.findViewById(com.tencent.mm.R.id.f482736mg) : null;
        this.f206603p = wxRecyclerView;
        if (wxRecyclerView != null) {
            wxRecyclerView.setHasFixedSize(true);
        }
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView2 = this.f206603p;
        if (wxRecyclerView2 != null) {
            wxRecyclerView2.setItemViewCacheSize(30);
        }
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView3 = this.f206603p;
        if (wxRecyclerView3 != null) {
            wxRecyclerView3.setRecycledViewPool(this.f206601J);
        }
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView4 = this.f206603p;
        if (wxRecyclerView4 != null) {
            wxRecyclerView4.setAdapter(y0());
        }
        android.app.Activity context2 = getContext();
        if (context2 != null) {
            com.tencent.mm.view.recyclerview.WxLinearLayoutManager wxLinearLayoutManager = new com.tencent.mm.view.recyclerview.WxLinearLayoutManager(context2);
            this.K = wxLinearLayoutManager;
            wxLinearLayoutManager.f11881u = 20;
            com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView5 = this.f206603p;
            if (wxRecyclerView5 != null) {
                wxRecyclerView5.setLayoutManager(wxLinearLayoutManager);
            }
        }
        android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(getContext());
        linearLayout.setImportantForAccessibility(2);
        linearLayout.setOrientation(1);
        com.tencent.mm.ui.t7 t7Var = com.tencent.mm.ui.t7.f209881a;
        if (t7Var.a()) {
            android.content.Context requireContext = requireContext();
            kotlin.jvm.internal.o.f(requireContext, "requireContext(...)");
            android.view.View b17 = t7Var.b(requireContext, com.tencent.mm.ui.LauncherUI.getInstance().f7());
            this.f206604q = b17;
            linearLayout.addView(b17);
        }
        com.tencent.mm.ui.contact.g0 g0Var = new com.tencent.mm.ui.contact.g0(getContext(), com.tencent.mm.ui.contact.f0.ContactIpCall);
        this.f206609v = g0Var;
        linearLayout.addView(g0Var);
        com.tencent.mm.ui.contact.g0 g0Var2 = this.f206609v;
        if (g0Var2 != null) {
            g0Var2.setVisible(false);
        }
        com.tencent.mm.ui.contact.a4 a4Var = new com.tencent.mm.ui.contact.a4(getContext());
        this.f206605r = a4Var;
        linearLayout.addView(a4Var);
        com.tencent.mm.ui.contact.g0 g0Var3 = new com.tencent.mm.ui.contact.g0(getContext(), com.tencent.mm.ui.contact.f0.OnlyChat);
        this.f206611x = g0Var3;
        linearLayout.addView(g0Var3);
        boolean o17 = gm0.j1.u().c().o(com.tencent.mm.storage.u3.USERINFO_CHATONLY_ENTRANCE_BOOLEAN, false);
        if (!o17) {
            ((ku5.t0) ku5.t0.f312615d).q(new tf5.w(this));
        }
        com.tencent.mm.ui.contact.g0 g0Var4 = this.f206611x;
        if (g0Var4 != null) {
            g0Var4.setVisible(o17);
        }
        com.tencent.mm.ui.contact.g0 g0Var5 = new com.tencent.mm.ui.contact.g0(getContext(), com.tencent.mm.ui.contact.f0.Chatromm);
        this.f206608u = g0Var5;
        linearLayout.addView(g0Var5);
        com.tencent.mm.ui.contact.g0 g0Var6 = this.f206608u;
        if (g0Var6 != null) {
            g0Var6.setVisible(true);
        }
        com.tencent.mm.ui.contact.g0 g0Var7 = new com.tencent.mm.ui.contact.g0(getContext(), com.tencent.mm.ui.contact.f0.ContactLabel);
        this.f206610w = g0Var7;
        linearLayout.addView(g0Var7);
        com.tencent.mm.ui.contact.g0 g0Var8 = this.f206610w;
        if (g0Var8 != null) {
            g0Var8.setVisible(true);
        }
        j45.l.g("brandservice");
        com.tencent.mm.ui.contact.BizContactEntranceView bizContactEntranceView = new com.tencent.mm.ui.contact.BizContactEntranceView(getContext(), 0);
        this.f206606s = bizContactEntranceView;
        linearLayout.addView(bizContactEntranceView);
        com.tencent.mm.ui.contact.BizContactEntranceView bizContactEntranceView2 = this.f206606s;
        if (bizContactEntranceView2 != null) {
            bizContactEntranceView2.setVisible(true);
        }
        com.tencent.mm.ui.contact.BizContactEntranceView bizContactEntranceView3 = new com.tencent.mm.ui.contact.BizContactEntranceView(getContext(), 1);
        this.f206607t = bizContactEntranceView3;
        linearLayout.addView(bizContactEntranceView3);
        com.tencent.mm.ui.contact.BizContactEntranceView bizContactEntranceView4 = this.f206607t;
        if (bizContactEntranceView4 != null) {
            bizContactEntranceView4.setVisible(true);
        }
        tf5.z zVar = new tf5.z(this);
        com.tencent.mm.ui.contact.g8 g8Var = new com.tencent.mm.ui.contact.g8(getContext(), new tf5.x(this));
        this.f206613z = g8Var;
        g8Var.setOnVisibilityChangeListener(zVar);
        com.tencent.mm.ui.contact.g8 g8Var2 = this.f206613z;
        if ((g8Var2 != null ? g8Var2.getOpenIMCount() : 0) <= 0) {
            zVar.a(false);
            com.tencent.mm.ui.contact.g8 g8Var3 = this.f206613z;
            if (g8Var3 != null) {
                g8Var3.setVisibility(8);
            }
        } else {
            zVar.a(true);
        }
        linearLayout.addView(this.f206613z);
        com.tencent.mm.ui.contact.q3 q3Var2 = new com.tencent.mm.ui.contact.q3(getContext(), new tf5.y(this));
        this.A = q3Var2;
        if (q3Var2.getEnterpriseFriendCount() <= 0 && (q3Var = this.A) != null) {
            q3Var.setVisibility(8);
        }
        r01.q3.cj().f368272d.a(this.A, null);
        linearLayout.addView(this.A);
        in5.n0.U(y0(), linearLayout, linearLayout.hashCode(), false, 4, null);
        y0().B = (tf5.b0) ((jz5.n) this.Q).getValue();
        android.view.View view3 = getView();
        com.tencent.mm.ui.base.AlphabetScrollBar alphabetScrollBar = view3 != null ? (com.tencent.mm.ui.base.AlphabetScrollBar) view3.findViewById(com.tencent.mm.R.id.f482748mx) : null;
        this.B = alphabetScrollBar;
        if (alphabetScrollBar != null) {
            alphabetScrollBar.setOnScrollBarTouchListener(new tf5.d0(this));
        }
        this.C = new rl5.r(getContext());
        ((tf5.b) ((jz5.n) this.F).getValue()).f418956f = z0();
        ((tf5.d) ((jz5.n) this.G).getValue()).f418962f = z0();
        tf5.b bVar = (tf5.b) ((jz5.n) this.F).getValue();
        o75.e eVar = dm.e2.D2;
        eVar.observe(this, bVar);
        eVar.observe(this, (tf5.d) ((jz5.n) this.G).getValue());
        kotlinx.coroutines.l.d(androidx.lifecycle.z.a(this), null, null, new tf5.i0(this, null), 3, null);
        ul5.k bounceView = getBounceView();
        if (bounceView != null) {
            bounceView.setEnd2StartBgColor(getResources().getColor(com.tencent.mm.R.color.f478491c));
        }
        jx3.f.INSTANCE.idkeyStat(1728L, 0L, 1L, false);
    }

    @Override // com.tencent.mm.ui.contact.address.BaseAddressUIFragment, com.tencent.mm.ui.AbstractTabChildActivity.AbStractTabFragment
    public void m0() {
        com.tencent.mm.ui.contact.q3 q3Var = this.A;
        if (q3Var != null) {
            l75.v0 v0Var = r01.q3.cj().f368272d;
            if (v0Var != null) {
                v0Var.j(q3Var);
            }
            this.A = null;
        }
        com.tencent.mm.ui.contact.a4 a4Var = this.f206605r;
        if (a4Var != null) {
            if (gm0.j1.a()) {
                r21.w.wi().remove(a4Var.f206585i);
            }
            this.f206605r = null;
        }
        if (this.f206606s != null) {
            this.f206606s = null;
        }
        if (this.f206607t != null) {
            this.f206607t = null;
        }
        if (this.f206608u != null) {
            this.f206608u = null;
        }
        if (this.f206611x != null) {
            this.f206611x = null;
        }
        if (this.f206610w != null) {
            this.f206610w = null;
        }
        if (this.A != null) {
            this.A = null;
        }
        if (this.f206604q != null) {
            this.f206604q = null;
        }
        com.tencent.mm.ui.base.AlphabetScrollBar alphabetScrollBar = this.B;
        if (alphabetScrollBar != null) {
            alphabetScrollBar.f197714q = null;
        }
    }

    @Override // com.tencent.mm.ui.contact.address.BaseAddressUIFragment, com.tencent.mm.ui.AbstractTabChildActivity.AbStractTabFragment
    public void n0() {
        com.tencent.mm.ui.HomeUI homeUI;
        android.app.Activity context = getContext();
        com.tencent.mm.ui.LauncherUI launcherUI = context instanceof com.tencent.mm.ui.LauncherUI ? (com.tencent.mm.ui.LauncherUI) context : null;
        if (launcherUI != null && (homeUI = launcherUI.getHomeUI()) != null) {
            homeUI.T.remove(this.R);
        }
        c01.d9.b().p().w(340226, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        rl5.r rVar = this.C;
        if (rVar != null) {
            rVar.a();
        }
        com.tencent.mm.ui.contact.a4 a4Var = this.f206605r;
        if (a4Var != null) {
            a4Var.setFrontGround(false);
        }
        ((com.tencent.mm.plugin.messenger.foundation.r) i95.n0.c(com.tencent.mm.plugin.messenger.foundation.r.class)).Ai((tf5.n) ((jz5.n) this.M).getValue());
    }

    @Override // com.tencent.mm.ui.contact.address.BaseAddressUIFragment, com.tencent.mm.ui.AbstractTabChildActivity.AbStractTabFragment
    public void o0() {
        com.tencent.mm.ui.HomeUI homeUI;
        android.app.Activity context = getContext();
        com.tencent.mm.ui.LauncherUI launcherUI = context instanceof com.tencent.mm.ui.LauncherUI ? (com.tencent.mm.ui.LauncherUI) context : null;
        if (launcherUI != null && (homeUI = launcherUI.getHomeUI()) != null) {
            java.lang.Runnable runnable = this.R;
            java.util.LinkedList linkedList = homeUI.T;
            if (!linkedList.contains(runnable)) {
                linkedList.add(runnable);
            }
        }
        if (java.lang.System.currentTimeMillis() - c01.d9.b().p().s(340226, 0L) >= 180000) {
            u0();
        }
        com.tencent.mm.ui.contact.a4 a4Var = this.f206605r;
        if (a4Var != null) {
            a4Var.setFrontGround(true);
        }
        com.tencent.mm.ui.contact.a4 a4Var2 = this.f206605r;
        if (a4Var2 != null) {
            a4Var2.b();
        }
        com.tencent.mm.ui.contact.q3 q3Var = this.A;
        if (q3Var != null) {
            if (q3Var.getEnterpriseFriendCount() <= 0) {
                q3Var.setVisibility(8);
            } else {
                q3Var.setVisibility(0);
            }
        }
        com.tencent.mm.ui.contact.BizContactEntranceView bizContactEntranceView = this.f206606s;
        if (bizContactEntranceView != null) {
            bizContactEntranceView.b(true);
        }
        com.tencent.mm.ui.contact.BizContactEntranceView bizContactEntranceView2 = this.f206607t;
        if (bizContactEntranceView2 != null) {
            bizContactEntranceView2.b(true);
        }
        com.tencent.mm.ui.contact.ContactCountView contactCountView = this.f206612y;
        if (contactCountView != null) {
            contactCountView.a();
        }
        com.tencent.mm.ui.a4 a4Var3 = com.tencent.mm.ui.a4.f197117a;
        androidx.fragment.app.FragmentActivity thisActivity = thisActivity();
        kotlin.jvm.internal.o.f(thisActivity, "thisActivity(...)");
        if (a4Var3.h(thisActivity)) {
            android.view.View findViewById = findViewById(com.tencent.mm.R.id.jlt);
            if (findViewById instanceof com.tencent.mm.ui.FrostedContentView) {
                int i17 = com.tencent.mm.ui.FrostedContentView.f196721u;
                ((com.tencent.mm.ui.FrostedContentView) findViewById).a(true, 0, 0.0f);
            }
        }
        com.tencent.mm.ui.contact.q3 q3Var2 = this.A;
        if (q3Var2 != null) {
            q3Var2.b();
        }
        ((com.tencent.mm.plugin.messenger.foundation.r) i95.n0.c(com.tencent.mm.plugin.messenger.foundation.r.class)).wi((tf5.n) ((jz5.n) this.M).getValue());
    }

    @Override // com.tencent.mm.ui.contact.address.BaseAddressUIFragment, com.tencent.mm.ui.y7
    public void r() {
        tf5.m mVar;
        com.tencent.mm.ui.contact.a4 a4Var = this.f206605r;
        if (a4Var != null) {
            a4Var.b();
        }
        androidx.fragment.app.FragmentActivity activity = getActivity();
        if (activity == null) {
            mVar = null;
        } else {
            pf5.z zVar = pf5.z.f353948a;
            if (!(activity instanceof androidx.appcompat.app.AppCompatActivity)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            mVar = (tf5.m) zVar.a((androidx.appcompat.app.AppCompatActivity) activity).e(tf5.m.class);
        }
        if (mVar != null) {
            mVar.f419004e = true;
            mVar.P6("search_button_contact_tab");
        }
    }

    @Override // com.tencent.mm.ui.contact.address.BaseAddressUIFragment, com.tencent.mm.ui.AbstractTabChildActivity.AbStractTabFragment
    public void r0() {
        u0();
    }

    @Override // com.tencent.mm.ui.contact.address.BaseAddressUIFragment
    public java.lang.String s0() {
        return "MicroMsg.Mvvm.MvvmAddressUIFragment";
    }

    @Override // com.tencent.mm.ui.contact.address.BaseAddressUIFragment
    public void u0() {
        com.tencent.mm.view.recyclerview.WxLinearLayoutManager wxLinearLayoutManager = this.K;
        if (wxLinearLayoutManager != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(wxLinearLayoutManager, arrayList.toArray(), "com/tencent/mm/ui/contact/address/MvvmAddressUIFragment", "moveToTop", "()V", "Undefined", "scrollToPositionWithOffset", "(II)V");
            wxLinearLayoutManager.P(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue());
            yj0.a.f(wxLinearLayoutManager, "com/tencent/mm/ui/contact/address/MvvmAddressUIFragment", "moveToTop", "()V", "Undefined", "scrollToPositionWithOffset", "(II)V");
        }
    }

    @Override // com.tencent.mm.ui.contact.address.BaseAddressUIFragment
    public void w0(boolean z17) {
        if (this.B != null) {
            if (this.N == null) {
                android.view.animation.Animation loadAnimation = android.view.animation.AnimationUtils.loadAnimation(getContext(), com.tencent.mm.R.anim.f477778b7);
                this.N = loadAnimation;
                if (loadAnimation != null) {
                    loadAnimation.setDuration(200L);
                }
            }
            if (this.P == null) {
                android.view.animation.Animation loadAnimation2 = android.view.animation.AnimationUtils.loadAnimation(getContext(), com.tencent.mm.R.anim.f477778b7);
                this.P = loadAnimation2;
                if (loadAnimation2 != null) {
                    loadAnimation2.setDuration(200L);
                }
            }
            if (z17) {
                com.tencent.mm.ui.base.AlphabetScrollBar alphabetScrollBar = this.B;
                if (alphabetScrollBar != null && alphabetScrollBar.getVisibility() == 0) {
                    return;
                }
                com.tencent.mm.ui.base.AlphabetScrollBar alphabetScrollBar2 = this.B;
                if (alphabetScrollBar2 != null) {
                    alphabetScrollBar2.setVisibility(0);
                }
                com.tencent.mm.ui.base.AlphabetScrollBar alphabetScrollBar3 = this.B;
                if (alphabetScrollBar3 != null) {
                    alphabetScrollBar3.startAnimation(this.N);
                    return;
                }
                return;
            }
            com.tencent.mm.ui.base.AlphabetScrollBar alphabetScrollBar4 = this.B;
            if (alphabetScrollBar4 != null && 4 == alphabetScrollBar4.getVisibility()) {
                return;
            }
            com.tencent.mm.ui.base.AlphabetScrollBar alphabetScrollBar5 = this.B;
            if (alphabetScrollBar5 != null) {
                alphabetScrollBar5.setVisibility(8);
            }
            com.tencent.mm.ui.base.AlphabetScrollBar alphabetScrollBar6 = this.B;
            if (alphabetScrollBar6 != null) {
                alphabetScrollBar6.startAnimation(this.P);
            }
        }
    }

    public final xm3.t0 y0() {
        return (xm3.t0) ((jz5.n) this.L).getValue();
    }

    public final com.tencent.mm.ui.contact.address.AddressLiveList z0() {
        return (com.tencent.mm.ui.contact.address.AddressLiveList) ((jz5.n) this.I).getValue();
    }
}
