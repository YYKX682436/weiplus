package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class i30 extends com.tencent.mm.plugin.finder.live.plugin.l {
    public final java.lang.String A;
    public int B;

    /* renamed from: p, reason: collision with root package name */
    public final android.view.ViewGroup f112902p;

    /* renamed from: q, reason: collision with root package name */
    public final java.lang.String f112903q;

    /* renamed from: r, reason: collision with root package name */
    public final jz5.g f112904r;

    /* renamed from: s, reason: collision with root package name */
    public final jz5.g f112905s;

    /* renamed from: t, reason: collision with root package name */
    public final jz5.g f112906t;

    /* renamed from: u, reason: collision with root package name */
    public com.tencent.mm.view.MMPAGView f112907u;

    /* renamed from: v, reason: collision with root package name */
    public final jz5.g f112908v;

    /* renamed from: w, reason: collision with root package name */
    public final jz5.g f112909w;

    /* renamed from: x, reason: collision with root package name */
    public ce2.i f112910x;

    /* renamed from: y, reason: collision with root package name */
    public final java.lang.String f112911y;

    /* renamed from: z, reason: collision with root package name */
    public final java.lang.String f112912z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i30(android.view.ViewGroup rootView, qo0.c statusMonitor) {
        super(rootView, statusMonitor, null);
        kotlin.jvm.internal.o.g(rootView, "rootView");
        kotlin.jvm.internal.o.g(statusMonitor, "statusMonitor");
        this.f112902p = rootView;
        this.f112903q = "FinderLiveOneClickGiftPlugin";
        this.f112904r = jz5.h.b(new com.tencent.mm.plugin.finder.live.plugin.h30(this));
        this.f112905s = jz5.h.b(new com.tencent.mm.plugin.finder.live.plugin.g30(this));
        this.f112906t = jz5.h.b(new com.tencent.mm.plugin.finder.live.plugin.a30(this));
        this.f112908v = jz5.h.b(new com.tencent.mm.plugin.finder.live.plugin.z20(this));
        this.f112909w = jz5.h.b(new com.tencent.mm.plugin.finder.live.plugin.y20(this));
        this.f112911y = "live_gift_bubble_gift_id";
        this.f112912z = "live_gift_bubble_text";
        this.A = "live_gift_bubble_flip_type";
        this.B = 8;
        rootView.setOnTouchListener(new com.tencent.mm.plugin.finder.live.plugin.u20(this));
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).pk(v1(), "live_gift_bubble");
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ik(v1(), 32, 25561);
        v1().setOnClickListener(new com.tencent.mm.plugin.finder.live.plugin.w20(this, statusMonitor));
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean G() {
        return true;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l, qo0.a
    public void M0(qo0.b status, android.os.Bundle bundle) {
        android.view.ViewGroup J1;
        kotlin.jvm.internal.o.g(status, "status");
        if (com.tencent.mm.plugin.finder.live.plugin.x20.f115021a[status.ordinal()] == 1 && w0() == 0) {
            com.tencent.mm.plugin.finder.live.plugin.ag0 ag0Var = (com.tencent.mm.plugin.finder.live.plugin.ag0) X0(com.tencent.mm.plugin.finder.live.plugin.ag0.class);
            jz5.f0 f0Var = null;
            if (ag0Var != null && (J1 = ag0Var.J1()) != null) {
                if (!J1.isShown()) {
                    J1 = null;
                }
                if (J1 != null) {
                    t1(J1);
                    f0Var = jz5.f0.f302826a;
                }
            }
            if (f0Var == null) {
                u1();
            }
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

    public final void t1(android.view.View view) {
        android.graphics.Point b17 = com.tencent.mm.ui.bl.b(com.tencent.mm.sdk.platformtools.x2.f193071a);
        int i17 = b17.y;
        int i18 = b17.x;
        int i19 = (!x0() || com.tencent.mm.ui.bk.d0()) ? i17 : i18;
        int i27 = (!x0() || com.tencent.mm.ui.bk.d0()) ? i18 : i17;
        int[] t17 = pm0.v.t(view);
        int width = t17[0] + view.getWidth();
        int i28 = t17[1];
        android.view.ViewGroup viewGroup = this.f112902p;
        float dimension = viewGroup.getContext().getResources().getDimension(com.tencent.mm.R.dimen.f479738dv);
        float dimension2 = viewGroup.getContext().getResources().getDimension(com.tencent.mm.R.dimen.f479672c9);
        float f17 = (i19 - i28) - dimension;
        float dimension3 = (i27 - width) - viewGroup.getContext().getResources().getDimension(com.tencent.mm.R.dimen.f479731dn);
        if (dimension3 >= dimension2) {
            dimension2 = dimension3;
        }
        viewGroup.setPadding(viewGroup.getPaddingLeft(), viewGroup.getPaddingTop(), (int) dimension2, (int) f17);
        android.widget.LinearLayout linearLayout = viewGroup instanceof android.widget.LinearLayout ? (android.widget.LinearLayout) viewGroup : null;
        if (linearLayout != null) {
            linearLayout.setGravity(85);
        }
        float width2 = ((i27 - dimension2) - width) + ((view.getWidth() / 2) - (viewGroup.getContext().getResources().getDimension(com.tencent.mm.R.dimen.f479688cn) / 2));
        jz5.g gVar = this.f112909w;
        android.view.ViewGroup.LayoutParams layoutParams = ((android.view.View) ((jz5.n) gVar).getValue()).getLayoutParams();
        android.widget.LinearLayout.LayoutParams layoutParams2 = layoutParams instanceof android.widget.LinearLayout.LayoutParams ? (android.widget.LinearLayout.LayoutParams) layoutParams : null;
        if (layoutParams2 != null) {
            layoutParams2.rightMargin = (int) width2;
            ((android.view.View) ((jz5.n) gVar).getValue()).setLayoutParams(layoutParams2);
        }
        if (zl2.q4.f473933a.E()) {
            com.tencent.mars.xlog.Log.i(this.f112903q, "targetView = " + view + ",targetViewLoc-x = " + t17[0] + ", screenHeightHardWare = " + i17 + ", screenWidthHardWare = " + i18 + ", targetViewRight = " + width + ", targetViewTop = " + i28 + ", paddingBottom = " + f17 + ", paddingEnd = " + dimension2 + ", ");
        }
    }

    public final void u1() {
        K0(8);
        this.B = 8;
        com.tencent.mm.view.MMPAGView mMPAGView = this.f112907u;
        if (mMPAGView != null) {
            mMPAGView.n();
        }
        this.f112907u = null;
    }

    public final android.view.View v1() {
        return (android.view.View) this.f112908v.getValue();
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l, qo0.a
    public void z0() {
        com.tencent.mm.plugin.finder.live.infrastructure.livedata.LiveMutableData liveMutableData;
        com.tencent.mm.plugin.finder.live.infrastructure.livedata.LiveMutableData liveMutableData2;
        super.z0();
        ((je2.w) P0(je2.w.class)).f299281h.observe(this, new com.tencent.mm.plugin.finder.live.plugin.b30(this));
        ((mm2.c1) P0(mm2.c1.class)).f328886t3.observe(this, new com.tencent.mm.plugin.finder.live.plugin.d30(this));
        df2.a9 a9Var = (df2.a9) U0(df2.a9.class);
        if (a9Var != null && (liveMutableData2 = a9Var.A) != null) {
            liveMutableData2.observe(this, new com.tencent.mm.plugin.finder.live.plugin.e30(this));
        }
        jf2.k0 k0Var = (jf2.k0) U0(jf2.k0.class);
        if (k0Var == null || (liveMutableData = k0Var.f299387v) == null) {
            return;
        }
        liveMutableData.f111660d = true;
        liveMutableData.observe(this, new com.tencent.mm.plugin.finder.live.plugin.f30(this));
    }
}
