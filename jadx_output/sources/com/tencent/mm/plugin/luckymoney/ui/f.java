package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f146888d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyAutoScrollItem f146889e;

    public f(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyAutoScrollItem luckyMoneyAutoScrollItem, long j17) {
        this.f146889e = luckyMoneyAutoScrollItem;
        this.f146888d = j17;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f146889e.f145952h = new com.tencent.mm.plugin.luckymoney.ui.e(this, this.f146888d, 50L).start();
    }
}
