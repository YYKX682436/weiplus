package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public class a5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyHistoryEnvelopeUI f146693d;

    public a5(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyHistoryEnvelopeUI luckyMoneyHistoryEnvelopeUI) {
        this.f146693d = luckyMoneyHistoryEnvelopeUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.graphics.Rect rect = new android.graphics.Rect();
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyHistoryEnvelopeUI luckyMoneyHistoryEnvelopeUI = this.f146693d;
        luckyMoneyHistoryEnvelopeUI.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
        luckyMoneyHistoryEnvelopeUI.f146120d = (rect.width() - (sp5.c.a(8) * 3)) / 2;
        int i17 = luckyMoneyHistoryEnvelopeUI.f146120d;
        luckyMoneyHistoryEnvelopeUI.f146121e = (int) (i17 * 1.9844f);
        luckyMoneyHistoryEnvelopeUI.f146122f = i17 - (sp5.c.a(8) * 2);
        int i18 = luckyMoneyHistoryEnvelopeUI.f146122f;
        luckyMoneyHistoryEnvelopeUI.f146123g = (int) (i18 * 1.656f);
        luckyMoneyHistoryEnvelopeUI.f146124h = (int) (i18 * 1.38f);
        luckyMoneyHistoryEnvelopeUI.f146125i = (int) (i18 / 2.9f);
        int i19 = (int) (i18 / 1.1f);
        luckyMoneyHistoryEnvelopeUI.f146126m = i19;
        luckyMoneyHistoryEnvelopeUI.f146127n = (int) (i19 * 1.656f);
        luckyMoneyHistoryEnvelopeUI.f146130q = (int) (i19 * 1.38f);
        luckyMoneyHistoryEnvelopeUI.f146131r = (int) (i19 / 2.9f);
        luckyMoneyHistoryEnvelopeUI.f146128o = i18;
        luckyMoneyHistoryEnvelopeUI.f146129p = (int) (i18 * 1.72f);
    }
}
