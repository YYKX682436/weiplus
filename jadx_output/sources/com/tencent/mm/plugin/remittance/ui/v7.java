package com.tencent.mm.plugin.remittance.ui;

/* loaded from: classes5.dex */
public final class v7 implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f157995d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.ui.RemittanceRemarkInputHalfPage f157996e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.z2 f157997f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f157998g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f157999h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f158000i;

    public v7(android.widget.TextView textView, com.tencent.mm.plugin.remittance.ui.RemittanceRemarkInputHalfPage remittanceRemarkInputHalfPage, com.tencent.mm.ui.widget.dialog.z2 z2Var, kotlin.jvm.internal.c0 c0Var, kotlin.jvm.internal.c0 c0Var2, java.util.ArrayList arrayList) {
        this.f157995d = textView;
        this.f157996e = remittanceRemarkInputHalfPage;
        this.f157997f = z2Var;
        this.f157998g = c0Var;
        this.f157999h = c0Var2;
        this.f158000i = arrayList;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable s17) {
        kotlin.jvm.internal.o.g(s17, "s");
        int length = s17.toString().length();
        java.lang.Integer valueOf = java.lang.Integer.valueOf(length);
        com.tencent.mm.plugin.remittance.ui.RemittanceRemarkInputHalfPage remittanceRemarkInputHalfPage = this.f157996e;
        java.lang.String format = java.lang.String.format("%s/%s", java.util.Arrays.copyOf(new java.lang.Object[]{valueOf, java.lang.Integer.valueOf(remittanceRemarkInputHalfPage.f157562e)}, 2));
        kotlin.jvm.internal.o.f(format, "format(...)");
        android.widget.TextView textView = this.f157995d;
        textView.setText(format);
        com.tencent.mm.ui.MMActivity activity = remittanceRemarkInputHalfPage.f157561d;
        kotlin.jvm.internal.o.g(activity, "activity");
        ((com.tencent.mm.plugin.remittance.model.r1) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.remittance.model.r1.class)).setValue("desc_length_key", java.lang.String.valueOf(length));
        com.tencent.mm.ui.MMActivity activity2 = remittanceRemarkInputHalfPage.f157561d;
        kotlin.jvm.internal.o.g(activity2, "activity");
        ((com.tencent.mm.plugin.remittance.model.r1) pf5.z.f353948a.a(activity2).a(com.tencent.mm.plugin.remittance.model.r1.class)).setValue("desc_max_length_key", java.lang.String.valueOf(remittanceRemarkInputHalfPage.f157562e));
        int i17 = remittanceRemarkInputHalfPage.f157562e;
        com.tencent.mm.ui.widget.dialog.z2 z2Var = this.f157997f;
        kotlin.jvm.internal.c0 c0Var = this.f157998g;
        if (length > i17) {
            z2Var.b(false);
            textView.setTextColor(remittanceRemarkInputHalfPage.f157561d.getResources().getColor(com.tencent.mm.R.color.f478532ac));
            textView.setVisibility(0);
            if (!c0Var.f310112d && remittanceRemarkInputHalfPage.f157564g == com.tencent.mm.plugin.remittance.ui.l7.f157807d) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(22750, 6, remittanceRemarkInputHalfPage.f157563f);
            }
            c0Var.f310112d = true;
        } else {
            z2Var.b(true);
            textView.setVisibility(4);
            c0Var.f310112d = false;
        }
        kotlin.jvm.internal.c0 c0Var2 = this.f157999h;
        if (c0Var2.f310112d) {
            c0Var2.f310112d = false;
            return;
        }
        java.util.ArrayList arrayList = this.f158000i;
        if (arrayList.isEmpty() || !kotlin.jvm.internal.o.b(kz5.n0.i0(arrayList), "1")) {
            arrayList.add("1");
        }
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence s17, int i17, int i18, int i19) {
        kotlin.jvm.internal.o.g(s17, "s");
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence s17, int i17, int i18, int i19) {
        kotlin.jvm.internal.o.g(s17, "s");
    }
}
