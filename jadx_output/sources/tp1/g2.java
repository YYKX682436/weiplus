package tp1;

/* loaded from: classes13.dex */
public final class g2 extends com.tencent.mm.sdk.event.n {
    public g2() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.autogen.events.OnMoveTaskToBackEvent event = (com.tencent.mm.autogen.events.OnMoveTaskToBackEvent) iEvent;
        kotlin.jvm.internal.o.g(event, "event");
        am.zm zmVar = event.f54580g;
        if (zmVar == null) {
            return false;
        }
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = vp1.b.f438883a;
        android.app.Activity activity = zmVar.f8591a;
        kotlin.jvm.internal.o.f(activity, "activity");
        boolean z17 = zmVar.f8592b;
        long j17 = zmVar.f8593c;
        java.util.Iterator it = vp1.b.f438883a.iterator();
        while (it.hasNext()) {
            ((up1.b) it.next()).i(activity, z17, null, j17);
        }
        return false;
    }
}
