package g61;

/* loaded from: classes9.dex */
public class f0 extends com.tencent.mm.sdk.event.n {
    public f0() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        int i17;
        com.tencent.mm.autogen.events.WalletQueryAAStatusEvent walletQueryAAStatusEvent = (com.tencent.mm.autogen.events.WalletQueryAAStatusEvent) iEvent;
        java.lang.String str = walletQueryAAStatusEvent.f54967g.f8050a;
        j61.d wi6 = e61.e.wi();
        wi6.getClass();
        java.util.HashMap hashMap = (java.util.HashMap) j61.d.f297877g;
        if (hashMap.containsKey(str)) {
            i17 = ((j61.c) hashMap.get(str)).field_status;
        } else {
            j61.c z07 = wi6.z0(str);
            if (z07 != null) {
                hashMap.put(str, z07);
                i17 = z07.field_status;
            } else {
                i17 = -1;
            }
        }
        walletQueryAAStatusEvent.f54968h.f8163a = i17;
        return false;
    }
}
