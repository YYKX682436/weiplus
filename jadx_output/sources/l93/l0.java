package l93;

/* loaded from: classes8.dex */
public final class l0 extends com.tencent.mm.sdk.event.n {
    public l0() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.autogen.events.HomeUITabChangeEvent event = (com.tencent.mm.autogen.events.HomeUITabChangeEvent) iEvent;
        kotlin.jvm.internal.o.g(event, "event");
        am.nh nhVar = event.f54438g;
        if (nhVar.f7425a == 0) {
            return false;
        }
        com.tencent.mars.xlog.Log.i("Finder.GlobalPushNewXmlConsumer", "change tab event tab=" + nhVar.f7425a);
        zy2.s7 Sj = ((c61.l7) i95.n0.c(c61.l7.class)).Sj();
        kotlin.jvm.internal.o.e(Sj, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.conv.FinderGlobalPushNewXmlConsumer");
        ((qb2.r1) Sj).c(500L, qb2.c1.f361181d);
        return false;
    }
}
