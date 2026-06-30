package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class x60 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.v70 f115034d;

    public x60(com.tencent.mm.plugin.finder.live.plugin.v70 v70Var) {
        this.f115034d = v70Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveRandomMatchLinkMicStatePlugin$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onClickCloseBtn,currentState:");
        com.tencent.mm.plugin.finder.live.plugin.v70 v70Var = this.f115034d;
        sb6.append(v70Var.f114683q);
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveRandomMatchLinkMicStatePlugin", sb6.toString());
        com.tencent.mm.plugin.finder.live.plugin.gp0 gp0Var = v70Var.f114683q;
        if (gp0Var == com.tencent.mm.plugin.finder.live.plugin.gp0.f112725e) {
            if (((mm2.o4) v70Var.P0(mm2.o4.class)).D) {
                ml2.q2 q2Var = ml2.q2.f327841y0;
                com.tencent.mars.xlog.Log.i("FinderLiveMicReportUtil", "report21054 op: 57 ");
                ((ml2.j0) i95.n0.c(ml2.j0.class)).Vj(q2Var, "", -1, -1);
                if (v70Var.C == null) {
                    com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0(v70Var.f365323d.getContext(), 1, true);
                    v70Var.C = k0Var;
                    k0Var.U1 = true;
                }
                com.tencent.mm.ui.widget.dialog.k0 k0Var2 = v70Var.C;
                if (k0Var2 != null) {
                    k0Var2.f211855d2 = false;
                }
                if (k0Var2 != null) {
                    k0Var2.f211872n = new com.tencent.mm.plugin.finder.live.plugin.e70(v70Var);
                }
                if (k0Var2 != null) {
                    k0Var2.f211881s = new com.tencent.mm.plugin.finder.live.plugin.f70(v70Var);
                }
                if (k0Var2 != null) {
                    k0Var2.p(new com.tencent.mm.plugin.finder.live.plugin.g70(v70Var));
                }
                com.tencent.mm.ui.widget.dialog.k0 k0Var3 = v70Var.C;
                if (k0Var3 != null) {
                    k0Var3.v();
                }
            } else {
                com.tencent.mars.xlog.Log.w("Finder.FinderLiveRandomMatchLinkMicStatePlugin", "onClickCloseBtn: isWaitingRandomMatch = false");
            }
        } else if (gp0Var == com.tencent.mm.plugin.finder.live.plugin.gp0.f112726f) {
            ml2.q2 q2Var2 = ml2.q2.f327838x0;
            com.tencent.mars.xlog.Log.i("FinderLiveMicReportUtil", "report21054 op: 56 ");
            ((ml2.j0) i95.n0.c(ml2.j0.class)).Vj(q2Var2, "", -1, -1);
            v70Var.w1();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveRandomMatchLinkMicStatePlugin$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
