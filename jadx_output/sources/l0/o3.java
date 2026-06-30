package l0;

/* loaded from: classes14.dex */
public final class o3 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f314409d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f314410e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ c0.n f314411f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ l0.m3 f314412g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f314413h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f314414i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o3(boolean z17, boolean z18, c0.n nVar, l0.m3 m3Var, int i17, int i18) {
        super(2);
        this.f314409d = z17;
        this.f314410e = z18;
        this.f314411f = nVar;
        this.f314412g = m3Var;
        this.f314413h = i17;
        this.f314414i = i18;
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
        l0.s3 s3Var = l0.s3.f314510a;
        boolean z17 = this.f314409d;
        boolean z18 = this.f314410e;
        c0.n nVar = this.f314411f;
        l0.m3 m3Var = this.f314412g;
        int i17 = this.f314413h;
        s3Var.a(z17, z18, nVar, m3Var, null, 0.0f, 0.0f, oVar, ((i17 >> 9) & ce1.h.CTRL_INDEX) | ((i17 >> 6) & 14) | 12582912 | ((i17 >> 15) & 112) | ((this.f314414i << 6) & 7168), 112);
        return jz5.f0.f302826a;
    }
}
