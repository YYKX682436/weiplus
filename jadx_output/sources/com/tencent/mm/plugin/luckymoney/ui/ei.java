package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public class ei implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelbase.m1 f146876d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearSendUIV2 f146877e;

    public ei(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearSendUIV2 luckyMoneyNewYearSendUIV2, com.tencent.mm.modelbase.m1 m1Var) {
        this.f146877e = luckyMoneyNewYearSendUIV2;
        this.f146876d = m1Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        if (com.tencent.mm.plugin.luckymoney.model.h6.K(this.f146876d)) {
            this.f146877e.finish();
        }
    }
}
