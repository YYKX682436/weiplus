package el2;

/* loaded from: classes3.dex */
public final class d0 extends kotlin.jvm.internal.q implements yz5.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f253769d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ el2.i0 f253770e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f253771f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ el2.e0 f253772g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(java.lang.String str, el2.i0 i0Var, boolean z17, el2.e0 e0Var) {
        super(4);
        this.f253769d = str;
        this.f253770e = i0Var;
        this.f253771f = z17;
        this.f253772g = e0Var;
    }

    @Override // yz5.r
    public java.lang.Object C(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
        java.lang.String link = (java.lang.String) obj3;
        kotlin.jvm.internal.o.g(link, "link");
        java.lang.String str = this.f253769d;
        el2.i0 i0Var = this.f253770e;
        pm0.v.X(new el2.c0(((java.lang.Number) obj).intValue(), str, link, i0Var, (r45.i23) obj4, this.f253771f, (java.lang.String) obj2, this.f253772g));
        return jz5.f0.f302826a;
    }
}
