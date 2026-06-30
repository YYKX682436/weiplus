package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public final class b8 implements e51.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewDetailUI f146741a;

    public b8(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewDetailUI luckyMoneyNewDetailUI) {
        this.f146741a = luckyMoneyNewDetailUI;
    }

    @Override // e51.f
    public final f51.b a(java.util.Random random) {
        int nextInt = random.nextInt(8);
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewDetailUI luckyMoneyNewDetailUI = this.f146741a;
        switch (nextInt) {
            case 0:
                if (luckyMoneyNewDetailUI.K2 == null) {
                    luckyMoneyNewDetailUI.K2 = com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewDetailUI.V6(luckyMoneyNewDetailUI, com.tencent.mm.R.drawable.c_1);
                }
                return new f51.a(luckyMoneyNewDetailUI.K2);
            case 1:
                if (luckyMoneyNewDetailUI.L2 == null) {
                    luckyMoneyNewDetailUI.L2 = com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewDetailUI.V6(luckyMoneyNewDetailUI, com.tencent.mm.R.drawable.c_2);
                }
                return new f51.a(luckyMoneyNewDetailUI.L2);
            case 2:
                if (luckyMoneyNewDetailUI.M2 == null) {
                    luckyMoneyNewDetailUI.M2 = com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewDetailUI.V6(luckyMoneyNewDetailUI, com.tencent.mm.R.drawable.c_3);
                }
                return new f51.a(luckyMoneyNewDetailUI.M2);
            case 3:
                if (luckyMoneyNewDetailUI.F2 == null) {
                    luckyMoneyNewDetailUI.F2 = com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewDetailUI.V6(luckyMoneyNewDetailUI, com.tencent.mm.R.drawable.c9w);
                }
                return new f51.a(luckyMoneyNewDetailUI.F2);
            case 4:
                if (luckyMoneyNewDetailUI.G2 == null) {
                    luckyMoneyNewDetailUI.G2 = com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewDetailUI.V6(luckyMoneyNewDetailUI, com.tencent.mm.R.drawable.c9x);
                }
                return new f51.a(luckyMoneyNewDetailUI.G2);
            case 5:
                if (luckyMoneyNewDetailUI.H2 == null) {
                    luckyMoneyNewDetailUI.H2 = com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewDetailUI.V6(luckyMoneyNewDetailUI, com.tencent.mm.R.drawable.c9y);
                }
                return new f51.a(luckyMoneyNewDetailUI.H2);
            case 6:
                if (luckyMoneyNewDetailUI.I2 == null) {
                    luckyMoneyNewDetailUI.I2 = com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewDetailUI.V6(luckyMoneyNewDetailUI, com.tencent.mm.R.drawable.c9z);
                }
                return new f51.a(luckyMoneyNewDetailUI.I2);
            case 7:
                if (luckyMoneyNewDetailUI.J2 == null) {
                    luckyMoneyNewDetailUI.J2 = com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewDetailUI.V6(luckyMoneyNewDetailUI, com.tencent.mm.R.drawable.c_0);
                }
                return new f51.a(luckyMoneyNewDetailUI.J2);
            default:
                return null;
        }
    }
}
