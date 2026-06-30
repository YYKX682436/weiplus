package dt;

/* loaded from: classes11.dex */
public class t5 extends com.tencent.mm.sdk.event.n {
    public t5() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.app.w7 w7Var = com.tencent.mm.app.w7.f53896f;
        am.qu quVar = ((com.tencent.mm.autogen.events.ShowEmailMenuEvent) iEvent).f54782g;
        com.tencent.mm.pluginsdk.ui.span.u0.c(quVar.f7744a, quVar.f7745b, null);
        return true;
    }
}
