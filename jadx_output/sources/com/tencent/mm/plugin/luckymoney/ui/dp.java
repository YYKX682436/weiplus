package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public final class dp implements q80.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneySpareActivityEight f146853a;

    public dp(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneySpareActivityEight luckyMoneySpareActivityEight) {
        this.f146853a = luckyMoneySpareActivityEight;
    }

    @Override // q80.f0
    public void fail() {
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneySpareActivityEight", "[doRouter] startLiteApp failed");
        ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.plugin.luckymoney.ui.bp(this.f146853a));
    }

    @Override // q80.f0
    public void success() {
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneySpareActivityEight", "[doRouter] startLiteApp success ");
        ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.plugin.luckymoney.ui.cp(this.f146853a));
    }
}
