package lz2;

/* loaded from: classes9.dex */
public class e extends com.tencent.mm.wallet_core.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fingerprint.faceid.auth.WalletFaceIdAuthUI f322334d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(com.tencent.mm.plugin.fingerprint.faceid.auth.WalletFaceIdAuthUI walletFaceIdAuthUI) {
        super(false);
        this.f322334d = walletFaceIdAuthUI;
    }

    @Override // com.tencent.mm.wallet_core.ui.z1
    public void onRealClick(android.view.View view) {
        this.f322334d.f136982e.e();
    }
}
