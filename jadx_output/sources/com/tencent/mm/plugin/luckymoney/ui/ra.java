package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes3.dex */
public final class ra implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI f147377d;

    public ra(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI luckyMoneyNewPrepareUI) {
        this.f147377d = luckyMoneyNewPrepareUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem item) {
        kotlin.jvm.internal.o.g(item, "item");
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI luckyMoneyNewPrepareUI = this.f147377d;
        com.tencent.mm.plugin.luckymoney.model.c1 c1Var = luckyMoneyNewPrepareUI.Z;
        if (c1Var != null) {
            if (!com.tencent.mm.sdk.platformtools.t8.K0(c1Var != null ? c1Var.f145193r : null)) {
                androidx.appcompat.app.AppCompatActivity context = luckyMoneyNewPrepareUI.getContext();
                com.tencent.mm.plugin.luckymoney.model.c1 c1Var2 = luckyMoneyNewPrepareUI.Z;
                com.tencent.mm.wallet_core.ui.r1.V(context, c1Var2 != null ? c1Var2.f145193r : null, false);
                return true;
            }
        }
        com.tencent.mm.wallet_core.ui.r1.V(luckyMoneyNewPrepareUI.getContext(), com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI.f146243z2, false);
        return true;
    }
}
