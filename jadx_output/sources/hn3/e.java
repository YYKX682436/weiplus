package hn3;

/* loaded from: classes7.dex */
public final class e extends com.tencent.mm.sdk.event.n {
    public e() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.autogen.events.AlbumSelectImageChangeEvent event = (com.tencent.mm.autogen.events.AlbumSelectImageChangeEvent) iEvent;
        kotlin.jvm.internal.o.g(event, "event");
        am.n nVar = event.f53974g;
        if (nVar.f7383b != 36) {
            return false;
        }
        java.util.Map map = qn3.b.f365236a;
        java.lang.String imagePath = nVar.f7382a;
        kotlin.jvm.internal.o.f(imagePath, "imagePath");
        com.tencent.mm.sdk.coroutines.LifecycleScope lifecycleScope = gm0.j1.b().f273245h.f273145e;
        if (lifecycleScope == null) {
            return true;
        }
        v65.i.b(lifecycleScope, null, new qn3.a(imagePath, null), 1, null);
        return true;
    }
}
