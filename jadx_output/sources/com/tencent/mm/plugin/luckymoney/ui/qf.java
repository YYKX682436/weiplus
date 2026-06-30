package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes.dex */
public class qf implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearReceiveUI f147349d;

    public qf(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearReceiveUI luckyMoneyNewYearReceiveUI) {
        this.f147349d = luckyMoneyNewYearReceiveUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        dialogInterface.dismiss();
        this.f147349d.finish();
    }
}
