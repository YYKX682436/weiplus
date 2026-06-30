package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public class y1 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyDetailUI f147711d;

    public y1(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyDetailUI luckyMoneyDetailUI) {
        this.f147711d = luckyMoneyDetailUI;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyDetailUI luckyMoneyDetailUI = this.f147711d;
        android.app.Dialog dialog = luckyMoneyDetailUI.P;
        if (dialog != null && dialog.isShowing()) {
            luckyMoneyDetailUI.P.dismiss();
        }
        luckyMoneyDetailUI.forceCancel();
        wb3.a aVar = luckyMoneyDetailUI.f146066h3;
        if (aVar != null) {
            aVar.j();
        }
        if (luckyMoneyDetailUI.getContentView().getVisibility() == 8 || luckyMoneyDetailUI.getContentView().getVisibility() == 4) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyDetailUI", "user cancel & finish");
            luckyMoneyDetailUI.finish();
        }
    }
}
