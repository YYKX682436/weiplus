package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class t20 extends com.tencent.mm.plugin.finder.live.plugin.l {

    /* renamed from: p, reason: collision with root package name */
    public final android.view.ViewGroup f114331p;

    /* renamed from: q, reason: collision with root package name */
    public final java.lang.String f114332q;

    /* renamed from: r, reason: collision with root package name */
    public final jz5.g f114333r;

    /* renamed from: s, reason: collision with root package name */
    public final jz5.g f114334s;

    /* renamed from: t, reason: collision with root package name */
    public final jz5.g f114335t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t20(android.view.ViewGroup rootView, qo0.c statusMonitor) {
        super(rootView, statusMonitor, null);
        kotlin.jvm.internal.o.g(rootView, "rootView");
        kotlin.jvm.internal.o.g(statusMonitor, "statusMonitor");
        this.f114331p = rootView;
        this.f114332q = "FinderLiveOneClickGameTipsPlugin";
        this.f114333r = jz5.h.b(new com.tencent.mm.plugin.finder.live.plugin.s20(this));
        this.f114334s = jz5.h.b(new com.tencent.mm.plugin.finder.live.plugin.j20(this));
        this.f114335t = jz5.h.b(new com.tencent.mm.plugin.finder.live.plugin.g20(this));
        rootView.setOnTouchListener(new com.tencent.mm.plugin.finder.live.plugin.f20(this));
    }

    public static final void t1(com.tencent.mm.plugin.finder.live.plugin.t20 t20Var, android.view.View view) {
        t20Var.getClass();
        android.graphics.Point b17 = com.tencent.mm.ui.bl.b(com.tencent.mm.sdk.platformtools.x2.f193071a);
        int i17 = b17.y;
        int i18 = b17.x;
        int i19 = !t20Var.x0() ? i17 : i18;
        int i27 = !t20Var.x0() ? i18 : i17;
        int[] t17 = pm0.v.t(view);
        int width = t17[0] + view.getWidth();
        int i28 = t17[1];
        android.view.ViewGroup viewGroup = t20Var.f114331p;
        float dimension = viewGroup.getContext().getResources().getDimension(com.tencent.mm.R.dimen.f479644bj);
        float dimension2 = viewGroup.getContext().getResources().getDimension(com.tencent.mm.R.dimen.f479672c9);
        float dimension3 = viewGroup.getContext().getResources().getDimension(com.tencent.mm.R.dimen.f479688cn);
        float f17 = (i19 - i28) - dimension;
        if (!zl2.r4.f473950a.w1()) {
            f17 -= dimension3;
        }
        jz5.g gVar = t20Var.f114333r;
        float f18 = 2;
        float width2 = ((i27 - width) + (view.getWidth() / 2)) - ((((android.widget.TextView) ((jz5.n) gVar).getValue()).getPaint().measureText(((android.widget.TextView) ((jz5.n) gVar).getValue()).getText().toString()) + viewGroup.getContext().getResources().getDimension(com.tencent.mm.R.dimen.f479714d7)) / f18);
        if (width2 >= dimension2) {
            dimension2 = width2;
        }
        viewGroup.setPadding(viewGroup.getPaddingLeft(), viewGroup.getPaddingTop(), (int) dimension2, (int) f17);
        android.widget.LinearLayout linearLayout = viewGroup instanceof android.widget.LinearLayout ? (android.widget.LinearLayout) viewGroup : null;
        if (linearLayout != null) {
            linearLayout.setGravity(85);
        }
        float width3 = ((i27 - dimension2) - width) + ((view.getWidth() / 2) - (viewGroup.getContext().getResources().getDimension(com.tencent.mm.R.dimen.f479738dv) / f18));
        jz5.g gVar2 = t20Var.f114335t;
        android.view.ViewGroup.LayoutParams layoutParams = ((android.view.View) ((jz5.n) gVar2).getValue()).getLayoutParams();
        android.widget.LinearLayout.LayoutParams layoutParams2 = layoutParams instanceof android.widget.LinearLayout.LayoutParams ? (android.widget.LinearLayout.LayoutParams) layoutParams : null;
        if (layoutParams2 != null) {
            layoutParams2.rightMargin = (int) width3;
            layoutParams2.bottomMargin = (int) viewGroup.getContext().getResources().getDimension(com.tencent.mm.R.dimen.f479738dv);
            ((android.view.View) ((jz5.n) gVar2).getValue()).setLayoutParams(layoutParams2);
        }
        if (zl2.q4.f473933a.E()) {
            com.tencent.mars.xlog.Log.i(t20Var.f114332q, "targetView = " + view + ",targetViewLoc-x = " + t17[0] + ", screenHeightHardWare = " + i17 + ", screenWidthHardWare = " + i18 + ", targetViewRight = " + width + ", targetViewTop = " + i28 + ", paddingBottom = " + f17 + ", paddingEnd = " + dimension2 + ", ");
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
        if (ordinal == 123 || ordinal == 126) {
            u1();
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean k() {
        return ((mm2.c1) P0(mm2.c1.class)).f328801f2 != 2;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean r() {
        return true;
    }

    public final void u1() {
        com.tencent.mm.plugin.finder.live.widget.dk dkVar;
        com.tencent.mm.plugin.finder.live.plugin.ui uiVar = (com.tencent.mm.plugin.finder.live.plugin.ui) X0(com.tencent.mm.plugin.finder.live.plugin.ui.class);
        if ((uiVar == null || (dkVar = uiVar.f114568p) == null) ? false : kotlin.jvm.internal.o.b(dkVar.c(), java.lang.Boolean.TRUE)) {
            v1();
            return;
        }
        if (w0() != 0) {
            java.lang.String str = ((mm2.c1) P0(mm2.c1.class)).f328839l6;
            if (str == null || str.length() == 0) {
                return;
            }
            x1(((mm2.c1) P0(mm2.c1.class)).f328839l6, new com.tencent.mm.plugin.finder.live.plugin.i20(this));
            return;
        }
        android.view.View w17 = w1();
        if (w17 != null) {
            if (!w17.isShown()) {
                w17 = null;
            }
            if (w17 != null) {
                w17.post(new com.tencent.mm.plugin.finder.live.plugin.h20(this, w17));
                return;
            }
        }
        v1();
    }

    public final void v1() {
        K0(8);
    }

    public final android.view.View w1() {
        if (((mm2.c1) P0(mm2.c1.class)).T) {
            com.tencent.mm.plugin.finder.live.plugin.ag0 ag0Var = (com.tencent.mm.plugin.finder.live.plugin.ag0) X0(com.tencent.mm.plugin.finder.live.plugin.ag0.class);
            if (ag0Var != null) {
                return ag0Var.G1();
            }
            return null;
        }
        if (zl2.r4.f473950a.w1()) {
            com.tencent.mm.plugin.finder.live.plugin.c4 c4Var = (com.tencent.mm.plugin.finder.live.plugin.c4) X0(com.tencent.mm.plugin.finder.live.plugin.c4.class);
            if (c4Var != null) {
                return c4Var.D.f118898d;
            }
            return null;
        }
        com.tencent.mm.plugin.finder.live.plugin.ag0 ag0Var2 = (com.tencent.mm.plugin.finder.live.plugin.ag0) X0(com.tencent.mm.plugin.finder.live.plugin.ag0.class);
        if (ag0Var2 != null) {
            return ag0Var2.G1();
        }
        return null;
    }

    public final void x1(java.lang.String str, yz5.a callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        if (kotlin.jvm.internal.o.b(((mm2.c1) P0(mm2.c1.class)).J2.getValue(), java.lang.Boolean.TRUE)) {
            com.tencent.mars.xlog.Log.i(this.f114332q, "[refreshBubble] bubble confilct");
            return;
        }
        android.view.View w17 = w1();
        if (w17 != null) {
            if (!w17.isShown()) {
                w17 = null;
            }
            if (w17 != null) {
                w17.post(new com.tencent.mm.plugin.finder.live.plugin.p20(this, str, w17, callback));
                return;
            }
        }
        v1();
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l, qo0.a
    public void z0() {
        com.tencent.mm.plugin.finder.live.infrastructure.livedata.LiveMutableData liveMutableData;
        super.z0();
        ((mm2.c1) P0(mm2.c1.class)).f328805f6.observe(this, new com.tencent.mm.plugin.finder.live.plugin.m20(this));
        ((mm2.c1) P0(mm2.c1.class)).K2.observe(this, new com.tencent.mm.plugin.finder.live.plugin.n20(this));
        jf2.k0 k0Var = (jf2.k0) U0(jf2.k0.class);
        if (k0Var == null || (liveMutableData = k0Var.f299387v) == null) {
            return;
        }
        liveMutableData.f111660d = true;
        liveMutableData.observe(this, new com.tencent.mm.plugin.finder.live.plugin.o20(this));
    }
}
