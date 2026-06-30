package h0;

/* loaded from: classes14.dex */
public final class h extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ y1.i f277795d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ z1.a f277796e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f277797f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.a f277798g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(y1.i iVar, z1.a aVar, boolean z17, yz5.a aVar2) {
        super(1);
        this.f277795d = iVar;
        this.f277796e = aVar;
        this.f277797f = z17;
        this.f277798g = aVar2;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        y1.p0 semantics = (y1.p0) obj;
        kotlin.jvm.internal.o.g(semantics, "$this$semantics");
        y1.i iVar = this.f277795d;
        if (iVar != null) {
            y1.m0.f(semantics, iVar.f458718a);
        }
        f06.v[] vVarArr = y1.m0.f458770a;
        z1.a aVar = this.f277796e;
        kotlin.jvm.internal.o.g(aVar, "<set-?>");
        y1.m0.f458781l.a(semantics, y1.m0.f458770a[15], aVar);
        y1.m0.b(semantics, null, new h0.g(this.f277798g));
        if (!this.f277797f) {
            y1.m0.a(semantics);
        }
        return jz5.f0.f302826a;
    }
}
