package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class le0 extends com.tencent.mm.plugin.finder.live.plugin.l {

    /* renamed from: p, reason: collision with root package name */
    public final android.widget.ImageView f113387p;

    /* renamed from: q, reason: collision with root package name */
    public final android.view.ViewGroup f113388q;

    /* renamed from: r, reason: collision with root package name */
    public final qo0.c f113389r;

    /* renamed from: s, reason: collision with root package name */
    public final java.lang.String f113390s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public le0(android.view.ViewGroup root, android.widget.ImageView videoOrientationBtn, android.view.ViewGroup videoOrientationBg, qo0.c statueMonitor) {
        super(root, statueMonitor, null);
        kotlin.jvm.internal.o.g(root, "root");
        kotlin.jvm.internal.o.g(videoOrientationBtn, "videoOrientationBtn");
        kotlin.jvm.internal.o.g(videoOrientationBg, "videoOrientationBg");
        kotlin.jvm.internal.o.g(statueMonitor, "statueMonitor");
        this.f113387p = videoOrientationBtn;
        this.f113388q = videoOrientationBg;
        this.f113389r = statueMonitor;
        this.f113390s = "Finder.LiveVideoOrientationPlugin";
        ((mm2.c1) P0(mm2.c1.class)).R5 = false;
        root.setOnClickListener(new com.tencent.mm.plugin.finder.live.plugin.ee0(this, root));
        root.post(new com.tencent.mm.plugin.finder.live.plugin.fe0(root));
        if (root.getLayoutParams() != null && (root.getLayoutParams() instanceof android.view.ViewGroup.MarginLayoutParams) && x0()) {
            android.view.ViewGroup.LayoutParams layoutParams = root.getLayoutParams();
            kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ((android.view.ViewGroup.MarginLayoutParams) layoutParams).setMarginEnd(com.tencent.mm.ui.zk.a(root.getContext(), 28));
        }
    }

    public static void w1(com.tencent.mm.plugin.finder.live.plugin.le0 le0Var, int i17, int i18, int i19, java.lang.Object obj) {
        if ((i19 & 2) != 0) {
            i18 = 0;
        }
        boolean x07 = le0Var.x0();
        android.view.ViewGroup viewGroup = le0Var.f113388q;
        android.view.ViewGroup viewGroup2 = le0Var.f365323d;
        if (x07) {
            viewGroup.setBackground(null);
        } else {
            android.view.ViewGroup.LayoutParams layoutParams = viewGroup2.getLayoutParams();
            kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
            android.widget.RelativeLayout.LayoutParams layoutParams2 = (android.widget.RelativeLayout.LayoutParams) layoutParams;
            layoutParams2.topMargin = i17;
            layoutParams2.rightMargin = i18;
            viewGroup2.setLayoutParams(layoutParams2);
            viewGroup2.setTag(java.lang.Integer.valueOf(i17));
            viewGroup.setBackgroundResource(com.tencent.mm.R.drawable.atp);
        }
        if (((mm2.c1) le0Var.P0(mm2.c1.class)).L9()) {
            le0Var.K0(0);
        }
        if (!((mm2.c1) le0Var.S0().a(mm2.c1.class)).M7()) {
            android.content.Context context = viewGroup2.getContext();
            kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
            if (!((androidx.appcompat.app.AppCompatActivity) context).getIntent().hasExtra("KEY_MINI_APP_AD_FLOW_INFO")) {
                return;
            }
        }
        le0Var.K0(8);
    }

    @Override // qo0.a
    public void C0(java.util.LinkedHashMap micUserMap) {
        kotlin.jvm.internal.o.g(micUserMap, "micUserMap");
        int i17 = this.f365323d.getContext().getResources().getConfiguration().orientation;
        com.tencent.mars.xlog.Log.i(this.f113390s, "onMicUserChanged: micUserMap.size:" + micUserMap.size() + ", curOrientation:" + i17);
        if (micUserMap.size() <= 1) {
            x1(((mm2.c1) P0(mm2.c1.class)).L9(), false);
            return;
        }
        K0(8);
        if (i17 == 2) {
            com.tencent.mm.plugin.finder.live.plugin.l.q1(this, "PORTRAIT_ACTION_CHANGE_VIDEO", null, 2, null);
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean G() {
        return true;
    }

    @Override // qo0.a
    public void J0() {
        t1();
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l, qo0.a
    public void K0(int i17) {
        boolean d86 = ((mm2.c1) P0(mm2.c1.class)).d8();
        int i18 = (i17 == 0 && (com.tencent.mm.ui.bk.y() || d86 || ((mm2.c1) P0(mm2.c1.class)).f8())) ? 8 : i17;
        com.tencent.mars.xlog.Log.i(this.f113390s, "setVisible: isMicLinking:" + d86 + ", visible:" + i17 + ", newVisible:" + i18);
        super.K0(i18);
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l, qo0.a
    public void M0(qo0.b status, android.os.Bundle bundle) {
        kotlin.jvm.internal.o.g(status, "status");
        int ordinal = status.ordinal();
        if (ordinal != 5) {
            if (ordinal == 7) {
                ((mm2.h7) P0(mm2.h7.class)).f329115g.observe(this, new com.tencent.mm.plugin.finder.live.plugin.he0(this));
                ((mm2.h7) P0(mm2.h7.class)).f329121p.observe(this, new com.tencent.mm.plugin.finder.live.plugin.ie0(this));
                ((mm2.w) P0(mm2.w.class)).f329503o.observe(this, new com.tencent.mm.plugin.finder.live.plugin.je0(this));
                t1();
                return;
            }
            if (ordinal != 27 && ordinal != 28 && ordinal != 199) {
                if (ordinal != 200) {
                    return;
                }
                x1(((mm2.c1) P0(mm2.c1.class)).L9(), true);
                t1();
                return;
            }
        }
        K0(8);
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l
    public void g1(android.content.res.Configuration configuration) {
        if (com.tencent.mm.ui.bk.y()) {
            K0(8);
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean k() {
        return true;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean r() {
        return true;
    }

    public final void t1() {
        com.tencent.mm.plugin.finder.live.view.k0 k0Var;
        boolean O6 = ((mm2.w) P0(mm2.w.class)).O6();
        android.widget.ImageView imageView = this.f113387p;
        qo0.c cVar = this.f113389r;
        java.lang.String str = this.f113390s;
        if (!O6 && !((mm2.c1) P0(mm2.c1.class)).f8()) {
            vf2.w wVar = (vf2.w) U0(vf2.w.class);
            boolean z17 = false;
            if (wVar != null && wVar.f436363m) {
                z17 = true;
            }
            if (!z17) {
                com.tencent.mars.xlog.Log.i(str, "checkAlpha 1");
                imageView.setAlpha(1.0f);
                k0Var = cVar instanceof com.tencent.mm.plugin.finder.live.view.k0 ? (com.tencent.mm.plugin.finder.live.view.k0) cVar : null;
                if (k0Var != null) {
                    k0Var.enableRotation();
                    return;
                }
                return;
            }
        }
        com.tencent.mars.xlog.Log.i(str, "checkAlpha 0");
        k0Var = cVar instanceof com.tencent.mm.plugin.finder.live.view.k0 ? (com.tencent.mm.plugin.finder.live.view.k0) cVar : null;
        if (k0Var != null) {
            k0Var.disableRatation();
        }
        imageView.setAlpha(0.0f);
    }

    public final void u1(android.view.View view) {
        android.view.ViewGroup viewGroup;
        if (w0() != 0 || view == null) {
            return;
        }
        android.view.ViewGroup viewGroup2 = this.f365323d;
        if (!(viewGroup2.getTag() instanceof java.lang.Integer) || x0()) {
            return;
        }
        com.tencent.mm.plugin.finder.live.plugin.wi wiVar = (com.tencent.mm.plugin.finder.live.plugin.wi) X0(com.tencent.mm.plugin.finder.live.plugin.wi.class);
        if (!(wiVar != null && wiVar.w0() == 0)) {
            df2.vh vhVar = (df2.vh) U0(df2.vh.class);
            r1 = vhVar != null ? vhVar.Z6() : 0;
            com.tencent.mars.xlog.Log.i(this.f113390s, "checkLayoutParam gameBannerHeight:" + r1);
        } else if (wiVar != null && (viewGroup = wiVar.f365323d) != null) {
            r1 = viewGroup.getHeight();
        }
        java.lang.Object tag = viewGroup2.getTag();
        kotlin.jvm.internal.o.e(tag, "null cannot be cast to non-null type kotlin.Int");
        int intValue = ((java.lang.Integer) tag).intValue() + r1;
        android.view.ViewGroup.LayoutParams layoutParams = viewGroup2.getLayoutParams();
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
        java.lang.Integer valueOf = marginLayoutParams != null ? java.lang.Integer.valueOf(marginLayoutParams.topMargin) : null;
        if (valueOf != null && valueOf.intValue() == intValue) {
            return;
        }
        android.view.ViewGroup.LayoutParams layoutParams2 = viewGroup2.getLayoutParams();
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams2 : null;
        if (marginLayoutParams2 != null) {
            marginLayoutParams2.topMargin = intValue;
        }
        viewGroup2.requestLayout();
    }

    public final void v1(int i17, int i18, int i19) {
        int Z6;
        android.view.ViewGroup viewGroup;
        boolean x07 = x0();
        android.view.ViewGroup viewGroup2 = this.f113388q;
        android.view.ViewGroup viewGroup3 = this.f365323d;
        if (x07) {
            android.view.ViewGroup.LayoutParams layoutParams = viewGroup3.getLayoutParams();
            kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ((android.view.ViewGroup.MarginLayoutParams) layoutParams).setMarginEnd(com.tencent.mm.ui.zk.a(viewGroup3.getContext(), 28));
            viewGroup2.setBackground(null);
        } else {
            com.tencent.mm.plugin.finder.live.plugin.wi wiVar = (com.tencent.mm.plugin.finder.live.plugin.wi) X0(com.tencent.mm.plugin.finder.live.plugin.wi.class);
            if (wiVar != null && wiVar.w0() == 0) {
                Z6 = (wiVar == null || (viewGroup = wiVar.f365323d) == null) ? 0 : viewGroup.getHeight();
            } else {
                df2.vh vhVar = (df2.vh) U0(df2.vh.class);
                Z6 = vhVar != null ? vhVar.Z6() : 0;
                com.tencent.mars.xlog.Log.i(this.f113390s, "requestLayout gameBannerHeight:" + Z6);
            }
            android.view.ViewGroup.LayoutParams layoutParams2 = viewGroup3.getLayoutParams();
            kotlin.jvm.internal.o.e(layoutParams2, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
            android.widget.RelativeLayout.LayoutParams layoutParams3 = (android.widget.RelativeLayout.LayoutParams) layoutParams2;
            int i27 = i18 + i19;
            layoutParams3.topMargin = Z6 + i27;
            viewGroup3.setTag(java.lang.Integer.valueOf(i27));
            layoutParams3.rightMargin = i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 4);
            viewGroup3.setLayoutParams(layoutParams3);
            viewGroup2.setBackgroundResource(com.tencent.mm.R.drawable.atp);
        }
        if (((mm2.c1) P0(mm2.c1.class)).L9()) {
            K0(0);
        }
        if (!((mm2.c1) S0().a(mm2.c1.class)).M7()) {
            android.content.Context context = viewGroup3.getContext();
            kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
            if (!((androidx.appcompat.app.AppCompatActivity) context).getIntent().hasExtra("KEY_MINI_APP_AD_FLOW_INFO")) {
                return;
            }
        }
        K0(8);
    }

    public final void x1(boolean z17, boolean z18) {
        android.view.ViewGroup viewGroup = this.f365323d;
        int i17 = viewGroup.getContext().getResources().getConfiguration().orientation;
        java.lang.String str = this.f113390s;
        com.tencent.mars.xlog.Log.i(str, "setLayoutOrientation isFitRenderMode:" + z17 + ",orientaion:" + i17);
        if (!z17) {
            K0(8);
            com.tencent.mars.xlog.Log.i(str, "setLayoutOrientation gone 1");
            return;
        }
        if (!z18 && pm0.v.z(((mm2.c1) P0(mm2.c1.class)).f328807g2, 524288)) {
            K0(8);
            com.tencent.mars.xlog.Log.i(str, "setLayoutOrientation gone 2");
            return;
        }
        android.widget.ImageView imageView = this.f113387p;
        if (i17 == 1) {
            imageView.setImageDrawable(com.tencent.mm.ui.uk.e(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.raw.icons_outlined_vtoh_new, -1));
            K0(0);
            ((ml2.r0) i95.n0.c(ml2.r0.class)).xk(0, 1, ml2.s3.f327924d);
            i95.m c17 = i95.n0.c(ml2.j0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            zy2.zb.I8((zy2.zb) c17, ml2.u1.f328091v, kz5.c1.l(new jz5.l("screen_type", "1")), null, null, null, null, false, 124, null);
        } else if (i17 != 2) {
            K0(8);
            com.tencent.mars.xlog.Log.i(str, "setLayoutOrientation gone 3");
        } else {
            imageView.setImageDrawable(com.tencent.mm.ui.uk.e(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.raw.icons_outlined_htov_new, -1));
            K0(0);
            ((ml2.r0) i95.n0.c(ml2.r0.class)).xk(0, 2, ml2.s3.f327924d);
            i95.m c18 = i95.n0.c(ml2.j0.class);
            kotlin.jvm.internal.o.f(c18, "getService(...)");
            zy2.zb.I8((zy2.zb) c18, ml2.u1.f328091v, kz5.c1.l(new jz5.l("screen_type", "2")), null, null, null, null, false, 124, null);
        }
        if (!((mm2.c1) S0().a(mm2.c1.class)).M7()) {
            android.content.Context context = viewGroup.getContext();
            kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
            if (!((androidx.appcompat.app.AppCompatActivity) context).getIntent().hasExtra("KEY_MINI_APP_AD_FLOW_INFO")) {
                com.tencent.mars.xlog.Log.i(str, "forbidSetLandscape: " + ((mm2.c1) P0(mm2.c1.class)).B2);
                if (!((mm2.c1) P0(mm2.c1.class)).B2) {
                    return;
                }
            }
        }
        K0(8);
        com.tencent.mars.xlog.Log.i(str, "setLayoutOrientation gone 4");
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l, qo0.a
    public void z0() {
        super.z0();
        ((mm2.f6) P0(mm2.f6.class)).f329046t.observe(this, new com.tencent.mm.plugin.finder.live.plugin.ke0(this));
    }
}
