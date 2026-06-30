package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes.dex */
public final class z7 implements com.tencent.mm.plugin.wallet.balance.model.lqt.c1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.app.Dialog f147769a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewDetailUI f147770b;

    public z7(android.app.Dialog dialog, com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewDetailUI luckyMoneyNewDetailUI) {
        this.f147769a = dialog;
        this.f147770b = luckyMoneyNewDetailUI;
    }

    @Override // com.tencent.mm.plugin.wallet.balance.model.lqt.c1
    public final void call(java.lang.Object obj) {
        java.lang.String string;
        android.app.Dialog dialog = this.f147769a;
        if (dialog != null) {
            dialog.dismiss();
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewDetailUI", "[fetchLqtDetail] interrupt-failed: %s", obj);
        if (obj != null) {
            boolean z17 = obj instanceof java.lang.String;
            com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewDetailUI luckyMoneyNewDetailUI = this.f147770b;
            if (z17) {
                string = obj.toString();
            } else {
                string = luckyMoneyNewDetailUI.getString(com.tencent.mm.R.string.kpu);
                kotlin.jvm.internal.o.d(string);
            }
            dp.a.makeText(luckyMoneyNewDetailUI.getContext(), string, 1).show();
        }
    }
}
