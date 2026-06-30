package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public final class ke implements c01.o8 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewReceiveUI f147104a;

    public ke(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewReceiveUI luckyMoneyNewReceiveUI) {
        this.f147104a = luckyMoneyNewReceiveUI;
    }

    @Override // c01.o8
    public final void a(java.lang.String str, boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyParseHelper", "getContact suc, user: %s", str);
        if (z17) {
            ((ku5.t0) ku5.t0.f312615d).D(new com.tencent.mm.plugin.luckymoney.ui.je(this.f147104a));
        }
    }
}
