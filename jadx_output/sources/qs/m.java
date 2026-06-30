package qs;

/* loaded from: classes15.dex */
public class m extends com.tencent.mm.sdk.event.n {
    public m() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.autogen.events.SessionChangeEvent sessionChangeEvent = (com.tencent.mm.autogen.events.SessionChangeEvent) iEvent;
        z71.i iVar = (z71.i) i95.n0.c(z71.i.class);
        iVar.getClass();
        if (sessionChangeEvent == null) {
            return false;
        }
        am.rt rtVar = sessionChangeEvent.f54757g;
        if (rtVar.f7842c != 0) {
            return false;
        }
        iVar.wi(rtVar.f7840a, rtVar.f7841b);
        return false;
    }
}
