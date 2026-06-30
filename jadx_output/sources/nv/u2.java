package nv;

/* loaded from: classes6.dex */
public class u2 extends com.tencent.mm.sdk.event.n {
    public u2() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.autogen.events.BackupUSBStopActionEvent backupUSBStopActionEvent = (com.tencent.mm.autogen.events.BackupUSBStopActionEvent) iEvent;
        if (backupUSBStopActionEvent == null) {
            return false;
        }
        backupUSBStopActionEvent.f53995g.getClass();
        throw null;
    }
}
