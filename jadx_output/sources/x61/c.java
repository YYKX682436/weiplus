package x61;

/* loaded from: classes8.dex */
public class c extends com.tencent.mm.sdk.event.n {
    public c() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.autogen.events.CheckCanSyncAddrBookEvent checkCanSyncAddrBookEvent = (com.tencent.mm.autogen.events.CheckCanSyncAddrBookEvent) iEvent;
        if (!(checkCanSyncAddrBookEvent instanceof com.tencent.mm.autogen.events.CheckCanSyncAddrBookEvent)) {
            return false;
        }
        checkCanSyncAddrBookEvent.f54047g.f7219a = r61.q0.a();
        return false;
    }
}
