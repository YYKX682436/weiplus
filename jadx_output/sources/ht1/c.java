package ht1;

/* loaded from: classes4.dex */
public final class c extends com.tencent.mm.sdk.event.n {
    public c() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.autogen.events.BypNewSyncEvent event = (com.tencent.mm.autogen.events.BypNewSyncEvent) iEvent;
        kotlin.jvm.internal.o.g(event, "event");
        bt1.l lVar = ((bt1.d) ((ct1.t) i95.n0.c(ct1.t.class))).f24147d;
        if (lVar != null) {
            bt1.l.b(lVar, bt1.a.f24144b, bt1.g.f24153f, false, 0, 12, null);
            return true;
        }
        kotlin.jvm.internal.o.o("syncExtension");
        throw null;
    }
}
