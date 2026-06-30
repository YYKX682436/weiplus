package pb3;

/* loaded from: classes9.dex */
public class c extends com.tencent.mm.ui.ac {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.appbrand.ui.receive.WxaLuckyMoneyReceiveUI f353172e;

    public c(com.tencent.mm.plugin.luckymoney.appbrand.ui.receive.WxaLuckyMoneyReceiveUI wxaLuckyMoneyReceiveUI) {
        this.f353172e = wxaLuckyMoneyReceiveUI;
    }

    @Override // com.tencent.mm.ui.ac
    public void a(android.view.View view) {
        com.tencent.mm.plugin.luckymoney.appbrand.ui.receive.WxaLuckyMoneyReceiveUI wxaLuckyMoneyReceiveUI = this.f353172e;
        wxaLuckyMoneyReceiveUI.f145054r.setVisibility(8);
        com.tencent.mm.plugin.luckymoney.model.m5.G(wxaLuckyMoneyReceiveUI.f145055s, 0);
        pb3.a aVar = wxaLuckyMoneyReceiveUI.f145049m;
        if (aVar != null) {
            pb3.k kVar = (pb3.k) aVar;
            int i17 = kVar.f353186g;
            if (i17 != 0) {
                com.tencent.mars.xlog.Log.i("MicroMsg.WxaReceiveLuckyMoneyLogic", "onOpenBtnClick return state = %d", java.lang.Integer.valueOf(i17));
            } else if (kVar.f353180a == null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.WxaReceiveLuckyMoneyLogic", "openLuckyMoney ui == null");
            } else {
                new lb3.c(kVar.f353181b, kVar.f353182c, kVar.f353183d).a(new pb3.h(kVar));
            }
        }
    }
}
