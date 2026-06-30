package tp1;

/* loaded from: classes13.dex */
public final class i2 extends com.tencent.mm.sdk.event.n {
    public i2() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.autogen.events.OnStartActivityEvent event = (com.tencent.mm.autogen.events.OnStartActivityEvent) iEvent;
        kotlin.jvm.internal.o.g(event, "event");
        am.en enVar = event.f54585g;
        if (enVar == null) {
            return false;
        }
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = vp1.b.f438883a;
        android.app.Activity activity = enVar.f6564a;
        android.content.Intent intent = enVar.f6565b;
        kotlin.jvm.internal.o.f(intent, "intent");
        long j17 = enVar.f6566c;
        java.util.Iterator it = vp1.b.f438883a.iterator();
        while (it.hasNext()) {
            ((up1.b) it.next()).u(activity, new android.content.Intent(intent), j17);
        }
        return false;
    }
}
