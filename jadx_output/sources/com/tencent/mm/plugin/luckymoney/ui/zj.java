package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public class zj implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNotHookReceiveUI f147784d;

    public zj(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNotHookReceiveUI luckyMoneyNotHookReceiveUI) {
        this.f147784d = luckyMoneyNotHookReceiveUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNotHookReceiveUI luckyMoneyNotHookReceiveUI = this.f147784d;
        android.os.ResultReceiver resultReceiver = luckyMoneyNotHookReceiveUI.f146490y1;
        if (resultReceiver != null) {
            resultReceiver.send(0, null);
        }
        luckyMoneyNotHookReceiveUI.finish();
        return false;
    }
}
