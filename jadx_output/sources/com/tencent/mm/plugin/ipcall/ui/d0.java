package com.tencent.mm.plugin.ipcall.ui;

/* loaded from: classes8.dex */
public class d0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ipcall.ui.m0 f142777d;

    public d0(com.tencent.mm.plugin.ipcall.ui.m0 m0Var) {
        this.f142777d = m0Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/ipcall/ui/IPCallAddressController$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.storage.n3 p17 = c01.d9.b().p();
        com.tencent.mm.storage.u3 u3Var = com.tencent.mm.storage.u3.USERINFO_IPCALL_ADDRESS_ACCOUNT_SHOW_REDDOT_BOOLEAN;
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        boolean booleanValue = ((java.lang.Boolean) p17.m(u3Var, bool)).booleanValue();
        if (booleanValue) {
            com.tencent.mm.storage.n3 p18 = c01.d9.b().p();
            com.tencent.mm.storage.u3 u3Var2 = com.tencent.mm.storage.u3.USERFINO_IPCALL_ADDRESS_ACCOUNT_SHOW_REDDOT_TYPE_INT;
            int intValue = ((java.lang.Integer) p18.m(u3Var2, -1)).intValue();
            q83.h.a(2, intValue, -1);
            c01.d9.b().p().x(u3Var2, -1);
            com.tencent.mars.xlog.Log.i("MicroMsg.IPCallAddressController", "set red dot type from %d to -1", java.lang.Integer.valueOf(intValue));
        }
        java.lang.String str = booleanValue ? "true" : "false";
        com.tencent.mm.storage.n3 p19 = c01.d9.b().p();
        com.tencent.mm.storage.u3 u3Var3 = com.tencent.mm.storage.u3.USERFINO_IPCALL_ADDRESS_ACCOUNT_STRING;
        com.tencent.mars.xlog.Log.i("MicroMsg.IPCallAddressController", "set show red dot from %s to false, set account string from %s to null", str, (java.lang.String) p19.m(u3Var3, ""));
        c01.d9.b().p().x(u3Var, bool);
        c01.d9.b().p().x(u3Var3, "");
        if (((java.lang.Integer) c01.d9.b().p().m(com.tencent.mm.storage.u3.USERINFO_IPCALL_ADDRESS_ACCOUNT_ACTIVITY_CLEAR_TYPE_INT, 0)).intValue() != 1) {
            com.tencent.mm.storage.n3 p27 = c01.d9.b().p();
            com.tencent.mm.storage.u3 u3Var4 = com.tencent.mm.storage.u3.USERFINO_IPCALL_ADDRESS_ACCOUNT_ACTIVITY_STRING;
            com.tencent.mars.xlog.Log.i("MicroMsg.IPCallAddressController", "set account activity string from %s to null", (java.lang.String) p27.m(u3Var4, ""));
            c01.d9.b().p().x(u3Var4, "");
        }
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(12061, 0, 0, 1, 0, 0, 0);
        com.tencent.mm.plugin.ipcall.ui.m0 m0Var = this.f142777d;
        m0Var.getClass();
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.ipcall.ui.i0(m0Var));
        android.content.Intent intent = new android.content.Intent();
        intent.setClass(m0Var.f142932d, com.tencent.mm.plugin.ipcall.ui.IPCallShareCouponUI.class);
        com.tencent.mm.plugin.ipcall.ui.IPCallAddressUI iPCallAddressUI = m0Var.f142932d;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(intent);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(iPCallAddressUI, arrayList2.toArray(), "com/tencent/mm/plugin/ipcall/ui/IPCallAddressController$1", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        iPCallAddressUI.startActivity((android.content.Intent) arrayList2.get(0));
        yj0.a.f(iPCallAddressUI, "com/tencent/mm/plugin/ipcall/ui/IPCallAddressController$1", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        yj0.a.h(this, "com/tencent/mm/plugin/ipcall/ui/IPCallAddressController$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
