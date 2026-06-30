package e14;

/* loaded from: classes12.dex */
public final class f extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e14.k f246423d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Integer f246424e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.protobuf.j f246425f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(e14.k kVar, java.lang.Integer num, com.tencent.mm.protobuf.j jVar) {
        super(1);
        this.f246423d = kVar;
        this.f246424e = num;
        this.f246425f = jVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.Object d17;
        java.lang.String value = (java.lang.String) obj;
        kotlin.jvm.internal.o.g(value, "value");
        int intValue = this.f246424e.intValue();
        com.tencent.mm.protobuf.j jVar = this.f246425f;
        int i17 = jVar.f192158a.f192163d;
        e14.k kVar = this.f246423d;
        d17 = kVar.d(value, i17);
        kVar.i(intValue, jVar, d17);
        return jz5.f0.f302826a;
    }
}
