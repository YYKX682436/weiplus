package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public class mg implements tl.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearReceiveUIV2 f147188a;

    public mg(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearReceiveUIV2 luckyMoneyNewYearReceiveUIV2) {
        this.f147188a = luckyMoneyNewYearReceiveUIV2;
    }

    @Override // tl.e
    public void onCompletion() {
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewYearReceiveUIV2", "voicePlayer onCompletion");
        android.view.View view = this.f147188a.f146342h;
        if (view != null) {
            view.post(new com.tencent.mm.plugin.luckymoney.ui.lg(this));
        }
    }
}
