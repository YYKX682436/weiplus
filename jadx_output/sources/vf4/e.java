package vf4;

/* loaded from: classes8.dex */
public class e extends com.tencent.mm.sdk.event.n {
    public e() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.autogen.events.GetJDUrlEvent getJDUrlEvent = (com.tencent.mm.autogen.events.GetJDUrlEvent) iEvent;
        if (getJDUrlEvent == null) {
            return false;
        }
        getJDUrlEvent.f54402g.f6450a = com.tencent.mm.plugin.subapp.jdbiz.q.Di().Ui();
        return false;
    }
}
