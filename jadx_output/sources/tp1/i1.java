package tp1;

/* loaded from: classes15.dex */
public final class i1 extends com.tencent.mm.sdk.event.n {
    public i1() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.autogen.events.OnActivityCreateEvent event = (com.tencent.mm.autogen.events.OnActivityCreateEvent) iEvent;
        kotlin.jvm.internal.o.g(event, "event");
        am.gm gmVar = event.f54561g;
        if (gmVar == null) {
            return false;
        }
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = vp1.b.f438883a;
        android.app.Activity activity = gmVar.f6782a;
        kotlin.jvm.internal.o.f(activity, "activity");
        return false;
    }
}
