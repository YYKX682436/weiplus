package ns4;

/* loaded from: classes3.dex */
public final class z implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ns4.c0 f339686d;

    public z(ns4.c0 c0Var) {
        this.f339686d = c0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinConsumePanel$updateCheckBox$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ns4.c0 c0Var = this.f339686d;
        android.widget.CheckBox checkBox = c0Var.f339472k;
        if (checkBox == null) {
            kotlin.jvm.internal.o.o("recharge_agreement_link_checkbox");
            throw null;
        }
        if (checkBox.getVisibility() == 0) {
            android.widget.CheckBox checkBox2 = c0Var.f339472k;
            if (checkBox2 == null) {
                kotlin.jvm.internal.o.o("recharge_agreement_link_checkbox");
                throw null;
            }
            if (checkBox2 == null) {
                kotlin.jvm.internal.o.o("recharge_agreement_link_checkbox");
                throw null;
            }
            checkBox2.setChecked(!checkBox2.isChecked());
        }
        yj0.a.h(this, "com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinConsumePanel$updateCheckBox$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
