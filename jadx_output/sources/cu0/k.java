package cu0;

/* loaded from: classes5.dex */
public final class k extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.a f222321d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f222322e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ cu0.x f222323f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f222324g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(yz5.a aVar, yz5.l lVar, cu0.x xVar, int i17) {
        super(0);
        this.f222321d = aVar;
        this.f222322e = lVar;
        this.f222323f = xVar;
        this.f222324g = i17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        jz5.l lVar = (jz5.l) this.f222321d.invoke();
        int intValue = ((java.lang.Number) lVar.f302833d).intValue();
        int intValue2 = ((java.lang.Number) lVar.f302834e).intValue();
        if (this.f222322e != null) {
            this.f222323f.f222353c.e(e06.p.f(intValue, 0, this.f222324g) / this.f222324g);
        }
        return new jz5.l(java.lang.Integer.valueOf(intValue), java.lang.Integer.valueOf(intValue2));
    }
}
