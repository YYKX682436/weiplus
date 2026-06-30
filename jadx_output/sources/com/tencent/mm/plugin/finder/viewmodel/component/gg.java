package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes10.dex */
public final class gg extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: z, reason: collision with root package name */
    public static boolean f134504z;

    /* renamed from: d, reason: collision with root package name */
    public boolean f134505d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f134506e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f134507f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f134508g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f134509h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f134510i;

    /* renamed from: m, reason: collision with root package name */
    public long f134511m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader f134512n;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.feed.model.ea f134513o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f134514p;

    /* renamed from: q, reason: collision with root package name */
    public android.os.Bundle f134515q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f134516r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f134517s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f134518t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f134519u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f134520v;

    /* renamed from: w, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.viewmodel.component.dg f134521w;

    /* renamed from: x, reason: collision with root package name */
    public final jz5.g f134522x;

    /* renamed from: y, reason: collision with root package name */
    public final jz5.g f134523y;

    static {
        new com.tencent.mm.plugin.finder.viewmodel.component.wf(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gg(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f134517s = true;
        this.f134521w = new com.tencent.mm.plugin.finder.viewmodel.component.dg(this);
        this.f134522x = jz5.h.b(com.tencent.mm.plugin.finder.viewmodel.component.eg.f134271d);
        this.f134523y = jz5.h.b(new com.tencent.mm.plugin.finder.viewmodel.component.cg(activity));
    }

    public static void O6(com.tencent.mm.plugin.finder.viewmodel.component.gg ggVar, boolean z17, boolean z18, boolean z19, kotlinx.coroutines.y0 y0Var, boolean z27, boolean z28, int i17, java.lang.Object obj) {
        boolean z29;
        com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout;
        androidx.recyclerview.widget.RecyclerView recyclerView;
        in5.c cVar;
        boolean z37 = (i17 & 1) != 0 ? true : z17;
        boolean z38 = (i17 & 2) != 0 ? false : z18;
        boolean z39 = (i17 & 4) != 0 ? false : z19;
        kotlinx.coroutines.y0 coroutine = (i17 & 8) != 0 ? ggVar.getMainScope() : y0Var;
        if ((i17 & 16) != 0) {
            cq.k1.a();
            z29 = ((java.lang.Boolean) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.Of).getValue()).r()).booleanValue();
        } else {
            z29 = z27;
        }
        boolean z47 = (i17 & 32) != 0 ? false : z28;
        ggVar.getClass();
        kotlin.jvm.internal.o.g(coroutine, "coroutine");
        kd2.o0 o0Var = kd2.p1.N;
        if (!o0Var.a().B0(z38, false)) {
            com.tencent.mars.xlog.Log.i(pf5.o.TAG, "addFloatBall: unable to add float ball");
            return;
        }
        if (ggVar.getActivity() instanceof com.tencent.mm.plugin.finder.ui.FinderHomeUI) {
            androidx.appcompat.app.AppCompatActivity activity = ggVar.getActivity();
            kotlin.jvm.internal.o.g(activity, "activity");
            androidx.lifecycle.c1 a17 = pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.FinderHomeUIC.class);
            kotlin.jvm.internal.o.f(a17, "get(...)");
            android.view.View view = ((com.tencent.mm.plugin.finder.viewmodel.component.FinderHomeUIC) a17).getActiveFragment().f206301h;
            if (view != null && (refreshLoadMoreLayout = (com.tencent.mm.view.RefreshLoadMoreLayout) view.findViewById(com.tencent.mm.R.id.m6e)) != null && (recyclerView = refreshLoadMoreLayout.getRecyclerView()) != null) {
                androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
                java.lang.Integer num = null;
                com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager finderLinearLayoutManager = layoutManager instanceof com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager ? (com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager) layoutManager : null;
                if (finderLinearLayoutManager != null) {
                    androidx.recyclerview.widget.k3 p07 = recyclerView.p0(finderLinearLayoutManager.w());
                    in5.s0 s0Var = p07 instanceof in5.s0 ? (in5.s0) p07 : null;
                    if (s0Var != null && (cVar = (in5.c) s0Var.f293125i) != null) {
                        num = java.lang.Integer.valueOf(cVar.h());
                    }
                    if ((num != null && num.intValue() == 15) || (num != null && num.intValue() == 19)) {
                        android.app.Activity context = ggVar.getContext();
                        int i18 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
                        com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(context);
                        e4Var.d(com.tencent.mm.R.string.nmp);
                        e4Var.c();
                        return;
                    }
                }
            }
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ni(2);
        }
        if (!ggVar.f134510i) {
            ggVar.V6(z38, true, z29);
            ggVar.f134510i = true;
        }
        if (z37) {
            o0Var.a().C0(1);
        }
        if (z38) {
            o0Var.a().C0(3);
        }
        ggVar.f134509h = true;
        kotlinx.coroutines.l.d(coroutine, null, null, new com.tencent.mm.plugin.finder.viewmodel.component.xf(z39, z38, z29, ggVar, z47, z37, null), 3, null);
        com.tencent.mars.xlog.Log.i(pf5.o.TAG, ggVar.getActivity().getClass().getName() + " addFloatBall step1: coroutine=" + coroutine + ", needTriggerBack=" + z37 + ", isPassive=" + z38 + ", addFromSwipe=" + z39);
    }

    public final boolean P6(boolean z17) {
        java.lang.Boolean bool;
        if (this.f134506e) {
            S6().p();
            if (!S6().s0() || this.f134518t) {
                return false;
            }
            this.f134518t = true;
            S6().g0(new com.tencent.mm.plugin.finder.viewmodel.component.yf(this));
            return true;
        }
        boolean z18 = !this.f134508g && this.f134505d && this.f134516r && !kd2.p1.N.a().u();
        boolean z19 = !this.f134518t && (z17 || z18);
        com.tencent.mars.xlog.Log.i(pf5.o.TAG, "checkBackPressedAnim: isActiveAddFloatBall=" + z17 + ", needExitAnimation=" + z19 + ", canAddPassiveFloatBall=" + z18 + ", activity=" + com.tencent.mm.plugin.finder.viewmodel.component.gg.class.getSimpleName());
        if (!z19) {
            return false;
        }
        if (!z17 && z18) {
            O6(this, false, true, false, null, false, false, 60, null);
        }
        ep1.m.a(getActivity(), false);
        android.app.Activity context = getContext();
        kotlin.jvm.internal.o.g(context, "context");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        com.tencent.mm.plugin.finder.viewmodel.component.g1 g1Var = (com.tencent.mm.plugin.finder.viewmodel.component.g1) zVar.a((androidx.appcompat.app.AppCompatActivity) context).e(com.tencent.mm.plugin.finder.viewmodel.component.g1.class);
        if (g1Var != null) {
            g1Var.f134456e = false;
        }
        this.f134518t = true;
        do2.c cVar = com.tencent.mm.plugin.finder.megavideo.ui.FinderMegaVideoMiniView.f121046s;
        android.content.res.Resources resources = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources();
        kotlin.jvm.internal.o.f(resources, "getResources(...)");
        android.util.Size a17 = cVar.a(resources, do2.e.f242080g);
        pv.g0 g0Var = (pv.g0) ((jz5.n) this.f134522x).getValue();
        if (g0Var != null) {
            androidx.appcompat.app.AppCompatActivity activity = getActivity();
            kotlin.jvm.internal.o.e(activity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            com.tencent.mm.ui.ga controller = ((com.tencent.mm.ui.MMActivity) activity).getController();
            bool = java.lang.Boolean.valueOf(((ep1.k) g0Var).e(null, controller != null ? controller.w() : null, new android.graphics.Point(a17.getWidth(), a17.getHeight()), null, new com.tencent.mm.plugin.finder.viewmodel.component.zf(this)));
        } else {
            bool = null;
        }
        if (kotlin.jvm.internal.o.b(bool, java.lang.Boolean.TRUE)) {
            android.app.Activity activity2 = getContext();
            kotlin.jvm.internal.o.g(activity2, "activity");
            if (!(activity2 instanceof androidx.appcompat.app.AppCompatActivity)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            if (!((com.tencent.mm.plugin.finder.viewmodel.component.gg) zVar.a((androidx.appcompat.app.AppCompatActivity) activity2).a(com.tencent.mm.plugin.finder.viewmodel.component.gg.class)).f134514p) {
                f134504z = true;
                com.tencent.mars.xlog.Log.i(pf5.o.TAG, "resumeFromClickFloatBallAndBack:true");
            }
            this.f134514p = true;
            androidx.appcompat.app.AppCompatActivity activity3 = getActivity();
            com.tencent.mm.ui.MMActivity mMActivity = activity3 instanceof com.tencent.mm.ui.MMActivity ? (com.tencent.mm.ui.MMActivity) activity3 : null;
            if (mMActivity != null) {
                mMActivity.setNavigationbarColor(getResources().getColor(com.tencent.mm.R.color.f478490b));
            }
        }
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public final void Q6(androidx.recyclerview.widget.RecyclerView rv6) {
        kotlin.jvm.internal.o.g(rv6, "rv");
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = rv6.getLayoutManager();
        com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager finderLinearLayoutManager = layoutManager instanceof com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager ? (com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager) layoutManager : null;
        if (finderLinearLayoutManager == null) {
            return;
        }
        rv6.post(new com.tencent.mm.plugin.finder.viewmodel.component.bg(this, finderLinearLayoutManager, rv6));
    }

    public final void R6() {
        com.tencent.mm.view.RefreshLoadMoreLayout h17;
        if (this.f134520v) {
            return;
        }
        kd2.o0 o0Var = kd2.p1.N;
        this.f134507f = o0Var.a().G;
        o0Var.a().f93132d.f93059t = false;
        o0Var.a().t0();
        this.f134520v = true;
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        android.view.View rootView = getRootView();
        android.view.ViewGroup viewGroup = rootView instanceof android.view.ViewGroup ? (android.view.ViewGroup) rootView : null;
        if (viewGroup == null || (h17 = hc2.f1.h(viewGroup)) == null) {
            return;
        }
        androidx.recyclerview.widget.f2 adapter = h17.getRecyclerView().getAdapter();
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = adapter instanceof com.tencent.mm.view.recyclerview.WxRecyclerAdapter ? (com.tencent.mm.view.recyclerview.WxRecyclerAdapter) adapter : null;
        if (wxRecyclerAdapter == null || wxRecyclerAdapter.getItemCount() <= 0) {
            return;
        }
        wxRecyclerAdapter.notifyItemRangeChanged(0, wxRecyclerAdapter.getItemCount(), new jz5.l(30, 1));
    }

    public final kd2.w S6() {
        return (kd2.w) ((jz5.n) this.f134523y).getValue();
    }

    public final void T6() {
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        com.tencent.mm.plugin.finder.viewmodel.component.f2 f2Var = (com.tencent.mm.plugin.finder.viewmodel.component.f2) pf5.z.f353948a.a(activity).e(com.tencent.mm.plugin.finder.viewmodel.component.f2.class);
        if (f2Var != null) {
            pm0.v.V(0L, new com.tencent.mm.plugin.finder.viewmodel.component.b2(f2Var));
        }
    }

    public final void U6(android.os.Bundle bundle) {
        if (bundle != null) {
            bundle.remove("key_anim_intent_id");
        }
        if (bundle != null) {
            bundle.remove("key_intent_animating_flag");
        }
        this.f134515q = bundle;
    }

    /* JADX WARN: Removed duplicated region for block: B:144:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x016f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void V6(boolean r22, boolean r23, boolean r24) {
        /*
            Method dump skipped, instructions count: 691
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.viewmodel.component.gg.V6(boolean, boolean, boolean):void");
    }

    public final void W6(boolean z17, boolean z18) {
        android.view.View findViewById = getContext().findViewById(com.tencent.mm.R.id.g8o);
        if (findViewById != null) {
            int i17 = z17 ? 0 : z18 ? 4 : 8;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Integer.valueOf(i17));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderFloatBallNormalUIC", "setEnableAddFloatBall", "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/viewmodel/component/FinderFloatBallNormalUIC", "setEnableAddFloatBall", "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        kd2.p1.N.a().F = z17;
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onBeforeFinish(android.content.Intent intent) {
        if (this.f134509h || !this.f134505d || !this.f134516r || kd2.p1.N.a().u()) {
            return;
        }
        O6(this, false, true, false, null, this.f134507f, false, 44, null);
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        if (((ov.i0) ((pv.d0) i95.n0.c(pv.d0.class))).Di()) {
            android.content.Intent intent = getIntent();
            this.f134506e = intent != null && intent.getIntExtra("key_enter_group_type", 0) == 1;
            java.lang.String stringExtra = getActivity().getIntent().getStringExtra("FLOAT_BALL_KEY");
            if (this.f134506e) {
                if (!(stringExtra == null || stringExtra.length() == 0)) {
                    S6().b(49, stringExtra);
                }
            }
        }
        java.lang.String stringExtra2 = !this.f134506e ? getActivity().getIntent().getStringExtra("FLOAT_BALL_KEY") : null;
        this.f134505d = true;
        kd2.o0 o0Var = kd2.p1.N;
        if (o0Var.a().u()) {
            if ((stringExtra2 == null || stringExtra2.length() == 0) && !o0Var.a().N0()) {
                this.f134505d = false;
            }
            stringExtra2 = o0Var.a().f93132d.f93049g;
        }
        this.f134516r = o0Var.a().L0(getActivity());
        this.f134511m = getIntent().getLongExtra("KEY_ENTER_PLAYING_FEED_ID", 0L);
        if (stringExtra2 == null) {
            o0Var.a().t0();
            stringExtra2 = ((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).nk();
            this.f134505d = false;
        }
        if (this.f134505d && this.f134511m == 0) {
            this.f134511m = o0Var.a().F0();
        }
        com.tencent.mars.xlog.Log.i(pf5.o.TAG, "initFinderFloatBall key: %s", stringExtra2);
        if ((this.f134516r && this.f134505d) || !o0Var.a().u()) {
            o0Var.a().b(32, stringExtra2);
        }
        if (getActivity() instanceof com.tencent.mm.ui.MMActivity) {
            if ((stringExtra2.length() == 0) || this.f134506e) {
                return;
            }
            this.f134519u = true;
            pv.g0 g0Var = (pv.g0) ((jz5.n) this.f134522x).getValue();
            if (g0Var != null) {
                android.content.Intent intent2 = getActivity().getIntent();
                androidx.appcompat.app.AppCompatActivity activity = getActivity();
                kotlin.jvm.internal.o.e(activity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
                com.tencent.mm.ui.ga controller = ((com.tencent.mm.ui.MMActivity) activity).getController();
                ((ep1.k) g0Var).c(intent2, controller != null ? controller.w() : null, new com.tencent.mm.plugin.finder.viewmodel.component.fg(), this.f134521w);
            }
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        kd2.p1.N.a().P0();
        S6().o0();
        gp1.v Bi = ((ov.i0) ((pv.d0) i95.n0.c(pv.d0.class))).Bi();
        if (Bi != null) {
            Bi.r0();
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onFinished() {
        super.onFinished();
        kd2.p1.N.a().p();
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onNewIntent(android.content.Intent intent) {
        java.lang.String stringExtra = intent != null ? intent.getStringExtra("FLOAT_BALL_KEY") : null;
        this.f134505d = !(stringExtra == null || stringExtra.length() == 0);
        this.f134516r = kd2.p1.N.a().L0(getActivity());
        if (intent != null) {
            this.f134511m = intent.getLongExtra("KEY_ENTER_PLAYING_FEED_ID", 0L);
        }
        this.f134517s = true;
        com.tencent.mars.xlog.Log.i(pf5.o.TAG, "onNewIntent %s", java.lang.Boolean.valueOf(this.f134519u));
        if (this.f134505d && (getActivity() instanceof com.tencent.mm.ui.MMActivity) && !this.f134506e) {
            this.f134519u = true;
            pv.g0 g0Var = (pv.g0) ((jz5.n) this.f134522x).getValue();
            if (g0Var != null) {
                androidx.appcompat.app.AppCompatActivity activity = getActivity();
                kotlin.jvm.internal.o.e(activity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
                com.tencent.mm.ui.ga controller = ((com.tencent.mm.ui.MMActivity) activity).getController();
                ((ep1.k) g0Var).c(intent, controller != null ? controller.w() : null, null, this.f134521w);
            }
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onPause() {
        if (!this.f134510i) {
            V6(true, false, false);
        }
        if (this.f134520v) {
            kd2.p1.N.a().z();
            if (this.f134506e) {
                S6().z();
            }
        }
        kd2.p1 a17 = kd2.p1.N.a();
        gp1.v vVar = a17.f93136h;
        if (vVar != null) {
            vVar.o0(a17.f93132d);
        }
        this.f134520v = false;
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onResume() {
        gp1.v Bi;
        boolean z17 = false;
        if (this.f134516r && this.f134505d && this.f134517s) {
            if (ep1.m.h(getIntent())) {
                ep1.m.a(getActivity(), false);
            }
            com.tencent.mars.xlog.Log.i(pf5.o.TAG, "onResume %s", java.lang.Boolean.valueOf(this.f134519u));
            if (!this.f134519u) {
                R6();
            }
        } else if (!f134504z) {
            kd2.p1.T0(kd2.p1.N.a(), true, false, false, 4, null);
        }
        if (!this.f134505d && !f134504z && (Bi = ((ov.i0) ((pv.d0) i95.n0.c(pv.d0.class))).Bi()) != null) {
            Bi.k0();
        }
        this.f134517s = false;
        if (!this.f134505d) {
            kd2.o0 o0Var = kd2.p1.N;
            if (o0Var.a().N0() && o0Var.a().L0(getActivity())) {
                kd2.q0 q0Var = o0Var.a().f306787x;
                if (q0Var != null && q0Var.f306817r) {
                    z17 = true;
                }
                if (!z17) {
                    com.tencent.mars.xlog.Log.i(pf5.o.TAG, "onResume: remove exceptional floating ball");
                    R6();
                }
            }
        }
        if (this.f134506e) {
            S6().x();
        }
    }
}
