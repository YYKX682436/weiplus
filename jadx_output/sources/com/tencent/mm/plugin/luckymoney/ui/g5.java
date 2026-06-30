package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes5.dex */
public class g5 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyHistoryEnvelopeUI f146927d;

    public g5(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyHistoryEnvelopeUI luckyMoneyHistoryEnvelopeUI) {
        this.f146927d = luckyMoneyHistoryEnvelopeUI;
    }

    @Override // db5.o4
    public void onCreateMMMenu(db5.g4 g4Var) {
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyHistoryEnvelopeUI luckyMoneyHistoryEnvelopeUI = this.f146927d;
        g4Var.d(0, luckyMoneyHistoryEnvelopeUI.getResources().getColor(com.tencent.mm.R.color.f478532ac), luckyMoneyHistoryEnvelopeUI.getString(com.tencent.mm.R.string.gmr));
    }
}
