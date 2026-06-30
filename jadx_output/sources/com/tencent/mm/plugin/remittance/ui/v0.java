package com.tencent.mm.plugin.remittance.ui;

/* loaded from: classes9.dex */
public class v0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.model.q0 f157985d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.ui.RemittanceBaseUI f157986e;

    public v0(com.tencent.mm.plugin.remittance.ui.RemittanceBaseUI remittanceBaseUI, com.tencent.mm.plugin.remittance.model.q0 q0Var) {
        this.f157986e = remittanceBaseUI;
        this.f157985d = q0Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/remittance/ui/RemittanceBaseUI$22", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.remittance.ui.RemittanceBaseUI remittanceBaseUI = this.f157986e;
        remittanceBaseUI.showLoading();
        com.tencent.mm.plugin.remittance.model.q0 q0Var = this.f157985d;
        remittanceBaseUI.i7(q0Var.f156964d, remittanceBaseUI.f157135f, remittanceBaseUI.Q, q0Var);
        if (remittanceBaseUI.f157140m == 1) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(12689, 12, 1);
        } else {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(12689, 3, 1);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/remittance/ui/RemittanceBaseUI$22", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
