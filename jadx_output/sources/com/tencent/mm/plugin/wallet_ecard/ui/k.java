package com.tencent.mm.plugin.wallet_ecard.ui;

/* loaded from: classes8.dex */
public class k implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_ecard.ui.WalletECardFinishUI f181049d;

    public k(com.tencent.mm.plugin.wallet_ecard.ui.WalletECardFinishUI walletECardFinishUI) {
        this.f181049d = walletECardFinishUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet_ecard/ui/WalletECardFinishUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletECardFinishUI", "click finish");
        new com.tencent.mm.autogen.events.OpenECardFinishEvent().e();
        com.tencent.mm.plugin.wallet_ecard.ui.WalletECardFinishUI walletECardFinishUI = this.f181049d;
        com.tencent.mm.wallet_core.h process = walletECardFinishUI.getProcess();
        if (process != null) {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putInt("key_process_result_code", -1);
            process.f(walletECardFinishUI.getContext(), bundle);
        } else {
            com.tencent.mars.xlog.Log.w("MicroMsg.WalletECardFinishUI", "process is null");
            walletECardFinishUI.finish();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/wallet_ecard/ui/WalletECardFinishUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
