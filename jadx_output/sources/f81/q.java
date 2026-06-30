package f81;

/* loaded from: classes5.dex */
public class q extends com.tencent.mm.sdk.event.n {
    public q() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.autogen.events.RevokeNativeMsgEvent revokeNativeMsgEvent = (com.tencent.mm.autogen.events.RevokeNativeMsgEvent) iEvent;
        if (com.tencent.mm.sdk.platformtools.t8.K0(revokeNativeMsgEvent.f54714g.f6497b)) {
            return false;
        }
        com.tencent.mm.plugin.announcement.x.wi(revokeNativeMsgEvent.f54714g.f6496a);
        return false;
    }
}
