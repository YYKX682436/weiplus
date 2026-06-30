package l0;

/* loaded from: classes14.dex */
public final class u0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f314536d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ s1.o1 f314537e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f314538f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(int i17, s1.o1 o1Var, int i18) {
        super(1);
        this.f314536d = i17;
        this.f314537e = o1Var;
        this.f314538f = i18;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        s1.n1 layout = (s1.n1) obj;
        kotlin.jvm.internal.o.g(layout, "$this$layout");
        s1.o1 o1Var = this.f314537e;
        s1.n1.b(layout, this.f314537e, a06.d.b((this.f314536d - o1Var.f402050d) / 2.0f), a06.d.b((this.f314538f - o1Var.f402051e) / 2.0f), 0.0f, 4, null);
        return jz5.f0.f302826a;
    }
}
