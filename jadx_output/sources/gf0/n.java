package gf0;

/* loaded from: classes11.dex */
public final class n extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gf0.r f271225d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ double f271226e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ double f271227f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(gf0.r rVar, double d17, double d18) {
        super(0);
        this.f271225d = rVar;
        this.f271226e = d17;
        this.f271227f = d18;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        qk.d8 d8Var = this.f271225d.f271239o;
        if (d8Var != null) {
            d8Var.a(this.f271226e, this.f271227f);
        }
        return jz5.f0.f302826a;
    }
}
