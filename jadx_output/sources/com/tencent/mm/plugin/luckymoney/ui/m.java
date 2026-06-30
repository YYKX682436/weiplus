package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public class m implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyBeforeDetailUI f147158d;

    public m(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyBeforeDetailUI luckyMoneyBeforeDetailUI) {
        this.f147158d = luckyMoneyBeforeDetailUI;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        com.tencent.mm.modelbase.i iVar;
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyBeforeDetailUI luckyMoneyBeforeDetailUI = this.f147158d;
        android.app.Dialog dialog = luckyMoneyBeforeDetailUI.f145976g;
        if (dialog != null && dialog.isShowing()) {
            luckyMoneyBeforeDetailUI.f145976g.dismiss();
        }
        luckyMoneyBeforeDetailUI.forceCancel();
        cc3.b bVar = luckyMoneyBeforeDetailUI.f145981o;
        if (bVar != null && (iVar = bVar.f213885c) != null) {
            iVar.j();
        }
        if (luckyMoneyBeforeDetailUI.getContentView().getVisibility() == 8 || luckyMoneyBeforeDetailUI.getContentView().getVisibility() == 4) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyBeforeDetailUI", "user cancel & finish");
            luckyMoneyBeforeDetailUI.finish();
        }
    }
}
