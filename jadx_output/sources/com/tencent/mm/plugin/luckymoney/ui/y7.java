package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public final class y7 implements com.tencent.mm.plugin.wallet.balance.model.lqt.d1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f147723a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.balance.model.lqt.e1 f147724b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewDetailUI f147725c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Dialog f147726d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f147727e;

    public y7(android.app.Activity activity, com.tencent.mm.plugin.wallet.balance.model.lqt.e1 e1Var, com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewDetailUI luckyMoneyNewDetailUI, android.app.Dialog dialog, java.lang.String str) {
        this.f147723a = activity;
        this.f147724b = e1Var;
        this.f147725c = luckyMoneyNewDetailUI;
        this.f147726d = dialog;
        this.f147727e = str;
    }

    @Override // com.tencent.mm.plugin.wallet.balance.model.lqt.d1
    public void call(java.lang.Object obj) {
        r45.zg5 zg5Var = (r45.zg5) obj;
        if (zg5Var == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewDetailUI", "[fetchLqtDetail] failed");
            return;
        }
        android.app.Activity activity = this.f147723a;
        if (activity.isFinishing() || activity.isDestroyed()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewDetailUI", "[fetchLqtDetail] this activity has finished");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewDetailUI", "[fetchLqtDetail] success, account_type: %s, is_hide_close_account_btn: %s", java.lang.Integer.valueOf(zg5Var.C), java.lang.Boolean.valueOf(zg5Var.B));
        this.f147724b.f177627a.f177758e.b(zg5Var.C, 6);
        com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard = vr4.f1.wi().Ai().f13999h;
        java.lang.String str = this.f147727e;
        android.app.Dialog dialog = this.f147726d;
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewDetailUI luckyMoneyNewDetailUI = this.f147725c;
        if (bankcard != null) {
            com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewDetailUI.Y6(luckyMoneyNewDetailUI, zg5Var, dialog, str);
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewDetailUI", "[fetchLqtDetail] publish WalletGetUserInfoEvent");
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
            m10Var.f7292a = new com.tencent.mm.plugin.luckymoney.ui.x7(luckyMoneyNewDetailUI, zg5Var, dialog, str);
        }
        android.os.Looper myLooper = android.os.Looper.myLooper();
        if (myLooper != null) {
            walletGetUserInfoEvent.b(myLooper);
        }
    }
}
