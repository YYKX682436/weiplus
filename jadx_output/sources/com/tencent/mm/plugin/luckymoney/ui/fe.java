package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public final class fe implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewReceiveUI f146905d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.api.IEmojiInfo f146906e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f146907f;

    public fe(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewReceiveUI luckyMoneyNewReceiveUI, com.tencent.mm.api.IEmojiInfo iEmojiInfo, boolean z17) {
        this.f146905d = luckyMoneyNewReceiveUI;
        this.f146906e = iEmojiInfo;
        this.f146907f = z17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.api.IEmojiInfo iEmojiInfo;
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewReceiveUI luckyMoneyNewReceiveUI = this.f146905d;
        com.tencent.mm.api.IEmojiInfo iEmojiInfo2 = luckyMoneyNewReceiveUI.Z;
        if (iEmojiInfo2 == null || (iEmojiInfo = this.f146906e) == null || !kotlin.jvm.internal.o.b(iEmojiInfo2.getMd5(), iEmojiInfo.getMd5())) {
            return;
        }
        if (!this.f146907f) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewReceiveUI", "EmojiDownloadCallback error.");
            android.widget.LinearLayout linearLayout = luckyMoneyNewReceiveUI.T;
            if (linearLayout != null) {
                linearLayout.setVisibility(8);
            }
            android.widget.TextView textView = luckyMoneyNewReceiveUI.S;
            if (textView == null) {
                return;
            }
            textView.setVisibility(0);
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewReceiveUI", "EmojiDownloadCallback success.");
        luckyMoneyNewReceiveUI.Z = ((com.tencent.mm.feature.emoji.r1) ((com.tencent.mm.feature.emoji.api.g6) i95.n0.c(com.tencent.mm.feature.emoji.api.g6.class))).wi(iEmojiInfo2.getMd5());
        android.widget.LinearLayout linearLayout2 = luckyMoneyNewReceiveUI.T;
        if (linearLayout2 != null) {
            linearLayout2.setVisibility(8);
        }
        com.tencent.mm.emoji.view.BaseEmojiView baseEmojiView = luckyMoneyNewReceiveUI.R;
        if (baseEmojiView != null) {
            baseEmojiView.setVisibility(0);
        }
        com.tencent.mm.api.IEmojiInfo iEmojiInfo3 = luckyMoneyNewReceiveUI.Z;
        luckyMoneyNewReceiveUI.O1 = 4;
        com.tencent.mm.emoji.view.BaseEmojiView baseEmojiView2 = luckyMoneyNewReceiveUI.R;
        if (baseEmojiView2 != null) {
            baseEmojiView2.setEmojiInfo(iEmojiInfo3);
        }
        com.tencent.mm.autogen.mmdata.rpt.RedEnvSendWithEmoticonClickStruct redEnvSendWithEmoticonClickStruct = new com.tencent.mm.autogen.mmdata.rpt.RedEnvSendWithEmoticonClickStruct();
        luckyMoneyNewReceiveUI.getClass();
        redEnvSendWithEmoticonClickStruct.f59936d = 8L;
        redEnvSendWithEmoticonClickStruct.k();
    }
}
