package ht1;

/* loaded from: classes4.dex */
public final class g extends com.tencent.mm.sdk.event.n {
    public g() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        yz5.a aVar;
        com.tencent.mm.autogen.events.BypNotifyActionEvent event = (com.tencent.mm.autogen.events.BypNotifyActionEvent) iEvent;
        kotlin.jvm.internal.o.g(event, "event");
        com.tencent.mars.xlog.Log.i("BypSyncNewNotifyEventListener", "Get a BypNotifyActionEvent notifyAction=" + event.f54019g.f6992a);
        if (event.f54019g.f6992a == 2) {
            r45.lq lqVar = new r45.lq();
            lqVar.parseFrom(event.f54019g.f6993b);
            com.tencent.mars.xlog.Log.i("BypSyncNewNotifyEventListener", "Get a BypNotifyActionEvent sync_all_selector=" + lqVar.f379714f + ", selector=" + lqVar.f379712d);
            if (lqVar.f379712d.contains(1)) {
                qx.a aVar2 = qx.a.f367240a;
                if (!qx.a.f367242c && !qx.a.f367241b) {
                    synchronized (aVar2) {
                        if (!qx.a.f367242c) {
                            if (!qx.a.f367241b) {
                                qx.a.f367241b = true;
                                boolean z17 = qx.a.f367243d != null;
                                if (z17 && (aVar = qx.a.f367243d) != null) {
                                    aVar.invoke();
                                }
                            }
                        }
                    }
                }
            }
            if (lqVar.f379714f) {
                com.tencent.mars.xlog.Log.i("BypSyncNewNotifyEventListener", "sync_all_selector true");
                bt1.l lVar = ((bt1.d) ((ct1.t) i95.n0.c(ct1.t.class))).f24147d;
                if (lVar == null) {
                    kotlin.jvm.internal.o.o("syncExtension");
                    throw null;
                }
                bt1.l.b(lVar, bt1.a.f24144b, bt1.g.f24154g, false, 0, 12, null);
            } else {
                bt1.l lVar2 = ((bt1.d) ((ct1.t) i95.n0.c(ct1.t.class))).f24147d;
                if (lVar2 == null) {
                    kotlin.jvm.internal.o.o("syncExtension");
                    throw null;
                }
                java.util.LinkedList selector = lqVar.f379712d;
                kotlin.jvm.internal.o.f(selector, "selector");
                bt1.l.b(lVar2, selector, bt1.g.f24154g, false, 0, 12, null);
            }
        }
        return true;
    }
}
