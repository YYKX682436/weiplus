package zw1;

/* loaded from: classes15.dex */
public class k5 extends com.tencent.mm.wallet_core.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.o90 f476693d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l81.e1 f476694e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.collect.ui.WalletCollectQrCodeUI f476695f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k5(com.tencent.mm.plugin.collect.ui.WalletCollectQrCodeUI walletCollectQrCodeUI, r45.o90 o90Var, l81.e1 e1Var) {
        super(false);
        this.f476695f = walletCollectQrCodeUI;
        this.f476693d = o90Var;
        this.f476694e = e1Var;
    }

    @Override // com.tencent.mm.wallet_core.ui.z1
    public void onRealClick(android.view.View view) {
        com.tencent.mm.plugin.collect.ui.WalletCollectQrCodeUI walletCollectQrCodeUI = this.f476695f;
        walletCollectQrCodeUI.M = 3;
        walletCollectQrCodeUI.U6(this.f476693d.f382045f, this.f476694e);
    }
}
