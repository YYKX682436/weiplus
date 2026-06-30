package ln0;

/* loaded from: classes10.dex */
public final class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ln0.p f319644d;

    public c(ln0.p pVar) {
        this.f319644d = pVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.Map map = this.f319644d.f319672a;
        kotlin.jvm.internal.o.f(map, "access$getP2pParamsMap$p(...)");
        ln0.p pVar = this.f319644d;
        synchronized (map) {
            java.util.Iterator it = pVar.f319672a.keySet().iterator();
            while (it.hasNext()) {
                pVar.h((java.lang.String) it.next());
            }
        }
    }
}
