package nb3;

/* loaded from: classes9.dex */
public class g implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.appbrand.ui.detail.WxaLuckyMoneyDetailUI f336050d;

    public g(com.tencent.mm.plugin.luckymoney.appbrand.ui.detail.WxaLuckyMoneyDetailUI wxaLuckyMoneyDetailUI) {
        this.f336050d = wxaLuckyMoneyDetailUI;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        com.tencent.mm.plugin.luckymoney.appbrand.ui.detail.WxaLuckyMoneyDetailUI wxaLuckyMoneyDetailUI = this.f336050d;
        wxaLuckyMoneyDetailUI.V6();
        if (wxaLuckyMoneyDetailUI.getContentView().getVisibility() == 8 || wxaLuckyMoneyDetailUI.getContentView().getVisibility() == 4) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WxaLuckyMoneyDetailUI", "user cancel & finish");
            wxaLuckyMoneyDetailUI.setResult(-1, null);
            wxaLuckyMoneyDetailUI.finish();
        }
    }
}
