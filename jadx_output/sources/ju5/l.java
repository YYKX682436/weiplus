package ju5;

/* loaded from: classes15.dex */
public class l implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f302121d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ju5.n f302122e;

    public l(ju5.n nVar, int i17) {
        this.f302122e = nVar;
        this.f302121d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.Object obj;
        synchronized (this.f302122e.f302128a) {
            obj = (ju5.f) ju5.n.f302127c.get(this.f302121d);
        }
        if (obj == null || !(obj instanceof ju5.a)) {
            return;
        }
        ju5.a aVar = (ju5.a) obj;
        if (aVar.isCancelled()) {
            return;
        }
        aVar.a();
    }
}
