package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public class b5 extends ym5.q3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyHistoryEnvelopeUI f146738a;

    public b5(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyHistoryEnvelopeUI luckyMoneyHistoryEnvelopeUI) {
        this.f146738a = luckyMoneyHistoryEnvelopeUI;
    }

    @Override // ym5.q3
    public void b(int i17) {
        this.f146738a.runOnUiThread(new com.tencent.mm.plugin.luckymoney.ui.z4(this));
    }

    @Override // ym5.q3
    public void c(ym5.s3 s3Var) {
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyHistoryEnvelopeUI luckyMoneyHistoryEnvelopeUI = this.f146738a;
        if (luckyMoneyHistoryEnvelopeUI.f146139z) {
            return;
        }
        luckyMoneyHistoryEnvelopeUI.f146133t.H(null);
    }
}
