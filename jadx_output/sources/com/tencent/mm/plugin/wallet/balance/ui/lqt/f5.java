package com.tencent.mm.plugin.wallet.balance.ui.lqt;

/* loaded from: classes9.dex */
public class f5 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSaveFetchFinishUI f178173d;

    public f5(com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSaveFetchFinishUI walletLqtSaveFetchFinishUI) {
        this.f178173d = walletLqtSaveFetchFinishUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtSaveFetchFinishUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSaveFetchFinishUI walletLqtSaveFetchFinishUI = this.f178173d;
        if (walletLqtSaveFetchFinishUI.f178051s != 8) {
            walletLqtSaveFetchFinishUI.finish();
        } else if (walletLqtSaveFetchFinishUI.getIntent().getIntExtra("is_from_kinda_balance", 0) != 0) {
            walletLqtSaveFetchFinishUI.setResult(-1);
            walletLqtSaveFetchFinishUI.finish();
        } else {
            android.content.Intent intent = new android.content.Intent();
            intent.addFlags(67108864);
            j45.l.j(walletLqtSaveFetchFinishUI.getContext(), "mall", ".ui.MallWalletUI", intent, null);
        }
        if (walletLqtSaveFetchFinishUI.f178051s == 14) {
            com.tencent.kinda.gen.ITransmitKvData create = com.tencent.kinda.gen.ITransmitKvData.create();
            create.putString("notifyType", "refreshByLQT");
            ((h45.q) i95.n0.c(h45.q.class)).notifyAllUseCase(create);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtSaveFetchFinishUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
