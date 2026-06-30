package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public final class r8 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.api.IEmojiInfo f147372d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewDetailUI f147373e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f147374f;

    public r8(com.tencent.mm.api.IEmojiInfo iEmojiInfo, com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewDetailUI luckyMoneyNewDetailUI, boolean z17) {
        this.f147372d = iEmojiInfo;
        this.f147373e = luckyMoneyNewDetailUI;
        this.f147374f = z17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewDetailUI luckyMoneyNewDetailUI;
        com.tencent.mm.api.IEmojiInfo iEmojiInfo;
        com.tencent.mm.api.IEmojiInfo iEmojiInfo2 = this.f147372d;
        if (iEmojiInfo2 == null || (iEmojiInfo = (luckyMoneyNewDetailUI = this.f147373e).Z1) == null || !kotlin.jvm.internal.o.b(iEmojiInfo.getMd5(), iEmojiInfo2.getMd5())) {
            return;
        }
        if (!this.f147374f) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewDetailUI", "[EmojiDownloadCallback] error.");
            android.widget.LinearLayout linearLayout = luckyMoneyNewDetailUI.T;
            if (linearLayout != null) {
                linearLayout.setVisibility(8);
            }
            android.widget.TextView textView = luckyMoneyNewDetailUI.S;
            if (textView == null) {
                return;
            }
            textView.setVisibility(0);
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewDetailUI", "[EmojiDownloadCallback] success.");
        com.tencent.mm.feature.emoji.api.g6 g6Var = (com.tencent.mm.feature.emoji.api.g6) i95.n0.c(com.tencent.mm.feature.emoji.api.g6.class);
        com.tencent.mm.api.IEmojiInfo iEmojiInfo3 = luckyMoneyNewDetailUI.Z1;
        luckyMoneyNewDetailUI.Z1 = ((com.tencent.mm.feature.emoji.r1) g6Var).wi(iEmojiInfo3 != null ? iEmojiInfo3.getMd5() : null);
        android.widget.LinearLayout linearLayout2 = luckyMoneyNewDetailUI.T;
        if (linearLayout2 != null) {
            linearLayout2.setVisibility(8);
        }
        com.tencent.mm.emoji.view.BaseEmojiView baseEmojiView = luckyMoneyNewDetailUI.R;
        if (baseEmojiView != null) {
            baseEmojiView.setVisibility(0);
        }
        com.tencent.mm.api.IEmojiInfo iEmojiInfo4 = luckyMoneyNewDetailUI.Z1;
        luckyMoneyNewDetailUI.f146209o3 = 3;
        com.tencent.mm.emoji.view.BaseEmojiView baseEmojiView2 = luckyMoneyNewDetailUI.R;
        if (baseEmojiView2 != null) {
            baseEmojiView2.setEmojiInfo(iEmojiInfo4);
        }
        com.tencent.mm.autogen.mmdata.rpt.RedEnvSendWithEmoticonClickStruct redEnvSendWithEmoticonClickStruct = new com.tencent.mm.autogen.mmdata.rpt.RedEnvSendWithEmoticonClickStruct();
        redEnvSendWithEmoticonClickStruct.f59936d = 11L;
        redEnvSendWithEmoticonClickStruct.k();
    }
}
