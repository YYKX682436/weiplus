package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public class kj implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNotHookReceiveUI f147109d;

    public kj(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNotHookReceiveUI luckyMoneyNotHookReceiveUI) {
        this.f147109d = luckyMoneyNotHookReceiveUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        dialogInterface.dismiss();
        this.f147109d.finish();
    }
}
