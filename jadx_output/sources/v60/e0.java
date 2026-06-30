package v60;

/* loaded from: classes5.dex */
public final class e0 extends com.tencent.mm.sdk.event.n {
    public e0() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.autogen.events.CheckResUpdatePreOperationEvent event = (com.tencent.mm.autogen.events.CheckResUpdatePreOperationEvent) iEvent;
        kotlin.jvm.internal.o.g(event, "event");
        am.t2 t2Var = event.f54055g;
        int i17 = t2Var.f7966a;
        if (i17 != 216) {
            return false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WxPayWPHKUrlResUpdateOperationListener", "get notify res type:%d subType:%d operation:%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(t2Var.f7967b), java.lang.Integer.valueOf(t2Var.f7968c));
        if (t2Var.f7968c != 0) {
            return false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WxPayWPHKUrlResUpdateOperationListener", "report get res update");
        com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1882, 113);
        return false;
    }
}
