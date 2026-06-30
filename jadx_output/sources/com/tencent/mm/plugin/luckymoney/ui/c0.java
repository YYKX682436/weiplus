package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public class c0 implements com.tencent.mm.ui.e8 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyBusiDetailUI f146770a;

    public c0(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyBusiDetailUI luckyMoneyBusiDetailUI) {
        this.f146770a = luckyMoneyBusiDetailUI;
    }

    @Override // com.tencent.mm.ui.e8
    public void a(int i17) {
        if (i17 == -2) {
            com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyWishFooter luckyMoneyWishFooter = this.f146770a.f145994p;
            if (luckyMoneyWishFooter.f146685t) {
                luckyMoneyWishFooter.setModeClick(false);
            }
        }
    }
}
