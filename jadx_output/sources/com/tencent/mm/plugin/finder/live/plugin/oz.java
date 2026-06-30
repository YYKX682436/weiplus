package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class oz extends com.tencent.mm.plugin.finder.live.plugin.l {

    /* renamed from: p, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.util.CommonCircleIndicator f113804p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f113805q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oz(android.view.ViewGroup root, qo0.c statusMonitor) {
        super(root, statusMonitor, null);
        kotlin.jvm.internal.o.g(root, "root");
        kotlin.jvm.internal.o.g(statusMonitor, "statusMonitor");
        android.view.View findViewById = root.findViewById(com.tencent.mm.R.id.bwo);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f113804p = (com.tencent.mm.plugin.finder.live.util.CommonCircleIndicator) findViewById;
        super.K0(8);
        com.tencent.mm.plugin.finder.live.plugin.iz izVar = new com.tencent.mm.plugin.finder.live.plugin.iz(this, root);
        java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
        n3.a1.u(root, izVar);
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean G() {
        return true;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l, qo0.a
    public void K0(int i17) {
        super.K0(i17);
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l, qo0.a
    public void M0(qo0.b status, android.os.Bundle bundle) {
        kotlin.jvm.internal.o.g(status, "status");
        if (com.tencent.mm.plugin.finder.live.plugin.jz.f113173a[status.ordinal()] == 1) {
            ((mm2.h7) P0(mm2.h7.class)).f329120o.observe(this, new com.tencent.mm.plugin.finder.live.plugin.kz(this));
            ((mm2.h7) P0(mm2.h7.class)).f329115g.observe(this, new com.tencent.mm.plugin.finder.live.plugin.lz(this));
            ((mm2.h7) P0(mm2.h7.class)).f329121p.observe(this, new com.tencent.mm.plugin.finder.live.plugin.mz(this));
            ((mm2.w) P0(mm2.w.class)).f329503o.observe(this, new com.tencent.mm.plugin.finder.live.plugin.nz(this));
            boolean O6 = ((mm2.w) P0(mm2.w.class)).O6();
            com.tencent.mm.plugin.finder.live.util.CommonCircleIndicator commonCircleIndicator = this.f113804p;
            if (O6) {
                commonCircleIndicator.setAlpha(0.0f);
            } else {
                commonCircleIndicator.setAlpha(1.0f);
            }
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l, qo0.a
    public void O0() {
        super.O0();
        super.K0(8);
        this.f113805q = false;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean k() {
        return ((mm2.c1) P0(mm2.c1.class)).f328801f2 != 1;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean r() {
        return true;
    }

    public final void t1(int i17, int i18, int i19) {
        android.widget.RelativeLayout.LayoutParams layoutParams;
        android.content.res.Resources resources;
        int i27;
        int Z6;
        boolean x07 = x0();
        android.view.ViewGroup viewGroup = this.f365323d;
        if (!x07) {
            if (!((mm2.c1) P0(mm2.c1.class)).R7()) {
                android.view.ViewGroup.LayoutParams layoutParams2 = viewGroup.getLayoutParams();
                layoutParams = layoutParams2 instanceof android.widget.RelativeLayout.LayoutParams ? (android.widget.RelativeLayout.LayoutParams) layoutParams2 : null;
                if (layoutParams != null) {
                    layoutParams.addRule(12);
                    layoutParams.topMargin = 0;
                    layoutParams.bottomMargin = i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 14) + com.tencent.mm.ui.bl.c(viewGroup.getContext());
                }
            } else if (!x0()) {
                if (zl2.r4.f473950a.w1()) {
                    resources = viewGroup.getContext().getResources();
                    i27 = com.tencent.mm.R.dimen.f479704cz;
                } else {
                    resources = viewGroup.getContext().getResources();
                    i27 = com.tencent.mm.R.dimen.f479723df;
                }
                float dimension = resources.getDimension(i27);
                com.tencent.mm.plugin.finder.live.plugin.wi wiVar = (com.tencent.mm.plugin.finder.live.plugin.wi) X0(com.tencent.mm.plugin.finder.live.plugin.wi.class);
                if (wiVar != null && wiVar.w0() == 0) {
                    Z6 = wiVar.f365323d.getHeight();
                } else {
                    df2.vh vhVar = (df2.vh) U0(df2.vh.class);
                    Z6 = vhVar != null ? vhVar.Z6() : 0;
                    com.tencent.mars.xlog.Log.i("MultiStreamIndicatorPlugin", "requestLayout gameBannerHeight:" + Z6);
                }
                android.view.ViewGroup.LayoutParams layoutParams3 = viewGroup.getLayoutParams();
                layoutParams = layoutParams3 instanceof android.widget.RelativeLayout.LayoutParams ? (android.widget.RelativeLayout.LayoutParams) layoutParams3 : null;
                if (layoutParams != null) {
                    layoutParams.removeRule(12);
                    layoutParams.topMargin = (int) (i18 + i19 + Z6 + ((dimension - this.f113804p.getF115428h()) / 2));
                    layoutParams.bottomMargin = 0;
                }
            }
        }
        viewGroup.requestLayout();
        this.f113805q = true;
        java.lang.Integer num = (java.lang.Integer) ((mm2.h7) P0(mm2.h7.class)).f329120o.getValue();
        if (num == null) {
            num = 0;
        }
        if (num.intValue() > 1) {
            super.K0(0);
            com.tencent.mm.plugin.finder.live.plugin.l.b1(this, this.f365323d, "MultiStreamIndicatorPlugin", false, 4, null);
        }
    }
}
