package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class nb extends com.tencent.mm.plugin.finder.live.widget.e0 {
    public static final com.tencent.mm.plugin.finder.live.widget.ta W = new com.tencent.mm.plugin.finder.live.widget.ta(null);
    public mm2.n0 H;
    public android.widget.TextView I;

    /* renamed from: J, reason: collision with root package name */
    public android.widget.TextView f119174J;
    public android.widget.ImageView K;
    public android.view.View L;
    public android.view.View M;
    public android.widget.TextView N;
    public androidx.recyclerview.widget.RecyclerView P;
    public android.widget.TextView Q;
    public android.widget.TextView R;
    public com.tencent.mm.plugin.finder.live.widget.sb S;
    public kotlinx.coroutines.r2 T;
    public android.view.View U;
    public yz5.a V;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nb(android.content.Context context) {
        super(context, false, null, 0.75f, 4, null);
        kotlin.jvm.internal.o.g(context, "context");
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.e0
    public int A() {
        return com.tencent.mm.R.layout.e9r;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.e0
    public int D() {
        return 8;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.e0
    public int J() {
        return 0;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.e0
    public void N(android.view.View rootView) {
        kotlinx.coroutines.y0 y0Var;
        kotlin.jvm.internal.o.g(rootView, "rootView");
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveCoLiveInvitorPreparePanel", "initContentView");
        this.U = rootView;
        android.content.Context context = this.f118183e;
        a0(context.getDrawable(com.tencent.mm.R.drawable.clh));
        Y(com.tencent.mm.R.color.ah8);
        android.view.View findViewById = rootView.findViewById(com.tencent.mm.R.id.suj);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.I = (android.widget.TextView) findViewById;
        android.view.View findViewById2 = rootView.findViewById(com.tencent.mm.R.id.f483773su4);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f119174J = (android.widget.TextView) findViewById2;
        android.view.View findViewById3 = rootView.findViewById(com.tencent.mm.R.id.suh);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.K = (android.widget.ImageView) findViewById3;
        android.view.View findViewById4 = rootView.findViewById(com.tencent.mm.R.id.suf);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        this.L = findViewById4;
        android.view.View findViewById5 = rootView.findViewById(com.tencent.mm.R.id.su6);
        kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
        this.M = findViewById5;
        android.view.View findViewById6 = rootView.findViewById(com.tencent.mm.R.id.su8);
        kotlin.jvm.internal.o.f(findViewById6, "findViewById(...)");
        this.N = (android.widget.TextView) findViewById6;
        android.view.View findViewById7 = rootView.findViewById(com.tencent.mm.R.id.sub);
        kotlin.jvm.internal.o.f(findViewById7, "findViewById(...)");
        this.P = (androidx.recyclerview.widget.RecyclerView) findViewById7;
        android.view.View findViewById8 = rootView.findViewById(com.tencent.mm.R.id.f483774su5);
        kotlin.jvm.internal.o.f(findViewById8, "findViewById(...)");
        this.Q = (android.widget.TextView) findViewById8;
        android.view.View findViewById9 = rootView.findViewById(com.tencent.mm.R.id.sug);
        kotlin.jvm.internal.o.f(findViewById9, "findViewById(...)");
        this.R = (android.widget.TextView) findViewById9;
        android.widget.TextView textView = this.I;
        if (textView == null) {
            kotlin.jvm.internal.o.o("titleTv");
            throw null;
        }
        textView.setText(com.tencent.mm.R.string.onx);
        android.widget.TextView textView2 = this.I;
        if (textView2 == null) {
            kotlin.jvm.internal.o.o("titleTv");
            throw null;
        }
        com.tencent.mm.ui.fk.a(textView2);
        android.widget.TextView textView3 = this.Q;
        if (textView3 == null) {
            kotlin.jvm.internal.o.o("endBtn");
            throw null;
        }
        textView3.setOnClickListener(new com.tencent.mm.plugin.finder.live.widget.eb(this));
        android.widget.TextView textView4 = this.R;
        if (textView4 == null) {
            kotlin.jvm.internal.o.o("learnMoreBtn");
            throw null;
        }
        textView4.setOnClickListener(new com.tencent.mm.plugin.finder.live.widget.fb(this));
        com.tencent.mm.plugin.finder.live.widget.sb sbVar = new com.tencent.mm.plugin.finder.live.widget.sb(context);
        this.S = sbVar;
        sbVar.f119748f = new com.tencent.mm.plugin.finder.live.widget.gb(this);
        androidx.recyclerview.widget.RecyclerView recyclerView = this.P;
        if (recyclerView == null) {
            kotlin.jvm.internal.o.o("hostListRv");
            throw null;
        }
        recyclerView.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(context));
        androidx.recyclerview.widget.RecyclerView recyclerView2 = this.P;
        if (recyclerView2 == null) {
            kotlin.jvm.internal.o.o("hostListRv");
            throw null;
        }
        com.tencent.mm.plugin.finder.live.widget.sb sbVar2 = this.S;
        if (sbVar2 == null) {
            kotlin.jvm.internal.o.o("hostAdapter");
            throw null;
        }
        recyclerView2.setAdapter(sbVar2);
        androidx.recyclerview.widget.RecyclerView recyclerView3 = this.P;
        if (recyclerView3 == null) {
            kotlin.jvm.internal.o.o("hostListRv");
            throw null;
        }
        recyclerView3.setOverScrollMode(2);
        e0();
        mm2.n0 n0Var = this.H;
        if (n0Var != null && (y0Var = this.E) != null) {
            kotlinx.coroutines.r2 r2Var = this.T;
            if (r2Var != null) {
                kotlinx.coroutines.p2.a(r2Var, null, 1, null);
            }
            kotlin.jvm.internal.c0 c0Var = new kotlin.jvm.internal.c0();
            c0Var.f310112d = n0Var.O6();
            this.T = kotlinx.coroutines.l.d(y0Var, null, null, new com.tencent.mm.plugin.finder.live.widget.ib(n0Var, this, c0Var, null), 3, null);
        }
        kotlin.jvm.internal.o.g(context, "context");
        try {
            ct.d3 d3Var = (ct.d3) i95.n0.c(ct.d3.class);
            if (d3Var != null) {
                ((com.tencent.mm.ui.feature.api.screenshot.t) d3Var).wi(context, re2.j1.f394439c);
            }
            com.tencent.mars.xlog.Log.i("Finder.CoLiveTaskManager", "enableScreenShotListener: registered, context=".concat(context.getClass().getSimpleName()));
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("Finder.CoLiveTaskManager", th6, "enableScreenShotListener failed", new java.lang.Object[0]);
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.e0
    public boolean Q() {
        return true;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.e0
    public void S() {
        super.S();
        android.content.Context context = this.f118183e;
        kotlin.jvm.internal.o.g(context, "context");
        try {
            ct.d3 d3Var = (ct.d3) i95.n0.c(ct.d3.class);
            if (d3Var != null) {
                ((com.tencent.mm.ui.feature.api.screenshot.t) d3Var).Bi(context, re2.j1.f394439c);
            }
            com.tencent.mars.xlog.Log.i("Finder.CoLiveTaskManager", "disableScreenShotListener: unregistered, context=".concat(context.getClass().getSimpleName()));
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("Finder.CoLiveTaskManager", th6, "disableScreenShotListener failed", new java.lang.Object[0]);
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.e0
    public void V(com.tencent.mm.plugin.finder.live.widget.e0 e0Var, boolean z17, int i17) {
        android.view.Window b17;
        super.V(e0Var, z17, i17);
        try {
            com.tencent.mm.ui.widget.dialog.y1 y1Var = this.B;
            if (y1Var == null || (b17 = y1Var.b()) == null) {
                android.view.View view = this.U;
                if (view != null) {
                    view.post(new com.tencent.mm.plugin.finder.live.widget.ua(this, view));
                }
            } else {
                b17.addFlags(8192);
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("Finder.FinderLiveCoLiveInvitorPreparePanel", th6, "applySecureFlag failed", new java.lang.Object[0]);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0233  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e0() {
        /*
            Method dump skipped, instructions count: 739
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.widget.nb.e0():void");
    }
}
