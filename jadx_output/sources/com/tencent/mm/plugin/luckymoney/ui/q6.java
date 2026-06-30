package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public class q6 implements db5.f4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyMyRecordUI f147339a;

    public q6(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyMyRecordUI luckyMoneyMyRecordUI) {
        this.f147339a = luckyMoneyMyRecordUI;
    }

    @Override // db5.f4
    public void onLoadMore() {
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyMyRecordUI luckyMoneyMyRecordUI = this.f147339a;
        com.tencent.mm.plugin.luckymoney.model.r4 r4Var = luckyMoneyMyRecordUI.f145972d;
        if (!((r4Var.f145578g.isEmpty() && r4Var.f145577f.isEmpty()) ? false : true)) {
            luckyMoneyMyRecordUI.B = false;
        }
        if (!luckyMoneyMyRecordUI.A || luckyMoneyMyRecordUI.B) {
            return;
        }
        luckyMoneyMyRecordUI.W6();
    }
}
