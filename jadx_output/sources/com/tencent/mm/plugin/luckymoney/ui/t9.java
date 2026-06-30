package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public final class t9 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewDetailUI f147450d;

    public t9(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewDetailUI luckyMoneyNewDetailUI) {
        this.f147450d = luckyMoneyNewDetailUI;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewDetailUI luckyMoneyNewDetailUI = this.f147450d;
        luckyMoneyNewDetailUI.N = (android.view.ViewGroup) luckyMoneyNewDetailUI.findViewById(com.tencent.mm.R.id.j1l);
        android.view.ViewGroup viewGroup = luckyMoneyNewDetailUI.N;
        if (viewGroup != null) {
            e51.f fVar = luckyMoneyNewDetailUI.N2;
            e51.a.b(viewGroup, fVar).d(100, 400L);
            e51.a.c(luckyMoneyNewDetailUI.N, fVar).d(100, 400L);
        }
    }
}
