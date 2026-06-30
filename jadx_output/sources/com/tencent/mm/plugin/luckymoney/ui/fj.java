package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public class fj implements com.tencent.mm.wallet_core.model.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.model.f6 f146912a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNotHookReceiveUI f146913b;

    public fj(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNotHookReceiveUI luckyMoneyNotHookReceiveUI, com.tencent.mm.plugin.luckymoney.model.f6 f6Var) {
        this.f146913b = luckyMoneyNotHookReceiveUI;
        this.f146912a = f6Var;
    }

    @Override // com.tencent.mm.wallet_core.model.p
    public void a() {
        int i17 = com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNotHookReceiveUI.L1;
        this.f146913b.Y6(this.f146912a);
    }
}
