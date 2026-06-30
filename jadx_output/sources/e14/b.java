package e14;

/* loaded from: classes12.dex */
public final class b extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.protobuf.j f246413d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e14.k f246414e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.Integer f246415f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(com.tencent.mm.protobuf.j jVar, e14.k kVar, java.lang.Integer num) {
        super(1);
        this.f246413d = jVar;
        this.f246414e = kVar;
        this.f246415f = num;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        boolean z17;
        e14.p pVar;
        e14.s visitor = (e14.s) obj;
        kotlin.jvm.internal.o.g(visitor, "visitor");
        java.lang.Class cls = this.f246413d.f192158a.f192164e;
        kotlin.jvm.internal.o.d(cls);
        e14.k kVar = (e14.k) cls.getDeclaredConstructor(new java.lang.Class[0]).newInstance(new java.lang.Object[0]);
        kVar.set__parentVisitor(visitor);
        e14.k kVar2 = this.f246414e;
        z17 = kVar2.__lazy;
        kVar.__lazy = z17;
        pVar = kVar2.__parser;
        kVar.__parser = pVar;
        kVar2.addElement(this.f246415f.intValue(), kVar);
        return kVar;
    }
}
