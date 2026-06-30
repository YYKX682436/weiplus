package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class q50 extends com.tencent.mm.plugin.finder.live.widget.e0 {
    public com.tencent.mm.plugin.finder.live.widget.o40 A1;
    public com.tencent.mm.plugin.finder.live.widget.m40 B1;
    public final com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore H;
    public android.widget.TextView I;

    /* renamed from: J, reason: collision with root package name */
    public android.view.View f119496J;
    public android.widget.TextView K;
    public android.view.View L;
    public android.view.View M;
    public android.view.View N;
    public android.widget.TextView P;
    public android.view.View Q;
    public android.view.View R;
    public android.widget.TextView S;
    public android.widget.TextView T;
    public android.view.View U;
    public android.widget.TextView V;
    public android.widget.TextView W;
    public android.view.View X;
    public android.widget.TextView Y;
    public android.widget.TextView Z;

    /* renamed from: l1, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.live.widget.o40 f119497l1;

    /* renamed from: p0, reason: collision with root package name */
    public android.view.View f119498p0;

    /* renamed from: p1, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.live.widget.m40 f119499p1;

    /* renamed from: x0, reason: collision with root package name */
    public android.widget.TextView f119500x0;

    /* renamed from: x1, reason: collision with root package name */
    public boolean f119501x1;

    /* renamed from: y0, reason: collision with root package name */
    public android.view.View f119502y0;

    /* renamed from: y1, reason: collision with root package name */
    public r45.re2 f119503y1;

    /* renamed from: z1, reason: collision with root package name */
    public r45.re2 f119504z1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q50(android.content.Context context, com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore store) {
        super(context, false, null, -1.0f, 4, null);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(store, "store");
        this.H = store;
        com.tencent.mm.plugin.finder.live.widget.o40 o40Var = com.tencent.mm.plugin.finder.live.widget.o40.f119251f;
        this.f119497l1 = o40Var;
        com.tencent.mm.plugin.finder.live.widget.m40 m40Var = com.tencent.mm.plugin.finder.live.widget.m40.f119036f;
        this.f119499p1 = m40Var;
        this.f119504z1 = new r45.re2();
        this.A1 = o40Var;
        this.B1 = m40Var;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.e0
    public int A() {
        return com.tencent.mm.R.layout.f488838er0;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.e0
    public java.lang.String L() {
        boolean d17 = g0().d();
        android.content.Context context = this.f118183e;
        if (d17) {
            java.lang.String string = context.getString(com.tencent.mm.R.string.noc);
            kotlin.jvm.internal.o.d(string);
            return string;
        }
        java.lang.String string2 = context.getString(com.tencent.mm.R.string.oou);
        kotlin.jvm.internal.o.d(string2);
        return string2;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.e0
    public void N(android.view.View rootView) {
        kotlin.jvm.internal.o.g(rootView, "rootView");
        a0(this.f118183e.getDrawable(com.tencent.mm.R.drawable.clh));
        d0();
        this.f119496J = rootView.findViewById(com.tencent.mm.R.id.u9_);
        this.K = (android.widget.TextView) rootView.findViewById(com.tencent.mm.R.id.t6e);
        this.L = rootView.findViewById(com.tencent.mm.R.id.t6d);
        this.M = rootView.findViewById(com.tencent.mm.R.id.soc);
        this.N = rootView.findViewById(com.tencent.mm.R.id.u9e);
        this.P = (android.widget.TextView) rootView.findViewById(com.tencent.mm.R.id.f484166t71);
        this.R = rootView.findViewById(com.tencent.mm.R.id.u9c);
        this.S = (android.widget.TextView) rootView.findViewById(com.tencent.mm.R.id.t6q);
        this.U = rootView.findViewById(com.tencent.mm.R.id.u9a);
        this.V = (android.widget.TextView) rootView.findViewById(com.tencent.mm.R.id.t6i);
        this.X = rootView.findViewById(com.tencent.mm.R.id.u9b);
        this.Y = (android.widget.TextView) rootView.findViewById(com.tencent.mm.R.id.t6l);
        this.T = (android.widget.TextView) rootView.findViewById(com.tencent.mm.R.id.t6r);
        this.W = (android.widget.TextView) rootView.findViewById(com.tencent.mm.R.id.t6j);
        this.Z = (android.widget.TextView) rootView.findViewById(com.tencent.mm.R.id.t6m);
        this.f119502y0 = rootView.findViewById(com.tencent.mm.R.id.u9n);
        this.Q = rootView.findViewById(com.tencent.mm.R.id.f484165t70);
        this.f119498p0 = rootView.findViewById(com.tencent.mm.R.id.t6k);
        android.widget.TextView textView = (android.widget.TextView) rootView.findViewById(com.tencent.mm.R.id.kpi);
        this.f119500x0 = textView;
        if (textView != null) {
            ne2.c.f336527a.c(textView);
        }
        android.view.View G = G();
        if (G == null) {
            return;
        }
        G.setEnabled(false);
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.e0
    public void S() {
        super.S();
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.e0
    public void U() {
        java.lang.Object obj;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[confirmBtn-click] currentMode:");
        sb6.append(this.A1);
        sb6.append(", isChargeLive:");
        sb6.append(g0().d());
        sb6.append(", deltaVisibleList:");
        r45.re2 re2Var = this.f119503y1;
        if (re2Var == null || (obj = pm0.b0.g(re2Var)) == null) {
            obj = "null";
        }
        sb6.append(obj);
        com.tencent.mars.xlog.Log.i("FinderLivingWhiteListPanel", sb6.toString());
        if (this.A1 == com.tencent.mm.plugin.finder.live.widget.o40.f119253h && h0()) {
            j0(com.tencent.mm.plugin.finder.live.widget.o40.f119251f);
            com.tencent.mars.xlog.Log.i("FinderLivingWhiteListPanel", "[confirmBtn-click] current invisible list is empty, reset to public mode");
        }
        if (this.B1 != this.f119499p1) {
            ((ml2.j0) i95.n0.c(ml2.j0.class)).zj(ml2.c5.f327341i);
        }
        kotlinx.coroutines.y0 y0Var = this.E;
        if (y0Var != null) {
            kotlinx.coroutines.l.d(y0Var, null, null, new com.tencent.mm.plugin.finder.live.widget.p40(this, null), 3, null);
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.e0
    public void V(com.tencent.mm.plugin.finder.live.widget.e0 e0Var, boolean z17, int i17) {
        android.view.View view;
        super.V(e0Var, z17, i17);
        com.tencent.mm.plugin.finder.live.widget.m40 m40Var = g0().f() ? com.tencent.mm.plugin.finder.live.widget.m40.f119037g : com.tencent.mm.plugin.finder.live.widget.m40.f119036f;
        this.f119499p1 = m40Var;
        this.B1 = m40Var;
        j0(m40Var == com.tencent.mm.plugin.finder.live.widget.m40.f119036f ? com.tencent.mm.plugin.finder.live.widget.o40.f119251f : com.tencent.mm.plugin.finder.live.widget.o40.f119252g);
        com.tencent.mm.plugin.finder.live.widget.o40 o40Var = (g0().d() || g0().f()) ? com.tencent.mm.plugin.finder.live.widget.o40.f119252g : pm0.v.z(g0().f329581e, 64) ? com.tencent.mm.plugin.finder.live.widget.o40.f119253h : g0().e() ? com.tencent.mm.plugin.finder.live.widget.o40.f119251f : com.tencent.mm.plugin.finder.live.widget.o40.f119252g;
        this.f119497l1 = o40Var;
        j0(o40Var);
        if (this.f119501x1 && (view = this.f119496J) != null) {
            view.postDelayed(new com.tencent.mm.plugin.finder.live.widget.q40(this), 300L);
        }
        df2.o f07 = f0();
        if ((f07 != null ? f07.f230904u : null) != r45.f07.VisibilityModeOptionStatus_Hide) {
            ((ml2.j0) i95.n0.c(ml2.j0.class)).zj(ml2.c5.f327339g);
        }
    }

    public final java.lang.Object e0(r45.hx0 hx0Var, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore liveRoomControllerStore = this.H;
        ek2.r1 r1Var = new ek2.r1(((mm2.e1) liveRoomControllerStore.business(mm2.e1.class)).f328988r.getLong(0), ((mm2.e1) liveRoomControllerStore.business(mm2.e1.class)).f328983m, 23, hx0Var);
        az2.j.u(r1Var, this.f118183e, null, 0L, 6, null);
        return rm0.h.b(r1Var, continuation);
    }

    public final df2.o f0() {
        return (df2.o) this.H.controller(df2.o.class);
    }

    public final mm2.y6 g0() {
        return (mm2.y6) ((kotlinx.coroutines.flow.h3) ((mm2.g1) this.H.business(mm2.g1.class)).f329078s).getValue();
    }

    public final boolean h0() {
        return this.f119504z1.getList(1).isEmpty() && this.f119504z1.getList(0).isEmpty() && this.f119504z1.getList(4).isEmpty() && this.f119504z1.getList(3).isEmpty();
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x017d, code lost:
    
        if (h0() != false) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x01ee, code lost:
    
        r4 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0189, code lost:
    
        if (r29.f119497l1 != r11) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01eb, code lost:
    
        if ((r4 == null || r4.isEmpty()) == false) goto L139;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i0() {
        /*
            Method dump skipped, instructions count: 2488
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.widget.q50.i0():void");
    }

    public final void j0(com.tencent.mm.plugin.finder.live.widget.o40 o40Var) {
        r45.re2 re2Var;
        this.A1 = o40Var;
        r45.re2 re2Var2 = new r45.re2();
        this.f119504z1 = re2Var2;
        if (this.A1 == this.f119497l1) {
            if (g0().d()) {
                r45.hn1 hn1Var = g0().f329587k;
                re2Var = hn1Var != null ? (r45.re2) hn1Var.getCustom(2) : null;
            } else {
                re2Var = g0().f329590n;
            }
            if (re2Var != null) {
                re2Var2.getList(4).addAll(re2Var.getList(4));
                re2Var2.getList(1).addAll(re2Var.getList(1));
                re2Var2.getList(2).addAll(re2Var.getList(2));
                re2Var2.getList(3).addAll(re2Var.getList(3));
                re2Var2.getList(0).addAll(re2Var.getList(0));
            }
        }
        this.f119503y1 = null;
        i0();
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.e0
    public android.view.View u() {
        android.widget.TextView textView = new android.widget.TextView(this.f118183e);
        textView.setTextSize(0, textView.getContext().getResources().getDimension(com.tencent.mm.R.dimen.f479674cb));
        textView.setTextColor(textView.getContext().getResources().getColor(com.tencent.mm.R.color.FG_0));
        textView.setText(textView.getContext().getResources().getString(com.tencent.mm.R.string.f490347sg));
        return textView;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.e0
    public android.view.View v() {
        android.widget.TextView x17 = x();
        x17.setText(x17.getContext().getString(com.tencent.mm.R.string.f491729m94));
        x17.setTextSize(17.0f);
        int b17 = i65.a.b(x17.getContext(), 12);
        x17.setPadding(b17, 0, b17, 0);
        x17.setTextColor(x17.getContext().getResources().getColor(com.tencent.mm.R.color.f478838io));
        x17.setBackgroundDrawable(x17.getContext().getDrawable(com.tencent.mm.R.drawable.f481060jo));
        x17.setMinWidth((int) x17.getContext().getResources().getDimension(com.tencent.mm.R.dimen.f479723df));
        x17.setMinHeight((int) x17.getContext().getResources().getDimension(com.tencent.mm.R.dimen.f479714d7));
        x17.setGravity(17);
        this.I = x17;
        return x17;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.e0
    public boolean w() {
        return true;
    }
}
