package com.tencent.mm.wallet_core.ui;

/* loaded from: classes9.dex */
public class v0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f214240d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.wallet_core.ui.x0 f214241e;

    public v0(com.tencent.mm.wallet_core.ui.x0 x0Var, android.view.View view) {
        this.f214241e = x0Var;
        this.f214240d = view;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.wallet_core.ui.x0 x0Var = this.f214241e;
        boolean isShown = x0Var.f214268i.mKBLayout.isShown();
        android.view.View view = this.f214240d;
        if (!isShown && view.isShown()) {
            x0Var.f214268i.showTenpayKB();
        }
        android.view.View view2 = x0Var.f214264e;
        if (view2 instanceof com.tencent.mm.wallet_core.ui.formview.WalletFormView) {
            com.tencent.mm.wallet_core.ui.formview.WalletFormView walletFormView = (com.tencent.mm.wallet_core.ui.formview.WalletFormView) view2;
            if ((c01.z1.I() || walletFormView.getEncrptType() == 100) && (!c01.z1.I() || walletFormView.getEncrptType() == 0)) {
                x0Var.f214268i.mKeyboard.resetSecureAccessibility();
                x0Var.f214265f.setAccessibilityDelegate(null);
            } else {
                com.tencent.mm.wallet_core.e eVar = new com.tencent.mm.wallet_core.e(true);
                x0Var.f214268i.mKeyboard.setSecureAccessibility(eVar);
                x0Var.f214265f.setAccessibilityDelegate(eVar);
            }
        }
        if (x0Var.f214264e instanceof com.tencent.mm.wallet_core.ui.formview.EditHintPasswdView) {
            com.tencent.mm.wallet_core.e eVar2 = new com.tencent.mm.wallet_core.e(true);
            x0Var.f214268i.getContext();
            java.util.regex.Pattern pattern = com.tencent.mm.wallet_core.ui.r1.f214222a;
            x0Var.f214268i.mKeyboard.setSecureAccessibility(eVar2);
            x0Var.f214265f.setAccessibilityDelegate(eVar2);
        }
        android.view.View view3 = x0Var.f214264e;
        java.util.regex.Pattern pattern2 = com.tencent.mm.wallet_core.ui.r1.f214222a;
        if (view3 instanceof com.tencent.mm.wallet_core.ui.formview.EditHintPasswdView) {
            com.tencent.mm.wallet_core.ui.r1.N(view3, x0Var.f214268i.mKeyboard);
        }
        x0Var.f214268i.setKBMode(x0Var.f214266g);
        x0Var.f214268i.mKeyboard.setInputEditText((android.widget.EditText) view);
        ((android.view.inputmethod.InputMethodManager) x0Var.f214268i.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
    }
}
