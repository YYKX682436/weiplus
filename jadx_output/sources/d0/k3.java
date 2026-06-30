package d0;

/* loaded from: classes14.dex */
public final class k3 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d0.l3 f225159d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f225160e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ s1.o1 f225161f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f225162g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ s1.x0 f225163h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k3(d0.l3 l3Var, int i17, s1.o1 o1Var, int i18, s1.x0 x0Var) {
        super(1);
        this.f225159d = l3Var;
        this.f225160e = i17;
        this.f225161f = o1Var;
        this.f225162g = i18;
        this.f225163h = x0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        s1.n1 layout = (s1.n1) obj;
        kotlin.jvm.internal.o.g(layout, "$this$layout");
        yz5.p pVar = this.f225159d.f225168f;
        s1.o1 o1Var = this.f225161f;
        s1.n1.d(layout, this.f225161f, ((p2.m) pVar.invoke(new p2.q(p2.r.a(this.f225160e - o1Var.f402050d, this.f225162g - o1Var.f402051e)), this.f225163h.getLayoutDirection())).f351390a, 0.0f, 2, null);
        return jz5.f0.f302826a;
    }
}
