package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class x00 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.m10 f120273d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.fr1 f120274e;

    public x00(com.tencent.mm.plugin.finder.live.widget.m10 m10Var, r45.fr1 fr1Var) {
        this.f120273d = m10Var;
        this.f120274e = fr1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        r45.v63 v63Var;
        android.view.ViewGroup viewGroup;
        android.view.View view2;
        r45.v63 v63Var2;
        r45.v63 v63Var3;
        r45.v63 v63Var4;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/FinderLiveVisitorGameTeamWidget$refreshBottomSheetText$1$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.live.widget.m10 m10Var = this.f120273d;
        m10Var.getClass();
        r45.fr1 fr1Var = this.f120274e;
        r45.q63 q63Var = (r45.q63) fr1Var.getCustom(7);
        if (q63Var != null && (v63Var = (r45.v63) q63Var.getCustom(10)) != null) {
            int i17 = 0;
            if (v63Var.getString(0) != null) {
                l81.b1 b1Var = new l81.b1();
                r45.q63 q63Var2 = (r45.q63) fr1Var.getCustom(7);
                java.lang.String str = null;
                b1Var.f317014b = (q63Var2 == null || (v63Var4 = (r45.v63) q63Var2.getCustom(10)) == null) ? null : v63Var4.getString(0);
                r45.q63 q63Var3 = (r45.q63) fr1Var.getCustom(7);
                if (q63Var3 != null && (v63Var3 = (r45.v63) q63Var3.getCustom(10)) != null) {
                    i17 = v63Var3.getInteger(2);
                }
                b1Var.f317016c = i17;
                zl2.r4 r4Var = zl2.r4.f473950a;
                if (r4Var.t0() != 0) {
                    b1Var.f317016c = r4Var.t0();
                }
                r45.q63 q63Var4 = (r45.q63) fr1Var.getCustom(7);
                if (q63Var4 != null && (v63Var2 = (r45.v63) q63Var4.getCustom(10)) != null) {
                    str = v63Var2.getString(1);
                }
                b1Var.f317022f = str;
                b1Var.f317032k = 1205;
                b1Var.f317028i = new com.tencent.mm.plugin.finder.live.widget.n00(fr1Var);
                com.tencent.mm.ui.widget.dialog.y1 y1Var = m10Var.f119013o;
                int i18 = -1;
                int height = (y1Var == null || (view2 = y1Var.f212027f) == null) ? -1 : view2.getHeight();
                com.tencent.mm.ui.widget.dialog.y1 y1Var2 = m10Var.f119013o;
                if (y1Var2 != null && (viewGroup = y1Var2.B) != null) {
                    i18 = viewGroup.getWidth();
                }
                int i19 = i18;
                k91.s2 s2Var = k91.s2.f305761e;
                android.view.ViewGroup viewGroup2 = m10Var.f118999a;
                b1Var.G = new com.tencent.mm.plugin.appbrand.config.HalfScreenConfig(true, height, s2Var, true, new com.tencent.mm.plugin.appbrand.config.HalfScreenConfig.BackgroundShapeConfig(i65.a.f(viewGroup2.getContext(), com.tencent.mm.R.dimen.f479672c9), true, true, false, false, 24, null), false, new com.tencent.mm.plugin.appbrand.config.HalfScreenConfig.CloseWhenClickEmptyAreaConfig(viewGroup2.getContext().getClass().getName(), m10Var.f119001c.x0() ? s2Var : k91.s2.f305760d), k91.t2.f305768f, false, false, null, k91.y2.f305828e, false, true, null, false, 0, null, 0, height, i19, false, false, false, null, false, null, 0, false, null, false, 0, false, false, false, false, null, null, null, false, null, null, false, -9976800, 2047, null);
                b1Var.L = new com.tencent.mm.plugin.finder.live.widget.h00(m10Var);
                ((com.tencent.mm.plugin.appbrand.launching.xc) ((com.tencent.mm.plugin.appbrand.service.h6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.h6.class))).bj(viewGroup2.getContext(), b1Var);
                m10Var.N = b1Var;
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveVisitorGameTeamWidget$refreshBottomSheetText$1$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
