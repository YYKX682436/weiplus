package com.tencent.mm.plugin.wallet.pay.ui;

/* loaded from: classes9.dex */
public class l1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.CheckedTextView f178782d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.CheckedTextView f178783e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.pay.ui.WalletPayUI f178784f;

    public l1(com.tencent.mm.plugin.wallet.pay.ui.WalletPayUI walletPayUI, android.widget.CheckedTextView checkedTextView, android.widget.CheckedTextView checkedTextView2) {
        this.f178784f = walletPayUI;
        this.f178782d = checkedTextView;
        this.f178783e = checkedTextView2;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet/pay/ui/WalletPayUI$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f178782d.setChecked(false);
        this.f178783e.setChecked(true);
        com.tencent.mm.plugin.wallet.pay.ui.WalletPayUI walletPayUI = this.f178784f;
        walletPayUI.R = true;
        walletPayUI.t7();
        yj0.a.h(this, "com/tencent/mm/plugin/wallet/pay/ui/WalletPayUI$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
