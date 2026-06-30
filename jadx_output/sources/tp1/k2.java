package tp1;

/* loaded from: classes8.dex */
public final class k2 extends com.tencent.mm.sdk.event.n {
    public k2() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.autogen.events.OnStartPageLifecycleMonitorEvent event = (com.tencent.mm.autogen.events.OnStartPageLifecycleMonitorEvent) iEvent;
        kotlin.jvm.internal.o.g(event, "event");
        if (!com.tencent.mm.sdk.platformtools.x2.n() && !com.tencent.mm.sdk.platformtools.x2.j()) {
            return false;
        }
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = vp1.b.f438883a;
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        if (vp1.b.f438884b == null) {
            android.content.Context applicationContext = context.getApplicationContext();
            android.app.Application application = applicationContext instanceof android.app.Application ? (android.app.Application) applicationContext : null;
            if (application != null) {
                vp1.a aVar = new vp1.a();
                vp1.b.f438884b = aVar;
                application.registerActivityLifecycleCallbacks(aVar);
            }
        }
        vp1.i iVar = vp1.i.f438889a;
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList2 = vp1.b.f438883a;
        if (copyOnWriteArrayList2.contains(iVar)) {
            return false;
        }
        copyOnWriteArrayList2.add(iVar);
        return false;
    }
}
