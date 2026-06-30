package l0;

/* loaded from: classes14.dex */
public final class g4 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f314212d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Float f314213e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.p f314214f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f314215g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g4(long j17, java.lang.Float f17, yz5.p pVar, int i17) {
        super(2);
        this.f314212d = j17;
        this.f314213e = f17;
        this.f314214f = pVar;
        this.f314215g = i17;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        n0.o oVar = (n0.o) obj;
        if ((((java.lang.Number) obj2).intValue() & 11) == 2) {
            n0.y0 y0Var = (n0.y0) oVar;
            if (y0Var.v()) {
                y0Var.O();
                return jz5.f0.f302826a;
            }
        }
        n0.n1.a(new n0.i3[]{l0.p.f314416a.b(new e1.y(this.f314212d))}, u0.j.b(oVar, -1132188434, true, new l0.f4(this.f314213e, this.f314214f, this.f314215g, this.f314212d)), oVar, 56);
        return jz5.f0.f302826a;
    }
}
