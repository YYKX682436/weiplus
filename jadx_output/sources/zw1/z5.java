package zw1;

/* loaded from: classes5.dex */
public class z5 implements com.tencent.mm.ui.tools.c5 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.collect.ui.WalletCollectQrCodeUI f476870d;

    public z5(com.tencent.mm.plugin.collect.ui.WalletCollectQrCodeUI walletCollectQrCodeUI) {
        this.f476870d = walletCollectQrCodeUI;
    }

    @Override // com.tencent.mm.ui.tools.c5
    public void w2(int i17, boolean z17) {
        boolean z18 = i17 > 0;
        com.tencent.mm.plugin.collect.ui.WalletCollectQrCodeUI walletCollectQrCodeUI = this.f476870d;
        walletCollectQrCodeUI.K = z18;
        com.tencent.mm.ui.widget.dialog.z2 z2Var = walletCollectQrCodeUI.E;
        if (z2Var == null || !z2Var.h()) {
            return;
        }
        int i18 = com.tencent.mm.ui.bl.b(walletCollectQrCodeUI.getContext()).y;
        if (i17 > 0) {
            if (i17 * 2 < i18) {
                walletCollectQrCodeUI.E.u((i18 - i65.a.b(walletCollectQrCodeUI.getContext(), 56)) - i17);
            }
        } else if (walletCollectQrCodeUI.L) {
            walletCollectQrCodeUI.E.u(walletCollectQrCodeUI.f96434J);
        } else {
            walletCollectQrCodeUI.E.u(walletCollectQrCodeUI.I);
        }
    }
}
