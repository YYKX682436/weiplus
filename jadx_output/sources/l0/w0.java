package l0;

/* loaded from: classes14.dex */
public final class w0 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f314566d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f314567e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ c0.o f314568f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ l0.m3 f314569g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ e1.a1 f314570h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f314571i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f314572m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(boolean z17, boolean z18, c0.o oVar, l0.m3 m3Var, e1.a1 a1Var, int i17, int i18) {
        super(2);
        this.f314566d = z17;
        this.f314567e = z18;
        this.f314568f = oVar;
        this.f314569g = m3Var;
        this.f314570h = a1Var;
        this.f314571i = i17;
        this.f314572m = i18;
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
        boolean z17 = this.f314566d;
        boolean z18 = this.f314567e;
        c0.o oVar2 = this.f314568f;
        l0.m3 m3Var = this.f314569g;
        e1.a1 a1Var = this.f314570h;
        int i17 = ((this.f314571i >> 9) & 14) | 12582912;
        int i18 = this.f314572m;
        s3Var.a(z17, z18, oVar2, m3Var, a1Var, 0.0f, 0.0f, oVar, i17 | ((i18 << 3) & 112) | ((i18 >> 12) & ce1.h.CTRL_INDEX) | ((i18 >> 15) & 7168) | ((i18 >> 9) & 57344), 96);
        return jz5.f0.f302826a;
    }
}
