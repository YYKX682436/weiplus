package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes3.dex */
public final class xc implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI f147684d;

    public xc(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI luckyMoneyNewPrepareUI) {
        this.f147684d = luckyMoneyNewPrepareUI;
    }

    @Override // db5.o4
    public void onCreateMMMenu(db5.g4 menu) {
        kotlin.jvm.internal.o.g(menu, "menu");
        java.lang.ref.WeakReference weakReference = com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI.f146241x2;
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI luckyMoneyNewPrepareUI = this.f147684d;
        menu.add(0, 0, 0, luckyMoneyNewPrepareUI.getString(com.tencent.mm.R.string.gjn));
        menu.add(0, com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI.V2, 0, luckyMoneyNewPrepareUI.getString(com.tencent.mm.R.string.kmx));
    }
}
