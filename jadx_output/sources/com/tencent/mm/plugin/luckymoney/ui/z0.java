package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public class z0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyBusiReceiveUIV2 f147753d;

    public z0(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyBusiReceiveUIV2 luckyMoneyBusiReceiveUIV2) {
        this.f147753d = luckyMoneyBusiReceiveUIV2;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyBusiReceiveUIV2 luckyMoneyBusiReceiveUIV2 = this.f147753d;
        android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) luckyMoneyBusiReceiveUIV2.G.getLayoutParams();
        int width = (int) (luckyMoneyBusiReceiveUIV2.f146023g.getWidth() * 1.1f);
        layoutParams.width = width;
        layoutParams.height = (int) (width * 1.72f);
        luckyMoneyBusiReceiveUIV2.G.setLayoutParams(layoutParams);
    }
}
