package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public class ml implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPickEnvelopeUI f147196d;

    public ml(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPickEnvelopeUI luckyMoneyPickEnvelopeUI) {
        this.f147196d = luckyMoneyPickEnvelopeUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPickEnvelopeUI luckyMoneyPickEnvelopeUI = this.f147196d;
        int i17 = luckyMoneyPickEnvelopeUI.f146534v;
        if (i17 >= 0 && i17 < luckyMoneyPickEnvelopeUI.f146524n.getItemCount()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyPickEnvelopeUI", "normal scroll，pos: %s", java.lang.Integer.valueOf(luckyMoneyPickEnvelopeUI.f146534v));
            com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyEnvelopeTouchRecyclerView luckyMoneyEnvelopeTouchRecyclerView = luckyMoneyPickEnvelopeUI.f146521i;
            com.tencent.mm.plugin.luckymoney.scaledLayout.ScaleLayoutManager scaleLayoutManager = luckyMoneyPickEnvelopeUI.f146523m;
            int b07 = scaleLayoutManager.b0(luckyMoneyPickEnvelopeUI.f146534v);
            if (scaleLayoutManager.f145743y == 1) {
                luckyMoneyEnvelopeTouchRecyclerView.scrollBy(0, b07);
            } else {
                luckyMoneyEnvelopeTouchRecyclerView.scrollBy(b07, 0);
            }
        }
        java.lang.Math.max(luckyMoneyPickEnvelopeUI.f146534v, 0);
        androidx.recyclerview.widget.w2 w2Var = luckyMoneyPickEnvelopeUI.H;
        if (w2Var == null) {
            luckyMoneyPickEnvelopeUI.H = new com.tencent.mm.plugin.luckymoney.ui.ll(this);
        } else {
            luckyMoneyPickEnvelopeUI.f146521i.V0(w2Var);
        }
        luckyMoneyPickEnvelopeUI.f146521i.i(luckyMoneyPickEnvelopeUI.H);
    }
}
