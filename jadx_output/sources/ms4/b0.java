package ms4;

/* loaded from: classes8.dex */
public final class b0 implements com.tencent.midas.api.IAPMidasPayCallBack {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f331000a;

    /* renamed from: b, reason: collision with root package name */
    public final js4.n f331001b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f331002c;

    public b0(java.lang.String str, js4.n info, java.lang.String uniqueID) {
        kotlin.jvm.internal.o.g(info, "info");
        kotlin.jvm.internal.o.g(uniqueID, "uniqueID");
        this.f331000a = str;
        this.f331001b = info;
        this.f331002c = uniqueID;
    }

    @Override // com.tencent.midas.api.IAPMidasPayCallBack
    public void MidasPayCallBack(com.tencent.midas.api.APMidasResponse aPMidasResponse) {
        if (aPMidasResponse != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WeCoinMidasInitializer", "MidasPayCallBack: resultCode: " + aPMidasResponse.resultCode + ", resultMsg: " + aPMidasResponse.resultMsg + ", realSaveNum: " + aPMidasResponse.realSaveNum + ", payChannel: " + aPMidasResponse.payChannel + ", payState: " + aPMidasResponse.payState + ",provideState: " + aPMidasResponse.provideState);
            int i17 = aPMidasResponse.resultCode;
            js4.n nVar = this.f331001b;
            if (i17 == 0) {
                a(4, 3, i17, aPMidasResponse.resultMsg);
                com.tencent.mm.plugin.report.service.g0.INSTANCE.A(fe1.l.CTRL_INDEX, 24);
                ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Cj("pay_coin_success", null, kz5.c1.k(new jz5.l("coin_report_session_id", js4.r.f301567c), new jz5.l("coin_business_id", java.lang.Integer.valueOf(js4.r.f301565a))), 25955);
                js4.o oVar = nVar.f301546d;
                if (oVar != null) {
                    oVar.onSuccess(null);
                    return;
                }
                return;
            }
            if (i17 != 2) {
                js4.o oVar2 = nVar.f301546d;
                if (oVar2 != null) {
                    oVar2.a(3, i17, aPMidasResponse.resultMsg);
                }
                a(4, 3, aPMidasResponse.resultCode, aPMidasResponse.resultMsg);
                com.tencent.mm.plugin.report.service.g0.INSTANCE.A(fe1.l.CTRL_INDEX, 25);
                return;
            }
            a(4, 3, i17, aPMidasResponse.resultMsg);
            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(fe1.l.CTRL_INDEX, 26);
            java.lang.String str = this.f331000a;
            if (!(str == null || str.length() == 0)) {
                a(5, 1, 0, "");
                new ks4.a(str).l().q(new ms4.a0(this));
            }
            js4.o oVar3 = nVar.f301546d;
            if (oVar3 != null) {
                java.lang.String str2 = aPMidasResponse.resultMsg;
                oVar3.a(3, -3, str2 != null ? str2 : "");
            }
        }
    }

    @Override // com.tencent.midas.api.IAPMidasPayCallBack
    public void MidasPayNeedLogin() {
        com.tencent.mars.xlog.Log.i("MicroMsg.WeCoinMidasInitializer", "Midas pay need login:");
    }

    public final void a(int i17, int i18, int i19, java.lang.String str) {
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        js4.n nVar = this.f331001b;
        g0Var.d(22129, java.lang.Integer.valueOf(os4.h.d(nVar.f301543a)), nVar.f301545c, this.f331002c, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
    }
}
