package ps4;

/* loaded from: classes9.dex */
public class e implements com.tencent.mm.wallet_core.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ps4.g f358149a;

    public e(ps4.g gVar) {
        this.f358149a = gVar;
    }

    @Override // com.tencent.mm.wallet_core.g
    public android.content.Intent onProcessEnd(int i17, android.os.Bundle bundle) {
        ps4.g gVar = this.f358149a;
        o05.k kVar = gVar.f358151d;
        if (kVar != null) {
            ((com.tencent.mm.plugin.finder.feed.ui.ic) kVar).getClass();
            com.tencent.mm.autogen.events.WalletRealNameResultNotifyEvent walletRealNameResultNotifyEvent = new com.tencent.mm.autogen.events.WalletRealNameResultNotifyEvent();
            walletRealNameResultNotifyEvent.f54973g.f6120a = i17;
            walletRealNameResultNotifyEvent.e();
        }
        gVar.f358151d = null;
        return null;
    }
}
