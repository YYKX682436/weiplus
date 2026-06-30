package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public final class w3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.d4 f147631d;

    public w3(com.tencent.mm.plugin.luckymoney.ui.d4 d4Var) {
        this.f147631d = d4Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyDetailUIFunctionUIC$doRedpacketPersonEntranceStyle$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyDetailUIFunctionUIC", "[doRedpacketPersonEntranceStyle] click entrance");
        com.tencent.mm.plugin.luckymoney.ui.d4 d4Var = this.f147631d;
        androidx.appcompat.app.AppCompatActivity activity = d4Var.getActivity();
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyDetailUI luckyMoneyDetailUI = activity instanceof com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyDetailUI ? (com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyDetailUI) activity : null;
        gb3.m.a(64, luckyMoneyDetailUI != null ? luckyMoneyDetailUI.V2 : null);
        l81.b1 b1Var = new l81.b1();
        b1Var.f317014b = "wxb8f2d39684e3fe62";
        b1Var.f317022f = "pages/customEdit/index.html?channel=202597";
        b1Var.f317016c = 0;
        b1Var.f317032k = 1100;
        b1Var.M = true;
        ((com.tencent.mm.plugin.appbrand.launching.xc) ((com.tencent.mm.plugin.appbrand.service.h6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.h6.class))).bj(d4Var.getContext(), b1Var);
        yj0.a.h(this, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyDetailUIFunctionUIC$doRedpacketPersonEntranceStyle$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
