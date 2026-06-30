package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class vi0 extends com.tencent.mm.plugin.finder.live.plugin.l implements android.view.View.OnClickListener {
    public com.tencent.mm.ui.widget.dialog.k0 A;

    /* renamed from: p, reason: collision with root package name */
    public final qo0.c f114728p;

    /* renamed from: q, reason: collision with root package name */
    public final java.lang.String f114729q;

    /* renamed from: r, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.view.FinderLiveFloatContainer f114730r;

    /* renamed from: s, reason: collision with root package name */
    public final android.view.View f114731s;

    /* renamed from: t, reason: collision with root package name */
    public final android.view.View f114732t;

    /* renamed from: u, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.imageview.WeImageView f114733u;

    /* renamed from: v, reason: collision with root package name */
    public final android.widget.TextView f114734v;

    /* renamed from: w, reason: collision with root package name */
    public final android.widget.TextView f114735w;

    /* renamed from: x, reason: collision with root package name */
    public final android.view.View f114736x;

    /* renamed from: y, reason: collision with root package name */
    public final com.tencent.mm.view.MMPAGView f114737y;

    /* renamed from: z, reason: collision with root package name */
    public final android.widget.TextView f114738z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vi0(android.view.ViewGroup root, qo0.c statusMonitor) {
        super(root, statusMonitor, null);
        kotlin.jvm.internal.o.g(root, "root");
        kotlin.jvm.internal.o.g(statusMonitor, "statusMonitor");
        this.f114728p = statusMonitor;
        this.f114729q = "Finder.FinderLiveVisitorLinkMicStatePlugin";
        com.tencent.mm.plugin.finder.live.view.FinderLiveFloatContainer finderLiveFloatContainer = (com.tencent.mm.plugin.finder.live.view.FinderLiveFloatContainer) root.findViewById(com.tencent.mm.R.id.f7d);
        this.f114730r = finderLiveFloatContainer;
        this.f114731s = root.findViewById(com.tencent.mm.R.id.f7f);
        this.f114732t = root.findViewById(com.tencent.mm.R.id.f78);
        this.f114733u = (com.tencent.mm.ui.widget.imageview.WeImageView) root.findViewById(com.tencent.mm.R.id.f7g);
        this.f114734v = (android.widget.TextView) root.findViewById(com.tencent.mm.R.id.f7h);
        this.f114735w = (android.widget.TextView) root.findViewById(com.tencent.mm.R.id.f7a);
        android.view.View findViewById = root.findViewById(com.tencent.mm.R.id.f7_);
        this.f114736x = findViewById;
        com.tencent.mm.view.MMPAGView mMPAGView = (com.tencent.mm.view.MMPAGView) root.findViewById(com.tencent.mm.R.id.f7c);
        this.f114737y = mMPAGView;
        this.f114738z = (android.widget.TextView) root.findViewById(com.tencent.mm.R.id.f7b);
        finderLiveFloatContainer.setOnClick(new com.tencent.mm.plugin.finder.live.plugin.li0(this));
        android.view.ViewGroup.LayoutParams layoutParams = finderLiveFloatContainer.getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ((android.view.ViewGroup.MarginLayoutParams) layoutParams).topMargin = finderLiveFloatContainer.defaultTranslationY;
        findViewById.setOnClickListener(this);
        ym5.l2 l2Var = ym5.l2.f463424a;
        ym5.j2[] j2VarArr = ym5.j2.f463392d;
        mMPAGView.o(ae2.in.f3688a.a(ym5.f6.f463330y));
        android.content.res.AssetManager assets = root.getContext().getAssets();
        kotlin.jvm.internal.o.f(assets, "getAssets(...)");
        mMPAGView.k(assets, "finder_live_shopping_promoting.pag");
        mMPAGView.setRepeatCount(-1);
    }

    @Override // qo0.a
    public void C0(java.util.LinkedHashMap micUserMap) {
        kotlin.jvm.internal.o.g(micUserMap, "micUserMap");
        df2.t6 t6Var = (df2.t6) U0(df2.t6.class);
        if (t6Var != null) {
            t6Var.g7(micUserMap);
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean G() {
        return true;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l, qo0.a
    public void M0(qo0.b status, android.os.Bundle bundle) {
        kotlin.jvm.internal.o.g(status, "status");
        int ordinal = status.ordinal();
        if (ordinal == 7) {
            ((mm2.o4) P0(mm2.o4.class)).B.observe(this, new com.tencent.mm.plugin.finder.live.plugin.ri0(this));
            return;
        }
        if (ordinal != 123) {
            if (ordinal != 176) {
                return;
            }
            u1();
        } else {
            if (!((mm2.o4) P0(mm2.o4.class)).E7() || ((mm2.o4) P0(mm2.o4.class)).k7()) {
                return;
            }
            v1();
            qo0.c.a(this.f114728p, qo0.b.M3, null, 2, null);
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean k() {
        return !((mm2.c1) P0(mm2.c1.class)).e8();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveVisitorLinkMicStatePlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.Integer valueOf = view != null ? java.lang.Integer.valueOf(view.getId()) : null;
        if (valueOf != null && valueOf.intValue() == com.tencent.mm.R.id.f7_ && ((mm2.o4) P0(mm2.o4.class)).G7()) {
            v1();
            ((ml2.r0) i95.n0.c(ml2.r0.class)).D1 = true;
            qo0.c.a(this.f114728p, qo0.b.M3, null, 2, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveVisitorLinkMicStatePlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean r() {
        return true;
    }

    public final void t1() {
        com.tencent.mars.xlog.Log.i(this.f114729q, "checkLinkMicState: " + ((mm2.o4) P0(mm2.o4.class)).C);
        android.content.Context context = this.f365323d.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        pl2.s sVar = ((pl2.x) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(pl2.x.class)).f356684g;
        if (sVar != null) {
            boolean E7 = ((mm2.o4) P0(mm2.o4.class)).E7();
            boolean F7 = ((mm2.o4) P0(mm2.o4.class)).F7();
            boolean G7 = ((mm2.o4) P0(mm2.o4.class)).G7();
            if (E7 || F7 || G7) {
                sVar.a("LINK_MIC");
            } else {
                sVar.f("LINK_MIC");
            }
        }
    }

    public final void u1() {
        if (((mm2.o4) P0(mm2.o4.class)).E7()) {
            if (this.A == null) {
                com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0(this.f365323d.getContext(), 1, true);
                this.A = k0Var;
                k0Var.U1 = true;
            }
            com.tencent.mm.ui.widget.dialog.k0 k0Var2 = this.A;
            if (k0Var2 != null) {
                k0Var2.f211855d2 = false;
            }
            if (k0Var2 != null) {
                k0Var2.f211872n = new com.tencent.mm.plugin.finder.live.plugin.mi0(this);
            }
            if (k0Var2 != null) {
                k0Var2.f211881s = new com.tencent.mm.plugin.finder.live.plugin.ni0(this);
            }
            if (k0Var2 != null) {
                k0Var2.p(new com.tencent.mm.plugin.finder.live.plugin.oi0(this));
            }
            com.tencent.mm.ui.widget.dialog.k0 k0Var3 = this.A;
            if (k0Var3 != null) {
                k0Var3.v();
            }
            ml2.n4 n4Var = ml2.n4.f327748p0;
            com.tencent.mars.xlog.Log.i("FinderLiveMicReportUtil", "reportLink21084 action: 55");
            i95.m c17 = i95.n0.c(ml2.r0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            ml2.r0.ik((ml2.r0) c17, n4Var, null, 0, 6, null);
        }
    }

    public final void v1() {
        pm0.v.X(new com.tencent.mm.plugin.finder.live.plugin.qi0(this));
    }

    public final void w1() {
        zi2.w wVar = (zi2.w) X0(zi2.w.class);
        if (wVar != null ? wVar.k0() : false) {
            com.tencent.mars.xlog.Log.i(this.f114729q, "showStatePanelIfNeeded, mic center is available, skip");
        } else {
            pm0.v.X(new com.tencent.mm.plugin.finder.live.plugin.ti0(this));
        }
    }
}
