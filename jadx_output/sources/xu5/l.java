package xu5;

/* loaded from: classes12.dex */
public class l implements xu5.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f457319a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ xu5.o f457320b;

    public l(xu5.o oVar, java.lang.Object obj) {
        this.f457320b = oVar;
        this.f457319a = obj;
    }

    @Override // xu5.p
    public boolean a(xu5.v vVar) {
        java.lang.Object obj = vVar.f449854o;
        if (!(obj instanceof xu5.n)) {
            return false;
        }
        xu5.n nVar = (xu5.n) obj;
        return nVar.f457325g == this.f457320b && nVar.f457323e.obj == this.f457319a;
    }
}
