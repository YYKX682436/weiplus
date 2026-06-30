package com.tencent.mm.plugin.recharge.ui;

/* loaded from: classes9.dex */
public class e1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recharge.ui.RechargeUI f155156d;

    public e1(com.tencent.mm.plugin.recharge.ui.RechargeUI rechargeUI) {
        this.f155156d = rechargeUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/recharge/ui/RechargeUI$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.recharge.ui.RechargeUI rechargeUI = this.f155156d;
        rechargeUI.f155132q.getFocus();
        if (rechargeUI.f155132q.getInputRecord().f439878d == 2) {
            rechargeUI.f155132q.setInput(null);
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(rechargeUI.f155132q.getText().toString())) {
            rechargeUI.f155132q.f155086g.showDropDown();
        }
        rechargeUI.showVKB();
        yj0.a.h(this, "com/tencent/mm/plugin/recharge/ui/RechargeUI$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
