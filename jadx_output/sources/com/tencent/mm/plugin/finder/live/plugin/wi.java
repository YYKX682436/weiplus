package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class wi extends com.tencent.mm.plugin.finder.live.plugin.l {

    /* renamed from: p, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.view.FinderLiveGameInfoView f114940p;

    /* renamed from: q, reason: collision with root package name */
    public final java.lang.String f114941q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f114942r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f114943s;

    /* renamed from: t, reason: collision with root package name */
    public ik2.e f114944t;

    /* renamed from: u, reason: collision with root package name */
    public android.view.View f114945u;

    /* renamed from: v, reason: collision with root package name */
    public int f114946v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f114947w;

    /* renamed from: x, reason: collision with root package name */
    public android.view.ViewTreeObserver.OnGlobalLayoutListener f114948x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wi(com.tencent.mm.plugin.finder.live.view.FinderLiveGameInfoView gameInfoView, qo0.c statusMonitor) {
        super(gameInfoView, statusMonitor, null);
        kotlin.jvm.internal.o.g(gameInfoView, "gameInfoView");
        kotlin.jvm.internal.o.g(statusMonitor, "statusMonitor");
        this.f114940p = gameInfoView;
        this.f114941q = "MicroMsg.FinderLiveGameInfoPlugin";
        this.f114942r = true;
        this.f114943s = true;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean G() {
        return false;
    }

    @Override // qo0.a
    public void I0() {
        hq0.e0 e0Var;
        com.tencent.mars.xlog.Log.i(this.f114941q, "pause");
        ik2.e eVar = this.f114940p.surfaceMgr;
        if (eVar != null && (e0Var = eVar.f291887c) != null) {
            e0Var.f();
        }
        this.f114947w = true;
    }

    @Override // qo0.a
    public void J0() {
        hq0.e0 e0Var;
        ik2.e eVar = this.f114940p.surfaceMgr;
        if (eVar != null && (e0Var = eVar.f291887c) != null) {
            e0Var.j();
        }
        this.f114947w = false;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l, qo0.a
    public void K0(int i17) {
        if (((mm2.c1) P0(mm2.c1.class)).a8() || i17 != 0) {
            super.K0(i17);
            ((kotlinx.coroutines.flow.q2) ((je2.n) P0(je2.n.class)).f299249m).e(java.lang.Boolean.valueOf(i17 == 0));
        } else {
            dk2.xf W0 = W0();
            if (W0 != null) {
                ((dk2.r4) W0).n(this.f114940p, i17);
            }
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l, qo0.a
    public void M0(qo0.b status, android.os.Bundle bundle) {
        kotlin.jvm.internal.o.g(status, "status");
        int ordinal = status.ordinal();
        if (ordinal == 7) {
            android.view.View view = this.f114945u;
            if (view != null) {
                int[] iArr = new int[2];
                view.getLocationOnScreen(iArr);
                v1(iArr[1], view, 0);
                return;
            }
            return;
        }
        if (ordinal == 123) {
            t1();
        } else if (ordinal == 210) {
            u1(true);
        } else {
            if (ordinal != 211) {
                return;
            }
            u1(false);
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l, qo0.a
    public void O0() {
        com.tencent.mars.xlog.Log.i(this.f114941q, "unMount");
        super.O0();
        w1();
        this.f114940p.f115915v = false;
        ik2.e eVar = this.f114944t;
        if (eVar != null) {
            eVar.b();
        }
        this.f114945u = null;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean k() {
        return ((mm2.c1) P0(mm2.c1.class)).f328801f2 != 1;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean r() {
        r45.uq1 uq1Var = ((mm2.c1) P0(mm2.c1.class)).Q2;
        return !(uq1Var != null && uq1Var.getInteger(0) == 1) || x0();
    }

    public final void t1() {
        int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_finder_live_show_game_info_view_android, 1);
        if (this.f114943s) {
            this.f114943s = false;
            if (Ni != 1) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1740, 0);
            }
        }
        java.lang.String str = this.f114941q;
        if (Ni == 0) {
            K0(8);
            com.tencent.mars.xlog.Log.e(str, "show_game_info_view is 0, hide gameInfo entrance");
            return;
        }
        if (x0()) {
            K0(8);
            com.tencent.mars.xlog.Log.e(str, "now not support landscape, hide gameInfo entrance");
            return;
        }
        if (this.f114947w) {
            com.tencent.mars.xlog.Log.i(str, "paused, return");
            return;
        }
        r45.uq1 uq1Var = ((mm2.c1) P0(mm2.c1.class)).Q2;
        if (uq1Var == null) {
            K0(8);
            com.tencent.mars.xlog.Log.e(str, "liveGameData is null");
            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1740, 5);
            return;
        }
        com.tencent.mars.xlog.Log.i(str, "liveGameData visibility:%d", java.lang.Integer.valueOf(uq1Var.getInteger(0)));
        ik2.e eVar = this.f114944t;
        com.tencent.mm.plugin.finder.live.view.FinderLiveGameInfoView finderLiveGameInfoView = this.f114940p;
        finderLiveGameInfoView.setSurfaceMgr(eVar);
        if (uq1Var.getInteger(0) == 0) {
            K0(8);
            return;
        }
        if (w0() != 0) {
            K0(0);
            u1(true);
            com.tencent.mars.xlog.Log.i(str, "show game data");
            finderLiveGameInfoView.setup((mm2.c1) S0().a(mm2.c1.class));
        }
        com.tencent.mm.protobuf.g byteString = uq1Var.getByteString(1);
        java.lang.String h17 = byteString != null ? byteString.h(com.tencent.mapsdk.internal.rv.f51270c) : null;
        if (!kotlin.jvm.internal.o.b(finderLiveGameInfoView.f115914u, h17) && h17 != null) {
            finderLiveGameInfoView.f115914u = h17;
            finderLiveGameInfoView.g(h17);
        }
        if (this.f114942r) {
            oe0.t tVar = (oe0.t) i95.n0.c(oe0.t.class);
            ((oe0.t) i95.n0.c(oe0.t.class)).getClass();
            ((ne0.r) tVar).getClass();
            yg4.a.f462328a.b("portrait_game_outfits_data_available");
            this.f114942r = false;
            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1740, 10);
        }
    }

    public final void u1(boolean z17) {
        com.tencent.mm.plugin.finder.live.view.FinderLiveGameInfoView finderLiveGameInfoView = this.f114940p;
        android.view.ViewGroup.LayoutParams layoutParams = finderLiveGameInfoView.getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        android.widget.RelativeLayout.LayoutParams layoutParams2 = (android.widget.RelativeLayout.LayoutParams) layoutParams;
        android.view.ViewGroup viewGroup = this.f365323d;
        if (z17) {
            layoutParams2.bottomMargin = viewGroup.getContext().getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479653br);
            finderLiveGameInfoView.setSurfaceMgr(this.f114944t);
            finderLiveGameInfoView.setup((mm2.c1) S0().a(mm2.c1.class));
        } else {
            layoutParams2.bottomMargin = viewGroup.getContext().getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479704cz);
        }
        finderLiveGameInfoView.setLayoutParams(layoutParams2);
    }

    public final void v1(int i17, android.view.View preview, int i18) {
        kotlin.jvm.internal.o.g(preview, "preview");
        if (x0()) {
            return;
        }
        com.tencent.mm.plugin.finder.live.view.FinderLiveGameInfoView finderLiveGameInfoView = this.f114940p;
        android.view.ViewGroup.LayoutParams layoutParams = finderLiveGameInfoView.getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        android.widget.RelativeLayout.LayoutParams layoutParams2 = (android.widget.RelativeLayout.LayoutParams) layoutParams;
        if (i18 > 0) {
            layoutParams2.topMargin = i17 + i18;
            this.f114946v = i18;
        } else {
            int i19 = this.f114946v;
            if (i19 > 0) {
                layoutParams2.topMargin = i19 + i17;
            } else {
                layoutParams2.topMargin = preview.getHeight() + i17;
            }
        }
        finderLiveGameInfoView.setLayoutParams(layoutParams2);
        java.lang.Object[] objArr = {java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(preview.getHeight()), java.lang.Integer.valueOf(layoutParams2.topMargin), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18)};
        java.lang.String str = this.f114941q;
        com.tencent.mars.xlog.Log.i(str, "y:%d, preview.height:%d, topMargin:%d， topMarginPreviewParent:%d, previewHeight:%d", objArr);
        if (this.f114945u == null) {
            this.f114945u = preview;
        }
        w1();
        this.f114948x = new com.tencent.mm.plugin.finder.live.plugin.vi(this);
        finderLiveGameInfoView.getViewTreeObserver().addOnGlobalLayoutListener(this.f114948x);
        com.tencent.mars.xlog.Log.i(str, "gameInfoLayoutListener:" + this.f114948x + " attach");
    }

    public final void w1() {
        com.tencent.mars.xlog.Log.i(this.f114941q, "gameInfoLayoutListener:" + this.f114948x + " deAttach");
        android.view.ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = this.f114948x;
        if (onGlobalLayoutListener != null) {
            this.f114940p.getViewTreeObserver().removeOnGlobalLayoutListener(onGlobalLayoutListener);
        }
        this.f114948x = null;
    }
}
