package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public final class me extends com.tencent.mm.wallet_core.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f147185d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewReceiveUI f147186e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public me(boolean z17, com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewReceiveUI luckyMoneyNewReceiveUI) {
        super(false);
        this.f147185d = z17;
        this.f147186e = luckyMoneyNewReceiveUI;
    }

    @Override // com.tencent.mm.wallet_core.ui.z1
    public void onRealClick(android.view.View v17) {
        kotlin.jvm.internal.o.g(v17, "v");
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewReceiveUI", "click check detail layout");
        gb3.o.f270035a.a(5);
        boolean z17 = this.f147185d;
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewReceiveUI luckyMoneyNewReceiveUI = this.f147186e;
        if (z17) {
            com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            java.lang.Object[] objArr = new java.lang.Object[5];
            objArr[0] = 6;
            com.tencent.mm.plugin.luckymoney.model.l6 l6Var = luckyMoneyNewReceiveUI.F1;
            int i17 = l6Var != null ? l6Var.f145432y : 0;
            objArr[1] = java.lang.Integer.valueOf(i17 != 0 ? i17 != 1 ? 0 : 1 : 2);
            objArr[2] = java.lang.Integer.valueOf(luckyMoneyNewReceiveUI.Y6());
            objArr[3] = 0;
            objArr[4] = 1;
            g0Var.d(11701, objArr);
        }
        android.content.Intent intent = new android.content.Intent();
        intent.setClass(luckyMoneyNewReceiveUI.getContext(), com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyBeforeDetailUI.class);
        intent.putExtra("key_swipe", luckyMoneyNewReceiveUI.C1);
        com.tencent.mm.plugin.luckymoney.model.l6 l6Var2 = luckyMoneyNewReceiveUI.F1;
        intent.putExtra("key_native_url", l6Var2 != null ? l6Var2.f145421n : null);
        com.tencent.mm.plugin.luckymoney.model.l6 l6Var3 = luckyMoneyNewReceiveUI.F1;
        intent.putExtra("key_sendid", l6Var3 != null ? l6Var3.f145420m : null);
        intent.putExtra("key_lucky_money_can_received", true);
        intent.putExtra("key_username", luckyMoneyNewReceiveUI.getIntent().getStringExtra("key_username"));
        intent.putExtra("key_from_username", luckyMoneyNewReceiveUI.getIntent().getStringExtra("key_from_username"));
        intent.putExtra("scene_id", luckyMoneyNewReceiveUI.f146306p1);
        intent.putExtra("key_msgid", luckyMoneyNewReceiveUI.Y);
        luckyMoneyNewReceiveUI.b7(intent);
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewReceiveUI luckyMoneyNewReceiveUI2 = this.f147186e;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(luckyMoneyNewReceiveUI2, arrayList.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewReceiveUI$onSceneEnd$3", "onRealClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        luckyMoneyNewReceiveUI2.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(luckyMoneyNewReceiveUI2, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewReceiveUI$onSceneEnd$3", "onRealClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        luckyMoneyNewReceiveUI.finish();
        luckyMoneyNewReceiveUI.d7(ml2.f5.f327465p, true);
    }
}
