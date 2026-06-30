package com.tencent.mm.plugin.wallet.balance.ui;

/* loaded from: classes9.dex */
public class h1 implements android.widget.TextView.OnEditorActionListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View.OnClickListener f177898d;

    public h1(com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceSaveUI walletBalanceSaveUI, android.view.View.OnClickListener onClickListener) {
        this.f177898d = onClickListener;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public boolean onEditorAction(android.widget.TextView textView, int i17, android.view.KeyEvent keyEvent) {
        if (keyEvent != null && keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 66) {
            this.f177898d.onClick(null);
        }
        return true;
    }
}
