package lm5;

/* loaded from: classes16.dex */
public class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gm5.a f319603d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f319604e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.RuntimeException f319605f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ lm5.h f319606g;

    public f(lm5.h hVar, gm5.a aVar, java.lang.Object obj, java.lang.RuntimeException runtimeException) {
        this.f319606g = hVar;
        this.f319603d = aVar;
        this.f319604e = obj;
        this.f319605f = runtimeException;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f319606g.f319608b != null) {
            km5.h hVar = (km5.h) this.f319606g.f319608b;
            hVar.getClass();
            java.lang.ThreadLocal threadLocal = km5.r.f309365b.f309366a;
            java.util.Stack stack = (java.util.Stack) threadLocal.get();
            if (stack == null) {
                stack = new java.util.Stack();
                threadLocal.set(stack);
            }
            stack.push(hVar.f309322a);
        }
        try {
            java.lang.Object call = this.f319603d.call(this.f319604e);
            if (this.f319606g.f319608b != null) {
                km5.h hVar2 = (km5.h) this.f319606g.f319608b;
                hVar2.getClass();
                ((java.util.Stack) km5.r.f309365b.f309366a.get()).pop();
                synchronized (hVar2.f309322a) {
                    km5.q qVar = hVar2.f309322a;
                    km5.m mVar = qVar.f309353o;
                    qVar.f309353o = null;
                    if (!qVar.f309350i) {
                        hVar2.f309322a.A(call);
                    }
                    hVar2.f309322a.getClass();
                    if (hVar2.f309322a.f309346e == km5.p.Interrupted) {
                        jm5.b.b("Vending.Pipeline", "interrupted, just return", new java.lang.Object[0]);
                        return;
                    }
                    if (hVar2.f309322a.f309346e == km5.p.Pausing) {
                        jm5.b.b("Vending.Pipeline", "pausing, just return.", new java.lang.Object[0]);
                        return;
                    }
                    jm5.b.b("Vending.Pipeline", "last one resolved, dequeue next.", new java.lang.Object[0]);
                    hVar2.f309322a.f309346e = km5.p.Resolved;
                    synchronized (hVar2.f309322a) {
                    }
                    hVar2.f309322a.d();
                }
            }
        } catch (java.lang.ClassCastException e17) {
            this.f319605f.initCause(e17);
            throw this.f319605f;
        }
    }
}
