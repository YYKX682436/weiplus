package com.tencent.mm.plugin.ipcall.ui;

/* loaded from: classes14.dex */
public class a2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ipcall.ui.f2 f142750d;

    public a2(com.tencent.mm.plugin.ipcall.ui.f2 f2Var) {
        this.f142750d = f2Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/ipcall/ui/IPCallFeedbackDialog$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.ipcall.ui.e2 e2Var = (com.tencent.mm.plugin.ipcall.ui.e2) view.getTag();
        if (e2Var.f142792c) {
            e2Var.f142792c = false;
        } else {
            e2Var.f142792c = true;
        }
        android.widget.TextView textView = (android.widget.TextView) view;
        com.tencent.mm.plugin.ipcall.ui.f2 f2Var = this.f142750d;
        f2Var.getClass();
        com.tencent.mm.plugin.ipcall.ui.e2 e2Var2 = (com.tencent.mm.plugin.ipcall.ui.e2) textView.getTag();
        textView.setTextSize(0, f2Var.getContext().getResources().getDimension(com.tencent.mm.R.dimen.f480416xb) * i65.a.q(f2Var.getContext()));
        boolean z17 = e2Var2.f142792c;
        android.content.Context context = f2Var.f142809h;
        if (z17) {
            textView.setBackgroundResource(f2Var.K);
            textView.setTextColor(context.getResources().getColor(f2Var.L));
            textView.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
        } else {
            textView.setBackgroundResource(f2Var.I);
            textView.setTextColor(context.getResources().getColor(f2Var.f142804J));
            textView.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/ipcall/ui/IPCallFeedbackDialog$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
