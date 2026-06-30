package tp1;

/* loaded from: classes15.dex */
public final class u1 extends com.tencent.mm.sdk.event.n {
    public u1() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.autogen.events.OnActivityStopEvent event = (com.tencent.mm.autogen.events.OnActivityStopEvent) iEvent;
        kotlin.jvm.internal.o.g(event, "event");
        am.mm mmVar = event.f54567g;
        if (mmVar == null) {
            return false;
        }
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = vp1.b.f438883a;
        android.app.Activity activity = mmVar.f7354a;
        kotlin.jvm.internal.o.f(activity, "activity");
        return false;
    }
}
