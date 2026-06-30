package pd0;

/* loaded from: classes8.dex */
public class y1 extends com.tencent.mm.sdk.event.n {
    public y1() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        am.xq xqVar;
        com.tencent.mm.autogen.events.ReportCCDataByFinderEvent reportCCDataByFinderEvent = (com.tencent.mm.autogen.events.ReportCCDataByFinderEvent) iEvent;
        if (reportCCDataByFinderEvent == null || (xqVar = reportCCDataByFinderEvent.f54682g) == null) {
            return false;
        }
        ((ku5.t0) ku5.t0.f312615d).h(new od0.m(xqVar.f8398a), "SIRWorker");
        return false;
    }
}
