package nv;

/* loaded from: classes11.dex */
public class k2 extends com.tencent.mm.sdk.event.n {
    public k2() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        qn1.c.i().c(java.lang.Boolean.valueOf(((com.tencent.mm.autogen.events.BackupProcessMgrExitEvent) iEvent).f53993g.f6990a));
        return false;
    }
}
