package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public class nf implements zs4.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.model.l6 f147239a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearReceiveUI f147240b;

    public nf(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearReceiveUI luckyMoneyNewYearReceiveUI, com.tencent.mm.plugin.luckymoney.model.l6 l6Var) {
        this.f147240b = luckyMoneyNewYearReceiveUI;
        this.f147239a = l6Var;
    }

    @Override // zs4.p
    public boolean run(int i17, int i18, java.lang.String str, boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewYearReceiveUI", "showDisclaimerDialog resultCode=" + i17 + ";errCode=" + i18 + ";errMsg=" + str + ";hadAgree = " + z17);
        if (i17 == 1) {
            this.f147240b.finish();
        } else {
            com.tencent.mm.plugin.luckymoney.model.l6 l6Var = this.f147239a;
            if (i17 == 2) {
                com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearReceiveUI luckyMoneyNewYearReceiveUI = this.f147240b;
                int i19 = l6Var.f145418h;
                int i27 = l6Var.f145419i;
                java.lang.String str2 = l6Var.f145420m;
                java.lang.String str3 = l6Var.f145421n;
                java.lang.String str4 = l6Var.P;
                int i28 = com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearReceiveUI.P;
                luckyMoneyNewYearReceiveUI.W6(i19, i27, str2, str3, str4);
            } else if (i17 == 0 && z17) {
                com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearReceiveUI luckyMoneyNewYearReceiveUI2 = this.f147240b;
                int i29 = l6Var.f145418h;
                int i37 = l6Var.f145419i;
                java.lang.String str5 = l6Var.f145420m;
                java.lang.String str6 = l6Var.f145421n;
                java.lang.String str7 = l6Var.P;
                int i38 = com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearReceiveUI.P;
                luckyMoneyNewYearReceiveUI2.W6(i29, i37, str5, str6, str7);
            }
        }
        return true;
    }
}
