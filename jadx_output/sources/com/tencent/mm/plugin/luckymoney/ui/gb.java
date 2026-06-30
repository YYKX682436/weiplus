package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public final class gb extends com.tencent.mm.wallet_core.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI f146939d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gb(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI luckyMoneyNewPrepareUI) {
        super(false);
        this.f146939d = luckyMoneyNewPrepareUI;
    }

    @Override // com.tencent.mm.wallet_core.ui.z1
    public void onRealClick(android.view.View v17) {
        kotlin.jvm.internal.o.g(v17, "v");
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI luckyMoneyNewPrepareUI = this.f146939d;
        fc3.j.a(luckyMoneyNewPrepareUI, luckyMoneyNewPrepareUI.G1);
        com.tencent.mm.plugin.luckymoney.ui.b bVar = luckyMoneyNewPrepareUI.H1;
        if (bVar != null) {
            bVar.dismiss();
        }
    }
}
