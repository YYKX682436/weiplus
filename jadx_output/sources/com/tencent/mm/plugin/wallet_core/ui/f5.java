package com.tencent.mm.plugin.wallet_core.ui;

/* loaded from: classes9.dex */
public class f5 extends com.tencent.mm.wallet_core.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f180267d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f180268e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f180269f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f180270g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.ui.WalletOrderInfoNewUI f180271h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f5(com.tencent.mm.plugin.wallet_core.ui.WalletOrderInfoNewUI walletOrderInfoNewUI, int i17, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        super(false);
        this.f180271h = walletOrderInfoNewUI;
        this.f180267d = i17;
        this.f180268e = str;
        this.f180269f = str2;
        this.f180270g = str3;
    }

    @Override // com.tencent.mm.wallet_core.ui.z1
    public void onRealClick(android.view.View view) {
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        com.tencent.mm.plugin.wallet_core.ui.WalletOrderInfoNewUI walletOrderInfoNewUI = this.f180271h;
        g0Var.d(22110, 1, walletOrderInfoNewUI.f180032p);
        int i17 = this.f180267d;
        if (i17 == 0) {
            java.lang.String str = walletOrderInfoNewUI.f180032p;
            java.lang.String str2 = this.f180268e;
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletOrderInfoNewUI", "finder_uri_username：%s, mTransactionId:%s", str2, str);
            ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).xj(walletOrderInfoNewUI, str2, 16, com.tencent.mm.plugin.wallet_core.utils.b1.a(1));
            return;
        }
        java.lang.String str3 = this.f180270g;
        java.lang.String str4 = this.f180269f;
        if (i17 != 1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletOrderInfoNewUI", "finder_uri_feedid：%s，finder_uri_nonceid：%s", str4, str3);
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletOrderInfoNewUI", "finder_uri_feedid：%s，finder_uri_nonceid：%s，mTransactionId:%s ", str4, str3, walletOrderInfoNewUI.f180032p);
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).vj(this.f180271h, this.f180269f, this.f180270g, false, 16, com.tencent.mm.plugin.wallet_core.utils.b1.a(1));
    }
}
