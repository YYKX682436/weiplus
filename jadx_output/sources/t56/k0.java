package t56;

/* loaded from: classes16.dex */
public abstract class k0 extends java.util.concurrent.atomic.AtomicReference implements p56.s {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f415897d = 0;

    public k0() {
        super(t56.l0.f415898h);
    }

    public abstract p56.s a(p56.p pVar);

    @Override // p56.s
    public boolean b() {
        return ((p56.s) get()).b();
    }

    @Override // p56.s
    public void c() {
        p56.s sVar;
        p56.s sVar2 = t56.l0.f415898h;
        a66.f fVar = a66.g.f1801a;
        do {
            sVar = (p56.s) get();
            p56.s sVar3 = t56.l0.f415898h;
            if (sVar == fVar) {
                return;
            }
        } while (!compareAndSet(sVar, fVar));
        if (sVar != t56.l0.f415898h) {
            sVar.c();
        }
    }
}
