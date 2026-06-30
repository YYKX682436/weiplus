package l0;

/* loaded from: classes14.dex */
public final class i4 extends kotlin.jvm.internal.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f314260d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f314261e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f314262f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ g2.t0 f314263g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ c0.o f314264h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f314265i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ yz5.p f314266m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ yz5.p f314267n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ yz5.p f314268o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ yz5.p f314269p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ l0.m3 f314270q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f314271r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f314272s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i4(java.lang.String str, boolean z17, boolean z18, g2.t0 t0Var, c0.o oVar, boolean z19, yz5.p pVar, yz5.p pVar2, yz5.p pVar3, yz5.p pVar4, l0.m3 m3Var, int i17, int i18) {
        super(3);
        this.f314260d = str;
        this.f314261e = z17;
        this.f314262f = z18;
        this.f314263g = t0Var;
        this.f314264h = oVar;
        this.f314265i = z19;
        this.f314266m = pVar;
        this.f314267n = pVar2;
        this.f314268o = pVar3;
        this.f314269p = pVar4;
        this.f314270q = m3Var;
        this.f314271r = i17;
        this.f314272s = i18;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        yz5.p innerTextField = (yz5.p) obj;
        n0.o oVar = (n0.o) obj2;
        int intValue = ((java.lang.Number) obj3).intValue();
        kotlin.jvm.internal.o.g(innerTextField, "innerTextField");
        if ((intValue & 14) == 0) {
            intValue |= ((n0.y0) oVar).e(innerTextField) ? 4 : 2;
        }
        int i17 = intValue;
        if ((i17 & 91) == 18) {
            n0.y0 y0Var = (n0.y0) oVar;
            if (y0Var.v()) {
                y0Var.O();
                return jz5.f0.f302826a;
            }
        }
        l0.s3 s3Var = l0.s3.f314510a;
        java.lang.String str = this.f314260d;
        boolean z17 = this.f314261e;
        boolean z18 = this.f314262f;
        g2.t0 t0Var = this.f314263g;
        c0.o oVar2 = this.f314264h;
        boolean z19 = this.f314265i;
        yz5.p pVar = this.f314266m;
        yz5.p pVar2 = this.f314267n;
        yz5.p pVar3 = this.f314268o;
        yz5.p pVar4 = this.f314269p;
        l0.m3 m3Var = this.f314270q;
        int i18 = this.f314271r;
        int i19 = ((i18 >> 3) & ce1.h.CTRL_INDEX) | (i18 & 14) | ((i17 << 3) & 112);
        int i27 = this.f314272s;
        int i28 = i27 >> 3;
        int i29 = (i28 & 458752) | i19 | (i28 & 7168) | ((i27 << 9) & 57344) | ((i27 << 18) & 3670016);
        int i37 = i18 << 3;
        s3Var.c(str, innerTextField, z17, z18, t0Var, oVar2, z19, pVar, pVar2, pVar3, pVar4, m3Var, null, oVar, i29 | (29360128 & i37) | (234881024 & i37) | (i37 & 1879048192), ((i18 >> 27) & 14) | 3072 | ((i27 >> 21) & 112), 4096);
        return jz5.f0.f302826a;
    }
}
