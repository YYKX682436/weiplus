package com.tencent.mm.plugin.recharge.ui;

/* loaded from: classes9.dex */
public class b1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recharge.ui.RechargeUI f155145d;

    public b1(com.tencent.mm.plugin.recharge.ui.RechargeUI rechargeUI) {
        this.f155145d = rechargeUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        com.tencent.mm.plugin.recharge.ui.g1 g1Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/recharge/ui/RechargeUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.recharge.ui.RechargeUI rechargeUI = this.f155145d;
        com.tencent.mm.plugin.recharge.ui.g1 g1Var2 = rechargeUI.f155130o;
        if ((g1Var2 != null && g1Var2.getCount() > 0) || ((g1Var = rechargeUI.f155131p) != null && g1Var.getCount() > 0)) {
            rechargeUI.showDialog(1);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/recharge/ui/RechargeUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
