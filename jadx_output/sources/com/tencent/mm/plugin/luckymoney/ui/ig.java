package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public class ig implements com.tencent.mm.plugin.luckymoney.ui.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.model.f6 f147028a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearReceiveUIV2 f147029b;

    public ig(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearReceiveUIV2 luckyMoneyNewYearReceiveUIV2, com.tencent.mm.plugin.luckymoney.model.f6 f6Var) {
        this.f147029b = luckyMoneyNewYearReceiveUIV2;
        this.f147028a = f6Var;
    }

    @Override // com.tencent.mm.plugin.luckymoney.ui.l
    public void a() {
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearReceiveUIV2 luckyMoneyNewYearReceiveUIV2 = this.f147029b;
        com.tencent.mm.plugin.luckymoney.model.m5.E(luckyMoneyNewYearReceiveUIV2.getContext(), luckyMoneyNewYearReceiveUIV2.f146347o, this.f147028a.f145280h.f145238h);
        android.view.animation.AlphaAnimation alphaAnimation = new android.view.animation.AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setDuration(500L);
        alphaAnimation.setAnimationListener(new com.tencent.mm.plugin.luckymoney.ui.hg(this));
        if (luckyMoneyNewYearReceiveUIV2.f146347o.getVisibility() == 0) {
            luckyMoneyNewYearReceiveUIV2.f146347o.startAnimation(alphaAnimation);
        }
        luckyMoneyNewYearReceiveUIV2.g7(true);
    }
}
