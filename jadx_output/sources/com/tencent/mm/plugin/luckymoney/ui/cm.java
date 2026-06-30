package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public class cm implements q80.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f146804a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f146805b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPickEnvelopeUI f146806c;

    public cm(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPickEnvelopeUI luckyMoneyPickEnvelopeUI, int i17, java.lang.String str) {
        this.f146806c = luckyMoneyPickEnvelopeUI;
        this.f146804a = i17;
        this.f146805b = str;
    }

    @Override // q80.f0
    public void fail() {
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyPickEnvelopeUI", "[setRightTextOptionMenu] OpenLiteApp fail");
        ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.plugin.luckymoney.ui.bm(this));
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(this.f146806c.f146535w + 1);
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(this.f146806c.f146534v + 1);
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPickEnvelopeUI luckyMoneyPickEnvelopeUI = this.f146806c;
        g0Var.d(18892, 26, valueOf, valueOf2, luckyMoneyPickEnvelopeUI.K, luckyMoneyPickEnvelopeUI.b7(), this.f146806c.f146515J, java.lang.Integer.valueOf(r1.f146524n.getItemCount() - 1), java.lang.Integer.valueOf(this.f146806c.a7()), java.lang.Integer.valueOf(this.f146804a), this.f146805b);
    }

    @Override // q80.f0
    public void success() {
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyPickEnvelopeUI", "[setRightTextOptionMenu] OpenLiteApp success");
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPickEnvelopeUI luckyMoneyPickEnvelopeUI = this.f146806c;
        g0Var.d(18892, 25, java.lang.Integer.valueOf(luckyMoneyPickEnvelopeUI.f146535w + 1), java.lang.Integer.valueOf(luckyMoneyPickEnvelopeUI.f146534v + 1), luckyMoneyPickEnvelopeUI.K, luckyMoneyPickEnvelopeUI.b7(), luckyMoneyPickEnvelopeUI.f146515J, java.lang.Integer.valueOf(luckyMoneyPickEnvelopeUI.f146524n.getItemCount() - 1), java.lang.Integer.valueOf(luckyMoneyPickEnvelopeUI.a7()), java.lang.Integer.valueOf(this.f146804a), this.f146805b);
    }
}
