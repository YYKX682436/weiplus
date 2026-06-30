package xu5;

/* loaded from: classes12.dex */
public class i implements xu5.q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f457312a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f457313b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ xu5.o f457314c;

    public i(xu5.o oVar, int i17, java.lang.Object obj) {
        this.f457314c = oVar;
        this.f457312a = i17;
        this.f457313b = obj;
    }

    @Override // xu5.q
    public boolean a(xu5.v vVar) {
        java.lang.Object obj = vVar.f449854o;
        boolean z17 = false;
        if (obj instanceof xu5.n) {
            xu5.n nVar = (xu5.n) obj;
            if (nVar.f457325g == this.f457314c) {
                android.os.Message message = nVar.f457323e;
                if (message.what == this.f457312a && message.obj == this.f457313b) {
                    z17 = true;
                }
            }
            if (z17) {
                nVar.b();
            }
        }
        return z17;
    }
}
