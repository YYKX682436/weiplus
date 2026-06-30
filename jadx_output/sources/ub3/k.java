package ub3;

/* loaded from: classes9.dex */
public class k implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.f2f.ui.LuckyMoneyF2FQRCodeUI f426115d;

    public k(com.tencent.mm.plugin.luckymoney.f2f.ui.LuckyMoneyF2FQRCodeUI luckyMoneyF2FQRCodeUI) {
        this.f426115d = luckyMoneyF2FQRCodeUI;
    }

    @Override // db5.o4
    public void onCreateMMMenu(db5.g4 g4Var) {
        com.tencent.mm.plugin.luckymoney.f2f.ui.LuckyMoneyF2FQRCodeUI luckyMoneyF2FQRCodeUI = this.f426115d;
        if (com.tencent.mm.sdk.platformtools.t8.K0(luckyMoneyF2FQRCodeUI.S)) {
            g4Var.a(1, com.tencent.mm.R.string.gkr);
        } else {
            g4Var.p(1, luckyMoneyF2FQRCodeUI.getString(com.tencent.mm.R.string.gkr), luckyMoneyF2FQRCodeUI.S, 0);
        }
        g4Var.f(2, luckyMoneyF2FQRCodeUI.getString(com.tencent.mm.R.string.gjn));
    }
}
