package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public class f5 extends androidx.recyclerview.widget.p2 {

    /* renamed from: d, reason: collision with root package name */
    public final int f146896d = sp5.c.a(4);

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyHistoryEnvelopeUI f146897e;

    public f5(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyHistoryEnvelopeUI luckyMoneyHistoryEnvelopeUI) {
        this.f146897e = luckyMoneyHistoryEnvelopeUI;
    }

    @Override // androidx.recyclerview.widget.p2
    public void getItemOffsets(android.graphics.Rect rect, android.view.View view, androidx.recyclerview.widget.RecyclerView recyclerView, androidx.recyclerview.widget.h3 h3Var) {
        int ceil = (int) java.lang.Math.ceil(this.f146897e.f146136w.size() / 2.0f);
        int u07 = recyclerView.u0(view);
        int ceil2 = (int) java.lang.Math.ceil((u07 + 1) / 2.0f);
        int i17 = this.f146896d;
        if (ceil2 == 0) {
            rect.top = i17 * 2;
            rect.bottom = i17 * 2;
        } else if (ceil2 == ceil) {
            rect.top = i17;
            rect.bottom = i17 * 2;
        } else {
            rect.top = i17;
            rect.bottom = i17;
        }
        if (u07 % 2 == 0) {
            rect.left = i17 * 2;
            rect.right = i17;
        } else {
            rect.left = i17;
            rect.right = i17 * 2;
        }
    }
}
