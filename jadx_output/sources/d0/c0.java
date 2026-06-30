package d0;

/* loaded from: classes14.dex */
public final class c0 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s1.t0 f225085d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.q f225086e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f225087f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(s1.t0 t0Var, yz5.q qVar, int i17) {
        super(2);
        this.f225085d = t0Var;
        this.f225086e = qVar;
        this.f225087f = i17;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        s1.l2 SubcomposeLayout = (s1.l2) obj;
        long j17 = ((p2.c) obj2).f351377a;
        kotlin.jvm.internal.o.g(SubcomposeLayout, "$this$SubcomposeLayout");
        d0.g0 g0Var = new d0.g0(SubcomposeLayout, j17, null);
        return this.f225085d.d(SubcomposeLayout, ((s1.l0) SubcomposeLayout).b(jz5.f0.f302826a, u0.j.c(-1945019079, true, new d0.b0(this.f225086e, g0Var, this.f225087f))), j17);
    }
}
