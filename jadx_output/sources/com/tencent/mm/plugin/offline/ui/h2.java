package com.tencent.mm.plugin.offline.ui;

/* loaded from: classes9.dex */
public class h2 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.offline.ui.WalletOfflineCoinPurseUI f152634d;

    public h2(com.tencent.mm.plugin.offline.ui.WalletOfflineCoinPurseUI walletOfflineCoinPurseUI) {
        this.f152634d = walletOfflineCoinPurseUI;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        int i17 = com.tencent.mm.plugin.offline.ui.WalletOfflineCoinPurseUI.B2;
        this.f152634d.forceCancel();
    }
}
