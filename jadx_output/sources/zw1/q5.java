package zw1;

/* loaded from: classes15.dex */
public class q5 implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f476766d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.collect.ui.WalletCollectQrCodeUI f476767e;

    public q5(com.tencent.mm.plugin.collect.ui.WalletCollectQrCodeUI walletCollectQrCodeUI, int i17) {
        this.f476767e = walletCollectQrCodeUI;
        this.f476766d = i17;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        this.f476767e.h7(this.f476766d, true);
        return true;
    }
}
