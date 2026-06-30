package fp0;

/* loaded from: classes10.dex */
public final class m extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fp0.o f265265d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f265266e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(fp0.o oVar, yz5.l lVar) {
        super(0);
        this.f265265d = oVar;
        this.f265266e = lVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.Object obj;
        fp0.o oVar = this.f265265d;
        java.util.Iterator it = oVar.f265273e.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((java.lang.Boolean) this.f265266e.invoke(obj)).booleanValue()) {
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
