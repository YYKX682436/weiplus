package f26;

/* loaded from: classes16.dex */
public final class f extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f259156d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ f26.b2 f259157e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ i26.o f259158f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ i26.j f259159g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(java.util.List list, f26.b2 b2Var, i26.o oVar, i26.j jVar) {
        super(1);
        this.f259156d = list;
        this.f259157e = b2Var;
        this.f259158f = oVar;
        this.f259159g = jVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        f26.u1 runForkingPoint = (f26.u1) obj;
        kotlin.jvm.internal.o.g(runForkingPoint, "$this$runForkingPoint");
        java.util.Iterator it = this.f259156d.iterator();
        while (it.hasNext()) {
            f26.e eVar = new f26.e(this.f259157e, this.f259158f, (i26.j) it.next(), this.f259159g);
            f26.t1 t1Var = (f26.t1) runForkingPoint;
            if (!t1Var.f259219a) {
                t1Var.f259219a = ((java.lang.Boolean) eVar.invoke()).booleanValue();
            }
        }
        return jz5.f0.f302826a;
    }
}
