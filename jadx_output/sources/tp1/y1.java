package tp1;

/* loaded from: classes13.dex */
public final class y1 extends com.tencent.mm.sdk.event.n {
    public y1() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.autogen.events.OnFragmentDestroyEvent event = (com.tencent.mm.autogen.events.OnFragmentDestroyEvent) iEvent;
        kotlin.jvm.internal.o.g(event, "event");
        am.um umVar = event.f54575g;
        if (umVar == null) {
            return false;
        }
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = vp1.b.f438883a;
        androidx.fragment.app.Fragment fragment = umVar.f8106a;
        kotlin.jvm.internal.o.f(fragment, "fragment");
        long j17 = umVar.f8107b;
        java.util.Iterator it = vp1.b.f438883a.iterator();
        while (it.hasNext()) {
            ((up1.b) it.next()).z(fragment, null, j17);
        }
        return false;
    }
}
