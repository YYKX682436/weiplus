package v60;

/* loaded from: classes5.dex */
public class y extends com.tencent.mm.sdk.event.n {
    public y() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.autogen.events.CheckResUpdatePreOperationEvent checkResUpdatePreOperationEvent = (com.tencent.mm.autogen.events.CheckResUpdatePreOperationEvent) iEvent;
        int i17 = checkResUpdatePreOperationEvent.f54055g.f7966a;
        if (i17 != 200) {
            return false;
        }
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        am.t2 t2Var = checkResUpdatePreOperationEvent.f54055g;
        com.tencent.mars.xlog.Log.i("MicroMsg.WxPayGetA8KeyResUpdateOperationListener", "get notify res type:%d subType:%d operation:%d", valueOf, java.lang.Integer.valueOf(t2Var.f7967b), java.lang.Integer.valueOf(t2Var.f7968c));
        if (t2Var.f7968c == 0) {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            v60.w.f433416d = java.lang.System.currentTimeMillis();
            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(2049, 0);
        }
        return true;
    }
}
