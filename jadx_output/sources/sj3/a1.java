package sj3;

/* loaded from: classes14.dex */
public final class a1 implements android.view.View.OnClickListener {

    /* renamed from: J, reason: collision with root package name */
    public static int f408392J = 1;
    public wu5.c A;
    public androidx.lifecycle.k0 B;
    public androidx.lifecycle.k0 C;
    public androidx.lifecycle.k0 D;
    public androidx.lifecycle.k0 E;
    public androidx.lifecycle.k0 F;
    public boolean G;
    public final rl5.r H;
    public boolean I;

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.multitalk.ui.MultiTalkMainUI f408393d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f408394e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f408395f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f408396g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f408397h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f408398i;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f408399m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f408400n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f408401o;

    /* renamed from: p, reason: collision with root package name */
    public int f408402p;

    /* renamed from: q, reason: collision with root package name */
    public yz5.l f408403q;

    /* renamed from: r, reason: collision with root package name */
    public int f408404r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f408405s;

    /* renamed from: t, reason: collision with root package name */
    public android.view.View f408406t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f408407u;

    /* renamed from: v, reason: collision with root package name */
    public final jz5.g f408408v;

    /* renamed from: w, reason: collision with root package name */
    public final jz5.g f408409w;

    /* renamed from: x, reason: collision with root package name */
    public int f408410x;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.Boolean f408411y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f408412z;

    public a1(com.tencent.mm.plugin.multitalk.ui.MultiTalkMainUI mainUI) {
        boolean z17;
        kotlin.jvm.internal.o.g(mainUI, "mainUI");
        this.f408393d = mainUI;
        this.f408394e = jz5.h.b(new sj3.z0(this));
        this.f408395f = jz5.h.b(new sj3.v(this));
        this.f408396g = jz5.h.b(new sj3.v0(this));
        this.f408397h = jz5.h.b(new sj3.u0(this));
        this.f408398i = jz5.h.b(new sj3.r0(this));
        this.f408399m = jz5.h.b(new sj3.b0(this));
        this.f408400n = jz5.h.b(new sj3.u(this));
        java.lang.Object obj = ((java.util.HashMap) com.tencent.mm.plugin.multitalk.model.e3.Ri().V).get("panel_mini_info");
        if (obj != null) {
            java.lang.Boolean bool = obj instanceof java.lang.Boolean ? (java.lang.Boolean) obj : null;
            if (bool != null) {
                z17 = bool.booleanValue();
                this.f408401o = z17;
                this.f408402p = Integer.MAX_VALUE;
                this.f408403q = sj3.t0.f408743d;
                this.f408407u = true;
                this.f408408v = jz5.h.b(new sj3.w0(this));
                this.f408409w = jz5.h.b(new sj3.w(this));
                this.H = new rl5.r(mainUI.getContext());
            }
        }
        z17 = false;
        this.f408401o = z17;
        this.f408402p = Integer.MAX_VALUE;
        this.f408403q = sj3.t0.f408743d;
        this.f408407u = true;
        this.f408408v = jz5.h.b(new sj3.w0(this));
        this.f408409w = jz5.h.b(new sj3.w(this));
        this.H = new rl5.r(mainUI.getContext());
    }

    public static final void a(sj3.a1 a1Var, int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MT.ControlPanelLogic", "setCurrentY: from " + a1Var.f408402p + " to " + i17);
        if (a1Var.f408402p == i17) {
            return;
        }
        a1Var.f408402p = i17;
        a1Var.b(a1Var.f408404r, false);
    }

