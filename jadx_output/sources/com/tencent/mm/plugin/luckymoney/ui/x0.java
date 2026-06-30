package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public class x0 extends com.tencent.mm.wallet_core.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyBusiReceiveUIV2 f147661d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyBusiReceiveUIV2 luckyMoneyBusiReceiveUIV2) {
        super(false);
        this.f147661d = luckyMoneyBusiReceiveUIV2;
    }

    @Override // com.tencent.mm.wallet_core.ui.z1
    public void onRealClick(android.view.View view) {
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyBusiReceiveUIV2", "open btn click");
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11701, 10, 0, 0, 0, 2);
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyBusiReceiveUIV2 luckyMoneyBusiReceiveUIV2 = this.f147661d;
        luckyMoneyBusiReceiveUIV2.f146032s.setClickable(false);
        luckyMoneyBusiReceiveUIV2.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyBusiReceiveUIV2", "do open hb");
        com.tencent.mm.plugin.luckymoney.model.s5 s5Var = luckyMoneyBusiReceiveUIV2.C;
        luckyMoneyBusiReceiveUIV2.doSceneProgress(new com.tencent.mm.plugin.luckymoney.model.r5(s5Var.f145617i, s5Var.f145616h, s5Var.f145618m, luckyMoneyBusiReceiveUIV2.getIntent().getStringExtra("packageExt"), luckyMoneyBusiReceiveUIV2.f146036w), false);
        luckyMoneyBusiReceiveUIV2.f146032s.setVisibility(8);
        com.tencent.mm.plugin.luckymoney.model.m5.G(luckyMoneyBusiReceiveUIV2.f146034u, 0);
    }
}
