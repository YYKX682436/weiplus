package gi;

/* loaded from: classes12.dex */
public class k1 extends gi.d1 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f272065b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(qh.f0 f0Var, java.lang.String str, java.lang.String str2) {
        super(f0Var, str);
        this.f272065b = str2;
    }

    @Override // gi.d1
    public void a() {
        java.lang.String str = this.f272065b;
        f(str);
        b(true, true);
        c();
        if (com.tencent.mm.sdk.platformtools.x2.n() || ("AppBrand".equals(str) && com.tencent.mm.sdk.platformtools.x2.j())) {
            e();
        }
        g(60000L);
        d();
        h(java.lang.Math.max(gi.d.f272005m, com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT));
        if (mm.o.f()) {
            rh.c1 c1Var = this.f272021a;
            c1Var.F(gi.j.class);
            c1Var.H(rh.r1.class, 5000L);
            c1Var.H(rh.w1.class, 5000L);
            c1Var.H(rh.l3.class, 5000L);
        }
    }
}
