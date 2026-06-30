package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public final class yb implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI f147732d;

    public yb(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI luckyMoneyNewPrepareUI) {
        this.f147732d = luckyMoneyNewPrepareUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f147732d.finish();
    }
}
