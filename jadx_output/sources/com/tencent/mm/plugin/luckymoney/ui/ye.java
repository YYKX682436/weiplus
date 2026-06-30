package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes3.dex */
public final class ye implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewReceiveUI f147739d;

    public ye(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewReceiveUI luckyMoneyNewReceiveUI) {
        this.f147739d = luckyMoneyNewReceiveUI;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.View view = this.f147739d.f146312v;
        if (view != null) {
            view.setBackgroundResource(com.tencent.mm.R.color.a9e);
        }
    }
}
