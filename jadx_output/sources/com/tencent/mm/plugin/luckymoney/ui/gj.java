package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public class gj implements com.tencent.mm.plugin.wallet_core.utils.k0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.model.f6 f146952a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNotHookReceiveUI f146953b;

    public gj(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNotHookReceiveUI luckyMoneyNotHookReceiveUI, com.tencent.mm.plugin.luckymoney.model.f6 f6Var) {
        this.f146953b = luckyMoneyNotHookReceiveUI;
        this.f146952a = f6Var;
    }

    @Override // com.tencent.mm.plugin.wallet_core.utils.k0
    public void a(r45.n34 n34Var) {
        int i17 = n34Var.f381049e;
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNotHookReceiveUI luckyMoneyNotHookReceiveUI = this.f146953b;
        if (i17 != 2) {
            luckyMoneyNotHookReceiveUI.finish();
        } else {
            luckyMoneyNotHookReceiveUI.showLoading();
            luckyMoneyNotHookReceiveUI.V6(this.f146952a.f145292w);
        }
    }
}
