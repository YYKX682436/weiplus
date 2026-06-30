package o52;

/* loaded from: classes14.dex */
public final class f extends com.tencent.mm.sdk.event.n {
    public f() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.autogen.events.EnterFinderHomeTaskTypeEvent event = (com.tencent.mm.autogen.events.EnterFinderHomeTaskTypeEvent) iEvent;
        kotlin.jvm.internal.o.g(event, "event");
        am.w4 w4Var = event.f54110g;
        if (w4Var == null) {
            return false;
        }
        v52.c g17 = v52.c.g();
        int i17 = w4Var.f8263b;
        int i18 = w4Var.f8264c;
        g17.f433311g = i17;
        g17.f433312h = i18;
        com.tencent.mars.xlog.Log.i("MicroMsg.IEnterFinderTaskTypeListener", "enterPage " + w4Var.f8262a + ", " + w4Var.f8263b + ' ' + w4Var.f8264c);
        return false;
    }
}
