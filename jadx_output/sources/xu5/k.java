package xu5;

/* loaded from: classes12.dex */
public class k implements xu5.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f457317a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ xu5.o f457318b;

    public k(xu5.o oVar, int i17) {
        this.f457318b = oVar;
        this.f457317a = i17;
    }

    @Override // xu5.p
    public boolean a(xu5.v vVar) {
        java.lang.Object obj = vVar.f449854o;
        if (!(obj instanceof xu5.n)) {
            return false;
        }
        xu5.n nVar = (xu5.n) obj;
        return nVar.f457325g == this.f457318b && nVar.f457323e.what == this.f457317a;
    }
}
