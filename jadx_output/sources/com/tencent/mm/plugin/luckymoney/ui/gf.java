package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public class gf implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.api.IEmojiInfo f146945d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f146946e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.Cif f146947f;

    public gf(com.tencent.mm.plugin.luckymoney.ui.Cif cif, com.tencent.mm.api.IEmojiInfo iEmojiInfo, boolean z17) {
        this.f146947f = cif;
        this.f146945d = iEmojiInfo;
        this.f146946e = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.api.IEmojiInfo iEmojiInfo = this.f146945d;
        if (iEmojiInfo != null) {
            com.tencent.mm.plugin.luckymoney.ui.Cif cif = this.f146947f;
            com.tencent.mm.api.IEmojiInfo iEmojiInfo2 = cif.f147027a.L;
            if (iEmojiInfo2 == null || !iEmojiInfo2.getMd5().equals(iEmojiInfo.getMd5())) {
                return;
            }
            if (!this.f146946e) {
                com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewYearReceiveUI", "somethings error.");
                cif.f147027a.f146334u.setVisibility(8);
                cif.f147027a.f146336w.setVisibility(0);
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewYearReceiveUI", "somethings success.");
            cif.f147027a.L = ((com.tencent.mm.feature.emoji.r1) ((com.tencent.mm.feature.emoji.api.g6) i95.n0.c(com.tencent.mm.feature.emoji.api.g6.class))).wi(cif.f147027a.L.getMd5());
            cif.f147027a.f146334u.setVisibility(8);
            cif.f147027a.E.setVisibility(0);
            com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearReceiveUI luckyMoneyNewYearReceiveUI = cif.f147027a;
            luckyMoneyNewYearReceiveUI.E.setEmojiInfo(luckyMoneyNewYearReceiveUI.L);
        }
    }
}
