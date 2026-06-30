package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public class ri implements tl.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearSendUIV2 f147386a;

    public ri(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearSendUIV2 luckyMoneyNewYearSendUIV2) {
        this.f147386a = luckyMoneyNewYearSendUIV2;
    }

    @Override // tl.e
    public void onCompletion() {
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewYearSendUIV2", "voicePlayer onCompletion");
        android.view.View view = this.f147386a.f146405h;
        if (view != null) {
            view.post(new com.tencent.mm.plugin.luckymoney.ui.qi(this));
        }
    }
}
