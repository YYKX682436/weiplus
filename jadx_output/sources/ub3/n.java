package ub3;

/* loaded from: classes15.dex */
public class n implements e51.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.f2f.ui.LuckyMoneyF2FQRCodeUI f426123a;

    public n(com.tencent.mm.plugin.luckymoney.f2f.ui.LuckyMoneyF2FQRCodeUI luckyMoneyF2FQRCodeUI) {
        this.f426123a = luckyMoneyF2FQRCodeUI;
    }

    @Override // e51.f
    public f51.b a(java.util.Random random) {
        int nextInt = random.nextInt(100);
        com.tencent.mm.plugin.luckymoney.f2f.ui.LuckyMoneyF2FQRCodeUI luckyMoneyF2FQRCodeUI = this.f426123a;
        if (nextInt < 10) {
            if (luckyMoneyF2FQRCodeUI.A1 == null) {
                luckyMoneyF2FQRCodeUI.A1 = com.tencent.mm.plugin.luckymoney.f2f.ui.LuckyMoneyF2FQRCodeUI.V6(luckyMoneyF2FQRCodeUI, com.tencent.mm.R.drawable.c_1, 32);
            }
            return new f51.a(luckyMoneyF2FQRCodeUI.A1);
        }
        if (nextInt < 20) {
            if (luckyMoneyF2FQRCodeUI.B1 == null) {
                luckyMoneyF2FQRCodeUI.B1 = com.tencent.mm.plugin.luckymoney.f2f.ui.LuckyMoneyF2FQRCodeUI.V6(luckyMoneyF2FQRCodeUI, com.tencent.mm.R.drawable.c_2, 32);
            }
            return new f51.a(luckyMoneyF2FQRCodeUI.B1);
        }
        if (nextInt < 30) {
            if (luckyMoneyF2FQRCodeUI.C1 == null) {
                luckyMoneyF2FQRCodeUI.C1 = com.tencent.mm.plugin.luckymoney.f2f.ui.LuckyMoneyF2FQRCodeUI.V6(luckyMoneyF2FQRCodeUI, com.tencent.mm.R.drawable.c_3, 32);
            }
            return new f51.a(luckyMoneyF2FQRCodeUI.C1);
        }
        if (nextInt < 50) {
            if (luckyMoneyF2FQRCodeUI.f145089x1 == null) {
                luckyMoneyF2FQRCodeUI.f145089x1 = com.tencent.mm.plugin.luckymoney.f2f.ui.LuckyMoneyF2FQRCodeUI.V6(luckyMoneyF2FQRCodeUI, com.tencent.mm.R.drawable.c9w, 32);
            }
            return new f51.a(luckyMoneyF2FQRCodeUI.f145089x1);
        }
        if (nextInt < 75) {
            if (luckyMoneyF2FQRCodeUI.f145092y1 == null) {
                luckyMoneyF2FQRCodeUI.f145092y1 = com.tencent.mm.plugin.luckymoney.f2f.ui.LuckyMoneyF2FQRCodeUI.V6(luckyMoneyF2FQRCodeUI, com.tencent.mm.R.drawable.c9x, 32);
            }
            return new f51.a(luckyMoneyF2FQRCodeUI.f145092y1);
        }
        if (luckyMoneyF2FQRCodeUI.f145094z1 == null) {
            luckyMoneyF2FQRCodeUI.f145094z1 = com.tencent.mm.plugin.luckymoney.f2f.ui.LuckyMoneyF2FQRCodeUI.V6(luckyMoneyF2FQRCodeUI, com.tencent.mm.R.drawable.c9y, 32);
        }
        return new f51.a(luckyMoneyF2FQRCodeUI.f145094z1);
    }
}
