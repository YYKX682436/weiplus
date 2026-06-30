package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public class vg implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelbase.m1 f147548d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearSendUI f147549e;

    public vg(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearSendUI luckyMoneyNewYearSendUI, com.tencent.mm.modelbase.m1 m1Var) {
        this.f147549e = luckyMoneyNewYearSendUI;
        this.f147548d = m1Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        if (com.tencent.mm.plugin.luckymoney.model.h6.K(this.f147548d)) {
            this.f147549e.finish();
        }
    }
}
