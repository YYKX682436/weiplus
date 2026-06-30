package f0;

/* loaded from: classes14.dex */
public final class b2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f0.r1 f258013d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ f0.q f258014e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b2(f0.r1 r1Var, f0.q qVar) {
        super(0);
        this.f258013d = r1Var;
        this.f258014e = qVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        float d17;
        float e17;
        f0.r1 r1Var = this.f258013d;
        if (r1Var.f258224r) {
            e17 = ((f0.s) this.f258014e).e();
            d17 = 1.0f;
        } else {
            d17 = r1Var.d();
            e17 = r1Var.e() / 100000.0f;
        }
        return java.lang.Float.valueOf(e17 + d17);
    }
}
