package com.tencent.mm.plugin.recharge.ui;

/* loaded from: classes9.dex */
public class a1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recharge.ui.RechargeUI f155144d;

    public a1(com.tencent.mm.plugin.recharge.ui.RechargeUI rechargeUI) {
        this.f155144d = rechargeUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/recharge/ui/RechargeUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.recharge.ui.RechargeUI rechargeUI = this.f155144d;
        com.tencent.mm.plugin.recharge.ui.MallEditText mallEditText = rechargeUI.f155132q;
        if (mallEditText.f155088i) {
            mallEditText.setInput(null);
        } else {
            rechargeUI.startActivityForResult(new android.content.Intent("android.intent.action.PICK", android.provider.ContactsContract.Contacts.CONTENT_URI), 1);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/recharge/ui/RechargeUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
