package vo3;

/* loaded from: classes9.dex */
public class d0 extends com.tencent.mm.sdk.event.n {
    public d0() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.autogen.events.WalletOfflineSetCardSerialEvent walletOfflineSetCardSerialEvent = (com.tencent.mm.autogen.events.WalletOfflineSetCardSerialEvent) iEvent;
        if (com.tencent.mm.sdk.platformtools.t8.K0(walletOfflineSetCardSerialEvent.f54963g.f7687a)) {
            return false;
        }
        yo3.m.s(walletOfflineSetCardSerialEvent.f54963g.f7687a);
        return false;
    }
}
