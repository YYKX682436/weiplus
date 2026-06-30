package sr2;

/* loaded from: classes8.dex */
public final class s2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.CheckBox f411711d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sr2.y2 f411712e;

    public s2(android.widget.CheckBox checkBox, sr2.y2 y2Var) {
        this.f411711d = checkBox;
        this.f411712e = y2Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/post/PostLocationUIC$showGroupPurchaseSharePlanDialog$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        boolean isChecked = this.f411711d.isChecked();
        sr2.y2 y2Var = this.f411712e;
        if (isChecked) {
            y2Var.O6();
        } else {
            java.lang.String string = y2Var.getContext().getResources().getString(com.tencent.mm.R.string.f491271dd0);
            kotlin.jvm.internal.o.f(string, "getString(...)");
            ex2.a aVar = new ex2.a(string, 0, false, new sr2.o2(y2Var));
            android.view.View inflate = com.tencent.mm.ui.id.b(y2Var.getContext()).inflate(com.tencent.mm.R.layout.f488826b93, (android.view.ViewGroup) null, false);
            android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.mhz);
            if (textView != null) {
                com.tencent.mm.ui.fk.a(textView);
            }
            com.tencent.neattextview.textview.view.NeatTextView neatTextView = (com.tencent.neattextview.textview.view.NeatTextView) inflate.findViewById(com.tencent.mm.R.id.mic);
            if (neatTextView != null) {
                java.lang.CharSequence a17 = neatTextView.a();
                android.text.SpannableString spannableString = new android.text.SpannableString(a17);
                spannableString.setSpan(new com.tencent.mm.plugin.finder.view.yl(a17.toString(), y2Var.getContext().getResources().getColor(com.tencent.mm.R.color.Link_100), y2Var.getContext().getResources().getColor(com.tencent.mm.R.color.a9e), false, false, new sr2.m2(y2Var)), 0, a17.length(), 17);
                neatTextView.b(spannableString);
            }
            android.view.View inflate2 = com.tencent.mm.ui.id.b(y2Var.getContext()).inflate(com.tencent.mm.R.layout.ba8, (android.view.ViewGroup) null, false);
            android.widget.TextView textView2 = (android.widget.TextView) inflate2.findViewById(com.tencent.mm.R.id.qxi);
            if (textView2 != null) {
                textView2.setText(y2Var.getResources().getString(com.tencent.mm.R.string.f490373t6));
            }
            if (textView2 != null) {
                com.tencent.mm.ui.fk.a(textView2);
            }
            com.tencent.mm.ui.widget.dialog.z2 d17 = ex2.e.f257204a.d(y2Var.getContext(), inflate, aVar, inflate2);
            android.widget.Button button = d17.f212072x;
            kotlin.jvm.internal.o.f(button, "getBtnSingle(...)");
            com.tencent.mm.ui.fk.a(button);
            textView2.setOnClickListener(new sr2.n2(d17));
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/post/PostLocationUIC$showGroupPurchaseSharePlanDialog$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
