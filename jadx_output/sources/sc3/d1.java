package sc3;

/* loaded from: classes7.dex */
public final class d1 implements yg.a0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ sc3.k1 f406437a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f406438b;

    public d1(sc3.k1 k1Var, java.lang.String str) {
        this.f406437a = k1Var;
        this.f406438b = str;
    }

    @Override // yg.a0
    public void a(java.lang.String exception, java.lang.String stack, int i17) {
        kotlin.jvm.internal.o.g(exception, "exception");
        kotlin.jvm.internal.o.g(stack, "stack");
        this.f406437a.X0(exception, stack, this.f406438b);
    }

    @Override // yg.a0
    public void c(java.lang.String output) {
        kotlin.jvm.internal.o.g(output, "output");
        this.f406437a.H0().Ke(r26.p0.E0(output, 500000));
    }
}
