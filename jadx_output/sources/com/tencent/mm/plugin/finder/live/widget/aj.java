package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class aj extends com.tencent.mm.plugin.finder.live.widget.n8 implements android.view.View.OnClickListener {
    public final android.widget.TextView A;
    public final com.tencent.mm.plugin.finder.view.FinderLiveVisitorFansTaskView B;
    public final com.tencent.mm.plugin.finder.view.FinderLiveVisitorFansRightView C;
    public final bm2.w2 D;
    public final android.view.View E;
    public final android.widget.TextView F;
    public final android.view.View G;
    public final jz5.g H;
    public final com.tencent.mm.plugin.finder.live.view.FinderLiveWrapContentViewPager I;

    /* renamed from: J, reason: collision with root package name */
    public final com.google.android.material.tabs.TabLayout f117768J;
    public final jz5.g K;

    /* renamed from: h, reason: collision with root package name */
    public yz5.a f117769h;

    /* renamed from: i, reason: collision with root package name */
    public yz5.a f117770i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.y1 f117771m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f117772n;

    /* renamed from: o, reason: collision with root package name */
    public final int f117773o;

    /* renamed from: p, reason: collision with root package name */
    public final android.view.View f117774p;

    /* renamed from: q, reason: collision with root package name */
    public final android.view.View f117775q;

    /* renamed from: r, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.LiveBottomSheetPanel f117776r;

    /* renamed from: s, reason: collision with root package name */
    public final android.view.View f117777s;

    /* renamed from: t, reason: collision with root package name */
    public final android.view.View f117778t;

    /* renamed from: u, reason: collision with root package name */
    public final android.widget.TextView f117779u;

    /* renamed from: v, reason: collision with root package name */
    public final android.widget.ImageView f117780v;

    /* renamed from: w, reason: collision with root package name */
    public final androidx.core.widget.NestedScrollView f117781w;

    /* renamed from: x, reason: collision with root package name */
    public final android.widget.ProgressBar f117782x;

    /* renamed from: y, reason: collision with root package name */
    public final android.widget.TextView f117783y;

    /* renamed from: z, reason: collision with root package name */
    public final android.widget.TextView f117784z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aj(android.content.Context context) {
        super(context);
        float height;
        kotlin.jvm.internal.o.g(context, "context");
        boolean z17 = context.getResources().getConfiguration().orientation == 2;
        this.f117772n = z17;
        if (z17) {
            float height2 = getHEIGHT();
            float width = getWIDTH();
            height = (height2 > width ? width : height2) - com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479704cz);
        } else {
            height = getHEIGHT() * (ae2.in.f3688a.h0() / 100.0f);
        }
        this.f117773o = (int) height;
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.aqp, (android.view.ViewGroup) this, true);
        kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        this.f117774p = inflate;
        android.view.View findViewById = inflate.findViewById(com.tencent.mm.R.id.f484301dr5);
        this.f117775q = findViewById;
        com.tencent.mm.ui.widget.LiveBottomSheetPanel liveBottomSheetPanel = (com.tencent.mm.ui.widget.LiveBottomSheetPanel) inflate.findViewById(com.tencent.mm.R.id.dr6);
        this.f117776r = liveBottomSheetPanel;
        android.view.View findViewById2 = liveBottomSheetPanel.findViewById(com.tencent.mm.R.id.dr9);
        this.f117777s = findViewById2;
        android.view.View findViewById3 = liveBottomSheetPanel.findViewById(com.tencent.mm.R.id.f484298dr2);
        this.f117778t = findViewById3;
        this.f117779u = (android.widget.TextView) liveBottomSheetPanel.findViewById(com.tencent.mm.R.id.f484300dr4);
        this.f117780v = (android.widget.ImageView) liveBottomSheetPanel.findViewById(com.tencent.mm.R.id.f484299dr3);
        android.widget.ImageView imageView = (android.widget.ImageView) liveBottomSheetPanel.findViewById(com.tencent.mm.R.id.dr7);
        this.f117781w = (androidx.core.widget.NestedScrollView) liveBottomSheetPanel.findViewById(com.tencent.mm.R.id.dra);
        this.f117782x = (android.widget.ProgressBar) liveBottomSheetPanel.findViewById(com.tencent.mm.R.id.dr_);
        this.f117783y = (android.widget.TextView) liveBottomSheetPanel.findViewById(com.tencent.mm.R.id.dsk);
        this.f117784z = (android.widget.TextView) liveBottomSheetPanel.findViewById(com.tencent.mm.R.id.drp);
        this.A = (android.widget.TextView) liveBottomSheetPanel.findViewById(com.tencent.mm.R.id.dsp);
        this.B = new com.tencent.mm.plugin.finder.view.FinderLiveVisitorFansTaskView(context);
        this.C = new com.tencent.mm.plugin.finder.view.FinderLiveVisitorFansRightView(context);
        bm2.w2 w2Var = new bm2.w2();
        this.D = w2Var;
        android.view.View findViewById4 = inflate.findViewById(com.tencent.mm.R.id.qle);
        this.E = findViewById4;
        this.F = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.qpz);
        android.view.View findViewById5 = inflate.findViewById(com.tencent.mm.R.id.qqc);
        this.G = findViewById5;
        this.H = jz5.h.b(com.tencent.mm.plugin.finder.live.widget.vi.f120069d);
        com.tencent.mm.plugin.finder.live.view.FinderLiveWrapContentViewPager finderLiveWrapContentViewPager = (com.tencent.mm.plugin.finder.live.view.FinderLiveWrapContentViewPager) liveBottomSheetPanel.findViewById(com.tencent.mm.R.id.ecx);
        finderLiveWrapContentViewPager.setAdapter(w2Var);
        finderLiveWrapContentViewPager.addOnPageChangeListener(new com.tencent.mm.plugin.finder.live.widget.zi(finderLiveWrapContentViewPager));
        this.I = finderLiveWrapContentViewPager;
        this.f117768J = (com.google.android.material.tabs.TabLayout) liveBottomSheetPanel.findViewById(com.tencent.mm.R.id.f484468ed0);
        this.K = jz5.h.b(com.tencent.mm.plugin.finder.live.widget.ui.f119974d);
        findViewById.setOnClickListener(this);
        findViewById2.setOnClickListener(this);
        findViewById3.setOnClickListener(this);
        imageView.setOnClickListener(this);
        findViewById5.setOnClickListener(this);
        findViewById4.setOnClickListener(this);
        com.tencent.mars.xlog.Log.i("FinderLiveFansTaskWidget", "init isLand:" + z17);
    }

    private final com.tencent.mm.sdk.platformtools.o4 getMmkv() {
        return (com.tencent.mm.sdk.platformtools.o4) ((jz5.n) this.K).getValue();
    }

    private final com.tencent.mm.sdk.platformtools.o4 getNotifyMmkv() {
        return (com.tencent.mm.sdk.platformtools.o4) ((jz5.n) this.H).getValue();
    }

    private final void setTitle(gk2.e eVar) {
        java.lang.String str;
        ya2.g gVar = ya2.h.f460484a;
        if (eVar == null || (str = ((mm2.c1) eVar.a(mm2.c1.class)).f328852o) == null) {
            str = "";
        }
        ya2.b2 b17 = gVar.b(str);
        mn2.g1 g1Var = mn2.g1.f329975a;
        vo0.d a17 = g1Var.a();
        mn2.n nVar = new mn2.n(b17 != null ? b17.getAvatarUrl() : "", null, 2, null);
        android.widget.ImageView titleIcon = this.f117780v;
        kotlin.jvm.internal.o.f(titleIcon, "titleIcon");
        a17.c(nVar, titleIcon, g1Var.h(mn2.f1.f329957h));
        this.f117779u.setText("");
        android.view.ViewParent parent = this.f117779u.getParent();
        kotlin.jvm.internal.o.e(parent, "null cannot be cast to non-null type android.view.ViewGroup");
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) parent;
        int measuredWidth = viewGroup.getMeasuredWidth();
        int childCount = viewGroup.getChildCount();
        int i17 = 0;
        for (int i18 = 0; i18 < childCount; i18++) {
            android.view.View childAt = viewGroup.getChildAt(i18);
            if (!kotlin.jvm.internal.o.b(childAt, this.f117779u)) {
                int measuredWidth2 = i17 + childAt.getMeasuredWidth();
                android.view.ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) layoutParams;
                i17 = measuredWidth2 + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
            }
        }
        int i19 = measuredWidth - i17;
        if (i19 > 0) {
            this.f117779u.setMaxWidth(i19);
        } else {
            this.f117779u.setMaxWidth((int) (com.tencent.mm.ui.bl.b(com.tencent.mm.sdk.platformtools.x2.f193071a).x - com.tencent.mm.sdk.platformtools.x2.f193075e.getDimensionPixelOffset(com.tencent.mm.R.dimen.f479669c6)));
        }
        com.tencent.mars.xlog.Log.i("FinderLiveFansTaskWidget", "setTitle parentWidth:" + measuredWidth + ",sibleWidth:" + i17 + ",titleTvMaxWidth:" + i19 + ",set maxWidth:" + this.f117779u.getMaxWidth());
        android.widget.TextView textView = this.f117779u;
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        android.content.Context context = this.f117774p.getContext();
        android.content.Context context2 = this.f117774p.getContext();
        java.lang.Object[] objArr = new java.lang.Object[1];
        objArr[0] = b17 != null ? b17.w0() : "";
        java.lang.String string = context2.getString(com.tencent.mm.R.string.ddp, objArr);
        float textSize = this.f117779u.getTextSize();
        ((ke0.e) xVar).getClass();
        textView.setText(com.tencent.mm.pluginsdk.ui.span.c0.j(context, string, textSize));
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.n8
    public void a(com.tencent.mm.plugin.finder.live.plugin.l basePlugin) {
        kotlin.jvm.internal.o.g(basePlugin, "basePlugin");
        super.a(basePlugin);
        com.tencent.mm.ui.widget.LiveBottomSheetPanel liveBottomSheetPanel = this.f117776r;
        liveBottomSheetPanel.getLayoutParams().height = this.f117773o;
        liveBottomSheetPanel.setOnVisibilityListener(new com.tencent.mm.plugin.finder.live.widget.ti(this));
    }

    public final void b() {
        com.tencent.mm.ui.widget.dialog.y1 y1Var = this.f117771m;
        if (y1Var != null) {
            y1Var.q();
        }
        this.f117771m = null;
        this.f117776r.setTranslationY(0.0f);
    }

    public final void c(boolean z17) {
        java.lang.String str;
        gk2.e S0;
        r45.nw1 nw1Var;
        com.tencent.mm.plugin.finder.live.plugin.l basePlugin = getBasePlugin();
        setTitle(basePlugin != null ? basePlugin.S0() : null);
        this.f117781w.setVisibility(8);
        this.f117782x.setVisibility(0);
        com.tencent.mm.plugin.finder.live.plugin.l basePlugin2 = getBasePlugin();
        long j17 = (basePlugin2 == null || (nw1Var = ((mm2.e1) basePlugin2.P0(mm2.e1.class)).f328988r) == null) ? 0L : nw1Var.getLong(0);
        com.tencent.mm.plugin.finder.live.plugin.l basePlugin3 = getBasePlugin();
        long j18 = basePlugin3 != null ? ((mm2.e1) basePlugin3.P0(mm2.e1.class)).f328983m : 0L;
        com.tencent.mm.plugin.finder.live.plugin.l basePlugin4 = getBasePlugin();
        com.tencent.mm.protobuf.g b17 = com.tencent.mm.protobuf.g.b(basePlugin4 != null ? ((mm2.e1) basePlugin4.P0(mm2.e1.class)).f328985o : null);
        com.tencent.mm.plugin.finder.live.plugin.l basePlugin5 = getBasePlugin();
        if (basePlugin5 == null || (S0 = basePlugin5.S0()) == null || (str = ((mm2.c1) S0.a(mm2.c1.class)).f328852o) == null) {
            str = "";
        }
        java.lang.String str2 = str;
        android.content.Context context = getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        pq5.g h17 = new ke2.p(str2, b17, j17, j18, xy2.c.e(context), null).l().h(new com.tencent.mm.plugin.finder.live.widget.si(this, z17));
        if (getContext() != null && (getContext() instanceof com.tencent.mm.ui.MMActivity)) {
            android.content.Context context2 = getContext();
            kotlin.jvm.internal.o.e(context2, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            h17.f((com.tencent.mm.ui.MMActivity) context2);
        }
        android.view.View view = this.f117774p;
        com.tencent.mm.ui.widget.dialog.y1 y1Var = new com.tencent.mm.ui.widget.dialog.y1(view.getContext());
        this.f117776r.setShowing(true);
        zl2.r4.f473950a.Q2(view);
        if (this.f117772n) {
            this.f117775q.getLayoutParams().height = 0;
        }
        y1Var.l(view, new android.widget.FrameLayout.LayoutParams(-1, -1));
        y1Var.a();
        y1Var.s();
        this.f117771m = y1Var;
    }

    public final com.tencent.mm.ui.widget.dialog.y1 getBottomSheet() {
        return this.f117771m;
    }

    public final yz5.a getFansGroupClickListener() {
        return this.f117770i;
    }

    public final yz5.a getHelpIconClickListener() {
        return this.f117769h;
    }

    public final boolean getWasNotifySettingGuideShown() {
        return getMmkv().getBoolean("wasNotifySettingGuideShown", false);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        com.tencent.mm.plugin.finder.live.plugin.l basePlugin;
        gk2.e S0;
        yg2.b bVar;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/FinderLiveFansTaskWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.Integer valueOf = view != null ? java.lang.Integer.valueOf(view.getId()) : null;
        boolean z17 = false;
        if ((valueOf != null && valueOf.intValue() == com.tencent.mm.R.id.f484301dr5) || (valueOf != null && valueOf.intValue() == com.tencent.mm.R.id.dr9)) {
            b();
        } else if (valueOf != null && valueOf.intValue() == com.tencent.mm.R.id.f484298dr2) {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            if (currentTimeMillis - qd2.h.f361767a < 500) {
                com.tencent.mars.xlog.Log.i("FinderFastClickHandler", "[isFastClick] true, currentClickTime:" + currentTimeMillis + ", lastClickTime:" + qd2.h.f361767a);
                z17 = true;
            }
            qd2.h.f361767a = currentTimeMillis;
            if (z17) {
                com.tencent.mars.xlog.Log.i("FinderLiveFansTaskWidget", "fast click fans_group!");
                yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveFansTaskWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            i95.m c17 = i95.n0.c(ml2.r0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            ml2.r0.Lj((ml2.r0) c17, ml2.j4.f327622r, null, null, 6, null);
            yz5.a aVar = this.f117770i;
            if (aVar != null) {
                aVar.invoke();
            }
        } else if (valueOf != null && valueOf.intValue() == com.tencent.mm.R.id.dr7) {
            yz5.a aVar2 = this.f117769h;
            if (aVar2 != null) {
                aVar2.invoke();
            }
        } else if (valueOf != null && valueOf.intValue() == com.tencent.mm.R.id.qle && (basePlugin = getBasePlugin()) != null && (S0 = basePlugin.S0()) != null && (bVar = S0.f272475i) != null) {
            kotlinx.coroutines.l.d(bVar, null, null, new com.tencent.mm.plugin.finder.live.widget.wi(this, null), 3, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveFansTaskWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    public final void setBottomSheet(com.tencent.mm.ui.widget.dialog.y1 y1Var) {
        this.f117771m = y1Var;
    }

    public final void setFansGroupClickListener(yz5.a aVar) {
        this.f117770i = aVar;
    }

    public final void setHelpIconClickListener(yz5.a aVar) {
        this.f117769h = aVar;
    }

    public final void setWasNotifySettingGuideShown(boolean z17) {
        getMmkv().putBoolean("wasNotifySettingGuideShown", z17);
    }
}
