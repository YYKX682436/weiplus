package com.tencent.mm.plugin.offline.ui;

/* loaded from: classes9.dex */
public class f2 implements android.content.DialogInterface.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.DialogInterface.OnDismissListener f152615d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.offline.ui.WalletOfflineCoinPurseUI f152616e;

    public f2(com.tencent.mm.plugin.offline.ui.WalletOfflineCoinPurseUI walletOfflineCoinPurseUI, android.content.DialogInterface.OnDismissListener onDismissListener) {
        this.f152616e = walletOfflineCoinPurseUI;
        this.f152615d = onDismissListener;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(android.content.DialogInterface dialogInterface) {
        android.content.DialogInterface.OnDismissListener onDismissListener = this.f152615d;
        if (onDismissListener != null) {
            onDismissListener.onDismiss(dialogInterface);
        }
        com.tencent.mm.plugin.offline.ui.WalletOfflineCoinPurseUI walletOfflineCoinPurseUI = this.f152616e;
        if (walletOfflineCoinPurseUI.C1) {
            walletOfflineCoinPurseUI.f152548y1 = false;
            walletOfflineCoinPurseUI.C1 = false;
            walletOfflineCoinPurseUI.r7(0, false);
            walletOfflineCoinPurseUI.Z6(true);
        }
    }
}
