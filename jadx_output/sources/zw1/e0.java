package zw1;

/* loaded from: classes9.dex */
public class e0 extends com.tencent.mm.wallet_core.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.collect.ui.CollectCreateQRCodeNewUI f476615d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(com.tencent.mm.plugin.collect.ui.CollectCreateQRCodeNewUI collectCreateQRCodeNewUI) {
        super(false);
        this.f476615d = collectCreateQRCodeNewUI;
    }

    @Override // com.tencent.mm.wallet_core.ui.z1
    public void onRealClick(android.view.View view) {
        com.tencent.mm.plugin.collect.ui.CollectCreateQRCodeNewUI collectCreateQRCodeNewUI = this.f476615d;
        double F = com.tencent.mm.sdk.platformtools.t8.F(collectCreateQRCodeNewUI.f96377d.getText(), 0.0d);
        gm0.j1.i();
        int intValue = ((java.lang.Integer) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_WALLET_REGION_TYPE_INT_SYNC, 0)).intValue();
        com.tencent.mars.xlog.Log.i("MicroMsg.CollectCreateQRCodeNewUI", "wallet region: %s", java.lang.Integer.valueOf(intValue));
        if (!collectCreateQRCodeNewUI.f96377d.n()) {
            com.tencent.mm.plugin.collect.ui.CollectCreateQRCodeNewUI.U6(collectCreateQRCodeNewUI, collectCreateQRCodeNewUI.getString(com.tencent.mm.R.string.kfm));
            return;
        }
        if (F < 0.01d) {
            com.tencent.mm.plugin.collect.ui.CollectCreateQRCodeNewUI.U6(collectCreateQRCodeNewUI, collectCreateQRCodeNewUI.getString(com.tencent.mm.R.string.hye));
        } else if (intValue == 8) {
            collectCreateQRCodeNewUI.doSceneForceProgress(new ww1.t1(java.lang.Math.round(F * 100.0d), 1, collectCreateQRCodeNewUI.f96380g, c01.z1.m()));
        } else {
            collectCreateQRCodeNewUI.doSceneProgress(new ww1.z1(F, "1", collectCreateQRCodeNewUI.f96380g));
        }
    }
}
