package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public class n1 extends com.tencent.mm.wallet_core.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyDetailUI f147214d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n1(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyDetailUI luckyMoneyDetailUI) {
        super(false);
        this.f147214d = luckyMoneyDetailUI;
    }

    @Override // com.tencent.mm.wallet_core.ui.z1
    public void onRealClick(android.view.View view) {
        com.tencent.mm.autogen.mmdata.rpt.RedEnvReplyWithEmoticonClickStruct redEnvReplyWithEmoticonClickStruct = new com.tencent.mm.autogen.mmdata.rpt.RedEnvReplyWithEmoticonClickStruct();
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyDetailUI luckyMoneyDetailUI = this.f147214d;
        luckyMoneyDetailUI.f146062g2 = redEnvReplyWithEmoticonClickStruct;
        redEnvReplyWithEmoticonClickStruct.f59932d = 7L;
        redEnvReplyWithEmoticonClickStruct.k();
        int e76 = luckyMoneyDetailUI.e7();
        luckyMoneyDetailUI.f146089p2 = e76;
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyDetailUI", "click mEmojiUseType：%s", java.lang.Integer.valueOf(e76));
        if (luckyMoneyDetailUI.f146089p2 != 1) {
            luckyMoneyDetailUI.i7("");
        } else {
            luckyMoneyDetailUI.i7((java.lang.String) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_WALLET_HONGBAO_LAST_THX_SEND_EMOJI_NORMAL_STRING, ""));
        }
    }
}
