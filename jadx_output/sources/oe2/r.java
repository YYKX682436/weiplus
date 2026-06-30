package oe2;

/* loaded from: classes8.dex */
public final class r extends com.tencent.mm.sdk.event.n {
    public r() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.autogen.events.FeedUpdateEvent event = (com.tencent.mm.autogen.events.FeedUpdateEvent) iEvent;
        kotlin.jvm.internal.o.g(event, "event");
        am.ia iaVar = event.f54252g;
        if (iaVar.f6919b != 8 || iaVar.f6925h != 2) {
            return false;
        }
        long j17 = iaVar.f6918a;
        oe2.x xVar = oe2.x.f344786a;
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveTipsBarDataEventReceiver", "liveEndListener recv liveId:".concat(pm0.v.u(j17)));
        rl2.v b17 = oe2.x.b(oe2.x.f344786a);
        if (b17 == null) {
            return false;
        }
        b17.z0(j17, true);
        return false;
    }
}
