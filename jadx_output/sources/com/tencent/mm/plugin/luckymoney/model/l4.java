package com.tencent.mm.plugin.luckymoney.model;

/* loaded from: classes9.dex */
public final class l4 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.luckymoney.model.l4 f145416a = new com.tencent.mm.plugin.luckymoney.model.l4();

    public static final void a(android.app.Activity activity, java.lang.String str) {
        if (activity == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.LuckyMoneyLqtSaveJumpHandler", "[jumpToLqtSaveKinda] activity is null, ignore");
            return;
        }
        at4.x1 Ai = vr4.f1.wi().Ai();
        if ((Ai != null ? Ai.f13999h : null) != null) {
            f145416a.b(activity, str, null);
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyLqtSaveJumpHandler", "[jumpToLqtSaveKinda] balance is null, publish WalletGetUserInfoEvent first");
        android.app.Dialog e17 = com.tencent.mm.wallet_core.ui.b2.e(activity, false, false, null);
        com.tencent.mm.autogen.events.WalletGetUserInfoEvent walletGetUserInfoEvent = new com.tencent.mm.autogen.events.WalletGetUserInfoEvent();
        am.l10 l10Var = walletGetUserInfoEvent.f54958g;
        if (l10Var != null) {
            l10Var.f7215a = 1;
        }
        if (l10Var != null) {
            l10Var.f7216b = true;
        }
        if (l10Var != null) {
            l10Var.f7217c = true;
        }
        am.m10 m10Var = walletGetUserInfoEvent.f54959h;
        if (m10Var != null) {
            m10Var.f7292a = new com.tencent.mm.plugin.luckymoney.model.j4(activity, str, e17);
        }
        android.os.Looper myLooper = android.os.Looper.myLooper();
        if (myLooper != null) {
            walletGetUserInfoEvent.b(myLooper);
        }
    }

    public final void b(android.app.Activity activity, java.lang.String str, android.app.Dialog dialog) {
        if (dialog != null) {
            dialog.dismiss();
        }
        if (activity.isFinishing() || activity.isDestroyed()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyLqtSaveJumpHandler", "[startKindaUseCase] activity is finishing/destroyed, abort");
            return;
        }
        android.content.Intent intent = new android.content.Intent(activity, (java.lang.Class<?>) com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSaveFetchUI.class);
        intent.putExtra("lqt_save_fetch_mode", 1);
        intent.putExtra("operate_id", str);
        intent.putExtra("entrance_type", 6);
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyLqtSaveJumpHandler", "[startKindaUseCase] start lqt save use case (kinda only)");
        if (((h45.q) i95.n0.c(h45.q.class)).startLqtSaveUseCase(activity, intent, com.tencent.mm.plugin.luckymoney.model.k4.f145395a)) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyLqtSaveJumpHandler", "[startKindaUseCase] startLqtSaveUseCase not available, start failed");
    }
}
