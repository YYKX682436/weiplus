package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public class c1 implements db5.f4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyCanShareListUI f146771a;

    public c1(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyCanShareListUI luckyMoneyCanShareListUI) {
        this.f146771a = luckyMoneyCanShareListUI;
    }

    @Override // db5.f4
    public void onLoadMore() {
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyCanShareListUI luckyMoneyCanShareListUI = this.f146771a;
        if (!luckyMoneyCanShareListUI.f146044n || luckyMoneyCanShareListUI.f146045o) {
            return;
        }
        luckyMoneyCanShareListUI.V6();
    }
}
