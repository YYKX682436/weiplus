package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public final class k7 implements in5.c {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.luckymoney.model.h5 f147098d;

    public k7(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewDetailUI luckyMoneyNewDetailUI) {
    }

    @Override // in5.c
    public long getItemId() {
        com.tencent.mm.plugin.luckymoney.model.h5 h5Var = this.f147098d;
        return (h5Var != null ? h5Var.f145317i : null) != null ? r0.hashCode() : 0;
    }

    @Override // in5.c
    public int h() {
        return 2;
    }
}
