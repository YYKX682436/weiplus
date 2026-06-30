package ub3;

/* loaded from: classes14.dex */
public class j implements c01.zc {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.f2f.ui.LuckyMoneyF2FQRCodeUI f426113d;

    public j(com.tencent.mm.plugin.luckymoney.f2f.ui.LuckyMoneyF2FQRCodeUI luckyMoneyF2FQRCodeUI) {
        this.f426113d = luckyMoneyF2FQRCodeUI;
    }

    @Override // c01.zc
    public void O0(com.tencent.mm.modelbase.p0 p0Var) {
        java.util.Map d17 = com.tencent.mm.sdk.platformtools.aa.d(x51.j1.g(p0Var.f70726a.f377561h), "sysmsg", null);
        if (d17 != null) {
            java.lang.String str = (java.lang.String) d17.get(".sysmsg.sendId");
            java.lang.String str2 = (java.lang.String) d17.get(".sysmsg.username");
            java.lang.String str3 = (java.lang.String) d17.get(".sysmsg.amount");
            java.lang.String str4 = (java.lang.String) d17.get(".sysmsg.receiveId");
            int P = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".sysmsg.islucky"), 0);
            com.tencent.mm.plugin.luckymoney.f2f.ui.LuckyMoneyF2FQRCodeUI luckyMoneyF2FQRCodeUI = this.f426113d;
            if (P > 0) {
                luckyMoneyF2FQRCodeUI.L = str2;
            }
            if (com.tencent.mm.sdk.platformtools.t8.N0(str, str2, str3)) {
                return;
            }
            luckyMoneyF2FQRCodeUI.runOnUiThread(new ub3.b(this, str4, str2, str3));
        }
    }

    @Override // c01.zc
    public void g1(com.tencent.mm.modelbase.r0 r0Var) {
    }
}
