package dt;

/* loaded from: classes.dex */
public class w5 extends com.tencent.mm.sdk.event.n {
    public w5() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.app.w7 w7Var = com.tencent.mm.app.w7.f53896f;
        am.ru ruVar = ((com.tencent.mm.autogen.events.ShowPhoneMenuEvent) iEvent).f54783g;
        com.tencent.mm.pluginsdk.ui.span.u0.d(ruVar.f7843a, ruVar.f7844b, ruVar.f7845c, ruVar.f7846d);
        return true;
    }
}
