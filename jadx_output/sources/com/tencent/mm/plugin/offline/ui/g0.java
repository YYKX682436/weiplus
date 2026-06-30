package com.tencent.mm.plugin.offline.ui;

/* loaded from: classes9.dex */
public class g0 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f152624d;

    public g0(android.app.Activity activity) {
        this.f152624d = activity;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        android.app.Activity activity = this.f152624d;
        if (activity instanceof com.tencent.mm.plugin.offline.ui.WalletOfflineCoinPurseUI) {
            ((com.tencent.mm.plugin.offline.ui.WalletOfflineCoinPurseUI) activity).f152537u2 = false;
        }
        dialogInterface.dismiss();
    }
}
