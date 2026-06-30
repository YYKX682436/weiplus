package zk3;

/* loaded from: classes8.dex */
public final class g0 extends pk3.h implements gp1.y {

    /* renamed from: d, reason: collision with root package name */
    public final long f473449d;

    /* renamed from: e, reason: collision with root package name */
    public long f473450e;

    /* renamed from: f, reason: collision with root package name */
    public volatile boolean f473451f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.ArrayList f473452g;

    /* renamed from: h, reason: collision with root package name */
    public final android.graphics.Rect f473453h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.view.recyclerview.WxRecyclerView f473454i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.plugin.multitask.ui.panel.MultiTaskCoordinatorLayout f473455m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.TextView f473456n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.ImageView f473457o;

    /* renamed from: p, reason: collision with root package name */
    public android.view.View f473458p;

    /* renamed from: q, reason: collision with root package name */
    public zk3.h f473459q;

    /* renamed from: r, reason: collision with root package name */
    public final jz5.g f473460r;

    /* renamed from: s, reason: collision with root package name */
    public final com.tencent.mm.plugin.multitask.ui.minusscreen.b f473461s;

    /* renamed from: t, reason: collision with root package name */
    public com.tencent.mm.view.recyclerview.WxRecyclerAdapter f473462t;

    /* renamed from: u, reason: collision with root package name */
    public int f473463u;

    /* renamed from: v, reason: collision with root package name */
    public android.graphics.Point f473464v;

    /* renamed from: w, reason: collision with root package name */
    public final android.os.Handler f473465w;

    /* renamed from: x, reason: collision with root package name */
    public final zk3.k f473466x;

