package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class t8 extends com.tencent.mm.plugin.finder.live.plugin.l {

    /* renamed from: p, reason: collision with root package name */
    public final qo0.c f114354p;

    /* renamed from: q, reason: collision with root package name */
    public final java.lang.String f114355q;

    /* renamed from: r, reason: collision with root package name */
    public final android.widget.TextView f114356r;

    /* renamed from: s, reason: collision with root package name */
    public int f114357s;

    /* renamed from: t, reason: collision with root package name */
    public long f114358t;

    /* renamed from: u, reason: collision with root package name */
    public final long f114359u;

    /* renamed from: v, reason: collision with root package name */
    public final jz5.g f114360v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t8(android.view.ViewGroup root, qo0.c statusMonitor) {
        super(root, statusMonitor, null);
        kotlin.jvm.internal.o.g(root, "root");
        kotlin.jvm.internal.o.g(statusMonitor, "statusMonitor");
        this.f114354p = statusMonitor;
        this.f114355q = "Finder.FinderLiveAnchorPausePlugin";
        android.widget.TextView textView = (android.widget.TextView) root.findViewById(com.tencent.mm.R.id.kqa);
        android.widget.TextView textView2 = (android.widget.TextView) root.findViewById(com.tencent.mm.R.id.kqb);
        this.f114356r = textView2;
        android.widget.TextView textView3 = (android.widget.TextView) root.findViewById(com.tencent.mm.R.id.f486664m21);
        this.f114359u = 10L;
        root.setOnClickListener(com.tencent.mm.plugin.finder.live.plugin.n8.f113597d);
        textView3.setOnClickListener(new com.tencent.mm.plugin.finder.live.plugin.o8(this));
        if (x0()) {
            android.view.ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
            if (marginLayoutParams != null) {
                marginLayoutParams.topMargin = i65.a.b(root.getContext(), 120);
            }
        }
        com.tencent.mm.ui.bk.r0(textView.getPaint(), 0.8f);
        com.tencent.mm.ui.bk.r0(textView2.getPaint(), 0.8f);
        com.tencent.mm.ui.bk.r0(textView3.getPaint(), 0.8f);
        this.f114360v = jz5.h.b(new com.tencent.mm.plugin.finder.live.plugin.s8(this));
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean G() {
        return true;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l, qo0.a
    public void M0(qo0.b status, android.os.Bundle bundle) {
        kotlin.jvm.internal.o.g(status, "status");
        int ordinal = status.ordinal();
        if (ordinal == 191) {
            t1();
            return;
        }
        java.lang.String str = this.f114355q;
        if (ordinal != 200) {
            if (ordinal == 214 && w0() == 0) {
                com.tencent.mars.xlog.Log.i(str, "anchor verification start, hide pause plugin");
                K0(8);
                u1().d();
                return;
            }
            return;
        }
        boolean z17 = bundle != null ? bundle.getBoolean("PARAM_FINDER_LIVE_ANCHOR_PAUSE_RECOVERY", false) : false;
        com.tencent.mm.sdk.platformtools.Log.c(str, "resumeLiveLogic showRecoveryView:" + z17, new java.lang.Object[0]);
        K0(8);
        u1().d();
        com.tencent.mm.plugin.finder.live.view.k0.hideLoadingLayer$default(R0(), false, 1, null);
        if (z17) {
            qo0.c.a(this.f114354p, qo0.b.f365413s4, null, 2, null);
            return;
        }
        in0.q e17 = dk2.ef.f233372a.e();
        if (e17 != null) {
            e17.r0();
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l, qo0.a
    public void O0() {
        u1().d();
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean k() {
        return ((mm2.c1) P0(mm2.c1.class)).f328801f2 != 1;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean r() {
        return false;
    }

    public final void t1() {
        com.tencent.mm.plugin.finder.live.plugin.h8 h8Var;
        te2.j0 j0Var;
        if (((mm2.c1) P0(mm2.c1.class)).a8() && pm0.v.z(((mm2.c1) P0(mm2.c1.class)).f328807g2, 524288) && !pm0.v.z(((mm2.c1) P0(mm2.c1.class)).f328807g2, 32)) {
            long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
            long j17 = ((mm2.c1) P0(mm2.c1.class)).T4;
            this.f114357s = (1L > j17 ? 1 : (1L == j17 ? 0 : -1)) <= 0 && (j17 > elapsedRealtime ? 1 : (j17 == elapsedRealtime ? 0 : -1)) < 0 ? (int) ((elapsedRealtime - ((mm2.c1) P0(mm2.c1.class)).T4) / 1000) : ((mm2.c1) P0(mm2.c1.class)).U4;
            java.lang.String str = this.f114355q;
            com.tencent.mm.sdk.platformtools.Log.c(str, "showLivePauseView curTime:" + elapsedRealtime + ", anchorPauseStartTime:" + ((mm2.c1) P0(mm2.c1.class)).T4 + ", anchorPauseTimeCount:" + ((mm2.c1) P0(mm2.c1.class)).U4 + ", remainTime:" + this.f114357s, new java.lang.Object[0]);
            int i17 = this.f114357s;
            android.view.ViewGroup viewGroup = this.f365323d;
            if (i17 < 0) {
                K0(8);
                db5.t7.makeText(viewGroup.getContext(), viewGroup.getContext().getResources().getString(com.tencent.mm.R.string.e3k), 0).show();
                com.tencent.mars.xlog.Log.e(str, "show pause live error,remain time:" + this.f114357s + " illegal!");
                return;
            }
            this.f114356r.setText(no0.m.f338730a.b(i17, ":"));
            R0().fillBlurBg(((mm2.c1) P0(mm2.c1.class)).f328852o, true);
            R0().showBlurBg();
            K0(0);
            dk2.vg d17 = ((mm2.c1) P0(mm2.c1.class)).Z6().d();
            if (d17 != null && (h8Var = (com.tencent.mm.plugin.finder.live.plugin.h8) X0(com.tencent.mm.plugin.finder.live.plugin.h8.class)) != null && (j0Var = h8Var.f112785q) != null) {
                ((te2.p1) j0Var).i(d17, ((mm2.c1) P0(mm2.c1.class)).Z6().f233875d);
            }
            in0.q e17 = dk2.ef.f233372a.e();
            if (e17 != null) {
                e17.k0();
            }
            u1().d();
            u1().c(1000L, 1000L);
            if (zl2.r4.f473950a.z1(S0())) {
                viewGroup.setBackground(null);
            }
        }
    }

    public final com.tencent.mm.sdk.platformtools.b4 u1() {
        return (com.tencent.mm.sdk.platformtools.b4) ((jz5.n) this.f114360v).getValue();
    }
}
