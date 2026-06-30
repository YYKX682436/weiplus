package ub3;

/* loaded from: classes15.dex */
public class m implements e51.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.f2f.ui.LuckyMoneyF2FQRCodeUI f426119a;

    public m(com.tencent.mm.plugin.luckymoney.f2f.ui.LuckyMoneyF2FQRCodeUI luckyMoneyF2FQRCodeUI) {
        this.f426119a = luckyMoneyF2FQRCodeUI;
    }

    @Override // e51.f
    public f51.b a(java.util.Random random) {
        int nextInt = random.nextInt(100);
        com.tencent.mm.plugin.luckymoney.f2f.ui.LuckyMoneyF2FQRCodeUI luckyMoneyF2FQRCodeUI = this.f426119a;
        if (nextInt < 16) {
            if (luckyMoneyF2FQRCodeUI.f145091y0 == null) {
                luckyMoneyF2FQRCodeUI.f145091y0 = com.tencent.mm.plugin.luckymoney.f2f.ui.LuckyMoneyF2FQRCodeUI.V6(luckyMoneyF2FQRCodeUI, com.tencent.mm.R.drawable.c_1, 36);
            }
            return new f51.a(luckyMoneyF2FQRCodeUI.f145091y0);
        }
        if (nextInt < 33) {
            if (luckyMoneyF2FQRCodeUI.f145073l1 == null) {
                luckyMoneyF2FQRCodeUI.f145073l1 = com.tencent.mm.plugin.luckymoney.f2f.ui.LuckyMoneyF2FQRCodeUI.V6(luckyMoneyF2FQRCodeUI, com.tencent.mm.R.drawable.c_2, 36);
            }
            return new f51.a(luckyMoneyF2FQRCodeUI.f145073l1);
        }
        if (nextInt < 50) {
            if (luckyMoneyF2FQRCodeUI.f145079p1 == null) {
                luckyMoneyF2FQRCodeUI.f145079p1 = com.tencent.mm.plugin.luckymoney.f2f.ui.LuckyMoneyF2FQRCodeUI.V6(luckyMoneyF2FQRCodeUI, com.tencent.mm.R.drawable.c_3, 36);
            }
            return new f51.a(luckyMoneyF2FQRCodeUI.f145079p1);
        }
        if (nextInt < 70) {
            if (luckyMoneyF2FQRCodeUI.Z == null) {
                luckyMoneyF2FQRCodeUI.Z = com.tencent.mm.plugin.luckymoney.f2f.ui.LuckyMoneyF2FQRCodeUI.V6(luckyMoneyF2FQRCodeUI, com.tencent.mm.R.drawable.c9w, 36);
            }
            return new f51.a(luckyMoneyF2FQRCodeUI.Z);
        }
        if (nextInt < 90) {
            if (luckyMoneyF2FQRCodeUI.f145078p0 == null) {
                luckyMoneyF2FQRCodeUI.f145078p0 = com.tencent.mm.plugin.luckymoney.f2f.ui.LuckyMoneyF2FQRCodeUI.V6(luckyMoneyF2FQRCodeUI, com.tencent.mm.R.drawable.c9x, 36);
            }
            return new f51.a(luckyMoneyF2FQRCodeUI.f145078p0);
        }
        if (luckyMoneyF2FQRCodeUI.f145088x0 == null) {
            luckyMoneyF2FQRCodeUI.f145088x0 = com.tencent.mm.plugin.luckymoney.f2f.ui.LuckyMoneyF2FQRCodeUI.V6(luckyMoneyF2FQRCodeUI, com.tencent.mm.R.drawable.c9y, 36);
        }
        return new f51.a(luckyMoneyF2FQRCodeUI.f145088x0);
    }
}
