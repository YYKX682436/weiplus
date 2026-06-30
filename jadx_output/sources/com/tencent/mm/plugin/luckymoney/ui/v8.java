package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public final class v8 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewDetailUI f147534d;

    public v8(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewDetailUI luckyMoneyNewDetailUI) {
        this.f147534d = luckyMoneyNewDetailUI;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewDetailUI", "showLuckyHbDlg() onMMMenuItemSelected menuItemId:%s", java.lang.Integer.valueOf(menuItem.getItemId()));
        int itemId = menuItem.getItemId();
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewDetailUI luckyMoneyNewDetailUI = this.f147534d;
        if (itemId == 1) {
            com.tencent.mm.feature.emoji.api.e7 e7Var = (com.tencent.mm.feature.emoji.api.e7) i95.n0.c(com.tencent.mm.feature.emoji.api.e7.class);
            java.lang.String str = luckyMoneyNewDetailUI.L1;
            ((h30.k) e7Var).getClass();
            o22.i.b(luckyMoneyNewDetailUI, 5, str);
            luckyMoneyNewDetailUI.f146186g2 = new com.tencent.mm.autogen.mmdata.rpt.RedEnvReplyWithEmoticonClickStruct();
            com.tencent.mm.autogen.mmdata.rpt.RedEnvReplyWithEmoticonClickStruct redEnvReplyWithEmoticonClickStruct = luckyMoneyNewDetailUI.f146186g2;
            if (redEnvReplyWithEmoticonClickStruct != null) {
                redEnvReplyWithEmoticonClickStruct.f59932d = 4L;
            }
            if (redEnvReplyWithEmoticonClickStruct != null) {
                redEnvReplyWithEmoticonClickStruct.k();
            }
            luckyMoneyNewDetailUI.f146192i2 = 1;
            return;
        }
        if (itemId == 2) {
            com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewDetailUI.Z6(luckyMoneyNewDetailUI);
            return;
        }
        if (itemId != 3) {
            return;
        }
        luckyMoneyNewDetailUI.Z1 = null;
        luckyMoneyNewDetailUI.f146186g2 = new com.tencent.mm.autogen.mmdata.rpt.RedEnvReplyWithEmoticonClickStruct();
        com.tencent.mm.autogen.mmdata.rpt.RedEnvReplyWithEmoticonClickStruct redEnvReplyWithEmoticonClickStruct2 = luckyMoneyNewDetailUI.f146186g2;
        if (redEnvReplyWithEmoticonClickStruct2 != null) {
            redEnvReplyWithEmoticonClickStruct2.f59932d = 8L;
        }
        if (redEnvReplyWithEmoticonClickStruct2 != null) {
            redEnvReplyWithEmoticonClickStruct2.k();
        }
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewDetailUI.b7(luckyMoneyNewDetailUI, 1, null, 2, null);
    }
}
