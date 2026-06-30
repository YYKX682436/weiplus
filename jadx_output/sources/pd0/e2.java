package pd0;

/* loaded from: classes11.dex */
public class e2 extends com.tencent.mm.sdk.event.n {
    public e2() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        am.dr drVar = ((com.tencent.mm.autogen.events.ReportScreenRecordInfoEvent) iEvent).f54688g;
        int i17 = drVar.f6491a;
        java.lang.String str = drVar.f6493c;
        long j17 = drVar.f6494d;
        int i18 = drVar.f6495e;
        java.lang.String str2 = drVar.f6492b;
        ((ku5.t0) ku5.t0.f312615d).h(new od0.n(i17, str, j17, i18, str2), "SIRWorker");
        return false;
    }
}
