package com.tencent.mm.plugin.remittance.ui;

/* loaded from: classes5.dex */
public class q9 implements android.widget.TextView.OnEditorActionListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View.OnClickListener f157904d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.ui.WalletMerchantPayUI f157905e;

    public q9(com.tencent.mm.plugin.remittance.ui.WalletMerchantPayUI walletMerchantPayUI, android.view.View.OnClickListener onClickListener) {
        this.f157905e = walletMerchantPayUI;
        this.f157904d = onClickListener;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public boolean onEditorAction(android.widget.TextView textView, int i17, android.view.KeyEvent keyEvent) {
        if (keyEvent != null && keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 66) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MerchantPayUI", "click enter");
            com.tencent.mm.plugin.remittance.ui.WalletMerchantPayUI walletMerchantPayUI = this.f157905e;
            if (walletMerchantPayUI.f157609r) {
                walletMerchantPayUI.hideWcKb();
                walletMerchantPayUI.f157608q.requestFocus();
                android.view.inputmethod.InputMethodManager inputMethodManager = (android.view.inputmethod.InputMethodManager) walletMerchantPayUI.getContext().getSystemService("input_method");
                if (inputMethodManager != null) {
                    inputMethodManager.showSoftInput(walletMerchantPayUI.f157608q, 0);
                }
            } else {
                this.f157904d.onClick(null);
            }
        }
        return true;
    }
}
