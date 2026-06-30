package e05;

/* loaded from: classes9.dex */
public class p implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wxcredit.ui.WalletWXCreditDetailUI f246187d;

    public p(com.tencent.mm.plugin.wxcredit.ui.WalletWXCreditDetailUI walletWXCreditDetailUI) {
        this.f246187d = walletWXCreditDetailUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.plugin.wxcredit.ui.WalletWXCreditDetailUI walletWXCreditDetailUI = this.f246187d;
        np5.b0 V6 = walletWXCreditDetailUI.V6();
        com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard = walletWXCreditDetailUI.f188545i;
        V6.d(new d05.i(bankcard.field_bankcardType, bankcard.J2), true);
    }
}
