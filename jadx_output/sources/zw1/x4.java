package zw1;

/* loaded from: classes5.dex */
public class x4 implements com.tencent.mm.ui.widget.dialog.p3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r45.ov f476847a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.collect.ui.WalletCollectQrCodeUI f476848b;

    public x4(com.tencent.mm.plugin.collect.ui.WalletCollectQrCodeUI walletCollectQrCodeUI, r45.ov ovVar) {
        this.f476848b = walletCollectQrCodeUI;
        this.f476847a = ovVar;
    }

    @Override // com.tencent.mm.ui.widget.dialog.p3
    public void a() {
        new android.os.Handler().postDelayed(new zw1.w4(this), 200L);
        r45.wf5 wf5Var = this.f476847a.f382537h;
        int i17 = com.tencent.mm.plugin.collect.ui.WalletCollectQrCodeUI.Q;
        com.tencent.mm.plugin.collect.ui.WalletCollectQrCodeUI walletCollectQrCodeUI = this.f476848b;
        walletCollectQrCodeUI.U6(wf5Var, null);
        com.tencent.mm.ui.widget.dialog.z2 z2Var = walletCollectQrCodeUI.E;
        if (z2Var == null || !z2Var.h()) {
            return;
        }
        walletCollectQrCodeUI.E.B();
        walletCollectQrCodeUI.E = null;
    }
}
