package sr2;

/* loaded from: classes2.dex */
public final class k0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sr2.w0 f411609d;

    public k0(sr2.w0 w0Var) {
        this.f411609d = w0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/post/PostEditUIC$initShortTitle$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        sr2.w0 w0Var = this.f411609d;
        com.tencent.mm.ui.widget.dialog.y1 y1Var = new com.tencent.mm.ui.widget.dialog.y1(w0Var.getActivity());
        android.view.View inflate = android.view.LayoutInflater.from(w0Var.getActivity()).inflate(com.tencent.mm.R.layout.f489069b62, (android.view.ViewGroup) null);
        kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.fwh);
        if (textView != null) {
            com.tencent.mm.ui.bk.r0(textView.getPaint(), 0.8f);
        }
        android.view.View findViewById = inflate.findViewById(com.tencent.mm.R.id.fwg);
        if (findViewById != null) {
            findViewById.setOnClickListener(new sr2.u0(y1Var));
        }
        y1Var.k(inflate);
        y1Var.s();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/post/PostEditUIC$initShortTitle$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
