package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public class p2 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.balance.model.lqt.z0 f147300a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.app.Dialog f147301b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f147302c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyDetailUI f147303d;

    public p2(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyDetailUI luckyMoneyDetailUI, com.tencent.mm.plugin.wallet.balance.model.lqt.z0 z0Var, android.app.Dialog dialog, java.lang.String str) {
        this.f147303d = luckyMoneyDetailUI;
        this.f147300a = z0Var;
        this.f147301b = dialog;
        this.f147302c = str;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        r45.zg5 zg5Var = (r45.zg5) obj;
        if (zg5Var == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyDetailUI", "fetch detail failed");
            return null;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyDetailUI", "fetch detail success, account_type: %s, is_hide_close_account_btn: %s", java.lang.Integer.valueOf(zg5Var.C), java.lang.Boolean.valueOf(zg5Var.B));
        this.f147300a.f177758e.b(zg5Var.C, 6);
        if (vr4.f1.wi().Ai().f13999h != null) {
            com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyDetailUI.Y6(this.f147303d, zg5Var, this.f147301b, this.f147302c);
            return null;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyDetailUI", "publish WalletGetUserInfoEvent");
        com.tencent.mm.autogen.events.WalletGetUserInfoEvent walletGetUserInfoEvent = new com.tencent.mm.autogen.events.WalletGetUserInfoEvent();
        am.l10 l10Var = walletGetUserInfoEvent.f54958g;
        l10Var.f7215a = 1;
        l10Var.f7216b = true;
        l10Var.f7217c = true;
        walletGetUserInfoEvent.f54959h.f7292a = new com.tencent.mm.plugin.luckymoney.ui.o2(this, zg5Var);
        walletGetUserInfoEvent.b(android.os.Looper.myLooper());
        return null;
    }
}
