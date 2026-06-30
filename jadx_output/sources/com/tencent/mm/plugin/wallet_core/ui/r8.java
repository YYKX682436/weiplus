package com.tencent.mm.plugin.wallet_core.ui;

/* loaded from: classes9.dex */
public class r8 implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.ui.WalletSelectBankcardUI f180603d;

    public r8(com.tencent.mm.plugin.wallet_core.ui.WalletSelectBankcardUI walletSelectBankcardUI) {
        this.f180603d = walletSelectBankcardUI;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(adapterView);
        arrayList.add(view);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Long.valueOf(j17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet_core/ui/WalletSelectBankcardUI$2", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard = (com.tencent.mm.plugin.wallet_core.model.Bankcard) adapterView.getItemAtPosition(i17);
        com.tencent.mm.plugin.wallet_core.ui.WalletSelectBankcardUI walletSelectBankcardUI = this.f180603d;
        if (bankcard != null) {
            com.tencent.mm.plugin.wallet_core.ui.WalletSelectBankcardUI walletSelectBankcardUI2 = this.f180603d;
            db5.e1.K(walletSelectBankcardUI2, true, walletSelectBankcardUI2.getString(com.tencent.mm.R.string.f493614kz2, bankcard.field_desc, bankcard.field_mobile), walletSelectBankcardUI.getString(com.tencent.mm.R.string.f493616kz4), walletSelectBankcardUI.getString(com.tencent.mm.R.string.f493613kz1), walletSelectBankcardUI.getString(com.tencent.mm.R.string.f493615kz3), new com.tencent.mm.plugin.wallet_core.ui.p8(this, bankcard), new com.tencent.mm.plugin.wallet_core.ui.q8(this, bankcard));
        } else {
            walletSelectBankcardUI.getInput().putBoolean("key_balance_change_phone_need_confirm_phone", false);
            com.tencent.mm.plugin.wallet_core.ui.WalletSelectBankcardUI.U6(walletSelectBankcardUI, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/wallet_core/ui/WalletSelectBankcardUI$2", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}
