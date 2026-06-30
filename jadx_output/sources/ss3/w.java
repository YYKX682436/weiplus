package ss3;

/* loaded from: classes9.dex */
public class w extends com.tencent.mm.sdk.event.n {
    public w() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.autogen.events.RollbackTencentNewsEvent rollbackTencentNewsEvent = (com.tencent.mm.autogen.events.RollbackTencentNewsEvent) iEvent;
        if (!(rollbackTencentNewsEvent instanceof com.tencent.mm.autogen.events.RollbackTencentNewsEvent)) {
            return false;
        }
        long j17 = rollbackTencentNewsEvent.f54715g.f6606a;
        ss3.d0.Bi(ss3.d0.Di().D0(j17, 20), 20);
        c01.ua Di = ss3.d0.Di();
        Di.getClass();
        java.lang.String str = "reserved2 = " + j17;
        Di.s0(str);
        if (Di.f37510d.A(Di.L0(20), "delete from " + Di.L0(20) + " where " + str)) {
            Di.W0(20);
            Di.doNotify();
        }
        return true;
    }
}
