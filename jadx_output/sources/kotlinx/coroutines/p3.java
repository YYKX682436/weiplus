package kotlinx.coroutines;

/* loaded from: classes14.dex */
public final class p3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final kotlinx.coroutines.p0 f310565d;

    /* renamed from: e, reason: collision with root package name */
    public final kotlinx.coroutines.q f310566e;

    public p3(kotlinx.coroutines.p0 p0Var, kotlinx.coroutines.q qVar) {
        this.f310565d = p0Var;
        this.f310566e = qVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        ((kotlinx.coroutines.r) this.f310566e).u(this.f310565d, jz5.f0.f302826a);
    }
}
