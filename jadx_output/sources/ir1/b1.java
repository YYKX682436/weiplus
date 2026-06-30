package ir1;

/* loaded from: classes5.dex */
public final class b1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ir1.i1 f293940d;

    public b1(ir1.i1 i1Var) {
        this.f293940d = i1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/brandservice/conversation/ui/BizFansHalfScreenProfileView$bindUI$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ir1.i1 i1Var = this.f293940d;
        com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0(i1Var.getContext(), 1, true);
        k0Var.q(i1Var.getResources().getString(i1Var.f293986f == 5 ? com.tencent.mm.R.string.ngd : com.tencent.mm.R.string.f490732n50), 17);
        k0Var.f211872n = new ir1.w0(i1Var);
        k0Var.f211881s = new ir1.a1(i1Var);
        k0Var.v();
        yj0.a.h(this, "com/tencent/mm/plugin/brandservice/conversation/ui/BizFansHalfScreenProfileView$bindUI$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
