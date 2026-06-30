package qw3;

/* loaded from: classes9.dex */
public class l0 extends android.view.View.AccessibilityDelegate {
    public l0(com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitBankcardInputUI bankRemitBankcardInputUI, qw3.i iVar) {
    }

    @Override // android.view.View.AccessibilityDelegate
    public void onInitializeAccessibilityEvent(android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitBankcardInputUI bankRemitBankcardInputUI;
        super.onInitializeAccessibilityEvent(view, accessibilityEvent);
        if (accessibilityEvent.getEventType() != 32768 || (bankRemitBankcardInputUI = (com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitBankcardInputUI) view.getContext()) == null) {
            return;
        }
        android.view.View findViewById = bankRemitBankcardInputUI.findViewById(com.tencent.mm.R.id.k3p);
        if (findViewById != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/remittance/bankcard/ui/BankRemitBankcardInputUI$CardNumberTitleAccessibilityDelegate", "onInitializeAccessibilityEvent", "(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/remittance/bankcard/ui/BankRemitBankcardInputUI$CardNumberTitleAccessibilityDelegate", "onInitializeAccessibilityEvent", "(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.tencent.mm.wallet_core.ui.formview.WalletFormView walletFormView = bankRemitBankcardInputUI.f156478e;
        if (walletFormView != null) {
            walletFormView.e();
            bankRemitBankcardInputUI.hideVKB();
        }
    }
}
