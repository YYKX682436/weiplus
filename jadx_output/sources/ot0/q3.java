package ot0;

/* loaded from: classes9.dex */
public final class q3 extends com.tencent.mm.sdk.event.n {
    public q3() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.autogen.events.AppMsgInsertEvent event = (com.tencent.mm.autogen.events.AppMsgInsertEvent) iEvent;
        kotlin.jvm.internal.o.g(event, "event");
        com.tencent.mm.storage.f9 f9Var = event.f53988g.f6201a;
        if (f9Var == null) {
            return true;
        }
        if (f9Var.Q0() == null || !com.tencent.mm.storage.z3.j4(f9Var.Q0())) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppMsgInsertEventListener", "doReportReceiveAppMsgFromNotifyMessage not from notifymessage and ignore");
            return true;
        }
        ((ku5.t0) ku5.t0.f312615d).b(new ot0.p3(this, f9Var), "ReportAppMsg");
        return true;
    }
}
