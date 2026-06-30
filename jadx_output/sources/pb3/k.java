package pb3;

/* loaded from: classes9.dex */
public class k implements pb3.a {

    /* renamed from: d, reason: collision with root package name */
    public byte[] f353183d;

    /* renamed from: e, reason: collision with root package name */
    public r45.b25 f353184e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.plugin.wallet_core.id_verify.util.RealnameGuideHelper f353185f;

    /* renamed from: a, reason: collision with root package name */
    public pb3.b f353180a = null;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f353181b = null;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f353182c = null;

    /* renamed from: g, reason: collision with root package name */
    public int f353186g = -1;

    public final void a(android.content.Intent intent) {
        pb3.b bVar = this.f353180a;
        if (bVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WxaReceiveLuckyMoneyLogic", "WxaGetLuckyMoneyLogic.fail ui == null");
            return;
        }
        ((com.tencent.mm.plugin.luckymoney.appbrand.ui.receive.WxaLuckyMoneyReceiveUI) bVar).a7();
        com.tencent.mm.plugin.luckymoney.appbrand.ui.WxaLuckyMoneyBaseUI wxaLuckyMoneyBaseUI = (com.tencent.mm.plugin.luckymoney.appbrand.ui.WxaLuckyMoneyBaseUI) this.f353180a;
        wxaLuckyMoneyBaseUI.setResult(0, intent);
        wxaLuckyMoneyBaseUI.finish();
    }

    public final void b() {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_sendid", this.f353182c);
        intent.putExtra("key_appid", this.f353181b);
        if (this.f353184e != null) {
            android.os.Bundle bundle = new android.os.Bundle();
            try {
                bundle.putByteArray("key_data", this.f353184e.toByteArray());
                intent.putExtras(bundle);
                intent.putExtra("key_from", "value_open");
            } catch (java.io.IOException e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WxaReceiveLuckyMoneyLogic", e17, "goLuckyMoneyDetailUI WxaDetailResponse putByteArray error", new java.lang.Object[0]);
                a(new android.content.Intent().putExtra("result_error_code", -1).putExtra("result_error_msg", "fail:system error {{byte detail response fail}}"));
                return;
            }
        } else {
            intent.putExtra("key_from", "value_query");
        }
        ((com.tencent.mm.plugin.luckymoney.appbrand.ui.WxaLuckyMoneyBaseUI) this.f353180a).T6(nb3.b.class, intent, new pb3.i(this));
    }
}
