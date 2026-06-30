package tp1;

/* loaded from: classes15.dex */
public final class s1 extends com.tencent.mm.sdk.event.n {
    public s1() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.autogen.events.OnActivityResumeEvent event = (com.tencent.mm.autogen.events.OnActivityResumeEvent) iEvent;
        kotlin.jvm.internal.o.g(event, "event");
        am.lm lmVar = event.f54566g;
        if (lmVar == null) {
            return false;
        }
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = vp1.b.f438883a;
        android.app.Activity activity = lmVar.f7251a;
        kotlin.jvm.internal.o.f(activity, "activity");
        return false;
    }
}
