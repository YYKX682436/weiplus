package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public class t1 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyDetailUI f147440d;

    public t1(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyDetailUI luckyMoneyDetailUI) {
        this.f147440d = luckyMoneyDetailUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyDetailUI", "RealnameGuideHelper dialog click cancel");
        super/*com.tencent.mm.ui.MMActivity*/.finish();
    }
}
