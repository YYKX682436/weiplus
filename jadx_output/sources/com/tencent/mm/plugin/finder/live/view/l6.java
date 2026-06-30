package com.tencent.mm.plugin.finder.live.view;

/* loaded from: classes3.dex */
public final class l6 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.view.r6 f116460d;

    public l6(com.tencent.mm.plugin.finder.live.view.r6 r6Var) {
        this.f116460d = r6Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        android.view.View view2;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/view/FinderLiveMicCenterView$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.live.view.s6 s6Var = this.f116460d.f116632b;
        if (s6Var != null) {
            df2.t2 t2Var = (df2.t2) s6Var;
            com.tencent.mars.xlog.Log.i("FinderLiveMicCenterController", "onHangupClick");
            fj2.s sVar = fj2.s.f263183a;
            android.content.Context context = null;
            sVar.e(ml2.q4.f327856i, null);
            sVar.b(ml2.n4.f327756w);
            com.tencent.mars.xlog.Log.i("FinderLiveMicCenterController", "showHangupConfirmSheet");
            com.tencent.mm.plugin.finder.live.view.r6 r6Var = t2Var.f231396m;
            if (r6Var != null && (view2 = r6Var.f116631a) != null) {
                context = view2.getContext();
            }
            if (context != null) {
                com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0(context, 1, true);
                k0Var.U1 = true;
                k0Var.f211855d2 = true;
                k0Var.f211872n = new df2.r2(k0Var, context);
                k0Var.f211881s = new df2.s2(t2Var, k0Var);
                k0Var.v();
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/view/FinderLiveMicCenterView$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
