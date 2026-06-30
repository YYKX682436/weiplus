package rv0;

/* loaded from: classes5.dex */
public final class f2 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ex0.r f399994d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f399995e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ rv0.d f399996f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ rv0.n1 f399997g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f2(ex0.r rVar, float f17, rv0.d dVar, rv0.n1 n1Var) {
        super(1);
        this.f399994d = rVar;
        this.f399995e = f17;
        this.f399996f = dVar;
        this.f399997g = n1Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.view.View it = (android.view.View) obj;
        kotlin.jvm.internal.o.g(it, "it");
        ex0.r rVar = this.f399994d;
        ex0.o oVar = rVar instanceof ex0.o ? (ex0.o) rVar : null;
        if (oVar != null) {
            oVar.E(this.f399995e);
        }
        this.f399996f.H();
        rv0.n1 n1Var = this.f399997g;
        kotlinx.coroutines.l.d(n1Var.getMainScope(), null, null, new rv0.e2(n1Var, null), 3, null);
        return java.lang.Boolean.TRUE;
    }
}
