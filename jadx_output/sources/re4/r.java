package re4;

/* loaded from: classes.dex */
public class r extends com.tencent.mm.sdk.event.n {
    public r() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.autogen.events.GetIsSupportSoterEvent getIsSupportSoterEvent = (com.tencent.mm.autogen.events.GetIsSupportSoterEvent) iEvent;
        if (getIsSupportSoterEvent instanceof com.tencent.mm.autogen.events.GetIsSupportSoterEvent) {
            com.tencent.mars.xlog.Log.i("MicroMsg.GetSoterSupportEventListener", "hy: request is support soter");
            com.tencent.mars.xlog.Log.i("MicroMsg.GetSoterSupportEventListener", "isSupportSoter: %b", java.lang.Boolean.valueOf(re4.g0.c()));
            if (re4.g0.c()) {
                getIsSupportSoterEvent.f54401g.f6352a = 1;
            } else {
                getIsSupportSoterEvent.f54401g.f6352a = 0;
            }
        }
        return true;
    }
}
