package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public class g2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.api.IEmojiInfo f146923d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f146924e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.t2 f146925f;

    public g2(com.tencent.mm.plugin.luckymoney.ui.t2 t2Var, com.tencent.mm.api.IEmojiInfo iEmojiInfo, boolean z17) {
        this.f146925f = t2Var;
        this.f146923d = iEmojiInfo;
        this.f146924e = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.api.IEmojiInfo iEmojiInfo = this.f146923d;
        if (iEmojiInfo != null) {
            com.tencent.mm.plugin.luckymoney.ui.t2 t2Var = this.f146925f;
            com.tencent.mm.api.IEmojiInfo iEmojiInfo2 = t2Var.f147441a.Z1;
            if (iEmojiInfo2 == null || !iEmojiInfo2.getMd5().equals(iEmojiInfo.getMd5())) {
                return;
            }
            com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyDetailUI luckyMoneyDetailUI = t2Var.f147441a;
            if (!this.f146924e) {
                com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyDetailUI", "somethings error.");
                luckyMoneyDetailUI.T.setVisibility(8);
                luckyMoneyDetailUI.S.setVisibility(0);
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyDetailUI", "somethings success.");
            luckyMoneyDetailUI.Z1 = ((com.tencent.mm.feature.emoji.r1) ((com.tencent.mm.feature.emoji.api.g6) i95.n0.c(com.tencent.mm.feature.emoji.api.g6.class))).wi(luckyMoneyDetailUI.Z1.getMd5());
            luckyMoneyDetailUI.T.setVisibility(8);
            luckyMoneyDetailUI.R.setVisibility(0);
            com.tencent.mm.api.IEmojiInfo iEmojiInfo3 = luckyMoneyDetailUI.Z1;
            luckyMoneyDetailUI.f146085o3 = 3;
            luckyMoneyDetailUI.R.setEmojiInfo(iEmojiInfo3);
            com.tencent.mm.autogen.mmdata.rpt.RedEnvSendWithEmoticonClickStruct redEnvSendWithEmoticonClickStruct = new com.tencent.mm.autogen.mmdata.rpt.RedEnvSendWithEmoticonClickStruct();
            redEnvSendWithEmoticonClickStruct.f59936d = 11L;
            redEnvSendWithEmoticonClickStruct.k();
        }
    }
}
