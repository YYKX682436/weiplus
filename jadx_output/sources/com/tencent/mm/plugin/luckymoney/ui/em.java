package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public class em extends androidx.recyclerview.widget.t0 {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPickEnvelopeUI f146883c;

    public em(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPickEnvelopeUI luckyMoneyPickEnvelopeUI) {
        this.f146883c = luckyMoneyPickEnvelopeUI;
    }

    @Override // androidx.recyclerview.widget.t0
    public int c(int i17) {
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPickEnvelopeUI luckyMoneyPickEnvelopeUI = this.f146883c;
        if (luckyMoneyPickEnvelopeUI.f146530r.getItemViewType(i17) == 2) {
            return luckyMoneyPickEnvelopeUI.f146529q.f11861w;
        }
        return 1;
    }
}
