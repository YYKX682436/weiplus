package tp1;

/* loaded from: classes15.dex */
public final class k1 extends com.tencent.mm.sdk.event.n {
    public k1() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.autogen.events.OnActivityDestroyEvent event = (com.tencent.mm.autogen.events.OnActivityDestroyEvent) iEvent;
        kotlin.jvm.internal.o.g(event, "event");
        am.hm hmVar = event.f54562g;
        if (hmVar == null) {
            return false;
        }
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = vp1.b.f438883a;
        android.app.Activity activity = hmVar.f6843a;
        kotlin.jvm.internal.o.f(activity, "activity");
        return false;
    }
}
