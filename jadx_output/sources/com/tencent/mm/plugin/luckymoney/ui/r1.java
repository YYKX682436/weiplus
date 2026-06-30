package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public class r1 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.s1 f147361d;

    public r1(com.tencent.mm.plugin.luckymoney.ui.s1 s1Var) {
        this.f147361d = s1Var;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyDetailUI", "showLuckyHbDlg() onMMMenuItemSelected menuItemId:%s", java.lang.Integer.valueOf(menuItem.getItemId()));
        int itemId = menuItem.getItemId();
        com.tencent.mm.plugin.luckymoney.ui.s1 s1Var = this.f147361d;
        if (itemId == 1) {
            com.tencent.mm.feature.emoji.api.e7 e7Var = (com.tencent.mm.feature.emoji.api.e7) i95.n0.c(com.tencent.mm.feature.emoji.api.e7.class);
            com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyDetailUI luckyMoneyDetailUI = s1Var.f147398d;
            java.lang.String str = luckyMoneyDetailUI.L1;
            ((h30.k) e7Var).getClass();
            o22.i.b(luckyMoneyDetailUI, 5, str);
            s1Var.f147398d.f146062g2 = new com.tencent.mm.autogen.mmdata.rpt.RedEnvReplyWithEmoticonClickStruct();
            com.tencent.mm.autogen.mmdata.rpt.RedEnvReplyWithEmoticonClickStruct redEnvReplyWithEmoticonClickStruct = s1Var.f147398d.f146062g2;
            redEnvReplyWithEmoticonClickStruct.f59932d = 4L;
            redEnvReplyWithEmoticonClickStruct.k();
            s1Var.f147398d.f146068i2 = 1;
            return;
        }
        if (itemId == 2) {
            com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyDetailUI.V6(s1Var.f147398d);
            return;
        }
        if (itemId != 3) {
            return;
        }
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyDetailUI luckyMoneyDetailUI2 = s1Var.f147398d;
        luckyMoneyDetailUI2.Z1 = null;
        luckyMoneyDetailUI2.f146062g2 = new com.tencent.mm.autogen.mmdata.rpt.RedEnvReplyWithEmoticonClickStruct();
        com.tencent.mm.autogen.mmdata.rpt.RedEnvReplyWithEmoticonClickStruct redEnvReplyWithEmoticonClickStruct2 = s1Var.f147398d.f146062g2;
        redEnvReplyWithEmoticonClickStruct2.f59932d = 8L;
        redEnvReplyWithEmoticonClickStruct2.k();
        s1Var.f147398d.Z6(1);
    }
}
