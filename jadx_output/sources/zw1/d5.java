package zw1;

/* loaded from: classes15.dex */
public class d5 implements com.tencent.mm.ui.widget.dialog.p3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ww1.a3 f476610a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r45.wf5 f476611b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.collect.ui.WalletCollectQrCodeUI f476612c;

    public d5(com.tencent.mm.plugin.collect.ui.WalletCollectQrCodeUI walletCollectQrCodeUI, ww1.a3 a3Var, r45.wf5 wf5Var) {
        this.f476612c = walletCollectQrCodeUI;
        this.f476610a = a3Var;
        this.f476611b = wf5Var;
    }

    @Override // com.tencent.mm.ui.widget.dialog.p3
    public void a() {
        com.tencent.mm.plugin.collect.ui.WalletCollectQrCodeUI walletCollectQrCodeUI = this.f476612c;
        walletCollectQrCodeUI.M = 1;
        this.f476610a.getClass();
        walletCollectQrCodeUI.U6(this.f476611b, null);
        walletCollectQrCodeUI.A.B();
        walletCollectQrCodeUI.A = null;
    }
}
