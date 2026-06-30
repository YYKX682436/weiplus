package sj3;

/* loaded from: classes14.dex */
public final class g3 {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.plugin.multitalk.ui.MultiTalkMainUI f408520a;

    /* renamed from: b, reason: collision with root package name */
    public final jz5.g f408521b;

    /* renamed from: c, reason: collision with root package name */
    public final jz5.g f408522c;

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f408523d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f408524e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f408525f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f408526g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f408527h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f408528i;

    /* renamed from: j, reason: collision with root package name */
    public final jz5.g f408529j;

    /* renamed from: k, reason: collision with root package name */
    public final jz5.g f408530k;

    /* renamed from: l, reason: collision with root package name */
    public final jz5.g f408531l;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f408532m;

    /* renamed from: n, reason: collision with root package name */
    public final tj3.x f408533n;

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f408534o;

    /* renamed from: p, reason: collision with root package name */
    public final jz5.g f408535p;

    /* renamed from: q, reason: collision with root package name */
    public final jz5.g f408536q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f408537r;

    /* renamed from: s, reason: collision with root package name */
    public final androidx.lifecycle.k0 f408538s;

    /* renamed from: t, reason: collision with root package name */
    public wj3.a f408539t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f408540u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f408541v;

    /* renamed from: w, reason: collision with root package name */
    public final jz5.g f408542w;

    /* renamed from: x, reason: collision with root package name */
    public final androidx.lifecycle.k0 f408543x;

    public g3(com.tencent.mm.plugin.multitalk.ui.MultiTalkMainUI mainUI) {
        kotlin.jvm.internal.o.g(mainUI, "mainUI");
        this.f408520a = mainUI;
        this.f408521b = jz5.h.b(new sj3.f3(this));
        this.f408522c = jz5.h.b(new sj3.d2(this));
        this.f408523d = jz5.h.b(new sj3.z1(this));
        this.f408524e = jz5.h.b(new sj3.r2(this));
        this.f408525f = jz5.h.b(new sj3.y1(this));
        this.f408526g = jz5.h.b(new sj3.d3(this));
        this.f408527h = jz5.h.b(new sj3.e3(this));
        this.f408528i = jz5.h.b(new sj3.o2(this));
        this.f408529j = jz5.h.b(new sj3.a3(this));
        this.f408530k = jz5.h.b(new sj3.p2(this));
        this.f408531l = jz5.h.b(new sj3.q2(this));
        this.f408532m = jz5.h.b(new sj3.f2(this));
        this.f408533n = new tj3.x(this);
        this.f408534o = jz5.h.b(new sj3.z2(this));
        this.f408535p = jz5.h.b(new sj3.c3(this));
        this.f408536q = jz5.h.b(new sj3.a2(this));
        this.f408537r = "";
        this.f408538s = new sj3.b3(this);
        this.f408540u = true;
        this.f408542w = jz5.h.b(new sj3.y2(this));
        this.f408543x = new sj3.b2(this);
    }

    public static final void a(sj3.g3 g3Var) {
        g3Var.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.MT.MultiTalkNewTalkingUILogic", "onMiniMultitalkClicked");
        com.tencent.mm.plugin.multitalk.model.u0.f150141a++;
        com.tencent.mm.plugin.multitalk.model.e3.Ri().C(true);
        com.tencent.mm.plugin.multitalk.model.u0.a(8);
    }

    public final void b() {
        if (kotlin.jvm.internal.o.b(l().f150263n.getValue(), java.lang.Boolean.TRUE)) {
            com.tencent.mm.plugin.multitalk.ui.MultiTalkMainUI multiTalkMainUI = this.f408520a;
            db5.t7.m(multiTalkMainUI, multiTalkMainUI.getResources().getString(com.tencent.mm.R.string.ibf));
        }
        l().O6(java.lang.Boolean.FALSE);
    }

