package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class bh extends com.tencent.mm.plugin.finder.live.widget.n8 implements android.view.View.OnClickListener {
    public static final /* synthetic */ int U = 0;
    public final androidx.recyclerview.widget.RecyclerView A;
    public final android.view.View B;
    public final android.view.View C;
    public final android.view.View D;
    public final android.view.View E;
    public final android.view.View F;
    public final android.widget.TextView G;
    public final android.widget.TextView H;
    public final android.view.View I;

    /* renamed from: J, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.RoundCornerRelativeLayout f117879J;
    public int K;
    public int L;
    public com.tencent.mm.plugin.finder.live.widget.ei M;
    public com.tencent.mm.plugin.finder.live.widget.ri N;
    public kotlinx.coroutines.r2 P;
    public final bm2.v2 Q;
    public r45.js1 R;
    public boolean S;
    public boolean T;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.y1 f117880h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.y1 f117881i;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f117882m;

    /* renamed from: n, reason: collision with root package name */
    public final int f117883n;

    /* renamed from: o, reason: collision with root package name */
    public final android.view.View f117884o;

    /* renamed from: p, reason: collision with root package name */
    public final android.view.View f117885p;

    /* renamed from: q, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.LiveBottomSheetPanel f117886q;

    /* renamed from: r, reason: collision with root package name */
    public final android.view.View f117887r;

    /* renamed from: s, reason: collision with root package name */
    public final android.view.View f117888s;

    /* renamed from: t, reason: collision with root package name */
    public final android.view.View f117889t;

    /* renamed from: u, reason: collision with root package name */
    public final android.widget.TextView f117890u;

    /* renamed from: v, reason: collision with root package name */
    public final android.view.View f117891v;

    /* renamed from: w, reason: collision with root package name */
    public final android.widget.TextView f117892w;

    /* renamed from: x, reason: collision with root package name */
    public final android.widget.TextView f117893x;

    /* renamed from: y, reason: collision with root package name */
    public final android.widget.TextView f117894y;

    /* renamed from: z, reason: collision with root package name */
    public final android.widget.TextView f117895z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bh(android.content.Context context) {
        super(context);
        float height;
        kotlin.jvm.internal.o.g(context, "context");
        this.f117882m = jz5.h.b(new com.tencent.mm.plugin.finder.live.widget.qg(this));
        boolean z17 = context.getResources().getConfiguration().orientation == 2;
        if (z17) {
            float height2 = getHEIGHT();
            float width = getWIDTH();
            height = (height2 > width ? width : height2) - com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479704cz);
        } else {
            height = getHEIGHT() * (ae2.in.f3688a.h0() / 100.0f);
        }
        int i17 = (int) height;
        this.f117883n = i17;
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.aqh, (android.view.ViewGroup) this, true);
        kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        this.f117884o = inflate;
        android.view.View findViewById = inflate.findViewById(com.tencent.mm.R.id.drq);
        this.f117885p = findViewById;
        com.tencent.mm.ui.widget.LiveBottomSheetPanel liveBottomSheetPanel = (com.tencent.mm.ui.widget.LiveBottomSheetPanel) inflate.findViewById(com.tencent.mm.R.id.drr);
        this.f117886q = liveBottomSheetPanel;
        this.f117887r = liveBottomSheetPanel.findViewById(com.tencent.mm.R.id.f484302ds0);
        this.f117888s = liveBottomSheetPanel.findViewById(com.tencent.mm.R.id.drv);
        android.view.View findViewById2 = liveBottomSheetPanel.findViewById(com.tencent.mm.R.id.dru);
        this.f117889t = findViewById2;
        this.f117890u = (android.widget.TextView) liveBottomSheetPanel.findViewById(com.tencent.mm.R.id.f484303ds1);
        this.f117891v = liveBottomSheetPanel.findViewById(com.tencent.mm.R.id.qix);
        this.f117892w = (android.widget.TextView) liveBottomSheetPanel.findViewById(com.tencent.mm.R.id.qpx);
        android.widget.TextView textView = (android.widget.TextView) liveBottomSheetPanel.findViewById(com.tencent.mm.R.id.drx);
        this.f117893x = textView;
        this.f117894y = (android.widget.TextView) liveBottomSheetPanel.findViewById(com.tencent.mm.R.id.dry);
        this.f117895z = (android.widget.TextView) liveBottomSheetPanel.findViewById(com.tencent.mm.R.id.drt);
        androidx.recyclerview.widget.RecyclerView recyclerView = (androidx.recyclerview.widget.RecyclerView) liveBottomSheetPanel.findViewById(com.tencent.mm.R.id.drs);
        this.A = recyclerView;
        android.view.View findViewById3 = liveBottomSheetPanel.findViewById(com.tencent.mm.R.id.qie);
        this.B = findViewById3;
        this.C = liveBottomSheetPanel.findViewById(com.tencent.mm.R.id.qre);
        this.D = liveBottomSheetPanel.findViewById(com.tencent.mm.R.id.fcz);
        this.E = liveBottomSheetPanel.findViewById(com.tencent.mm.R.id.f484392qj0);
        this.F = liveBottomSheetPanel.findViewById(com.tencent.mm.R.id.qpl);
        this.G = (android.widget.TextView) liveBottomSheetPanel.findViewById(com.tencent.mm.R.id.f484393qj1);
        this.H = (android.widget.TextView) liveBottomSheetPanel.findViewById(com.tencent.mm.R.id.qpm);
        this.I = liveBottomSheetPanel.findViewById(com.tencent.mm.R.id.qiz);
        com.tencent.mm.ui.widget.RoundCornerRelativeLayout roundCornerRelativeLayout = (com.tencent.mm.ui.widget.RoundCornerRelativeLayout) liveBottomSheetPanel.findViewById(com.tencent.mm.R.id.qpt);
        float a17 = com.tencent.mm.ui.zk.a(context, 12);
        roundCornerRelativeLayout.c(a17, a17, 0.0f, 0.0f);
        this.f117879J = roundCornerRelativeLayout;
        this.K = 1;
        this.L = 1;
        bm2.v2 v2Var = new bm2.v2();
        v2Var.f22379h = com.tencent.mm.plugin.finder.live.widget.lg.f118934d;
        this.Q = v2Var;
        liveBottomSheetPanel.getLayoutParams().height = i17;
        liveBottomSheetPanel.setOnVisibilityListener(new com.tencent.mm.plugin.finder.live.widget.mg(this));
        recyclerView.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(inflate.getContext()));
        recyclerView.setAdapter(v2Var);
        recyclerView.i(new com.tencent.mm.plugin.finder.live.widget.ng(this));
        findViewById.setOnClickListener(this);
        liveBottomSheetPanel.setOnClickListener(this);
        findViewById2.setOnClickListener(this);
        textView.setOnClickListener(this);
        findViewById3.setOnClickListener(this);
        com.tencent.mars.xlog.Log.i("FinderLiveFansListWidget", "init isLand:" + z17 + ", DEFAULT_PANEL_HEIGHT:" + i17);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x009d, code lost:
    
        if (r1 != null) goto L48;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void e(com.tencent.mm.plugin.finder.live.widget.bh r29, r45.js1 r30) {
        /*
            Method dump skipped, instructions count: 1070
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.widget.bh.e(com.tencent.mm.plugin.finder.live.widget.bh, r45.js1):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.String getAllFansCntDesc() {
        android.content.Context context = getContext();
        java.lang.Object[] objArr = new java.lang.Object[1];
        r45.js1 js1Var = this.R;
        objArr[0] = java.lang.String.valueOf(js1Var != null ? js1Var.getInteger(3) : 0);
        java.lang.String string = context.getString(com.tencent.mm.R.string.f491521lu0, objArr);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        return string;
    }

    private final com.tencent.mm.plugin.finder.live.widget.hg getListBottomPage() {
        return (com.tencent.mm.plugin.finder.live.widget.hg) ((jz5.n) this.f117882m).getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.String getSuperFansCntDesc() {
        android.content.Context context = getContext();
        java.lang.Object[] objArr = new java.lang.Object[1];
        r45.js1 js1Var = this.R;
        objArr[0] = java.lang.String.valueOf(js1Var != null ? js1Var.getInteger(7) : 0);
        java.lang.String string = context.getString(com.tencent.mm.R.string.f491530lu3, objArr);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        return string;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setResp(r45.js1 js1Var) {
        com.tencent.mars.xlog.Log.i("FinderLiveFansListWidget", java.lang.String.valueOf(pm0.b0.g(js1Var == null ? "" : js1Var)));
        this.R = js1Var;
    }

    private final void setShowModify(boolean z17) {
        com.tencent.mars.xlog.Log.i("FinderLiveFansListWidget", "showModify:" + z17);
        this.S = z17;
    }

    public final void f() {
        if (this.f117881i == null) {
            com.tencent.mm.ui.widget.dialog.y1 y1Var = this.f117880h;
            if (y1Var != null) {
                y1Var.q();
            }
            this.f117880h = null;
        } else {
            com.tencent.mm.ui.widget.dialog.y1 y1Var2 = getListBottomPage().f211798d;
            if (y1Var2 != null) {
                y1Var2.q();
            }
            this.f117881i = null;
        }
        this.f117886q.setTranslationY(0.0f);
    }

    public final void g(boolean z17, yz5.l lVar) {
        int i17;
        com.tencent.mm.protobuf.g byteString;
        r45.nw1 nw1Var;
        if (zl2.r4.f473950a.w1()) {
            i17 = 1;
        } else {
            mm2.n0 n0Var = (mm2.n0) dk2.ef.f233372a.i(mm2.n0.class);
            i17 = n0Var != null && n0Var.f329273r ? 16 : 2;
        }
        dk2.ef efVar = dk2.ef.f233372a;
        mm2.e1 e1Var = (mm2.e1) efVar.i(mm2.e1.class);
        com.tencent.mm.protobuf.g b17 = com.tencent.mm.protobuf.g.b(e1Var != null ? e1Var.f328985o : null);
        mm2.e1 e1Var2 = (mm2.e1) efVar.i(mm2.e1.class);
        long j17 = (e1Var2 == null || (nw1Var = e1Var2.f328988r) == null) ? 0L : nw1Var.getLong(0);
        mm2.e1 e1Var3 = (mm2.e1) efVar.i(mm2.e1.class);
        long j18 = e1Var3 != null ? e1Var3.f328983m : 0L;
        if (z17) {
            setResp(null);
        } else {
            r45.js1 js1Var = this.R;
            if (js1Var != null) {
                byteString = js1Var.getByteString(1);
                ke2.q qVar = new ke2.q(b17, j17, j18, byteString, i17, null, this.K, this.L);
                android.content.Context context = this.f117884o.getContext();
                kotlin.jvm.internal.o.f(context, "getContext(...)");
                qVar.t(context, this.f117884o.getContext().getResources().getString(com.tencent.mm.R.string.f9y), 1000L);
                qVar.l().K(new com.tencent.mm.plugin.finder.live.widget.rg(lVar));
            }
        }
        byteString = null;
        ke2.q qVar2 = new ke2.q(b17, j17, j18, byteString, i17, null, this.K, this.L);
        android.content.Context context2 = this.f117884o.getContext();
        kotlin.jvm.internal.o.f(context2, "getContext(...)");
        qVar2.t(context2, this.f117884o.getContext().getResources().getString(com.tencent.mm.R.string.f9y), 1000L);
        qVar2.l().K(new com.tencent.mm.plugin.finder.live.widget.rg(lVar));
    }

    public final void h(com.tencent.mm.ui.widget.dialog.y1 y1Var, boolean z17) {
        int i17;
        java.util.List list;
        setShowModify(z17);
        this.f117881i = y1Var;
        kotlinx.coroutines.r2 r2Var = this.P;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        boolean z18 = this.S;
        android.widget.TextView textView = this.f117893x;
        if (z18) {
            textView.setVisibility(0);
            android.view.View view = this.f117888s;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveFansListWidget", "adjustShowModifyView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/widget/FinderLiveFansListWidget", "adjustShowModifyView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view2 = this.f117891v;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveFansListWidget", "adjustShowModifyView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/widget/FinderLiveFansListWidget", "adjustShowModifyView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            textView.setText("");
            dk2.ef efVar = dk2.ef.f233372a;
            mm2.n2 n2Var = (mm2.n2) efVar.i(mm2.n2.class);
            if (n2Var != null && (list = n2Var.f329283n) != null) {
                ((java.util.ArrayList) list).clear();
            }
            mm2.n2 n2Var2 = (mm2.n2) efVar.i(mm2.n2.class);
            if (n2Var2 != null) {
                n2Var2.f329284o = null;
            }
            this.P = kotlinx.coroutines.l.d(getScope(), null, null, new com.tencent.mm.plugin.finder.live.widget.kg(this, null), 3, null);
        } else {
            textView.setVisibility(8);
            android.view.View view3 = this.f117888s;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveFansListWidget", "adjustShowModifyView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/finder/live/widget/FinderLiveFansListWidget", "adjustShowModifyView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view4 = this.f117891v;
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(0);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveFansListWidget", "adjustShowModifyView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(view4, "com/tencent/mm/plugin/finder/live/widget/FinderLiveFansListWidget", "adjustShowModifyView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.ViewGroup.LayoutParams layoutParams = this.f117887r.getLayoutParams();
        int dimensionPixelOffset = layoutParams != null ? layoutParams.height : com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479731dn);
        android.view.View view5 = this.f117884o;
        int c17 = com.tencent.mm.ui.bl.c(view5.getContext());
        android.view.View view6 = this.f117888s;
        if (view6.getVisibility() == 0) {
            android.view.ViewGroup.LayoutParams layoutParams2 = view6.getLayoutParams();
            i17 = layoutParams2 != null ? layoutParams2.height : ym5.x.a(com.tencent.mm.sdk.platformtools.x2.f193071a, 150.0f);
        } else {
            i17 = 0;
        }
        androidx.recyclerview.widget.RecyclerView recyclerView = this.A;
        recyclerView.getLayoutParams().height = ((this.f117883n - c17) - dimensionPixelOffset) - i17;
        android.view.ViewGroup.LayoutParams layoutParams3 = recyclerView.getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams3, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ((android.view.ViewGroup.MarginLayoutParams) layoutParams3).bottomMargin += c17;
        j();
        if (y1Var == null) {
            com.tencent.mm.ui.widget.dialog.y1 y1Var2 = new com.tencent.mm.ui.widget.dialog.y1(view5.getContext());
            zl2.r4 r4Var = zl2.r4.f473950a;
            r4Var.Q2(view5);
            y1Var2.l(view5, new android.widget.FrameLayout.LayoutParams(-1, -1));
            y1Var2.a();
            android.content.Context context = view5.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            if (r4Var.Y1(context)) {
                y1Var2.m(java.lang.Boolean.TRUE);
                y1Var2.G = true;
            }
            y1Var2.s();
            this.f117880h = y1Var2;
        } else {
            zl2.r4.f473950a.Q2(this);
            y1Var.h(getListBottomPage());
        }
        if (zl2.r4.f473950a.w1()) {
            mm2.c1 c1Var = (mm2.c1) dk2.ef.f233372a.i(mm2.c1.class);
            if (c1Var != null && c1Var.a8()) {
                ((ml2.j0) i95.n0.c(ml2.j0.class)).yj(ml2.z4.Q, "4", null);
                return;
            }
            ml2.j0 j0Var = (ml2.j0) i95.n0.c(ml2.j0.class);
            ml2.c1 c1Var2 = ml2.c1.f327325e;
            j0Var.hj(27L, "4", null);
        }
    }

    public void i() {
        this.f119168f = null;
        f();
        com.tencent.mm.plugin.finder.live.widget.ei eiVar = this.M;
        if (eiVar != null) {
            eiVar.f119168f = null;
        }
        com.tencent.mm.plugin.finder.live.widget.ri riVar = this.N;
        if (riVar != null) {
            riVar.f119168f = null;
            com.tencent.mm.plugin.finder.live.widget.ei eiVar2 = riVar.f119644o;
            if (eiVar2 != null) {
                eiVar2.f119168f = null;
            }
        }
        this.f117886q.setOnVisibilityListener(null);
        kotlinx.coroutines.r2 r2Var = this.P;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
    }

    public final void j() {
        g(true, new com.tencent.mm.plugin.finder.live.widget.ah(this));
        com.tencent.mm.ui.widget.dialog.y1 y1Var = this.f117881i;
        android.view.View view = this.f117889t;
        if (y1Var == null) {
            view.setRotation(90.0f);
        } else {
            view.setRotation(180.0f);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.lang.String str;
        r45.eq1 eq1Var;
        com.tencent.mm.plugin.finder.live.widget.ri riVar;
        com.tencent.mm.plugin.finder.live.widget.ri riVar2;
        com.tencent.mm.plugin.finder.live.widget.ei eiVar;
        com.tencent.mm.plugin.finder.live.widget.ei eiVar2;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/FinderLiveFansListWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        jz5.f0 f0Var = null;
        java.lang.Integer valueOf = view != null ? java.lang.Integer.valueOf(view.getId()) : null;
        if (valueOf != null && valueOf.intValue() == com.tencent.mm.R.id.drq) {
            f();
        } else if (valueOf == null || valueOf.intValue() != com.tencent.mm.R.id.dru) {
            if (valueOf != null && valueOf.intValue() == com.tencent.mm.R.id.drx) {
                dk2.ef efVar = dk2.ef.f233372a;
                mm2.n2 n2Var = (mm2.n2) efVar.i(mm2.n2.class);
                java.util.List list = n2Var != null ? n2Var.f329283n : null;
                boolean z17 = list == null || list.isEmpty();
                jz5.f0 f0Var2 = jz5.f0.f302826a;
                if (z17) {
                    if (this.M == null) {
                        android.content.Context context = getContext();
                        kotlin.jvm.internal.o.f(context, "getContext(...)");
                        com.tencent.mm.plugin.finder.live.widget.ei eiVar3 = new com.tencent.mm.plugin.finder.live.widget.ei(context);
                        eiVar3.setBackClickListener(new com.tencent.mm.plugin.finder.live.widget.sg(this));
                        this.M = eiVar3;
                    }
                    com.tencent.mm.plugin.finder.live.plugin.l basePlugin = getBasePlugin();
                    if (basePlugin == null || (eiVar2 = this.M) == null) {
                        f0Var2 = null;
                    } else {
                        eiVar2.a(basePlugin);
                    }
                    if (f0Var2 == null && (eiVar = this.M) != null) {
                        eiVar.setScope(getScope());
                    }
                    com.tencent.mm.plugin.finder.live.widget.ei eiVar4 = this.M;
                    if (eiVar4 != null) {
                        eiVar4.c(this.f117880h);
                    }
                    mm2.c1 c1Var = (mm2.c1) efVar.i(mm2.c1.class);
                    if (c1Var != null && c1Var.a8()) {
                        ((ml2.j0) i95.n0.c(ml2.j0.class)).yj(ml2.z4.Q, "5", null);
                    } else {
                        ml2.j0 j0Var = (ml2.j0) i95.n0.c(ml2.j0.class);
                        ml2.c1 c1Var2 = ml2.c1.f327325e;
                        j0Var.hj(27L, "5", null);
                    }
                } else {
                    if (this.N == null) {
                        android.content.Context context2 = getContext();
                        kotlin.jvm.internal.o.f(context2, "getContext(...)");
                        com.tencent.mm.plugin.finder.live.widget.ri riVar3 = new com.tencent.mm.plugin.finder.live.widget.ri(context2);
                        riVar3.setBackClickListener(new com.tencent.mm.plugin.finder.live.widget.tg(this));
                        this.N = riVar3;
                    }
                    com.tencent.mm.plugin.finder.live.plugin.l basePlugin2 = getBasePlugin();
                    if (basePlugin2 != null && (riVar2 = this.N) != null) {
                        riVar2.a(basePlugin2);
                        f0Var = f0Var2;
                    }
                    if (f0Var == null && (riVar = this.N) != null) {
                        riVar.setScope(getScope());
                    }
                    com.tencent.mm.plugin.finder.live.widget.ri riVar4 = this.N;
                    if (riVar4 != null) {
                        riVar4.c(this.f117880h);
                    }
                }
            } else if (valueOf != null && valueOf.intValue() == com.tencent.mm.R.id.qie) {
                mm2.n2 n2Var2 = (mm2.n2) dk2.ef.f233372a.i(mm2.n2.class);
                if (n2Var2 == null || (eq1Var = n2Var2.f329279g) == null || (str = eq1Var.getString(12)) == null) {
                    str = "";
                }
                java.lang.String Ui = ((k40.f) ((l40.e) i95.n0.c(l40.e.class))).Ui(getContext());
                android.net.Uri.Builder buildUpon = android.net.Uri.parse(str).buildUpon();
                buildUpon.appendQueryParameter("finder_username", Ui);
                java.lang.String uri = buildUpon.build().toString();
                kotlin.jvm.internal.o.f(uri, "toString(...)");
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("rawUrl", uri);
                intent.putExtra("convertActivityFromTranslucent", true);
                j45.l.j(getContext(), "webview", ".ui.tools.WebViewUI", intent, null);
            }
        } else if (this.f117881i == null) {
            f();
        } else {
            getListBottomPage().h();
            this.f117881i = null;
            this.f117886q.setTranslationY(0.0f);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveFansListWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
