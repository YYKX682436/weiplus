package com.tencent.mm.plugin.ipcall.ui;

/* loaded from: classes.dex */
public class e5 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ipcall.ui.IPCallShareCouponUI f142799d;

    public e5(com.tencent.mm.plugin.ipcall.ui.IPCallShareCouponUI iPCallShareCouponUI) {
        this.f142799d = iPCallShareCouponUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/ipcall/ui/IPCallShareCouponUI$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.storage.n3 p17 = c01.d9.b().p();
        com.tencent.mm.storage.u3 u3Var = com.tencent.mm.storage.u3.USERINFO_IPCALL_MSG_CENTER_SHOW_REDDOT_BOOLEAN;
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        if (((java.lang.Boolean) p17.m(u3Var, bool)).booleanValue()) {
            q83.h.a(4, -1, ((java.lang.Integer) c01.d9.b().p().m(com.tencent.mm.storage.u3.USERFINO_IPCALL_MSG_CENTER_SHOW_REDDOT_TYPE_INT, -1)).intValue());
        }
        c01.d9.b().p().x(com.tencent.mm.storage.u3.USERFINO_IPCALL_MSG_CENTER_SHOW_REDDOT_TYPE_INT, -1);
        c01.d9.b().p().x(u3Var, bool);
        com.tencent.mm.plugin.ipcall.ui.IPCallShareCouponUI iPCallShareCouponUI = this.f142799d;
        iPCallShareCouponUI.f142699p.setVisibility(8);
        android.content.Intent intent = new android.content.Intent();
        intent.setClass(iPCallShareCouponUI.getContext(), com.tencent.mm.plugin.ipcall.ui.IPCallMsgUI.class);
        androidx.appcompat.app.AppCompatActivity context = iPCallShareCouponUI.getContext();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(intent);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(context, arrayList2.toArray(), "com/tencent/mm/plugin/ipcall/ui/IPCallShareCouponUI$7", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList2.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/ipcall/ui/IPCallShareCouponUI$7", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        yj0.a.h(this, "com/tencent/mm/plugin/ipcall/ui/IPCallShareCouponUI$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
