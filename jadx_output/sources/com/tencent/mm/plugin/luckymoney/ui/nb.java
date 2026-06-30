package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public final class nb implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ at4.a f147230d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI f147231e;

    public nb(at4.a aVar, com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI luckyMoneyNewPrepareUI) {
        this.f147230d = aVar;
        this.f147231e = luckyMoneyNewPrepareUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialog, int i17) {
        kotlin.jvm.internal.o.g(dialog, "dialog");
        java.lang.ref.WeakReference weakReference = com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI.f146241x2;
        at4.a aVar = this.f147230d;
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewPrepareUI", "goto h5: %s", aVar.f13798d);
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI luckyMoneyNewPrepareUI = this.f147231e;
        com.tencent.mm.wallet_core.ui.r1.V(luckyMoneyNewPrepareUI.getContext(), aVar.f13798d, false);
        luckyMoneyNewPrepareUI.f146280u2 = false;
    }
}
