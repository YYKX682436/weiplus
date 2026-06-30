package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public class nh implements gc3.n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearSendUIV2 f147242a;

    public nh(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearSendUIV2 luckyMoneyNewYearSendUIV2) {
        this.f147242a = luckyMoneyNewYearSendUIV2;
    }

    public void a(int i17, java.lang.String str) {
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearSendUIV2 luckyMoneyNewYearSendUIV2 = this.f147242a;
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewYearSendUIV2", "onDetectStop ret:%s useTime:%s filePath:%s", valueOf, java.lang.Long.valueOf(luckyMoneyNewYearSendUIV2.M.getF147618r()), str);
        android.view.View view = luckyMoneyNewYearSendUIV2.f146405h;
        if (view != null) {
            view.post(new com.tencent.mm.plugin.luckymoney.ui.mh(this, i17, str));
        }
    }
}
