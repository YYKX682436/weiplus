package pb3;

/* loaded from: classes9.dex */
public class f implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.appbrand.ui.receive.WxaLuckyMoneyReceiveUI f353175d;

    public f(com.tencent.mm.plugin.luckymoney.appbrand.ui.receive.WxaLuckyMoneyReceiveUI wxaLuckyMoneyReceiveUI) {
        this.f353175d = wxaLuckyMoneyReceiveUI;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        com.tencent.mm.plugin.luckymoney.appbrand.ui.receive.WxaLuckyMoneyReceiveUI wxaLuckyMoneyReceiveUI = this.f353175d;
        wxaLuckyMoneyReceiveUI.a7();
        if (wxaLuckyMoneyReceiveUI.getContentView().getVisibility() == 8 || wxaLuckyMoneyReceiveUI.getContentView().getVisibility() == 4) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WxaLuckyMoneyReceiveUI", "user cancel & finish");
            wxaLuckyMoneyReceiveUI.V6(4, -1);
            wxaLuckyMoneyReceiveUI.finish();
        }
    }
}
