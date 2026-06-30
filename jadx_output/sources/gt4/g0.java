package gt4;

/* loaded from: classes14.dex */
public final class g0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gt4.s0 f275435d;

    public g0(gt4.s0 s0Var) {
        this.f275435d = s0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet_core/ui/view/WalletComplexDatePicker$initView$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        gt4.s0 s0Var = this.f275435d;
        com.tencent.mm.ui.widget.picker.CustomDatePickerNew customDatePickerNew = s0Var.f275541n;
        if (customDatePickerNew == null) {
            kotlin.jvm.internal.o.o("datePicker");
            throw null;
        }
        int year = customDatePickerNew.getYear();
        com.tencent.mm.ui.widget.picker.CustomDatePickerNew customDatePickerNew2 = s0Var.f275541n;
        if (customDatePickerNew2 == null) {
            kotlin.jvm.internal.o.o("datePicker");
            throw null;
        }
        int month = customDatePickerNew2.getMonth();
        com.tencent.mm.ui.widget.picker.CustomDatePickerNew customDatePickerNew3 = s0Var.f275541n;
        if (customDatePickerNew3 == null) {
            kotlin.jvm.internal.o.o("datePicker");
            throw null;
        }
        gt4.s0.a(s0Var, true, year, month, customDatePickerNew3.getDayOfMonth());
        s0Var.e();
        yj0.a.h(this, "com/tencent/mm/plugin/wallet_core/ui/view/WalletComplexDatePicker$initView$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
