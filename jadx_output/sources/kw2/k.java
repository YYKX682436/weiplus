package kw2;

/* loaded from: classes15.dex */
public final class k extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kw2.e f313038d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f313039e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kw2.y f313040f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f313041g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ kw2.h f313042h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(kw2.e eVar, java.lang.String str, kw2.y yVar, boolean z17, kw2.h hVar) {
        super(1);
        this.f313038d = eVar;
        this.f313039e = str;
        this.f313040f = yVar;
        this.f313041g = z17;
        this.f313042h = hVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        kw2.g result = (kw2.g) obj;
        kotlin.jvm.internal.o.g(result, "result");
        pm0.v.O("FinderNetworkFlowReport_Thread", new kw2.j(this.f313038d, result, this.f313039e, this.f313040f, this.f313041g, this.f313042h));
        return jz5.f0.f302826a;
    }
}
