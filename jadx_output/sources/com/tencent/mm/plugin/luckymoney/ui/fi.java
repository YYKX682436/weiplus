package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes5.dex */
public class fi implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.MMActivity f146911d;

    public fi(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearSendUIV2 luckyMoneyNewYearSendUIV2, com.tencent.mm.ui.MMActivity mMActivity) {
        this.f146911d = mMActivity;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        dialogInterface.dismiss();
        this.f146911d.finish();
    }
}
