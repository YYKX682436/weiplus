package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public class cg implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.api.IEmojiInfo f146793d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f146794e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.kg f146795f;

    public cg(com.tencent.mm.plugin.luckymoney.ui.kg kgVar, com.tencent.mm.api.IEmojiInfo iEmojiInfo, boolean z17) {
        this.f146795f = kgVar;
        this.f146793d = iEmojiInfo;
        this.f146794e = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.api.IEmojiInfo iEmojiInfo = this.f146793d;
        if (iEmojiInfo != null) {
            com.tencent.mm.plugin.luckymoney.ui.kg kgVar = this.f146795f;
            com.tencent.mm.api.IEmojiInfo iEmojiInfo2 = kgVar.f147106a.P;
            if (iEmojiInfo2 == null || !iEmojiInfo2.getMd5().equals(iEmojiInfo.getMd5())) {
                return;
            }
            if (!this.f146794e) {
                com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewYearReceiveUIV2", "somethings error.");
                kgVar.f147106a.f146356v.setVisibility(8);
                kgVar.f147106a.f146358x.setVisibility(0);
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewYearReceiveUIV2", "somethings success.");
            kgVar.f147106a.P = ((com.tencent.mm.feature.emoji.r1) ((com.tencent.mm.feature.emoji.api.g6) i95.n0.c(com.tencent.mm.feature.emoji.api.g6.class))).wi(kgVar.f147106a.P.getMd5());
            kgVar.f147106a.f146356v.setVisibility(8);
            kgVar.f147106a.G.setVisibility(0);
            kgVar.f147106a.G.setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
            com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearReceiveUIV2 luckyMoneyNewYearReceiveUIV2 = kgVar.f147106a;
            luckyMoneyNewYearReceiveUIV2.G.setEmojiInfo(luckyMoneyNewYearReceiveUIV2.P);
        }
    }
}
