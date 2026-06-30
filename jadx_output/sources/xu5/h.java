package xu5;

/* loaded from: classes12.dex */
public class h implements xu5.q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f457310a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ xu5.o f457311b;

    public h(xu5.o oVar, int i17) {
        this.f457311b = oVar;
        this.f457310a = i17;
    }

    @Override // xu5.q
    public boolean a(xu5.v vVar) {
        java.lang.Object obj = vVar.f449854o;
        boolean z17 = false;
        if (obj instanceof xu5.n) {
            xu5.n nVar = (xu5.n) obj;
            if (nVar.f457325g == this.f457311b && nVar.f457323e.what == this.f457310a) {
                z17 = true;
            }
            if (z17) {
                nVar.b();
            }
        }
        return z17;
    }
}
