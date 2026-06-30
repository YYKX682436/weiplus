package com.tencent.mm.plugin.wallet_index.ui;

/* loaded from: classes.dex */
public class q implements com.tencent.mm.ui.da {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Intent f181189d = new android.content.Intent();

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_index.ui.r f181190e;

    public q(com.tencent.mm.plugin.wallet_index.ui.r rVar) {
        this.f181190e = rVar;
    }

    public final void a(int i17, android.content.Intent intent) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletBrandUI", "KindaBrand.kindaEndWithResult resultCode: %d, data: %s", java.lang.Integer.valueOf(i17), intent.toString());
        com.tencent.mm.plugin.wallet_index.ui.WalletBrandUI walletBrandUI = this.f181190e.f181191a;
        walletBrandUI.f181094s = i17;
        walletBrandUI.f181095t = intent;
        walletBrandUI.setResult(i17, intent);
    }

    @Override // com.tencent.mm.ui.xc
    public void mmOnActivityResult(int i17, int i18, android.content.Intent intent) {
        if (i17 != this.f181190e.f181191a.f181087i) {
            return;
        }
        if (intent == null) {
            java.lang.Throwable th6 = new java.lang.Throwable("KindaBrand Intent data null!");
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.e("MicroMsg.WalletBrandUI", com.tencent.mm.sdk.platformtools.z3.c(th6));
            return;
        }
        if (i18 != -1) {
            a(i18, intent);
            return;
        }
        if (!intent.hasExtra("key_jsapi_close_page_after_pay")) {
            this.f181189d.putExtras(intent);
            a(i18, this.f181189d);
            return;
        }
        int intExtra = intent.getIntExtra("key_jsapi_close_page_after_pay", 0);
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletBrandUI", "KindaBrand.mmOnActivityResult resultCode:%s ClosePage:%s src requestCode:%s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(intExtra), java.lang.Integer.valueOf(this.f181190e.f181191a.getIntent().getIntExtra("requestCode", -1)));
        this.f181189d.putExtra("key_jsapi_close_page_after_pay", intExtra);
        this.f181190e.f181191a.setResult(i18, this.f181189d);
        if (intExtra == 1 && this.f181190e.f181191a.getIntent().getIntExtra("requestCode", -1) == 214) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletBrandUI", "store pay need close:%b, url:%s", java.lang.Boolean.valueOf(com.tencent.mm.sdk.platformtools.o4.L().D("key_jsapi_pay_need_close", this.f181190e.f181191a.f181086h.P)), this.f181190e.f181191a.f181086h.P);
            ((ku5.t0) ku5.t0.f312615d).k(new com.tencent.mm.plugin.wallet_index.ui.p(this), 1000L);
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(24610, "7", "1", "1", "");
        }
    }
}
