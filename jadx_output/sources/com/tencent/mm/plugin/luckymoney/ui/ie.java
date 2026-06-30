package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public final class ie implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewReceiveUI f147026d;

    public ie(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewReceiveUI luckyMoneyNewReceiveUI) {
        this.f147026d = luckyMoneyNewReceiveUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.plugin.luckymoney.ui.zd zdVar = com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewReceiveUI.Q1;
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewReceiveUI luckyMoneyNewReceiveUI = this.f147026d;
        android.os.ResultReceiver resultReceiver = luckyMoneyNewReceiveUI.A1;
        if (resultReceiver != null) {
            resultReceiver.send(0, null);
        }
        luckyMoneyNewReceiveUI.finish();
        return false;
    }
}
