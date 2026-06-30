package com.tencent.mm.plugin.remittance.ui;

/* loaded from: classes9.dex */
public final class z6 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.remittance.ui.z6 f158065a = new com.tencent.mm.plugin.remittance.ui.z6();

    public final void a(android.app.Activity activity, java.lang.String str, android.app.Dialog dialog, h45.i iVar) {
        if (dialog != null) {
            dialog.dismiss();
        }
        if (activity.isFinishing() || activity.isDestroyed()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.RemittanceLqtSaveJumpHandler", "[startKindaUseCase] activity is finishing/destroyed, abort");
            return;
        }
        android.content.Intent intent = new android.content.Intent(activity, (java.lang.Class<?>) com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSaveFetchUI.class);
        intent.putExtra("lqt_save_fetch_mode", 1);
        intent.putExtra("operate_id", str);
        intent.putExtra("entrance_type", 2);
        com.tencent.mars.xlog.Log.i("MicroMsg.RemittanceLqtSaveJumpHandler", "[startKindaUseCase] start lqt save use case (kinda only)");
        if (((h45.q) i95.n0.c(h45.q.class)).startLqtSaveUseCase(activity, intent, iVar)) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.RemittanceLqtSaveJumpHandler", "[startKindaUseCase] startLqtSaveUseCase not available, start failed");
    }
}
