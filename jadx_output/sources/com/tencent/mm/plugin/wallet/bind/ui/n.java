package com.tencent.mm.plugin.wallet.bind.ui;

/* loaded from: classes9.dex */
public class n implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f178637d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.bind.ui.WalletBankcardDetailUI f178638e;

    public n(com.tencent.mm.plugin.wallet.bind.ui.WalletBankcardDetailUI walletBankcardDetailUI, int i17) {
        this.f178638e = walletBankcardDetailUI;
        this.f178637d = i17;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        if (this.f178637d == 2) {
            int i18 = com.tencent.mm.plugin.wallet.bind.ui.WalletBankcardDetailUI.f178540n;
            this.f178638e.U6(true);
        }
        dialogInterface.dismiss();
    }
}
