package f81;

/* loaded from: classes5.dex */
public class o extends com.tencent.mm.sdk.event.n {
    public o() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.autogen.events.RevokeMsgEvent revokeMsgEvent = (com.tencent.mm.autogen.events.RevokeMsgEvent) iEvent;
        if (com.tencent.mm.sdk.platformtools.t8.K0(revokeMsgEvent.f54713g.f6399f)) {
            return false;
        }
        am.cs csVar = revokeMsgEvent.f54713g;
        c01.v1.G(csVar.f6396c.Q0(), csVar.f6399f);
        com.tencent.mm.plugin.announcement.x.wi(csVar.f6394a);
        return false;
    }
}
