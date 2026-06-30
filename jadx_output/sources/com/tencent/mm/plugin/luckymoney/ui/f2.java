package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public class f2 implements e51.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyDetailUI f146890a;

    public f2(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyDetailUI luckyMoneyDetailUI) {
        this.f146890a = luckyMoneyDetailUI;
    }

    @Override // e51.f
    public f51.b a(java.util.Random random) {
        int nextInt = random.nextInt(8);
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyDetailUI luckyMoneyDetailUI = this.f146890a;
        switch (nextInt) {
            case 0:
                if (luckyMoneyDetailUI.K2 == null) {
                    luckyMoneyDetailUI.K2 = com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyDetailUI.X6(luckyMoneyDetailUI, com.tencent.mm.R.drawable.c_1);
                }
                return new f51.a(luckyMoneyDetailUI.K2);
            case 1:
                if (luckyMoneyDetailUI.L2 == null) {
                    luckyMoneyDetailUI.L2 = com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyDetailUI.X6(luckyMoneyDetailUI, com.tencent.mm.R.drawable.c_2);
                }
                return new f51.a(luckyMoneyDetailUI.L2);
            case 2:
                if (luckyMoneyDetailUI.M2 == null) {
                    luckyMoneyDetailUI.M2 = com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyDetailUI.X6(luckyMoneyDetailUI, com.tencent.mm.R.drawable.c_3);
                }
                return new f51.a(luckyMoneyDetailUI.M2);
            case 3:
                if (luckyMoneyDetailUI.F2 == null) {
                    luckyMoneyDetailUI.F2 = com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyDetailUI.X6(luckyMoneyDetailUI, com.tencent.mm.R.drawable.c9w);
                }
                return new f51.a(luckyMoneyDetailUI.F2);
            case 4:
                if (luckyMoneyDetailUI.G2 == null) {
                    luckyMoneyDetailUI.G2 = com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyDetailUI.X6(luckyMoneyDetailUI, com.tencent.mm.R.drawable.c9x);
                }
                return new f51.a(luckyMoneyDetailUI.G2);
            case 5:
                if (luckyMoneyDetailUI.H2 == null) {
                    luckyMoneyDetailUI.H2 = com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyDetailUI.X6(luckyMoneyDetailUI, com.tencent.mm.R.drawable.c9y);
                }
                return new f51.a(luckyMoneyDetailUI.H2);
            case 6:
                if (luckyMoneyDetailUI.I2 == null) {
                    luckyMoneyDetailUI.I2 = com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyDetailUI.X6(luckyMoneyDetailUI, com.tencent.mm.R.drawable.c9z);
                }
                return new f51.a(luckyMoneyDetailUI.I2);
            case 7:
                if (luckyMoneyDetailUI.J2 == null) {
                    luckyMoneyDetailUI.J2 = com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyDetailUI.X6(luckyMoneyDetailUI, com.tencent.mm.R.drawable.c_0);
                }
                return new f51.a(luckyMoneyDetailUI.J2);
            default:
                return null;
        }
    }
}
