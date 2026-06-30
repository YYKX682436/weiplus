package zw1;

/* loaded from: classes3.dex */
public class i4 extends com.tencent.mm.wallet_core.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f476664d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i4(com.tencent.mm.plugin.collect.ui.WalletCollectQrCodeUI walletCollectQrCodeUI, java.lang.String str) {
        super(false);
        this.f476664d = str;
    }

    @Override // com.tencent.mm.wallet_core.ui.z1
    public void onRealClick(android.view.View view) {
        java.lang.String str = this.f476664d;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return;
        }
        com.tencent.mm.wallet_core.ui.r1.V(com.tencent.mm.sdk.platformtools.x2.f193071a, str, true);
    }
}
