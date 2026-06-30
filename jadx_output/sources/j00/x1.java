package j00;

/* loaded from: classes9.dex */
public final class x1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j00.d2 f296942d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f296943e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ c00.j3 f296944f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f296945g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x1(j00.d2 d2Var, boolean z17, c00.j3 j3Var, int i17) {
        super(1);
        this.f296942d = d2Var;
        this.f296943e = z17;
        this.f296944f = j3Var;
        this.f296945g = i17;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String str = (java.lang.String) obj;
        bw5.x7 wi6 = this.f296942d.wi(this.f296943e);
        if (wi6 != null) {
            boolean z17 = this.f296943e;
            bw5.x7 parseFrom = new bw5.x7().parseFrom(wi6.toByteArray());
            j00.d dVar = j00.d.f296739a;
            c00.j3 j3Var = this.f296944f;
            int i17 = j3Var.f36993b.f36969c;
            kotlin.jvm.internal.o.d(parseFrom);
            dVar.a(i17, 1, z17, parseFrom, dVar.b(j3Var, z17, this.f296945g, str), 0L);
        }
        return jz5.f0.f302826a;
    }
}
