package zw1;

/* loaded from: classes8.dex */
public class i3 extends com.tencent.mm.wallet_core.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.collect.ui.WalletCollectQrCodeSettingUI f476663d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i3(com.tencent.mm.plugin.collect.ui.WalletCollectQrCodeSettingUI walletCollectQrCodeSettingUI) {
        super(false);
        this.f476663d = walletCollectQrCodeSettingUI;
    }

    @Override // com.tencent.mm.wallet_core.ui.z1
    public void onRealClick(android.view.View view) {
        com.tencent.mm.plugin.collect.ui.WalletCollectQrCodeSettingUI walletCollectQrCodeSettingUI = this.f476663d;
        double F = com.tencent.mm.sdk.platformtools.t8.F(walletCollectQrCodeSettingUI.f96427d.getText(), 0.0d);
        gm0.j1.i();
        int intValue = ((java.lang.Integer) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_WALLET_REGION_TYPE_INT_SYNC, 0)).intValue();
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletCollectQrCodeSettingUI", "wallet region: %s", java.lang.Integer.valueOf(intValue));
        if (!walletCollectQrCodeSettingUI.f96427d.n()) {
            com.tencent.mm.plugin.collect.ui.WalletCollectQrCodeSettingUI.U6(walletCollectQrCodeSettingUI, walletCollectQrCodeSettingUI.getString(com.tencent.mm.R.string.kfm));
            return;
        }
        if (F < 0.01d) {
            com.tencent.mm.plugin.collect.ui.WalletCollectQrCodeSettingUI.U6(walletCollectQrCodeSettingUI, walletCollectQrCodeSettingUI.getString(com.tencent.mm.R.string.hye));
            return;
        }
        if (intValue == 8) {
            walletCollectQrCodeSettingUI.doSceneForceProgress(new ww1.t1(java.lang.Math.round(F * 100.0d), 1, walletCollectQrCodeSettingUI.f96430g, c01.z1.m()));
            return;
        }
        int intExtra = walletCollectQrCodeSettingUI.getIntent().getIntExtra("key_type", 1);
        int i07 = com.tencent.mm.wallet_core.ui.r1.i0(walletCollectQrCodeSettingUI.f96427d.getText(), "100");
        if (intExtra != 2) {
            ww1.i iVar = new ww1.i(i07, "1", walletCollectQrCodeSettingUI.f96430g, false, "", 1);
            androidx.appcompat.app.AppCompatActivity context = walletCollectQrCodeSettingUI.getContext();
            iVar.f213904m = true;
            iVar.f213906o = context;
            pq5.g l17 = iVar.l();
            l17.f((com.tencent.mm.ui.MMActivity) walletCollectQrCodeSettingUI.getContext());
            l17.h(new zw1.h3(this));
            return;
        }
        ww1.j jVar = new ww1.j(i07, "1", walletCollectQrCodeSettingUI.f96430g, false, "", 1, walletCollectQrCodeSettingUI.getIntent().getLongExtra("ftf_fixed_current_shop_id", 0L));
        androidx.appcompat.app.AppCompatActivity context2 = walletCollectQrCodeSettingUI.getContext();
        jVar.f213904m = true;
        jVar.f213906o = context2;
        pq5.g l18 = jVar.l();
        l18.f((com.tencent.mm.ui.MMActivity) walletCollectQrCodeSettingUI.getContext());
        l18.h(new zw1.g3(this));
    }
}
