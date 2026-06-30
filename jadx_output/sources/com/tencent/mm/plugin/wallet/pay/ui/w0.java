package com.tencent.mm.plugin.wallet.pay.ui;

/* loaded from: classes3.dex */
public class w0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.CheckBox f178815d;

    public w0(com.tencent.mm.plugin.wallet.pay.ui.WalletPayUI walletPayUI, android.widget.CheckBox checkBox) {
        this.f178815d = checkBox;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet/pay/ui/WalletPayUI$29", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f178815d.setChecked(!r7.isChecked());
        yj0.a.h(this, "com/tencent/mm/plugin/wallet/pay/ui/WalletPayUI$29", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