    public final void c() {
        com.tencent.mars.xlog.Log.i("MicroMsg.MT.MultiTalkNewTalkingUILogic", "dismissView viewShowing: " + this.f408541v);
        this.f408541v = false;
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) ((jz5.n) this.f408522c).getValue();
        if (frameLayout != null) {
            frameLayout.setVisibility(8);
            d().setOnMaxYChanged(sj3.g2.f408519d);
            d().setLayoutAdapter(null);
        }
        e().f408411y = null;
        m();
        l().f150267r.removeObserver(this.f408538s);
        l().f150263n.removeObserver(this.f408543x);
    }

    public final com.tencent.mm.plugin.multitalk.ui.widget.avatar_view.MultiTalkAvatarLayout d() {
        return (com.tencent.mm.plugin.multitalk.ui.widget.avatar_view.MultiTalkAvatarLayout) ((jz5.n) this.f408523d).getValue();
    }

    public final sj3.a1 e() {
        return (sj3.a1) ((jz5.n) this.f408532m).getValue();
    }

    public final com.tencent.mm.ui.widget.imageview.WeImageButton f() {
        return (com.tencent.mm.ui.widget.imageview.WeImageButton) ((jz5.n) this.f408528i).getValue();
    }

    public final android.view.View g() {
        return (android.view.View) ((jz5.n) this.f408530k).getValue();
    }

    public final android.view.View h() {
        return (android.view.View) ((jz5.n) this.f408524e).getValue();
    }

    public final com.tencent.mm.plugin.multitalk.ui.widget.ScreenCastBigView i() {
        return (com.tencent.mm.plugin.multitalk.ui.widget.ScreenCastBigView) ((jz5.n) this.f408529j).getValue();
    }

    public final android.view.View j() {
        return (android.view.View) ((jz5.n) this.f408526g).getValue();
    }

    public final android.view.View k() {
        return (android.view.View) ((jz5.n) this.f408527h).getValue();
    }

    public final com.tencent.mm.plugin.multitalk.ui.b0 l() {
        return (com.tencent.mm.plugin.multitalk.ui.b0) ((jz5.n) this.f408521b).getValue();
    }

    public final void m() {
        com.tencent.mars.xlog.Log.i("MicroMsg.MT.MultiTalkNewTalkingUILogic", "hidePageElement: ");
        if (this.f408540u) {
            this.f408540u = false;
            android.view.animation.AlphaAnimation alphaAnimation = new android.view.animation.AlphaAnimation(1.0f, 0.0f);
            alphaAnimation.setDuration(150L);
            android.view.View k17 = k();
            if (k17 != null) {
                k17.setAnimation(alphaAnimation);
            }
            android.view.View k18 = k();
            if (k18 != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(4);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(k18, arrayList.toArray(), "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkNewTalkingUILogic", "hidePageElement", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                k18.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(k18, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkNewTalkingUILogic", "hidePageElement", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.view.View j17 = j();
            if (j17 != null) {
                j17.setAnimation(alphaAnimation);
            }
            android.view.View j18 = j();
            if (j18 != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList2.add(4);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(j18, arrayList2.toArray(), "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkNewTalkingUILogic", "hidePageElement", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                j18.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(j18, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkNewTalkingUILogic", "hidePageElement", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            sj3.a1 e17 = e();
            e17.getClass();
            android.view.animation.AlphaAnimation alphaAnimation2 = new android.view.animation.AlphaAnimation(1.0f, 0.0f);
            alphaAnimation2.setDuration(150L);
            android.view.View view = e17.f408406t;
            if (view != null) {
                view.setAnimation(alphaAnimation2);
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
                arrayList3.add(8);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(view, arrayList3.toArray(), "com/tencent/mm/plugin/multitalk/ui/widget/ControlPanelLogic", "hidePanel", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/multitalk/ui/widget/ControlPanelLogic", "hidePanel", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
    }

    public final void n() {
        com.tencent.mars.xlog.Log.i("MicroMsg.MT.MultiTalkNewTalkingUILogic", "inflateView viewShowing: " + this.f408541v);
        this.f408541v = true;
        com.tencent.mm.plugin.multitalk.ui.MultiTalkMainUI multiTalkMainUI = this.f408520a;
        android.view.View findViewById = multiTalkMainUI.findViewById(com.tencent.mm.R.id.nyf);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkNewTalkingUILogic", "inflateView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkNewTalkingUILogic", "inflateView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        ((android.widget.FrameLayout) ((jz5.n) this.f408522c).getValue()).setVisibility(0);
        android.view.View view = (android.view.View) ((jz5.n) this.f408525f).getValue();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkNewTalkingUILogic", "inflateView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkNewTalkingUILogic", "inflateView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        d().setLayoutAdapter(this.f408533n);
        d().setOnMaxYChanged(new sj3.i2(e()));
        e().h(false, false);
        l().f150265p.observe(multiTalkMainUI, new sj3.j2(this));
        android.view.View findViewById2 = multiTalkMainUI.findViewById(com.tencent.mm.R.id.nyg);
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(8);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(findViewById2, arrayList3.toArray(), "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkNewTalkingUILogic", "inflateView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById2.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(findViewById2, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkNewTalkingUILogic", "inflateView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        f().setOnClickListener(new sj3.k2(this));
        if (com.tencent.mm.ui.bk.y() || com.tencent.mm.ui.eg.d(multiTalkMainUI.getTaskId())) {
            jz5.g gVar = this.f408536q;
            ((com.tencent.mm.ui.widget.imageview.WeImageView) ((jz5.n) gVar).getValue()).setVisibility(0);
            f().setVisibility(8);
            ((com.tencent.mm.ui.widget.imageview.WeImageView) ((jz5.n) gVar).getValue()).setOnClickListener(new sj3.n2(this));
        }
        if (com.tencent.mm.sdk.platformtools.z.f193115k) {
            android.view.View h17 = h();
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(0);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(h17, arrayList4.toArray(), "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkNewTalkingUILogic", "checkScreenProjector", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            h17.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(h17, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkNewTalkingUILogic", "checkScreenProjector", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            h().setBackground(com.tencent.mm.ui.uk.e(multiTalkMainUI, com.tencent.mm.R.raw.icons_outlined_board, multiTalkMainUI.getResources().getColor(com.tencent.mm.R.color.f478553an)));
            if (zj3.j.a()) {
                android.view.View g17 = g();
                java.util.ArrayList arrayList5 = new java.util.ArrayList();
                arrayList5.add(8);
                java.util.Collections.reverse(arrayList5);
                yj0.a.d(g17, arrayList5.toArray(), "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkNewTalkingUILogic", "checkScreenProjector", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                g17.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
                yj0.a.f(g17, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkNewTalkingUILogic", "checkScreenProjector", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else {
                ((ua0.m) ((va0.p) i95.n0.c(va0.p.class))).getClass();
                rn3.i.Di().k((rj3.a) ((jz5.n) this.f408531l).getValue());
            }
            h().setOnClickListener(new sj3.c2(this));
        } else {
            android.view.View h18 = h();
            java.util.ArrayList arrayList6 = new java.util.ArrayList();
            arrayList6.add(8);
            java.util.Collections.reverse(arrayList6);
            yj0.a.d(h18, arrayList6.toArray(), "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkNewTalkingUILogic", "checkScreenProjector", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            h18.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
            yj0.a.f(h18, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkNewTalkingUILogic", "checkScreenProjector", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View g18 = g();
            java.util.ArrayList arrayList7 = new java.util.ArrayList();
            arrayList7.add(8);
            java.util.Collections.reverse(arrayList7);
            yj0.a.d(g18, arrayList7.toArray(), "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkNewTalkingUILogic", "checkScreenProjector", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            g18.setVisibility(((java.lang.Integer) arrayList7.get(0)).intValue());
            yj0.a.f(g18, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkNewTalkingUILogic", "checkScreenProjector", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        q();
        androidx.lifecycle.g0 g0Var = l().f150263n;
        androidx.lifecycle.k0 k0Var = this.f408543x;
        g0Var.removeObserver(k0Var);
        l().f150263n.observe(multiTalkMainUI, k0Var);
        l().f150267r.observe(multiTalkMainUI, this.f408538s);
    }

    public final void o(int i17) {
        com.tencent.mm.sdk.platformtools.o4 R;
        try {
            R = com.tencent.mm.sdk.platformtools.o4.R("com.tecent.wx.voip.voipHasShownChangeToCelluarTipHistoryMultiTalk");
        } catch (java.lang.RuntimeException e17) {
            com.tencent.mm.sdk.platformtools.Log.c("MicroMsg.MT.MultiTalkNewTalkingUILogic", e17.toString(), new java.lang.Object[0]);
        }
        if (R.getBoolean("voipHasShownChangeToCelluarTipHistory", false)) {
            return;
        }
        R.G("voipHasShownChangeToCelluarTipHistory", true);
        com.tencent.mars.xlog.Log.i("MicroMsg.MT.MultiTalkNewTalkingUILogic", "showNetWorkChangeMobileNet: " + i17);
        android.util.DisplayMetrics displayMetrics = new android.util.DisplayMetrics();
        com.tencent.mm.plugin.multitalk.ui.MultiTalkMainUI multiTalkMainUI = this.f408520a;
        java.lang.Object systemService = multiTalkMainUI.getSystemService("window");
        kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        ((android.view.WindowManager) systemService).getDefaultDisplay().getMetrics(displayMetrics);
        if (displayMetrics.heightPixels / displayMetrics.density <= 540.0f) {
            db5.t7.n(multiTalkMainUI, multiTalkMainUI.getString(com.tencent.mm.R.string.k_y));
            return;
        }
        sj3.a1 e18 = e();
        e18.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.MT.ControlPanelLogic", "showNetWorkChangeMobileNet: " + i17);
        e18.g(1, i17, com.tencent.mm.R.string.k_y);
    }

    public final void p(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MT.MultiTalkNewTalkingUILogic", "showNetWorkCostMax: " + i17);
        if (com.tencent.mm.plugin.multitalk.ilinkservice.i4.INSTANCE.t()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MT.MultiTalkNewTalkingUILogic", "showNetWorkCostMax: real show " + i17);
            android.util.DisplayMetrics displayMetrics = new android.util.DisplayMetrics();
            com.tencent.mm.plugin.multitalk.ui.MultiTalkMainUI multiTalkMainUI = this.f408520a;
            java.lang.Object systemService = multiTalkMainUI.getSystemService("window");
            kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.view.WindowManager");
            ((android.view.WindowManager) systemService).getDefaultDisplay().getMetrics(displayMetrics);
            if (displayMetrics.heightPixels / displayMetrics.density <= 540.0f) {
                db5.t7.n(multiTalkMainUI, multiTalkMainUI.getString(com.tencent.mm.R.string.k_x));
                return;
            }
            sj3.a1 e17 = e();
            e17.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.MT.ControlPanelLogic", "showNetWorkCostMax: " + i17);
            e17.g(2, i17, com.tencent.mm.R.string.k_x);
        }
    }

    public final void q() {
        com.tencent.mars.xlog.Log.i("MicroMsg.MT.MultiTalkNewTalkingUILogic", "showPageElement: ");
        if (this.f408540u) {
            return;
        }
        this.f408540u = true;
        android.view.animation.AlphaAnimation alphaAnimation = new android.view.animation.AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setDuration(150L);
        k().setAnimation(alphaAnimation);
        android.view.View k17 = k();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(k17, arrayList.toArray(), "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkNewTalkingUILogic", "showPageElement", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        k17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(k17, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkNewTalkingUILogic", "showPageElement", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        j().setAnimation(alphaAnimation);
        android.view.View j17 = j();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(j17, arrayList2.toArray(), "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkNewTalkingUILogic", "showPageElement", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        j17.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(j17, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkNewTalkingUILogic", "showPageElement", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        sj3.a1 e17 = e();
        e17.getClass();
        android.view.animation.AlphaAnimation alphaAnimation2 = new android.view.animation.AlphaAnimation(0.0f, 1.0f);
        alphaAnimation2.setDuration(150L);
        android.view.View view = e17.f408406t;
        if (view != null) {
            view.setAnimation(alphaAnimation2);
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view, arrayList3.toArray(), "com/tencent/mm/plugin/multitalk/ui/widget/ControlPanelLogic", "showPanel", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/multitalk/ui/widget/ControlPanelLogic", "showPanel", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    public final void r(boolean z17) {
        jz5.g gVar = this.f408536q;
        jz5.g gVar2 = this.f408525f;
        com.tencent.mm.plugin.multitalk.ui.MultiTalkMainUI multiTalkMainUI = this.f408520a;
        if (z17) {
            f().setImageDrawable(com.tencent.mm.ui.uk.e(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.raw.icons_filled_back, -1));
            f().setIconColor(-1);
            k().getLayoutParams().height = i65.a.b(multiTalkMainUI, 52) + com.tencent.mm.ui.bk.p(multiTalkMainUI);
            k().setBackgroundColor(multiTalkMainUI.getResources().getColor(com.tencent.mm.R.color.f478870jg));
            android.view.View h17 = h();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(h17, arrayList.toArray(), "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkNewTalkingUILogic", "switchTopControlStyle", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            h17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(h17, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkNewTalkingUILogic", "switchTopControlStyle", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view = (android.view.View) ((jz5.n) gVar2).getValue();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkNewTalkingUILogic", "switchTopControlStyle", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkNewTalkingUILogic", "switchTopControlStyle", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            ((com.tencent.mm.ui.widget.imageview.WeImageView) ((jz5.n) gVar).getValue()).setVisibility(8);
            f().setVisibility(0);
            return;
        }
        f().setImageDrawable(com.tencent.mm.ui.uk.e(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.raw.icons_outlined_mini_windows_new, -1));
        f().setIconColor(-1);
        k().getLayoutParams().height = i65.a.a(multiTalkMainUI, multiTalkMainUI.getResources().getDimension(com.tencent.mm.R.dimen.a5n));
        k().setBackground(multiTalkMainUI.getResources().getDrawable(com.tencent.mm.R.drawable.aqk));
        android.view.View h18 = h();
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList3.add(0);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(h18, arrayList3.toArray(), "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkNewTalkingUILogic", "switchTopControlStyle", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        h18.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(h18, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkNewTalkingUILogic", "switchTopControlStyle", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view2 = (android.view.View) ((jz5.n) gVar2).getValue();
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        arrayList4.add(0);
        java.util.Collections.reverse(arrayList4);
        yj0.a.d(view2, arrayList4.toArray(), "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkNewTalkingUILogic", "switchTopControlStyle", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkNewTalkingUILogic", "switchTopControlStyle", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (com.tencent.mm.ui.bk.y() || com.tencent.mm.ui.eg.d(multiTalkMainUI.getTaskId())) {
            ((com.tencent.mm.ui.widget.imageview.WeImageView) ((jz5.n) gVar).getValue()).setVisibility(0);
            f().setVisibility(8);
        }
    }
}
