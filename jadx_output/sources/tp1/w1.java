package tp1;

/* loaded from: classes13.dex */
public final class w1 extends com.tencent.mm.sdk.event.n {
    public w1() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.autogen.events.OnFragmentCreateEvent event = (com.tencent.mm.autogen.events.OnFragmentCreateEvent) iEvent;
        kotlin.jvm.internal.o.g(event, "event");
        am.tm tmVar = event.f54574g;
        if (tmVar == null) {
            return false;
        }
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = vp1.b.f438883a;
        androidx.fragment.app.Fragment fragment = tmVar.f8019a;
        kotlin.jvm.internal.o.f(fragment, "fragment");
        java.lang.String str = tmVar.f8020b;
        java.lang.String str2 = str == null ? "" : str;
        java.lang.String str3 = tmVar.f8021c;
        java.lang.String str4 = str3 == null ? "" : str3;
        boolean z17 = tmVar.f8022d;
        long j17 = tmVar.f8023e;
        java.util.Iterator it = vp1.b.f438883a.iterator();
        while (it.hasNext()) {
            ((up1.b) it.next()).k(fragment, str2, str4, z17, null, j17);
        }
        return false;
    }
}
