package com.tencent.mm.plugin.recharge.ui;

/* loaded from: classes.dex */
public class l0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recharge.ui.PhoneRechargeUI f155202d;

    public l0(com.tencent.mm.plugin.recharge.ui.PhoneRechargeUI phoneRechargeUI) {
        this.f155202d = phoneRechargeUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.lang.String str;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/recharge/ui/PhoneRechargeUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.recharge.ui.PhoneRechargeUI phoneRechargeUI = this.f155202d;
        vr4.a1 a1Var = phoneRechargeUI.K;
        if (a1Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.PhoneRechargeUI", "hy: no banner but show ad. should not happen");
        } else if (a1Var != null) {
            com.tencent.mm.storage.n3 c17 = gm0.j1.u().c();
            com.tencent.mm.storage.u3 u3Var = com.tencent.mm.storage.u3.USERINFO_PHONE_RECHARGE_CLOSED_BANNER_STRING;
            java.lang.String str2 = (java.lang.String) c17.m(u3Var, "");
            if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                str = java.lang.String.valueOf(phoneRechargeUI.K.f439675d);
            } else {
                str = str2 + ";" + phoneRechargeUI.K.f439675d;
            }
            gm0.j1.u().c().x(u3Var, str);
            gm0.j1.u().c().i(true);
        }
        android.view.View view2 = phoneRechargeUI.f155101d;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/recharge/ui/PhoneRechargeUI$6", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/recharge/ui/PhoneRechargeUI$6", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        yj0.a.h(this, "com/tencent/mm/plugin/recharge/ui/PhoneRechargeUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
