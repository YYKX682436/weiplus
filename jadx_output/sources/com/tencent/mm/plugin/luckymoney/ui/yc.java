package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes3.dex */
public final class yc implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI f147733d;

    public yc(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI luckyMoneyNewPrepareUI) {
        this.f147733d = luckyMoneyNewPrepareUI;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        kotlin.jvm.internal.o.g(menuItem, "menuItem");
        java.lang.ref.WeakReference weakReference = com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI.f146241x2;
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI luckyMoneyNewPrepareUI = this.f147733d;
        if (i17 == 0) {
            android.content.Intent intent = new android.content.Intent();
            intent.setClass(luckyMoneyNewPrepareUI.getContext(), com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyMyRecordUI.class);
            intent.putExtra("key_username", luckyMoneyNewPrepareUI.getIntent().getStringExtra("key_username"));
            intent.putExtra("key_type", 2);
            com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI luckyMoneyNewPrepareUI2 = this.f147733d;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(luckyMoneyNewPrepareUI2, arrayList.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewPrepareUI$showMenu$2", "onMMMenuItemSelected", "(Landroid/view/MenuItem;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            luckyMoneyNewPrepareUI2.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(luckyMoneyNewPrepareUI2, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewPrepareUI$showMenu$2", "onMMMenuItemSelected", "(Landroid/view/MenuItem;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return;
        }
        if (i17 == com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI.V2) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(15511, java.lang.Integer.valueOf(luckyMoneyNewPrepareUI.f146269p1), 1);
            if (luckyMoneyNewPrepareUI.f146269p1 == 1) {
                com.tencent.mm.wallet_core.ui.r1.V(luckyMoneyNewPrepareUI.getContext(), com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI.f146242y2, false);
                return;
            }
            java.lang.Object[] objArr = new java.lang.Object[1];
            com.tencent.mm.plugin.luckymoney.model.c1 c1Var = luckyMoneyNewPrepareUI.Z;
            objArr[0] = c1Var != null ? c1Var != null ? c1Var.f145193r : null : "";
            com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewPrepareUI", "show qa foreign, config url: %s", objArr);
            com.tencent.mm.plugin.luckymoney.model.c1 c1Var2 = luckyMoneyNewPrepareUI.Z;
            if (c1Var2 != null) {
                if (!com.tencent.mm.sdk.platformtools.t8.K0(c1Var2 != null ? c1Var2.f145193r : null)) {
                    androidx.appcompat.app.AppCompatActivity context = luckyMoneyNewPrepareUI.getContext();
                    com.tencent.mm.plugin.luckymoney.model.c1 c1Var3 = luckyMoneyNewPrepareUI.Z;
                    com.tencent.mm.wallet_core.ui.r1.V(context, c1Var3 != null ? c1Var3.f145193r : null, false);
                    return;
                }
            }
            com.tencent.mm.wallet_core.ui.r1.V(luckyMoneyNewPrepareUI.getContext(), com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI.f146243z2, false);
        }
    }
}
