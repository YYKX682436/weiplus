package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public final class na implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI f147229d;

    public na(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI luckyMoneyNewPrepareUI) {
        this.f147229d = luckyMoneyNewPrepareUI;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialog) {
        android.app.Dialog dialog2;
        kotlin.jvm.internal.o.g(dialog, "dialog");
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI luckyMoneyNewPrepareUI = this.f147229d;
        android.app.Dialog dialog3 = luckyMoneyNewPrepareUI.f146273r;
        if (dialog3 != null) {
            boolean z17 = false;
            if (dialog3 != null && dialog3.isShowing()) {
                z17 = true;
            }
            if (z17 && (dialog2 = luckyMoneyNewPrepareUI.f146273r) != null) {
                dialog2.dismiss();
            }
        }
        if (luckyMoneyNewPrepareUI.getContentView().getVisibility() == 8 || luckyMoneyNewPrepareUI.getContentView().getVisibility() == 4) {
            java.lang.ref.WeakReference weakReference = com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI.f146241x2;
            com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewPrepareUI", "usr cancel, & visibility not visiable, so finish");
            luckyMoneyNewPrepareUI.finish();
        }
        luckyMoneyNewPrepareUI.forceCancel();
    }
}
