package com.tencent.mm.plugin.wallet.pay.ui;

/* loaded from: classes9.dex */
public class x extends com.tencent.mm.ui.bc {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.pay.ui.WalletPayDeductUI f178816e;

    public x(com.tencent.mm.plugin.wallet.pay.ui.WalletPayDeductUI walletPayDeductUI) {
        this.f178816e = walletPayDeductUI;
    }

    @Override // com.tencent.mm.ui.bc
    public void b(android.view.MenuItem menuItem) {
        com.tencent.mm.plugin.wallet.pay.ui.WalletPayDeductUI walletPayDeductUI = this.f178816e;
        walletPayDeductUI.setResult(0);
        walletPayDeductUI.finish();
    }
}
