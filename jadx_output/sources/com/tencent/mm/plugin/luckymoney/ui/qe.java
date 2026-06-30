package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public final class qe implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewReceiveUI f147348d;

    public qe(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewReceiveUI luckyMoneyNewReceiveUI) {
        this.f147348d = luckyMoneyNewReceiveUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewReceiveUI", "[onSceneEnd] WalletConstantsNetwork.ErrCode.ERR_SAME_IDENTITY_OPEN_LUCKY_MONEY：click AlertDialog");
        this.f147348d.finish();
    }
}
