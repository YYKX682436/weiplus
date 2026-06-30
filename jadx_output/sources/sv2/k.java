package sv2;

/* loaded from: classes10.dex */
public final class k extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.e0 f413316d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sv2.m f413317e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f413318f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f413319g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(kotlin.jvm.internal.e0 e0Var, sv2.m mVar, int i17, int i18) {
        super(1);
        this.f413316d = e0Var;
        this.f413317e = mVar;
        this.f413318f = i17;
        this.f413319g = i18;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        float floatValue = ((java.lang.Number) obj).floatValue();
        kotlin.jvm.internal.e0 e0Var = this.f413316d;
        if (floatValue - e0Var.f310115d > 0.1f) {
            this.f413317e.o((this.f413318f + floatValue) / this.f413319g);
            e0Var.f310115d = floatValue;
        }
        return jz5.f0.f302826a;
    }
}
