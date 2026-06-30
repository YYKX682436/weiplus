package z;

/* loaded from: classes14.dex */
public final class v1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f468855d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f468856e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ z.l f468857f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ z.r f468858g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yz5.l f468859h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v1(kotlin.jvm.internal.h0 h0Var, float f17, z.l lVar, z.r rVar, yz5.l lVar2) {
        super(1);
        this.f468855d = h0Var;
        this.f468856e = f17;
        this.f468857f = lVar;
        this.f468858g = rVar;
        this.f468859h = lVar2;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        long longValue = ((java.lang.Number) obj).longValue();
        java.lang.Object obj2 = this.f468855d.f310123d;
        kotlin.jvm.internal.o.d(obj2);
        z.z1.d((z.o) obj2, longValue, this.f468856e, this.f468857f, this.f468858g, this.f468859h);
        return jz5.f0.f302826a;
    }
}
