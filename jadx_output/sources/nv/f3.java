package nv;

/* loaded from: classes11.dex */
public class f3 extends com.tencent.mm.sdk.event.n {
    public f3() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.autogen.events.MsgSynchronizeStartEvent msgSynchronizeStartEvent = (com.tencent.mm.autogen.events.MsgSynchronizeStartEvent) iEvent;
        if (msgSynchronizeStartEvent == null || msgSynchronizeStartEvent.f54502g == null) {
            return false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.BackupCore", "receive msgSynchronizeStartEvent.");
        gm0.j1.e().j(new nv.e3(this, msgSynchronizeStartEvent));
        return false;
    }
}
