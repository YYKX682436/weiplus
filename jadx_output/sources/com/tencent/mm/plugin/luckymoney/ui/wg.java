package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public class wg implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.MMActivity f147652d;

    public wg(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearSendUI luckyMoneyNewYearSendUI, com.tencent.mm.ui.MMActivity mMActivity) {
        this.f147652d = mMActivity;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        dialogInterface.dismiss();
        this.f147652d.finish();
    }
}
