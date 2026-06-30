package qw3;

/* loaded from: classes9.dex */
public class m0 extends android.view.View.AccessibilityDelegate {
    public m0(com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitBankcardInputUI bankRemitBankcardInputUI, qw3.i iVar) {
    }

    @Override // android.view.View.AccessibilityDelegate
    public void onInitializeAccessibilityEvent(android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitBankcardInputUI bankRemitBankcardInputUI;
        com.tencent.mm.wallet_core.ui.formview.WalletFormView walletFormView;
        super.onInitializeAccessibilityEvent(view, accessibilityEvent);
        if (accessibilityEvent.getEventType() != 32768 || (bankRemitBankcardInputUI = (com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitBankcardInputUI) view.getContext()) == null || (walletFormView = bankRemitBankcardInputUI.f156478e) == null || walletFormView.getText() != null) {
            return;
        }
        bankRemitBankcardInputUI.f156478e.e();
        bankRemitBankcardInputUI.hideVKB();
    }
}
