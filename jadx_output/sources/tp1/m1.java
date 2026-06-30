package tp1;

/* loaded from: classes13.dex */
public final class m1 extends com.tencent.mm.sdk.event.n {
    public m1() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.autogen.events.OnActivityFinishEvent event = (com.tencent.mm.autogen.events.OnActivityFinishEvent) iEvent;
        kotlin.jvm.internal.o.g(event, "event");
        am.im imVar = event.f54563g;
        if (imVar == null) {
            return false;
        }
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = vp1.b.f438883a;
        android.app.Activity activity = imVar.f6960a;
        kotlin.jvm.internal.o.f(activity, "activity");
        long j17 = imVar.f6961b;
        java.util.Iterator it = vp1.b.f438883a.iterator();
        while (it.hasNext()) {
            ((up1.b) it.next()).B(activity, null, j17);
        }
        return false;
    }
}
