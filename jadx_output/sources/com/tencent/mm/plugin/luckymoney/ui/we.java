package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public final class we implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewReceiveUI f147649d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.wv3 f147650e;

    public we(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewReceiveUI luckyMoneyNewReceiveUI, r45.wv3 wv3Var) {
        this.f147649d = luckyMoneyNewReceiveUI;
        this.f147650e = wv3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewReceiveUI luckyMoneyNewReceiveUI = this.f147649d;
        luckyMoneyNewReceiveUI.K = luckyMoneyNewReceiveUI.f146312v != null ? r1.getWidth() : 0;
        float height = (luckyMoneyNewReceiveUI.f146320z != null ? r1.getHeight() : 0) / 1200.0f;
        r45.xv3 xv3Var = this.f147650e.f389501g;
        int i17 = (int) (height * (com.tencent.mm.sdk.platformtools.t8.K0(xv3Var != null ? xv3Var.f390494x : null) ^ true ? 50 : 48));
        gb3.j jVar = (gb3.j) i95.n0.c(gb3.j.class);
        r45.wv3 wv3Var = this.f147650e;
        android.view.View view = luckyMoneyNewReceiveUI.L;
        com.tencent.mm.chatting.component.ListScrollPAGView listScrollPAGView = luckyMoneyNewReceiveUI.M;
        kotlinx.coroutines.y0 y0Var = luckyMoneyNewReceiveUI.H;
        android.view.View view2 = luckyMoneyNewReceiveUI.f146312v;
        luckyMoneyNewReceiveUI.f146296J = ((com.tencent.mm.plugin.luckymoney.model.w2) jVar).rj(10, wv3Var, view, listScrollPAGView, y0Var, view2 != null ? view2.getWidth() : 0, 0, luckyMoneyNewReceiveUI.f146320z, i17);
    }
}
