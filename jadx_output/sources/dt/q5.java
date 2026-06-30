package dt;

/* loaded from: classes11.dex */
public class q5 extends com.tencent.mm.sdk.event.n {
    public q5() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.app.w7 w7Var = com.tencent.mm.app.w7.f53896f;
        am.au auVar = ((com.tencent.mm.autogen.events.SetLocalQQMobileEvent) iEvent).f54766g;
        com.tencent.mm.ui.contact.g1.c(auVar.f6187a, auVar.f6188b);
        return false;
    }
}
