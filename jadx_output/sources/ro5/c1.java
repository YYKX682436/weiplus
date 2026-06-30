package ro5;

/* loaded from: classes14.dex */
public final class c1 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ro5.m1 f398174d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f398175e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ zo5.e f398176f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f398177g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(ro5.m1 m1Var, int i17, zo5.e eVar, int i18) {
        super(2);
        this.f398174d = m1Var;
        this.f398175e = i17;
        this.f398176f = eVar;
        this.f398177g = i18;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        boolean z17;
        int intValue = ((java.lang.Number) obj).intValue();
        ((java.lang.Number) obj2).longValue();
        dp5.d dVar = ((yo5.e) this.f398174d.f398242d.f455796g.getValue()).f464365n;
        if (dVar != null) {
            ro5.m1 m1Var = this.f398174d;
            int i17 = this.f398175e;
            z17 = ro5.m1.a(m1Var, i17, dVar, new ro5.b1(m1Var, intValue, this.f398176f, i17, this.f398177g));
        } else {
            z17 = false;
        }
        return java.lang.Boolean.valueOf(z17);
    }
}
