package com.tencent.mm.plugin.remittance.ui;

/* loaded from: classes9.dex */
public class m6 implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.ui.RemittanceF2fDynamicCodeUI f157822d;

    public m6(com.tencent.mm.plugin.remittance.ui.RemittanceF2fDynamicCodeUI remittanceF2fDynamicCodeUI) {
        this.f157822d = remittanceF2fDynamicCodeUI;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/remittance/ui/RemittanceF2fDynamicCodeUI$4", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        int i17 = com.tencent.mm.plugin.remittance.ui.RemittanceF2fDynamicCodeUI.I;
        com.tencent.mm.plugin.remittance.ui.RemittanceF2fDynamicCodeUI remittanceF2fDynamicCodeUI = this.f157822d;
        remittanceF2fDynamicCodeUI.getClass();
        al5.s0 s0Var = new al5.s0(remittanceF2fDynamicCodeUI.getContext(), 1, false);
        s0Var.f211872n = new com.tencent.mm.plugin.remittance.ui.n6(remittanceF2fDynamicCodeUI);
        s0Var.f211881s = new com.tencent.mm.plugin.remittance.ui.o6(remittanceF2fDynamicCodeUI);
        s0Var.v();
        s0Var.f211854d = new com.tencent.mm.plugin.remittance.ui.p6(remittanceF2fDynamicCodeUI);
        yj0.a.i(false, this, "com/tencent/mm/plugin/remittance/ui/RemittanceF2fDynamicCodeUI$4", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return false;
    }
}
