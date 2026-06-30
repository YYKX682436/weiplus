package fr2;

/* loaded from: classes2.dex */
public final class r implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fr2.x f265752d;

    public r(fr2.x xVar) {
        this.f265752d = xVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/nearby/ui/special/uic/FinderLiveThemeActionBarUIC$initView$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        fr2.x xVar = this.f265752d;
        xVar.getClass();
        com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) xVar.getActivity(), 0, true);
        k0Var.f211872n = new fr2.t(xVar);
        k0Var.f211881s = new fr2.u(xVar);
        if (xVar.f265770n == null) {
            ((com.tencent.mm.pluginsdk.forward.m) ((o25.y1) i95.n0.c(o25.y1.class))).getClass();
            xVar.f265770n = new com.tencent.mm.pluginsdk.forward.m();
        }
        o25.y1 y1Var = xVar.f265770n;
        if (y1Var != null) {
            ((com.tencent.mm.pluginsdk.forward.m) y1Var).Di(xVar.getContext(), k0Var, 2, null, new fr2.w(k0Var, xVar));
        }
        k0Var.v();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/nearby/ui/special/uic/FinderLiveThemeActionBarUIC$initView$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
