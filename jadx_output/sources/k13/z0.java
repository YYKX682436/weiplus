package k13;

/* loaded from: classes10.dex */
public final class z0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f303289d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ k13.l1 f303290e;

    public z0(java.util.List list, k13.l1 l1Var) {
        this.f303289d = list;
        this.f303290e = l1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.Iterator it = kz5.n0.x0(this.f303289d).iterator();
        while (it.hasNext()) {
            this.f303290e.g((i13.c) it.next(), false);
        }
    }
}
