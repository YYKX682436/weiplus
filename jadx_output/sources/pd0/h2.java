package pd0;

/* loaded from: classes8.dex */
public class h2 extends com.tencent.mm.sdk.event.n {
    public h2() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        am.er erVar = ((com.tencent.mm.autogen.events.ReportSensorDataEvent) iEvent).f54689g;
        java.lang.String str = erVar.f6605b;
        byte[] bArr = erVar.f6604a;
        ((ku5.t0) ku5.t0.f312615d).h(new od0.k(str, bArr), "SIRWorker");
        return false;
    }
}
