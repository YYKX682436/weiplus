package zw1;

/* loaded from: classes14.dex */
public class v5 implements l81.e1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f476830a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f476831b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.collect.ui.WalletCollectQrCodeUI f476832c;

    public v5(com.tencent.mm.plugin.collect.ui.WalletCollectQrCodeUI walletCollectQrCodeUI, int i17, int i18) {
        this.f476832c = walletCollectQrCodeUI;
        this.f476830a = i17;
        this.f476831b = i18;
    }

    @Override // l81.e1
    public void a() {
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletCollectQrCodeUI", "onAppBrandProcessDied");
        int i17 = this.f476830a;
        int i18 = this.f476831b;
        com.tencent.mm.plugin.collect.ui.WalletCollectQrCodeUI walletCollectQrCodeUI = this.f476832c;
        if (i17 == 2) {
            int i19 = com.tencent.mm.plugin.collect.ui.WalletCollectQrCodeUI.Q;
            walletCollectQrCodeUI.g7(i18);
        } else {
            int i27 = com.tencent.mm.plugin.collect.ui.WalletCollectQrCodeUI.Q;
            walletCollectQrCodeUI.f7(i18);
        }
        ((com.tencent.mm.plugin.appbrand.launching.xc) ((com.tencent.mm.plugin.appbrand.service.h6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.h6.class))).hj(this);
    }

    @Override // l81.e1
    public void b() {
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletCollectQrCodeUI", "onAppBrandPreconditionError");
        ((com.tencent.mm.plugin.appbrand.launching.xc) ((com.tencent.mm.plugin.appbrand.service.h6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.h6.class))).hj(this);
    }

    @Override // l81.e1
    public void d(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletCollectQrCodeUI", "onTriggerHalfScreenShare");
    }

    @Override // l81.e1
    public void e() {
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletCollectQrCodeUI", "onAppBrandUIEnter");
    }

    @Override // l81.e1
    public void f(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletCollectQrCodeUI", "onAppBrandUIExit：%s", java.lang.Boolean.valueOf(z17));
        int i17 = this.f476830a;
        int i18 = this.f476831b;
        com.tencent.mm.plugin.collect.ui.WalletCollectQrCodeUI walletCollectQrCodeUI = this.f476832c;
        if (i17 == 2) {
            int i19 = com.tencent.mm.plugin.collect.ui.WalletCollectQrCodeUI.Q;
            walletCollectQrCodeUI.g7(i18);
        } else {
            int i27 = com.tencent.mm.plugin.collect.ui.WalletCollectQrCodeUI.Q;
            walletCollectQrCodeUI.f7(i18);
        }
        ((com.tencent.mm.plugin.appbrand.launching.xc) ((com.tencent.mm.plugin.appbrand.service.h6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.h6.class))).hj(this);
    }
}
