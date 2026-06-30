package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public final class i8 extends com.tencent.mm.wallet_core.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewDetailUI f147020d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i8(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewDetailUI luckyMoneyNewDetailUI) {
        super(false);
        this.f147020d = luckyMoneyNewDetailUI;
    }

    @Override // com.tencent.mm.wallet_core.ui.z1
    public void onRealClick(android.view.View v17) {
        kotlin.jvm.internal.o.g(v17, "v");
        com.tencent.mm.autogen.mmdata.rpt.RedEnvReplyWithEmoticonClickStruct redEnvReplyWithEmoticonClickStruct = new com.tencent.mm.autogen.mmdata.rpt.RedEnvReplyWithEmoticonClickStruct();
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewDetailUI luckyMoneyNewDetailUI = this.f147020d;
        luckyMoneyNewDetailUI.f146186g2 = redEnvReplyWithEmoticonClickStruct;
        com.tencent.mm.autogen.mmdata.rpt.RedEnvReplyWithEmoticonClickStruct redEnvReplyWithEmoticonClickStruct2 = luckyMoneyNewDetailUI.f146186g2;
        if (redEnvReplyWithEmoticonClickStruct2 != null) {
            redEnvReplyWithEmoticonClickStruct2.f59932d = 7L;
        }
        if (redEnvReplyWithEmoticonClickStruct2 != null) {
            redEnvReplyWithEmoticonClickStruct2.k();
        }
        luckyMoneyNewDetailUI.f146213p2 = luckyMoneyNewDetailUI.g7();
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewDetailUI", "click mEmojiUseType：%s", java.lang.Integer.valueOf(luckyMoneyNewDetailUI.f146213p2));
        int i17 = luckyMoneyNewDetailUI.f146213p2;
        if (i17 == 1) {
            java.lang.Object m17 = gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_WALLET_HONGBAO_LAST_THX_SEND_EMOJI_NORMAL_STRING, "");
            java.lang.String str = m17 instanceof java.lang.String ? (java.lang.String) m17 : null;
            luckyMoneyNewDetailUI.l7(str != null ? str : "");
        } else if (i17 != 2) {
            com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewDetailUI.m7(luckyMoneyNewDetailUI, null, 1, null);
        } else {
            com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewDetailUI.m7(luckyMoneyNewDetailUI, null, 1, null);
        }
    }
}
