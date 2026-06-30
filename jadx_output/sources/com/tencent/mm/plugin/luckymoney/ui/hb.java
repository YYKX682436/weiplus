package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public final class hb implements com.tencent.mm.plugin.luckymoney.ui.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI f146989a;

    public hb(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI luckyMoneyNewPrepareUI) {
        this.f146989a = luckyMoneyNewPrepareUI;
    }

    @Override // com.tencent.mm.plugin.luckymoney.ui.a
    public void a() {
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI luckyMoneyNewPrepareUI = this.f146989a;
        fc3.j.a(luckyMoneyNewPrepareUI, luckyMoneyNewPrepareUI.G1);
        com.tencent.mm.plugin.luckymoney.ui.b bVar = luckyMoneyNewPrepareUI.H1;
        if (bVar != null) {
            bVar.dismiss();
        }
    }
}
