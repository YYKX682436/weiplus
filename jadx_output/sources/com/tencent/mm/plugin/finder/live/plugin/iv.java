package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class iv extends com.tencent.mm.plugin.finder.live.plugin.l {
    public int A;
    public final db5.t4 A1;
    public final android.content.res.Resources B;
    public final com.google.android.material.appbar.AppBarLayout B1;
    public final android.app.Activity C;
    public final int C1;
    public final android.view.View D;
    public final int D1;
    public final android.widget.ImageView E;
    public final com.tencent.mm.plugin.finder.live.view.FinderLiveOnlineStateViewHotCardView E1;
    public final com.google.android.material.tabs.TabLayout F;
    public final java.util.Map F1;
    public final android.view.View G;
    public final android.widget.TextView H;
    public final android.widget.TextView I;

    /* renamed from: J, reason: collision with root package name */
    public final android.widget.TextView f113010J;
    public final android.widget.TextView K;
    public final android.view.View L;
    public final androidx.recyclerview.widget.RecyclerView M;
    public final com.tencent.mm.ui.widget.LiveBottomSheetPanel N;
    public final android.widget.ProgressBar P;
    public final android.view.View Q;
    public final android.view.View R;
    public final android.widget.TextView S;
    public final android.widget.TextView T;
    public final android.view.View U;
    public final android.view.View V;
    public final bm2.n5 W;
    public final jz5.g X;
    public final com.tencent.mm.ui.widget.RoundCornerRelativeLayout Y;
    public final android.view.View Z;

    /* renamed from: l1, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.k0 f113011l1;

    /* renamed from: p, reason: collision with root package name */
    public final zl2.u4 f113012p;

    /* renamed from: p0, reason: collision with root package name */
    public final android.widget.ImageView f113013p0;

    /* renamed from: p1, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.k0 f113014p1;

    /* renamed from: q, reason: collision with root package name */
    public final qo0.c f113015q;

    /* renamed from: r, reason: collision with root package name */
    public final java.lang.String f113016r;

    /* renamed from: s, reason: collision with root package name */
    public final java.lang.String f113017s;

    /* renamed from: t, reason: collision with root package name */
    public final java.lang.String f113018t;

    /* renamed from: u, reason: collision with root package name */
    public final int f113019u;

    /* renamed from: v, reason: collision with root package name */
    public final int f113020v;

    /* renamed from: w, reason: collision with root package name */
    public final int f113021w;

    /* renamed from: x, reason: collision with root package name */
    public final int f113022x;

    /* renamed from: x0, reason: collision with root package name */
    public final android.widget.TextView f113023x0;

    /* renamed from: x1, reason: collision with root package name */
    public java.util.ArrayList f113024x1;

    /* renamed from: y, reason: collision with root package name */
    public final int f113025y;

    /* renamed from: y0, reason: collision with root package name */
    public r45.xn1 f113026y0;

    /* renamed from: y1, reason: collision with root package name */
    public int f113027y1;

    /* renamed from: z, reason: collision with root package name */
    public final int f113028z;

    /* renamed from: z1, reason: collision with root package name */
    public r45.x71 f113029z1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iv(android.view.ViewGroup root, zl2.u4 uiMode, qo0.c statusMonitor) {
        super(root, statusMonitor, null);
        android.view.View inflate;
        android.view.ViewGroup.LayoutParams layoutParams;
        int i17;
        kotlin.jvm.internal.o.g(root, "root");
        kotlin.jvm.internal.o.g(uiMode, "uiMode");
        kotlin.jvm.internal.o.g(statusMonitor, "statusMonitor");
        this.f113012p = uiMode;
        this.f113015q = statusMonitor;
        this.f113016r = "Finder.FinderLiveMemberListPlugin";
        this.f113017s = "PORTRAIT_ACTION_GOTO_PROFILE_MEMBERLIST";
        this.f113018t = "PORTRAIT_ACTION_KEY_FINDER_USERNAME";
        this.f113019u = 1;
        this.f113020v = 10;
        this.f113021w = 11;
        this.f113022x = 12;
        this.f113025y = 13;
        this.f113028z = 14;
        int h07 = (int) (com.tencent.mm.ui.bl.b(com.tencent.mm.sdk.platformtools.x2.f193071a).y * (ae2.in.f3688a.h0() / 100.0f));
        android.content.res.Resources resources = root.getContext().getResources();
        kotlin.jvm.internal.o.f(resources, "getResources(...)");
        this.B = resources;
        android.content.Context context = R0().getContext();
        kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type android.app.Activity");
        android.app.Activity activity = (android.app.Activity) context;
        this.C = activity;
        if (android.os.Build.VERSION.SDK_INT > 25) {
            zl2.w4 w4Var = zl2.w4.f474017a;
            android.view.LayoutInflater layoutInflater = activity.getLayoutInflater();
            kotlin.jvm.internal.o.f(layoutInflater, "getLayoutInflater(...)");
            inflate = (android.view.ViewGroup) w4Var.b(com.tencent.mm.R.layout.e_z, root, false, uiMode, activity, layoutInflater);
        } else {
            inflate = android.view.LayoutInflater.from(root.getContext()).inflate(com.tencent.mm.R.layout.e_z, root, false);
            kotlin.jvm.internal.o.d(inflate);
        }
        android.view.View view = inflate;
        this.D = view;
        android.view.View findViewById = root.findViewById(com.tencent.mm.R.id.agx);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        android.widget.ImageView imageView = (android.widget.ImageView) findViewById;
        this.E = imageView;
        android.view.View findViewById2 = root.findViewById(com.tencent.mm.R.id.nv8);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        com.google.android.material.tabs.TabLayout tabLayout = (com.google.android.material.tabs.TabLayout) findViewById2;
        this.F = tabLayout;
        android.view.View findViewById3 = root.findViewById(com.tencent.mm.R.id.s_m);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        androidx.viewpager.widget.ViewPager viewPager = (androidx.viewpager.widget.ViewPager) findViewById3;
        android.view.View findViewById4 = root.findViewById(com.tencent.mm.R.id.f9p);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        this.G = findViewById4;
        android.view.View findViewById5 = root.findViewById(com.tencent.mm.R.id.f9w);
        kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
        android.widget.TextView textView = (android.widget.TextView) findViewById5;
        this.H = textView;
        android.view.View findViewById6 = view.findViewById(com.tencent.mm.R.id.f9r);
        kotlin.jvm.internal.o.f(findViewById6, "findViewById(...)");
        this.I = (android.widget.TextView) findViewById6;
        android.view.View findViewById7 = view.findViewById(com.tencent.mm.R.id.f9l);
        kotlin.jvm.internal.o.f(findViewById7, "findViewById(...)");
        this.f113010J = (android.widget.TextView) findViewById7;
        android.view.View findViewById8 = view.findViewById(com.tencent.mm.R.id.f9k);
        kotlin.jvm.internal.o.f(findViewById8, "findViewById(...)");
        this.K = (android.widget.TextView) findViewById8;
        android.view.View findViewById9 = view.findViewById(com.tencent.mm.R.id.f9m);
        kotlin.jvm.internal.o.f(findViewById9, "findViewById(...)");
        this.L = findViewById9;
        android.view.View findViewById10 = view.findViewById(com.tencent.mm.R.id.f9j);
        kotlin.jvm.internal.o.f(findViewById10, "findViewById(...)");
        androidx.recyclerview.widget.RecyclerView recyclerView = (androidx.recyclerview.widget.RecyclerView) findViewById10;
        this.M = recyclerView;
        android.view.View findViewById11 = root.findViewById(com.tencent.mm.R.id.f9h);
        kotlin.jvm.internal.o.f(findViewById11, "findViewById(...)");
        com.tencent.mm.ui.widget.LiveBottomSheetPanel liveBottomSheetPanel = (com.tencent.mm.ui.widget.LiveBottomSheetPanel) findViewById11;
        this.N = liveBottomSheetPanel;
        android.view.View findViewById12 = view.findViewById(com.tencent.mm.R.id.f9i);
        kotlin.jvm.internal.o.f(findViewById12, "findViewById(...)");
        android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) findViewById12;
        android.view.View findViewById13 = view.findViewById(com.tencent.mm.R.id.f9q);
        kotlin.jvm.internal.o.f(findViewById13, "findViewById(...)");
        this.P = (android.widget.ProgressBar) findViewById13;
        android.view.View findViewById14 = root.findViewById(com.tencent.mm.R.id.f9g);
        kotlin.jvm.internal.o.f(findViewById14, "findViewById(...)");
        this.Q = findViewById14;
        android.view.View findViewById15 = root.findViewById(com.tencent.mm.R.id.f9n);
        kotlin.jvm.internal.o.f(findViewById15, "findViewById(...)");
        this.R = findViewById15;
        android.view.View findViewById16 = root.findViewById(com.tencent.mm.R.id.f9x);
        kotlin.jvm.internal.o.f(findViewById16, "findViewById(...)");
        this.S = (android.widget.TextView) findViewById16;
        android.view.View findViewById17 = root.findViewById(com.tencent.mm.R.id.f9v);
        kotlin.jvm.internal.o.f(findViewById17, "findViewById(...)");
        this.T = (android.widget.TextView) findViewById17;
        android.view.View findViewById18 = root.findViewById(com.tencent.mm.R.id.r6h);
        kotlin.jvm.internal.o.f(findViewById18, "findViewById(...)");
        this.U = findViewById18;
        android.view.View findViewById19 = root.findViewById(com.tencent.mm.R.id.f9d);
        kotlin.jvm.internal.o.f(findViewById19, "findViewById(...)");
        this.V = findViewById19;
        android.content.Context context2 = R0().getContext();
        kotlin.jvm.internal.o.f(context2, "getContext(...)");
        android.content.res.Resources resources2 = root.getContext().getResources();
        kotlin.jvm.internal.o.f(resources2, "getResources(...)");
        bm2.n5 n5Var = new bm2.n5(uiMode, context2, resources2, recyclerView, findViewById19, liveBottomSheetPanel, (mm2.c1) P0(mm2.c1.class), (mm2.f5) P0(mm2.f5.class), this);
        this.W = n5Var;
        jz5.g b17 = jz5.h.b(new com.tencent.mm.plugin.finder.live.plugin.gv(this));
        this.X = b17;
        android.view.View findViewById20 = root.findViewById(com.tencent.mm.R.id.f9u);
        kotlin.jvm.internal.o.f(findViewById20, "findViewById(...)");
        com.tencent.mm.ui.widget.RoundCornerRelativeLayout roundCornerRelativeLayout = (com.tencent.mm.ui.widget.RoundCornerRelativeLayout) findViewById20;
        this.Y = roundCornerRelativeLayout;
        android.view.View findViewById21 = root.findViewById(com.tencent.mm.R.id.f9t);
        kotlin.jvm.internal.o.f(findViewById21, "findViewById(...)");
        this.Z = findViewById21;
        android.view.View findViewById22 = root.findViewById(com.tencent.mm.R.id.f9f);
        kotlin.jvm.internal.o.f(findViewById22, "findViewById(...)");
        this.f113013p0 = (android.widget.ImageView) findViewById22;
        android.view.View findViewById23 = root.findViewById(com.tencent.mm.R.id.eqh);
        kotlin.jvm.internal.o.f(findViewById23, "findViewById(...)");
        this.f113023x0 = (android.widget.TextView) findViewById23;
        this.f113024x1 = new java.util.ArrayList();
        this.A1 = new com.tencent.mm.plugin.finder.live.plugin.tu(this);
        this.B1 = (com.google.android.material.appbar.AppBarLayout) root.findViewById(com.tencent.mm.R.id.f9b);
        this.C1 = i65.a.b(root.getContext(), 64);
        resources.getColor(com.tencent.mm.R.color.a9e);
        this.D1 = resources.getColor(com.tencent.mm.R.color.f478494f);
        android.view.View findViewById24 = root.findViewById(com.tencent.mm.R.id.u2v);
        kotlin.jvm.internal.o.f(findViewById24, "findViewById(...)");
        com.tencent.mm.plugin.finder.live.view.FinderLiveOnlineStateViewHotCardView finderLiveOnlineStateViewHotCardView = (com.tencent.mm.plugin.finder.live.view.FinderLiveOnlineStateViewHotCardView) findViewById24;
        this.E1 = finderLiveOnlineStateViewHotCardView;
        android.view.ViewGroup.LayoutParams layoutParams2 = roundCornerRelativeLayout.getLayoutParams();
        int i18 = layoutParams2 != null ? layoutParams2.height : 0;
        this.A = i18;
        if (i18 <= 0) {
            this.A = resources.getDimensionPixelOffset(com.tencent.mm.R.dimen.f479731dn);
        }
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveMemberListPlugin", "initTitleGroupHeight:" + this.A);
        recyclerView.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(root.getContext()));
        recyclerView.setAdapter(n5Var);
        int i19 = this.A;
        android.view.ViewGroup viewGroup = this.f365323d;
        int c17 = com.tencent.mm.ui.bl.c(viewGroup.getContext());
        if (x0()) {
            liveBottomSheetPanel.getLayoutParams().width = com.tencent.mm.ui.bl.b(viewGroup.getContext()).y;
            liveBottomSheetPanel.setTranslationX(com.tencent.mm.ui.bl.b(viewGroup.getContext()).x);
            liveBottomSheetPanel.setForbidNestScroll(true);
            liveBottomSheetPanel.setOnClickListener(com.tencent.mm.plugin.finder.live.plugin.wt.f114993d);
            relativeLayout.getLayoutParams().height = com.tencent.mm.ui.bl.b(viewGroup.getContext()).y - i19;
            recyclerView.getLayoutParams().height = com.tencent.mm.ui.bl.b(viewGroup.getContext()).y - i19;
        } else {
            liveBottomSheetPanel.setTranslationY(com.tencent.mm.ui.bl.b(viewGroup.getContext()).y);
            liveBottomSheetPanel.getLayoutParams().height = h07;
            android.view.ViewGroup.LayoutParams layoutParams3 = relativeLayout.getLayoutParams();
            kotlin.jvm.internal.o.e(layoutParams3, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ((android.view.ViewGroup.MarginLayoutParams) layoutParams3).bottomMargin += c17;
            int i27 = (h07 - i19) - c17;
            relativeLayout.getLayoutParams().height = i27;
            recyclerView.getLayoutParams().height = i27;
        }
        com.tencent.mm.ui.bk.r0(textView.getPaint(), 0.8f);
        java.util.List i28 = kz5.c0.i(view, ((com.tencent.mm.plugin.finder.live.widget.wv) ((jz5.n) b17).getValue()).f120238c);
        android.view.ViewGroup viewGroup2 = this.f365323d;
        java.util.List i29 = kz5.c0.i(viewGroup2.getContext().getString(com.tencent.mm.R.string.nrw), viewGroup2.getContext().getString(com.tencent.mm.R.string.nrx));
        tabLayout.setTabRippleColor(android.content.res.ColorStateList.valueOf(0));
        tabLayout.setVisibility(0);
        viewPager.clearOnPageChangeListeners();
        viewPager.addOnPageChangeListener(new com.tencent.mm.plugin.finder.live.plugin.pu(this));
        android.content.Context context3 = viewGroup2.getContext();
        kotlin.jvm.internal.o.f(context3, "getContext(...)");
        viewPager.setAdapter(new com.tencent.mm.plugin.finder.live.plugin.fp0(context3, i28, i29));
        tabLayout.t(viewGroup2.getContext().getColor(com.tencent.mm.R.color.FG_1), viewGroup2.getContext().getColor(com.tencent.mm.R.color.ak7));
        tabLayout.a(new com.tencent.mm.plugin.finder.live.plugin.ut(this));
        tabLayout.setupWithViewPager(viewPager);
        if (!x0() && (layoutParams = imageView.getLayoutParams()) != null) {
            com.tencent.mm.ui.ah a17 = com.tencent.mm.ui.bh.a(com.tencent.mm.sdk.platformtools.x2.f193071a);
            java.lang.System.nanoTime();
            boolean z17 = com.tencent.mm.ui.bk.y() || com.tencent.mm.ui.bk.Q() || com.tencent.mm.ui.bk.A();
            java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
            int i37 = a17.f197135a;
            if (!z17 && i37 > (i17 = a17.f197136b)) {
                i37 = i17;
            }
            layoutParams.height = (int) ((i37 * com.tencent.mars.cdn.CdnManager.kAppTypeTingImage) / 390.0f);
        }
        finderLiveOnlineStateViewHotCardView.setClipToOutline(true);
        finderLiveOnlineStateViewHotCardView.setOutlineProvider(new com.tencent.mm.plugin.finder.live.plugin.st(this));
        this.F1 = new java.util.LinkedHashMap();
    }

    public static final void t1(com.tencent.mm.plugin.finder.live.plugin.iv ivVar, boolean z17) {
        com.tencent.mm.protocal.protobuf.FinderContact finderContact;
        com.tencent.mm.protocal.protobuf.FinderContact finderContact2;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("kickMember:");
        r45.xn1 xn1Var = ivVar.f113026y0;
        java.lang.String str = null;
        sb6.append((xn1Var == null || (finderContact2 = (com.tencent.mm.protocal.protobuf.FinderContact) xn1Var.getCustom(0)) == null) ? null : finderContact2.getUsername());
        com.tencent.mars.xlog.Log.i(ivVar.f113016r, sb6.toString());
        dk2.xf W0 = ivVar.W0();
        if (W0 != null) {
            r45.xn1 xn1Var2 = ivVar.f113026y0;
            if (xn1Var2 != null && (finderContact = (com.tencent.mm.protocal.protobuf.FinderContact) xn1Var2.getCustom(0)) != null) {
                str = finderContact.getUsername();
            }
            ((dk2.r4) W0).w(str, z17, 2, new com.tencent.mm.plugin.finder.live.plugin.eu(ivVar));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object u1(com.tencent.mm.plugin.finder.live.plugin.iv r22, kotlin.coroutines.Continuation r23) {
        /*
            Method dump skipped, instructions count: 404
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.plugin.iv.u1(com.tencent.mm.plugin.finder.live.plugin.iv, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final void v1(com.tencent.mm.plugin.finder.live.plugin.iv ivVar, int i17) {
        if (ivVar.f113011l1 == null) {
            ivVar.f113011l1 = new com.tencent.mm.ui.widget.dialog.k0(ivVar.R0().getContext(), 1, false);
        }
        com.tencent.mm.ui.widget.dialog.k0 k0Var = ivVar.f113011l1;
        if (k0Var != null) {
            k0Var.t(true);
        }
        com.tencent.mm.ui.widget.dialog.k0 k0Var2 = ivVar.f113011l1;
        if (k0Var2 != null) {
            k0Var2.f211872n = new com.tencent.mm.plugin.finder.live.plugin.dv(ivVar, i17);
        }
        if (k0Var2 != null) {
            k0Var2.f211881s = ivVar.A1;
        }
        if (k0Var2 != null) {
            k0Var2.p(new com.tencent.mm.plugin.finder.live.plugin.ev(ivVar));
        }
        com.tencent.mm.ui.widget.dialog.k0 k0Var3 = ivVar.f113011l1;
        if (k0Var3 != null) {
            k0Var3.v();
        }
        if (i17 == 3) {
            ((ml2.r0) i95.n0.c(ml2.r0.class)).Wj(ml2.h5.f327536t, "", 0);
        }
    }

    public static final void w1(com.tencent.mm.plugin.finder.live.plugin.iv ivVar, java.lang.String str) {
        ivVar.getClass();
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("PARAM_MEMBERS_PROFILE_USERNAME", str);
        bundle.putBoolean("PARAM_MEMBERS_PROFILE_NEED_NOTIFY_CLOSE", false);
        bundle.putInt("PARAM_MEMBERS_PROFILE_SOURCE_TYPE", 1);
        qo0.b bVar = qo0.b.f365376l1;
        qo0.c cVar = ivVar.f113015q;
        cVar.statusChange(bVar, bundle);
        ivVar.y1();
        if (cVar.getLiveRole() == 1) {
            ((ml2.j0) i95.n0.c(ml2.j0.class)).Xj(ml2.r3.f327901f);
        }
    }

    public final boolean A1() {
        return ((mm2.n0) P0(mm2.n0.class)).f329273r;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l
    public void B(android.os.Bundle bundle, java.lang.Object obj, long j17) {
        java.lang.String string = bundle != null ? bundle.getString("ACTION_POST_PORTRAIT", "") : null;
        if (kotlin.jvm.internal.o.b(string != null ? string : "", this.f113017s)) {
            com.tencent.mm.plugin.finder.live.plugin.yu yuVar = new com.tencent.mm.plugin.finder.live.plugin.yu(this, bundle, obj, j17);
            java.util.regex.Pattern pattern = pm0.v.f356802a;
            com.tencent.mm.sdk.platformtools.u3.i(yuVar, j17);
        }
    }

    @Override // qo0.a
    public boolean B0() {
        if (w0() != 0) {
            return false;
        }
        y1();
        if (this.f113015q.getLiveRole() != 1) {
            return true;
        }
        i95.m c17 = i95.n0.c(ml2.j0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        zy2.zb zbVar = (zy2.zb) c17;
        ml2.z4 z4Var = ml2.z4.A;
        ml2.r3 r3Var = ml2.r3.f327900e;
        zy2.zb.y6(zbVar, z4Var, java.lang.String.valueOf(3), null, 4, null);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:154:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0271  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void B1(r45.x71 r36, boolean r37) {
        /*
            Method dump skipped, instructions count: 1439
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.plugin.iv.B1(r45.x71, boolean):void");
    }

    public final void C1(int i17) {
        bm2.n5 n5Var = this.W;
        if (i17 == 0) {
            com.tencent.mm.plugin.finder.live.util.y.m(this, null, null, new com.tencent.mm.plugin.finder.live.plugin.xu(this, null), 3, null);
            android.view.View view = n5Var.F;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Float.valueOf(1.0f));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveKTVMemberListPlugin", "onPageSelect", "(I)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveKTVMemberListPlugin", "onPageSelect", "(I)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            return;
        }
        if (i17 != 1) {
            return;
        }
        android.view.View view2 = n5Var.F;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(java.lang.Float.valueOf(0.0f));
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveKTVMemberListPlugin", "onPageSelect", "(I)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view2.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveKTVMemberListPlugin", "onPageSelect", "(I)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        this.E.setImageResource(com.tencent.mm.R.drawable.d3v);
        i95.m c17 = i95.n0.c(ml2.r0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        ml2.r0.hj((ml2.r0) c17, ml2.b4.N2, "", 0L, null, null, null, null, null, 252, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x03a7  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x03f2  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x03f7  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x03f4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void D1(java.lang.Long r38) {
        /*
            Method dump skipped, instructions count: 1044
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.plugin.iv.D1(java.lang.Long):void");
    }

    public final void E1() {
        java.lang.String str;
        r45.x71 x71Var = this.f113029z1;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("");
        if (x71Var == null || (str = x71Var.getString(15)) == null) {
            str = null;
        } else {
            if (str.length() == 0) {
                str = zl2.r4.S(zl2.r4.f473950a, x71Var.getLong(12), 0, 2, null);
            }
        }
        java.lang.String str2 = str != null ? str : "";
        java.lang.String string = x71Var != null ? x71Var.getString(17) : null;
        java.lang.String string2 = x71Var != null ? x71Var.getString(18) : null;
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("heatlimit showTitle isAnchorOrAssistant ");
        sb7.append(z1() || A1());
        sb7.append(", svrHeatStr:");
        sb7.append(str2);
        sb7.append(", heatValue:");
        sb7.append(x71Var != null ? java.lang.Long.valueOf(x71Var.getLong(12)) : null);
        sb7.append(", svrViewedMemberCountStr ");
        sb7.append(string);
        sb7.append(", svrOnlineCountStr ");
        sb7.append(string2);
        com.tencent.mars.xlog.Log.i(this.f113016r, sb7.toString());
        if (w0() == 0 && ((mm2.e1) P0(mm2.e1.class)).t7()) {
            if (string2 != null) {
                mm2.e1 e1Var = (mm2.e1) P0(mm2.e1.class);
                e1Var.D = string2;
                e1Var.s7();
            }
            com.tencent.mm.plugin.finder.live.plugin.kh khVar = (com.tencent.mm.plugin.finder.live.plugin.kh) X0(com.tencent.mm.plugin.finder.live.plugin.kh.class);
            if (khVar != null) {
                khVar.A1(kz5.b0.c(new jz5.l(3, null)), false, false);
            }
        }
        if ((z1() || A1()) && string2 != null) {
            if (!(string2.length() > 0)) {
                string2 = null;
            }
            if (string2 != null) {
                sb6.append(string2);
            }
        }
        android.view.ViewGroup viewGroup = this.f365323d;
        if (string != null) {
            if (!(string.length() > 0)) {
                string = null;
            }
            if (string != null) {
                if (sb6.length() > 0) {
                    sb6.append(" · ");
                }
                sb6.append(viewGroup.getContext().getString(com.tencent.mm.R.string.m9k, string));
            }
        }
        java.lang.String str3 = (r26.n0.N(str2) ^ true) && (!kotlin.jvm.internal.o.b(str2, "0") || z1() || A1()) ? str2 : null;
        if (str3 != null) {
            if (sb6.length() > 0) {
                sb6.append(" · ");
            }
            sb6.append(viewGroup.getContext().getString(com.tencent.mm.R.string.f491892ek4, str3));
        }
        if (this.f113027y1 > 0) {
            if (sb6.length() > 0) {
                sb6.append(" · ");
            }
            sb6.append(viewGroup.getContext().getString(com.tencent.mm.R.string.p1z, java.lang.String.valueOf(this.f113027y1)));
        }
        this.H.setText(sb6.toString());
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean G() {
        return true;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l, qo0.a
    public void K0(int i17) {
        super.K0(i17);
        if (i17 != 0) {
            ((mm2.e1) P0(mm2.e1.class)).D = "";
            this.W.y();
        } else {
            i95.m c17 = i95.n0.c(ml2.r0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            ((ml2.r0) c17).yk(3, (r13 & 2) != 0 ? null : null, (r13 & 4) != 0 ? null : null, (r13 & 8) != 0 ? null : null, (r13 & 16) != 0 ? null : null);
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l, qo0.a
    public void M0(qo0.b status, android.os.Bundle bundle) {
        kotlin.jvm.internal.o.g(status, "status");
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l, qo0.a
    public void O0() {
        super.O0();
        bm2.n5 n5Var = this.W;
        n5Var.y();
        this.G.setOnClickListener(null);
        this.Q.setOnClickListener(null);
        this.K.setOnClickListener(null);
        this.R.setOnClickListener(null);
        this.N.setOnVisibilityListener(null);
        n5Var.C = null;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean k() {
        return ((mm2.c1) P0(mm2.c1.class)).f328801f2 != 1;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean r() {
        return false;
    }

    @Override // qo0.a
    public void s0(int i17, int i18, android.os.Bundle bundle) {
        int i19 = 16;
        if (!pm0.v.z(i18, 16) || !((mm2.e1) P0(mm2.e1.class)).b7() || !((om2.l) P0(om2.l.class)).f346343h) {
            K0(8);
            return;
        }
        if (w0() != 0) {
            i95.m c17 = i95.n0.c(ml2.r0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            ml2.r0 r0Var = (ml2.r0) c17;
            ml2.b4 b4Var = ml2.b4.M2;
            cl0.g gVar = new cl0.g();
            gVar.h("type", "2");
            ml2.r0.hj(r0Var, b4Var, gVar.toString(), 0L, null, null, null, null, null, 252, null);
            K0(0);
            nk2.l.f338021a.b(nk2.a.f337951d);
            if (bundle != null ? bundle.getBoolean("PARAM_FINDER_LIVE_MEMBER_SKIP_LOADING") : false) {
                this.N.post(new com.tencent.mm.plugin.finder.live.plugin.zu(this));
                this.W.z();
                x1();
                C1(this.F.getSelectedTabPosition());
                return;
            }
            this.P.setVisibility(0);
            this.I.setVisibility(8);
            android.view.View view = this.L;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveKTVMemberListPlugin", "showMembersListLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveKTVMemberListPlugin", "showMembersListLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.Y.setVisibility(8);
            this.M.setVisibility(8);
            this.W.z();
            this.N.post(new com.tencent.mm.plugin.finder.live.plugin.av(this));
            if (z1()) {
                i19 = 1;
            } else {
                if (!(((mm2.n0) P0(mm2.n0.class)).f329273r)) {
                    i19 = 2;
                }
            }
            dk2.xf W0 = W0();
            if (W0 != null) {
                ((dk2.r4) W0).B(i19, 0, new com.tencent.mm.plugin.finder.live.plugin.cv(this));
            }
            if (zl2.r4.f473950a.X1(S0()) && ((mm2.c1) P0(mm2.c1.class)).f328929z6) {
                com.tencent.mm.plugin.finder.live.util.y.m(this, null, null, new com.tencent.mm.plugin.finder.live.plugin.hp0(this, null), 3, null);
            } else {
                bm2.n5 n5Var = this.W;
                n5Var.R = null;
                n5Var.B();
                n5Var.notifyDataSetChanged();
            }
            if (fn0.g.f264195a.g()) {
                x1();
            }
        }
    }

    public final void x1() {
        if (((mm2.e1) P0(mm2.e1.class)).b7()) {
            com.tencent.mm.plugin.finder.live.util.y.m(this, null, null, new com.tencent.mm.plugin.finder.live.plugin.bu(this, null), 3, null);
        }
    }

    public final void y1() {
        com.tencent.mm.ui.widget.LiveBottomSheetPanel.b(this.N, null, 1, null);
        i95.m c17 = i95.n0.c(ml2.r0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        ml2.r0 r0Var = (ml2.r0) c17;
        ml2.b4 b4Var = ml2.b4.M2;
        cl0.g gVar = new cl0.g();
        gVar.h("type", "1");
        ml2.r0.hj(r0Var, b4Var, gVar.toString(), 0L, null, null, null, null, null, 252, null);
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l, qo0.a
    public void z0() {
        super.z0();
        this.G.setOnClickListener(new com.tencent.mm.plugin.finder.live.plugin.iu(this));
        this.Q.setOnClickListener(new com.tencent.mm.plugin.finder.live.plugin.ju(this));
        this.K.setOnClickListener(new com.tencent.mm.plugin.finder.live.plugin.ku(this));
        this.R.setOnClickListener(new com.tencent.mm.plugin.finder.live.plugin.lu(this));
        this.N.setOnVisibilityListener(new com.tencent.mm.plugin.finder.live.plugin.mu(this));
        this.W.C = new com.tencent.mm.plugin.finder.live.plugin.nu(this);
        com.tencent.mm.plugin.finder.live.widget.wv wvVar = (com.tencent.mm.plugin.finder.live.widget.wv) ((jz5.n) this.X).getValue();
        com.tencent.mm.plugin.finder.live.plugin.ou ouVar = new com.tencent.mm.plugin.finder.live.plugin.ou(this);
        wvVar.getClass();
        wvVar.f120237b.f118825g = ouVar;
        com.google.android.material.appbar.AppBarLayout appBarLayout = this.B1;
        if (appBarLayout != null) {
            com.tencent.mm.plugin.finder.live.plugin.tt ttVar = new com.tencent.mm.plugin.finder.live.plugin.tt(this);
            ttVar.a(appBarLayout, 0);
            appBarLayout.a(ttVar);
        }
    }

    public final boolean z1() {
        return zl2.r4.f473950a.w1() || ((mm2.c1) P0(mm2.c1.class)).T;
    }
}
