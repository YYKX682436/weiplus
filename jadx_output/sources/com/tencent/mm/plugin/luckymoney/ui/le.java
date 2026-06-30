package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public final class le extends com.tencent.mm.wallet_core.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewReceiveUI f147144d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fo3.m f147145e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public le(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewReceiveUI luckyMoneyNewReceiveUI, fo3.m mVar) {
        super(false);
        this.f147144d = luckyMoneyNewReceiveUI;
        this.f147145e = mVar;
    }

    @Override // com.tencent.mm.wallet_core.ui.z1
    public void onRealClick(android.view.View v17) {
        kotlin.jvm.internal.o.g(v17, "v");
        gb3.o.f270035a.a(4);
        li3.g gVar = (li3.g) ((h45.s) i95.n0.c(h45.s.class));
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewReceiveUI luckyMoneyNewReceiveUI = this.f147144d;
        gVar.Ri(luckyMoneyNewReceiveUI, 10, 3);
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        java.lang.Object[] objArr = new java.lang.Object[5];
        objArr[0] = 5;
        com.tencent.mm.plugin.luckymoney.model.l6 l6Var = luckyMoneyNewReceiveUI.F1;
        int i17 = l6Var != null ? l6Var.f145432y : 0;
        objArr[1] = java.lang.Integer.valueOf(i17 != 0 ? i17 != 1 ? 0 : 1 : 2);
        objArr[2] = java.lang.Integer.valueOf(luckyMoneyNewReceiveUI.Y6());
        objArr[3] = 0;
        objArr[4] = 2;
        g0Var.d(11701, objArr);
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewReceiveUI", "open btn click! mLiveId[%s]", luckyMoneyNewReceiveUI.f146319y1);
        fo3.m mVar = this.f147145e;
        mVar.onClick(v17);
        if (mVar.f264915i) {
            w04.l.INSTANCE.ac(540999719, mVar.f264913g, true);
        }
        android.widget.Button button = luckyMoneyNewReceiveUI.f146303o;
        if (button != null) {
            button.setClickable(false);
        }
        luckyMoneyNewReceiveUI.d7(ml2.f5.f327460h, true);
        luckyMoneyNewReceiveUI.W6("");
    }
}
