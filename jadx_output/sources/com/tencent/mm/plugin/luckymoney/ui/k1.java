package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public class k1 implements com.tencent.mm.ui.widget.dialog.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f147092a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyDetailUI f147093b;

    public k1(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyDetailUI luckyMoneyDetailUI, java.lang.String str) {
        this.f147093b = luckyMoneyDetailUI;
        this.f147092a = str;
    }

    @Override // com.tencent.mm.ui.widget.dialog.j
    public void a(boolean z17, java.lang.String str, int i17) {
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyDetailUI luckyMoneyDetailUI = this.f147093b;
        luckyMoneyDetailUI.hideVKB();
        com.tencent.mm.autogen.mmdata.rpt.RedEnvReplyWithEmoticonClickStruct redEnvReplyWithEmoticonClickStruct = new com.tencent.mm.autogen.mmdata.rpt.RedEnvReplyWithEmoticonClickStruct();
        luckyMoneyDetailUI.f146062g2 = redEnvReplyWithEmoticonClickStruct;
        if (z17) {
            redEnvReplyWithEmoticonClickStruct.f59932d = 5L;
            com.tencent.mm.autogen.mmdata.rpt.RedEnvReplyWithEmoticonDataStruct redEnvReplyWithEmoticonDataStruct = new com.tencent.mm.autogen.mmdata.rpt.RedEnvReplyWithEmoticonDataStruct();
            luckyMoneyDetailUI.f146065h2 = redEnvReplyWithEmoticonDataStruct;
            int i18 = luckyMoneyDetailUI.f146068i2;
            redEnvReplyWithEmoticonDataStruct.f59933d = (i18 == 0 || i18 == 2) ? 2 : i18 == 1 ? 1 : 0;
            java.lang.String str2 = this.f147092a;
            redEnvReplyWithEmoticonDataStruct.f59934e = redEnvReplyWithEmoticonDataStruct.b("emoticonMd5", str2, true);
            if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                luckyMoneyDetailUI.f146065h2.f59935f = 1L;
            } else {
                luckyMoneyDetailUI.f146065h2.f59935f = 2L;
            }
            luckyMoneyDetailUI.f146065h2.k();
            java.lang.String str3 = luckyMoneyDetailUI.L1;
            java.lang.Object[] objArr = new java.lang.Object[3];
            objArr[0] = str3;
            objArr[1] = java.lang.Boolean.valueOf(str == null);
            objArr[2] = str2;
            com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyDetailUI", "doTransmitEmojiToFriend() toUser:%s customTex:%s emojiMd5:%s", objArr);
            if (android.text.TextUtils.isEmpty(str2)) {
                com.tencent.mars.xlog.Log.e("MicroMsg.LuckyMoneyDetailUI", "doTransmitEmojiToFriend() failed!");
            } else {
                com.tencent.mm.autogen.events.SendMsgEvent sendMsgEvent = new com.tencent.mm.autogen.events.SendMsgEvent();
                am.mt mtVar = sendMsgEvent.f54752g;
                mtVar.f7362a = str3;
                mtVar.f7363b = str2;
                mtVar.f7364c = c01.e2.C(str3);
                mtVar.f7365d = 0;
                sendMsgEvent.e();
                if (!android.text.TextUtils.isEmpty(str)) {
                    com.tencent.mm.autogen.events.SendMsgEvent sendMsgEvent2 = new com.tencent.mm.autogen.events.SendMsgEvent();
                    am.mt mtVar2 = sendMsgEvent2.f54752g;
                    mtVar2.f7362a = str3;
                    mtVar2.f7363b = str;
                    mtVar2.f7364c = c01.e2.C(str3);
                    mtVar2.f7365d = 0;
                    sendMsgEvent2.e();
                }
            }
            luckyMoneyDetailUI.a7(3, str2);
            db5.h7.c(null, luckyMoneyDetailUI.getContext().getResources().getString(com.tencent.mm.R.string.fw6), luckyMoneyDetailUI.getContext(), 0, null);
            com.tencent.mm.sdk.platformtools.u3.i(new com.tencent.mm.plugin.luckymoney.ui.j1(this), 500L);
        } else {
            redEnvReplyWithEmoticonClickStruct.f59932d = 6L;
        }
        luckyMoneyDetailUI.f146062g2.k();
    }
}
