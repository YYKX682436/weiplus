package ob3;

/* loaded from: classes9.dex */
public class q extends com.tencent.mm.ui.ac {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f344080e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.appbrand.ui.prepare.WxaLuckyMoneyPrepareUI f344081f;

    public q(com.tencent.mm.plugin.luckymoney.appbrand.ui.prepare.WxaLuckyMoneyPrepareUI wxaLuckyMoneyPrepareUI, java.lang.String str) {
        this.f344081f = wxaLuckyMoneyPrepareUI;
        this.f344080e = str;
    }

    @Override // com.tencent.mm.ui.ac
    public void a(android.view.View view) {
        com.tencent.mm.plugin.luckymoney.appbrand.ui.prepare.WxaLuckyMoneyPrepareUI wxaLuckyMoneyPrepareUI = this.f344081f;
        if (wxaLuckyMoneyPrepareUI.f145031h == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WxaLuckyMoneyPrepareUI", "Click PrepareBtn but, mLogic == null");
            return;
        }
        if (wxaLuckyMoneyPrepareUI.f145034n.c() != 0) {
            db5.t7.makeText(wxaLuckyMoneyPrepareUI.getContext(), com.tencent.mm.R.string.kfm, 0).show();
            return;
        }
        int input = wxaLuckyMoneyPrepareUI.f145033m.getInput();
        double input2 = wxaLuckyMoneyPrepareUI.f145034n.getInput();
        java.lang.String input3 = wxaLuckyMoneyPrepareUI.f145035o.getInput();
        if (com.tencent.mm.sdk.platformtools.t8.K0(input3)) {
            input3 = this.f344080e;
            if (com.tencent.mm.sdk.platformtools.t8.K0(input3)) {
                input3 = wxaLuckyMoneyPrepareUI.getString(com.tencent.mm.R.string.gjq);
            }
        }
        lb3.i iVar = wxaLuckyMoneyPrepareUI.f145032i;
        if (iVar == lb3.i.RANDOM_LUCK) {
            ob3.a aVar = wxaLuckyMoneyPrepareUI.f145031h;
            int D0 = (int) com.tencent.mm.wallet_core.ui.r1.D0(input2);
            int i17 = wxaLuckyMoneyPrepareUI.f145044x;
            ob3.a0 a0Var = (ob3.a0) aVar;
            a0Var.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.WxaPrepareLuckyMoneyLogic", "prepareRandomLuckyMoney() called with: moneyTotalAmount = [" + D0 + "], packageAmount = [" + input + "], wishing = [" + input3 + "], scope = [" + i17 + "]");
            if (a0Var.f344043d == null) {
                return;
            }
            r45.pr5 pr5Var = new r45.pr5();
            pr5Var.f383333d = a0Var.f344044e;
            pr5Var.f383334e = 1;
            pr5Var.f383335f = input;
            pr5Var.f383336g = D0;
            pr5Var.f383338i = input3;
            pr5Var.f383339m = i17;
            a0Var.b(pr5Var);
            return;
        }
        if (iVar == lb3.i.FIX_NORMAL) {
            ob3.a aVar2 = wxaLuckyMoneyPrepareUI.f145031h;
            int D02 = (int) com.tencent.mm.wallet_core.ui.r1.D0(input2);
            int i18 = wxaLuckyMoneyPrepareUI.f145044x;
            ob3.a0 a0Var2 = (ob3.a0) aVar2;
            a0Var2.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.WxaPrepareLuckyMoneyLogic", "prepareFixLuckyMoney() called with: packageMoneyAmount = [" + D02 + "], packageAmount = [" + input + "], wishing = [" + input3 + "], scope = [" + i18 + "]");
            if (a0Var2.f344043d == null) {
                return;
            }
            r45.pr5 pr5Var2 = new r45.pr5();
            pr5Var2.f383333d = a0Var2.f344044e;
            pr5Var2.f383334e = 0;
            pr5Var2.f383335f = input;
            pr5Var2.f383337h = D02;
            pr5Var2.f383338i = input3;
            pr5Var2.f383339m = i18;
            a0Var2.b(pr5Var2);
        }
    }
}
