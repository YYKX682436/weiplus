package pd5;

/* loaded from: classes.dex */
public final class i extends com.tencent.mm.sdk.event.n {
    public i() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.autogen.events.ConfigUpdatedEvent event = (com.tencent.mm.autogen.events.ConfigUpdatedEvent) iEvent;
        kotlin.jvm.internal.o.g(event, "event");
        java.util.List list = pd5.l.f353582d;
        am.k3 k3Var = event.f54072g;
        if (!((java.util.ArrayList) list).contains(k3Var.f7126a)) {
            return false;
        }
        java.util.Map map = pd5.l.f353583e;
        java.lang.String configName = k3Var.f7126a;
        kotlin.jvm.internal.o.f(configName, "configName");
        map.put(configName, java.lang.Integer.valueOf(j62.e.g().i(k3Var.f7126a, 0, true, true)));
        return true;
    }
}
