package xu5;

/* loaded from: classes12.dex */
public class m implements xu5.q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ xu5.o f457321a;

    public m(xu5.o oVar) {
        this.f457321a = oVar;
    }

    @Override // xu5.q
    public boolean a(xu5.v vVar) {
        java.lang.Object obj = vVar.f449854o;
        if (obj instanceof xu5.n) {
            xu5.n nVar = (xu5.n) obj;
            r1 = nVar.f457325g == this.f457321a;
            if (r1) {
                nVar.b();
            }
        }
        return r1;
    }
}
