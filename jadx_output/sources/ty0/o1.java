package ty0;

/* loaded from: classes14.dex */
public final class o1 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f422935d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ n0.v2 f422936e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f422937f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f422938g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o1(int i17, n0.v2 v2Var, boolean z17, long j17) {
        super(2);
        this.f422935d = i17;
        this.f422936e = v2Var;
        this.f422937f = z17;
        this.f422938g = j17;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        s1.l2 SubcomposeLayout = (s1.l2) obj;
        long j17 = ((p2.c) obj2).f351377a;
        kotlin.jvm.internal.o.g(SubcomposeLayout, "$this$SubcomposeLayout");
        float h17 = p2.c.h(j17) / this.f422935d;
        return s1.v0.b(SubcomposeLayout, p2.c.h(j17), p2.c.g(j17), null, new ty0.l1(((s1.r0) kz5.n0.X(((s1.l0) SubcomposeLayout).b(0, u0.j.c(1758179946, true, new ty0.n1(this.f422936e, this.f422935d, this.f422937f, 0.1f, p2.c.g(j17) / 2.0f, this.f422938g, h17, h17 * 0.2f))))).m(j17)), 4, null);
    }
}
