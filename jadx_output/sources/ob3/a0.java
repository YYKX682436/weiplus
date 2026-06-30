package ob3;

/* loaded from: classes9.dex */
public class a0 implements ob3.a, com.tencent.mm.ui.da {

    /* renamed from: d, reason: collision with root package name */
    public ob3.c f344043d;

    /* renamed from: f, reason: collision with root package name */
    public r45.qr5 f344045f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f344046g;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f344044e = null;

    /* renamed from: h, reason: collision with root package name */
    public final int f344047h = hashCode() & 65535;

    public final void a(android.content.Intent intent) {
        this.f344046g = false;
        java.lang.Object obj = this.f344043d;
        if (obj == null) {
            return;
        }
        com.tencent.mm.plugin.luckymoney.appbrand.ui.WxaLuckyMoneyBaseUI wxaLuckyMoneyBaseUI = (com.tencent.mm.plugin.luckymoney.appbrand.ui.WxaLuckyMoneyBaseUI) obj;
        wxaLuckyMoneyBaseUI.setResult(0, intent);
        wxaLuckyMoneyBaseUI.finish();
    }

    public final void b(r45.pr5 pr5Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WxaPrepareLuckyMoneyLogic", "prepareImpl ");
        if (this.f344046g) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WxaPrepareLuckyMoneyLogic", "prepareImpl isRequesting");
        } else {
            this.f344046g = true;
            new lb3.f(pr5Var).a(new ob3.y(this));
        }
    }

    @Override // com.tencent.mm.ui.xc
    public void mmOnActivityResult(int i17, int i18, android.content.Intent intent) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WxaPrepareLuckyMoneyLogic", "mmOnActivityResult() called with: requestCode = [" + i17 + "], resultCode = [" + i18 + "], data = [" + intent + "]");
        if (i17 == this.f344047h) {
            if (i18 != -1) {
                com.tencent.mars.xlog.Log.i("MicroMsg.WxaPrepareLuckyMoneyLogic", "mmOnActivityResult() REQUEST_CODE_WALLET called cancel ");
                a(new android.content.Intent().putExtra("result_error_code", 10001).putExtra("result_error_msg", "fail:pay fail"));
            } else {
                ((com.tencent.mm.plugin.luckymoney.appbrand.ui.WxaLuckyMoneyBaseUI) this.f344043d).T6(ob3.b.class, new android.content.Intent(), new ob3.z(this));
            }
        }
    }
}
