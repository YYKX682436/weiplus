package zw1;

/* loaded from: classes3.dex */
public final class l6 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.vk4 f476715d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.collect.ui.WalletCollectQrCodeUI f476716e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f476717f;

    public l6(r45.vk4 vk4Var, com.tencent.mm.plugin.collect.ui.WalletCollectQrCodeUI walletCollectQrCodeUI, int i17) {
        this.f476715d = vk4Var;
        this.f476716e = walletCollectQrCodeUI;
        this.f476717f = i17;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        java.lang.String str;
        java.lang.String str2;
        kotlin.jvm.internal.o.g(it, "it");
        r45.vk4 vk4Var = this.f476715d;
        java.lang.String str3 = vk4Var != null ? vk4Var.f388318e : null;
        com.tencent.mm.plugin.collect.ui.WalletCollectQrCodeUI walletCollectQrCodeUI = this.f476716e;
        if (kotlin.jvm.internal.o.b(str3, walletCollectQrCodeUI.getString(com.tencent.mm.R.string.n_r))) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(25983, 23, java.lang.Integer.valueOf(this.f476717f));
        }
        int i17 = vk4Var.f388317d;
        boolean z17 = false;
        if (i17 == 2) {
            com.tencent.mm.wallet_core.ui.r1.X(walletCollectQrCodeUI, vk4Var.f388319f, false);
            return true;
        }
        if (i17 == 3) {
            if (!((vk4Var == null || (str2 = vk4Var.f388320g) == null || !r26.n0.N(str2)) ? false : true)) {
                if (vk4Var != null && (str = vk4Var.f388321h) != null && r26.n0.N(str)) {
                    z17 = true;
                }
                if (!z17) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.WalletCollectQrCodeUIHelp", "MiniApp info - username: " + vk4Var.f388320g + ", path: " + vk4Var.f388321h);
                    l81.b1 b1Var = new l81.b1();
                    b1Var.f317012a = vk4Var != null ? vk4Var.f388320g : null;
                    b1Var.f317022f = vk4Var != null ? vk4Var.f388321h : null;
                    b1Var.f317032k = 1072;
                    com.tencent.mm.plugin.appbrand.service.h6 h6Var = (com.tencent.mm.plugin.appbrand.service.h6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.h6.class);
                    if (h6Var != null) {
                        ((com.tencent.mm.plugin.appbrand.launching.xc) h6Var).bj(walletCollectQrCodeUI, b1Var);
                    }
                    return true;
                }
            }
            com.tencent.mars.xlog.Log.e("MicroMsg.WalletCollectQrCodeUIHelp", "waapp_username or waapp_path is null");
        }
        return true;
    }
}
