package dt;

/* loaded from: classes12.dex */
public class f6 extends com.tencent.mm.sdk.event.n {
    public f6() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.app.w7 w7Var = com.tencent.mm.app.w7.f53896f;
        if (((com.tencent.mm.autogen.events.TraceOperationEvent) iEvent).f54900g.f6714a != 3) {
            return false;
        }
        com.tencent.mm.booter.NotifyReceiver.c();
        return false;
    }
}