    /* renamed from: y, reason: collision with root package name */
    public final zk3.x f473467y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f473449d = 1000L;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.f473452g = arrayList;
        this.f473453h = new android.graphics.Rect();
        this.f473460r = jz5.h.b(new zk3.y(this, activity));
        this.f473461s = new com.tencent.mm.plugin.multitask.ui.minusscreen.e(arrayList, 0, 2, null);
        this.f473463u = -1;
        this.f473464v = new android.graphics.Point();
        this.f473465w = new android.os.Handler(android.os.Looper.getMainLooper());
        this.f473466x = new zk3.k(this);
        this.f473467y = new zk3.x(this);
    }

    public static final void V6(zk3.g0 g0Var, java.util.List list, boolean z17, boolean z18, boolean z19) {
        g0Var.getClass();
        pm0.v.X(new zk3.t(g0Var, list, z19, z17, z18));
    }

    @Override // pk3.b
    public boolean M9(int i17) {
        return i17 == 0;
    }

    @Override // pk3.h
    public void O6(java.lang.Object obj) {
        java.lang.String string;
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter;
        com.tencent.mm.plugin.multitask.ui.panel.OverScrollMultiTaskVerticalBehavior f150581j2;
        android.view.ViewTreeObserver viewTreeObserver;
        ((ov.i0) ((pv.d0) i95.n0.c(pv.d0.class))).Bi().H(this);
        android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) getRootView().findViewById(com.tencent.mm.R.id.jxt);
        android.view.ViewGroup.LayoutParams layoutParams = relativeLayout.getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        android.widget.LinearLayout.LayoutParams layoutParams2 = (android.widget.LinearLayout.LayoutParams) layoutParams;
        layoutParams2.topMargin = com.tencent.mm.ui.bl.i(getActivity(), -1);
        relativeLayout.setLayoutParams(layoutParams2);
        android.widget.TextView textView = (android.widget.TextView) getRootView().findViewById(com.tencent.mm.R.id.jxu);
        android.app.Activity context = getContext();
        kotlin.jvm.internal.o.g(context, "context");
        if (((com.tencent.mm.plugin.multitask.p1) ((com.tencent.mm.plugin.multitask.l0) i95.n0.c(com.tencent.mm.plugin.multitask.l0.class))).Ai()) {
            string = b3.l.getString(context, com.tencent.mm.R.string.c0x);
            kotlin.jvm.internal.o.d(string);
        } else {
            string = b3.l.getString(context, com.tencent.mm.R.string.h0u);
            kotlin.jvm.internal.o.d(string);
        }
        textView.setText(string);
        android.widget.ImageView imageView = (android.widget.ImageView) getRootView().findViewById(com.tencent.mm.R.id.jxs);
        this.f473457o = imageView;
        if (imageView != null) {
            imageView.setOnClickListener(new zk3.u(this));
        }
        this.f473456n = (android.widget.TextView) getRootView().findViewById(com.tencent.mm.R.id.jkv);
        com.tencent.mm.plugin.multitask.ui.minusscreen.b bVar = this.f473461s;
        final com.tencent.mm.plugin.multitask.ui.minusscreen.e eVar = (com.tencent.mm.plugin.multitask.ui.minusscreen.e) bVar;
        zk3.x xVar = this.f473467y;
        eVar.f150561c = xVar;
        this.f473454i = (com.tencent.mm.view.recyclerview.WxRecyclerView) getRootView().findViewById(com.tencent.mm.R.id.jxp);
        com.tencent.mm.plugin.multitask.ui.panel.MultiTaskCoordinatorLayout multiTaskCoordinatorLayout = (com.tencent.mm.plugin.multitask.ui.panel.MultiTaskCoordinatorLayout) getRootView().findViewById(com.tencent.mm.R.id.jxq);
        this.f473455m = multiTaskCoordinatorLayout;
        if (multiTaskCoordinatorLayout != null && (viewTreeObserver = multiTaskCoordinatorLayout.getViewTreeObserver()) != null) {
            viewTreeObserver.addOnGlobalLayoutListener(new zk3.w(this));
        }
        android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(getActivity());
        zk3.h0 h0Var = com.tencent.mm.plugin.multitask.ui.uic.MultiTaskUIC.C;
        frameLayout.setLayoutParams(new androidx.recyclerview.widget.RecyclerView.LayoutParams(-1, 0));
        this.f473458p = frameLayout;
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = (androidx.recyclerview.widget.RecyclerView.LayoutManager) ((jz5.n) this.f473460r).getValue();
        kotlin.jvm.internal.o.e(layoutManager, "null cannot be cast to non-null type com.tencent.mm.plugin.multitask.ui.minusscreen.MinusScreenGridLayoutManager");
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = this.f473454i;
        ((com.tencent.mm.plugin.multitask.ui.minusscreen.MinusScreenGridLayoutManager) layoutManager).D = wxRecyclerView;
        final yz5.l lVar = null;
        com.tencent.mm.plugin.multitask.ui.panel.OverScrollMultiTaskRecyclerView overScrollMultiTaskRecyclerView = wxRecyclerView instanceof com.tencent.mm.plugin.multitask.ui.panel.OverScrollMultiTaskRecyclerView ? (com.tencent.mm.plugin.multitask.ui.panel.OverScrollMultiTaskRecyclerView) wxRecyclerView : null;
        if (overScrollMultiTaskRecyclerView != null && (f150581j2 = overScrollMultiTaskRecyclerView.getF150581j2()) != null) {
            f150581j2.f150582d = xVar;
        }
        zk3.m mVar = new zk3.m(this, new in5.s() { // from class: com.tencent.mm.plugin.multitask.ui.minusscreen.MinusScreenGridLayoutConfig$getItemConvertFactory$1
            @Override // in5.s
            public in5.r getItemConvert(int type) {
                in5.r rVar;
                if (type == 1) {
                    return new xk3.a(com.tencent.mm.plugin.multitask.ui.minusscreen.e.this.f150561c);
                }
                if (type != 2) {
                    if (type == 3) {
                        return new xk3.j(com.tencent.mm.plugin.multitask.ui.minusscreen.e.this.f150561c);
                    }
                    if (type == 4) {
                        return new xk3.b(com.tencent.mm.plugin.multitask.ui.minusscreen.e.this.f150561c);
                    }
                    if (type == 5) {
                        return new xk3.d(com.tencent.mm.plugin.multitask.ui.minusscreen.e.this.f150561c);
                    }
                    if (type == 8) {
                        return new xk3.p(com.tencent.mm.plugin.multitask.ui.minusscreen.e.this.f150561c);
                    }
                    switch (type) {
                        case 22:
                        case 25:
                        case 27:
                            return new xk3.v(com.tencent.mm.plugin.multitask.ui.minusscreen.e.this.f150561c);
                        case 23:
                            return new xk3.o(com.tencent.mm.plugin.multitask.ui.minusscreen.e.this.f150561c, true);
                        case 24:
                            return new xk3.o(com.tencent.mm.plugin.multitask.ui.minusscreen.e.this.f150561c, false);
                        case 26:
                            break;
                        case 28:
                        case 29:
                            return new xk3.c(com.tencent.mm.plugin.multitask.ui.minusscreen.e.this.f150561c);
                        case 30:
                            return new xk3.k(com.tencent.mm.plugin.multitask.ui.minusscreen.e.this.f150561c);
                        default:
                            yz5.l lVar2 = lVar;
                            if (lVar2 != null && (rVar = (in5.r) lVar2.invoke(java.lang.Integer.valueOf(type))) != null) {
                                return rVar;
                            }
                            com.tencent.mm.plugin.multitask.ui.minusscreen.e.this.getClass();
                            java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                            com.tencent.mm.sdk.platformtools.Log.c("FinderGridLayoutConfig", "type invalid", new java.lang.Object[0]);
                            return new com.tencent.mm.plugin.multitask.ui.minusscreen.c();
                    }
                }
                return new xk3.w(com.tencent.mm.plugin.multitask.ui.minusscreen.e.this.f150561c);
            }
        }, this.f473452g);
        this.f473462t = mVar;
        mVar.registerAdapterDataObserver(this.f473466x);
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView2 = this.f473454i;
        if (wxRecyclerView2 != null) {
            wxRecyclerView2.setLayoutManager((androidx.recyclerview.widget.RecyclerView.LayoutManager) ((jz5.n) this.f473460r).getValue());
            wxRecyclerView2.setItemAnimator(new zk3.n(this));
            wxRecyclerView2.setAdapter(this.f473462t);
        }
        bVar.getClass();
        android.view.View view = this.f473458p;
        if (view != null && (wxRecyclerAdapter = this.f473462t) != null) {
            in5.n0.U(wxRecyclerAdapter, view, 0, false, 4, null);
        }
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter2 = this.f473462t;
        if (wxRecyclerAdapter2 != null) {
            wxRecyclerAdapter2.f293105o = new zk3.o(this);
        }
        if (wxRecyclerAdapter2 != null) {
            wxRecyclerAdapter2.F = new zk3.p(this);
        }
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView3 = this.f473454i;
        if (wxRecyclerView3 != null) {
            wxRecyclerView3.i(new zk3.q(this));
        }
        this.f473451f = false;
        pm0.v.O("MultiTask_Thread", new zk3.s(this));
    }

    public final void W6() {
        if (((com.tencent.mm.plugin.multitask.i1) ((com.tencent.mm.plugin.multitask.j0) i95.n0.c(com.tencent.mm.plugin.multitask.j0.class))).Di()) {
            androidx.appcompat.app.AppCompatActivity activity = getActivity();
            kotlin.jvm.internal.o.g(activity, "activity");
            ((com.tencent.mm.plugin.multitask.ui.uic.MultiTaskUIC) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.multitask.ui.uic.MultiTaskUIC.class)).q7(0);
            return;
        }
        androidx.appcompat.app.AppCompatActivity activity2 = getActivity();
        kotlin.jvm.internal.o.g(activity2, "activity");
        pf5.z zVar = pf5.z.f353948a;
        if (((com.tencent.mm.plugin.multitask.ui.uic.MultiTaskUIC) zVar.a(activity2).a(com.tencent.mm.plugin.multitask.ui.uic.MultiTaskUIC.class)).Y6()) {
            androidx.appcompat.app.AppCompatActivity activity3 = getActivity();
            kotlin.jvm.internal.o.g(activity3, "activity");
            ((com.tencent.mm.plugin.multitask.ui.uic.MultiTaskUIC) zVar.a(activity3).a(com.tencent.mm.plugin.multitask.ui.uic.MultiTaskUIC.class)).q7(0);
            return;
        }
        if (this.f473452g.size() == 0) {
            androidx.appcompat.app.AppCompatActivity activity4 = getActivity();
            kotlin.jvm.internal.o.g(activity4, "activity");
            ((com.tencent.mm.plugin.multitask.ui.uic.MultiTaskUIC) zVar.a(activity4).a(com.tencent.mm.plugin.multitask.ui.uic.MultiTaskUIC.class)).q7(1);
            return;
        }
        androidx.appcompat.app.AppCompatActivity activity5 = getActivity();
        kotlin.jvm.internal.o.g(activity5, "activity");
        if (((com.tencent.mm.plugin.multitask.ui.uic.MultiTaskUIC) zVar.a(activity5).a(com.tencent.mm.plugin.multitask.ui.uic.MultiTaskUIC.class)).c7()) {
            return;
        }
        androidx.appcompat.app.AppCompatActivity activity6 = getActivity();
        kotlin.jvm.internal.o.g(activity6, "activity");
        ((com.tencent.mm.plugin.multitask.ui.uic.MultiTaskUIC) zVar.a(activity6).a(com.tencent.mm.plugin.multitask.ui.uic.MultiTaskUIC.class)).q7(2);
    }

    @Override // gp1.y
    public void X(java.util.List ballInfoList, com.tencent.mm.plugin.ball.model.BallInfo ballInfo) {
        kotlin.jvm.internal.o.g(ballInfoList, "ballInfoList");
        com.tencent.mars.xlog.Log.i("MicroMsg.MultiTask.MultiTaskMinusScreenUIC", "dataChanged");
    }

    public final void X6() {
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        pf5.z zVar = pf5.z.f353948a;
        boolean Y6 = ((com.tencent.mm.plugin.multitask.ui.uic.MultiTaskUIC) zVar.a(activity).a(com.tencent.mm.plugin.multitask.ui.uic.MultiTaskUIC.class)).Y6();
        java.util.ArrayList arrayList = this.f473452g;
        if (Y6) {
            if (arrayList.size() == 0) {
                androidx.appcompat.app.AppCompatActivity activity2 = getActivity();
                kotlin.jvm.internal.o.g(activity2, "activity");
                androidx.lifecycle.c1 a17 = zVar.a(activity2).a(com.tencent.mm.plugin.multitask.ui.uic.MultiTaskUIC.class);
                kotlin.jvm.internal.o.f(a17, "get(...)");
                com.tencent.mm.plugin.multitask.ui.uic.MultiTaskUIC.k7((com.tencent.mm.plugin.multitask.ui.uic.MultiTaskUIC) a17, true, false, false, false, false, false, true, false, 128, null);
            } else {
                androidx.appcompat.app.AppCompatActivity activity3 = getActivity();
                kotlin.jvm.internal.o.g(activity3, "activity");
                ((com.tencent.mm.plugin.multitask.ui.uic.MultiTaskUIC) zVar.a(activity3).a(com.tencent.mm.plugin.multitask.ui.uic.MultiTaskUIC.class)).T6(true);
            }
        }
        W6();
        if (Y6) {
            return;
        }
        com.tencent.mm.autogen.events.NotifyMulitTaskIconShowEvent notifyMulitTaskIconShowEvent = new com.tencent.mm.autogen.events.NotifyMulitTaskIconShowEvent();
        notifyMulitTaskIconShowEvent.f54548g.f8018a = arrayList.size() != 0;
        notifyMulitTaskIconShowEvent.e();
    }

    public final void Y6(boolean z17, boolean z18) {
        if (z18) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MultiTaskTipsHelper", "setMultiTaskPaneExitDragFlag, flag: true");
            com.tencent.mm.sdk.platformtools.o4.M("multitask_tips_config").putBoolean("multitask_panel_exit_drag_flag", true);
            return;
        }
        boolean z19 = com.tencent.mm.sdk.platformtools.o4.M("multitask_tips_config").getBoolean("multitask_panel_exit_drag_flag", false);
        com.tencent.mars.xlog.Log.i("MicroMsg.MultiTaskTipsHelper", "isMultiTaskPanelExitDrag, flag: " + z19);
        if (z19 || !z17) {
            android.widget.TextView textView = this.f473456n;
            if (textView == null) {
                return;
            }
            textView.setVisibility(8);
            return;
        }
        android.widget.TextView textView2 = this.f473456n;
        if (textView2 != null) {
            textView2.setVisibility(0);
        }
        android.widget.TextView textView3 = this.f473456n;
        if (textView3 != null) {
            textView3.setAlpha(1.0f);
        }
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        ((com.tencent.mm.plugin.multitask.ui.uic.MultiTaskUIC) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.multitask.ui.uic.MultiTaskUIC.class)).Z6(2);
    }

    public final void Z6(androidx.recyclerview.widget.RecyclerView recyclerView, com.tencent.mm.plugin.multitask.ui.minusscreen.MinusScreenGridLayoutManager layoutManager) {
        int w17;
        int y17;
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(layoutManager, "layoutManager");
        if (layoutManager.getItemCount() <= 3 || (w17 = layoutManager.w()) > (y17 = layoutManager.y())) {
            return;
        }
        int i17 = w17;
        while (true) {
            int i18 = 0;
            androidx.recyclerview.widget.k3 q07 = recyclerView.q0(i17, false);
            in5.s0 s0Var = q07 instanceof in5.s0 ? (in5.s0) q07 : null;
            if (s0Var != null) {
                android.view.View findViewById = s0Var.itemView.findViewById(com.tencent.mm.R.id.jvf);
                android.view.View findViewById2 = s0Var.itemView.findViewById(com.tencent.mm.R.id.jvd);
                if (findViewById != null && findViewById2 != null) {
                    android.graphics.Rect rect = this.f473453h;
                    findViewById2.getLocalVisibleRect(rect);
                    int i19 = layoutManager.getItemCount() == 2 ? com.tencent.mm.plugin.multitask.ui.uic.MultiTaskUIC.S : com.tencent.mm.plugin.multitask.ui.uic.MultiTaskUIC.Q;
                    int height = i19 - rect.height();
                    if (height <= i19 * 0.8f && i17 <= w17 + 1) {
                        i18 = height;
                    }
                    findViewById.setTranslationY(i18);
                    android.view.View findViewById3 = s0Var.itemView.findViewById(com.tencent.mm.R.id.jva);
                    if ((findViewById3 instanceof com.tencent.mm.plugin.multitask.ui.minusscreen.view.MinusScreenRoundFrameLayout ? (com.tencent.mm.plugin.multitask.ui.minusscreen.view.MinusScreenRoundFrameLayout) findViewById3 : null) != null) {
                        com.tencent.mm.plugin.multitask.ui.minusscreen.view.MinusScreenRoundFrameLayout minusScreenRoundFrameLayout = (com.tencent.mm.plugin.multitask.ui.minusscreen.view.MinusScreenRoundFrameLayout) findViewById3;
                        minusScreenRoundFrameLayout.topOffset = i18;
                        minusScreenRoundFrameLayout.invalidate();
                    }
                }
            }
            if (i17 == y17) {
                return;
            } else {
                i17++;
            }
        }
    }

    public final int a7(java.lang.String str, int i17) {
        if (str == null) {
            return -1;
        }
        int i18 = 0;
        for (java.lang.Object obj : this.f473452g) {
            int i19 = i18 + 1;
            if (i18 < 0) {
                kz5.c0.p();
                throw null;
            }
            uk3.a aVar = (uk3.a) obj;
            if (kotlin.jvm.internal.o.b(aVar.f428524d.field_id, str) && aVar.f428524d.field_type == i17) {
                return i18;
            }
            i18 = i19;
        }
        return -1;
    }

    public final void b7(android.view.View view, float f17, float f18) {
        float f19 = 0.0f;
        if (f17 >= 0.5f) {
            float f27 = (f17 - 0.5f) / 0.5f;
            if (f27 >= 0.0f) {
                f19 = 1.0f;
                if (f27 <= 1.0f) {
                    f19 = f27;
                }
            }
            android.widget.ImageView imageView = this.f473457o;
            if (imageView != null) {
                imageView.setAlpha(f19);
            }
            android.widget.TextView textView = this.f473456n;
            if (textView != null) {
                textView.setAlpha(f19);
            }
        } else {
            android.widget.ImageView imageView2 = this.f473457o;
            if (imageView2 != null) {
                imageView2.setAlpha(0.0f);
            }
            android.widget.TextView textView2 = this.f473456n;
            if (textView2 != null) {
                textView2.setAlpha(0.0f);
            }
        }
        com.tencent.mm.plugin.multitask.ui.panel.MultiTaskCoordinatorLayout multiTaskCoordinatorLayout = this.f473455m;
        if (multiTaskCoordinatorLayout == null) {
            return;
        }
        zk3.h0 h0Var = com.tencent.mm.plugin.multitask.ui.uic.MultiTaskUIC.C;
        multiTaskCoordinatorLayout.setTranslationX(0 + (0 * f18));
    }

    public final void c7() {
        int w17;
        int y17;
        android.view.View findViewById;
        androidx.recyclerview.widget.f2 adapter;
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = this.f473454i;
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = wxRecyclerView != null ? wxRecyclerView.getLayoutManager() : null;
        com.tencent.mm.plugin.multitask.ui.minusscreen.MinusScreenGridLayoutManager minusScreenGridLayoutManager = layoutManager instanceof com.tencent.mm.plugin.multitask.ui.minusscreen.MinusScreenGridLayoutManager ? (com.tencent.mm.plugin.multitask.ui.minusscreen.MinusScreenGridLayoutManager) layoutManager : null;
        if (minusScreenGridLayoutManager == null || (w17 = minusScreenGridLayoutManager.w()) > (y17 = minusScreenGridLayoutManager.y())) {
            return;
        }
        while (true) {
            com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView2 = this.f473454i;
            int i17 = 0;
            androidx.recyclerview.widget.k3 q07 = wxRecyclerView2 != null ? wxRecyclerView2.q0(w17, false) : null;
            in5.s0 s0Var = q07 instanceof in5.s0 ? (in5.s0) q07 : null;
            if (s0Var != null) {
                com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView3 = this.f473454i;
                if (wxRecyclerView3 != null && (adapter = wxRecyclerView3.getAdapter()) != null) {
                    i17 = adapter.getItemCount();
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.MultiTask.MultiTaskMinusScreenUIC", "refreshLayout itemCount:" + i17 + ", pos:" + w17);
                if (i17 >= 2 && (findViewById = s0Var.itemView.findViewById(com.tencent.mm.R.id.hhd)) != null) {
                    android.view.ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
                    zk3.h0 h0Var = com.tencent.mm.plugin.multitask.ui.uic.MultiTaskUIC.C;
                    layoutParams.height = com.tencent.mm.plugin.multitask.ui.uic.MultiTaskUIC.L;
                    findViewById.getLayoutParams().width = com.tencent.mm.plugin.multitask.ui.uic.MultiTaskUIC.K;
                    com.tencent.mm.ui.widget.RoundedCornerFrameLayout roundedCornerFrameLayout = (com.tencent.mm.ui.widget.RoundedCornerFrameLayout) s0Var.itemView.findViewById(com.tencent.mm.R.id.jvd);
                    if (roundedCornerFrameLayout != null) {
                        roundedCornerFrameLayout.getLayoutParams().height = com.tencent.mm.plugin.multitask.ui.uic.MultiTaskUIC.Q;
                    }
                    findViewById.requestLayout();
                }
            }
            if (w17 == y17) {
                return;
            } else {
                w17++;
            }
        }
    }

    public final boolean d7(com.tencent.mm.plugin.multitask.model.MultiTaskInfo multiTaskInfo, boolean z17, boolean z18) {
        pk3.h b17;
        int size = this.f473452g.size();
        if (size <= 0) {
            com.tencent.mm.plugin.multitask.ui.panel.MultiTaskCoordinatorLayout multiTaskCoordinatorLayout = this.f473455m;
            if (multiTaskCoordinatorLayout != null) {
                int i17 = com.tencent.mm.plugin.multitask.ui.panel.MultiTaskCoordinatorLayout.I;
                multiTaskCoordinatorLayout.setMode(-1);
            }
        } else {
            com.tencent.mm.plugin.multitask.ui.panel.MultiTaskCoordinatorLayout multiTaskCoordinatorLayout2 = this.f473455m;
            if (multiTaskCoordinatorLayout2 != null) {
                int i18 = com.tencent.mm.plugin.multitask.ui.panel.MultiTaskCoordinatorLayout.I;
                multiTaskCoordinatorLayout2.setMode(1);
            }
        }
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        pf5.z zVar = pf5.z.f353948a;
        yk3.i iVar = ((com.tencent.mm.plugin.multitask.ui.uic.MultiTaskUIC) zVar.a(activity).a(com.tencent.mm.plugin.multitask.ui.uic.MultiTaskUIC.class)).f150593f;
        if (iVar != null && (b17 = iVar.b(1048576, "MultiTaskForSnapshotMinusScreen")) != null && (b17 instanceof zk3.w0)) {
            zk3.w0 w0Var = (zk3.w0) b17;
            w0Var.f473518e = multiTaskInfo;
            androidx.appcompat.app.AppCompatActivity activity2 = w0Var.getActivity();
            kotlin.jvm.internal.o.g(activity2, "activity");
            if (((com.tencent.mm.plugin.multitask.ui.uic.MultiTaskUIC) zVar.a(activity2).a(com.tencent.mm.plugin.multitask.ui.uic.MultiTaskUIC.class)).Q6(multiTaskInfo != null ? multiTaskInfo.field_type : -1)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.SnapShotMultiTaskUIC", "checkSnapShot, teenmode!, forceShow:%b", java.lang.Boolean.valueOf(z18));
            } else {
                boolean z19 = com.tencent.mm.sdk.platformtools.o4.M("multitask_tips_config").getBoolean("multitask_first_enter", false);
                com.tencent.mars.xlog.Log.i("MicroMsg.MultiTaskTipsHelper", "isMultiTaskFirstEnter, flag: " + z19);
                if (z19 || size != 1) {
                    if (size == 1) {
                        if (z18) {
                            boolean z27 = w0Var.getRootView().getVisibility() == 0;
                            com.tencent.mars.xlog.Log.i("MicroMsg.SnapShotMultiTaskUIC", "showSnapshotUIC, isVisible:%b", java.lang.Boolean.valueOf(z27));
                            if (!z27) {
                                w0Var.X6();
                                android.view.View rootView = w0Var.getRootView();
                                java.util.ArrayList arrayList = new java.util.ArrayList();
                                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                                arrayList.add(0);
                                java.util.Collections.reverse(arrayList);
                                yj0.a.d(rootView, arrayList.toArray(), "com/tencent/mm/plugin/multitask/ui/uic/SnapShotMultiTaskUIC", "showSnapshotUIC", "(Lcom/tencent/mm/plugin/multitask/model/MultiTaskInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                rootView.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                                yj0.a.f(rootView, "com/tencent/mm/plugin/multitask/ui/uic/SnapShotMultiTaskUIC", "showSnapshotUIC", "(Lcom/tencent/mm/plugin/multitask/model/MultiTaskInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                w0Var.getRootView().setTranslationX(0.0f - ((com.tencent.mm.plugin.multitask.ui.uic.MultiTaskUIC.T + al3.b.f5850b) + 0));
                                ((ku5.t0) ku5.t0.f312615d).a(new zk3.s0(multiTaskInfo, w0Var));
                            }
                        }
                        com.tencent.mars.xlog.Log.i("MicroMsg.SnapShotMultiTaskUIC", "checkSnapShot, only one size!, forceShow:%b", java.lang.Boolean.valueOf(z18));
                    } else if (z17) {
                        androidx.appcompat.app.AppCompatActivity activity3 = w0Var.getActivity();
                        kotlin.jvm.internal.o.g(activity3, "activity");
                        ((com.tencent.mm.plugin.multitask.ui.uic.MultiTaskUIC) zVar.a(activity3).a(com.tencent.mm.plugin.multitask.ui.uic.MultiTaskUIC.class)).X6(true);
                        com.tencent.mars.xlog.Log.i("MicroMsg.SnapShotMultiTaskUIC", "checkSnapShot, force hide!");
                    } else {
                        if (w0Var.Y6()) {
                            java.lang.Object[] objArr = new java.lang.Object[1];
                            com.tencent.mm.plugin.multitask.model.MultiTaskInfo multiTaskInfo2 = w0Var.f473518e;
                            objArr[0] = multiTaskInfo2 != null ? multiTaskInfo2.field_id : null;
                            com.tencent.mars.xlog.Log.i("MicroMsg.SnapShotMultiTaskUIC", "checkSnapShot, return false,currentShowId:%s", objArr);
                        } else {
                            java.lang.Object[] objArr2 = new java.lang.Object[1];
                            com.tencent.mm.plugin.multitask.model.MultiTaskInfo multiTaskInfo3 = w0Var.f473518e;
                            objArr2[0] = multiTaskInfo3 != null ? multiTaskInfo3.field_id : null;
                            com.tencent.mars.xlog.Log.i("MicroMsg.SnapShotMultiTaskUIC", "checkSnapShot, is hide!, currentShowId:%s", objArr2);
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public int getLayoutId() {
        return com.tencent.mm.R.layout.f489319c45;
    }

    @Override // pk3.b
    public pk3.a i0() {
        return pk3.a.f356434d;
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onConfigurationChanged(android.content.res.Configuration newConfig) {
        kotlin.jvm.internal.o.g(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        android.graphics.Point point = this.f473464v;
        this.f473464v = com.tencent.mm.ui.bk.h(getContext());
        if (com.tencent.mm.ui.bk.v0() && com.tencent.mm.ui.bk.P(getContext())) {
            this.f473464v.x = com.tencent.mm.ui.bk.g();
        }
        if (com.tencent.mm.ui.bk.y()) {
            this.f473464v.x = com.tencent.mm.ui.bk.f();
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MultiTask.MultiTaskMinusScreenUIC", "onConfigurationChanged lastOrientation:" + this.f473463u + ",orientation:" + java.lang.Integer.valueOf(newConfig.orientation) + ", screenResolution:" + this.f473464v.x + ", lastScreenResolution:" + point.x);
        int i17 = this.f473463u;
        int i18 = newConfig.orientation;
        if (i17 == i18) {
            int i19 = point.x;
            android.graphics.Point point2 = this.f473464v;
            if (i19 == point2.x && point.y == point2.y) {
                return;
            }
        }
        this.f473463u = i18;
        c7();
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = this.f473462t;
        if (wxRecyclerAdapter != null) {
            wxRecyclerAdapter.unregisterAdapterDataObserver(this.f473466x);
        }
        ((ov.i0) ((pv.d0) i95.n0.c(pv.d0.class))).Bi().n(this);
    }

    @Override // pk3.b
    public void p9(o75.c event) {
        java.util.HashMap hashMap;
        kotlin.jvm.internal.o.g(event, "event");
        com.tencent.mm.plugin.multitask.model.MultiTaskInfo multiTaskInfo = (com.tencent.mm.plugin.multitask.model.MultiTaskInfo) event.f343590d;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onMultiTaskChange eventId:");
        sb6.append(event.f343587a);
        sb6.append(" id:");
        sb6.append(multiTaskInfo != null ? multiTaskInfo.field_id : null);
        sb6.append(" type:");
        sb6.append(multiTaskInfo != null ? java.lang.Integer.valueOf(multiTaskInfo.field_type) : null);
        com.tencent.mars.xlog.Log.i("MicroMsg.MultiTask.MultiTaskMinusScreenUIC", sb6.toString());
        o75.b bVar = event.f343587a;
        if (kotlin.jvm.internal.o.b(bVar, o75.b.f343582c)) {
            pm0.v.X(new zk3.z(multiTaskInfo, this));
            return;
        }
        if (kotlin.jvm.internal.o.b(bVar, o75.b.f343584e)) {
            if (multiTaskInfo != null) {
                java.lang.String field_id = multiTaskInfo.field_id;
                kotlin.jvm.internal.o.f(field_id, "field_id");
                pm0.v.X(new zk3.l(this, field_id, multiTaskInfo.field_type, multiTaskInfo));
                return;
            }
            return;
        }
        if (kotlin.jvm.internal.o.b(bVar, o75.b.f343583d)) {
            pm0.v.X(new zk3.a0(multiTaskInfo, this));
            return;
        }
        if (kotlin.jvm.internal.o.b(bVar, lk3.c.f319013g)) {
            this.f473451f = false;
            ((com.tencent.mm.plugin.multitask.i1) i95.n0.c(com.tencent.mm.plugin.multitask.i1.class)).Zi(new zk3.c0(this));
        } else {
            if (!kotlin.jvm.internal.o.b(bVar, o75.b.f343585f) || (hashMap = event.f343591e) == null) {
                return;
            }
            java.util.Iterator it = hashMap.entrySet().iterator();
            while (it.hasNext()) {
                p9((o75.c) ((java.util.Map.Entry) it.next()).getValue());
            }
        }
    }
}
