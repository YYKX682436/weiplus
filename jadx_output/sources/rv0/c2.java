package rv0;

/* loaded from: classes5.dex */
public final class c2 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rv0.d f399948d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ex0.r f399949e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ rv0.n1 f399950f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c2(rv0.d dVar, ex0.r rVar, rv0.n1 n1Var) {
        super(1);
        this.f399948d = dVar;
        this.f399949e = rVar;
        this.f399950f = n1Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        float floatValue = ((java.lang.Number) obj).floatValue();
        this.f399948d.J();
        ex0.r rVar = this.f399949e;
        ex0.o oVar = rVar instanceof ex0.o ? (ex0.o) rVar : null;
        if (oVar != null) {
            oVar.E(floatValue);
            this.f399950f.p7().c7();
        }
        return jz5.f0.f302826a;
    }
}
