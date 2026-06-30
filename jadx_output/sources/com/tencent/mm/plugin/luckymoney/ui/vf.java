package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public class vf implements zs4.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.model.l6 f147546a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearReceiveUIV2 f147547b;

    public vf(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearReceiveUIV2 luckyMoneyNewYearReceiveUIV2, com.tencent.mm.plugin.luckymoney.model.l6 l6Var) {
        this.f147547b = luckyMoneyNewYearReceiveUIV2;
        this.f147546a = l6Var;
    }

    @Override // zs4.p
    public boolean run(int i17, int i18, java.lang.String str, boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewYearReceiveUIV2", "showDisclaimerDialog resultCode=" + i17 + ";errCode=" + i18 + ";errMsg=" + str + ";hadAgree = " + z17);
        if (i17 == 1) {
            this.f147547b.finish();
        } else {
            com.tencent.mm.plugin.luckymoney.model.l6 l6Var = this.f147546a;
            if (i17 == 2) {
                com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearReceiveUIV2 luckyMoneyNewYearReceiveUIV2 = this.f147547b;
                int i19 = l6Var.f145418h;
                int i27 = l6Var.f145419i;
                java.lang.String str2 = l6Var.f145420m;
                java.lang.String str3 = l6Var.f145421n;
                java.lang.String str4 = l6Var.P;
                int i28 = com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearReceiveUIV2.Y1;
                luckyMoneyNewYearReceiveUIV2.Y6(i19, i27, str2, str3, str4);
            } else if (i17 == 0 && z17) {
                com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearReceiveUIV2 luckyMoneyNewYearReceiveUIV22 = this.f147547b;
                int i29 = l6Var.f145418h;
                int i37 = l6Var.f145419i;
                java.lang.String str5 = l6Var.f145420m;
                java.lang.String str6 = l6Var.f145421n;
                java.lang.String str7 = l6Var.P;
                int i38 = com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearReceiveUIV2.Y1;
                luckyMoneyNewYearReceiveUIV22.Y6(i29, i37, str5, str6, str7);
            }
        }
        return true;
    }
}
