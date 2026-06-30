package tp1;

/* loaded from: classes13.dex */
public final class o1 extends com.tencent.mm.sdk.event.n {
    public o1() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.autogen.events.OnActivityNewIntentEvent event = (com.tencent.mm.autogen.events.OnActivityNewIntentEvent) iEvent;
        kotlin.jvm.internal.o.g(event, "event");
        am.jm jmVar = event.f54564g;
        if (jmVar == null) {
            return false;
        }
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = vp1.b.f438883a;
        android.app.Activity activity = jmVar.f7049a;
        kotlin.jvm.internal.o.f(activity, "activity");
        android.content.Intent intent = jmVar.f7050b;
        kotlin.jvm.internal.o.f(intent, "intent");
        long j17 = jmVar.f7051c;
        java.util.Iterator it = vp1.b.f438883a.iterator();
        while (it.hasNext()) {
            ((up1.b) it.next()).p(activity, new android.content.Intent(intent), j17);
        }
        return false;
    }
}
