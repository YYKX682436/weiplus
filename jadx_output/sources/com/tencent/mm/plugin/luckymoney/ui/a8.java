package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public final class a8 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewDetailUI f146696d;

    public a8(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewDetailUI luckyMoneyNewDetailUI) {
        this.f146696d = luckyMoneyNewDetailUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewDetailUI", "RealnameGuideHelper dialog click cancel");
        super/*com.tencent.mm.ui.MMActivity*/.finish();
    }
}
