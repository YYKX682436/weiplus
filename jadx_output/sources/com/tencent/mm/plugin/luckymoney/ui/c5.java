package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public class c5 extends androidx.recyclerview.widget.t0 {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.GridLayoutManager f146776c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyHistoryEnvelopeUI f146777d;

    public c5(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyHistoryEnvelopeUI luckyMoneyHistoryEnvelopeUI, androidx.recyclerview.widget.GridLayoutManager gridLayoutManager) {
        this.f146777d = luckyMoneyHistoryEnvelopeUI;
        this.f146776c = gridLayoutManager;
    }

    @Override // androidx.recyclerview.widget.t0
    public int c(int i17) {
        if (this.f146777d.f146135v.getItemViewType(i17) == 2) {
            return this.f146776c.f11861w;
        }
        return 1;
    }
}
