package zw1;

/* loaded from: classes15.dex */
public class m5 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.ln f476727d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.collect.ui.WalletCollectQrCodeUI f476728e;

    public m5(com.tencent.mm.plugin.collect.ui.WalletCollectQrCodeUI walletCollectQrCodeUI, r45.ln lnVar) {
        this.f476728e = walletCollectQrCodeUI;
        this.f476727d = lnVar;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        r45.wf5 wf5Var = (r45.wf5) this.f476727d.f379648e.get(menuItem.getItemId());
        com.tencent.mm.plugin.collect.ui.WalletCollectQrCodeUI walletCollectQrCodeUI = this.f476728e;
        walletCollectQrCodeUI.M = 2;
        walletCollectQrCodeUI.U6(wf5Var, null);
    }
}
