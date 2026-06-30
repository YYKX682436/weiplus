package ju5;

/* loaded from: classes15.dex */
public class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f302104d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ju5.n f302105e;

    public k(ju5.n nVar, int i17) {
        this.f302105e = nVar;
        this.f302104d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        synchronized (this.f302105e.f302128a) {
            ju5.f fVar = (ju5.f) ju5.n.f302127c.get(this.f302104d);
            if (fVar != null) {
                fVar.f();
            }
        }
    }
}
