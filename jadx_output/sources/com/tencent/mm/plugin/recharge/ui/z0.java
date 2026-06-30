package com.tencent.mm.plugin.recharge.ui;

/* loaded from: classes9.dex */
public class z0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recharge.ui.RechargeUI f155257d;

    public z0(com.tencent.mm.plugin.recharge.ui.RechargeUI rechargeUI) {
        this.f155257d = rechargeUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        boolean z17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/recharge/ui/RechargeUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.tencent.mm.plugin.recharge.ui.RechargeUI.G;
        com.tencent.mm.plugin.recharge.ui.RechargeUI rechargeUI = this.f155257d;
        if (rechargeUI.T6()) {
            if (rechargeUI.f155132q.getInputRecord().f439878d == 0) {
                db5.e1.A(rechargeUI, rechargeUI.getString(com.tencent.mm.R.string.gsn, rechargeUI.f155132q.getText().toString()), "", rechargeUI.getString(com.tencent.mm.R.string.f490608zu), rechargeUI.getString(com.tencent.mm.R.string.f490503wx), new com.tencent.mm.plugin.recharge.ui.p0(rechargeUI), null);
                z17 = false;
            } else {
                z17 = true;
            }
            if (z17) {
                com.tencent.mm.plugin.recharge.model.MallRechargeProduct mallRechargeProduct = rechargeUI.f155137v;
                rechargeUI.U6(new vs3.h(mallRechargeProduct.f155071e, mallRechargeProduct.f155070d, mallRechargeProduct.f155072f, rechargeUI.X6()));
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/recharge/ui/RechargeUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
