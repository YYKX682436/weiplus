package ub3;

/* loaded from: classes15.dex */
public class f implements ub3.u0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.f2f.ui.LuckyMoneyF2FQRCodeUI f426100a;

    public f(com.tencent.mm.plugin.luckymoney.f2f.ui.LuckyMoneyF2FQRCodeUI luckyMoneyF2FQRCodeUI) {
        this.f426100a = luckyMoneyF2FQRCodeUI;
    }

    public void a(int i17, int i18) {
        com.tencent.mm.plugin.luckymoney.f2f.ui.LuckyMoneyF2FQRCodeUI luckyMoneyF2FQRCodeUI = this.f426100a;
        if (i18 != 8) {
            luckyMoneyF2FQRCodeUI.H.a("select_card.m4a");
            return;
        }
        luckyMoneyF2FQRCodeUI.H.a("music" + (i17 + 1) + ".m4a");
    }

    public void b(int i17, int i18) {
        int i19 = com.tencent.mm.plugin.luckymoney.f2f.ui.LuckyMoneyF2FQRCodeUI.G1;
        com.tencent.mm.plugin.luckymoney.f2f.ui.LuckyMoneyF2FQRCodeUI luckyMoneyF2FQRCodeUI = this.f426100a;
        luckyMoneyF2FQRCodeUI.X6();
        if (i18 == 8) {
            int[] iArr = luckyMoneyF2FQRCodeUI.V;
            iArr[5] = iArr[5] + 1;
        } else {
            luckyMoneyF2FQRCodeUI.H.a("select_card.m4a");
            int[] iArr2 = luckyMoneyF2FQRCodeUI.V;
            iArr2[3] = iArr2[3] + 1;
        }
    }
}
