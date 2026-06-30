package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public class e extends android.os.CountDownTimer {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.f f146854a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(com.tencent.mm.plugin.luckymoney.ui.f fVar, long j17, long j18) {
        super(j17, j18);
        this.f146854a = fVar;
    }

    @Override // android.os.CountDownTimer
    public void onFinish() {
        com.tencent.mm.plugin.luckymoney.ui.i iVar = this.f146854a.f146889e.f145953i;
        if (iVar != null) {
            com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyAutoScrollView luckyMoneyAutoScrollView = (com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyAutoScrollView) iVar;
            if (luckyMoneyAutoScrollView.f145970w) {
                return;
            }
            luckyMoneyAutoScrollView.f145970w = true;
            com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.luckymoney.ui.k(luckyMoneyAutoScrollView));
        }
    }

    @Override // android.os.CountDownTimer
    public void onTick(long j17) {
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyAutoScrollItem luckyMoneyAutoScrollItem = this.f146854a.f146889e;
        int i17 = luckyMoneyAutoScrollItem.f145951g + 1;
        luckyMoneyAutoScrollItem.f145951g = i17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(luckyMoneyAutoScrollItem, arrayList.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyAutoScrollItem$1$1", "onTick", "(J)V", "Undefined", "smoothScrollToPosition", "(I)V");
        luckyMoneyAutoScrollItem.smoothScrollToPosition(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(luckyMoneyAutoScrollItem, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyAutoScrollItem$1$1", "onTick", "(J)V", "Undefined", "smoothScrollToPosition", "(I)V");
    }
}
