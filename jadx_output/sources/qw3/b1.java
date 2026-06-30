package qw3;

/* loaded from: classes9.dex */
public class b1 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.h7 f367143d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ow3.m f367144e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitMoneyInputUI f367145f;

    public b1(com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitMoneyInputUI bankRemitMoneyInputUI, r45.h7 h7Var, ow3.m mVar) {
        this.f367145f = bankRemitMoneyInputUI;
        this.f367143d = h7Var;
        this.f367144e = mVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        boolean z17;
        r45.h7 h7Var = this.f367143d;
        boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(h7Var.f375896h);
        com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitMoneyInputUI bankRemitMoneyInputUI = this.f367145f;
        if (!K0) {
            if (com.tencent.mm.sdk.platformtools.t8.K0(h7Var.f375896h)) {
                return;
            }
            com.tencent.mm.wallet_core.ui.r1.V(bankRemitMoneyInputUI.getContext(), h7Var.f375896h, false);
        } else {
            z17 = ((com.tencent.mm.wallet_core.ui.WalletBaseUI) bankRemitMoneyInputUI).mKindaEnable;
            if (z17) {
                bankRemitMoneyInputUI.showLoading();
            }
            r45.or5 or5Var = this.f367144e.f349427s;
            com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitMoneyInputUI.V6(bankRemitMoneyInputUI, or5Var.f382466f, or5Var.f382469i, or5Var.f382470m, or5Var.f382468h);
        }
    }
}
