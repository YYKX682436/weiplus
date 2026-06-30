package sv2;

/* loaded from: classes10.dex */
public final class z extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.e0 f413383d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sv2.b0 f413384e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f413385f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f413386g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(kotlin.jvm.internal.e0 e0Var, sv2.b0 b0Var, int i17, int i18) {
        super(1);
        this.f413383d = e0Var;
        this.f413384e = b0Var;
        this.f413385f = i17;
        this.f413386g = i18;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        float floatValue = ((java.lang.Number) obj).floatValue();
        kotlin.jvm.internal.e0 e0Var = this.f413383d;
        if (floatValue - e0Var.f310115d > 0.1f) {
            this.f413384e.k(floatValue, this.f413385f, this.f413386g);
            e0Var.f310115d = floatValue;
        }
        return jz5.f0.f302826a;
    }
}
