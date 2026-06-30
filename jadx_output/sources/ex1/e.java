package ex1;

/* loaded from: classes12.dex */
public class e extends com.tencent.mm.sdk.event.n {
    public e() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.autogen.events.VoipCallEvent voipCallEvent = (com.tencent.mm.autogen.events.VoipCallEvent) iEvent;
        if (voipCallEvent instanceof com.tencent.mm.autogen.events.VoipCallEvent) {
            if (gm0.j1.h()) {
                am.u00 u00Var = voipCallEvent.f54941g;
                com.tencent.mm.autogen.events.VoipEvent voipEvent = new com.tencent.mm.autogen.events.VoipEvent();
                voipEvent.f54945g.f8415b = 2;
                voipEvent.e();
                u00Var.f8049a = voipEvent.f54946h.f8501b || iq.b.H();
            } else {
                com.tencent.mm.app.p5.c("MicroMsg.VoipCallingListener", "[-] MMKernel is not initialized, cannot check status of voip.", new java.lang.Object[0]);
                voipCallEvent.f54941g.f8049a = false;
            }
        }
        return false;
    }
}
