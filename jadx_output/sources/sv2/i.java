package sv2;

/* loaded from: classes10.dex */
public final class i extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.e0 f413301d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sv2.m f413302e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f413303f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f413304g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(kotlin.jvm.internal.e0 e0Var, sv2.m mVar, int i17, int i18) {
        super(1);
        this.f413301d = e0Var;
        this.f413302e = mVar;
        this.f413303f = i17;
        this.f413304g = i18;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        float floatValue = ((java.lang.Number) obj).floatValue();
        kotlin.jvm.internal.e0 e0Var = this.f413301d;
        if (floatValue - e0Var.f310115d > 0.1f) {
            this.f413302e.o((this.f413303f + floatValue) / this.f413304g);
            e0Var.f310115d = floatValue;
        }
        return jz5.f0.f302826a;
    }
}
