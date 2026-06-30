package ju5;

/* loaded from: classes15.dex */
public class m implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f302123d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ju5.n f302124e;

    public m(ju5.n nVar, int i17) {
        this.f302124e = nVar;
        this.f302123d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        ju5.f fVar;
        synchronized (this.f302124e.f302128a) {
            fVar = (ju5.f) ju5.n.f302127c.get(this.f302123d);
        }
        if (fVar == null || !(fVar instanceof ju5.a)) {
            return;
        }
        this.f302124e.e(fVar);
    }
}
