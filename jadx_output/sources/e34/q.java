package e34;

/* loaded from: classes8.dex */
public class q extends com.tencent.mm.sdk.event.n {
    public q() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.autogen.events.SwitcherEvent switcherEvent = (com.tencent.mm.autogen.events.SwitcherEvent) iEvent;
        if (!switcherEvent.f54874g.f6713b.equals(com.tencent.mm.autogen.events.ShakeMessageStorageNotifyEvent.class.getName())) {
            return false;
        }
        if (switcherEvent.f54874g.f6712a == 1) {
            ((c34.h0) i95.n0.c(c34.h0.class)).f38199m.c();
            return false;
        }
        ((c34.h0) i95.n0.c(c34.h0.class)).f38199m.d();
        return false;
    }
}
