package xa3;

/* loaded from: classes6.dex */
public class g0 extends com.tencent.mm.sdk.event.n {
    public g0() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.autogen.events.FetchStreetViewUrlEvent fetchStreetViewUrlEvent = (com.tencent.mm.autogen.events.FetchStreetViewUrlEvent) iEvent;
        if (!(fetchStreetViewUrlEvent instanceof com.tencent.mm.autogen.events.FetchStreetViewUrlEvent)) {
            return false;
        }
        fetchStreetViewUrlEvent.f54254g.getClass();
        return true;
    }
}
