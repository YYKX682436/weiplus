package ht1;

/* loaded from: classes4.dex */
public final class e extends com.tencent.mm.sdk.event.n {
    public e() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.autogen.events.BypNotifyEvent event = (com.tencent.mm.autogen.events.BypNotifyEvent) iEvent;
        kotlin.jvm.internal.o.g(event, "event");
        bt1.l lVar = ((bt1.d) ((ct1.t) i95.n0.c(ct1.t.class))).f24147d;
        if (lVar == null) {
            kotlin.jvm.internal.o.o("syncExtension");
            throw null;
        }
        java.util.LinkedList selector = event.f54020g.f7115a.f381610d;
        kotlin.jvm.internal.o.f(selector, "selector");
        bt1.l.b(lVar, selector, bt1.g.f24154g, false, 0, 12, null);
        return true;
    }
}
