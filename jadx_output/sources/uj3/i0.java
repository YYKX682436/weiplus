package uj3;

/* loaded from: classes3.dex */
public final class i0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uj3.l0 f428286d;

    public i0(uj3.l0 l0Var) {
        this.f428286d = l0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/multitalk/ui/widget/projector/ScreenProjectBottomUI$applyClickEvent$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        uj3.l0 l0Var = this.f428286d;
        if (!l0Var.f428328m) {
            yj0.a.h(this, "com/tencent/mm/plugin/multitalk/ui/widget/projector/ScreenProjectBottomUI$applyClickEvent$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        android.content.Context context = l0Var.f428316a;
        l0Var.getClass();
        com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0(context, 1, false);
        k0Var.f211872n = new uj3.j0(l0Var);
        k0Var.t(true);
        k0Var.f211881s = new uj3.k0(l0Var);
        k0Var.e(false);
        k0Var.v();
        yj0.a.h(this, "com/tencent/mm/plugin/multitalk/ui/widget/projector/ScreenProjectBottomUI$applyClickEvent$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
