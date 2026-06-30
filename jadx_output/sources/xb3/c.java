package xb3;

/* loaded from: classes9.dex */
public class c implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.hk.ui.LuckyMoneyHKBeforeDetailUI f452895d;

    public c(com.tencent.mm.plugin.luckymoney.hk.ui.LuckyMoneyHKBeforeDetailUI luckyMoneyHKBeforeDetailUI) {
        this.f452895d = luckyMoneyHKBeforeDetailUI;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        com.tencent.mm.plugin.luckymoney.hk.ui.LuckyMoneyHKBeforeDetailUI luckyMoneyHKBeforeDetailUI = this.f452895d;
        android.app.Dialog dialog = luckyMoneyHKBeforeDetailUI.f145133g;
        if (dialog != null && dialog.isShowing()) {
            luckyMoneyHKBeforeDetailUI.f145133g.dismiss();
        }
        wb3.a aVar = luckyMoneyHKBeforeDetailUI.f145135i;
        if (aVar != null) {
            aVar.j();
        }
        if (luckyMoneyHKBeforeDetailUI.getContentView().getVisibility() == 8 || luckyMoneyHKBeforeDetailUI.getContentView().getVisibility() == 4) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyHKBeforeDetailUI", "user cancel & finish");
            luckyMoneyHKBeforeDetailUI.finish();
        }
    }
}
