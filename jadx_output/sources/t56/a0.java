package t56;

/* loaded from: classes16.dex */
public final class a0 extends java.util.concurrent.atomic.AtomicBoolean implements p56.s {

    /* renamed from: d, reason: collision with root package name */
    public final t56.c0 f415851d;

    /* renamed from: e, reason: collision with root package name */
    public final u56.o f415852e;

    public a0(t56.c0 c0Var, u56.o oVar) {
        this.f415851d = c0Var;
        this.f415852e = oVar;
    }

    @Override // p56.s
    public boolean b() {
        return this.f415851d.f415862d.f424839e;
    }

    @Override // p56.s
    public void c() {
        if (compareAndSet(false, true)) {
            u56.o oVar = this.f415852e;
            t56.c0 c0Var = this.f415851d;
            if (oVar.f424839e) {
                return;
            }
            synchronized (oVar) {
                java.util.List list = oVar.f424838d;
                if (!oVar.f424839e && list != null) {
                    boolean remove = list.remove(c0Var);
                    if (remove) {
                        c0Var.c();
                    }
                }
            }
        }
    }
}
