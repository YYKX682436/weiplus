package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public final class j9 implements com.tencent.mm.ui.widget.dialog.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewDetailUI f147051a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f147052b;

    public j9(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewDetailUI luckyMoneyNewDetailUI, java.lang.String str) {
        this.f147051a = luckyMoneyNewDetailUI;
        this.f147052b = str;
    }

    @Override // com.tencent.mm.ui.widget.dialog.j
    public final void a(boolean z17, java.lang.String str, int i17) {
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewDetailUI luckyMoneyNewDetailUI = this.f147051a;
        luckyMoneyNewDetailUI.hideVKB();
        com.tencent.mm.autogen.mmdata.rpt.RedEnvReplyWithEmoticonClickStruct redEnvReplyWithEmoticonClickStruct = new com.tencent.mm.autogen.mmdata.rpt.RedEnvReplyWithEmoticonClickStruct();
        luckyMoneyNewDetailUI.f146186g2 = redEnvReplyWithEmoticonClickStruct;
        if (z17) {
            redEnvReplyWithEmoticonClickStruct.f59932d = 5L;
            com.tencent.mm.autogen.mmdata.rpt.RedEnvReplyWithEmoticonDataStruct redEnvReplyWithEmoticonDataStruct = new com.tencent.mm.autogen.mmdata.rpt.RedEnvReplyWithEmoticonDataStruct();
            luckyMoneyNewDetailUI.f146189h2 = redEnvReplyWithEmoticonDataStruct;
            int i18 = luckyMoneyNewDetailUI.f146192i2;
            redEnvReplyWithEmoticonDataStruct.f59933d = (i18 == 0 || i18 == 2) ? 2 : i18 == 1 ? 1 : 0;
            java.lang.String str2 = this.f147052b;
            redEnvReplyWithEmoticonDataStruct.f59934e = redEnvReplyWithEmoticonDataStruct.b("emoticonMd5", str2, true);
            if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                com.tencent.mm.autogen.mmdata.rpt.RedEnvReplyWithEmoticonDataStruct redEnvReplyWithEmoticonDataStruct2 = luckyMoneyNewDetailUI.f146189h2;
                if (redEnvReplyWithEmoticonDataStruct2 != null) {
                    redEnvReplyWithEmoticonDataStruct2.f59935f = 1L;
                }
            } else {
                com.tencent.mm.autogen.mmdata.rpt.RedEnvReplyWithEmoticonDataStruct redEnvReplyWithEmoticonDataStruct3 = luckyMoneyNewDetailUI.f146189h2;
                if (redEnvReplyWithEmoticonDataStruct3 != null) {
                    redEnvReplyWithEmoticonDataStruct3.f59935f = 2L;
                }
            }
            com.tencent.mm.autogen.mmdata.rpt.RedEnvReplyWithEmoticonDataStruct redEnvReplyWithEmoticonDataStruct4 = luckyMoneyNewDetailUI.f146189h2;
            if (redEnvReplyWithEmoticonDataStruct4 != null) {
                redEnvReplyWithEmoticonDataStruct4.k();
            }
            java.lang.String str3 = luckyMoneyNewDetailUI.L1;
            java.lang.Object[] objArr = new java.lang.Object[3];
            objArr[0] = str3;
            objArr[1] = java.lang.Boolean.valueOf(str == null);
            objArr[2] = str2;
            com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewDetailUI", "doTransmitEmojiToFriend() toUser:%s customTex:%s emojiMd5:%s", objArr);
            if (android.text.TextUtils.isEmpty(str2)) {
                com.tencent.mars.xlog.Log.e("MicroMsg.LuckyMoneyNewDetailUI", "doTransmitEmojiToFriend() failed!");
            } else {
                com.tencent.mm.autogen.events.SendMsgEvent sendMsgEvent = new com.tencent.mm.autogen.events.SendMsgEvent();
                am.mt mtVar = sendMsgEvent.f54752g;
                if (mtVar != null) {
                    mtVar.f7362a = str3;
                }
                if (mtVar != null) {
                    mtVar.f7363b = str2;
                }
                if (mtVar != null) {
                    mtVar.f7364c = c01.e2.C(str3);
                }
                if (mtVar != null) {
                    mtVar.f7365d = 0;
                }
                sendMsgEvent.e();
                if (!android.text.TextUtils.isEmpty(str)) {
                    com.tencent.mm.autogen.events.SendMsgEvent sendMsgEvent2 = new com.tencent.mm.autogen.events.SendMsgEvent();
                    am.mt mtVar2 = sendMsgEvent2.f54752g;
                    if (mtVar2 != null) {
                        mtVar2.f7362a = str3;
                    }
                    if (mtVar2 != null) {
                        mtVar2.f7363b = str;
                    }
                    if (mtVar2 != null) {
                        mtVar2.f7364c = c01.e2.C(str3);
                    }
                    if (mtVar2 != null) {
                        mtVar2.f7365d = 0;
                    }
                    sendMsgEvent2.e();
                }
            }
            luckyMoneyNewDetailUI.a7(3, str2);
            db5.h7.c(null, luckyMoneyNewDetailUI.getContext().getResources().getString(com.tencent.mm.R.string.fw6), luckyMoneyNewDetailUI.getContext(), 0, null);
            com.tencent.mm.sdk.platformtools.u3.i(new com.tencent.mm.plugin.luckymoney.ui.i9(luckyMoneyNewDetailUI), 500L);
        } else {
            redEnvReplyWithEmoticonClickStruct.f59932d = 6L;
        }
        com.tencent.mm.autogen.mmdata.rpt.RedEnvReplyWithEmoticonClickStruct redEnvReplyWithEmoticonClickStruct2 = luckyMoneyNewDetailUI.f146186g2;
        if (redEnvReplyWithEmoticonClickStruct2 != null) {
            redEnvReplyWithEmoticonClickStruct2.k();
        }
    }
}
