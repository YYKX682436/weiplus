package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public final class w8 extends com.tencent.mm.wallet_core.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewDetailUI f147640d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w8(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewDetailUI luckyMoneyNewDetailUI) {
        super(false);
        this.f147640d = luckyMoneyNewDetailUI;
    }

    @Override // com.tencent.mm.wallet_core.ui.z1
    public void onRealClick(android.view.View v17) {
        kotlin.jvm.internal.o.g(v17, "v");
        gb3.o.f270035a.a(8);
        com.tencent.mm.autogen.mmdata.rpt.RedEnvReplyWithEmoticonClickStruct redEnvReplyWithEmoticonClickStruct = new com.tencent.mm.autogen.mmdata.rpt.RedEnvReplyWithEmoticonClickStruct();
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewDetailUI luckyMoneyNewDetailUI = this.f147640d;
        luckyMoneyNewDetailUI.f146186g2 = redEnvReplyWithEmoticonClickStruct;
        int id6 = v17.getId();
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (id6 == com.tencent.mm.R.id.j76) {
            com.tencent.mm.autogen.mmdata.rpt.RedEnvReplyWithEmoticonClickStruct redEnvReplyWithEmoticonClickStruct2 = luckyMoneyNewDetailUI.f146186g2;
            if (redEnvReplyWithEmoticonClickStruct2 != null) {
                redEnvReplyWithEmoticonClickStruct2.f59932d = 1L;
            }
            if (redEnvReplyWithEmoticonClickStruct2 != null) {
                redEnvReplyWithEmoticonClickStruct2.k();
            }
        }
        com.tencent.mm.plugin.luckymoney.model.LuckyMoneyEmojiSwitch luckyMoneyEmojiSwitch = luckyMoneyNewDetailUI.f146183f2;
        if (com.tencent.mm.sdk.platformtools.t8.C0(luckyMoneyEmojiSwitch != null ? java.lang.Integer.valueOf(luckyMoneyEmojiSwitch.f145156g) : null, 0) && com.tencent.mm.sdk.platformtools.t8.C0(v17.getTag(), "nodelete")) {
            com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewDetailUI.Z6(luckyMoneyNewDetailUI);
            return;
        }
        com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) luckyMoneyNewDetailUI.getContext(), 1, false);
        k0Var.f211872n = new com.tencent.mm.plugin.luckymoney.ui.u8(luckyMoneyNewDetailUI, v17);
        k0Var.f211881s = new com.tencent.mm.plugin.luckymoney.ui.v8(luckyMoneyNewDetailUI);
        com.tencent.mm.autogen.mmdata.rpt.RedEnvReplyWithEmoticonClickStruct redEnvReplyWithEmoticonClickStruct3 = luckyMoneyNewDetailUI.f146186g2;
        if (redEnvReplyWithEmoticonClickStruct3 != null) {
            redEnvReplyWithEmoticonClickStruct3.f59932d = 2L;
        }
        if (redEnvReplyWithEmoticonClickStruct3 != null) {
            redEnvReplyWithEmoticonClickStruct3.k();
        }
        k0Var.v();
    }
}
