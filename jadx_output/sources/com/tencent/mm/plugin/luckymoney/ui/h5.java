package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public class h5 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.wv3 f146979d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyHistoryEnvelopeUI f146980e;

    public h5(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyHistoryEnvelopeUI luckyMoneyHistoryEnvelopeUI, r45.wv3 wv3Var) {
        this.f146980e = luckyMoneyHistoryEnvelopeUI;
        this.f146979d = wv3Var;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        if (menuItem.getItemId() == 0) {
            java.lang.String str = this.f146979d.f389500f;
            int i18 = com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyHistoryEnvelopeUI.C;
            com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyHistoryEnvelopeUI luckyMoneyHistoryEnvelopeUI = this.f146980e;
            luckyMoneyHistoryEnvelopeUI.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyHistoryEnvelopeUI", "do delete show source: %s", str);
            new com.tencent.mm.plugin.luckymoney.model.c(str).l().h(new com.tencent.mm.plugin.luckymoney.ui.l4(luckyMoneyHistoryEnvelopeUI, db5.e1.O(luckyMoneyHistoryEnvelopeUI.getContext(), null, 3, com.tencent.mm.R.style.f494256i6, luckyMoneyHistoryEnvelopeUI.getString(com.tencent.mm.R.string.ggc), true, false, new com.tencent.mm.plugin.luckymoney.ui.k4(luckyMoneyHistoryEnvelopeUI)), str)).f(luckyMoneyHistoryEnvelopeUI);
        }
    }
}
