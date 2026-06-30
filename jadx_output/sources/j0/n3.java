package j0;

/* loaded from: classes14.dex */
public final class n3 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z.e f296459d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ g2.v f296460e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ g2.e0 f296461f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ j0.c5 f296462g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ e1.r f296463h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n3(z.e eVar, g2.v vVar, g2.e0 e0Var, j0.c5 c5Var, e1.r rVar) {
        super(1);
        this.f296459d = eVar;
        this.f296460e = vVar;
        this.f296461f = e0Var;
        this.f296462g = c5Var;
        this.f296463h = rVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        a2.k1 k1Var;
        g1.f drawWithContent = (g1.f) obj;
        kotlin.jvm.internal.o.g(drawWithContent, "$this$drawWithContent");
        u1.o0 o0Var = (u1.o0) drawWithContent;
        o0Var.b();
        float e17 = e06.p.e(((java.lang.Number) this.f296459d.d()).floatValue(), 0.0f, 1.0f);
        if (!(e17 == 0.0f)) {
            long j17 = this.f296461f.f267694b;
            int i17 = a2.m1.f782c;
            int i18 = (int) (j17 >> 32);
            ((g2.t) this.f296460e).getClass();
            j0.d5 d5Var = this.f296462g.f296239g;
            d1.g gVar = (d5Var == null || (k1Var = d5Var.f296265a) == null) ? new d1.g(0.0f, 0.0f, 0.0f, 0.0f) : k1Var.c(i18);
            float R = o0Var.R(j0.q3.f296518a);
            float f17 = R / 2;
            float f18 = gVar.f225629a + f17;
            float d17 = d1.k.d(o0Var.a()) - f17;
            if (f18 > d17) {
                f18 = d17;
            }
            g1.h.e(drawWithContent, this.f296463h, d1.f.a(f18, gVar.f225630b), d1.f.a(f18, gVar.f225632d), R, 0, null, e17, null, 0, com.tencent.wxmm.v2helper.EMethodSetSendToNetworkOn, null);
        }
        return jz5.f0.f302826a;
    }
}
