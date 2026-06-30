package l0;

/* loaded from: classes14.dex */
public final class f4 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Float f314192d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.p f314193e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f314194f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f314195g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f4(java.lang.Float f17, yz5.p pVar, int i17, long j17) {
        super(2);
        this.f314192d = f17;
        this.f314193e = pVar;
        this.f314194f = i17;
        this.f314195g = j17;
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
        int i17 = this.f314194f;
        yz5.p pVar = this.f314193e;
        java.lang.Float f17 = this.f314192d;
        if (f17 != null) {
            n0.y0 y0Var2 = (n0.y0) oVar;
            y0Var2.U(-452622131);
            n0.n1.a(new n0.i3[]{l0.n.f314384a.b(f17)}, pVar, oVar, ((i17 >> 6) & 112) | 8);
            y0Var2.o(false);
        } else {
            n0.y0 y0Var3 = (n0.y0) oVar;
            y0Var3.U(-452621951);
            n0.n1.a(new n0.i3[]{l0.n.f314384a.b(java.lang.Float.valueOf(e1.y.d(this.f314195g)))}, pVar, oVar, ((i17 >> 6) & 112) | 8);
            y0Var3.o(false);
        }
        return jz5.f0.f302826a;
    }
}
