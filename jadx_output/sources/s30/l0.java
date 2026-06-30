package s30;

/* loaded from: classes12.dex */
public class l0 extends com.tencent.mm.sdk.event.n {
    public l0() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        am.ji jiVar;
        com.tencent.mm.autogen.events.KvReportEvent kvReportEvent = (com.tencent.mm.autogen.events.KvReportEvent) iEvent;
        g62.b bVar = (g62.b) i95.n0.c(g62.b.class);
        bVar.getClass();
        if (kvReportEvent == null || (jiVar = kvReportEvent.f54460g) == null) {
            return false;
        }
        long j17 = jiVar.f7033a;
        if (j17 == 18762 || j17 == 11108 || j17 == 11110 || !com.tencent.mm.sdk.platformtools.x2.n()) {
            return false;
        }
        ((ku5.t0) ku5.t0.f312615d).h(new g62.a(bVar, kvReportEvent), "callbackOfKvReportEvent_tasks");
        return false;
    }
}
