package tp1;

/* loaded from: classes15.dex */
public final class q1 extends com.tencent.mm.sdk.event.n {
    public q1() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.autogen.events.OnActivityPauseEvent event = (com.tencent.mm.autogen.events.OnActivityPauseEvent) iEvent;
        kotlin.jvm.internal.o.g(event, "event");
        am.km kmVar = event.f54565g;
        if (kmVar == null) {
            return false;
        }
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = vp1.b.f438883a;
        android.app.Activity activity = kmVar.f7170a;
        kotlin.jvm.internal.o.f(activity, "activity");
        return false;
    }
}
