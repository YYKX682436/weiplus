package com.tencent.mm.plugin.recharge.ui;

/* loaded from: classes9.dex */
public class w implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recharge.ui.PhoneRechargeUI f155248d;

    public w(com.tencent.mm.plugin.recharge.ui.PhoneRechargeUI phoneRechargeUI) {
        this.f155248d = phoneRechargeUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/recharge/ui/PhoneRechargeUI$14", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.recharge.ui.PhoneRechargeUI phoneRechargeUI = this.f155248d;
        vr4.e eVar = phoneRechargeUI.C;
        if (!com.tencent.mm.plugin.recharge.ui.PhoneRechargeUI.V6(phoneRechargeUI, eVar.f439714f, eVar.f439715g, eVar.f439713e, "")) {
            com.tencent.mm.plugin.recharge.ui.PhoneRechargeUI.X6(phoneRechargeUI, com.tencent.mm.plugin.recharge.ui.PhoneRechargeUI.W6(phoneRechargeUI, phoneRechargeUI.C.f439712d), phoneRechargeUI.C.f439713e, "");
        }
        yj0.a.h(this, "com/tencent/mm/plugin/recharge/ui/PhoneRechargeUI$14", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
