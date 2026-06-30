package xr4;

/* loaded from: classes9.dex */
public class f extends com.tencent.mm.sdk.event.n {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.wallet_core.g f456234d;

    public f() {
        super(0);
        this.f456234d = new xr4.e(this);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("key_balance_fetch_scene", 1);
        com.tencent.mm.wallet_core.a.j((android.app.Activity) ((com.tencent.mm.autogen.events.WCPayStartBalanceFetchEvent) iEvent).f54949g.f6301a, qr4.h.class, bundle, this.f456234d);
        return false;
    }
}
