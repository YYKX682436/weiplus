package com.tencent.mm.plugin.recharge.ui;

/* loaded from: classes.dex */
public class i0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recharge.ui.PhoneRechargeUI f155192d;

    public i0(com.tencent.mm.plugin.recharge.ui.PhoneRechargeUI phoneRechargeUI) {
        this.f155192d = phoneRechargeUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/recharge/ui/PhoneRechargeUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        tb0.j jVar = (tb0.j) i95.n0.c(tb0.j.class);
        com.tencent.mm.plugin.recharge.ui.PhoneRechargeUI phoneRechargeUI = this.f155192d;
        androidx.appcompat.app.AppCompatActivity context = phoneRechargeUI.getContext();
        ((sb0.f) jVar).getClass();
        if (j35.u.a(context, "android.permission.READ_CONTACTS", 48, null, null)) {
            android.content.Intent intent = new android.content.Intent("android.intent.action.PICK", android.provider.ContactsContract.Contacts.CONTENT_URI);
            if (com.tencent.mm.sdk.platformtools.t8.I0(phoneRechargeUI, intent, true, false)) {
                try {
                    phoneRechargeUI.startActivityForResult(intent, 1);
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.PhoneRechargeUI", e17, "", new java.lang.Object[0]);
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/recharge/ui/PhoneRechargeUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
