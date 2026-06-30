package l0;

/* loaded from: classes14.dex */
public final class b1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f314055d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ d0.d2 f314056e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(long j17, d0.d2 d2Var) {
        super(1);
        this.f314055d = j17;
        this.f314056e = d2Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        g1.f drawWithContent = (g1.f) obj;
        kotlin.jvm.internal.o.g(drawWithContent, "$this$drawWithContent");
        long j17 = this.f314055d;
        float d17 = d1.k.d(j17);
        if (d17 > 0.0f) {
            u1.o0 o0Var = (u1.o0) drawWithContent;
            float R = o0Var.R(l0.c1.f314093a);
            float R2 = o0Var.R(((d0.e2) this.f314056e).a(o0Var.getLayoutDirection())) - R;
            float f17 = 2;
            float f18 = d17 + R2 + (R * f17);
            p2.s layoutDirection = o0Var.getLayoutDirection();
            int[] iArr = l0.a1.f314027a;
            float d18 = iArr[layoutDirection.ordinal()] == 1 ? d1.k.d(o0Var.a()) - f18 : R2 < 0.0f ? 0.0f : R2;
            if (iArr[o0Var.getLayoutDirection().ordinal()] == 1) {
                f18 = d1.k.d(o0Var.a()) - (R2 >= 0.0f ? R2 : 0.0f);
            }
            float b17 = d1.k.b(j17);
            float f19 = (-b17) / f17;
            float f27 = b17 / f17;
            g1.b bVar = (g1.b) o0Var.p();
            long b18 = bVar.b();
            bVar.a().c();
            ((g1.d) bVar.f267504a).a(d18, f19, f18, f27, 0);
            o0Var.b();
            bVar.a().b();
            bVar.c(b18);
        } else {
            ((u1.o0) drawWithContent).b();
        }
        return jz5.f0.f302826a;
    }
}
