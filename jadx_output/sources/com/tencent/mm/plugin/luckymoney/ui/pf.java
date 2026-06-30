package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public class pf implements com.tencent.mm.plugin.luckymoney.ui.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.model.f6 f147316a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearReceiveUI f147317b;

    public pf(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearReceiveUI luckyMoneyNewYearReceiveUI, com.tencent.mm.plugin.luckymoney.model.f6 f6Var) {
        this.f147317b = luckyMoneyNewYearReceiveUI;
        this.f147316a = f6Var;
    }

    @Override // com.tencent.mm.plugin.luckymoney.ui.l
    public void a() {
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearReceiveUI luckyMoneyNewYearReceiveUI = this.f147317b;
        luckyMoneyNewYearReceiveUI.f146327n.setVisibility(4);
        com.tencent.mm.plugin.luckymoney.model.m5.E(luckyMoneyNewYearReceiveUI.getContext(), luckyMoneyNewYearReceiveUI.f146327n, this.f147316a.f145280h.f145238h);
        android.view.animation.AlphaAnimation alphaAnimation = new android.view.animation.AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setDuration(500L);
        alphaAnimation.setAnimationListener(new com.tencent.mm.plugin.luckymoney.ui.of(this));
        luckyMoneyNewYearReceiveUI.f146327n.startAnimation(alphaAnimation);
    }
}
