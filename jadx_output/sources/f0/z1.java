package f0;

/* loaded from: classes14.dex */
public final class z1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f258284d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f258285e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ y1.j f258286f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.p f258287g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yz5.l f258288h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ y1.b f258289i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z1(yz5.l lVar, boolean z17, y1.j jVar, yz5.p pVar, yz5.l lVar2, y1.b bVar) {
        super(1);
        this.f258284d = lVar;
        this.f258285e = z17;
        this.f258286f = jVar;
        this.f258287g = pVar;
        this.f258288h = lVar2;
        this.f258289i = bVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        y1.p0 semantics = (y1.p0) obj;
        kotlin.jvm.internal.o.g(semantics, "$this$semantics");
        f06.v[] vVarArr = y1.m0.f458770a;
        yz5.l mapping = this.f258284d;
        kotlin.jvm.internal.o.g(mapping, "mapping");
        y1.l lVar = (y1.l) semantics;
        lVar.g(y1.i0.f458744z, mapping);
        boolean z17 = this.f258285e;
        y1.j jVar = this.f258286f;
        if (z17) {
            y1.m0.g(semantics, jVar);
        } else {
            y1.m0.e(semantics, jVar);
        }
        yz5.p pVar = this.f258287g;
        if (pVar != null) {
            y1.m0.c(semantics, null, pVar, 1, null);
        }
        yz5.l lVar2 = this.f258288h;
        if (lVar2 != null) {
            lVar.g(y1.k.f458753e, new y1.a(null, lVar2));
        }
        y1.b bVar = this.f258289i;
        kotlin.jvm.internal.o.g(bVar, "<set-?>");
        y1.m0.f458780k.a(semantics, y1.m0.f458770a[13], bVar);
        return jz5.f0.f302826a;
    }
}
