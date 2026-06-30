package com.tencent.mm.plugin.recharge.ui;

/* loaded from: classes9.dex */
public class s0 implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recharge.ui.RechargeUI f155223d;

    public s0(com.tencent.mm.plugin.recharge.ui.RechargeUI rechargeUI) {
        this.f155223d = rechargeUI;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(adapterView);
        arrayList.add(view);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Long.valueOf(j17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/recharge/ui/RechargeUI$13", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        com.tencent.mm.plugin.recharge.ui.RechargeUI rechargeUI = this.f155223d;
        rechargeUI.dismissDialog(1);
        java.util.Objects.toString(rechargeUI.f155137v);
        rechargeUI.f155137v = (com.tencent.mm.plugin.recharge.model.MallRechargeProduct) rechargeUI.f155130o.f155186d.get(i17);
        rechargeUI.f155130o.a(i17);
        rechargeUI.f155130o.notifyDataSetChanged();
        java.util.Objects.toString(rechargeUI.f155137v);
        rechargeUI.c7();
        yj0.a.h(this, "com/tencent/mm/plugin/recharge/ui/RechargeUI$13", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}
