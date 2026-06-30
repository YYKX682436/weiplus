package fp0;

/* loaded from: classes10.dex */
public final class l extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fp0.o f265263d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fp0.d f265264e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(fp0.o oVar, fp0.d dVar) {
        super(0);
        this.f265263d = oVar;
        this.f265264e = dVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.Object obj;
        fp0.o oVar = this.f265263d;
        java.util.Iterator it = oVar.f265273e.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (kotlin.jvm.internal.o.b(((fp0.d) ((fp0.q) obj).f265275a).d(), this.f265264e.d())) {
                break;
            }
        }
        fp0.q qVar = (fp0.q) obj;
        if (qVar != null) {
            oVar.f265273e.remove(qVar);
        }
        return jz5.f0.f302826a;
    }
}
