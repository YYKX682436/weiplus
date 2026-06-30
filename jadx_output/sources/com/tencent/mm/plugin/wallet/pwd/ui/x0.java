package com.tencent.mm.plugin.wallet.pwd.ui;

/* loaded from: classes9.dex */
public class x0 implements qp5.k0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.pwd.ui.WalletIdCardCheckUI f179110a;

    public x0(com.tencent.mm.plugin.wallet.pwd.ui.WalletIdCardCheckUI walletIdCardCheckUI) {
        this.f179110a = walletIdCardCheckUI;
    }

    @Override // qp5.k0
    public void a(java.lang.CharSequence charSequence) {
        int length = charSequence.length();
        com.tencent.mm.plugin.wallet.pwd.ui.WalletIdCardCheckUI walletIdCardCheckUI = this.f179110a;
        if (length > 0) {
            walletIdCardCheckUI.f178901g.setEnabled(true);
        } else {
            walletIdCardCheckUI.f178901g.setEnabled(false);
        }
    }
}
