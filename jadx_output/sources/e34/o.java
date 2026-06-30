package e34;

/* loaded from: classes7.dex */
public class o extends com.tencent.mm.sdk.event.n {
    public o() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.autogen.events.ReportClickFindFriendShakeEvent reportClickFindFriendShakeEvent = (com.tencent.mm.autogen.events.ReportClickFindFriendShakeEvent) iEvent;
        if (!(reportClickFindFriendShakeEvent instanceof com.tencent.mm.autogen.events.ReportClickFindFriendShakeEvent)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.OnReportClickFindFriendShake", "mismatch event listener for ReportClickFindFriendShakeEvent");
            return false;
        }
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        reportClickFindFriendShakeEvent.f54683g.getClass();
        g0Var.d(10221, 1);
        return false;
    }
}
