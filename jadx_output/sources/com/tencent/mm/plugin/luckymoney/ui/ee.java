package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public final class ee extends com.tencent.mm.wallet_core.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewReceiveUI f146873d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ee(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewReceiveUI luckyMoneyNewReceiveUI) {
        super(false);
        this.f146873d = luckyMoneyNewReceiveUI;
    }

    @Override // com.tencent.mm.wallet_core.ui.z1
    public void onRealClick(android.view.View v17) {
        kotlin.jvm.internal.o.g(v17, "v");
        com.tencent.mm.plugin.luckymoney.ui.zd zdVar = com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewReceiveUI.Q1;
        this.f146873d.g7(true);
    }
}
