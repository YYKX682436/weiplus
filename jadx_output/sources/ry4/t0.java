package ry4;

/* loaded from: classes.dex */
public final class t0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ry4.d1 f401679d;

    public t0(ry4.d1 d1Var) {
        this.f401679d = d1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/weclaw/shortcut/ShortcutCommandListUIC$setupBottomButtons$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ry4.d1 d1Var = this.f401679d;
        ry4.g gVar = d1Var.f401609e;
        if (gVar != null) {
            java.util.List E0 = kz5.n0.E0(gVar.f401630n);
            if (!E0.isEmpty()) {
                com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) d1Var.getActivity(), 1, false);
                k0Var.f211872n = new ry4.k0(d1Var);
                k0Var.f211881s = new ry4.l0(d1Var, E0);
                k0Var.v();
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/weclaw/shortcut/ShortcutCommandListUIC$setupBottomButtons$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
