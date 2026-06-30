package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public final class ne implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewReceiveUI f147237d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yb3.b f147238e;

    public ne(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewReceiveUI luckyMoneyNewReceiveUI, yb3.b bVar) {
        this.f147237d = luckyMoneyNewReceiveUI;
        this.f147238e = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f147237d.doSceneProgress(this.f147238e, false);
    }
}
