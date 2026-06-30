package sr2;

/* loaded from: classes2.dex */
public final class v2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.y1 f411739d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sr2.y2 f411740e;

    public v2(com.tencent.mm.ui.widget.dialog.y1 y1Var, sr2.y2 y2Var) {
        this.f411739d = y1Var;
        this.f411740e = y2Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/post/PostLocationUIC$showGroupPurchaseSharePlanDialog$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f411739d.q();
        sr2.y2 y2Var = this.f411740e;
        com.tencent.mm.ui.widget.dialog.y1 y1Var = new com.tencent.mm.ui.widget.dialog.y1(y2Var.getActivity());
        android.view.View inflate = com.tencent.mm.ui.id.b(y2Var.getActivity()).inflate(com.tencent.mm.R.layout.axh, (android.view.ViewGroup) null);
        kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.qxg);
        if (textView != null) {
            com.tencent.mm.ui.fk.a(textView);
        }
        android.view.View findViewById = inflate.findViewById(com.tencent.mm.R.id.pnq);
        if (findViewById != null) {
            findViewById.setOnClickListener(new sr2.w2(y1Var));
        }
        y1Var.k(inflate);
        y1Var.s();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/post/PostLocationUIC$showGroupPurchaseSharePlanDialog$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
