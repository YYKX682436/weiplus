package vc0;

/* loaded from: classes10.dex */
public final class l extends com.tencent.mm.sdk.event.n {
    public l() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.autogen.events.GetNewContactEvent event = (com.tencent.mm.autogen.events.GetNewContactEvent) iEvent;
        kotlin.jvm.internal.o.g(event, "event");
        if (!gm0.j1.a()) {
            return false;
        }
        am.gg ggVar = event.f54405g;
        vc0.a.f434892a = ggVar.f6760a;
        java.util.ArrayList a17 = com.tencent.mm.contact.b.a(ggVar.f6761b);
        if (a17 == null || a17.size() <= 0) {
            return false;
        }
        i21.n nVar = i21.p.f287911a;
        com.tencent.mm.sdk.coroutines.LifecycleScope lifecycleScope = gm0.j1.b().f273245h.f273145e;
        kotlin.jvm.internal.o.d(lifecycleScope);
        nVar.b(a17, lifecycleScope, new vc0.k());
        return false;
    }
}
