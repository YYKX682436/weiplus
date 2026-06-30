package cw0;

/* loaded from: classes5.dex */
public final class r extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cw0.w0 f222670d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cw0.l0 f222671e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.Float f222672f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.Float f222673g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ float f222674h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(cw0.w0 w0Var, cw0.l0 l0Var, java.lang.Float f17, java.lang.Float f18, float f19) {
        super(0);
        this.f222670d = w0Var;
        this.f222671e = l0Var;
        this.f222672f = f17;
        this.f222673g = f18;
        this.f222674h = f19;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        cw0.l0 l0Var = this.f222671e;
        boolean z17 = l0Var.f222648t;
        cw0.w0 w0Var = this.f222670d;
        w0Var.M(z17);
        boolean z18 = l0Var.f222648t;
        java.lang.Float f17 = this.f222673g;
        java.lang.Float f18 = this.f222672f;
        if (z18) {
            l0Var.n7(0.5f);
            l0Var.m7(0.25f);
            l0Var.o7(0.25f);
            w0Var.L(0.5f, f18 != null ? java.lang.Float.valueOf(0.25f) : null, f17 != null ? java.lang.Float.valueOf(0.25f) : null);
        } else {
            w0Var.L(this.f222674h, f18, f17);
        }
        return jz5.f0.f302826a;
    }
}
