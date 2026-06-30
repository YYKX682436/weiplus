package zw1;

/* loaded from: classes8.dex */
public final class k6 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.collect.ui.WalletCollectQrCodeUI f476696d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ww1.a3 f476697e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f476698f;

    public k6(com.tencent.mm.plugin.collect.ui.WalletCollectQrCodeUI walletCollectQrCodeUI, ww1.a3 a3Var, int i17) {
        this.f476696d = walletCollectQrCodeUI;
        this.f476697e = a3Var;
        this.f476698f = i17;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.plugin.collect.ui.WalletCollectQrCodeUI walletCollectQrCodeUI = this.f476696d;
        ww1.a3 a3Var = this.f476697e;
        int i17 = this.f476698f;
        walletCollectQrCodeUI.M7(a3Var, i17);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(25983, 23, java.lang.Integer.valueOf(i17));
        return true;
    }
}
