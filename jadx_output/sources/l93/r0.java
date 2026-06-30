package l93;

/* loaded from: classes8.dex */
public final class r0 extends com.tencent.mm.sdk.event.n {
    public r0() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.autogen.events.VoipEvent event = (com.tencent.mm.autogen.events.VoipEvent) iEvent;
        kotlin.jvm.internal.o.g(event, "event");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("VoipEvent=");
        am.y00 y00Var = event.f54945g;
        sb6.append(y00Var.f8415b);
        com.tencent.mars.xlog.Log.i("Finder.GlobalPushNewXmlConsumer", sb6.toString());
        if (y00Var.f8415b != 11) {
            return false;
        }
        zy2.s7 Sj = ((c61.l7) i95.n0.c(c61.l7.class)).Sj();
        kotlin.jvm.internal.o.e(Sj, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.conv.FinderGlobalPushNewXmlConsumer");
        ((qb2.r1) Sj).c(500L, qb2.c1.f361183f);
        return false;
    }
}
