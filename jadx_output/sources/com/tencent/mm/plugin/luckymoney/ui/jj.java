package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public class jj implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNotHookReceiveUI f147062d;

    public jj(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNotHookReceiveUI luckyMoneyNotHookReceiveUI) {
        this.f147062d = luckyMoneyNotHookReceiveUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNotHookReceiveUI", "click AlertDialog");
        this.f147062d.finish();
    }
}
