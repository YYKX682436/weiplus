package tp1;

/* loaded from: classes13.dex */
public final class a2 extends com.tencent.mm.sdk.event.n {
    public a2() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        androidx.fragment.app.Fragment fragment;
        com.tencent.mm.autogen.events.OnFragmentPauseEvent event = (com.tencent.mm.autogen.events.OnFragmentPauseEvent) iEvent;
        kotlin.jvm.internal.o.g(event, "event");
        am.vm vmVar = event.f54576g;
        if (vmVar == null || (fragment = vmVar.f8202a) == null) {
            return false;
        }
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = vp1.b.f438883a;
        long j17 = vmVar.f8203b;
        java.util.Iterator it = vp1.b.f438883a.iterator();
        while (it.hasNext()) {
            ((up1.b) it.next()).a(fragment, null, j17);
        }
        return false;
    }
}
