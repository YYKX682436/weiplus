package xx2;

/* loaded from: classes3.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f457979a;

    /* renamed from: b, reason: collision with root package name */
    public final android.content.Context f457980b;

    /* renamed from: c, reason: collision with root package name */
    public final androidx.constraintlayout.widget.ConstraintLayout f457981c;

    /* renamed from: d, reason: collision with root package name */
    public final androidx.constraintlayout.widget.ConstraintLayout f457982d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.view.sidebar.DraggableConstraintLayout f457983e;

    /* renamed from: f, reason: collision with root package name */
    public final androidx.constraintlayout.widget.ConstraintLayout f457984f;

    /* renamed from: g, reason: collision with root package name */
    public final xx2.d f457985g;

    /* renamed from: h, reason: collision with root package name */
    public final android.view.ViewGroup f457986h;

    /* renamed from: i, reason: collision with root package name */
    public int f457987i;

    /* renamed from: j, reason: collision with root package name */
    public int f457988j;

    /* renamed from: k, reason: collision with root package name */
    public int f457989k;

    /* renamed from: l, reason: collision with root package name */
    public int f457990l;

    /* renamed from: m, reason: collision with root package name */
    public int f457991m;

    /* renamed from: n, reason: collision with root package name */
    public float f457992n;

    public l(xx2.d config, android.view.ViewGroup parent, int i17, int i18) {
        kotlin.jvm.internal.o.g(config, "config");
        kotlin.jvm.internal.o.g(parent, "parent");
        this.f457979a = "Finder.FinderSideBar";
        int i19 = com.tencent.mm.plugin.finder.view.sidebar.DraggableConstraintLayout.L;
        this.f457987i = 0;
        this.f457985g = config;
        this.f457986h = parent;
        android.content.Context context = parent.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        this.f457980b = context;
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(i17, parent, false);
        kotlin.jvm.internal.o.e(inflate, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
        androidx.constraintlayout.widget.ConstraintLayout constraintLayout = (androidx.constraintlayout.widget.ConstraintLayout) inflate;
        if (i18 >= 0) {
            parent.addView(constraintLayout, i18, new android.view.ViewGroup.LayoutParams(-1, -1));
        } else {
            parent.addView(constraintLayout, new android.view.ViewGroup.LayoutParams(-1, -1));
        }
        android.view.View findViewById = constraintLayout.findViewById(com.tencent.mm.R.id.mwc);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        androidx.constraintlayout.widget.ConstraintLayout constraintLayout2 = (androidx.constraintlayout.widget.ConstraintLayout) findViewById;
        this.f457981c = constraintLayout2;
        android.view.View findViewById2 = constraintLayout.findViewById(com.tencent.mm.R.id.mwb);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f457982d = (androidx.constraintlayout.widget.ConstraintLayout) findViewById2;
        android.view.View findViewById3 = constraintLayout.findViewById(com.tencent.mm.R.id.mw9);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        com.tencent.mm.plugin.finder.view.sidebar.DraggableConstraintLayout draggableConstraintLayout = (com.tencent.mm.plugin.finder.view.sidebar.DraggableConstraintLayout) findViewById3;
        this.f457983e = draggableConstraintLayout;
        android.view.View findViewById4 = constraintLayout.findViewById(com.tencent.mm.R.id.mw_);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        androidx.constraintlayout.widget.ConstraintLayout constraintLayout3 = (androidx.constraintlayout.widget.ConstraintLayout) findViewById4;
        this.f457984f = constraintLayout3;
        constraintLayout3.setLayoutParams(new androidx.constraintlayout.widget.ConstraintLayout.LayoutParams((int) ((com.tencent.mm.ui.bh.a(context).f197135a * 0.2f) + i65.a.b(context, 24)), 0));
        pl2.l lVar = (pl2.l) config;
        android.view.ViewGroup.LayoutParams layoutParams = constraintLayout2.getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ((android.view.ViewGroup.MarginLayoutParams) ((androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) layoutParams)).height = i65.a.b(constraintLayout2.getContext(), 64) + com.tencent.mm.ui.bl.h(constraintLayout2.getContext());
        lVar.f356632b = (android.widget.TextView) constraintLayout2.findViewById(com.tencent.mm.R.id.i8g);
        lVar.f356634d = (android.widget.ImageView) constraintLayout2.findViewById(com.tencent.mm.R.id.ihk);
        android.widget.TextView textView = (android.widget.TextView) constraintLayout2.findViewById(com.tencent.mm.R.id.f483982t15);
        lVar.f356633c = textView;
        pl2.s sVar = lVar.f356640j;
        if (textView != null) {
            textView.setOnClickListener(new pl2.c(sVar));
        }
        android.widget.TextView textView2 = lVar.f356632b;
        if (textView2 != null) {
            textView2.setAlpha(0.0f);
        }
        android.view.ViewParent parent2 = sVar.f356646a.getParent();
        kotlin.jvm.internal.o.e(parent2, "null cannot be cast to non-null type android.view.ViewGroup");
        android.view.View view = sVar.f356646a;
        ((android.view.ViewGroup) parent2).removeView(view);
        draggableConstraintLayout.addView(view, 0, new androidx.constraintlayout.widget.ConstraintLayout.LayoutParams(-1, -1));
        lVar.f356639i = draggableConstraintLayout;
        android.view.View findViewById5 = draggableConstraintLayout.findViewById(com.tencent.mm.R.id.f485645ih1);
        lVar.f356637g = findViewById5;
        if (findViewById5 != null) {
            findViewById5.setOnClickListener(new pl2.b(sVar));
        }
        lVar.f356635e = constraintLayout3.findViewById(com.tencent.mm.R.id.f486926mw5);
        lVar.f356636f = constraintLayout3.findViewById(com.tencent.mm.R.id.f486925mw4);
        android.view.View view2 = lVar.f356635e;
        if (view2 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/sidebar/FinderLiveSideBar$FinderLiveSideBarConfig", "hideSideBarMask", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/sidebar/FinderLiveSideBar$FinderLiveSideBarConfig", "hideSideBarMask", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View view3 = lVar.f356636f;
        if (view3 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/sidebar/FinderLiveSideBar$FinderLiveSideBarConfig", "hideSideBarMask", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/finder/live/sidebar/FinderLiveSideBar$FinderLiveSideBarConfig", "hideSideBarMask", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View findViewById6 = constraintLayout3.findViewById(com.tencent.mm.R.id.uar);
        com.tencent.mm.view.refreshLayout.WxRefreshLayout wxRefreshLayout = (com.tencent.mm.view.refreshLayout.WxRefreshLayout) findViewById6;
        wxRefreshLayout.D(new com.tencent.mm.plugin.finder.view.FinderLiveSpinnerListFooter(wxRefreshLayout.getContext(), null));
        wxRefreshLayout.setOnSimpleAction(new pl2.d(sVar));
        kotlin.jvm.internal.o.f(findViewById6, "apply(...)");
        com.tencent.mm.view.refreshLayout.WxRefreshLayout wxRefreshLayout2 = (com.tencent.mm.view.refreshLayout.WxRefreshLayout) findViewById6;
        sVar.f356653h = wxRefreshLayout2;
        android.view.View findViewById7 = wxRefreshLayout2.findViewById(com.tencent.mm.R.id.i_n);
        kotlin.jvm.internal.o.f(findViewById7, "findViewById(...)");
        sVar.f356654i = (com.tencent.mm.view.recyclerview.WxRecyclerView) findViewById7;
        com.tencent.mm.view.recyclerview.WxRecyclerView c17 = sVar.c();
        android.content.Context context2 = constraintLayout3.getContext();
        kotlin.jvm.internal.o.f(context2, "getContext(...)");
        c17.setLayoutManager(new com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager(context2));
        com.tencent.mm.view.recyclerview.WxRecyclerView c18 = sVar.c();
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = new com.tencent.mm.view.recyclerview.WxRecyclerAdapter(new in5.s() { // from class: com.tencent.mm.plugin.finder.live.sidebar.FinderLiveSideBar$FinderLiveSideBarConfig$buildSideBar$2
            @Override // in5.s
            public in5.r getItemConvert(int type) {
                if (type == pl2.a.class.hashCode()) {
                    return new pl2.y();
                }
                kotlin.jvm.internal.o.d(null);
                throw new jz5.d();
            }
        }, sVar.f356656k, true);
        wxRecyclerAdapter.f293105o = new pl2.e(sVar);
        wxRecyclerAdapter.F = new pl2.g(lVar, sVar);
        wxRecyclerAdapter.setHasStableIds(true);
        c18.setAdapter(wxRecyclerAdapter);
        sVar.c().N(new pl2.h(sVar));
        ym5.a1.g(sVar.c(), new pl2.i(sVar));
        if (!(((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.f3767h8).getValue()).r()).intValue() == 1)) {
            draggableConstraintLayout.setDragListener(new xx2.b(this));
        }
        parent.post(new xx2.c(this));
    }

    public static final void a(xx2.l lVar) {
        int i17;
        com.tencent.mm.plugin.finder.view.sidebar.DraggableConstraintLayout draggableConstraintLayout = lVar.f457983e;
        float abs = java.lang.Math.abs((draggableConstraintLayout.getWidth() * draggableConstraintLayout.getScaleX()) - lVar.f457989k);
        float abs2 = java.lang.Math.abs(((draggableConstraintLayout.getWidth() * draggableConstraintLayout.getScaleX()) - lVar.f457989k) - lVar.f457988j);
        com.tencent.mars.xlog.Log.i(lVar.f457979a, "determineDragMode distanceFromTarget:" + abs + ", " + abs2 + ", bodyRoot.width:" + (draggableConstraintLayout.getWidth() * draggableConstraintLayout.getScaleX()) + ", targetBodyWidth:" + lVar.f457989k + ", totalDistance:" + lVar.f457988j);
        if (abs > abs2) {
            int i18 = com.tencent.mm.plugin.finder.view.sidebar.DraggableConstraintLayout.L;
            i17 = 1;
        } else {
            int i19 = com.tencent.mm.plugin.finder.view.sidebar.DraggableConstraintLayout.L;
            i17 = 2;
        }
        lVar.f457987i = i17;
        boolean z17 = i17 == 1;
        int i27 = lVar.f457988j;
        draggableConstraintLayout.D(z17, i27 / 2, i27);
    }

    public final void b(float f17) {
        com.tencent.mm.plugin.finder.live.view.FinderLiveVisitorPluginLayout finderLiveVisitorPluginLayout;
        um2.x5 startUIC;
        com.tencent.mars.xlog.Log.i(this.f457979a, "dragging percent:" + f17);
        if (f17 == this.f457992n) {
            return;
        }
        int i17 = this.f457987i;
        int i18 = com.tencent.mm.plugin.finder.view.sidebar.DraggableConstraintLayout.L;
        float f18 = i17 == 1 ? f17 : 1.0f - f17;
        int i19 = (int) ((this.f457988j * (1.0f - f18)) + this.f457989k);
        int i27 = (int) (this.f457990l * f18);
        com.tencent.mm.plugin.finder.view.sidebar.DraggableConstraintLayout draggableConstraintLayout = this.f457983e;
        if (draggableConstraintLayout.getWidth() == 0) {
            draggableConstraintLayout.setTranslationY(0.0f);
            draggableConstraintLayout.setScaleX(1.0f);
            draggableConstraintLayout.setScaleY(1.0f);
        } else {
            draggableConstraintLayout.setPivotX(0.0f);
            draggableConstraintLayout.setPivotY(0.0f);
            draggableConstraintLayout.setTranslationY(i27);
            float f19 = i19;
            float width = f19 / draggableConstraintLayout.getWidth();
            draggableConstraintLayout.setScaleX(width);
            draggableConstraintLayout.setScaleY(width);
            this.f457984f.setTranslationX(f19);
            this.f457981c.setTranslationY((-r3.getBottom()) * (1 - f18));
        }
        pl2.l lVar = (pl2.l) this.f457985g;
        android.widget.TextView textView = lVar.f356632b;
        if (textView != null) {
            textView.setAlpha(f18);
        }
        android.view.View view = lVar.f356639i;
        android.view.ViewGroup.LayoutParams layoutParams = view != null ? view.getLayoutParams() : null;
        androidx.constraintlayout.widget.ConstraintLayout.LayoutParams layoutParams2 = layoutParams instanceof androidx.constraintlayout.widget.ConstraintLayout.LayoutParams ? (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) layoutParams : null;
        android.view.View view2 = lVar.f356639i;
        java.lang.Object parent = view2 != null ? view2.getParent() : null;
        android.view.View view3 = parent instanceof android.view.View ? (android.view.View) parent : null;
        java.lang.Integer valueOf = view3 != null ? java.lang.Integer.valueOf(view3.getHeight()) : null;
        int i28 = layoutParams2 != null ? ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).width : 0;
        int intValue = (valueOf == null || layoutParams2 == null) ? 0 : (valueOf.intValue() - ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).topMargin) - ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin;
        pl2.m mVar = lVar.f356640j.f356651f;
        if (mVar != null) {
            vd2.l4 l4Var = (vd2.l4) mVar;
            com.tencent.mars.xlog.Log.i("Finder.FinderLiveViewCallback", "sidebar onDragProgress percent:" + f18 + ", width:" + i28 + ", height:" + intValue);
            com.tencent.mm.plugin.finder.live.FinderLiveViewCallback finderLiveViewCallback = l4Var.f435804c;
            if (i28 > 0 && intValue > 0 && (finderLiveVisitorPluginLayout = finderLiveViewCallback.f111495t.f436054e) != null && (startUIC = finderLiveVisitorPluginLayout.getStartUIC()) != null) {
                um2.x5.p(startUIC, new jz5.l(java.lang.Integer.valueOf(i28), java.lang.Integer.valueOf(intValue)), false, 2, null);
            }
            com.tencent.mm.plugin.finder.live.view.FinderLiveVisitorPluginLayout finderLiveVisitorPluginLayout2 = finderLiveViewCallback.f111495t.f436054e;
            android.view.View findViewById = finderLiveVisitorPluginLayout2 != null ? finderLiveVisitorPluginLayout2.findViewById(com.tencent.mm.R.id.fqc) : null;
            float f27 = l4Var.f435803b;
            float f28 = l4Var.f435802a;
            int i29 = (int) (((f27 - f28) * f18) + f28);
            android.view.ViewGroup.LayoutParams layoutParams3 = findViewById != null ? findViewById.getLayoutParams() : null;
            if (layoutParams3 instanceof android.widget.RelativeLayout.LayoutParams) {
                android.view.ViewGroup.LayoutParams layoutParams4 = findViewById != null ? findViewById.getLayoutParams() : null;
                android.widget.RelativeLayout.LayoutParams layoutParams5 = layoutParams4 instanceof android.widget.RelativeLayout.LayoutParams ? (android.widget.RelativeLayout.LayoutParams) layoutParams4 : null;
                if (layoutParams5 != null) {
                    layoutParams5.topMargin = i29;
                }
            } else if (layoutParams3 instanceof androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) {
                java.lang.Object layoutParams6 = findViewById != null ? findViewById.getLayoutParams() : null;
                androidx.constraintlayout.widget.ConstraintLayout.LayoutParams layoutParams7 = layoutParams6 instanceof androidx.constraintlayout.widget.ConstraintLayout.LayoutParams ? (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) layoutParams6 : null;
                if (layoutParams7 != null) {
                    layoutParams7.f10910u = i29;
                }
                if (findViewById != null) {
                    findViewById.requestLayout();
                }
            }
            androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = finderLiveViewCallback.f111492q.getLayoutManager();
            kotlin.jvm.internal.o.e(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
            androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = (androidx.recyclerview.widget.LinearLayoutManager) layoutManager;
            int i37 = finderLiveViewCallback.f111495t.f436055f;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            arrayList.add(java.lang.Integer.valueOf(i37));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(linearLayoutManager, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/FinderLiveViewCallback$initView$3", "onDragProgress", "(FII)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
            linearLayoutManager.P(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue());
            yj0.a.f(linearLayoutManager, "com/tencent/mm/plugin/finder/live/FinderLiveViewCallback$initView$3", "onDragProgress", "(FII)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
        }
        this.f457992n = f17;
    }

    public final void c(boolean z17) {
        int i17;
        com.tencent.mars.xlog.Log.i(this.f457979a, "innerEnableDrag showing:" + z17);
        if (z17) {
            int i18 = com.tencent.mm.plugin.finder.view.sidebar.DraggableConstraintLayout.L;
            i17 = 2;
        } else {
            int i19 = com.tencent.mm.plugin.finder.view.sidebar.DraggableConstraintLayout.L;
            i17 = 1;
        }
        this.f457987i = i17;
        int i27 = this.f457988j;
        this.f457983e.D(!z17, i27 / 2, i27);
    }

    public final void d(android.view.View view, float f17, float f18, long j17, yz5.a aVar) {
        xx2.k kVar = new xx2.k(this, f17, f18);
        kVar.setDuration(((float) j17) * java.lang.Math.abs(f18 - f17));
        kVar.setAnimationListener(new xx2.j(aVar));
        kVar.setInterpolator(new android.view.animation.LinearInterpolator());
        view.startAnimation(kVar);
    }
}
