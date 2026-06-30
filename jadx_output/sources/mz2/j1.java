package mz2;

/* loaded from: classes9.dex */
public class j1 extends com.tencent.mm.sdk.event.n {
    public j1() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.autogen.events.ReleaseFingerPrintAuthEvent releaseFingerPrintAuthEvent = (com.tencent.mm.autogen.events.ReleaseFingerPrintAuthEvent) iEvent;
        if (!gm0.j1.a()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ReleaseFingerPrintAuthEventListener", "ReleaseFingerPrintAuthEventListener account is not ready");
            return false;
        }
        if (!(releaseFingerPrintAuthEvent instanceof com.tencent.mm.autogen.events.ReleaseFingerPrintAuthEvent)) {
            return false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ReleaseFingerPrintAuthEventListener", "handle ReleaseFingerPrintAuthEventListener");
        if (releaseFingerPrintAuthEvent.f54673g.f7572a) {
            ((nz2.o) gm0.j1.s(nz2.o.class)).cancel();
        } else {
            ((nz2.o) gm0.j1.s(nz2.o.class)).cancel(false);
        }
        return true;
    }
}
