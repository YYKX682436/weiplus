package com.tencent.mm.plugin.ipcall.ui;

/* loaded from: classes.dex */
public class g5 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ipcall.ui.IPCallShareCouponUI f142839d;

    public g5(com.tencent.mm.plugin.ipcall.ui.IPCallShareCouponUI iPCallShareCouponUI) {
        this.f142839d = iPCallShareCouponUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/ipcall/ui/IPCallShareCouponUI$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.storage.n3 p17 = c01.d9.b().p();
        com.tencent.mm.storage.u3 u3Var = com.tencent.mm.storage.u3.USERINFO_IPCALL_RECHARGE_SHOW_REDDOT_BOOLEAN;
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        if (((java.lang.Boolean) p17.m(u3Var, bool)).booleanValue()) {
            q83.h.a(3, -1, -1);
        }
        c01.d9.b().p().x(u3Var, bool);
        com.tencent.mm.plugin.ipcall.ui.IPCallShareCouponUI iPCallShareCouponUI = this.f142839d;
        iPCallShareCouponUI.f142692f.setVisibility(8);
        android.content.Intent intent = new android.content.Intent();
        intent.setClass(iPCallShareCouponUI.getContext(), com.tencent.mm.plugin.ipcall.ui.IPCallRechargeUI.class);
        com.tencent.mm.plugin.ipcall.ui.IPCallShareCouponUI iPCallShareCouponUI2 = this.f142839d;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(intent);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(iPCallShareCouponUI2, arrayList2.toArray(), "com/tencent/mm/plugin/ipcall/ui/IPCallShareCouponUI$9", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        iPCallShareCouponUI2.startActivity((android.content.Intent) arrayList2.get(0));
        yj0.a.f(iPCallShareCouponUI2, "com/tencent/mm/plugin/ipcall/ui/IPCallShareCouponUI$9", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        yj0.a.h(this, "com/tencent/mm/plugin/ipcall/ui/IPCallShareCouponUI$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
