package wv2;

/* loaded from: classes10.dex */
public final class a extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.e0 f449986d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ wv2.c f449987e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f449988f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f449989g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(kotlin.jvm.internal.e0 e0Var, wv2.c cVar, int i17, int i18) {
        super(1);
        this.f449986d = e0Var;
        this.f449987e = cVar;
        this.f449988f = i17;
        this.f449989g = i18;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        float floatValue = ((java.lang.Number) obj).floatValue();
        kotlin.jvm.internal.e0 e0Var = this.f449986d;
        if (floatValue - e0Var.f310115d > 0.1f) {
            this.f449987e.k(floatValue, this.f449988f, this.f449989g);
            e0Var.f310115d = floatValue;
        }
        return jz5.f0.f302826a;
    }
}
