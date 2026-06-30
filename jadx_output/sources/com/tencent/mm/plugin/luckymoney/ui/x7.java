package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public final class x7 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public boolean f147673d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewDetailUI f147674e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.zg5 f147675f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.app.Dialog f147676g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f147677h;

    public x7(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewDetailUI luckyMoneyNewDetailUI, r45.zg5 zg5Var, android.app.Dialog dialog, java.lang.String str) {
        this.f147674e = luckyMoneyNewDetailUI;
        this.f147675f = zg5Var;
        this.f147676g = dialog;
        this.f147677h = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewDetailUI", "[fetchLqtDetail] WalletGetUserInfoEvent callback() hasCallback:%s", java.lang.Boolean.valueOf(this.f147673d));
        if (!this.f147673d) {
            r45.zg5 qryUsrFundDetailRes = this.f147675f;
            kotlin.jvm.internal.o.f(qryUsrFundDetailRes, "$qryUsrFundDetailRes");
            com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewDetailUI.Y6(this.f147674e, qryUsrFundDetailRes, this.f147676g, this.f147677h);
        }
        this.f147673d = true;
    }
}
