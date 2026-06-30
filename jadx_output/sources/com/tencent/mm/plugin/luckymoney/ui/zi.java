package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public final class zi implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f147781d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f147782e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearStateReceiveUI f147783f;

    public zi(java.lang.String str, java.lang.String str2, com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearStateReceiveUI luckyMoneyNewYearStateReceiveUI) {
        this.f147781d = str;
        this.f147782e = str2;
        this.f147783f = luckyMoneyNewYearStateReceiveUI;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String str = this.f147781d;
        java.lang.String str2 = this.f147782e;
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearStateReceiveUI luckyMoneyNewYearStateReceiveUI = this.f147783f;
        com.tencent.mm.view.MMPAGView mMPAGView = luckyMoneyNewYearStateReceiveUI.f146462v;
        if (mMPAGView != null) {
            com.tencent.mm.plugin.luckymoney.model.e5.m(str, str2, mMPAGView, null, luckyMoneyNewYearStateReceiveUI.B, luckyMoneyNewYearStateReceiveUI.C);
        } else {
            kotlin.jvm.internal.o.o("pagVideoView");
            throw null;
        }
    }
}
