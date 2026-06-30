package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public class bk extends com.tencent.mm.wallet_core.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNotHookReceiveUI f146758d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bk(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNotHookReceiveUI luckyMoneyNotHookReceiveUI) {
        super(false);
        this.f146758d = luckyMoneyNotHookReceiveUI;
    }

    @Override // com.tencent.mm.wallet_core.ui.z1
    public void onRealClick(android.view.View view) {
        int i17 = com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNotHookReceiveUI.L1;
        this.f146758d.e7(true);
    }
}
