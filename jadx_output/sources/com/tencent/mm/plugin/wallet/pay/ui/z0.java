package com.tencent.mm.plugin.wallet.pay.ui;

/* loaded from: classes9.dex */
public class z0 implements android.widget.CompoundButton.OnCheckedChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.j0 f178822a;

    public z0(com.tencent.mm.plugin.wallet.pay.ui.WalletPayUI walletPayUI, com.tencent.mm.ui.widget.dialog.j0 j0Var) {
        this.f178822a = j0Var;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z17) {
        android.widget.Button f17 = this.f178822a.f(-2);
        if (z17) {
            f17.setEnabled(false);
        } else {
            f17.setEnabled(true);
        }
    }
}
