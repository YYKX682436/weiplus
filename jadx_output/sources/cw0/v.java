package cw0;

/* loaded from: classes5.dex */
public final class v extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cw0.l0 f222685d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cw0.w0 f222686e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.Float f222687f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.Float f222688g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(cw0.l0 l0Var, cw0.w0 w0Var, java.lang.Float f17, java.lang.Float f18) {
        super(1);
        this.f222685d = l0Var;
        this.f222686e = w0Var;
        this.f222687f = f17;
        this.f222688g = f18;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.Boolean bool = (java.lang.Boolean) obj;
        cw0.l0 l0Var = this.f222685d;
        boolean booleanValue = bool != null ? bool.booleanValue() : !l0Var.f222648t;
        l0Var.f222648t = booleanValue;
        if (booleanValue) {
            l0Var.n7(0.5f);
            l0Var.m7(0.25f);
            l0Var.o7(0.25f);
            this.f222686e.L(0.5f, this.f222687f != null ? java.lang.Float.valueOf(0.25f) : null, this.f222688g != null ? java.lang.Float.valueOf(0.25f) : null);
        }
        return java.lang.Boolean.valueOf(l0Var.f222648t);
    }
}
