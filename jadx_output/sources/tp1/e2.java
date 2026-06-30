package tp1;

/* loaded from: classes13.dex */
public final class e2 extends com.tencent.mm.sdk.event.n {
    public e2() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.autogen.events.OnHellFrontBackEvent event = (com.tencent.mm.autogen.events.OnHellFrontBackEvent) iEvent;
        kotlin.jvm.internal.o.g(event, "event");
        am.xm xmVar = event.f54578g;
        if (xmVar == null) {
            return false;
        }
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = vp1.b.f438883a;
        java.lang.String activity = xmVar.f8385b;
        kotlin.jvm.internal.o.f(activity, "activity");
        int i17 = xmVar.f8387d;
        long j17 = xmVar.f8386c;
        int i18 = xmVar.f8384a;
        java.util.Iterator it = vp1.b.f438883a.iterator();
        while (it.hasNext()) {
            ((up1.b) it.next()).G(activity, i17, j17, i18);
        }
        return false;
    }
}
