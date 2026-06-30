package z;

/* loaded from: classes14.dex */
public final class t1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f468833d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f468834e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ z.l f468835f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ z.w f468836g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ z.r f468837h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ float f468838i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ yz5.l f468839m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t1(kotlin.jvm.internal.h0 h0Var, java.lang.Object obj, z.l lVar, z.w wVar, z.r rVar, float f17, yz5.l lVar2) {
        super(1);
        this.f468833d = h0Var;
        this.f468834e = obj;
        this.f468835f = lVar;
        this.f468836g = wVar;
        this.f468837h = rVar;
        this.f468838i = f17;
        this.f468839m = lVar2;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        long longValue = ((java.lang.Number) obj).longValue();
        java.lang.Object obj2 = this.f468834e;
        z.l lVar = this.f468835f;
        z.o oVar = new z.o(obj2, lVar.d(), this.f468836g, longValue, lVar.f(), longValue, true, new z.s1(this.f468837h));
        z.z1.d(oVar, longValue, this.f468838i, this.f468835f, this.f468837h, this.f468839m);
        this.f468833d.f310123d = oVar;
        return jz5.f0.f302826a;
    }
}