    public final void b(int i17, boolean z17) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("checkNeedFold: ");
        sb6.append(i17);
        sb6.append(", expandedPanelHeight: ");
        jz5.g gVar = this.f408409w;
        sb6.append(((java.lang.Number) ((jz5.n) gVar).getValue()).floatValue());
        com.tencent.mars.xlog.Log.i("MicroMsg.MT.ControlPanelLogic", sb6.toString());
        this.f408404r = i17;
        if (this.f408401o) {
            if (z17) {
                h(((float) i17) < ((java.lang.Number) ((jz5.n) gVar).getValue()).floatValue(), false);
            }
        } else if (i17 > this.f408402p) {
            this.f408401o = true;
            java.util.Map miniInfoHolder = com.tencent.mm.plugin.multitalk.model.e3.Ri().V;
            kotlin.jvm.internal.o.f(miniInfoHolder, "miniInfoHolder");
            ((java.util.HashMap) miniInfoHolder).put("panel_mini_info", java.lang.Boolean.TRUE);
            h(((float) i17) < ((java.lang.Number) ((jz5.n) gVar).getValue()).floatValue(), false);
        }
    }

    public final android.view.View c() {
        return (android.view.View) this.f408400n.getValue();
    }

    public final android.widget.FrameLayout d() {
        return (android.widget.FrameLayout) ((jz5.n) this.f408395f).getValue();
    }

    public final u4.j0 e() {
        return (u4.j0) ((jz5.n) this.f408397h).getValue();
    }

    public final com.tencent.mm.plugin.multitalk.ui.b0 f() {
        return (com.tencent.mm.plugin.multitalk.ui.b0) ((jz5.n) this.f408394e).getValue();
    }

    public final void g(int i17, int i18, int i19) {
        if (!this.f408401o) {
            if (this.f408412z) {
                return;
            }
            android.view.View findViewById = this.f408393d.findViewById(com.tencent.mm.R.id.k6o);
            if (findViewById != null) {
                findViewById.setOnClickListener(new sj3.x(this, i17));
            }
            android.widget.ImageView imageView = (android.widget.ImageView) this.f408393d.findViewById(com.tencent.mm.R.id.i2s);
            if (imageView != null) {
                imageView.setVisibility(0);
                imageView.setImageDrawable(com.tencent.mm.ui.uk.e(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.raw.icons_filled_arrow, -1));
            }
            android.widget.TextView textView = (android.widget.TextView) this.f408393d.findViewById(com.tencent.mm.R.id.f487622p80);
            if (textView != null) {
                textView.setVisibility(0);
                textView.setText(i19);
            }
            this.f408412z = true;
            ku5.t0 t0Var = (ku5.t0) ku5.t0.f312615d;
            t0Var.getClass();
            t0Var.z(new sj3.y(this), i18 * 1000, false);
            return;
        }
        if (this.f408412z) {
            return;
        }
        android.view.ViewGroup viewGroup = e().f424501c;
        kotlin.jvm.internal.o.f(viewGroup, "getSceneRoot(...)");
        com.tencent.mars.xlog.Log.i("MicroMsg.MT.ControlPanelLogic", "handleBadNetworkLogic: showView");
        android.view.View findViewById2 = viewGroup.findViewById(com.tencent.mm.R.id.k6o);
        if (findViewById2 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById2, arrayList.toArray(), "com/tencent/mm/plugin/multitalk/ui/widget/ControlPanelLogic", "handleBadNetworkLogic$initNetView", "(ILcom/tencent/mm/plugin/multitalk/ui/widget/ControlPanelLogic;ILandroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById2, "com/tencent/mm/plugin/multitalk/ui/widget/ControlPanelLogic", "handleBadNetworkLogic$initNetView", "(ILcom/tencent/mm/plugin/multitalk/ui/widget/ControlPanelLogic;ILandroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setOnClickListener(new sj3.a0(this, i17));
        }
        ((android.widget.TextView) viewGroup.findViewById(com.tencent.mm.R.id.f487622p80)).setText(i19);
        android.widget.ImageView imageView2 = (android.widget.ImageView) viewGroup.findViewById(com.tencent.mm.R.id.i2s);
        if (imageView2 != null) {
            imageView2.setImageDrawable(com.tencent.mm.ui.uk.e(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.raw.icons_filled_arrow, -1));
        }
        android.view.View findViewById3 = viewGroup.findViewById(com.tencent.mm.R.id.f483044v3);
        android.view.ViewGroup.LayoutParams layoutParams = findViewById3.getLayoutParams();
        layoutParams.height += viewGroup.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f480574a70);
        findViewById3.setLayoutParams(layoutParams);
        this.f408412z = true;
        wu5.c cVar = this.A;
        if (cVar != null) {
            cVar.cancel(false);
        }
        ku5.t0 t0Var2 = (ku5.t0) ku5.t0.f312615d;
        t0Var2.getClass();
        this.A = t0Var2.z(new sj3.z(this), i18 * 1000, false);
    }

    public final void h(boolean z17, boolean z18) {
        if (z18) {
            this.f408401o = true;
            java.util.Map miniInfoHolder = com.tencent.mm.plugin.multitalk.model.e3.Ri().V;
            kotlin.jvm.internal.o.f(miniInfoHolder, "miniInfoHolder");
            ((java.util.HashMap) miniInfoHolder).put("panel_mini_info", java.lang.Boolean.TRUE);
        }
        boolean z19 = this.f408401o;
        com.tencent.mm.plugin.multitalk.ui.MultiTalkMainUI multiTalkMainUI = this.f408393d;
        if (z19) {
            android.view.View c17 = c();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(c17, arrayList.toArray(), "com/tencent/mm/plugin/multitalk/ui/widget/ControlPanelLogic", com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            c17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(c17, "com/tencent/mm/plugin/multitalk/ui/widget/ControlPanelLogic", com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            d().setVisibility(0);
            android.view.View findViewById = multiTalkMainUI.findViewById(com.tencent.mm.R.id.k6o);
            if (findViewById != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/plugin/multitalk/ui/widget/ControlPanelLogic", com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(findViewById, "com/tencent/mm/plugin/multitalk/ui/widget/ControlPanelLogic", com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            this.f408405s = z17;
            d().setVisibility(0);
            androidx.transition.TransitionSet transitionSet = new androidx.transition.TransitionSet();
            androidx.transition.ChangeBounds changeBounds = new androidx.transition.ChangeBounds();
            changeBounds.b(com.tencent.mm.R.id.f483044v3);
            changeBounds.b(com.tencent.mm.R.id.jwo);
            changeBounds.b(com.tencent.mm.R.id.jwb);
            changeBounds.b(com.tencent.mm.R.id.jxe);
            changeBounds.b(com.tencent.mm.R.id.nye);
            changeBounds.f12383f = 300L;
            transitionSet.X(changeBounds);
            androidx.transition.AutoTransition autoTransition = new androidx.transition.AutoTransition();
            autoTransition.U(com.tencent.mm.R.id.jwp);
            autoTransition.U(com.tencent.mm.R.id.jwc);
            autoTransition.U(com.tencent.mm.R.id.jxf);
            autoTransition.U(com.tencent.mm.R.id.k6o);
            autoTransition.Z(150L);
            autoTransition.f12382e = z17 ? 150L : 0L;
            transitionSet.X(autoTransition);
            transitionSet.T(new sj3.c0(this));
            if (z17) {
                u4.g1.c(e(), transitionSet);
                android.view.ViewGroup viewGroup = e().f424501c;
                kotlin.jvm.internal.o.f(viewGroup, "getSceneRoot(...)");
                i(viewGroup);
                f408392J = 2;
                return;
            }
            jz5.g gVar = this.f408396g;
            u4.g1.c((u4.j0) ((jz5.n) gVar).getValue(), transitionSet);
            android.view.ViewGroup viewGroup2 = ((u4.j0) ((jz5.n) gVar).getValue()).f424501c;
            kotlin.jvm.internal.o.f(viewGroup2, "getSceneRoot(...)");
            i(viewGroup2);
            f408392J = 3;
            return;
        }
        android.view.View c18 = c();
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList3.add(0);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(c18, arrayList3.toArray(), "com/tencent/mm/plugin/multitalk/ui/widget/ControlPanelLogic", com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        c18.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(c18, "com/tencent/mm/plugin/multitalk/ui/widget/ControlPanelLogic", com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        d().setVisibility(8);
        android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) multiTalkMainUI.findViewById(com.tencent.mm.R.id.gwx);
        relativeLayout.removeAllViews();
        android.widget.RelativeLayout relativeLayout2 = (android.widget.RelativeLayout) multiTalkMainUI.findViewById(com.tencent.mm.R.id.cib);
        relativeLayout2.removeAllViews();
        if (c() != null) {
            android.view.ViewGroup.LayoutParams layoutParams = c().getLayoutParams();
            kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
            android.widget.RelativeLayout.LayoutParams layoutParams2 = (android.widget.RelativeLayout.LayoutParams) layoutParams;
            layoutParams2.bottomMargin = ((int) ((i65.a.k(multiTalkMainUI) * 3.6d) / 100)) + this.f408410x;
            c().setLayoutParams(layoutParams2);
        }
        android.widget.RelativeLayout.LayoutParams layoutParams3 = new android.widget.RelativeLayout.LayoutParams(-1, -2);
        layoutParams3.addRule(13);
        relativeLayout2.addView((androidx.constraintlayout.widget.ConstraintLayout) ((jz5.n) this.f408398i).getValue(), layoutParams3);
        relativeLayout.addView((android.widget.RelativeLayout) ((jz5.n) this.f408399m).getValue());
        c().findViewById(com.tencent.mm.R.id.nye).setOnClickListener(this);
        android.view.View findViewById2 = c().findViewById(com.tencent.mm.R.id.jw9);
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        arrayList4.add(8);
        java.util.Collections.reverse(arrayList4);
        yj0.a.d(findViewById2, arrayList4.toArray(), "com/tencent/mm/plugin/multitalk/ui/widget/ControlPanelLogic", "initNormalControl", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById2.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
        yj0.a.f(findViewById2, "com/tencent/mm/plugin/multitalk/ui/widget/ControlPanelLogic", "initNormalControl", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        com.tencent.mm.plugin.multitalk.ui.widget.MultiTalkControlIconLayout multiTalkControlIconLayout = (com.tencent.mm.plugin.multitalk.ui.widget.MultiTalkControlIconLayout) c().findViewById(com.tencent.mm.R.id.jwo);
        multiTalkControlIconLayout.setOnClickListener(new sj3.i0(this, multiTalkControlIconLayout));
        androidx.lifecycle.k0 k0Var = this.C;
        if (k0Var != null) {
            f().f150257e.removeObserver(k0Var);
        }
        sj3.j0 j0Var = new sj3.j0(multiTalkControlIconLayout);
        f().f150257e.observe(multiTalkMainUI, j0Var);
        this.C = j0Var;
        this.G = ((gl.i) ((cv.w0) i95.n0.c(cv.w0.class))).Di(com.tencent.mm.plugin.multitalk.model.e3.Di().f473174o.a());
        com.tencent.mm.plugin.multitalk.ui.widget.MultiTalkControlIconLayout multiTalkControlIconLayout2 = (com.tencent.mm.plugin.multitalk.ui.widget.MultiTalkControlIconLayout) c().findViewById(com.tencent.mm.R.id.jwb);
        multiTalkControlIconLayout2.setOnClickListener(new sj3.k0(this, multiTalkControlIconLayout2));
        androidx.lifecycle.k0 k0Var2 = this.D;
        if (k0Var2 != null) {
            f().f150259g.removeObserver(k0Var2);
        }
        sj3.l0 l0Var = new sj3.l0(this, multiTalkControlIconLayout2);
        f().f150259g.observe(multiTalkMainUI, l0Var);
        this.D = l0Var;
        androidx.lifecycle.k0 k0Var3 = this.F;
        if (k0Var3 != null) {
            f().f150261i.removeObserver(k0Var3);
        }
        sj3.d0 d0Var = new sj3.d0(this, multiTalkControlIconLayout2);
        f().f150261i.observe(multiTalkMainUI, d0Var);
        this.F = d0Var;
        com.tencent.mm.plugin.multitalk.ui.widget.MultiTalkControlIconLayout multiTalkControlIconLayout3 = (com.tencent.mm.plugin.multitalk.ui.widget.MultiTalkControlIconLayout) c().findViewById(com.tencent.mm.R.id.jxe);
        multiTalkControlIconLayout3.setOnClickListener(new sj3.e0(this, multiTalkControlIconLayout3));
        androidx.lifecycle.k0 k0Var4 = this.B;
        if (k0Var4 != null) {
            f().f150263n.removeObserver(k0Var4);
        }
        sj3.f0 f0Var = new sj3.f0(multiTalkControlIconLayout3);
        f().f150263n.observe(multiTalkMainUI, f0Var);
        this.B = f0Var;
        androidx.lifecycle.k0 k0Var5 = this.E;
        if (k0Var5 != null) {
            f().f150274y.removeObserver(k0Var5);
        }
        sj3.g0 g0Var = new sj3.g0(multiTalkControlIconLayout3);
        f().f150274y.observe(multiTalkMainUI, g0Var);
        this.E = g0Var;
        c().post(new sj3.h0(this));
        f408392J = 1;
    }

    public final void i(android.view.ViewGroup viewGroup) {
        wu5.c cVar = this.A;
        if (cVar != null) {
            cVar.cancel(false);
        }
        android.view.View findViewById = e().f424501c.findViewById(com.tencent.mm.R.id.k6o);
        if (findViewById != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/multitalk/ui/widget/ControlPanelLogic", "resetNetTip", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/multitalk/ui/widget/ControlPanelLogic", "resetNetTip", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        this.f408412z = false;
        this.f408406t = viewGroup;
        viewGroup.post(new sj3.o0(this, viewGroup));
        android.widget.ImageView imageView = (android.widget.ImageView) viewGroup.findViewById(com.tencent.mm.R.id.jqo);
        com.tencent.mm.plugin.multitalk.ui.MultiTalkMainUI multiTalkMainUI = this.f408393d;
        imageView.setBackground(com.tencent.mm.ui.uk.e(multiTalkMainUI, com.tencent.mm.R.raw.icons_filled_arrow, -1));
        if (!this.I) {
            com.tencent.mm.plugin.multitalk.model.u0.h(true, false);
            this.I = true;
        }
        viewGroup.findViewById(com.tencent.mm.R.id.nye).setOnClickListener(this);
        viewGroup.findViewById(com.tencent.mm.R.id.jqn).setOnClickListener(this);
        android.widget.ImageView imageView2 = (android.widget.ImageView) viewGroup.findViewById(com.tencent.mm.R.id.jxe);
        android.widget.TextView textView = (android.widget.TextView) viewGroup.findViewById(com.tencent.mm.R.id.jxf);
        androidx.lifecycle.k0 k0Var = this.B;
        if (k0Var != null) {
            f().f150263n.removeObserver(k0Var);
        }
        sj3.p0 p0Var = new sj3.p0(imageView2, textView, this);
        f().f150263n.observe(multiTalkMainUI, p0Var);
        this.B = p0Var;
        imageView2.setOnClickListener(this);
        android.widget.ImageView imageView3 = (android.widget.ImageView) viewGroup.findViewById(com.tencent.mm.R.id.jwo);
        android.widget.TextView textView2 = (android.widget.TextView) viewGroup.findViewById(com.tencent.mm.R.id.jwp);
        androidx.lifecycle.k0 k0Var2 = this.C;
        if (k0Var2 != null) {
            f().f150257e.removeObserver(k0Var2);
        }
        sj3.q0 q0Var = new sj3.q0(imageView3, textView2, this);
        f().f150257e.observe(multiTalkMainUI, q0Var);
        this.C = q0Var;
        imageView3.setOnClickListener(this);
        android.widget.ImageView imageView4 = (android.widget.ImageView) viewGroup.findViewById(com.tencent.mm.R.id.jwb);
        android.widget.TextView textView3 = (android.widget.TextView) viewGroup.findViewById(com.tencent.mm.R.id.jwc);
        androidx.lifecycle.k0 k0Var3 = this.D;
        if (k0Var3 != null) {
            f().f150259g.removeObserver(k0Var3);
        }
        sj3.m0 m0Var = new sj3.m0(this, imageView4, textView3);
        f().f150259g.observe(multiTalkMainUI, m0Var);
        this.D = m0Var;
        imageView4.setOnClickListener(this);
        androidx.lifecycle.k0 k0Var4 = this.E;
        if (k0Var4 != null) {
            f().f150274y.removeObserver(k0Var4);
        }
        sj3.n0 n0Var = new sj3.n0(imageView2, textView);
        f().f150274y.observe(multiTalkMainUI, n0Var);
        this.E = n0Var;
        com.tencent.mars.xlog.Log.i("MicroMsg.MT.ControlPanelLogic", "checkNaviHeight() called with: h = " + this.f408410x + ' ' + this.f408411y + ' ' + this.f408405s + ' ');
        this.f408411y = java.lang.Boolean.valueOf(this.f408405s);
        int i17 = this.f408410x;
        android.view.ViewGroup viewGroup2 = e().f424501c;
        android.view.View findViewById2 = viewGroup2.findViewById(com.tencent.mm.R.id.cif);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        android.view.ViewGroup.LayoutParams layoutParams = findViewById2.getLayoutParams();
        layoutParams.height = layoutParams.height + i17;
        findViewById2.setLayoutParams(layoutParams);
        android.view.View findViewById3 = viewGroup2.findViewById(com.tencent.mm.R.id.f483044v3);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        android.view.ViewGroup.LayoutParams layoutParams2 = findViewById3.getLayoutParams();
        layoutParams2.height += i17;
        findViewById3.setLayoutParams(layoutParams2);
        android.view.View findViewById4 = viewGroup2.findViewById(com.tencent.mm.R.id.nye);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        android.view.ViewGroup.LayoutParams layoutParams3 = findViewById4.getLayoutParams();
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams3 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams3 : null;
        if (marginLayoutParams != null) {
            marginLayoutParams.bottomMargin += i17;
            findViewById4.setLayoutParams(marginLayoutParams);
        }
        android.view.View findViewById5 = viewGroup2.findViewById(com.tencent.mm.R.id.jqn);
        kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
        android.view.ViewGroup.LayoutParams layoutParams4 = findViewById5.getLayoutParams();
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams4 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams4 : null;
        if (marginLayoutParams2 != null) {
            marginLayoutParams2.bottomMargin += i17;
            findViewById5.setLayoutParams(marginLayoutParams2);
        }
        androidx.constraintlayout.widget.Guideline guideline = (androidx.constraintlayout.widget.Guideline) viewGroup2.findViewById(com.tencent.mm.R.id.cid);
        if (guideline != null) {
            guideline.setGuidelineEnd((int) (guideline.getResources().getDimension(com.tencent.mm.R.dimen.f480575a71) + i17));
        }
        androidx.constraintlayout.widget.Guideline guideline2 = (androidx.constraintlayout.widget.Guideline) viewGroup2.findViewById(com.tencent.mm.R.id.cie);
        if (guideline2 != null) {
            guideline2.setGuidelineEnd(i17);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x01a1  */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onClick(android.view.View r22) {
        /*
            Method dump skipped, instructions count: 650
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sj3.a1.onClick(android.view.View):void");
    }
}
