package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public final class oa implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI f147267d;

    public oa(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI luckyMoneyNewPrepareUI) {
        this.f147267d = luckyMoneyNewPrepareUI;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialog) {
        android.app.Dialog dialog2;
        kotlin.jvm.internal.o.g(dialog, "dialog");
        java.lang.ref.WeakReference weakReference = com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI.f146241x2;
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewPrepareUI", "[doPrepareBtnClick] coperationTipDialogNoTransparent onCancel()");
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI luckyMoneyNewPrepareUI = this.f147267d;
        boolean z17 = false;
        luckyMoneyNewPrepareUI.f146278t2 = false;
        luckyMoneyNewPrepareUI.f146276s2 = false;
        android.app.Dialog dialog3 = luckyMoneyNewPrepareUI.f146277t;
        if (dialog3 != null) {
            if (dialog3 != null && dialog3.isShowing()) {
                z17 = true;
            }
            if (z17 && (dialog2 = luckyMoneyNewPrepareUI.f146277t) != null) {
                dialog2.dismiss();
            }
        }
        if (luckyMoneyNewPrepareUI.getContentView().getVisibility() == 8 || luckyMoneyNewPrepareUI.getContentView().getVisibility() == 4) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewPrepareUI", "usr cancel, & visibility not visiable, so finish");
            luckyMoneyNewPrepareUI.finish();
        }
        luckyMoneyNewPrepareUI.forceCancel();
    }
}
