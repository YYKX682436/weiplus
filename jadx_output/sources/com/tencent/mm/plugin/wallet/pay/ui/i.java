package com.tencent.mm.plugin.wallet.pay.ui;

/* loaded from: classes5.dex */
public class i implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.pay.ui.WalletChangeBankcardUI f178769d;

    public i(com.tencent.mm.plugin.wallet.pay.ui.WalletChangeBankcardUI walletChangeBankcardUI) {
        this.f178769d = walletChangeBankcardUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet/pay/ui/WalletChangeBankcardUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f178769d.dispatchKeyEvent(new android.view.KeyEvent(1, 4));
        yj0.a.h(this, "com/tencent/mm/plugin/wallet/pay/ui/WalletChangeBankcardUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
