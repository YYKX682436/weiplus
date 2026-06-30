package e05;

/* loaded from: classes9.dex */
public class m implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wxcredit.ui.WalletWXCreditChangeAmountUI f246184d;

    public m(com.tencent.mm.plugin.wxcredit.ui.WalletWXCreditChangeAmountUI walletWXCreditChangeAmountUI) {
        this.f246184d = walletWXCreditChangeAmountUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.plugin.wxcredit.ui.WalletWXCreditChangeAmountUI walletWXCreditChangeAmountUI = this.f246184d;
        com.tencent.mm.wallet_core.h g17 = com.tencent.mm.wallet_core.a.g(walletWXCreditChangeAmountUI);
        if (g17 != null) {
            g17.f(walletWXCreditChangeAmountUI, walletWXCreditChangeAmountUI.getInput());
        } else {
            walletWXCreditChangeAmountUI.finish();
        }
    }
}
