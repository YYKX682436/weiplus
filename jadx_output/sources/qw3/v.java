package qw3;

/* loaded from: classes9.dex */
public class v implements android.view.View.OnFocusChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitBankcardInputUI f367214d;

    public v(com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitBankcardInputUI bankRemitBankcardInputUI) {
        this.f367214d = bankRemitBankcardInputUI;
    }

    @Override // android.view.View.OnFocusChangeListener
    public void onFocusChange(android.view.View view, boolean z17) {
        com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitBankcardInputUI bankRemitBankcardInputUI = this.f367214d;
        if (!z17) {
            bankRemitBankcardInputUI.f156478e.getInfoIv().setIconContentDescription(bankRemitBankcardInputUI.getString(com.tencent.mm.R.string.aew));
        } else if (bankRemitBankcardInputUI.f156478e.getContentEt().getText() == null || bankRemitBankcardInputUI.f156478e.getContentEt().getText().length() <= 0) {
            bankRemitBankcardInputUI.f156478e.getInfoIv().setIconContentDescription(bankRemitBankcardInputUI.getString(com.tencent.mm.R.string.aew));
        }
    }
}
