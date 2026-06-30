package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public final class n9 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewDetailUI f147227d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.eg7 f147228e;

    public n9(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewDetailUI luckyMoneyNewDetailUI, r45.eg7 eg7Var) {
        this.f147227d = luckyMoneyNewDetailUI;
        this.f147228e = eg7Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewDetailUI$setWxAppInfoEntrance$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewDetailUI", "[setWxAppInfoEntrance] click wxapp entrance");
        gb3.m.a(42, this.f147227d.V2);
        r45.eg7 eg7Var = this.f147228e;
        com.tencent.mm.wallet_core.ui.r1.b0(eg7Var.f373466d, eg7Var.f373467e, 0, 1100);
        yj0.a.h(this, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewDetailUI$setWxAppInfoEntrance$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
