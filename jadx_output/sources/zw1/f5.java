package zw1;

/* loaded from: classes15.dex */
public class f5 implements com.tencent.mm.ui.widget.dialog.p3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ww1.a3 f476625a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r45.wf5 f476626b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.collect.ui.WalletCollectQrCodeUI f476627c;

    public f5(com.tencent.mm.plugin.collect.ui.WalletCollectQrCodeUI walletCollectQrCodeUI, ww1.a3 a3Var, r45.wf5 wf5Var) {
        this.f476627c = walletCollectQrCodeUI;
        this.f476625a = a3Var;
        this.f476626b = wf5Var;
    }

    @Override // com.tencent.mm.ui.widget.dialog.p3
    public void a() {
        com.tencent.mm.plugin.collect.ui.WalletCollectQrCodeUI walletCollectQrCodeUI = this.f476627c;
        walletCollectQrCodeUI.M = 1;
        this.f476625a.getClass();
        walletCollectQrCodeUI.U6(this.f476626b, null);
        walletCollectQrCodeUI.A.B();
        walletCollectQrCodeUI.A = null;
    }
}
