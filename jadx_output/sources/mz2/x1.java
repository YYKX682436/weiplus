package mz2;

/* loaded from: classes7.dex */
public class x1 extends com.tencent.mm.sdk.event.n {
    public x1() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.autogen.events.SupportFingerPrintEvent supportFingerPrintEvent = (com.tencent.mm.autogen.events.SupportFingerPrintEvent) iEvent;
        if (!gm0.j1.a()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SupportFingerPrintEventListener", "SupportFingerPrintEventListener account is not ready");
            return false;
        }
        if (!(supportFingerPrintEvent instanceof com.tencent.mm.autogen.events.SupportFingerPrintEvent)) {
            return false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SupportFingerPrintEventListener", "handle SupportFingerPrintEvent");
        com.tencent.mars.xlog.Log.i("MicroMsg.SupportFingerPrintEventListener", "isSupportFP is " + ((nz2.o) gm0.j1.s(nz2.o.class)).Lf(com.tencent.mm.sdk.platformtools.x2.f193071a));
        supportFingerPrintEvent.getClass();
        java.lang.Runnable runnable = supportFingerPrintEvent.f192364d;
        if (runnable != null) {
            runnable.run();
        }
        return true;
    }
}
