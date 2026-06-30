package pb3;

/* loaded from: classes9.dex */
public class i implements mb3.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ pb3.k f353178a;

    public i(pb3.k kVar) {
        this.f353178a = kVar;
    }

    @Override // mb3.d
    public void a(int i17, android.content.Intent intent) {
        pb3.k kVar = this.f353178a;
        if (i17 != -1) {
            kVar.a(intent);
            return;
        }
        pb3.b bVar = kVar.f353180a;
        if (bVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WxaReceiveLuckyMoneyLogic", "WxaGetLuckyMoneyLogic.succeed ui == null");
            return;
        }
        ((com.tencent.mm.plugin.luckymoney.appbrand.ui.receive.WxaLuckyMoneyReceiveUI) bVar).a7();
        com.tencent.mm.plugin.luckymoney.appbrand.ui.WxaLuckyMoneyBaseUI wxaLuckyMoneyBaseUI = (com.tencent.mm.plugin.luckymoney.appbrand.ui.WxaLuckyMoneyBaseUI) kVar.f353180a;
        wxaLuckyMoneyBaseUI.setResult(-1, new android.content.Intent());
        wxaLuckyMoneyBaseUI.finish();
    }
}
