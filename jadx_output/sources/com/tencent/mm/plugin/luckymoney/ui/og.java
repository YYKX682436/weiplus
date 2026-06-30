package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public class og implements tl.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearReceiveUIV2 f147279a;

    public og(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearReceiveUIV2 luckyMoneyNewYearReceiveUIV2) {
        this.f147279a = luckyMoneyNewYearReceiveUIV2;
    }

    @Override // tl.f
    public void a() {
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewYearReceiveUIV2", "voicePlayer onError");
        android.view.View view = this.f147279a.f146342h;
        if (view != null) {
            view.post(new com.tencent.mm.plugin.luckymoney.ui.ng(this));
        }
    }
}
