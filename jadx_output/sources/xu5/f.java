package xu5;

/* loaded from: classes12.dex */
public class f implements xu5.q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f457305a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ xu5.o f457306b;

    public f(xu5.o oVar, java.lang.Runnable runnable) {
        this.f457306b = oVar;
        this.f457305a = runnable;
    }

    @Override // xu5.q
    public boolean a(xu5.v vVar) {
        java.lang.Object obj = vVar.f449854o;
        boolean z17 = false;
        if (obj instanceof xu5.n) {
            xu5.n nVar = (xu5.n) obj;
            if (nVar.f457325g == this.f457306b && nVar.f457323e.getCallback() == this.f457305a) {
                z17 = true;
            }
            if (z17) {
                nVar.b();
            }
        }
        return z17;
    }
}
