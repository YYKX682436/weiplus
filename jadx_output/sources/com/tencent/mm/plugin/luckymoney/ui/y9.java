package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public final class y9 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f147729d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.fa f147730e;

    public y9(int i17, com.tencent.mm.plugin.luckymoney.ui.fa faVar) {
        this.f147729d = i17;
        this.f147730e = faVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewDetailUIFunctionUIC$doRedpacketPersonEntranceStyle$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        boolean z17 = (this.f147729d & 128) != 0;
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewDetailUIFunctionUIC", "[doRedpacketPersonEntranceStyle] click entrance，needJumpWeApp ：" + z17);
        com.tencent.mm.plugin.luckymoney.ui.fa faVar = this.f147730e;
        androidx.appcompat.app.AppCompatActivity activity = faVar.getActivity();
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewDetailUI luckyMoneyNewDetailUI = activity instanceof com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewDetailUI ? (com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewDetailUI) activity : null;
        gb3.m.a(64, luckyMoneyNewDetailUI != null ? luckyMoneyNewDetailUI.V2 : null);
        if (z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewDetailUIFunctionUIC", "[doRedpacketPersonEntranceStyle] jump to weapp");
            l81.b1 b1Var = new l81.b1();
            b1Var.f317014b = "wxb8f2d39684e3fe62";
            b1Var.f317022f = "pages/customEdit/index.html?channel=202597";
            b1Var.f317016c = 0;
            b1Var.f317032k = 1100;
            b1Var.M = true;
            ((com.tencent.mm.plugin.appbrand.launching.xc) ((com.tencent.mm.plugin.appbrand.service.h6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.h6.class))).bj(faVar.getContext(), b1Var);
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewDetailUIFunctionUIC", "[doRedpacketPersonEntranceStyle] jump to liteapp");
            r45.q74 q74Var = new r45.q74();
            q74Var.f383734d = "wxalitee3496ed66c0cfe06db0edfa2dbd8f4a2";
            q74Var.f383735e = "pages/customeditpage/entry";
            q74Var.f383737g = "3.0.3";
            q74Var.f383736f = "channel=202597";
            com.tencent.mm.wallet_core.ui.r1.Y(faVar.getContext(), q74Var, new com.tencent.mm.plugin.luckymoney.ui.x9(faVar));
        }
        yj0.a.h(this, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewDetailUIFunctionUIC$doRedpacketPersonEntranceStyle$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
