package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class k5 extends com.tencent.mm.plugin.finder.live.plugin.l {

    /* renamed from: p, reason: collision with root package name */
    public final qo0.c f113191p;

    /* renamed from: q, reason: collision with root package name */
    public final android.view.View f113192q;

    /* renamed from: r, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.k0 f113193r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f113194s;

    /* renamed from: t, reason: collision with root package name */
    public final db5.t4 f113195t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k5(android.view.ViewGroup root, qo0.c statueMonitor) {
        super(root, statueMonitor, null);
        kotlin.jvm.internal.o.g(root, "root");
        kotlin.jvm.internal.o.g(statueMonitor, "statueMonitor");
        this.f113191p = statueMonitor;
        android.view.View findViewById = root.findViewById(com.tencent.mm.R.id.igy);
        this.f113192q = findViewById;
        com.tencent.mm.ui.bl.c(root.getContext());
        this.f113195t = new com.tencent.mm.plugin.finder.live.plugin.g5(this, root);
        findViewById.setOnClickListener(new com.tencent.mm.plugin.finder.live.plugin.f5(this));
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        if (x0() && root.getLayoutParams() != null && (root.getLayoutParams() instanceof android.view.ViewGroup.MarginLayoutParams)) {
            int u07 = u0();
            if (u07 == 1) {
                android.view.ViewGroup.LayoutParams layoutParams = root.getLayoutParams();
                kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                ((android.view.ViewGroup.MarginLayoutParams) layoutParams).setMarginEnd(com.tencent.mm.ui.bl.c(root.getContext()));
            } else if (u07 == 3) {
                android.view.ViewGroup.LayoutParams layoutParams2 = root.getLayoutParams();
                kotlin.jvm.internal.o.e(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).setMarginEnd(com.tencent.mm.ui.zk.a(root.getContext(), 16));
            }
        }
        zl2.r4 r4Var = zl2.r4.f473950a;
        zl2.r4.b(r4Var, root, this, false, false, 8, null);
        if (r4Var.w1()) {
            return;
        }
        r4Var.d(this);
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean G() {
        return true;
    }

    @Override // qo0.a
    public void J0() {
        android.view.ViewGroup viewGroup = this.f365323d;
        if (com.tencent.mm.ui.bl.c(viewGroup.getContext()) == 0) {
            com.tencent.mm.ui.zk.a(viewGroup.getContext(), 16);
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l, qo0.a
    public void M0(qo0.b status, android.os.Bundle bundle) {
        kotlin.jvm.internal.o.g(status, "status");
        int ordinal = status.ordinal();
        if (ordinal != 5) {
            if (ordinal == 7) {
                K0(0);
                return;
            }
            if (ordinal == 8) {
                if (!this.f113194s) {
                    df2.y yVar = (df2.y) U0(df2.y.class);
                    if (yVar != null) {
                        yVar.Z6();
                        return;
                    }
                    return;
                }
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                android.view.ViewGroup viewGroup = this.f365323d;
                arrayList.add(viewGroup.getContext().getResources().getString(((mm2.c1) P0(mm2.c1.class)).Y4 ? com.tencent.mm.R.string.e3l : com.tencent.mm.R.string.e_k));
                arrayList2.add(2);
                if (((mm2.c1) P0(mm2.c1.class)).f328825j3 && !((mm2.c1) P0(mm2.c1.class)).Y4) {
                    arrayList.add(viewGroup.getContext().getResources().getString(com.tencent.mm.R.string.gdu));
                    arrayList2.add(0);
                }
                if (this.f113193r == null) {
                    com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0(viewGroup.getContext(), 1, true);
                    this.f113193r = k0Var;
                    k0Var.f211872n = new com.tencent.mm.plugin.finder.live.plugin.i5(this, arrayList, arrayList2);
                    k0Var.f211881s = this.f113195t;
                    k0Var.p(new com.tencent.mm.plugin.finder.live.plugin.j5(this));
                }
                com.tencent.mm.ui.widget.dialog.k0 k0Var2 = this.f113193r;
                if (k0Var2 != null) {
                    k0Var2.v();
                    return;
                }
                return;
            }
            if (ordinal != 27 && ordinal != 28) {
                return;
            }
        }
        K0(8);
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean k() {
        return ((mm2.c1) P0(mm2.c1.class)).f328801f2 != 1;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean r() {
        return true;
    }

    public final void t1() {
        com.tencent.mm.plugin.finder.live.plugin.k5 k5Var;
        com.tencent.mars.xlog.Log.i("FinderLiveAnchorClosePlugin", "anchorCloseLive");
        if (!x0()) {
            u1(this.f113191p);
            return;
        }
        df2.te teVar = (df2.te) U0(df2.te.class);
        if (teVar != null) {
            if (teVar.U6()) {
                teVar.f291101g = new df2.re(teVar);
                ((mm2.c1) teVar.business(mm2.c1.class)).A2 = true;
                teVar.a7();
            } else {
                com.tencent.mm.plugin.finder.live.view.ub ubVar = teVar.f291099e;
                if (ubVar == null || (k5Var = (com.tencent.mm.plugin.finder.live.plugin.k5) ubVar.getPlugin(com.tencent.mm.plugin.finder.live.plugin.k5.class)) == null) {
                    return;
                }
                com.tencent.mm.plugin.finder.live.view.ub ubVar2 = teVar.f291099e;
                k5Var.u1(ubVar2 instanceof qo0.c ? (qo0.c) ubVar2 : null);
            }
        }
    }

    public final void u1(qo0.c cVar) {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putBoolean("PARAM_FINDER_LIVE_LIVE_FINISH_MANUAL", true);
        bundle.putBoolean("PARAM_FINDER_LIVE_LIVE_FINISH_IF_CLOSE_LIVE", true);
        if (cVar != null) {
            cVar.statusChange(qo0.b.H, bundle);
        }
        boolean z17 = this.f113194s;
        com.tencent.mm.plugin.finder.assist.u8 u8Var = com.tencent.mm.plugin.finder.assist.u8.f102599a;
        if (z17) {
            com.tencent.mm.plugin.finder.assist.p8 p8Var = com.tencent.mm.plugin.finder.assist.p8.f102460a;
            if (com.tencent.mm.plugin.finder.assist.n8.f102409b == 2) {
                com.tencent.mm.plugin.finder.assist.n8.f102409b = 0;
                com.tencent.mm.plugin.report.service.g0.INSTANCE.B(com.tencent.mm.plugin.finder.assist.p8.f102463d, 1130L);
            } else {
                com.tencent.mars.xlog.Log.i("Finder.LiveAnchorFlowStats", "reportSecondaryManualClose but not record live!");
            }
            u8Var.b(S0(), com.tencent.mm.plugin.appbrand.jsapi.pay.z.CTRL_INDEX, 0, "secondaryManualClose", "0-vBitrate:" + hn0.v.f282442c);
            return;
        }
        if (((mm2.c1) P0(mm2.c1.class)).Y4) {
            com.tencent.mm.plugin.finder.assist.p8 p8Var2 = com.tencent.mm.plugin.finder.assist.p8.f102460a;
            if (com.tencent.mm.plugin.finder.assist.n8.f102409b == 3) {
                com.tencent.mm.plugin.finder.assist.n8.f102409b = 0;
                com.tencent.mm.plugin.report.service.g0.INSTANCE.B(com.tencent.mm.plugin.finder.assist.p8.f102463d, 1140L);
            } else {
                com.tencent.mars.xlog.Log.i("Finder.LiveAnchorFlowStats", "reportExternalManualClose but not record live!");
            }
            u8Var.b(S0(), com.tencent.mm.plugin.appbrand.jsapi.wccoin.u.CTRL_INDEX, 0, "externalManualClose", "0-vBitrate:" + hn0.v.f282442c);
            return;
        }
        com.tencent.mm.plugin.finder.assist.p8 p8Var3 = com.tencent.mm.plugin.finder.assist.p8.f102460a;
        if (com.tencent.mm.plugin.finder.assist.n8.f102409b == 1) {
            com.tencent.mm.plugin.finder.assist.n8.f102409b = 0;
            com.tencent.mm.plugin.report.service.g0.INSTANCE.B(com.tencent.mm.plugin.finder.assist.p8.f102463d, 1120L);
        } else {
            com.tencent.mars.xlog.Log.i("Finder.LiveAnchorFlowStats", "reportAnchorManualClose but not record live!");
        }
        com.tencent.mm.plugin.finder.assist.u8.f102604f = c01.id.a();
        u8Var.b(S0(), 1120, 0, "anchorManualClose", "0-vBitrate:" + hn0.v.f282442c);
    }
}
