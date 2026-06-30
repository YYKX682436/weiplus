package xu5;

/* loaded from: classes12.dex */
public class g implements xu5.q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f457307a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f457308b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ xu5.o f457309c;

    public g(xu5.o oVar, java.lang.Runnable runnable, java.lang.Object obj) {
        this.f457309c = oVar;
        this.f457307a = runnable;
        this.f457308b = obj;
    }

    @Override // xu5.q
    public boolean a(xu5.v vVar) {
        java.lang.Object obj = vVar.f449854o;
        boolean z17 = false;
        if (obj instanceof xu5.n) {
            xu5.n nVar = (xu5.n) obj;
            if (nVar.f457325g == this.f457309c) {
                android.os.Message message = nVar.f457323e;
                if (message.getCallback() == this.f457307a && message.obj == this.f457308b) {
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
