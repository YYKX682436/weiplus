package zw1;

/* loaded from: classes15.dex */
public class j5 extends com.tencent.mm.wallet_core.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f476678d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.o90 f476679e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ l81.e1 f476680f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.collect.ui.WalletCollectQrCodeUI f476681g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j5(com.tencent.mm.plugin.collect.ui.WalletCollectQrCodeUI walletCollectQrCodeUI, int i17, r45.o90 o90Var, l81.e1 e1Var) {
        super(false);
        this.f476681g = walletCollectQrCodeUI;
        this.f476678d = i17;
        this.f476679e = o90Var;
        this.f476680f = e1Var;
    }

    @Override // com.tencent.mm.wallet_core.ui.z1
    public void onRealClick(android.view.View view) {
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(25983, 21, java.lang.Integer.valueOf(this.f476678d));
        com.tencent.mm.plugin.collect.ui.WalletCollectQrCodeUI walletCollectQrCodeUI = this.f476681g;
        walletCollectQrCodeUI.M = 3;
        walletCollectQrCodeUI.U6(this.f476679e.f382044e, this.f476680f);
    }
}
