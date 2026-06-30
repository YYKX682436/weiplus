package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes3.dex */
public class n2 implements km5.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.app.Dialog f147215a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyDetailUI f147216b;

    public n2(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyDetailUI luckyMoneyDetailUI, android.app.Dialog dialog) {
        this.f147216b = luckyMoneyDetailUI;
        this.f147215a = dialog;
    }

    @Override // km5.e
    public void a(java.lang.Object obj) {
        android.app.Dialog dialog = this.f147215a;
        if (dialog != null) {
            dialog.dismiss();
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyDetailUI", "fetch detail failed: %s", obj);
        if (obj != null) {
            boolean z17 = obj instanceof java.lang.String;
            com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyDetailUI luckyMoneyDetailUI = this.f147216b;
            dp.a.makeText(luckyMoneyDetailUI.getContext(), z17 ? obj.toString() : luckyMoneyDetailUI.getString(com.tencent.mm.R.string.kpu), 1).show();
        }
    }
}
